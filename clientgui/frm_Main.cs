using server;
using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Runtime.Remoting.Channels;
using System.Runtime.Remoting.Channels.Tcp;
using System.Windows.Forms;

namespace clientgui
{
    public partial class frm_Main : Form
    {
        private IItemOperation itemOperation = null;

        public frm_Main()
        {
            InitializeComponent();
        }

        private void btn_Add_Click(object sender, System.EventArgs e)
        {
            frm_AddItem frmAddItem = new frm_AddItem();
            frmAddItem.ShowDialog();
            var createdItem = frmAddItem.GetCreatedItem();
            if (createdItem != null)
            {
                try
                {
                    ShowItemInfo(itemOperation.AddItem(createdItem));
                }
                catch (Exception ex)
                {
                    MessageBox.Show(this, "Ошибка соединения: +" + ex, "Сообщение об ошибке", MessageBoxButtons.OK, MessageBoxIcon.Error);
                }
            }

            if (string.IsNullOrEmpty(tbox_Sum.Text)) btn_Calculate_Click(sender, e);
        }

        private void btn_Calculate_Click(object sender, System.EventArgs e)
        {
            try
            {
                tbox_Sum.Text = itemOperation.GetTotalPrice().ToString();
            }
            catch (Exception ex)
            {
                MessageBox.Show(this, "Ошибка: +" + ex, "Сообщение об ошибке", MessageBoxButtons.OK, MessageBoxIcon.Error);
            }
        }

        private void frm_Main_Load(object sender, System.EventArgs e)
        {
            try
            {
                TcpClientChannel tcp = new TcpClientChannel();
                ChannelServices.RegisterChannel(tcp, false);
                itemOperation = (IItemOperation)Activator.GetObject(typeof(IItemOperation), "tcp://localhost:8000/itemOperation");
                Debug.WriteLine(itemOperation.GetItems().Count);
                ShowItemInfo(itemOperation.GetItems());
            }
            catch (Exception ex)
            {
                MessageBox.Show(this, "Ошибка соединения: +" + ex, "Сообщение об ошибке", MessageBoxButtons.OK, MessageBoxIcon.Error);
            }
        }

        private void btn_Exit_Click(object sender, EventArgs e)
        {
            Application.Exit();
        }

        private void btn_Update_Click(object sender, EventArgs e)
        {
            try
            {
                ShowItemInfo(itemOperation.GetItems());
            }
            catch (Exception ex)
            {
                MessageBox.Show(this, "Ошибка соединения: +" + ex, "Сообщение об ошибке", MessageBoxButtons.OK, MessageBoxIcon.Error);
            }
        }

        private void ShowItemInfo(List<Item> items)
        {
            lview_Items.Items.Clear();

            for (var i = 0; i < items.Count; i++)
            {
                var listViewItem = new ListViewItem((i + 1).ToString());
                lview_Items.Items.Add(listViewItem);

                var item = items[i];

                listViewItem.SubItems.Add(item.GetName());
                listViewItem.SubItems.Add(item.GetPrice().ToString());
                listViewItem.SubItems.Add(item.GetQuantity().ToString());
                listViewItem.SubItems.Add((item.GetPrice() * item.GetQuantity()).ToString());
            }
        }

        private void btn_Delete_Click(object sender, EventArgs e)
        {
            if (lview_Items.SelectedIndices.Count < 1)
            {
                MessageBox.Show(this, "Выберите элемент для удаления!", "Сообщение об ошибке", MessageBoxButtons.OK, MessageBoxIcon.Error);
                return;
            }
            else
            {
                try
                {
                    itemOperation.RemoveItem(lview_Items.SelectedIndices[0]);
                    ShowItemInfo(itemOperation.GetItems());
                    if (string.IsNullOrEmpty(tbox_Sum.Text)) btn_Calculate_Click(sender, e);
                }
                catch (Exception ex)
                {
                    MessageBox.Show(this, "Ошибка соединения: +" + ex, "Сообщение об ошибке", MessageBoxButtons.OK, MessageBoxIcon.Error);
                }
            }
        }
    }
}
