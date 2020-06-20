using System.Collections.Generic;

namespace server
{
    public interface IItemOperation
    {
        List<Item> GetItems();
        List<Item> AddItem(Item item);
        List<Item> RemoveItem(int index);
        int GetTotalPrice();
    }
}
