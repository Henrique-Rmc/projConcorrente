import threading


class BakeryLock:
    def __init__(self, num_threads):
        self.choosing = [False] * num_threads
        self.number = [0] * num_threads
        self.num_threads = num_threads

    def lock(self, thread_id):
        self.choosing[thread_id] = True
        max_number = max(self.number)
        self.number[thread_id] = max_number + 1
        self.choosing[thread_id] = False

        for i in range(self.num_threads):
            while self.choosing[i]:
                pass

            while (self.number[i] != 0) and ((self.number[i] < self.number[thread_id]) or ((self.number[i] == self.number[thread_id]) and (i < thread_id))):
                pass

    def unlock(self, thread_id):
        self.number[thread_id] = 0


global_counter = 0
num_threads = 100
bakery_lock = BakeryLock(num_threads)
threads = []


def thread_function(thread_id):
    global global_counter
    bakery_lock.lock(thread_id)
    print(thread_id)
    global_counter += 1  # Região Crítica
    bakery_lock.unlock(thread_id)


for i in range(num_threads):
    thread = threading.Thread(target=thread_function, args=(i,))
    threads.append(thread)
    thread.start()

for thread in threads:
    thread.join()

print("Shared Counter:", global_counter)