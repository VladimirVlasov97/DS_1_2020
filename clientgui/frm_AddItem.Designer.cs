namespace clientgui
{
    partial class frm_AddItem
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.lbl_Name = new System.Windows.Forms.Label();
            this.lbl_Quantity = new System.Windows.Forms.Label();
            this.lbl_Price = new System.Windows.Forms.Label();
            this.lbl_PriceValue = new System.Windows.Forms.Label();
            this.combo_Name = new System.Windows.Forms.ComboBox();
            this.num_Quantity = new System.Windows.Forms.NumericUpDown();
            this.scroll_Price = new System.Windows.Forms.HScrollBar();
            this.group_Constructor = new System.Windows.Forms.GroupBox();
            this.radio_WithoutParameters = new System.Windows.Forms.RadioButton();
            this.radio_WithParameters = new System.Windows.Forms.RadioButton();
            this.btn_AddItem = new System.Windows.Forms.Button();
            this.btn_Cancel = new System.Windows.Forms.Button();
            ((System.ComponentModel.ISupportInitialize)(this.num_Quantity)).BeginInit();
            this.group_Constructor.SuspendLayout();
            this.SuspendLayout();
            // 
            // lbl_Name
            // 
            this.lbl_Name.AutoSize = true;
            this.lbl_Name.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(204)));
            this.lbl_Name.Location = new System.Drawing.Point(12, 9);
            this.lbl_Name.Name = "lbl_Name";
            this.lbl_Name.Size = new System.Drawing.Size(126, 20);
            this.lbl_Name.TabIndex = 0;
            this.lbl_Name.Text = "Наименование:";
            // 
            // lbl_Quantity
            // 
            this.lbl_Quantity.AutoSize = true;
            this.lbl_Quantity.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(204)));
            this.lbl_Quantity.Location = new System.Drawing.Point(12, 35);
            this.lbl_Quantity.Name = "lbl_Quantity";
            this.lbl_Quantity.Size = new System.Drawing.Size(104, 20);
            this.lbl_Quantity.TabIndex = 1;
            this.lbl_Quantity.Text = "Количество:";
            // 
            // lbl_Price
            // 
            this.lbl_Price.AutoSize = true;
            this.lbl_Price.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(204)));
            this.lbl_Price.Location = new System.Drawing.Point(12, 58);
            this.lbl_Price.Name = "lbl_Price";
            this.lbl_Price.Size = new System.Drawing.Size(52, 20);
            this.lbl_Price.TabIndex = 2;
            this.lbl_Price.Text = "Цена:";
            // 
            // lbl_PriceValue
            // 
            this.lbl_PriceValue.AutoSize = true;
            this.lbl_PriceValue.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(204)));
            this.lbl_PriceValue.Location = new System.Drawing.Point(70, 58);
            this.lbl_PriceValue.Name = "lbl_PriceValue";
            this.lbl_PriceValue.Size = new System.Drawing.Size(18, 20);
            this.lbl_PriceValue.TabIndex = 3;
            this.lbl_PriceValue.Text = "0";
            // 
            // combo_Name
            // 
            this.combo_Name.DropDownStyle = System.Windows.Forms.ComboBoxStyle.DropDownList;
            this.combo_Name.Items.AddRange(new object[] {
            "Тетрадь",
            "Ручка",
            "Карандаш"});
            this.combo_Name.Location = new System.Drawing.Point(144, 8);
            this.combo_Name.Name = "combo_Name";
            this.combo_Name.Size = new System.Drawing.Size(121, 21);
            this.combo_Name.TabIndex = 4;
            // 
            // num_Quantity
            // 
            this.num_Quantity.Location = new System.Drawing.Point(144, 35);
            this.num_Quantity.Maximum = new decimal(new int[] {
            30,
            0,
            0,
            0});
            this.num_Quantity.Minimum = new decimal(new int[] {
            1,
            0,
            0,
            0});
            this.num_Quantity.Name = "num_Quantity";
            this.num_Quantity.Size = new System.Drawing.Size(121, 20);
            this.num_Quantity.TabIndex = 5;
            this.num_Quantity.Value = new decimal(new int[] {
            10,
            0,
            0,
            0});
            // 
            // scroll_Price
            // 
            this.scroll_Price.Location = new System.Drawing.Point(112, 58);
            this.scroll_Price.Maximum = 109;
            this.scroll_Price.Name = "scroll_Price";
            this.scroll_Price.Size = new System.Drawing.Size(214, 20);
            this.scroll_Price.TabIndex = 6;
            this.scroll_Price.Scroll += new System.Windows.Forms.ScrollEventHandler(this.scroll_Price_Scroll);
            // 
            // group_Constructor
            // 
            this.group_Constructor.Controls.Add(this.radio_WithoutParameters);
            this.group_Constructor.Controls.Add(this.radio_WithParameters);
            this.group_Constructor.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(204)));
            this.group_Constructor.Location = new System.Drawing.Point(16, 81);
            this.group_Constructor.Name = "group_Constructor";
            this.group_Constructor.Size = new System.Drawing.Size(310, 100);
            this.group_Constructor.TabIndex = 7;
            this.group_Constructor.TabStop = false;
            this.group_Constructor.Text = "Конструктор";
            // 
            // radio_WithoutParameters
            // 
            this.radio_WithoutParameters.AutoSize = true;
            this.radio_WithoutParameters.Location = new System.Drawing.Point(6, 25);
            this.radio_WithoutParameters.Name = "radio_WithoutParameters";
            this.radio_WithoutParameters.Size = new System.Drawing.Size(149, 24);
            this.radio_WithoutParameters.TabIndex = 1;
            this.radio_WithoutParameters.TabStop = true;
            this.radio_WithoutParameters.Text = "без параметров";
            this.radio_WithoutParameters.UseVisualStyleBackColor = true;
            // 
            // radio_WithParameters
            // 
            this.radio_WithParameters.AutoSize = true;
            this.radio_WithParameters.Location = new System.Drawing.Point(161, 25);
            this.radio_WithParameters.Name = "radio_WithParameters";
            this.radio_WithParameters.Size = new System.Drawing.Size(142, 24);
            this.radio_WithParameters.TabIndex = 0;
            this.radio_WithParameters.TabStop = true;
            this.radio_WithParameters.Text = "с параметрами";
            this.radio_WithParameters.UseVisualStyleBackColor = true;
            // 
            // btn_AddItem
            // 
            this.btn_AddItem.Location = new System.Drawing.Point(12, 187);
            this.btn_AddItem.Name = "btn_AddItem";
            this.btn_AddItem.Size = new System.Drawing.Size(75, 23);
            this.btn_AddItem.TabIndex = 8;
            this.btn_AddItem.Text = "Добавить";
            this.btn_AddItem.UseVisualStyleBackColor = true;
            this.btn_AddItem.Click += new System.EventHandler(this.btn_AddItem_Click);
            // 
            // btn_Cancel
            // 
            this.btn_Cancel.Location = new System.Drawing.Point(251, 187);
            this.btn_Cancel.Name = "btn_Cancel";
            this.btn_Cancel.Size = new System.Drawing.Size(75, 23);
            this.btn_Cancel.TabIndex = 9;
            this.btn_Cancel.Text = "Отменить";
            this.btn_Cancel.UseVisualStyleBackColor = true;
            this.btn_Cancel.Click += new System.EventHandler(this.btn_Cancel_Click);
            // 
            // frm_AddItem
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(338, 221);
            this.Controls.Add(this.btn_Cancel);
            this.Controls.Add(this.btn_AddItem);
            this.Controls.Add(this.group_Constructor);
            this.Controls.Add(this.scroll_Price);
            this.Controls.Add(this.num_Quantity);
            this.Controls.Add(this.combo_Name);
            this.Controls.Add(this.lbl_PriceValue);
            this.Controls.Add(this.lbl_Price);
            this.Controls.Add(this.lbl_Quantity);
            this.Controls.Add(this.lbl_Name);
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.FixedSingle;
            this.MaximizeBox = false;
            this.Name = "frm_AddItem";
            this.Text = "frm_AddItem";
            this.Load += new System.EventHandler(this.frm_AddItem_Load);
            ((System.ComponentModel.ISupportInitialize)(this.num_Quantity)).EndInit();
            this.group_Constructor.ResumeLayout(false);
            this.group_Constructor.PerformLayout();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label lbl_Name;
        private System.Windows.Forms.Label lbl_Quantity;
        private System.Windows.Forms.Label lbl_Price;
        private System.Windows.Forms.Label lbl_PriceValue;
        private System.Windows.Forms.ComboBox combo_Name;
        private System.Windows.Forms.NumericUpDown num_Quantity;
        private System.Windows.Forms.HScrollBar scroll_Price;
        private System.Windows.Forms.GroupBox group_Constructor;
        private System.Windows.Forms.Button btn_AddItem;
        private System.Windows.Forms.Button btn_Cancel;
        private System.Windows.Forms.RadioButton radio_WithParameters;
        private System.Windows.Forms.RadioButton radio_WithoutParameters;
    }
}