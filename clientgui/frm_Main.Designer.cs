namespace clientgui
{
    partial class frm_Main
    {
        /// <summary>
        /// Обязательная переменная конструктора.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Освободить все используемые ресурсы.
        /// </summary>
        /// <param name="disposing">истинно, если управляемый ресурс должен быть удален; иначе ложно.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Код, автоматически созданный конструктором форм Windows

        /// <summary>
        /// Требуемый метод для поддержки конструктора — не изменяйте 
        /// содержимое этого метода с помощью редактора кода.
        /// </summary>
        private void InitializeComponent()
        {
            this.menuStrip1 = new System.Windows.Forms.MenuStrip();
            this.btn_Add = new System.Windows.Forms.ToolStripMenuItem();
            this.btn_Calculate = new System.Windows.Forms.ToolStripMenuItem();
            this.btn_Delete = new System.Windows.Forms.ToolStripMenuItem();
            this.btn_Update = new System.Windows.Forms.ToolStripMenuItem();
            this.btn_Exit = new System.Windows.Forms.ToolStripMenuItem();
            this.lview_Items = new System.Windows.Forms.ListView();
            this.lbl_Sum = new System.Windows.Forms.Label();
            this.tbox_Sum = new System.Windows.Forms.TextBox();
            this.id = ((System.Windows.Forms.ColumnHeader)(new System.Windows.Forms.ColumnHeader()));
            this.name = ((System.Windows.Forms.ColumnHeader)(new System.Windows.Forms.ColumnHeader()));
            this.price = ((System.Windows.Forms.ColumnHeader)(new System.Windows.Forms.ColumnHeader()));
            this.quantity = ((System.Windows.Forms.ColumnHeader)(new System.Windows.Forms.ColumnHeader()));
            this.totalPrice = ((System.Windows.Forms.ColumnHeader)(new System.Windows.Forms.ColumnHeader()));
            this.menuStrip1.SuspendLayout();
            this.SuspendLayout();
            // 
            // menuStrip1
            // 
            this.menuStrip1.Items.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.btn_Add,
            this.btn_Calculate,
            this.btn_Delete,
            this.btn_Update,
            this.btn_Exit});
            this.menuStrip1.Location = new System.Drawing.Point(0, 0);
            this.menuStrip1.Name = "menuStrip1";
            this.menuStrip1.Size = new System.Drawing.Size(800, 24);
            this.menuStrip1.TabIndex = 0;
            this.menuStrip1.Text = "menuStrip";
            // 
            // btn_Add
            // 
            this.btn_Add.Name = "btn_Add";
            this.btn_Add.Size = new System.Drawing.Size(71, 20);
            this.btn_Add.Text = "Добавить";
            this.btn_Add.Click += new System.EventHandler(this.btn_Add_Click);
            // 
            // btn_Calculate
            // 
            this.btn_Calculate.Name = "btn_Calculate";
            this.btn_Calculate.Size = new System.Drawing.Size(80, 20);
            this.btn_Calculate.Text = "Вычислить";
            this.btn_Calculate.Click += new System.EventHandler(this.btn_Calculate_Click);
            // 
            // btn_Delete
            // 
            this.btn_Delete.Name = "btn_Delete";
            this.btn_Delete.Size = new System.Drawing.Size(63, 20);
            this.btn_Delete.Text = "Удалить";
            this.btn_Delete.Click += new System.EventHandler(this.btn_Delete_Click);
            // 
            // btn_Update
            // 
            this.btn_Update.Name = "btn_Update";
            this.btn_Update.Size = new System.Drawing.Size(73, 20);
            this.btn_Update.Text = "Обновить";
            this.btn_Update.Click += new System.EventHandler(this.btn_Update_Click);
            // 
            // btn_Exit
            // 
            this.btn_Exit.Name = "btn_Exit";
            this.btn_Exit.Size = new System.Drawing.Size(54, 20);
            this.btn_Exit.Text = "Выход";
            this.btn_Exit.Click += new System.EventHandler(this.btn_Exit_Click);
            // 
            // lview_Items
            // 
            this.lview_Items.Columns.AddRange(new System.Windows.Forms.ColumnHeader[] {
            this.id,
            this.name,
            this.price,
            this.quantity,
            this.totalPrice});
            this.lview_Items.GridLines = true;
            this.lview_Items.HideSelection = false;
            this.lview_Items.Location = new System.Drawing.Point(12, 27);
            this.lview_Items.Name = "lview_Items";
            this.lview_Items.Size = new System.Drawing.Size(776, 385);
            this.lview_Items.TabIndex = 1;
            this.lview_Items.UseCompatibleStateImageBehavior = false;
            this.lview_Items.View = System.Windows.Forms.View.Details;
            // 
            // lbl_Sum
            // 
            this.lbl_Sum.AutoSize = true;
            this.lbl_Sum.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(204)));
            this.lbl_Sum.Location = new System.Drawing.Point(12, 421);
            this.lbl_Sum.Name = "lbl_Sum";
            this.lbl_Sum.Size = new System.Drawing.Size(173, 20);
            this.lbl_Sum.TabIndex = 2;
            this.lbl_Sum.Text = "Общая сумма товара:";
            // 
            // tbox_Sum
            // 
            this.tbox_Sum.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(204)));
            this.tbox_Sum.Location = new System.Drawing.Point(191, 418);
            this.tbox_Sum.Name = "tbox_Sum";
            this.tbox_Sum.ReadOnly = true;
            this.tbox_Sum.Size = new System.Drawing.Size(597, 26);
            this.tbox_Sum.TabIndex = 3;
            // 
            // id
            // 
            this.id.Text = "№";
            // 
            // name
            // 
            this.name.Text = "Название";
            // 
            // price
            // 
            this.price.Text = "Цена";
            // 
            // quantity
            // 
            this.quantity.Text = "Количество";
            // 
            // totalPrice
            // 
            this.totalPrice.Text = "Сумма";
            // 
            // frm_Main
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.tbox_Sum);
            this.Controls.Add(this.lbl_Sum);
            this.Controls.Add(this.lview_Items);
            this.Controls.Add(this.menuStrip1);
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.FixedSingle;
            this.MainMenuStrip = this.menuStrip1;
            this.MaximizeBox = false;
            this.Name = "frm_Main";
            this.Text = "Товары";
            this.Load += new System.EventHandler(this.frm_Main_Load);
            this.menuStrip1.ResumeLayout(false);
            this.menuStrip1.PerformLayout();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.MenuStrip menuStrip1;
        private System.Windows.Forms.ToolStripMenuItem btn_Add;
        private System.Windows.Forms.ToolStripMenuItem btn_Calculate;
        private System.Windows.Forms.ToolStripMenuItem btn_Delete;
        private System.Windows.Forms.ToolStripMenuItem btn_Update;
        private System.Windows.Forms.ListView lview_Items;
        private System.Windows.Forms.Label lbl_Sum;
        private System.Windows.Forms.TextBox tbox_Sum;
        private System.Windows.Forms.ToolStripMenuItem btn_Exit;
        private System.Windows.Forms.ColumnHeader id;
        private System.Windows.Forms.ColumnHeader name;
        private System.Windows.Forms.ColumnHeader price;
        private System.Windows.Forms.ColumnHeader quantity;
        private System.Windows.Forms.ColumnHeader totalPrice;
    }
}

