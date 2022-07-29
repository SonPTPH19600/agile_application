package views;

import thread.ClockThread;

/**
 * @author SonPT_PH19600
 */
public class ProductManagement extends javax.swing.JFrame {

    private ClockThread clock;

    public ProductManagement() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        clock = new ClockThread();
        ClockThread.jLabel = lbClock;
        clock.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtSupplierId = new javax.swing.JTextField();
        txtQuantity = new javax.swing.JTextField();
        txtProductName = new javax.swing.JTextField();
        txtProductId = new javax.swing.JTextField();
        txtSupplierName = new javax.swing.JTextField();
        txtStatus = new javax.swing.JTextField();
        txtSellPrice = new javax.swing.JTextField();
        txtOriginPrice = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbProduct = new javax.swing.JTable();
        btnExit = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        btnSort = new javax.swing.JButton();
        lbProductImg = new javax.swing.JLabel();
        lbClock = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logo.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 70));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel2.setText("QUẢN LÝ ÔTÔ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(396, 6, -1, -1));

        jTextField1.setBackground(new java.awt.Color(204, 255, 255));
        jTextField1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(361, 67, 300, 30));

        btnSearch.setBackground(new java.awt.Color(0, 137, 224));
        btnSearch.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/searchicon.png"))); // NOI18N
        btnSearch.setText("Tìm Kiếm");
        jPanel1.add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(679, 68, -1, 35));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Mã Ôtô");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Tên Ôtô");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("Số Lượng");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setText("Mã NCC");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setText("Tên NCC");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 120, -1, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel9.setText("Trạng Thái");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 160, -1, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel10.setText("Gía Bán");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 200, -1, -1));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel11.setText("Gía Nhập");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 240, -1, -1));

        txtSupplierId.setBackground(new java.awt.Color(204, 255, 255));
        txtSupplierId.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtSupplierId.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtSupplierId, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 200, -1));

        txtQuantity.setBackground(new java.awt.Color(204, 255, 255));
        txtQuantity.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtQuantity.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 200, -1));

        txtProductName.setBackground(new java.awt.Color(204, 255, 255));
        txtProductName.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtProductName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtProductName, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 200, -1));

        txtProductId.setBackground(new java.awt.Color(204, 255, 255));
        txtProductId.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtProductId.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtProductId, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 200, -1));

        txtSupplierName.setBackground(new java.awt.Color(204, 255, 255));
        txtSupplierName.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtSupplierName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtSupplierName, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 120, 200, -1));

        txtStatus.setBackground(new java.awt.Color(204, 255, 255));
        txtStatus.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtStatus.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 160, 200, -1));

        txtSellPrice.setBackground(new java.awt.Color(204, 255, 255));
        txtSellPrice.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtSellPrice.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtSellPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 201, 200, -1));

        txtOriginPrice.setBackground(new java.awt.Color(204, 255, 255));
        txtOriginPrice.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtOriginPrice.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtOriginPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 240, 200, -1));

        btnAdd.setBackground(new java.awt.Color(0, 137, 224));
        btnAdd.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/addicon.png"))); // NOI18N
        btnAdd.setText("Thêm");
        jPanel1.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 337, 110, 35));

        btnUpdate.setBackground(new java.awt.Color(0, 137, 224));
        btnUpdate.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/editicon.png"))); // NOI18N
        btnUpdate.setText("Sửa");
        jPanel1.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, 110, 35));

        btnDelete.setBackground(new java.awt.Color(0, 137, 224));
        btnDelete.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/deleteicon.png"))); // NOI18N
        btnDelete.setText("Xóa");
        jPanel1.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(463, 337, 110, 35));

        btnClear.setBackground(new java.awt.Color(0, 137, 224));
        btnClear.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnClear.setForeground(new java.awt.Color(255, 255, 255));
        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/clearicon.png"))); // NOI18N
        btnClear.setText("Clear");
        jPanel1.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 340, 110, 35));

        tbProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Ôtô", "Tên Ôtô", "Số Lượng", "Mã NCC", "Tên NCC", "Trạng Thái", "Gía Bán", "Gía Nhập", "Ảnh"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbProduct);
        if (tbProduct.getColumnModel().getColumnCount() > 0) {
            tbProduct.getColumnModel().getColumn(0).setPreferredWidth(30);
            tbProduct.getColumnModel().getColumn(1).setPreferredWidth(100);
            tbProduct.getColumnModel().getColumn(2).setPreferredWidth(20);
            tbProduct.getColumnModel().getColumn(3).setPreferredWidth(30);
            tbProduct.getColumnModel().getColumn(4).setPreferredWidth(100);
            tbProduct.getColumnModel().getColumn(8).setPreferredWidth(40);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 382, 1000, 320));

        btnExit.setBackground(new java.awt.Color(255, 0, 0));
        btnExit.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/exiticon.png"))); // NOI18N
        btnExit.setText("Thoát");
        jPanel1.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 720, 110, 35));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel12.setText("Lọc");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 280, -1, -1));

        jComboBox1.setBackground(new java.awt.Color(204, 255, 255));
        jComboBox1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.setBorder(null);
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 280, 200, -1));

        btnSort.setBackground(new java.awt.Color(0, 137, 224));
        btnSort.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnSort.setForeground(new java.awt.Color(255, 255, 255));
        btnSort.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/filtericon.png"))); // NOI18N
        btnSort.setText("Lọc");
        jPanel1.add(btnSort, new org.netbeans.lib.awtextra.AbsoluteConstraints(679, 337, 110, 35));

        lbProductImg.setBackground(new java.awt.Color(255, 255, 255));
        lbProductImg.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbProductImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbProductImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/noImage.png"))); // NOI18N
        lbProductImg.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 137, 224)));
        jPanel1.add(lbProductImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 340, 200));

        lbClock.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lbClock.setForeground(new java.awt.Color(255, 0, 0));
        lbClock.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbClock.setText("12:00");
        jPanel1.add(lbClock, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 20, 140, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1024, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 768, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ProductManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProductManagement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSort;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lbClock;
    private javax.swing.JLabel lbProductImg;
    private javax.swing.JTable tbProduct;
    private javax.swing.JTextField txtOriginPrice;
    private javax.swing.JTextField txtProductId;
    private javax.swing.JTextField txtProductName;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtSellPrice;
    private javax.swing.JTextField txtStatus;
    private javax.swing.JTextField txtSupplierId;
    private javax.swing.JTextField txtSupplierName;
    // End of variables declaration//GEN-END:variables
}
