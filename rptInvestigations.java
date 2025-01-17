
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRTableModelDataSource;
import net.sf.jasperreports.view.JRViewer;
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
public class rptInvestigations extends javax.swing.JFrame {

    /**
     * Creates new form rptInvestigations
     */
    
    PreparedStatement pst=null;
    ResultSet rs=null;
    Connection conn=null;
    private  String currentdate;
    public rptInvestigations() {
        initComponents();
        
        conn = DatabaseConnection.ConnecrDb();
        
        dateFrom.getJCalendar().setMaxSelectableDate(new Date());
        dateFrom1.getJCalendar().setMaxSelectableDate(new Date());
        dateTo.getJCalendar().setMaxSelectableDate(new Date());
        dateTo1.getJCalendar().setMaxSelectableDate(new Date());
        ShowDate();
    }
    
    private void ShowDate()
    {
         Calendar cal=new GregorianCalendar();
        int month=cal.get(Calendar.MONTH);
         int year=cal.get(Calendar.YEAR);
         int day=cal.get(Calendar.DAY_OF_MONTH);
         ((JTextField)dateTo1.getDateEditor().getUiComponent()).setText(year+"-"+(month+1)+"-"+day);
         
        //dateTo1 =(year+"-"+(month+1)+"-"+day);
         // dateTo1.setText(newDate);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        dateTo = new com.toedter.calendar.JDateChooser();
        dateFrom = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        btnGenerateRTable = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblSearch = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btnReport = new javax.swing.JButton();
        txtFilter = new javax.swing.JTextField();
        Singlesch = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        dateFrom1 = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnSearch1 = new javax.swing.JButton();
        btnGenerateRTable1 = new javax.swing.JButton();
        dateTo1 = new com.toedter.calendar.JDateChooser();
        jLabel15 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("INVESTIGATIONS ANALYSIS REPORT");
        setResizable(false);

        jPanel5.setBackground(new java.awt.Color(102, 102, 255));

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search Completed Investigations", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        dateTo.setDateFormatString("yyyy-MM-dd");

        dateFrom.setDateFormatString("yyyy-MM-dd");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("From:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("To:");

        btnSearch.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSearch.setIcon(new javax.swing.ImageIcon("C:\\CrpdasSystem\\images\\icons\\Search-icon.png")); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnGenerateRTable.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnGenerateRTable.setIcon(new javax.swing.ImageIcon("C:\\CrpdasSystem\\images\\icons\\Report1.jpg")); // NOI18N
        btnGenerateRTable.setText("Generate Report From Table");
        btnGenerateRTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerateRTableActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateTo, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnGenerateRTable)
                .addGap(29, 29, 29))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSearch)
                .addGap(68, 68, 68))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(dateFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(dateTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSearch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGenerateRTable))
        );

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));

        tblSearch.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tblSearch);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Generate Single Investigation Report", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        btnReport.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnReport.setIcon(new javax.swing.ImageIcon("C:\\CrpdasSystem\\images\\icons\\Report1.jpg")); // NOI18N
        btnReport.setText("Generate Report ");
        btnReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportActionPerformed(evt);
            }
        });

        Singlesch.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Singlesch.setIcon(new javax.swing.ImageIcon("C:\\CrpdasSystem\\images\\icons\\Search-icon.png")); // NOI18N
        Singlesch.setText("Search");
        Singlesch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SingleschActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txtFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnReport)
                        .addGap(59, 59, 59))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(Singlesch)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Singlesch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnReport))
        );

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search InCompleted Investigations", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        dateFrom1.setDateFormatString("yyyy-MM-dd");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("From:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("To:");

        btnSearch1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSearch1.setIcon(new javax.swing.ImageIcon("C:\\CrpdasSystem\\images\\icons\\Search-icon.png")); // NOI18N
        btnSearch1.setText("Search");
        btnSearch1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearch1ActionPerformed(evt);
            }
        });

        btnGenerateRTable1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnGenerateRTable1.setIcon(new javax.swing.ImageIcon("C:\\CrpdasSystem\\images\\icons\\Report1.jpg")); // NOI18N
        btnGenerateRTable1.setText("Generate Report From Table");
        btnGenerateRTable1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerateRTable1ActionPerformed(evt);
            }
        });

        dateTo1.setDateFormatString("yyyy-MM-dd");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dateFrom1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 60, Short.MAX_VALUE)
                        .addComponent(btnGenerateRTable1)))
                .addGap(29, 29, 29))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(btnSearch1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(55, 55, 55)
                    .addComponent(dateTo1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(56, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(dateFrom1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSearch1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGenerateRTable1))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(54, 54, 54)
                    .addComponent(dateTo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(54, Short.MAX_VALUE)))
        );

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Investigation's Analyis Report");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
public void CurrentDate()
    {
        Calendar cal=new GregorianCalendar();
        int month=cal.get(Calendar.MONTH);
         int year=cal.get(Calendar.YEAR);
         int day=cal.get(Calendar.DAY_OF_MONTH);
         currentdate.equals(year+"-"+(month+1)+"-"+day);
         
         
     
    }
    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
              
        
        java.util.Date jd= dateFrom.getDate();
        java.util.Date jd1=dateTo.getDate();
        if( dateFrom.getDate()==null  )
        {
            JOptionPane.showMessageDialog(null,"Please Select Date of from  ","CRPDAS Message ",JOptionPane.INFORMATION_MESSAGE);
            dateFrom.requestFocus();
           
        }
       else  if( dateTo.getDate()==null  )
        {
            JOptionPane.showMessageDialog(null,"Please Select to   ","CRPDAS Message ",JOptionPane.INFORMATION_MESSAGE);
            dateTo.requestFocus();
           
        }
        else
       {
        
        try{

           
                String sql="select * from investigationrecord   where Date_Of_Completion between  ? and ? and state='Completed' ";
            pst=conn.prepareStatement(sql);
            pst.setDate(1, new java.sql.Date(jd.getTime()));
            pst.setDate(2,new java.sql.Date(jd1.getTime()));
            
            rs=pst.executeQuery();
            tblSearch.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch( Exception e )
        {
            JOptionPane.showMessageDialog(null, e);
            
        }
        
       }

    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnGenerateRTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerateRTableActionPerformed
        // TODO add your handling code here:

            try
            {
                
                //DefaultTableModel
                DefaultTableModel de=(DefaultTableModel) tblSearch.getModel();
                JRTableModelDataSource  datasource = new JRTableModelDataSource(de);
                String  reportsource="C:\\CrpdasSystem\\reported\\rptInvestigationg.jrxml";
                JasperReport  jr=JasperCompileManager.compileReport(reportsource);
                Map<String,Object> params = new HashMap<String, Object>();
                params.put("title1","title2");
                
                JasperPrint jp= JasperFillManager.fillReport(jr,params,datasource);
                //JasperViewer.viewReport(jp);
                
                JFrame frame = new JFrame("Reports");
                frame.getContentPane().add(new JRViewer(jp));
                frame.pack();
                frame.setSize(1000, 650);
                frame.setLocationRelativeTo(this);
                frame.setVisible(true);
                
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,"No record on table . to be displayed...Please Search record before trying generating report\n If Problem persist contact adminstratior ");
                
                //JOptionPane.showMessageDialog(null,e);
            }
            
            

    }//GEN-LAST:event_btnGenerateRTableActionPerformed

    private void btnReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportActionPerformed
        // TODO add your handling code here:

        try
        {

            //DefaultTableModel
            DefaultTableModel de=(DefaultTableModel) tblSearch.getModel();
            JRTableModelDataSource  datasource = new JRTableModelDataSource(de);
            String  reportsource="C:\\CrpdasSystem\\reported\\rptInvestigationg.jrxml";
            JasperReport  jr=JasperCompileManager.compileReport(reportsource);
            Map<String,Object> params = new HashMap<String, Object>();
            params.put("title1","title2");

            JasperPrint jp= JasperFillManager.fillReport(jr,params,datasource);
            //JasperViewer.viewReport(jp);
            
             JFrame frame = new JFrame("Reports");
           frame.getContentPane().add(new JRViewer(jp));
           frame.pack();
           frame.setSize(1000, 650);
           frame.setLocationRelativeTo(this);
           frame.setVisible(true);

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"No record on table . to be displayed...Please Search record before trying generating report\n If Problem persist contact adminstratior ");
        }

    }//GEN-LAST:event_btnReportActionPerformed

    private void btnSearch1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearch1ActionPerformed
        java.util.Date jd= dateFrom1.getDate();
        java.util.Date jd1=dateTo1.getDate();
       
       if( dateFrom1.getDate()==null  )
        {
            JOptionPane.showMessageDialog(null,"Please Select Date of from  ","CRPDAS Message ",JOptionPane.INFORMATION_MESSAGE);
            dateFrom1.requestFocus();
           
        }
       else  if( dateTo1.getDate()==null  )
        {
            JOptionPane.showMessageDialog(null,"Please Select Date to   ","CRPDAS Message ",JOptionPane.INFORMATION_MESSAGE);
            dateTo1.requestFocus();
           
        }
        else
       {
           
        try{

           
                String sql="select * from investigationrecord   where Date_Of_Start between  ? and ? and state='Active' ";
            pst=conn.prepareStatement(sql);
            pst.setDate(1, new java.sql.Date(jd.getTime()));
            pst.setDate(2,new java.sql.Date(jd1.getTime()));
            
            rs=pst.executeQuery();
            tblSearch.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch( Exception e )
        {
            JOptionPane.showMessageDialog(null, e);
            
        }
       }
    }//GEN-LAST:event_btnSearch1ActionPerformed

    private void btnGenerateRTable1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerateRTable1ActionPerformed
        // TODO add your handling code here:
        
        try
        {

            //DefaultTableModel
            DefaultTableModel de=(DefaultTableModel) tblSearch.getModel();
            JRTableModelDataSource  datasource = new JRTableModelDataSource(de);
            String  reportsource="C:\\CrpdasSystem\\reported\\rptInvestigationg.jrxml";
            JasperReport  jr=JasperCompileManager.compileReport(reportsource);
            Map<String,Object> params = new HashMap<String, Object>();
            params.put("title1","title2");

            JasperPrint jp= JasperFillManager.fillReport(jr,params,datasource);
          //  JasperViewer.viewReport(jp);
            
             JFrame frame = new JFrame("Reports");
           frame.getContentPane().add(new JRViewer(jp));
           frame.pack();
           frame.setSize(1000, 650);
           frame.setLocationRelativeTo(this);
           frame.setVisible(true);

        }
        catch(Exception e)
        {
             JOptionPane.showMessageDialog(null,"No record on table . to be displayed...Please Search record before trying generating report\n If Problem persist contact adminstratior ");
        }

    }                                                 

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:

        

    }//GEN-LAST:event_btnGenerateRTable1ActionPerformed

    private void SingleschActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SingleschActionPerformed
        // TODO add your handling code here:
          if(txtFilter.getText().equals(""))
        {
             JOptionPane.showMessageDialog(null,"Type The Investigation Number to Search","CRPDAS Message",JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
        try{
            
             String sql="select * from  investigationrecord  where Inv_RecordNo='"+txtFilter.getText()+"'   ";
            
             
     
        pst=conn.prepareStatement(sql);
        rs=pst.executeQuery();
        tblSearch.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch( Exception e )
                {
                    JOptionPane.showMessageDialog(null, e);
                   // JOptionPane.showMessageDialog(null,"Table problem");
                }
        }
    }//GEN-LAST:event_SingleschActionPerformed

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
            java.util.logging.Logger.getLogger(rptInvestigations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(rptInvestigations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(rptInvestigations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(rptInvestigations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new rptInvestigations().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Singlesch;
    private javax.swing.JButton btnGenerateRTable;
    private javax.swing.JButton btnGenerateRTable1;
    private javax.swing.JButton btnReport;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSearch1;
    private com.toedter.calendar.JDateChooser dateFrom;
    private com.toedter.calendar.JDateChooser dateFrom1;
    private com.toedter.calendar.JDateChooser dateTo;
    private com.toedter.calendar.JDateChooser dateTo1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tblSearch;
    private javax.swing.JTextField txtFilter;
    // End of variables declaration//GEN-END:variables
}
