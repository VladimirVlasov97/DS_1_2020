using server;
using System;
using System.Runtime.InteropServices;
using System.Windows.Forms;

namespace clientgui
{
    public partial class frm_AddItem : Form
    {
        private Item newItem;

        public frm_AddItem()
        {
            InitializeComponent();
        }

        private void scroll_Price_Scroll(object sender, ScrollEventArgs e)
        {
            lbl_PriceValue.Text = scroll_Price.Value.ToString();
        }

        private void frm_AddItem_Load(object sender, EventArgs e)
        {
            combo_Name.SelectedIndex = 0;
        }

        private void btn_Cancel_Click(object sender, EventArgs e)
        {
            Close();
        }

        private void btn_AddItem_Click(object sender, EventArgs e)
        {
            //код проверки на правильность ввода
            if (radio_WithParameters.Checked)
            {
                newItem = new Item(combo_Name.SelectedItem.ToString(), Convert.ToInt32(num_Quantity.Value), scroll_Price.Value);
            }
            else
            {
                newItem = new Item();
                newItem.SetName(combo_Name.SelectedItem.ToString());
                newItem.SetQuantity(Convert.ToInt32(num_Quantity.Value));
                newItem.SetPrice(scroll_Price.Value);
            }
            Close();
        }
        
        public Item GetCreatedItem()
        {
            return newItem;
        }
    }
}
