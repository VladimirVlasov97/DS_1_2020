using System;

namespace server
{
    [Serializable]
    public class Item
    {
        private string name;
        private int quantity;
        private int price;

        public Item()
        {
            name = "";
            quantity = price = 0;
        }

        public Item(string name, int quantity, int price)
        {
            this.name = name;
            this.quantity = quantity;
            this.price = price;
        }

        /*
         * То, что написано ниже - такую хуйню нельзя писать, это говнокод.
         * Необходимо использовать auto-implemented properties:
         * https://docs.microsoft.com/en-us/dotnet/csharp/programming-guide/classes-and-structs/auto-implemented-properties
         * Это не Java, блять!
         */

        public string GetName()
        {
            return name;
        }

        public void SetName(string name)
        {
            this.name = name;
        }

        public int GetQuantity()
        {
            return quantity;
        }

        public void SetQuantity(int quantity)
        {
            this.quantity = quantity;
        }

        public int GetPrice()
        {
            return price;
        }

        public void SetPrice(int price)
        {
            this.price = price;
        }
    }
}
