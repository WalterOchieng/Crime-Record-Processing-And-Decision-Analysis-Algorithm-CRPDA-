
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Se STRANGE W
 */
public class FrmCase extends javax.swing.JFrame {
 Connection conn = null;//name of intialized conn
    PreparedStatement pst = null;
    ResultSet rs = null;
    /**
     * Creates new form frmCase
     */
    public FrmCase() {
        initComponents();
        conn = DatabaseConnection.ConnecrDb();
        
        txtSearch1.setVisible(false);
        btnReport.setVisible(false);
        
        dtbFiled.getJCalendar().setMaxSelectableDate(new Date());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtCaseId = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaOtherDetails = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtIOID = new javax.swing.JTextField();
        txtFIRNo = new javax.swing.JTextField();
        dtbFiled = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        jPanel_Properties = new javax.swing.JPanel();
        lblSearch = new javax.swing.JLabel();
        txt_search = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        txtSearch1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnClear = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnReport = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Case Register");

        jPanel3.setBackground(new java.awt.Color(102, 102, 255));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Case Register");

        jPanel1.setBackground(new java.awt.Color(150, 158, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Case Record Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(0, 0, 153))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(0, 0, 153));
        jPanel1.setFocusable(false);
        jPanel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        txtCaseId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCaseIdKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("OTHER DETAILS:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("FIR NUMBER:");

        txaOtherDetails.setColumns(20);
        txaOtherDetails.setRows(5);
        txaOtherDetails.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txaOtherDetailsKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(txaOtherDetails);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("IO ID:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("CASE ID:");

        txtIOID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIOIDKeyTyped(evt);
            }
        });

        txtFIRNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFIRNoKeyTyped(evt);
            }
        });

        dtbFiled.setDateFormatString("yyyy-MM-dd");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("DATE:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(22, 22, 22)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dtbFiled, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                    .addComponent(txtCaseId)
                    .addComponent(txtIOID)
                    .addComponent(txtFIRNo))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(txtCaseId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtIOID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtFIRNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dtbFiled, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)))
        );

        jPanel_Properties.setBackground(new java.awt.Color(150, 158, 153));
        jPanel_Properties.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Operations", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 12), new java.awt.Color(0, 0, 153))); // NOI18N

        lblSearch.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSearch.setText("Please Type Case ID to Search");

        txt_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_searchKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_searchKeyTyped(evt);
            }
        });

        btnSearch.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSearch.setIcon(new javax.swing.ImageIcon("C:\\CrpdasSystem\\images\\icons\\Search-icon.png")); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_PropertiesLayout = new javax.swing.GroupLayout(jPanel_Properties);
        jPanel_Properties.setLayout(jPanel_PropertiesLayout);
        jPanel_PropertiesLayout.setHorizontalGroup(
            jPanel_PropertiesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_PropertiesLayout.createSequentialGroup()
                .addGroup(jPanel_PropertiesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSearch)
                    .addGroup(jPanel_PropertiesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSearch)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_PropertiesLayout.setVerticalGroup(
            jPanel_PropertiesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_PropertiesLayout.createSequentialGroup()
                .addComponent(lblSearch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_PropertiesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(150, 158, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buttons", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        btnClear.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnClear.setIcon(new javax.swing.ImageIcon("C:\\CrpdasSystem\\images\\icons\\clear.png")); // NOI18N
        btnClear.setText("CLEAR");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnSave.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSave.setIcon(new javax.swing.ImageIcon("C:\\CrpdasSystem\\images\\icons\\Save_icon.png")); // NOI18N
        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\CrpdasSystem\\images\\icons\\delete1.jpg")); // NOI18N
        jButton1.setText("DELETE ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnUpdate.setIcon(new javax.swing.ImageIcon("C:\\CrpdasSystem\\images\\icons\\edit-file-icon.png")); // NOI18N
        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnSave, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClear)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnReport.setText("Report");
        btnReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(txtSearch1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92)
                        .addComponent(jLabel5)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnReport))
                    .addComponent(jPanel_Properties, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSearch1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(137, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 15, Short.MAX_VALUE)
                        .addComponent(jPanel_Properties, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(66, 66, 66))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(btnReport)
                                .addGap(52, 52, 52))))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(835, 413));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        
         if(txtCaseId.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Please Enter  Case Id","CRPDAS",JOptionPane.INFORMATION_MESSAGE);
            txtCaseId.requestFocus();
            
        }
        else  if(txtIOID.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Please Enter Investigation Officer Id ","CRPDAS",JOptionPane.INFORMATION_MESSAGE);
            txtIOID.requestFocus();
            
            
            
        }
         else  if(txtFIRNo.getText().equals("") )
        {
            JOptionPane.showMessageDialog(null,"Please Enter  OBR Number ","CRPDAS",JOptionPane.INFORMATION_MESSAGE);
            txtFIRNo.requestFocus();
           
        }
         
          else  if( dtbFiled.getDate()==null  )// image.getText().isEmpty()
        {
            JOptionPane.showMessageDialog(null,"Please Select Date of Case Registration  ","CRPDAS   Message",JOptionPane.INFORMATION_MESSAGE);
            dtbFiled.requestFocus();
           
        }
        else
          {
              
          
        try {
            String sql = "Insert  into suspectcase(CaseID,IO_ID,FIR_No,other_details,date) values(?,?,?,?,?)";
            pst = conn.prepareStatement(sql);
            
             pst.setString(1, txtCaseId.getText());
            pst.setString(2, txtIOID.getText());
            pst.setString(3, txtFIRNo.getText());
            pst.setString(4, txaOtherDetails.getText());
             pst.setString(5, ((JTextField)dtbFiled.getDateEditor().getUiComponent()).getText());
            
           pst.execute();
            JOptionPane.showMessageDialog(null, "Saved Succesfully");
            
           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

          }
        
    }//GEN-LAST:event_btnSaveActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        
        if(txtCaseId.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Please Type The Case Id you want to delete ");
        }
        else{
            
        
        int n=JOptionPane.showConfirmDialog(null, "Are you sure you want to delete","CRPDAS",JOptionPane.YES_NO_OPTION);
        if(n==JOptionPane.YES_OPTION)
        {        
        
        String sql = "delete from case  where case_id=?";

        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, txtCaseId.getText());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Deleted");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }
        }
        
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_searchKeyReleased

       
    }//GEN-LAST:event_txt_searchKeyReleased

    private void txt_searchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_searchKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_searchKeyTyped

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        
        
         if(txtCaseId.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Please Enter  Case Id","CRPDAS",JOptionPane.INFORMATION_MESSAGE);
            txtCaseId.requestFocus();
            
        }
        else  if(txtIOID.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Please Enter Investigation Officer Id ","CRPDAS",JOptionPane.INFORMATION_MESSAGE);
            txtIOID.requestFocus();
            
            
            
        }
         else  if(txtFIRNo.getText().equals("") )
        {
            JOptionPane.showMessageDialog(null,"Please Enter  OBR Number ","CRPDAS",JOptionPane.INFORMATION_MESSAGE);
            txtFIRNo.requestFocus();
           
        }
         
          else  if( dtbFiled.getDate()==null  )// image.getText().isEmpty()
        {
            JOptionPane.showMessageDialog(null,"Please Select Date of Case Registration  ","CRPDAS   Message",JOptionPane.INFORMATION_MESSAGE);
            dtbFiled.requestFocus();
           
        }
        else
          {
        
          try {

            String value1 = txtCaseId.getText();
            String value2 = txtIOID.getText();
            String value3 = txtFIRNo.getText();
            String value4 = txaOtherDetails.getText();
            String value5=((JTextField)dtbFiled.getDateEditor().getUiComponent()).getText();
            
             String searchn = txtSearch1.getText();
            

            String sql = "update  suspectcase set CaseID='" + value1 + "',IO_ID='" + value2 + "',FIR_No='" + value3 + "',other_details ='" + value4 + "',date='"+value5+"' where CaseID='" + searchn + "' ";
            pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Updated");

        } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
          
          }
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        
         try {
            String sql = "select * from   suspectcase where CaseID =?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, txt_search.getText());

            rs = pst.executeQuery();
            if (rs.next()) {
                String add1 = rs.getString("CaseID");
                txtCaseId.setText(add1);
                String add2 = rs.getString("IO_ID");
                txtIOID.setText(add2);
                String add3 = rs.getString("FIR_No");
                txtFIRNo.setText(add3);
                String add4 = rs.getString("other_details");
                txaOtherDetails.setText(add4);
                
                String dateValue2 = rs.getString("date");
                java.util.Date add9 = new SimpleDateFormat("yyyy-MM-dd").parse(dateValue2);
                dtbFiled.setDate(add9);
                    
                
                String serched = rs.getString("CaseID");
                txtSearch1.setText(serched);

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        
        txtCaseId.setText("");
        txtIOID.setText("");
        txtFIRNo.setText("");
        txaOtherDetails.setText("");
        
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportActionPerformed
        // TODO add your handling code here:
        
        try
        {
          
            
            String report="C:\\Users\\Se STRANGE W\\Documents\\reported\\jailsReports.jrxml";
            
            JasperReport  jr=JasperCompileManager.compileReport(report);
            JasperPrint jp= JasperFillManager.fillReport(jr,null,conn);
            JasperViewer.viewReport(jp);
            
            
            
            
        }
        catch(Exception e)
        {
        }
        
        
    }//GEN-LAST:event_btnReportActionPerformed

    private void txtCaseIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCaseIdKeyTyped
        // TODO add your handling code here:
        
         boolean max= txtCaseId.getText().length()>30;
        if(max)
        {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Limit of charcters reached ","CRPDAS Message",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_txtCaseIdKeyTyped

    private void txtIOIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIOIDKeyTyped
        // TODO add your handling code here:
        
        boolean max= txtCaseId.getText().length()>15;
        if(max)
        {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Limit of charcters reached ","CRPDAS Message",JOptionPane.INFORMATION_MESSAGE);
        }
        
        
        
        if(   (!(Character.isDigit(evt.getKeyChar()))) &&  (!(Character.isSpaceChar(evt.getKeyChar()))) && (evt.getKeyChar()!=KeyEvent.VK_BACK_SPACE)  &&(evt.getKeyChar()!=KeyEvent.VK_DELETE)&& (evt.getKeyChar()!=KeyEvent.VK_ESCAPE)  )
        {
            evt.consume();
            
           JOptionPane.showMessageDialog(null, "Numbers only  i.e 0-9","CRPDAS Message",JOptionPane.INFORMATION_MESSAGE);
            
            
        
        }
    }//GEN-LAST:event_txtIOIDKeyTyped

    private void txtFIRNoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFIRNoKeyTyped
        // TODO add your handling code here:
        
         boolean max= txtCaseId.getText().length()>30;
        if(max)
        {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Limit of charcters reached ","CRPDAS Message",JOptionPane.INFORMATION_MESSAGE);
        }
        
    }//GEN-LAST:event_txtFIRNoKeyTyped

    private void txaOtherDetailsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txaOtherDetailsKeyTyped
        // TODO add your handling code here:
        
         boolean max= txtCaseId.getText().length()>60;
        if(max)
        {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Limit of charcters reached ","CRPDAS Message",JOptionPane.INFORMATION_MESSAGE);
        }
        
    }//GEN-LAST:event_txaOtherDetailsKeyTyped

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
            java.util.logging.Logger.getLogger(FrmCase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCase().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnReport;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private com.toedter.calendar.JDateChooser dtbFiled;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel_Properties;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblSearch;
    private javax.swing.JTextArea txaOtherDetails;
    private javax.swing.JTextField txtCaseId;
    private javax.swing.JTextField txtFIRNo;
    private javax.swing.JTextField txtIOID;
    private javax.swing.JTextField txtSearch1;
    private javax.swing.JTextField txt_search;
    // End of variables declaration//GEN-END:variables
}
