
import com.orsonpdf.PDFGraphics2D;
import com.sun.javafx.print.PrinterImpl;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.print.PageFormat;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.print.Printer;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.xy.XYDataItem;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Se STRANGE W
 */
public class frmCharts extends javax.swing.JFrame {

    /**
     * Creates new form frmCharts
     */
    
    XYSeries series;            //series of data that will be added to the graph
XYSeriesCollection dataSet;
JFreeChart chart;
    
     PreparedStatement pst=null;
    ResultSet rs=null;
    Connection conn=null;
    public frmCharts() {
        initComponents();
        conn = DatabaseConnection.ConnecrDb();
        
        
        pnlTexts.setVisible(false);
        btnChart.setVisible(false);
        
        
        series = new XYSeries("Random Numbers");
    dataSet = new XYSeriesCollection(series);
    //chart = ChartFactory.createXYLineChart("Radio Astronomy Graphing", "Time", "Sensor Value", dataSet);
    
   // JFreeChart chartedss = ChartFactory.createXYLineChart("Pie Chart", pieDataset, true, true, true);
    }

    
    /* public void actionPerformed(ActionEvent e) {
         
                final PrintTest pt = new PrintTest();
                
                        PrinterJob pj = PrinterJob.getPrinterJob();
                        PageFormat pf = pj.pageDialog(pj.defaultPage());
                        pj.setPrintable(pt, pf);
                        if (pj.printDialog()) {
                            try {
                                pj.print();
                            } catch (PrinterException pe) {
                                pe.printStackTrace(System.err);
                            }
                        }*/
     
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSearch = new javax.swing.JTable();
        pnlTexts = new javax.swing.JPanel();
        txt6 = new javax.swing.JTextField();
        txt7 = new javax.swing.JTextField();
        txt10 = new javax.swing.JTextField();
        txt4 = new javax.swing.JTextField();
        txt5 = new javax.swing.JTextField();
        txt8 = new javax.swing.JTextField();
        txt11 = new javax.swing.JTextField();
        txt2 = new javax.swing.JTextField();
        txt1 = new javax.swing.JTextField();
        txt3 = new javax.swing.JTextField();
        txt9 = new javax.swing.JTextField();
        txt12 = new javax.swing.JTextField();
        txt13 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        cboYear = new javax.swing.JComboBox();
        btnAnalyze = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnChart = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CHART ANALYSIS");

