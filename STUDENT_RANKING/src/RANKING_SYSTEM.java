/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author User
 */

import java.awt.Component;
import java.awt.event.KeyEvent;
import java.lang.NumberFormatException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;

public class RANKING_SYSTEM extends javax.swing.JFrame {

    /**
     * Creates new form RANKING_SYSTEM
     */
    public RANKING_SYSTEM() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        surname = new javax.swing.JTextField();
        regnumber = new javax.swing.JTextField();
        firstname = new javax.swing.JTextField();
        totalmarks = new javax.swing.JTextField();
        average = new javax.swing.JTextField();
        c = new javax.swing.JTextField();
        ebiz = new javax.swing.JTextField();
        multimedia = new javax.swing.JTextField();
        sengineering = new javax.swing.JTextField();
        database = new javax.swing.JTextField();
        english = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        ranking = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jbtnRANKING = new javax.swing.JButton();
        jbtntranscript = new javax.swing.JButton();
        DELETE = new javax.swing.JButton();
        RESET = new javax.swing.JButton();
        EXIT = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        save = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 6));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("STUDENT INFORMATION");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("MODULES COVERED");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("REG_NUMBER");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setText("FIRST_NAME");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setText("SURNAME");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setText("TOTAL_MARKS");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setText("RANKING");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel10.setText("E_BIZ");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel11.setText("MULTIMEDIA");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel12.setText("DATABASE");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel13.setText("S_ENGINEERING");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel14.setText("ENGLISH");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel16.setText("C++");

        surname.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        regnumber.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        firstname.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        totalmarks.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        average.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        c.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        c.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cKeyTyped(evt);
            }
        });

        ebiz.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ebiz.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ebizKeyTyped(evt);
            }
        });

        multimedia.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        multimedia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                multimediaKeyTyped(evt);
            }
        });

        sengineering.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        sengineering.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                sengineeringKeyTyped(evt);
            }
        });

        database.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        database.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                databaseKeyTyped(evt);
            }
        });

        english.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        english.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                englishKeyTyped(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel17.setText("AVERAGE");

        ranking.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(344, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel10))
                        .addGap(51, 51, 51)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ebiz, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel14))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(english, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(database, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(multimedia, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sengineering, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(31, 31, 31))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(34, 34, 34)
                            .addComponent(jLabel1)
                            .addGap(117, 117, 117)
                            .addComponent(jLabel2))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(20, 20, 20)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel17)
                                        .addComponent(jLabel7))))
                            .addGap(20, 20, 20)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(regnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(firstname, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(surname, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(totalmarks, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(average, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ranking, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(c, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(ebiz, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(sengineering, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(multimedia, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(database, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(english, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2))
                    .addGap(2, 2, 2)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(8, 8, 8)
                            .addComponent(jLabel4)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel5)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel6)
                            .addGap(8, 8, 8)
                            .addComponent(jLabel17)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel7))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(regnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(firstname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(surname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(20, 20, 20)
                            .addComponent(totalmarks, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(average, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(20, 20, 20)
                            .addComponent(ranking, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 62, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 680, 370));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 6));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 19, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 40, 350, 370));

        jTable2.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "REG_NUMBER", "FIRSTNAME", "SURNAME", "TOTALMARKS", "AVERAGE", "RANKING", "C++", "E_BIZ", "S_ENGINEERING", "MULTIMEDIA", "DATABASE", "ENGLISH"
            }
        ));
        jScrollPane3.setViewportView(jTable2);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 1080, 90));

        jbtnRANKING.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtnRANKING.setText("RANKING");
        jbtnRANKING.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRANKINGActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnRANKING, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, -1, -1));

        jbtntranscript.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtntranscript.setText("TRANSCRIPT");
        jbtntranscript.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtntranscriptActionPerformed(evt);
            }
        });
        getContentPane().add(jbtntranscript, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 510, -1, -1));

        DELETE.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        DELETE.setText("DELETE");
        DELETE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DELETEActionPerformed(evt);
            }
        });
        getContentPane().add(DELETE, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 510, -1, -1));

        RESET.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        RESET.setText("RESET");
        RESET.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RESETActionPerformed(evt);
            }
        });
        getContentPane().add(RESET, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 510, -1, -1));

        EXIT.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        EXIT.setText("EXIT");
        EXIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EXITActionPerformed(evt);
            }
        });
        getContentPane().add(EXIT, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 510, -1, -1));

        jLabel8.setText("STUDENT RECORDS");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, -1, -1));

        jLabel9.setText("DISPLAY RECORDS");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 10, -1, -1));

        save.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        save.setText("SAVE");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        getContentPane().add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 520, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RESETActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RESETActionPerformed
 regnumber.setText(null);
