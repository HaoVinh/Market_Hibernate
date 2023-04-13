
package GUI;

import BLL.CategoryBLL;
import BLL.VegetableBLL;
import DAL.PatternCheck;
import DTO.Category;
import DTO.Vegetable;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.NumberFormatter;

public class VegetableGUI extends javax.swing.JFrame {

    private final VegetableBLL vegetableBLL=new VegetableBLL();
    private final CategoryBLL categoryBLL=new CategoryBLL();
    private final PatternCheck check=new PatternCheck();
    
    public VegetableGUI() {
        initComponents();
        loadVegetable();
        setNumbericSpinner();
        setUpCmbCategoryID();
        setUpCmbSearch();
        setUpCmbImage();
        
//        String imagePath="src/main/resources/images/pexels-pixabay-257794.jpg";
//        image.setIcon(new ImageIcon(imagePath));
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtVegetableID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCategoryName = new javax.swing.JTextField();
        cmbCategoryID = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtVegetableName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtUnit = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        spnAmount = new javax.swing.JSpinner();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVegetable = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        btnRefresh = new javax.swing.JButton();
        cmbSearch = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        image = new javax.swing.JLabel();
        cmbImage = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Vegetable Management");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(295, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(294, 294, 294))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Vegetable ID:");

        txtVegetableID.setEnabled(false);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Category ID:");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Category Name:");

        txtCategoryName.setEnabled(false);

        cmbCategoryID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbCategoryID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCategoryIDActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Vegetable Name:");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Unit:");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Amount:");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Image:");

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Price:");

        tblVegetable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Vegetable ID", "Vegetable Name", "Category ID", "Category Name", "Unit", "Amount", "Image", "Price"
            }
        ));
        tblVegetable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblVegetableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblVegetable);

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        cmbSearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Search:");

        cmbImage.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbImageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtCategoryName))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel2)
                                                .addComponent(jLabel3))
                                            .addGap(18, 18, 18)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(cmbCategoryID, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtVegetableID, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE))))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmbImage, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(btnAdd)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnDelete))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(btnRefresh)
                                                .addGap(35, 35, 35)
                                                .addComponent(btnUpdate)))
                                        .addGap(95, 95, 95)
                                        .addComponent(jLabel10)))
                                .addGap(25, 25, 25)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel9))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(spnAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtUnit, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                            .addComponent(txtVegetableName)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(cmbSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnSearch))))
                            .addComponent(image))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtVegetableID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtVegetableName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cmbCategoryID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtUnit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCategoryName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(spnAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(image)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete)
                    .addComponent(btnAdd)
                    .addComponent(jLabel10)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch)
                    .addComponent(cmbSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRefresh)
                    .addComponent(btnUpdate))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        
        if(txtVegetableName.getText().length()==0||txtUnit.getText().length()==0)
        {
            JOptionPane.showMessageDialog(this, "Please fill out all the information!");
            return;
        }
        
        if(!check.CheckDoubleNumber(txtPrice.getText().toString()))
        {
            JOptionPane.showMessageDialog(this, "Price format is incorrect please try again!");
            return;
        }
        
        Vegetable vegetable=new Vegetable();
        vegetable.setAmount(Integer.parseInt(spnAmount.getValue().toString()));
        vegetable.setCategory(categoryBLL.getCategoryListByID(Integer.parseInt(cmbCategoryID.getSelectedItem().toString())));
        vegetable.setImage(getImagePath(cmbImage.getSelectedItem().toString()));
        vegetable.setPrice(Float.parseFloat(txtPrice.getText().toString()));
        vegetable.setUnit(txtUnit.getText().toString());
        vegetable.setVegetableName(txtVegetableName.getText().toString());
        
        if(vegetableBLL.addVegetable(vegetable)==0)
        {
            JOptionPane.showMessageDialog(this, "Add new Vegetable success");
        }else{
            JOptionPane.showMessageDialog(this, "Add new Vegetable failed");
        }
        refresh();
        
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        
        refresh();
        
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void cmbCategoryIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCategoryIDActionPerformed
        
        if(cmbCategoryID.getSelectedItem()!=null)
        {   
            Category category=categoryBLL.getCategoryListByID(Integer.parseInt(cmbCategoryID.getSelectedItem().toString()));
            if(category==null)
            {
                JOptionPane.showMessageDialog(this, "Can't load CategoryName");
                return;
            }
            txtCategoryName.setText(category.getName());
        }
        
    }//GEN-LAST:event_cmbCategoryIDActionPerformed

    private void tblVegetableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblVegetableMouseClicked
        
        int SelectedRow=tblVegetable.getSelectedRow();
        
        txtVegetableID.setText(String.valueOf(tblVegetable.getValueAt(SelectedRow, 0)));
        txtVegetableName.setText(String.valueOf(tblVegetable.getValueAt(SelectedRow, 1)));
        cmbCategoryID.setSelectedItem(String.valueOf(tblVegetable.getValueAt(SelectedRow, 2)));
        txtUnit.setText(String.valueOf(tblVegetable.getValueAt(SelectedRow, 4)));
        spnAmount.setValue(tblVegetable.getValueAt(SelectedRow, 5));
        cmbImage.setSelectedItem(getCmbImageSelectedItem(tblVegetable.getValueAt(SelectedRow, 6).toString()));
        txtPrice.setText(String.valueOf(tblVegetable.getValueAt(SelectedRow, 7)));
        
    }//GEN-LAST:event_tblVegetableMouseClicked

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        
        if (txtSearch.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill out the information at the search box");
            return;
        }
        
        //vegID
        if(cmbSearch.getSelectedIndex()==0)
        {
            if(!check.CheckNumber(txtSearch.getText().toString()))
            {
                JOptionPane.showMessageDialog(this, "Search format is incorrect please try again!");
                return;
            }
            loadVegetableByVegetableID(Integer.parseInt(txtSearch.getText().toString()));
            
        }else if(cmbSearch.getSelectedIndex()==1)//vegName
        {
            loadVegetableByVegetableName(txtSearch.getText().toString());
            
        }else if(cmbSearch.getSelectedIndex()==2)//categoryID
        {
            if(!check.CheckNumber(txtSearch.getText().toString()))
            {
                JOptionPane.showMessageDialog(this, "Search format is incorrect please try again!");
                return;
            }
            loadVegetableByCategoryID(Integer.parseInt(txtSearch.getText().toString()));
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        
        int selectedRow = tblVegetable.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "There is no row selected");
            return;
        }
        int vegetableID = (int) tblVegetable.getModel().getValueAt(selectedRow, 0);
        if (vegetableBLL.deleteVegetable(vegetableID) == 0) {
            JOptionPane.showMessageDialog(this, "Delete Vegetable Success!");
        } else {
            JOptionPane.showMessageDialog(this, "Delete Vegetable Failed!");
        }

        refresh();
        
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
       
        int selectedRow = tblVegetable.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "There is no row selected");
            return;
        }
        
        Vegetable vegetable=new Vegetable();
        vegetable.setVegetableID(Integer.parseInt(tblVegetable.getModel().getValueAt(selectedRow, 0).toString()));
        vegetable.setAmount(Integer.parseInt(spnAmount.getValue().toString()));
        vegetable.setCategory(categoryBLL.getCategoryListByID(Integer.parseInt(cmbCategoryID.getSelectedItem().toString())));
        vegetable.setImage(getImagePath(cmbImage.getSelectedItem().toString()));
        vegetable.setPrice(Float.parseFloat(txtPrice.getText().toString()));
        vegetable.setUnit(txtUnit.getText().toString());
        vegetable.setVegetableName(txtVegetableName.getText().toString());
        
        if (vegetableBLL.updateVegetable(vegetable) == 0) {
            JOptionPane.showMessageDialog(this, "Delete Vegetable Success!");
        } else {
            JOptionPane.showMessageDialog(this, "Delete Vegetable Failed!");
        }

        refresh();
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void cmbImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbImageActionPerformed
        
        if(cmbImage.getItemCount()==0)
            return;
        
        image.setIcon(new ImageIcon(getImagePath(cmbImage.getSelectedItem().toString())));
        
    }//GEN-LAST:event_cmbImageActionPerformed

   
   
    
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VegetableGUI().setVisible(true);
            }
        });
    }

    private void refresh()
    {
        loadVegetable();
        txtVegetableID.setText("");
        txtVegetableName.setText("");
        cmbCategoryID.setSelectedIndex(0);
        txtUnit.setText("");
        txtCategoryName.setText("");
        cmbImage.setSelectedIndex(0);
        spnAmount.setValue(0);
        txtPrice.setText("");
    }
    
    private void loadVegetable()
    {
        Object[][] data = vegetableBLL.getVegetable();
        if(data.length==0)
        {
            JOptionPane.showMessageDialog(this, "Vegetable Is Null Or Error Please Try Again");
            return;
        }
        String[] title = {"Vegetable ID","Vegetable Name","Category ID","Category Name" ,"Unit", "Amount", "Images", "Price"};
        DefaultTableModel model = new DefaultTableModel(data, title);
        tblVegetable.setModel(model);
        
        //SetImage
        image.setIcon(new ImageIcon("src/main/resources/images/default.jpg"));
    }
    
    private void loadVegetableByVegetableID(int vegetableID)
    {
        Object[][] data= vegetableBLL.getVegetableByID(vegetableID);
        if(data.length==0)
        {
            JOptionPane.showMessageDialog(this, "Vegetable Is Null Or Error Please Try Again");
            return;
        }
        String[] title = {"Vegetable ID","Vegetable Name","Category ID","Category Name" ,"Unit", "Amount", "Images", "Price"};
        DefaultTableModel model = new DefaultTableModel(data, title);
        tblVegetable.setModel(model);
        
        //SetImage
        image.setIcon(new ImageIcon("src/main/resources/images/default.jpg"));
    }
    
    private void loadVegetableByVegetableName(String vegetableName)
    {
        Object[][] data= vegetableBLL.getVegetableByVegetableName(vegetableName);
        if(data.length==0)
        {
            JOptionPane.showMessageDialog(this, "Vegetable Is Null Or Error Please Try Again");
            return;
        }
        String[] title = {"Vegetable ID","Vegetable Name","Category ID","Category Name" ,"Unit", "Amount", "Images", "Price"};
        DefaultTableModel model = new DefaultTableModel(data, title);
        tblVegetable.setModel(model);
        
        //SetImage
        image.setIcon(new ImageIcon("src/main/resources/images/default.jpg"));
    }
    
    private void loadVegetableByCategoryID(int categoryID)
    {
        Object[][] data= vegetableBLL.getVegetableByCategory(categoryID);
        if(data.length==0)
        {
            JOptionPane.showMessageDialog(this, "Vegetable Is Null Or Error Please Try Again");
            return;
        }
        String[] title = {"Vegetable ID","Vegetable Name","Category ID","Category Name" ,"Unit", "Amount", "Images", "Price"};
        DefaultTableModel model = new DefaultTableModel(data, title);
        tblVegetable.setModel(model);
        
        //SetImage
        image.setIcon(new ImageIcon("src/main/resources/images/default.jpg"));
    }
    
    private void setNumbericSpinner()
    {
        JFormattedTextField txt1 = ((JSpinner.NumberEditor) spnAmount.getEditor()).getTextField();
        ((NumberFormatter) txt1.getFormatter()).setAllowsInvalid(false);
    }
    
    private void setUpCmbCategoryID()
    {
        cmbCategoryID.removeAllItems();
        List<Category> categoryList=categoryBLL.getCategoryList();
        if(categoryList.isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Get Category Error Please Try Again");
            return;
        }
        for(Category category :categoryList)
        {
            cmbCategoryID.addItem(String.valueOf(category.getCategoryID()));
        }
    }
    
    private void setUpCmbSearch()
    {
        cmbSearch.removeAllItems();
        cmbSearch.addItem("Vegetable ID");
        cmbSearch.addItem("Vegetable Name");
        cmbSearch.addItem("Category ID");
    }
    
    private void setUpCmbImage()
    {
        cmbImage.removeAllItems();
        cmbImage.addItem("apple.jpg");
        cmbImage.addItem("broccoli.jpg");
        cmbImage.addItem("celery.jpg");
        cmbImage.addItem("garlic.jpg");
        cmbImage.addItem("potato.jpg");
        cmbImage.addItem("springonion.jpg");
        cmbImage.addItem("tomato.jpg");
        cmbImage.addItem("watermelon.jpg");
        cmbImage.addItem("default.jpg");
    }
    
    private String getCmbImageSelectedItem(String item)
    {
        for(int i=0;i<cmbImage.getItemCount();i++)
        {
            if(item.equalsIgnoreCase(getImagePath(cmbImage.getItemAt(i).toString())))
                return cmbImage.getItemAt(i).toString();
        }
        return cmbImage.getItemAt(cmbImage.getItemCount()-1).toString();
    }
    
    private String getImagePath(String imagePath)
    {
        return "src/main/resources/images/"+imagePath;
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cmbCategoryID;
    private javax.swing.JComboBox<String> cmbImage;
    private javax.swing.JComboBox<String> cmbSearch;
    private javax.swing.JLabel image;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner spnAmount;
    private javax.swing.JTable tblVegetable;
    private javax.swing.JTextField txtCategoryName;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtUnit;
    private javax.swing.JTextField txtVegetableID;
    private javax.swing.JTextField txtVegetableName;
    // End of variables declaration//GEN-END:variables
}
