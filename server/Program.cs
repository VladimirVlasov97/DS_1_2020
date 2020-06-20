using System;
using System.Runtime.Remoting;
using System.Runtime.Remoting.Channels;
using System.Runtime.Remoting.Channels.Tcp;

namespace server
{
    class Program
    {
        static void Main(string[] args)
        {
            // Register channel
            var channel = new TcpChannel(8000);
            ChannelServices.RegisterChannel(channel, false);

            var itemOperation = new ItemOperation();
            itemOperation.AddItem(new Item("Item1", 10, 100));
            itemOperation.AddItem(new Item("Item2", 20, 200));
            itemOperation.AddItem(new Item("Item3", 30, 300));
            itemOperation.AddItem(new Item("Item4", 40, 400));

            // Register item operation
            RemotingConfiguration.RegisterWellKnownServiceType(typeof(ItemOperation), "itemOperation", WellKnownObjectMode.Singleton);

            Console.WriteLine("Press enter to stop this process.");
            Console.ReadLine();
        }
    }
}