firstname.setText(null);
surname.setText(null);
totalmarks.setText(null);
average.setText(null);
ranking.setText(null);
c.setText(null);
ebiz.setText(null);
sengineering.setText(null);
multimedia.setText(null);
database.setText(null);
english.setText(null);    
    
    }//GEN-LAST:event_RESETActionPerformed

    private void jbtnRANKINGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRANKINGActionPerformed
   
        //CREATION OF ARRAY OBJECT TO ACCESS THE MARKS FIELDS
        double[] obj=new double[9];
        //parse() method receives some string as input, "extracts" the necessary information from it and converts it into an object of the calling class.
        obj[0] =Double.parseDouble(c.getText());
        obj[1] =Double.parseDouble(ebiz.getText());
        obj[2] =Double.parseDouble(sengineering.getText());
        obj[3] =Double.parseDouble(multimedia.getText());
        obj[4] =Double.parseDouble(database.getText());
        obj[5] =Double.parseDouble(english.getText());
        
        //FORMULA TO ADD UP ALL MARKS OF ONE STUDENT
         obj[6] =obj[0]+obj[1]+obj[2]+obj[3]+obj[4]+obj[5];
         
       //FORMULA TO GET THE AVERAGE OF ONE STUDENT AFTER GETTING THE SUM OR TOTAL
       obj[7] =obj[6]/6;
       
       //OBJECT TO DISPLAY THE TOTAL
       String totalmark = String.format("%S", obj[6]);
       totalmarks.setText(totalmark);
       //OBJECT TO DISPLAY THE AVERAGE MARKS
       
       String averagee= String.format("%S",obj[7]);
       average.setText(averagee);
       
       //SET CONDITION TO CONSIDER WHEN RANKING
       
       if(obj[7]>=80)
       {
           ranking.setText("1ST CLASS");
           
       }
       else if(obj[7]>=70)
       {
           ranking.setText("2ND UPPER  CLASS");
           
       }
       else if(obj[7]>=60)
       {
           ranking.setText("2ND LOWER CLASS");
           
       }
       else if(obj[7]>=50)
       {
           ranking.setText("PASS");
           
       }
       else
           if(obj[7]<50)
       {
           ranking.setText("FAIL");
           
       }
       
       DefaultTableModel model= (DefaultTableModel) jTable2.getModel();
       model.addRow(new Object[]{
           
regnumber.getText(),
firstname.getText(),
surname.getText(),
totalmarks.getText(),
average.getText(),
ranking.getText(),
c.getText(),
ebiz.getText(),
sengineering.getText(),
multimedia.getText(),
database.getText(),
english.getText()    
 
       });
       
    }//GEN-LAST:event_jbtnRANKINGActionPerformed

    private void EXITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EXITActionPerformed
       //EXIT BUTTON TO LEAVE FROM THE CURRENT PAGE
        System.exit(0);   
    }//GEN-LAST:event_EXITActionPerformed

    private void jbtntranscriptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtntranscriptActionPerformed
       //THIS IS A TEXT AREA(WITHING PANEL) WHICH IS CREATED IN TRANSCRIPT BUTTON TO DISPLAY INFORMATION
        jTextArea1.append("STUDENT INFORMATION\n"
                +"=================\n"
                +"\nFIRSNAME:\t\t" +firstname.getText()
                +"\nSURNAME:\t\t" +surname.getText()
                +"\nREGNUMBER:\t\t" +regnumber.getText()
                +"\nc++:\t\t" +c.getText() 
                +"\nEBIZ:\t\t" +ebiz.getText()
                +"\nSENGINEERING:\t\t" +sengineering.getText()
                +"\nMULTIMEDIA:\t\t" +multimedia.getText()
                +"\nDATABASE:\t\t" +database.getText()
                +"\nENGLISH:\t\t" +english.getText()
                +"\nTOTALMARKS:\t\t" +totalmarks.getText()
                +"\nAVERAGE:\t\t" +average.getText()
                +"\nRANKING:\t\t" +ranking.getText()
        );
    }//GEN-LAST:event_jbtntranscriptActionPerformed

    private void cKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cKeyTyped
char iNumber = evt.getKeyChar();
if(!(Character.isDigit(iNumber))
    ||(iNumber == KeyEvent.VK_BACK_SPACE)
            ||(iNumber == KeyEvent.VK_DELETE))
{
    evt.consume();
}
    }//GEN-LAST:event_cKeyTyped

    private void ebizKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ebizKeyTyped
        char iNumber = evt.getKeyChar();
