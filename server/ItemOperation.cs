using System;
using System.Collections.Generic;

namespace server
{
    public class ItemOperation : MarshalByRefObject, IItemOperation
    {
        private static List<Item> items = new List<Item>();

        public List<Item> AddItem(Item item)
        {
            items.Add(item);
            return items;
        }

        public List<Item> GetItems()
        {
            return items;
        }

        public int GetTotalPrice()
        {
            var totalPrice = 0;
            foreach (var item in items)
            {
                totalPrice += item.GetPrice() * item.GetQuantity();
            }
            return totalPrice;
        }

        public List<Item> RemoveItem(int index)
        {
            items.RemoveAt(index);
            return items;
        }
    }
}
