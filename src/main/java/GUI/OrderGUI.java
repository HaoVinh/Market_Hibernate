/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import BLL.CustomerBLL;
import BLL.OrderBLL;
import DAL.PatternCheck;
import DTO.Customer;
import DTO.Order;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Naomi On
 */
public class OrderGUI extends javax.swing.JFrame {
    
    public final OrderBLL orderBLL=new OrderBLL();
    public final CustomerBLL customerBLL=new CustomerBLL();
    public final PatternCheck check=new PatternCheck();
    
    
    public OrderGUI() {
        initComponents();
        loadOrder();
        setUpCmbCustomerID();
        setUpCmbSearch();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrder = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtOrderID = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cmbCustomerID = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cmbSearch = new javax.swing.JComboBox<>();
        btnSearch = new javax.swing.JButton();
        btnAddOrder = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnViewOrderDetail = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        txtDate = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtNote = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Orders Report");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(242, 242, 242)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel3)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        tblOrder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "OrderID", "Customer ID", "FullName", "Date", "Note", "Total"
            }
        ));
        tblOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblOrderMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblOrder);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Find:");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Order ID:");

        txtOrderID.setEnabled(false);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Customer ID:");

        cmbCustomerID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbCustomerID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCustomerIDActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Customer Name:");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Date:");

        txtName.setEnabled(false);

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Total:");

        txtTotal.setEnabled(false);

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Note:");

        cmbSearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnAddOrder.setText("Add New Bill");
        btnAddOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddOrderActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");

        btnViewOrderDetail.setText("View Bill Detail");
        btnViewOrderDetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewOrderDetailActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");

        jButton7.setText("Refresh");

        txtNote.setColumns(20);
        txtNote.setRows(5);
        jScrollPane2.setViewportView(txtNote);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(28, 28, 28)
                                .addComponent(txtOrderID, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbCustomerID, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(27, 27, 27)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(cmbSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnAddOrder)
                                .addGap(92, 92, 92)
                                .addComponent(btnViewOrderDetail)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(btnSearch)
                                .addGap(57, 57, 57)
                                .addComponent(jButton7))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(94, 94, 94)
                                .addComponent(btnUpdate)
                                .addGap(98, 98, 98)
                                .addComponent(btnDelete)))
                        .addGap(0, 49, Short.MAX_VALUE)))
                .addGap(84, 84, 84))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtOrderID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmbCustomerID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSearch)
                            .addComponent(jButton7))
                        .addGap(35, 35, 35))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 138, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddOrder)
                    .addComponent(btnUpdate)
                    .addComponent(btnViewOrderDetail)
                    .addComponent(btnDelete))
                .addGap(41, 41, 41)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewOrderDetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewOrderDetailActionPerformed

        Order order=new Order();
        int selectedRow = tblOrder.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "There is no row selected");
            return;
        }

        order.setOrderID((int) tblOrder.getValueAt(selectedRow, 0));
        order.setCustomer(customerBLL.getCustomerListByID(Integer.parseInt(tblOrder.getValueAt(selectedRow, 1).toString())));
        order.setDate((Date) tblOrder.getValueAt(selectedRow, 3));
        order.setTotal(Float.parseFloat(tblOrder.getValueAt(selectedRow, 5).toString()));
        order.setNote(tblOrder.getValueAt(selectedRow, 4).toString());

        OrderDetailGUI ql = new OrderDetailGUI(order);
        ql.setLocationRelativeTo(null);
        ql.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ql.setVisible(true);

        dispose();
    }//GEN-LAST:event_btnViewOrderDetailActionPerformed

    private void btnAddOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddOrderActionPerformed

        if(txtDate.getText().length()==0)
        {
            JOptionPane.showMessageDialog(this, "Please fill out all the information!");
            return;
        }

        Order order=new Order();

        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            order.setDate(dateFormat.parse(txtDate.getText()));
        } catch (ParseException ex) {
            Logger.getLogger(OrderGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        order.setCustomer(customerBLL.getCustomerListByID(Integer.parseInt(cmbCustomerID.getSelectedItem().toString())));
        order.setNote(txtNote.getText());
        order.setTotal(0);

        if(orderBLL.addOrder(order)==0)
        {
            JOptionPane.showMessageDialog(this, "Add new Order success");
        }else{
            JOptionPane.showMessageDialog(this, "Add new Order failed");
        }
        refresh();

    }//GEN-LAST:event_btnAddOrderActionPerformed

    private void cmbCustomerIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCustomerIDActionPerformed

        if(cmbCustomerID.getSelectedItem()!=null)
        {
            Customer customer=customerBLL.getCustomerListByID(Integer.parseInt(cmbCustomerID.getSelectedItem().toString()));
            if(customer==null)
            {
                JOptionPane.showMessageDialog(this, "Can't load OrderName");
                return;
            }
            txtName.setText(customer.getFullName());
        }

    }//GEN-LAST:event_cmbCustomerIDActionPerformed

    private void tblOrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblOrderMouseClicked

        int selectedRow=tblOrder.getSelectedRow();

        txtOrderID.setText(tblOrder.getValueAt(selectedRow,0 ).toString());
        cmbCustomerID.setSelectedItem(tblOrder.getValueAt(selectedRow, 1).toString());
        txtDate.setText(tblOrder.getValueAt(selectedRow, 3).toString());
        txtNote.setText(tblOrder.getValueAt(selectedRow, 4).toString());
        txtTotal.setText(tblOrder.getValueAt(selectedRow, 5).toString());

    }//GEN-LAST:event_tblOrderMouseClicked

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        
        
        if(txtSearch.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Please fill out all the information!");
            return;
        }
        if(!check.CheckNumber(txtSearch.getText()))
        {
            JOptionPane.showMessageDialog(this, "Search format is incorrect please try again!");
            return;
        }
        
        if(cmbSearch.getSelectedIndex()==0)
        {
            loadOrderByID(Integer.parseInt(txtSearch.getText().toString()));
        }else if(cmbSearch.getSelectedIndex()==1)
        {
            loadOrderByCustomerID(Integer.parseInt(txtSearch.getText().toString()));
        }
        
    }//GEN-LAST:event_btnSearchActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrderGUI().setVisible(true);
            }
        });
    }
    
    private void loadOrder()
    {
        Object[][] data = orderBLL.getOrder();
        if(data.length==0)
        {
            JOptionPane.showMessageDialog(this, "Order Is Null Or Error Please Try Again");
            return;
        }
        String[] title = {"Order ID","Customer ID","Customer Name","Date" ,"Note", "Total"};
        DefaultTableModel model = new DefaultTableModel(data, title);
        tblOrder.setModel(model);
    }
    
    private void loadOrderByID(int orderID)
    {
        Object[][] data = orderBLL.getOrderByID(orderID);
        if(data.length==0)
        {
            JOptionPane.showMessageDialog(this, "Order Is Null Or Error Please Try Again");
            return;
        }
        String[] title = {"Order ID","Customer ID","Customer Name","Date" ,"Note", "Total"};
        DefaultTableModel model = new DefaultTableModel(data, title);
        tblOrder.setModel(model);
    }
    
    private void loadOrderByCustomerID(int customerID)
    {
        Object[][] data = orderBLL.getOrderByCustomerID(customerID);
        if(data.length==0)
        {
            JOptionPane.showMessageDialog(this, "Order Is Null Or Error Please Try Again");
            return;
        }
        String[] title = {"Order ID","Customer ID","Customer Name","Date" ,"Note", "Total"};
        DefaultTableModel model = new DefaultTableModel(data, title);
        tblOrder.setModel(model);
    }
    
    private void refresh()
    {
//        String datePattern = "yyyy-dd-mm";
//        SimpleDateFormat dateFormatter = new SimpleDateFormat(datePattern);
        txtOrderID.setText("");
        txtDate.setText("");
        txtSearch.setText("");
        txtName.setText("");
        cmbCustomerID.setSelectedIndex(0);
        txtTotal.setText("");
        txtNote.setText("");
        
        loadOrder();
        
    }
    
    private void setUpCmbSearch()
    {
        cmbSearch.removeAllItems();
        cmbSearch.addItem("Order ID");
        cmbSearch.addItem("Customer ID");
    }
    
    private void setUpCmbCustomerID()
    {
        cmbCustomerID.removeAllItems();
        List<Customer> customerList=customerBLL.getCustomerList();
        if(customerList.isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Get Customer Error Please Try Again");
            return;
        }
        for(Customer customer :customerList)
        {
            cmbCustomerID.addItem(String.valueOf(customer.getCustomerID()));
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddOrder;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnViewOrderDetail;
    private javax.swing.JComboBox<String> cmbCustomerID;
    private javax.swing.JComboBox<String> cmbSearch;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblOrder;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextArea txtNote;
    private javax.swing.JTextField txtOrderID;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