if(!(Character.isDigit(iNumber))
    ||(iNumber == KeyEvent.VK_BACK_SPACE)
            ||(iNumber == KeyEvent.VK_DELETE))
{
    evt.consume();
}
    }//GEN-LAST:event_ebizKeyTyped

    private void sengineeringKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sengineeringKeyTyped
        char iNumber = evt.getKeyChar();
if(!(Character.isDigit(iNumber))
    ||(iNumber == KeyEvent.VK_BACK_SPACE)
            ||(iNumber == KeyEvent.VK_DELETE))
{
    evt.consume();
}
    }//GEN-LAST:event_sengineeringKeyTyped

    private void multimediaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_multimediaKeyTyped
        char iNumber = evt.getKeyChar();
if(!(Character.isDigit(iNumber))
    ||(iNumber == KeyEvent.VK_BACK_SPACE)
            ||(iNumber == KeyEvent.VK_DELETE))
{
    evt.consume();
}
    }//GEN-LAST:event_multimediaKeyTyped

    private void databaseKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_databaseKeyTyped
        char iNumber = evt.getKeyChar();
if(!(Character.isDigit(iNumber))
    ||(iNumber == KeyEvent.VK_BACK_SPACE)
            ||(iNumber == KeyEvent.VK_DELETE))
{
    evt.consume();
}
    }//GEN-LAST:event_databaseKeyTyped

    private void englishKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_englishKeyTyped
        char iNumber = evt.getKeyChar();
if(!(Character.isDigit(iNumber))
    ||(iNumber == KeyEvent.VK_BACK_SPACE)
            ||(iNumber == KeyEvent.VK_DELETE))
{
    evt.consume();
}
    }//GEN-LAST:event_englishKeyTyped

    private void DELETEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DELETEActionPerformed
       DefaultTableModel model= (DefaultTableModel) jTable2.getModel();
       if(jTable2.getSelectedRow()==-1)
       {
        if(jTable2.getSelectedRow()==0)
        {
          JOptionPane.showMessageDialog(null,"NO DATA TO DELETE",
          "STUDENT RESULT SYSTEM",JOptionPane.OK_OPTION);
        }
        else
        {
          JOptionPane.showMessageDialog(null,"SELECT A ROW TO DELETE",
           "STUDENT RESULT SYSTEM",JOptionPane.OK_OPTION);
         } }
       
       else
       {
         model.removeRow(jTable2.getSelectedRow());
       }
       
    }//GEN-LAST:event_DELETEActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        try{
    

    String Querry="INSERT INTO `information` (`regnumber`,`firstname`,`surname`,`totalmarks`,`average`,`ranking`,`c`,`ebiz`,`sengineering`,`multimedia`,`database`,`english`) VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
        Connection con=(Connection)
        DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root","" );  
         PreparedStatement pst= (PreparedStatement)con.prepareStatement(Querry);
         
      
         pst.setString(1, regnumber.getText());
       pst.setString(2,firstname.getText());
       pst.setString(3, surname.getText());
       pst.setString(4,totalmarks.getText());
       pst.setString(5, average.getText());
       pst.setString(6,ranking.getText());
       pst.setString(7, c.getText());
       pst.setString(8,ebiz.getText());
       pst.setString(9, sengineering.getText());
       pst.setString(10,multimedia.getText());
       pst.setString(11,database.getText());
       pst.setString(12,english.getText());
       pst.executeUpdate();
       JOptionPane.showMessageDialog(null, "information sent in database");
       
}
catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
    
}
    
    }//GEN-LAST:event_saveActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
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
            java.util.logging.Logger.getLogger(RANKING_SYSTEM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
           java.util.logging.Logger.getLogger(RANKING_SYSTEM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RANKING_SYSTEM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RANKING_SYSTEM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RANKING_SYSTEM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DELETE;
    private javax.swing.JButton EXIT;
    private javax.swing.JButton RESET;
    private javax.swing.JTextField average;
    private javax.swing.JTextField c;
    private javax.swing.JTextField database;
    private javax.swing.JTextField ebiz;
    private javax.swing.JTextField english;
    private javax.swing.JTextField firstname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
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
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton jbtnRANKING;
    private javax.swing.JButton jbtntranscript;
    private javax.swing.JTextField multimedia;
    private javax.swing.JTextField ranking;
    private javax.swing.JTextField regnumber;
    private javax.swing.JButton save;
    private javax.swing.JTextField sengineering;
    private javax.swing.JTextField surname;
    private javax.swing.JTextField totalmarks;
    // End of variables declaration//GEN-END:variables
}
