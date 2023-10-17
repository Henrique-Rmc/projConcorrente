using System;
using System.Collections.Generic;
using System.Threading.Tasks;

public class Program
{
    public static async Task Main(string[] args)
    {
        int numTasks = 1000000; // Substitua pelo número desejado de tarefas.

        long initialMemory = GC.GetTotalMemory(true);
        Console.WriteLine($"Memória inicial: {initialMemory} bytes");

        await TaskRunner.RunTasksAsync(numTasks);

        long finalMemory = GC.GetTotalMemory(true);
        Console.WriteLine($"Memória final: {finalMemory} bytes");
        long memoryUsed = finalMemory - initialMemory;
        Console.WriteLine($"Memória usada pelo programa: {memoryUsed} bytes");
    }
}

public class TaskRunner
{
    public static async Task RunTasksAsync(int numTasks)
    {
        List<Task> tasks = new List<Task>(1000000);
        for (int i = 0; i < numTasks; i++)
        {
            Task task = Task.Run(async () =>
            {
                await Task.Delay(TimeSpan.FromSeconds(10));
            });
            tasks.Add(task);
        }

        await Task.WhenAll(tasks);
    }
}
