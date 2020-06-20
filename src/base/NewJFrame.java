package base;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import operation.TovarOperationImpl;
import types.Tovar;

public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dlgAdd = new javax.swing.JDialog();
        lblName = new javax.swing.JLabel();
        lblKol = new javax.swing.JLabel();
        lblPrice = new javax.swing.JLabel();
        lblPriceInfo = new javax.swing.JLabel();
        cmbName = new javax.swing.JComboBox();
        spnKol = new javax.swing.JSpinner();
        scrPrice = new javax.swing.JScrollBar();
        pnlConstruct = new javax.swing.JPanel();
        btnCancel = new javax.swing.JButton();
        btnAddTovar = new javax.swing.JButton();
        rdbNoParam = new javax.swing.JRadioButton();
        rdbYesParam = new javax.swing.JRadioButton();
        btnGrp = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl = new javax.swing.JTable();
        lbl = new javax.swing.JLabel();
        txt = new javax.swing.JTextField();
        tlBar = new javax.swing.JToolBar();
        btnAdd = new javax.swing.JButton();
        spr1 = new javax.swing.JToolBar.Separator();
        btnDecide = new javax.swing.JButton();
        spr2 = new javax.swing.JToolBar.Separator();
        btnExit = new javax.swing.JButton();

        lblName.setText("Наименование");

        lblKol.setText("Количество");

        lblPrice.setText("Цена");

        lblPriceInfo.setText("50");

        cmbName.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Тетрадь", "Ручка", "Карандаш" }));
        cmbName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbNameActionPerformed(evt);
            }
        });

        spnKol.setModel(new javax.swing.SpinnerNumberModel(10, 1, 30, 2));

        scrPrice.setMinimum(5);
        scrPrice.setOrientation(javax.swing.JScrollBar.HORIZONTAL);
        scrPrice.setValue(50);
        scrPrice.addAdjustmentListener(new java.awt.event.AdjustmentListener() {
            public void adjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {
                scrPriceAdjustmentValueChanged(evt);
            }
        });

        pnlConstruct.setBorder(javax.swing.BorderFactory.createTitledBorder("Конструктор"));

        btnCancel.setText("Отмена");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnAddTovar.setText("Добавить");
        btnAddTovar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddTovarActionPerformed(evt);
            }
        });

        btnGrp.add(rdbNoParam);
        rdbNoParam.setSelected(true);
        rdbNoParam.setText("без параметров");

        btnGrp.add(rdbYesParam);
        rdbYesParam.setText("с параметрами");

        javax.swing.GroupLayout pnlConstructLayout = new javax.swing.GroupLayout(pnlConstruct);
        pnlConstruct.setLayout(pnlConstructLayout);
        pnlConstructLayout.setHorizontalGroup(
            pnlConstructLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlConstructLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnAddTovar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancel))
            .addGroup(pnlConstructLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rdbNoParam)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(rdbYesParam)
                .addGap(37, 37, 37))
        );
        pnlConstructLayout.setVerticalGroup(
            pnlConstructLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlConstructLayout.createSequentialGroup()
                .addGap(0, 18, Short.MAX_VALUE)
                .addGroup(pnlConstructLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbNoParam)
                    .addComponent(rdbYesParam))
                .addGap(31, 31, 31)
                .addGroup(pnlConstructLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancel)
                    .addComponent(btnAddTovar)))
        );

        javax.swing.GroupLayout dlgAddLayout = new javax.swing.GroupLayout(dlgAdd.getContentPane());
        dlgAdd.getContentPane().setLayout(dlgAddLayout);
        dlgAddLayout.setHorizontalGroup(
            dlgAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlgAddLayout.createSequentialGroup()
                .addGroup(dlgAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dlgAddLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(dlgAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblKol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(34, 34, 34)
                        .addGroup(dlgAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbName, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spnKol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(scrPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(dlgAddLayout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(lblPriceInfo))
                    .addGroup(dlgAddLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pnlConstruct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        dlgAddLayout.setVerticalGroup(
            dlgAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlgAddLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dlgAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(dlgAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblKol)
                    .addComponent(spnKol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(lblPriceInfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(dlgAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblPrice)
                    .addComponent(scrPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(pnlConstruct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Работа№1");
        setName("form");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "№ п/п", "Название", "Цена", "Количество", "Сумма"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl);

        lbl.setText("Общая сумма товара");

        txt.setEditable(false);
        txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtActionPerformed(evt);
            }
        });

        tlBar.setRollover(true);

        btnAdd.setText("Добавить");
        btnAdd.setFocusable(false);
        btnAdd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAdd.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        tlBar.add(btnAdd);
        tlBar.add(spr1);

        btnDecide.setText("Вычислить");
        btnDecide.setFocusable(false);
        btnDecide.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDecide.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDecide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDecideActionPerformed(evt);
            }
        });
        tlBar.add(btnDecide);
        tlBar.add(spr2);

        btnExit.setText("Выход");
        btnExit.setFocusable(false);
        btnExit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnExit.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        tlBar.add(btnExit);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(115, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(tlBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tlBar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    TovarOperationImpl tovarOperation = new TovarOperationImpl();
    static DefaultTableModel model = new DefaultTableModel();

    private void txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtActionPerformed

    private void cmbNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbNameActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        dlgAdd.setSize(300, 320);
        dlgAdd.setVisible(true);
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnDecideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDecideActionPerformed
        txt.setText(Integer.toString(tovarOperation.getSumOfTovar()));
    }//GEN-LAST:event_btnDecideActionPerformed

    private void btnAddTovarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddTovarActionPerformed
        dlgAdd.setVisible(false);
        // д.б. код для проверки полей на правильность ввода
        Tovar el;
        if (rdbYesParam.isSelected()) {
            el = new Tovar(cmbName.getSelectedItem().toString(), ((Number) spnKol.getValue()).intValue(), (double)scrPrice.getValue());
        } else {
            el = new Tovar();
            el.setName(cmbName.getSelectedItem().toString());
            el.setKol(((Number) spnKol.getValue()).intValue());
            el.setPrice(scrPrice.getValue());
        }
        doVivod(tovarOperation.addNewTovar(el));

    }//GEN-LAST:event_btnAddTovarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        model = (DefaultTableModel) tbl.getModel();
        doVivod(tovarOperation.getListOfTovar());
    }//GEN-LAST:event_formWindowOpened

    private void scrPriceAdjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {//GEN-FIRST:event_scrPriceAdjustmentValueChanged
        lblPriceInfo.setText(Integer.toString((int) scrPrice.getValue()));
    }//GEN-LAST:event_scrPriceAdjustmentValueChanged

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        dlgAdd.setVisible(false);
    }//GEN-LAST:event_btnCancelActionPerformed

    private void doVivod(List<Tovar> lstTovar) {
        doClearTable();
        int i = 1;
        for (Tovar tovar : lstTovar) {
            Object[] rowData = new Object[5];
            rowData[0] = i++;
            rowData[1] = tovar.getName();
            rowData[2] = tovar.getPrice();
            rowData[3] = tovar.getKol();
            rowData[4] = tovar.getPrice() * tovar.getKol();
            model.addRow(rowData);
        }
    }

    private void doClearTable() {
        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }
    }

        /**
         * @param args the command line arguments
         */
    

    

    

    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnAddTovar;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDecide;
    private javax.swing.JButton btnExit;
    private javax.swing.ButtonGroup btnGrp;
    private javax.swing.JComboBox cmbName;
    private javax.swing.JDialog dlgAdd;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl;
    private javax.swing.JLabel lblKol;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblPriceInfo;
    private javax.swing.JPanel pnlConstruct;
    private javax.swing.JRadioButton rdbNoParam;
    private javax.swing.JRadioButton rdbYesParam;
    private javax.swing.JScrollBar scrPrice;
    private javax.swing.JSpinner spnKol;
    private javax.swing.JToolBar.Separator spr1;
    private javax.swing.JToolBar.Separator spr2;
    private javax.swing.JTable tbl;
    private javax.swing.JToolBar tlBar;
    private javax.swing.JTextField txt;
    // End of variables declaration//GEN-END:variables
}
