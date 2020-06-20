using System;

namespace server
{
    class Message : MarshalByRefObject, IMessage
    {
        private string msg = string.Empty;

        public string GetMessage()
        {
            msg += "Hello, world!";
            return msg;
        }
    }
}
