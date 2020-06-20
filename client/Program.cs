using System;
using System.Runtime.Remoting.Channels;
using System.Runtime.Remoting.Channels.Tcp;
using server;

namespace client
{
    class Program
    {
        static void Main(string[] args)
        {
            TcpChannel tcp = new TcpChannel();

            ChannelServices.RegisterChannel(tcp, false);

            IMessage service = (IMessage)Activator.GetObject(typeof(IMessage), "tcp://localhost:8000/test");

            Console.WriteLine(service.GetMessage());
            Console.ReadLine();
        }
    }
}
