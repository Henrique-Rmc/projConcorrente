using System;
using System.Collections.Generic;
using System.Threading.Tasks;

public class Program
{
    public static async Task Main(string[] args)
    {
        int numTasks = 10000000; // Substitua pelo número desejado de tarefas.

        long initialMemory = GC.GetTotalMemory(true);
        Console.WriteLine($"Memória inicial: {initialMemory / 1024 / 1024} MB");

        await TaskRunner.RunTasksAsync(numTasks);

        long finalMemory = GC.GetTotalMemory(true);
        Console.WriteLine($"Memória final: {finalMemory / 1024 / 1024} MB");
        long memoryUsed = (finalMemory - initialMemory) / 1024 / 1024;
        Console.WriteLine($"Memória usada pelo programa: {memoryUsed} MB");
    }
}

public class TaskRunner
{
    public static async Task RunTasksAsync(int numTasks)
    {
        List<Task> tasks = new List<Task>();
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
