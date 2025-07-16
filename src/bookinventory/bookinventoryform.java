package bookinventory;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class bookinventoryform extends javax.swing.JFrame {

    // Connection and PreparedStatement
    private final Connection conn;
    private PreparedStatement pst;
    

    
    public bookinventoryform() {
        initComponents();
        conn = DbConnection.connectDb();
        loadTableData();
    }

    //Method to load data into JTable
    private void loadTableData(){
        String[] columns = {"ID", "Title", "Author", "Category", "Quantity", "Price", "Total"};
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);
        String sql = "SELECT * FROM tablebooks";
        try (Statement stmt = conn.createStatement(); 
                ResultSet rs = stmt.executeQuery(sql)) {
            // Populate the JTable with database records
            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getInt("id"),
                    rs.getString("title"),
                    rs.getString("author"),
                    rs.getString("category"),
                    rs.getInt("quantity"),
                    rs.getDouble("price"),
                    rs.getDouble("total")
                });
            }
            jTableBooks.setModel(model);

        } catch (SQLException e) {
        }
    }
    
    private void resetData(){
        tfNo.setText("");
        tfBooktitle.setText("");
        tfAuthor.setText("");
        cbCategory.setSelectedIndex(0);
        sQuantity.setValue(0);
        tfPrice.setText("");
    }


  
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel0 = new javax.swing.JPanel();
        lNo = new javax.swing.JLabel();
        lQuantity = new javax.swing.JLabel();
        lPrice = new javax.swing.JLabel();
        tfNo = new javax.swing.JTextField();
        tfBooktitle = new javax.swing.JTextField();
        tfPrice = new javax.swing.JTextField();
        lBooktitle = new javax.swing.JLabel();
        lAuthorName = new javax.swing.JLabel();
        sQuantity = new javax.swing.JSpinner();
        tfAuthor = new javax.swing.JTextField();
        lCategory = new javax.swing.JLabel();
        cbCategory = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        btnSave = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableBooks = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        btnClose1 = new javax.swing.JButton();
        btnNew1 = new javax.swing.JButton();
        btnEdit1 = new javax.swing.JButton();
        btnRemove1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CRUD Books Form");

        jPanel0.setBackground(new java.awt.Color(102, 255, 255));
        jPanel0.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Input", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Montserrat", 0, 18))); // NOI18N

        lNo.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        lNo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lNo.setText("No:");

        lQuantity.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        lQuantity.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lQuantity.setText("Quantity:");

        lPrice.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        lPrice.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lPrice.setText("Price:");

        tfNo.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        tfNo.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                tfNoComponentShown(evt);
            }
        });

        tfBooktitle.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N

        tfPrice.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N

        lBooktitle.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        lBooktitle.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lBooktitle.setText("Book Title:");

        lAuthorName.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        lAuthorName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lAuthorName.setText("Author Name:");

        sQuantity.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N

        tfAuthor.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N

        lCategory.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        lCategory.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lCategory.setText("Category:");

        cbCategory.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        cbCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fiction", "Non-Fiction", "Science and Technology", "Academic and Educational", "Children's Books", "History", "Self-Help and Personal Development", "Fantasy and Science Fiction", "Mystery and Thriller", "Arts and Photography" }));

        javax.swing.GroupLayout jPanel0Layout = new javax.swing.GroupLayout(jPanel0);
        jPanel0.setLayout(jPanel0Layout);
        jPanel0Layout.setHorizontalGroup(
            jPanel0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel0Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lQuantity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel0Layout.createSequentialGroup()
                        .addComponent(tfNo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lBooktitle, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfBooktitle, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE))
                    .addGroup(jPanel0Layout.createSequentialGroup()
                        .addGroup(jPanel0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(sQuantity))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lAuthorName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lCategory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfAuthor)
                            .addComponent(cbCategory, 0, 0, Short.MAX_VALUE))
                        .addGap(2, 2, 2)))
                .addContainerGap())
        );
        jPanel0Layout.setVerticalGroup(
            jPanel0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel0Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lNo)
                    .addComponent(tfNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lBooktitle)
                    .addComponent(tfBooktitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lQuantity)
                    .addComponent(lAuthorName)
                    .addComponent(sQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lPrice)
                        .addComponent(tfPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lCategory))
                    .addComponent(cbCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnSave.setBackground(new java.awt.Color(102, 255, 153));
        btnSave.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnClear.setBackground(new java.awt.Color(255, 153, 153));
        btnClear.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(btnSave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnClear)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(102, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Montserrat", 0, 18))); // NOI18N

        jTableBooks.setBackground(new java.awt.Color(102, 204, 255));
        jTableBooks.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTableBooks.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTableBooks.setForeground(new java.awt.Color(255, 255, 255));
        jTableBooks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Title", "Author", "Category", "Quantity", "Price", "Total"
            }
        ));
        jTableBooks.setRowHeight(30);
        jTableBooks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableBooksMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableBooks);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnClose1.setBackground(new java.awt.Color(102, 255, 153));
        btnClose1.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        btnClose1.setText("Close");
        btnClose1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClose1ActionPerformed(evt);
            }
        });

        btnNew1.setBackground(new java.awt.Color(102, 255, 153));
        btnNew1.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        btnNew1.setText("New");
        btnNew1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNew1ActionPerformed(evt);
            }
        });

        btnEdit1.setBackground(new java.awt.Color(51, 204, 255));
        btnEdit1.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        btnEdit1.setText("Edit");
        btnEdit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEdit1ActionPerformed(evt);
            }
        });

        btnRemove1.setBackground(new java.awt.Color(255, 153, 153));
        btnRemove1.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        btnRemove1.setText("Remove");
        btnRemove1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemove1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnNew1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEdit1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnClose1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRemove1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(btnNew1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEdit1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRemove1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addComponent(btnClose1)
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tfNoComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_tfNoComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNoComponentShown

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        String sql = "INSERT INTO tablebooks (id, title, author, category, quantity, price, total) VALUES (?,?,?,?,?,?,?)";
        try {
            pst = conn.prepareStatement(sql);
            // Calculate the new total
            double total = Double.parseDouble(sQuantity.getValue().toString()) * Double.parseDouble(tfPrice.getText());
            // Set the parameters for the query
            pst.setString(1, tfNo.getText());
            pst.setString(2, tfBooktitle.getText());
            pst.setString(3, tfAuthor.getText());
            pst.setString(4, cbCategory.getSelectedItem().toString());
            pst.setDouble(5, Integer.parseInt(sQuantity.getValue().toString()));
            pst.setDouble(6, Double.parseDouble(tfPrice.getText()));
            pst.setDouble(7, total); 
            // Execute the update query
            pst.executeUpdate();
            DefaultTableModel dtm = (DefaultTableModel) jTableBooks.getModel();
            dtm.addRow(new Object[]{
                tfNo.getText(),
                tfBooktitle.getText(),
                tfAuthor.getText(),
                cbCategory.getSelectedItem().toString(),
                sQuantity.getValue().toString(),
                tfPrice.getText(),
                total

            });
            
                JOptionPane.showMessageDialog(this, "Data saved successfully!");
                resetData();          
        } catch (SQLException | NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }      
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        resetData();
        tfNo.requestFocus();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnClose1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClose1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnClose1ActionPerformed

    private void btnNew1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNew1ActionPerformed
        if (isEditing) {
        // Update existing row
        String sql = "UPDATE tablebooks SET title = ?, author = ?, category = ?, quantity = ?, price = ?, total = ? WHERE id = ?";
        
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            
            // Calculate the new total
            double total = Double.parseDouble(sQuantity.getValue().toString()) * Double.parseDouble(tfPrice.getText());
            
            // Set the parameters for the query
            pst.setString(1, tfBooktitle.getText());
            pst.setString(2, tfAuthor.getText());
            pst.setString(3, cbCategory.getSelectedItem().toString());
            pst.setInt(4, Integer.parseInt(sQuantity.getValue().toString()));
            pst.setDouble(5, Double.parseDouble(tfPrice.getText()));
            pst.setDouble(6, total);
            pst.setInt(7, Integer.parseInt(tfNo.getText()));
            
            // Execute the update query
            pst.executeUpdate();
            
            // Update the JTable row with the new data
            DefaultTableModel model = (DefaultTableModel) jTableBooks.getModel();
            model.setValueAt(tfBooktitle.getText(), editingRowIndex, 1);
            model.setValueAt(tfAuthor.getText(), editingRowIndex, 2);
            model.setValueAt(cbCategory.getSelectedItem().toString(), editingRowIndex, 3);
            model.setValueAt(sQuantity.getValue().toString(), editingRowIndex, 4);
            model.setValueAt(tfPrice.getText(), editingRowIndex, 5);
            model.setValueAt(String.valueOf(total), editingRowIndex, 6);
            
            JOptionPane.showMessageDialog(this, "Record updated successfully.");
        } catch (SQLException | NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
        
        // Reset editing state
        isEditing = false;
        editingRowIndex = -1;
    } else {
        // Insert new data
        String sql = "INSERT INTO tablebooks (id, title, author, category, quantity, price, total) VALUES (?, ?, ?, ?, ?, ?, ?)";
        
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            
            // Calculate the total price
            double total = Double.parseDouble(sQuantity.getValue().toString()) * Double.parseDouble(tfPrice.getText());
            
            // Set the parameters for the query
            pst.setString(1, tfNo.getText());
            pst.setString(2, tfBooktitle.getText());
            pst.setString(3, tfAuthor.getText());
            pst.setString(4, cbCategory.getSelectedItem().toString());
            pst.setInt(5, Integer.parseInt(sQuantity.getValue().toString()));
            pst.setDouble(6, Double.parseDouble(tfPrice.getText()));
            pst.setDouble(7, total);
            
            // Execute the insert query
            pst.executeUpdate();
            
            // Add the new data to JTable
            DefaultTableModel model = (DefaultTableModel) jTableBooks.getModel();
            String data[] = {
                tfNo.getText(),
                tfBooktitle.getText(),
                tfAuthor.getText(),
                cbCategory.getSelectedItem().toString(),
                sQuantity.getValue().toString(),
                tfPrice.getText(),
                String.valueOf(total)
            };
            model.addRow(data);
            
            JOptionPane.showMessageDialog(this, "New record added successfully.");
        } catch (SQLException | NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }
    
    // Reset input fields
    resetData();
    }//GEN-LAST:event_btnNew1ActionPerformed

    private void btnRemove1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemove1ActionPerformed
        int selectedRow = jTableBooks.getSelectedRow();
        if (selectedRow != -1) {
            //show confirmation dialog
            int confirmation = JOptionPane.showConfirmDialog(
                    this,
                    "Are you sure you want to delete this record?",
                    "Delete Confirmation",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.WARNING_MESSAGE
            );
            if (confirmation == JOptionPane.YES_OPTION) {
            try {
                // Get the ID of the selected record
                String id = jTableBooks.getValueAt(selectedRow, 0).toString(); // Assuming column 0 is the ID

                // SQL query to delete the record
                String sql = "DELETE FROM tablebooks WHERE id = ?";
                PreparedStatement pst = conn.prepareStatement(sql);
                pst.setString(1, id);
                pst.executeUpdate();

                // Remove the row from the table model
                DefaultTableModel model = (DefaultTableModel) jTableBooks.getModel();
                model.removeRow(selectedRow);

//                JOptionPane.showMessageDialog(this, "Record deleted successfully!");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            // If user selects "No"
//            JOptionPane.showMessageDialog(this, "Deletion cancelled.");
        }
    } else {
        JOptionPane.showMessageDialog(this, "No record selected to delete.", "Warning", JOptionPane.WARNING_MESSAGE);
    }
    }//GEN-LAST:event_btnRemove1ActionPerformed

    private boolean isEditing = false;
    private int editingRowIndex = -1;
    private void btnEdit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEdit1ActionPerformed
        int selectedRow = jTableBooks.getSelectedRow(); // Get the selected row
        if (selectedRow != -1) { // Check if a row is selected
            isEditing = true; // Set editing state to true
            editingRowIndex = selectedRow; // Store the selected row index
        
            // Retrieve data from the selected row
            String id = jTableBooks.getValueAt(selectedRow, 0).toString();
            String title = jTableBooks.getValueAt(selectedRow, 1).toString();
            String author = jTableBooks.getValueAt(selectedRow, 2).toString();
            String category = jTableBooks.getValueAt(selectedRow, 3).toString();
            String quantity = jTableBooks.getValueAt(selectedRow, 4).toString();
            String price = jTableBooks.getValueAt(selectedRow, 5).toString();
        
            // Populate the input fields
            tfNo.setText(id);
            tfBooktitle.setText(title);
            tfAuthor.setText(author);
            cbCategory.setSelectedItem(category);
            sQuantity.setValue(Integer.parseInt(quantity));
            tfPrice.setText(price);
        } else {
            JOptionPane.showMessageDialog(
                this,
                "Please select a row to edit.",
                "No Selection",
                JOptionPane.WARNING_MESSAGE
            );
        }
    }//GEN-LAST:event_btnEdit1ActionPerformed

    private void jTableBooksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableBooksMouseClicked
        int selectedRow = jTableBooks.getSelectedRow();
        if(selectedRow != -1){
            
        }
    }//GEN-LAST:event_jTableBooksMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(bookinventoryform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bookinventoryform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bookinventoryform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bookinventoryform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> 
                new bookinventoryform().setVisible(true));
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnClose1;
    private javax.swing.JButton btnEdit1;
    private javax.swing.JButton btnNew1;
    private javax.swing.JButton btnRemove1;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cbCategory;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel0;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableBooks;
    private javax.swing.JLabel lAuthorName;
    private javax.swing.JLabel lBooktitle;
    private javax.swing.JLabel lCategory;
    private javax.swing.JLabel lNo;
    private javax.swing.JLabel lPrice;
    private javax.swing.JLabel lQuantity;
    private javax.swing.JSpinner sQuantity;
    private javax.swing.JTextField tfAuthor;
    private javax.swing.JTextField tfBooktitle;
    private javax.swing.JTextField tfNo;
    private javax.swing.JTextField tfPrice;
    // End of variables declaration//GEN-END:variables
    

}