        jPanel3.setBackground(new java.awt.Color(102, 102, 255));

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
        tblSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSearchMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblSearch);

        pnlTexts.setBackground(new java.awt.Color(204, 204, 255));

        txt6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt6ActionPerformed(evt);
            }
        });

        txt7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt7ActionPerformed(evt);
            }
        });

        txt13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt13ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlTextsLayout = new javax.swing.GroupLayout(pnlTexts);
        pnlTexts.setLayout(pnlTextsLayout);
        pnlTextsLayout.setHorizontalGroup(
            pnlTextsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTextsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt9, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt13, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(286, Short.MAX_VALUE))
        );
        pnlTextsLayout.setVerticalGroup(
            pnlTextsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTextsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTextsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Crime Charts Analysis ");

        jPanel2.setBackground(new java.awt.Color(150, 158, 153));

        cboYear.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        cboYear.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023" }));

        btnAnalyze.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Analyis2.png"))); // NOI18N
        btnAnalyze.setText("Analyze");
        btnAnalyze.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalyzeActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Select Year");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/chart-bar.png"))); // NOI18N
        jButton1.setText("Generate Barchart");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboYear, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAnalyze)
                        .addGap(266, 266, 266))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(206, 206, 206))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAnalyze)
                    .addComponent(cboYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap())
        );

        btnChart.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnChart.setIcon(new javax.swing.ImageIcon("C:\\Users\\Se STRANGE W\\Documents\\NetBeansProjects\\CRIME MANAGEMENT INFORMATION SYSTEM\\images\\icons\\chart-chart.png")); // NOI18N
        btnChart.setText("Generate Chart");
        btnChart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChartActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(222, 222, 222)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(139, 139, 139)
                                .addComponent(btnChart)
                                .addGap(0, 283, Short.MAX_VALUE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(169, 169, 169)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(pnlTexts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnChart))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(pnlTexts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnChartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChartActionPerformed
        // TODO add your handling code here:
        
        
        
        
        
        DefaultPieDataset  pieDataset = new DefaultPieDataset();
        pieDataset.setValue("One", new Integer(10));
        pieDataset.setValue("Two", new Integer(20));
        pieDataset.setValue("Three", new Integer(30));
        pieDataset.setValue("Four", new Integer(40));
        
        
        
        
        
        
       // JFreeChart chart = ChartFactory.createPieChart("Pie Chart", pieDataset, true, true, true);
        
        JFreeChart chart = ChartFactory.createPieChart3D("Pie Chart", pieDataset, true, true, true);
        PiePlot3D P=(PiePlot3D)chart.getPlot();
        ChartFrame frame= new ChartFrame("Pie Chart",chart);
        frame.setVisible(true);
        frame.setSize(700,500);
        
        
    }//GEN-LAST:event_btnChartActionPerformed

    private void btnAnalyzeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnalyzeActionPerformed
        // TODO add your handling code here:
        
        
       try{
            
          String selcyear=(String) cboYear.getSelectedItem();
           
           
           
            
             //String sql = "select COUNT(*) As Crimes_Per_Month FROM  fir where YEAR(Date_Filled)='2017' and  CrimeType='Rape'  GROUP BY MONTH(Date_Filled) ";
             
             String sqls= " SELECT  CrimeType "
                     + ",COUNT( CASE WHEN MONTH(Date_Filled)= 1 THEN 1 ELSE NULL END) January,"
                     + "COUNT( CASE WHEN MONTH(Date_Filled)= 2 THEN 1 ELSE NULL END) February, "
                     + "COUNT( CASE WHEN MONTH(Date_Filled)= 3 THEN 1 ELSE NULL END) March,"
                     + "COUNT( CASE WHEN MONTH(Date_Filled)= 4 THEN 1 ELSE NULL END) April,"
                     + "COUNT( CASE WHEN MONTH(Date_Filled)= 5 THEN 1 ELSE NULL END) May,"
                     + "COUNT( CASE WHEN MONTH(Date_Filled)= 6 THEN 1 ELSE NULL END) June,"
                     + "COUNT( CASE WHEN MONTH(Date_Filled)= 7 THEN 1 ELSE NULL END) July,"
                     + "COUNT( CASE WHEN MONTH(Date_Filled)= 8 THEN 1 ELSE NULL END) August, "
                     + "COUNT( CASE WHEN MONTH(Date_Filled)= 9 THEN 1 ELSE NULL END) September,"
                     + "COUNT( CASE WHEN MONTH(Date_Filled)= 10 THEN 1 ELSE NULL END) October,"
                     + "COUNT( CASE WHEN MONTH(Date_Filled)= 11 THEN 1 ELSE NULL END) November,"
                     + "COUNT( CASE WHEN MONTH(Date_Filled)= 12 THEN 1 ELSE NULL END) December  FROM fir where YEAR(Date_Filled)='"+selcyear+"'  GROUP BY CrimeType";
                 
                 
                     
     
        pst=conn.prepareStatement(sqls);
        rs=pst.executeQuery();
        tblSearch.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch( Exception e )
                {
                    JOptionPane.showMessageDialog(null, e);
                   // JOptionPane.showMessageDialog(null,"Table problem");
                }
        
    }//GEN-LAST:event_btnAnalyzeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        if(txt1.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Please Click one row in the Table Below to be able to generate Bar Chart");
        }
        
        else
        {
            
        
        String value1=txt1.getText();
        String value2=txt2.getText();
        String value3=txt3.getText();
        String value4=txt4.getText();
        String value5=txt5.getText();
        String value6=txt6.getText();
        String value7=txt7.getText();
        String value8=txt8.getText();
        String value9=txt9.getText();
        String value10=txt10.getText();
        String value11=txt11.getText();
        String value12=txt12.getText();
        String value13=txt13.getText();
        
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        
        dataset.setValue(new Double(value2),"Values","January");
        dataset.setValue(new Double(value3),"Values","February");
        dataset.setValue(new Double(value4),"Values","March");
        dataset.setValue(new Double(value5),"Values","April");
        dataset.setValue(new Double(value6),"Values","May");
        dataset.setValue(new Double(value7),"Values","June");
        dataset.setValue(new Double(value8),"Values","July");
        dataset.setValue(new Double(value9),"Values","August");
        dataset.setValue(new Double(value10),"Values","September");
        dataset.setValue(new Double(value11),"Values","October");
        dataset.setValue(new Double(value12),"Values","November");
        dataset.setValue(new Double(value3),"Values","December");
      
        JFreeChart chart = ChartFactory.createBarChart3D("Crime's Yearly Decision Analyis Report:- ("+value1+")  ", "Months", "Crime Level(Persons)", dataset, PlotOrientation.VERTICAL, false, true, false);
        chart.setBackgroundPaint(Color.WHITE);
        chart.getTitle().setPaint(Color.BLUE);
        
        //JButton Save= new JButton("Save");
        
        
        CategoryPlot p= chart.getCategoryPlot();
        p.setRangeGridlinePaint(Color.black);
        ChartFrame frame = new ChartFrame("BAR CHART FOR CRIME ANALYSIS",chart);
        frame.setVisible(true);
       // frame.add(Save);
        //frame.setLocationRelativeTo(null);
        frame.setSize(1200,600);
        
        
        
        
     
}
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tblSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSearchMouseClicked
        // TODO add your handling code here:
        
        try {
            
            int row=tblSearch.getSelectedRow();
            String Table_click=(tblSearch.getModel().getValueAt(row,0).toString());
            txt1.setText(Table_click);
           
             String Table_click1=(tblSearch.getModel().getValueAt(row,1).toString());
            txt2.setText(Table_click1); 
                    
              String Table_click2=(tblSearch.getModel().getValueAt(row,2).toString());
            txt3.setText(Table_click2);         
            
            String Table_click3=(tblSearch.getModel().getValueAt(row,3).toString());
            txt4.setText(Table_click3); 
            
            String Table_click4=(tblSearch.getModel().getValueAt(row,4).toString());
            txt5.setText(Table_click4);  
            
            String Table_click5=(tblSearch.getModel().getValueAt(row,5).toString());
            txt6.setText(Table_click5); 
            
            String Table_click6=(tblSearch.getModel().getValueAt(row,6).toString());
            txt7.setText(Table_click6);  
            
             String Table_click7=(tblSearch.getModel().getValueAt(row,7).toString());
            txt8.setText(Table_click7);
            
            
             String Table_click8=(tblSearch.getModel().getValueAt(row,8).toString());
            txt9.setText(Table_click8);
            
            
             String Table_click9=(tblSearch.getModel().getValueAt(row,9).toString());
            txt10.setText(Table_click9);
            
            
             String Table_click10=(tblSearch.getModel().getValueAt(row,10).toString());
            txt11.setText(Table_click10);
            
             String Table_click11=(tblSearch.getModel().getValueAt(row,11).toString());
            txt12.setText(Table_click11);
            
            
             String Table_click12=(tblSearch.getModel().getValueAt(row,12).toString());
            txt13.setText(Table_click12);
            
            //String Table_click14=(tblSearch.getModel().getValueAt(row,13).toString());
            //txt14.setText(Table_click14);
            
            
            
            
            
            
            
            
            
            
            
        } catch (Exception e) {
        }
        
        
        
    }//GEN-LAST:event_tblSearchMouseClicked

    private void txt7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt7ActionPerformed

    private void txt13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt13ActionPerformed

    private void txt6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt6ActionPerformed

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
            java.util.logging.Logger.getLogger(frmCharts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCharts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCharts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCharts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCharts().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnalyze;
    private javax.swing.JButton btnChart;
    private javax.swing.JComboBox cboYear;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlTexts;
    private javax.swing.JTable tblSearch;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt10;
    private javax.swing.JTextField txt11;
    private javax.swing.JTextField txt12;
    private javax.swing.JTextField txt13;
    private javax.swing.JTextField txt2;
    private javax.swing.JTextField txt3;
    private javax.swing.JTextField txt4;
    private javax.swing.JTextField txt5;
    private javax.swing.JTextField txt6;
    private javax.swing.JTextField txt7;
    private javax.swing.JTextField txt8;
    private javax.swing.JTextField txt9;
    // End of variables declaration//GEN-END:variables
}
