
import com.sun.glass.events.KeyEvent;
import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import net.proteanit.sql.DbUtils;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Se STRANGE W
 */
public class frmVictim extends javax.swing.JFrame {

    Connection conn = null;//name of intialized conn
    PreparedStatement pst = null;
    ResultSet rs = null;
    private String Gender;
    
private ImageIcon format=null;// for image load 
String filename=null;//for attaching images 
int s=0;
byte[]person_image=null;

//public ButtonGroup btng= new ButtonGroup();


    /**
     * Creates new form frmVictim
     */
    public frmVictim() {
        initComponents();
       
        conn = DatabaseConnection.ConnecrDb();//name of the class 
        

        //  Footer=new JLabel("Smart&Little-Burney Productions \u00a9 2016 Email:smarbur@gmail.com");
        
            jDateChooser_DOB.getJCalendar().setMaxSelectableDate(new java.util.Date());
        
       ButtonGroup GenderSelect = new ButtonGroup();
        GenderSelect.add(Male);
        GenderSelect.add(Female);
        
        Update_table();
        
        txtpath.setVisible(false);
        
    }
    
    
    EmailValidator emailValidator = new EmailValidator();
    EphoneValidator ephone= new EphoneValidator();
    
    public void Update_table()
            
    {
        /*
        try{
        String sql="select * from victim ";
        pst=conn.prepareStatement(sql);
        rs=pst.executeQuery();
        jTable_Victim.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch( Exception e )
                {
                    JOptionPane.showMessageDialog(null, e);
                   // JOptionPane.showMessageDialog(null,"Table problem");
                }*/
    }
    
   
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GenderSelect = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lblDOB = new javax.swing.JLabel();
        lblWard = new javax.swing.JLabel();
        txtVicEmail = new javax.swing.JTextField();
        lblVictimIDNo = new javax.swing.JLabel();
        lblLName = new javax.swing.JLabel();
        lblCounty = new javax.swing.JLabel();
        lblLocation = new javax.swing.JLabel();
        txtVicFName = new javax.swing.JTextField();
        txtCounty = new javax.swing.JTextField();
        txtWard = new javax.swing.JTextField();
        txtvicContactNo = new javax.swing.JTextField();
        txtHouseNo = new javax.swing.JTextField();
        lblCoutry = new javax.swing.JLabel();
        lblConditions = new javax.swing.JLabel();
        txtVictimIDNo = new javax.swing.JTextField();
        lblPhoto = new javax.swing.JLabel();
        lblStreatNo = new javax.swing.JLabel();
        txtVicLName = new javax.swing.JTextField();
        txtStreatNo = new javax.swing.JTextField();
        lblContact = new javax.swing.JLabel();
        txtConst = new javax.swing.JTextField();
        lblHouseNo = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblConst = new javax.swing.JLabel();
        lblFName = new javax.swing.JLabel();
        lblSName = new javax.swing.JLabel();
        txtVicSName = new javax.swing.JTextField();
        txtLocation = new javax.swing.JTextField();
        lblGender = new javax.swing.JLabel();
        Male = new javax.swing.JRadioButton();
        Female = new javax.swing.JRadioButton();
        cboCondition = new javax.swing.JComboBox();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        photo = new javax.swing.JLabel();
        jDateChooser_DOB = new com.toedter.calendar.JDateChooser();
        btnAttchImage = new javax.swing.JButton();
        txtpath = new javax.swing.JTextField();
        cboCountry = new javax.swing.JComboBox();
        jPanel_Properties = new javax.swing.JPanel();
        lblSearch = new javax.swing.JLabel();
        txt_search = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        panel1 = new java.awt.Panel();
        btnSave = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        cmd_delete = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        Search = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(153, 0, 0));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel3.setBackground(new java.awt.Color(102, 102, 255));

        jPanel1.setBackground(new java.awt.Color(150, 158, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Victim Person Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(0, 0, 153))); // NOI18N

        lblDOB.setForeground(new java.awt.Color(0, 0, 204));
        lblDOB.setText("DATE OF BIRTH:");

        lblWard.setForeground(new java.awt.Color(0, 0, 204));
        lblWard.setText("WARD:");

        txtVicEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtVicEmailKeyTyped(evt);
            }
        });

        lblVictimIDNo.setBackground(new java.awt.Color(0, 0, 204));
        lblVictimIDNo.setForeground(new java.awt.Color(0, 0, 204));
        lblVictimIDNo.setText("VICTIM ID NO: ");

        lblLName.setForeground(new java.awt.Color(0, 0, 204));
        lblLName.setText("LAST NAME:");

        lblCounty.setForeground(new java.awt.Color(0, 0, 255));
        lblCounty.setText("COUNTY:");

        lblLocation.setForeground(new java.awt.Color(0, 0, 255));
        lblLocation.setText("LOCATION:");

        txtVicFName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtVicFNameKeyTyped(evt);
            }
        });

        txtCounty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCountyKeyTyped(evt);
            }
        });

        txtWard.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtWardKeyTyped(evt);
            }
        });

        txtvicContactNo.setToolTipText("Fill in The Contact Number Starting with +2547..xxxxxx");
        txtvicContactNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtvicContactNoKeyTyped(evt);
            }
        });

        txtHouseNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtHouseNoKeyTyped(evt);
            }
        });

        lblCoutry.setForeground(new java.awt.Color(0, 0, 204));
        lblCoutry.setText("COUNTRY:");

        lblConditions.setForeground(new java.awt.Color(0, 0, 204));
        lblConditions.setText("CONDITIONS:");

        txtVictimIDNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtVictimIDNoKeyTyped(evt);
            }
        });

        lblPhoto.setForeground(new java.awt.Color(0, 0, 204));
        lblPhoto.setText("PHOTO");

        lblStreatNo.setForeground(new java.awt.Color(0, 0, 204));
        lblStreatNo.setText("STREAT NO:");

        txtVicLName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtVicLNameKeyTyped(evt);
            }
        });

        txtStreatNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtStreatNoKeyTyped(evt);
            }
        });

        lblContact.setForeground(new java.awt.Color(0, 0, 204));
        lblContact.setText("CONTACT NO:");

        txtConst.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtConstKeyTyped(evt);
            }
        });

        lblHouseNo.setForeground(new java.awt.Color(0, 0, 204));
        lblHouseNo.setText("HOUSE-NO:");

        lblEmail.setForeground(new java.awt.Color(0, 0, 204));
        lblEmail.setText("EMAIL:");

        lblConst.setForeground(new java.awt.Color(0, 0, 204));
        lblConst.setText("CONSTITUENCY:");

        lblFName.setForeground(new java.awt.Color(0, 0, 204));
        lblFName.setText("FIRST NAME: ");

        lblSName.setForeground(new java.awt.Color(0, 0, 204));
        lblSName.setText("SECOND NAME:");

        txtVicSName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtVicSNameKeyTyped(evt);
            }
        });

        txtLocation.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtLocationKeyTyped(evt);
            }
        });

        lblGender.setForeground(new java.awt.Color(0, 0, 204));
        lblGender.setText("GENDER:");

        Male.setText("MALE");
        Male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaleActionPerformed(evt);
            }
        });

        Female.setText("FEMALE");
        Female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FemaleActionPerformed(evt);
            }
        });

        cboCondition.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Alive", "Dead", "Dead and Chopped in Pieces", "Alive and Hands Cut", "Alive and Cut in Toes", "Alive and a Leg cut", "Sick" }));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(photo, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(photo, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jDesktopPane1.setLayer(photo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jDateChooser_DOB.setDateFormatString("yyyy-MM-dd");

        btnAttchImage.setIcon(new javax.swing.ImageIcon("C:\\Users\\Se STRANGE W\\Documents\\NetBeansProjects\\CRIME MANAGEMENT INFORMATION SYSTEM\\images\\icons\\Attach.png")); // NOI18N
        btnAttchImage.setText("Attch Image");
        btnAttchImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAttchImageActionPerformed(evt);
            }
        });

        cboCountry.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Kenya ", "Uganda", "Tanzania" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblVictimIDNo)
                                .addGap(10, 10, 10)
                                .addComponent(txtVictimIDNo, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblFName)
                                .addGap(18, 18, 18)
                                .addComponent(txtVicFName, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblSName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtVicSName, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblLocation)
                            .addComponent(lblWard)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblConditions)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cboCondition, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblHouseNo)
                                    .addComponent(lblStreatNo)
                                    .addComponent(lblCounty, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtHouseNo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtWard, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtStreatNo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCounty, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblDOB)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jDateChooser_DOB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblLName)
                                    .addComponent(lblGender))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addComponent(Male)
                                        .addGap(33, 33, 33)
                                        .addComponent(Female))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtVicLName, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblContact)
                                    .addComponent(lblEmail))
                                .addGap(21, 21, 21)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtVicEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtvicContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblCoutry)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cboCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lblConst)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtConst, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtpath, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(btnAttchImage)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblPhoto)
                        .addGap(236, 236, 236))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblVictimIDNo)
                            .addComponent(txtVictimIDNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFName)
                            .addComponent(txtVicFName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSName)
                            .addComponent(txtVicSName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtVicLName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblLName)
                                            .addComponent(lblHouseNo)
                                            .addComponent(txtHouseNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(26, 26, 26)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(lblGender)
                                            .addComponent(Male)
                                            .addComponent(Female)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(57, 57, 57)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(lblStreatNo)
                                            .addComponent(txtStreatNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDOB)
                                    .addComponent(jDateChooser_DOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(23, 23, 23))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtCounty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblCounty))
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblContact)
                            .addComponent(txtvicContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEmail)
                            .addComponent(txtVicEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtWard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblWard)
                            .addComponent(lblPhoto))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblLocation))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblConditions)
                                    .addComponent(cboCondition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAttchImage)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCoutry)
                        .addComponent(txtpath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cboCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtConst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblConst))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel_Properties.setBackground(new java.awt.Color(150, 158, 153));
        jPanel_Properties.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Operations", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        lblSearch.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSearch.setForeground(new java.awt.Color(0, 0, 153));
        lblSearch.setText("Search");

        txt_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_searchKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_searchKeyTyped(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(150, 158, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buttons", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Telenor", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        btnSave.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Save_icon.png"))); // NOI18N
        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/edit-file-icon.png"))); // NOI18N
        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUpdate)
                .addContainerGap())
        );

        cmd_delete.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmd_delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/clear.png"))); // NOI18N
        cmd_delete.setText("DELETE");
        cmd_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_deleteActionPerformed(evt);
            }
        });

        btnClear.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/clear.png"))); // NOI18N
        btnClear.setText("CLEAR");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmd_delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClear)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmd_delete)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        Search.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Search-icon.png"))); // NOI18N
        Search.setText("Search");
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_PropertiesLayout = new javax.swing.GroupLayout(jPanel_Properties);
        jPanel_Properties.setLayout(jPanel_PropertiesLayout);
        jPanel_PropertiesLayout.setHorizontalGroup(
            jPanel_PropertiesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_PropertiesLayout.createSequentialGroup()
                .addGroup(jPanel_PropertiesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel_PropertiesLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(lblSearch)))
                .addGap(0, 18, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_PropertiesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel_PropertiesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Search))
                .addGap(27, 27, 27))
        );
        jPanel_PropertiesLayout.setVerticalGroup(
            jPanel_PropertiesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_PropertiesLayout.createSequentialGroup()
                .addComponent(lblSearch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Search)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(152, 152, 152))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Victim Register");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Fill in the Missing Values with null or -");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 684, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel_Properties, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(397, 397, 397)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)))
                .addContainerGap(1192, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(13, 13, 13)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel_Properties, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(906, 555));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        
        
         if(txtVictimIDNo.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Please Enter  the Victim ID","CRPDAS",JOptionPane.INFORMATION_MESSAGE);
            txtVictimIDNo.requestFocus();
            
        }
        else  if(txtVicFName.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Please Enter  First Name ","CRPDAS",JOptionPane.INFORMATION_MESSAGE);
            txtVicFName.requestFocus();
            
            
            
        }
         else  if(txtVicSName.getText().equals("") )
        {
            JOptionPane.showMessageDialog(null,"Please Enter  Second Name  ","CRPDAS",JOptionPane.INFORMATION_MESSAGE);
            txtVicSName.requestFocus();
           
        }
         
          else  if( txtVicLName.getText().equals("")  )// image.getText().isEmpty()
        {
            JOptionPane.showMessageDialog(null,"Please Enter the Last  Name ","CRPDAS",JOptionPane.INFORMATION_MESSAGE);
            txtVicLName.requestFocus();
           
        }
          
          else  if( txtvicContactNo.getText().length()<10 )// image.getText().isEmpty()
        {
            JOptionPane.showMessageDialog(null,"The Contact Number is less than requared","CRPDAS",JOptionPane.INFORMATION_MESSAGE);
            txtvicContactNo.requestFocus();
           
        }
          
          else if(!ephone.validate(txtvicContactNo.getText().trim()))
        {
            
             JOptionPane.showMessageDialog(null,"The Phone Number is Invalid  ","CRPDAS",JOptionPane.INFORMATION_MESSAGE);
            txtvicContactNo.requestFocus();
        }
          
          else  if( txtvicContactNo.getText().equals("")  )// image.getText().isEmpty()
        {
            JOptionPane.showMessageDialog(null,"Please Enter the Contact Number ","CRPDAS",JOptionPane.INFORMATION_MESSAGE);
            txtvicContactNo.requestFocus();
           
        }
          
          else  if( txtVicEmail.getText().equals("")  )// image.getText().isEmpty()
        {
            JOptionPane.showMessageDialog(null,"Please Enter the Email Address ","CRPDAS",JOptionPane.INFORMATION_MESSAGE);
            txtVicEmail.requestFocus();
           
        }
         
          
        else if(!emailValidator.validate(txtVicEmail.getText().trim()))
        {
            
             JOptionPane.showMessageDialog(null,"The Email Address is Invalid  ","CRPDAS",JOptionPane.INFORMATION_MESSAGE);
            txtVicEmail.requestFocus();
        }
       
        else  if( txtpath.getText().equals("")  )// image.getText().isEmpty()
        {
            JOptionPane.showMessageDialog(null,"Please  Select a  Photo for Officer ","CRPDAS",JOptionPane.INFORMATION_MESSAGE);
            txtpath.requestFocus();
           
        }
          
          else  if( jDateChooser_DOB.getDate()==null  )
        {
            JOptionPane.showMessageDialog(null,"Please Select Date of Birth  ","CRPDAS",JOptionPane.INFORMATION_MESSAGE);
            jDateChooser_DOB.requestFocus();
           
        }
          
          
        
         
         else  if( txtConst.getText().equals("")  )
        {
            JOptionPane.showMessageDialog(null,"Please Enter Constituency of Origin","CRPDAS",JOptionPane.INFORMATION_MESSAGE);
            txtConst.requestFocus(); 
        }
         
         else  if( txtWard.getText().equals("")  )
        {
            JOptionPane.showMessageDialog(null,"Please Enter Ward of Origin","CRPDAS",JOptionPane.INFORMATION_MESSAGE);
            txtWard.requestFocus(); 
        }
         
          else  if( txtLocation.getText().equals("")  )
        {
            JOptionPane.showMessageDialog(null,"Please Enter Location of Origin","CRPDAS",JOptionPane.INFORMATION_MESSAGE);
            txtLocation.requestFocus(); 
        }
          
          else  if( txtHouseNo.getText().equals("")  )
        {
            JOptionPane.showMessageDialog(null,"Please Enter House No of Origin","CRPDAS",JOptionPane.INFORMATION_MESSAGE);
            txtHouseNo.requestFocus(); 
        }
          
          else  if( txtStreatNo.getText().equals("")  )
        {
            JOptionPane.showMessageDialog(null,"Please Enter Streat No of Origin","CRPDAS",JOptionPane.INFORMATION_MESSAGE);
            txtStreatNo.requestFocus(); 
        }
          
         else  if( txtCounty.getText().equals("")  )
        {
            JOptionPane.showMessageDialog(null,"Please Enter County of Origin","CRPDAS",JOptionPane.INFORMATION_MESSAGE);
            txtCounty.requestFocus(); 
        } 
          
        
        
        else 
        {
        
        String victim =txtVictimIDNo.getText();
        
       /// if()
        
        try {
            String sql = "Insert  into victim(Victim_ID,FName,SName,LName,Gender,DOB,Contact_No,Email,Country,County,Constituency,Ward,Location,Conditions,House_No,Streat_No,photo)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            pst = conn.prepareStatement(sql);
            
            

            pst.setString(1, txtVictimIDNo.getText());
            pst.setString(2, txtVicFName.getText());
            pst.setString(3, txtVicSName.getText());
            pst.setString(4, txtVicLName.getText());
            
            pst.setString(5, Gender);
         
            pst.setString(6, ((JTextField)jDateChooser_DOB.getDateEditor().getUiComponent()).getText());
           // pst.setString(6, txtDOB.getText());
            pst.setString(7, txtvicContactNo.getText());
            pst.setString(8, txtVicEmail.getText());
           // pst.setString(9, txtVictimCountry.getText());
            
             String values=cboCountry.getSelectedItem().toString();//ComboBox 
            pst.setString(9, values);
            
            pst.setString(10, txtCounty.getText());
            pst.setString(11, txtConst.getText());
            pst.setString(12, txtWard.getText());
            pst.setString(13, txtLocation.getText());
            
            String value=cboCondition.getSelectedItem().toString();//ComboBox 
            pst.setString(14, value);
            
            pst.setString(15, txtHouseNo.getText());
            pst.setString(16, txtStreatNo.getText());
            
          
            
            pst.setBytes(17,person_image);//takes the image from the viarable declared in the form
            

            pst.execute();
            
          

            JOptionPane.showMessageDialog(null, "Saved Succesfully");
            
           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        }

    }//GEN-LAST:event_btnSaveActionPerformed

   
    private void cmd_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_deleteActionPerformed

        
         int n=JOptionPane.showConfirmDialog(null, "Are you sure you want to delete","CRPDAS",JOptionPane.YES_NO_OPTION);
        if(n==JOptionPane.YES_OPTION)
        {
        String sql = "delete from victim where Victim_ID=?";

        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, txtVictimIDNo.getText());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Deleted");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }
        }
    }//GEN-LAST:event_cmd_deleteActionPerformed

    private void txt_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_searchKeyReleased

       
    }//GEN-LAST:event_txt_searchKeyReleased

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
 if(txtVictimIDNo.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Please Enter  the Victim ID","CRPDAS",JOptionPane.INFORMATION_MESSAGE);
            txtVictimIDNo.requestFocus();
            
        }
        else  if(txtVicFName.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Please Enter  First Name ","CRPDAS",JOptionPane.INFORMATION_MESSAGE);
            txtVicFName.requestFocus();
            
            
            
        }
         else  if(txtVicSName.getText().equals("") )
        {
            JOptionPane.showMessageDialog(null,"Please Enter  Second Name  ","CRPDAS",JOptionPane.INFORMATION_MESSAGE);
            txtVicSName.requestFocus();
           
        }
         
          else  if( txtVicLName.getText().equals("")  )// image.getText().isEmpty()
        {
            JOptionPane.showMessageDialog(null,"Please Enter the Last  Name ","CRPDAS",JOptionPane.INFORMATION_MESSAGE);
            txtVicLName.requestFocus();
           
        }
          
          else  if( txtvicContactNo.getText().length()<10 )// image.getText().isEmpty()
        {
            JOptionPane.showMessageDialog(null,"The Contact Number is less than requared","CRPDAS",JOptionPane.INFORMATION_MESSAGE);
            txtvicContactNo.requestFocus();
           
        }
          
          else  if( txtvicContactNo.getText().equals("")  )// image.getText().isEmpty()
        {
            JOptionPane.showMessageDialog(null,"Please Enter the Contact Number ","CRPDAS",JOptionPane.INFORMATION_MESSAGE);
            txtvicContactNo.requestFocus();
           
        }
          
          else  if( txtVicEmail.getText().equals("")  )// image.getText().isEmpty()
        {
            JOptionPane.showMessageDialog(null,"Please Enter the Email Address ","CRPDAS",JOptionPane.INFORMATION_MESSAGE);
            txtVicEmail.requestFocus();
           
        }
         
          
        else if(!emailValidator.validate(txtVicEmail.getText().trim()))
        {
            
             JOptionPane.showMessageDialog(null,"The Email Address is Invalid  ","CRPDAS",JOptionPane.INFORMATION_MESSAGE);
            txtVicEmail.requestFocus();
        }
       
        else  if( txtpath.getText().equals("")  )// image.getText().isEmpty()
        {
            JOptionPane.showMessageDialog(null,"Please  Select a  Photo for Officer ","CRPDAS",JOptionPane.INFORMATION_MESSAGE);
            txtpath.requestFocus();
           
        }
          
          else  if( jDateChooser_DOB.getDate()==null  )
        {
            JOptionPane.showMessageDialog(null,"Please Select Date of Birth  ","CRPDAS",JOptionPane.INFORMATION_MESSAGE);
            jDateChooser_DOB.requestFocus();
           
        }
          
         else  if( txtConst.getText().equals("")  )
        {
            JOptionPane.showMessageDialog(null,"Please Enter Constituency of Origin","CRPDAS",JOptionPane.INFORMATION_MESSAGE);
            txtConst.requestFocus(); 
        }
         
         else  if( txtWard.getText().equals("")  )
        {
            JOptionPane.showMessageDialog(null,"Please Enter Ward of Origin","CRPDAS Message",JOptionPane.INFORMATION_MESSAGE);
            txtWard.requestFocus(); 
        }
         
          else  if( txtLocation.getText().equals("")  )
        {
            JOptionPane.showMessageDialog(null,"Please Enter Location of Origin","CRPDAS Message",JOptionPane.INFORMATION_MESSAGE);
            txtLocation.requestFocus(); 
        }
          
          else  if( txtHouseNo.getText().equals("")  )
        {
            JOptionPane.showMessageDialog(null,"Please Enter House No of Origin","CRPDAS Message",JOptionPane.INFORMATION_MESSAGE);
            txtHouseNo.requestFocus(); 
        }
          
          else  if( txtStreatNo.getText().equals("")  )
        {
            JOptionPane.showMessageDialog(null,"Please Enter Streat No of Origin","CRPDAS",JOptionPane.INFORMATION_MESSAGE);
            txtStreatNo.requestFocus(); 
        }
          
         else  if( txtCounty.getText().equals("")  )
        {
            JOptionPane.showMessageDialog(null,"Please Enter County of Origin","CRPDAS",JOptionPane.INFORMATION_MESSAGE);
            txtCounty.requestFocus(); 
        } 
          
        
        
        else 
        {
        try {

            String value1 = txtVictimIDNo.getText();
            String value2 = txtVicFName.getText();
            String value3 = txtVicSName.getText();
            String value4 = txtVicLName.getText();
            String value5 = Gender;//should be filled 
           //String value6 = txtDOB.getText();
           
         
            
           
            // pst.setString(6, ((JTextField)jDateChooser_DOB.getDateEditor().getUiComponent()).getText());
            String value7 = txtvicContactNo.getText();
            String value8 = txtVicEmail.getText();
            //String value9 = txtVictimCountry.getText();
            String value9=cboCountry.getSelectedItem().toString();
            String value10 = txtCounty.getText();
            String value11 = txtConst.getText();
            String value12 = txtWard.getText();
             String value13 = txtLocation.getText();
            String value14=cboCondition.getSelectedItem().toString();//ComboBox 
           
            String value15 = txtHouseNo.getText();
            String value16 = txtStreatNo.getText();
           String value17=Arrays.toString(person_image);//Stores Image 
           
            
            

            String sql = "update victim set Victim_ID='" + value1 + "',FName='" + value2 + "',SName='" + value3 + "',LName='" + value4 + "',Gender='" + value5 + "',"
                    + "DOB='" + value5 + "',Contact_No='" + value7 + "',Email='" + value8 + "',Country='" + value9 + "',County='" + value10 + "',"
                    + "Constituency='" + value11 + "',Ward='" + value12 + "',Location='" + value13 + "',Conditions='" + value14 + "',House_No='" + value15 + "',Streat_No='" + value16 + "',photo='"+value17+"' where Victim_ID='" + value1 + "' ";
            pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Updated");

        } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void txt_searchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_searchKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_searchKeyTyped

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txtVictimIDNo.setText("");
        txtVicFName.setText("");
        txtVicSName.setText("");
        txtVicLName.setText("");
       // txtGender.setText("");
       // jDateChooser_DOB.setText("");
        txtvicContactNo.setText("");
        txtVicEmail.setText("");
        //txtVictimCountry.setText("");
        txtWard.setText("");
        txtLocation.setText("");
        txtHouseNo.setText("");
        txtStreatNo.setText("");
        txtCounty.setText("");
        txtConst.setText("");
        
        
    }//GEN-LAST:event_btnClearActionPerformed

    private void FemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FemaleActionPerformed
        
        Gender="Female";
    }//GEN-LAST:event_FemaleActionPerformed

    private void MaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaleActionPerformed
        Gender="Male";
    }//GEN-LAST:event_MaleActionPerformed

    private void btnAttchImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAttchImageActionPerformed
       
        JFileChooser chooser=new JFileChooser();
       chooser.showOpenDialog(null);
       File f= chooser.getSelectedFile();
       
       filename=f.getAbsolutePath();// declared at bottom to make the string filename global variable 
       txtpath.setText(filename);
       
       
       Icon icon = new ImageIcon(filename);
            
            photo.setIcon(icon);
       
       try
       { 
           //This convert the image into byte which is later saved into the variable person_image 
           File image = new File(filename);
           FileInputStream fis= new FileInputStream(image);
           
           ByteArrayOutputStream bos=new ByteArrayOutputStream();
           byte[] buf= new byte [1024];
           
           for(int readNum;(readNum=fis.read(buf))!=-1;)
           {
               bos.write(buf,0,readNum);
           }
           
            person_image=bos.toByteArray();//variable for saving image into 
       }
       catch(Exception e)
       {
           JOptionPane.showMessageDialog(null, e);
       }
           
       
       
       /* try
        {
            String sql="select  photo from victim where Victim_ID =4 "; 
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            if(rs.next());
            {
                byte[]imagedata=rs.getBytes("photo");
                format=new ImageIcon(imagedata);
                photo.setIcon(format);
            }
        }
        catch( Exception e)
        {
            e.printStackTrace();
        }  */
    }//GEN-LAST:event_btnAttchImageActionPerformed

    private void txtVictimIDNoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVictimIDNoKeyTyped
       
        
         if(   (!(Character.isDigit(evt.getKeyChar()))) &&  (!(Character.isSpaceChar(evt.getKeyChar()))) && (evt.getKeyChar()!=java.awt.event.KeyEvent.VK_BACK_SPACE)  &&(evt.getKeyChar()!=java.awt.event.KeyEvent.VK_DELETE)&& (evt.getKeyChar()!=java.awt.event.KeyEvent.VK_ESCAPE)  )
        {
            evt.consume();
            
           JOptionPane.showMessageDialog(null, "Numbers only  i.e 0-9","CRPDAS Message",JOptionPane.INFORMATION_MESSAGE);
            
            
        
        }
         
         boolean max= txtVictimIDNo.getText().length()>15;
        if(max)
        {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Limit of charcters reached ","CRPDAS Message",JOptionPane.INFORMATION_MESSAGE);
        }
        
    }//GEN-LAST:event_txtVictimIDNoKeyTyped

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        // TODO add your handling code here:
        
        if(txt_search.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Please Enter  Victim  ID to search","CRPDAS",JOptionPane.INFORMATION_MESSAGE);
            txt_search.requestFocus();
        }
        else 
        {
         try {
            String sql = "select * from   victim where Victim_ID =?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, txt_search.getText());

            rs = pst.executeQuery();
            if (rs.next()) {
                String add1 = rs.getString("Victim_ID");
                txtVictimIDNo.setText(add1);
                String add2 = rs.getString("FName");
                txtVicFName.setText(add2);
                String add3 = rs.getString("SName");
                txtVicSName.setText(add3);
                String add4 = rs.getString("LName");
                txtVicLName.setText(add4);
                
                 String add5 = rs.getString("Gender");
                 if (add5.equals("Female")){
                  Male.setSelected(false);
                 Female.setSelected(true);
                 } else {
                 Female.setSelected(false);
                 Male.setSelected(true);
                }
               
                 
                 String dateValue = rs.getString("DOB"); // What ever column
                java.util.Date add6 = new SimpleDateFormat("yyyy-MM-dd").parse(dateValue);
                jDateChooser_DOB.setDate(add6);
                String add7 = rs.getString("Contact_No");
                txtvicContactNo.setText(add7);
                String add8 = rs.getString("Email");
                txtVicEmail.setText(add8);
                
                String add9=rs.getString("Country");
                cboCountry.setSelectedItem(add9);
                
                String add10 = rs.getString("County");
                txtCounty.setText(add10);
                
                String add11 = rs.getString("Constituency");
                txtConst.setText(add11);
                String add12 = rs.getString("Ward");
                txtWard.setText(add12);
                String add13 = rs.getString("Location");
                txtLocation.setText(add13);
                
                String addcon=rs.getString("Conditions");
                cboCondition.setSelectedItem(addcon);
                                 
                String add15 = rs.getString("House_No");
                txtHouseNo.setText(add15);
                String add16 = rs.getString("Streat_No");
                txtStreatNo.setText(add16);
                
                
                
                byte[]imagedata=rs.getBytes("photo");
                ImageIcon imageicon= new ImageIcon(new ImageIcon(imagedata).getImage().getScaledInstance(photo.getWidth(),photo.getHeight(),Image.SCALE_DEFAULT));
               // format=new ImageIcon(imagedata);
                photo.setIcon(imageicon);
                
                
                
                
                
               //  photo.setSize(300, 100);
                 
                 

            }
            
            else
            {
                JOptionPane.showMessageDialog(null,"The Record has not been found","CRPDAS MEssage",JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        }
    }//GEN-LAST:event_SearchActionPerformed

    private void txtVicFNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVicFNameKeyTyped
        // TODO add your handling code here:
        
        
        boolean max= txtVicFName.getText().length()>20;
        if(max)
        {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Limit of charcters reached ","CRPDAS Message",JOptionPane.INFORMATION_MESSAGE);
        }
        
         if(!(Character.isLetter(evt.getKeyChar())))
        {
            evt.consume();
           
        }
    }//GEN-LAST:event_txtVicFNameKeyTyped

    private void txtVicSNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVicSNameKeyTyped
        // TODO add your handling code here:
        
         boolean max= txtVicSName.getText().length()>20;
        if(max)
        {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Limit of charcters reached ","CRPDAS Message",JOptionPane.INFORMATION_MESSAGE);
        }
        
        
         if(!(Character.isLetter(evt.getKeyChar())))
        {
            evt.consume();
           
        }
    }//GEN-LAST:event_txtVicSNameKeyTyped

    private void txtVicLNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVicLNameKeyTyped
        // TODO add your handling code here:
         if(!(Character.isLetter(evt.getKeyChar())))
        {
            evt.consume();
           
        }
        boolean max= txtVicLName.getText().length()>20;
        if(max)
        {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Limit of charcters reached ","CRPDAS Message",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_txtVicLNameKeyTyped

    private void txtvicContactNoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtvicContactNoKeyTyped
        // TODO add your handling code here:
        
         
        boolean max= txtvicContactNo.getText().length()>12;
        if(max)
        {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Limit of charcters reached ","CRPDAS Message",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_txtvicContactNoKeyTyped

    private void txtVicEmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVicEmailKeyTyped
        // TODO add your handling code here:
        
         
        boolean max= txtVicEmail.getText().length()>30;
        if(max)
        {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Limit of charcters reached ","CRPDAS Message",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_txtVicEmailKeyTyped

    private void txtConstKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConstKeyTyped
               
        
         boolean max= txtConst.getText().length()>30;
        if(max)
        {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Limit of charcters reached ","CRPDAS Message",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_txtConstKeyTyped

    private void txtWardKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtWardKeyTyped
       
        boolean max= txtWard.getText().length()>30;
        if(max)
        {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Limit of charcters reached ","CRPDAS Message",JOptionPane.INFORMATION_MESSAGE);
        }
        
        
         if(!(Character.isLetter(evt.getKeyChar())))
        {
            evt.consume();
           
        }
    }//GEN-LAST:event_txtWardKeyTyped

    private void txtLocationKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLocationKeyTyped
        // TODO add your handling code here:
        
        boolean max= txtLocation.getText().length()>30;
        if(max)
        {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Limit of charcters reached ","CRPDAS Message",JOptionPane.INFORMATION_MESSAGE);
        }
        
         if(!(Character.isLetter(evt.getKeyChar())))
        {
            evt.consume();
           
        }
    }//GEN-LAST:event_txtLocationKeyTyped

    private void txtHouseNoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHouseNoKeyTyped
        // TODO add your handling code here:
        
         boolean max= txtHouseNo.getText().length()>30;
        if(max)
        {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Limit of charcters reached ","CRPDAS Message",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_txtHouseNoKeyTyped

    private void txtStreatNoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtStreatNoKeyTyped
        // TODO add your handling code here:
        
        boolean max= txtStreatNo.getText().length()>15;
        if(max)
        {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Limit of charcters reached ","CRPDAS Message",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_txtStreatNoKeyTyped

    private void txtCountyKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCountyKeyTyped
        // TODO add your handling code here:
        
        boolean max= txtCounty.getText().length()>15;
        if(max)
        {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Limit of charcters reached ","CRPDAS Message",JOptionPane.INFORMATION_MESSAGE);
        }
        
        
         if(!(Character.isLetter(evt.getKeyChar())))
        {
            evt.consume();
           
        }
    }//GEN-LAST:event_txtCountyKeyTyped

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
            java.util.logging.Logger.getLogger(frmVictim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmVictim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmVictim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmVictim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmVictim().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JRadioButton Female;
    private javax.swing.ButtonGroup GenderSelect;
    public javax.swing.JRadioButton Male;
    private javax.swing.JButton Search;
    private javax.swing.JButton btnAttchImage;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    public javax.swing.JComboBox cboCondition;
    private javax.swing.JComboBox cboCountry;
    private javax.swing.JButton cmd_delete;
    public com.toedter.calendar.JDateChooser jDateChooser_DOB;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel_Properties;
    private javax.swing.JLabel lblConditions;
    private javax.swing.JLabel lblConst;
    private javax.swing.JLabel lblContact;
    private javax.swing.JLabel lblCounty;
    private javax.swing.JLabel lblCoutry;
    private javax.swing.JLabel lblDOB;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFName;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblHouseNo;
    private javax.swing.JLabel lblLName;
    private javax.swing.JLabel lblLocation;
    private javax.swing.JLabel lblPhoto;
    private javax.swing.JLabel lblSName;
    private javax.swing.JLabel lblSearch;
    private javax.swing.JLabel lblStreatNo;
    private javax.swing.JLabel lblVictimIDNo;
    private javax.swing.JLabel lblWard;
    private java.awt.Panel panel1;
    private javax.swing.JLabel photo;
    public javax.swing.JTextField txtConst;
    public javax.swing.JTextField txtCounty;
    public javax.swing.JTextField txtHouseNo;
    public javax.swing.JTextField txtLocation;
    public javax.swing.JTextField txtStreatNo;
    public javax.swing.JTextField txtVicEmail;
    public javax.swing.JTextField txtVicFName;
    public javax.swing.JTextField txtVicLName;
    public javax.swing.JTextField txtVicSName;
    public javax.swing.JTextField txtVictimIDNo;
    public javax.swing.JTextField txtWard;
    private javax.swing.JTextField txt_search;
    private javax.swing.JTextField txtpath;
    public javax.swing.JTextField txtvicContactNo;
    // End of variables declaration//GEN-END:variables
}
