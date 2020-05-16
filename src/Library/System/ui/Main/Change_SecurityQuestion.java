/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Library.System.ui.Main;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Anusuya
 */
public class Change_SecurityQuestion extends javax.swing.JFrame {

    /**
     * Creates new form Change_Password
     */
    int mousepX;
    int mousepY;
    Connection con = null;
    ResultSet rs = null;
    PreparedStatement pst = null;

    public Change_SecurityQuestion() {
        initComponents();
        Connect();
        ShowQuestionAnswer();
        Security_Question.setEditable(false);
        Security_Answer.setEditable(false);
    }

    public void Connect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/slibrary", "root", "");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AddCategory.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void setText(String s) {
        Password.setText(s);
        Security_Question.setText(s);
        Security_Answer.setText(s);
    }

    public void ChangejtextFieldColor() {
        Security_Question.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153), 2));
        Security_Answer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153), 2));
    }

    public void ChangeDefaultjtextFieldColor() {
        Security_Question.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 1));
        Security_Answer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 1));
    }

    public void RequestFocus() {
        Security_Question.requestFocus();

    }

    public void ShowQuestionAnswer() {

        try {
            String QuestionAnswer = "SELECT * FROM `forgotpassword`";
            pst = con.prepareStatement(QuestionAnswer);

            rs = pst.executeQuery();
            while (rs.next()) {
                String QUESTION = rs.getString("SecurityQuestion");
                String ANSWER = rs.getString("Answer");

                Security_Question.setText(QUESTION);
                Security_Answer.setText(ANSWER);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Change_SecurityQuestion.class.getName()).log(Level.SEVERE, null, ex);
        }

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
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        Security_Question = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        Security_Answer = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Exit = new javax.swing.JLabel();
        kButton1 = new keeptoo.KButton();
        Password = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153), 2));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("X");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 0, 20, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Change security question and answer");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, 30));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 750, 10));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("ENTER CURRENT PASSWORD");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, 40));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 760, 10));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Question");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, 40));

        Security_Question.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Security_Question.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)));
        jPanel1.add(Security_Question, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 630, 40));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 750, 10));

        Security_Answer.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Security_Answer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)));
        jPanel1.add(Security_Answer, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 450, 40));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Answer");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, 40));

        Exit.setFont(new java.awt.Font("Jokerman", 1, 24)); // NOI18N
        Exit.setForeground(new java.awt.Color(122, 71, 221));
        Exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Exit.setText("X ");
        Exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitMouseClicked(evt);
            }
        });
        jPanel1.add(Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 40, -1, -1));

        kButton1.setText("UPDATE QUESTION AND ANSWER");
        kButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        kButton1.setkHoverEndColor(new java.awt.Color(0, 51, 255));
        kButton1.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(kButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 320, -1));

        Password.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordActionPerformed(evt);
            }
        });
        Password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PasswordKeyPressed(evt);
            }
        });
        jPanel1.add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 92, 280, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 769, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(769, 454));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_ExitMouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
        this.hide();

    }//GEN-LAST:event_jLabel10MouseClicked

    private void PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_PasswordActionPerformed

    private void PasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PasswordKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            try {
                String CurrentPassword = Password.getText();
                String SelectQuery = "SELECT  `password` FROM `login`";

                pst = con.prepareStatement(SelectQuery);
                rs = pst.executeQuery();
                while (rs.next()) {
                    String Password = rs.getString("password");

                    if (Password.equals(CurrentPassword)) {
                        ChangejtextFieldColor();
                        Security_Question.setEditable(true);
                        Security_Answer.setEditable(true);
                        RequestFocus();
                    } else {
                        JOptionPane.showMessageDialog(null, "You entered incorrect password", "ERROR", JOptionPane.WARNING_MESSAGE);
                        setText("");
                        Security_Question.setEditable(false);
                        Security_Answer.setEditable(false);
                    }
                }

            } catch (SQLException ex) {
                Logger.getLogger(Change_SecurityQuestion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_PasswordKeyPressed

    private void kButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton1ActionPerformed
        try {
            // TODO add your handling code here:
            String question = Security_Question.getText();
            String answer = Security_Answer.getText();

            String ChangeQandAupdateQuery = "UPDATE `forgotpassword` SET `SecurityQuestion`=?,`Answer`=?";
            pst = con.prepareStatement(ChangeQandAupdateQuery);
            pst.setString(1, question);
            pst.setString(2, answer);

            int UpdateQandA = pst.executeUpdate();

            if (UpdateQandA == 1) {
                setText("");
                JOptionPane.showMessageDialog(null, "Setting Updated Successfully", "SUCCESS", JOptionPane.INFORMATION_MESSAGE);
                Security_Question.setText(question);
                Security_Answer.setText(answer);
                ChangeDefaultjtextFieldColor();
                Security_Question.setEditable(false);
                Security_Answer.setEditable(false);

            }
        } catch (SQLException ex) {
            Logger.getLogger(Change_SecurityQuestion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_kButton1ActionPerformed

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        // TODO add your handling code here:
        mousepX = evt.getX();
        mousepY = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        // TODO add your handling code here:
        int coOrdinateX = evt.getXOnScreen();
        int coOrdinateY = evt.getYOnScreen();
        this.setLocation(coOrdinateX - mousepX, coOrdinateY - mousepY);
    }//GEN-LAST:event_jPanel2MouseDragged

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
            java.util.logging.Logger.getLogger(Change_SecurityQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Change_SecurityQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Change_SecurityQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Change_SecurityQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Change_SecurityQuestion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel Exit;
    public javax.swing.JPasswordField Password;
    public javax.swing.JTextField Security_Answer;
    public javax.swing.JTextField Security_Question;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel10;
    public javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel6;
    public javax.swing.JLabel jLabel7;
    public javax.swing.JPanel jPanel1;
    public javax.swing.JPanel jPanel2;
    public javax.swing.JSeparator jSeparator1;
    public javax.swing.JSeparator jSeparator3;
    public javax.swing.JSeparator jSeparator4;
    public javax.swing.JSeparator jSeparator5;
    public keeptoo.KButton kButton1;
    // End of variables declaration//GEN-END:variables
}