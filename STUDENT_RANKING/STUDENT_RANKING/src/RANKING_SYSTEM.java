/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author User
 */

import java.awt.Component;
import java.lang.NumberFormatException;
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
        jtxtsurname = new javax.swing.JTextField();
        jbtnregnumber = new javax.swing.JTextField();
        jtxtfirstname = new javax.swing.JTextField();
        jtxttotalmarks = new javax.swing.JTextField();
        jtxtaverage = new javax.swing.JTextField();
        jtxtc = new javax.swing.JTextField();
        jtxtebiz = new javax.swing.JTextField();
        jtxtmultimedia = new javax.swing.JTextField();
        jtxtsengineering = new javax.swing.JTextField();
        jtxtdatabase = new javax.swing.JTextField();
        jtxtenglish = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jtxtranking = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jbtnRANKING = new javax.swing.JButton();
        TRANSCRIPT = new javax.swing.JButton();
        DELETE = new javax.swing.JButton();
        RESET = new javax.swing.JButton();
        EXIT = new javax.swing.JButton();

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
        jLabel13.setText("S_ENGEERING");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel14.setText("ENGLISH");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel16.setText("C++");

        jtxtsurname.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        jbtnregnumber.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        jtxtfirstname.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        jtxttotalmarks.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        jtxtaverage.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        jtxtc.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jtxtc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtcKeyTyped(evt);
            }
        });

        jtxtebiz.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        jtxtmultimedia.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        jtxtsengineering.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        jtxtdatabase.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        jtxtenglish.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel17.setText("AVERAGE");

        jtxtranking.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(371, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel10))
                        .addGap(51, 51, 51)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxtebiz, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtc, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel14))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxtenglish, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtdatabase, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtmultimedia, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtsengineering, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                                .addComponent(jbtnregnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jtxtfirstname, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jtxtsurname, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jtxttotalmarks, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jtxtaverage, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jtxtranking, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jtxtc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jtxtebiz, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jtxtsengineering, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jtxtmultimedia, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jtxtdatabase, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jtxtenglish, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                            .addComponent(jbtnregnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(jtxtfirstname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(jtxtsurname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(20, 20, 20)
                            .addComponent(jtxttotalmarks, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(jtxtaverage, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(20, 20, 20)
                            .addComponent(jtxtranking, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 62, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 680, 370));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 6));

        jTextArea1.setColumns(20);
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
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 20, 350, 370));

        jTable2.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "REG_NUMBER", "FIRSTNAME", "REG_NUMBER", "C++", "E_BIZ", "S_ENGEERING", "MULTIMEDIA", "DATABASE", "ENGLISH", "TOTAL ", "AVERAGE", "RANKING"
            }
        ));
        jScrollPane3.setViewportView(jTable2);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 1080, 90));

        jbtnRANKING.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtnRANKING.setText("RANKING");
        jbtnRANKING.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRANKINGActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnRANKING, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, -1, -1));

        TRANSCRIPT.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        TRANSCRIPT.setText("TRANSCRIPT");
        TRANSCRIPT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TRANSCRIPTActionPerformed(evt);
            }
        });
        getContentPane().add(TRANSCRIPT, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 510, -1, -1));

        DELETE.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        DELETE.setText("DELETE");
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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RESETActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RESETActionPerformed
 jbtnregnumber.setText(null);
jtxtfirstname.setText(null);
jtxtsurname.setText(null);
jtxttotalmarks.setText(null);
jtxtaverage.setText(null);
jtxtranking.setText(null);
jtxtc.setText(null);
jtxtebiz.setText(null);
jtxtsengineering.setText(null);
jtxtmultimedia.setText(null);
jtxtdatabase.setText(null);
jtxtenglish.setText(null);    
    
    }//GEN-LAST:event_RESETActionPerformed

    private void jbtnRANKINGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRANKINGActionPerformed
       //CREATION OF ARRAY OBJECT TO ACCESS THE MARKS FIELDS
        double[] obj=new double[9];
        //parse() method receives some string as input, "extracts" the necessary information from it and converts it into an object of the calling class.
        obj[0] =Double.parseDouble(jtxtc.getText());
        obj[1] =Double.parseDouble(jtxtebiz.getText());
        obj[2] =Double.parseDouble(jtxtsengineering.getText());
        obj[3] =Double.parseDouble(jtxtmultimedia.getText());
        obj[4] =Double.parseDouble(jtxtdatabase.getText());
        obj[5] =Double.parseDouble(jtxtenglish.getText());
        
        //FORMULA TO ADD UP ALL MARKS OF ONE STUDENT
         obj[6] =obj[0]+obj[1]+obj[2]+obj[3]+obj[4]+obj[5];
         
       //FORMULA TO GET THE AVERAGE OF ONE STUDENT AFTER GETTING THE SUM OR TOTAL
       obj[7] =obj[6]/6;
       
       //OBJECT TO DISPLAY THE TOTAL
       String totalmarks = String.format("%S", obj[6]);
       jtxttotalmarks.setText(totalmarks);
       //OBJECT TO DISPLAY THE AVERAGE MARKS
       
       String average= String.format("%S",obj[7]);
       jtxtaverage.setText(average);
       
       //SET CONDITION TO CONSIDER WHEN RANKING
       
       if(obj[7]>=80)
       {
           jtxtranking.setText("1ST CLASS");
           
       }
       else if(obj[7]>=70)
       {
           jtxtranking.setText("2ND UPPER  CLASS");
           
       }
       else if(obj[7]>=60)
       {
           jtxtranking.setText("2ND LOWER CLASS");
           
       }
       else if(obj[7]>=50)
       {
           jtxtranking.setText("PASS");
           
       }
       else
           if(obj[7]<50)
       {
           jtxtranking.setText("FAIL");
           
       }
       
       DefaultTableModel model= (DefaultTableModel) jTable2.getModel();
       model.addRow(new Object[]{
           
jbtnregnumber.getText(),
jtxtfirstname.getText(),
jtxtsurname.getText(),
jtxttotalmarks.getText(),
jtxtaverage.getText(),
jtxtranking.getText(),
jtxtc.getText(),
jtxtebiz.getText(),
jtxtsengineering.getText(),
jtxtmultimedia.getText(),
jtxtdatabase.getText(),
jtxtenglish.getText()    
 
       });
    }//GEN-LAST:event_jbtnRANKINGActionPerformed

    private void EXITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EXITActionPerformed
       //EXIT BUTTON TO LEAVE FROM THE CURRENT PAGE
        System.exit(0);   
    }//GEN-LAST:event_EXITActionPerformed

    private void TRANSCRIPTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TRANSCRIPTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TRANSCRIPTActionPerformed

    private void jtxtcKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtcKeyTyped
        
    }//GEN-LAST:event_jtxtcKeyTyped

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
    private javax.swing.JButton TRANSCRIPT;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton jbtnRANKING;
    private javax.swing.JTextField jbtnregnumber;
    private javax.swing.JTextField jtxtaverage;
    private javax.swing.JTextField jtxtc;
    private javax.swing.JTextField jtxtdatabase;
    private javax.swing.JTextField jtxtebiz;
    private javax.swing.JTextField jtxtenglish;
    private javax.swing.JTextField jtxtfirstname;
    private javax.swing.JTextField jtxtmultimedia;
    private javax.swing.JTextField jtxtranking;
    private javax.swing.JTextField jtxtsengineering;
    private javax.swing.JTextField jtxtsurname;
    private javax.swing.JTextField jtxttotalmarks;
    // End of variables declaration//GEN-END:variables
}
