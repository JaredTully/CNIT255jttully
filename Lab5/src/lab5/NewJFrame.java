/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import javax.swing.JOptionPane;
import javax.swing.JFrame;

/**
 *
 * @author Jared
 */
public class NewJFrame extends javax.swing.JFrame {

    double num1 = 1;
    double num2 = 1;
    double product = 0;
    int x = 1;
    int switchControl = 0;
    
    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        
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

        textField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        button_2 = new javax.swing.JButton();
        button_3 = new javax.swing.JButton();
        button_4 = new javax.swing.JButton();
        button_5 = new javax.swing.JButton();
        button_6 = new javax.swing.JButton();
        button_7 = new javax.swing.JButton();
        button_8 = new javax.swing.JButton();
        button_9 = new javax.swing.JButton();
        button_decimal = new javax.swing.JButton();
        button_0 = new javax.swing.JButton();
        button_posNeg = new javax.swing.JButton();
        button_add = new javax.swing.JButton();
        button_divide = new javax.swing.JButton();
        button_minus = new javax.swing.JButton();
        button_modulus = new javax.swing.JButton();
        button_multiply = new javax.swing.JButton();
        button_sqrt = new javax.swing.JButton();
        button_equals = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        exitButton = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        aboutBotton = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        textField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldActionPerformed(evt);
            }
        });

        jButton1.setText("1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        button_2.setText("2");
        button_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_2ActionPerformed(evt);
            }
        });

        button_3.setText("3");
        button_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_3ActionPerformed(evt);
            }
        });

        button_4.setText("4");
        button_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_4ActionPerformed(evt);
            }
        });

        button_5.setText("5");
        button_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_5ActionPerformed(evt);
            }
        });

        button_6.setText("6");
        button_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_6ActionPerformed(evt);
            }
        });

        button_7.setText("7");
        button_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_7ActionPerformed(evt);
            }
        });

        button_8.setText("8");
        button_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_8ActionPerformed(evt);
            }
        });

        button_9.setText("9");
        button_9.setToolTipText("");
        button_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_9ActionPerformed(evt);
            }
        });

        button_decimal.setText(".");
        button_decimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_decimalActionPerformed(evt);
            }
        });

        button_0.setText("0");
        button_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_0ActionPerformed(evt);
            }
        });

        button_posNeg.setText("+/-");
        button_posNeg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_posNegActionPerformed(evt);
            }
        });

        button_add.setText("+");
        button_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_addActionPerformed(evt);
            }
        });

        button_divide.setText("/");
        button_divide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_divideActionPerformed(evt);
            }
        });

        button_minus.setText("-");
        button_minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_minusActionPerformed(evt);
            }
        });

        button_modulus.setText("%");
        button_modulus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_modulusActionPerformed(evt);
            }
        });

        button_multiply.setText("*");
        button_multiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_multiplyActionPerformed(evt);
            }
        });

        button_sqrt.setText("sqrt");
        button_sqrt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_sqrtActionPerformed(evt);
            }
        });

        button_equals.setText("=");
        button_equals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_equalsActionPerformed(evt);
            }
        });

        jMenu1.setText("File");

        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
        jMenu1.add(exitButton);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        aboutBotton.setText("About");
        aboutBotton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutBottonActionPerformed(evt);
            }
        });
        jMenu2.add(aboutBotton);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textField)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(button_2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(button_4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(button_7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(button_8, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                                    .addComponent(button_5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(button_decimal, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(button_0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(button_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(button_6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(button_9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(button_posNeg, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(button_minus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(button_add, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                            .addComponent(button_multiply, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(button_divide, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                            .addComponent(button_modulus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(button_sqrt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(button_equals, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(button_2)
                    .addComponent(button_3)
                    .addComponent(button_add)
                    .addComponent(button_divide))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_5)
                    .addComponent(button_4)
                    .addComponent(button_6)
                    .addComponent(button_minus)
                    .addComponent(button_modulus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_7)
                    .addComponent(button_8)
                    .addComponent(button_9)
                    .addComponent(button_multiply)
                    .addComponent(button_sqrt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_decimal)
                    .addComponent(button_0)
                    .addComponent(button_posNeg)
                    .addComponent(button_equals))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldActionPerformed

    private void button_divideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_divideActionPerformed
        
        String temp = textField.getText();
        num1 = Double.valueOf(temp);
        x = 2;
        textField.setText("");
        switchControl = 2;
        
    }//GEN-LAST:event_button_divideActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (x == 2){
            textField.setText("");
            x = 1;
        }
        String temp = (textField.getText()).concat("1");
        textField.setText(temp);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void button_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_2ActionPerformed
        if (x == 2){
            textField.setText("");
            x = 1;
        }
        String temp = (textField.getText()).concat("2");
        textField.setText(temp);
    }//GEN-LAST:event_button_2ActionPerformed

    private void button_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_3ActionPerformed
        if (x == 2){
            textField.setText("");
            x = 1;
        }
        String temp = (textField.getText()).concat("3");
        textField.setText(temp);
    }//GEN-LAST:event_button_3ActionPerformed

    private void button_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_4ActionPerformed
        if (x == 2){
            textField.setText("");
            x = 1;
        }
        String temp = (textField.getText()).concat("4");
        textField.setText(temp);
    }//GEN-LAST:event_button_4ActionPerformed

    private void button_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_5ActionPerformed
        if (x == 2){
            textField.setText("");
            x = 1;
        }
        String temp = (textField.getText()).concat("5");
        textField.setText(temp);
    }//GEN-LAST:event_button_5ActionPerformed

    private void button_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_6ActionPerformed
        if (x == 2){
            textField.setText("");
            x = 1;
        }
        String temp = (textField.getText()).concat("6");
        textField.setText(temp);
    }//GEN-LAST:event_button_6ActionPerformed

    private void button_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_7ActionPerformed
        if (x == 2){
            textField.setText("");
            x = 1;
        }
        String temp = (textField.getText()).concat("7");
        textField.setText(temp);
    }//GEN-LAST:event_button_7ActionPerformed

    private void button_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_8ActionPerformed
        if (x == 2){
            textField.setText("");
            x = 1;
        }
        String temp = (textField.getText()).concat("8");
        textField.setText(temp);
    }//GEN-LAST:event_button_8ActionPerformed

    private void button_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_9ActionPerformed
        if (x == 2){
            textField.setText("");
            x = 1;
        }
        String temp = (textField.getText()).concat("9");
        textField.setText(temp);
    }//GEN-LAST:event_button_9ActionPerformed

    private void button_decimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_decimalActionPerformed
        String temp = (textField.getText()).concat(".");
        textField.setText(temp);
    }//GEN-LAST:event_button_decimalActionPerformed

    private void button_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_0ActionPerformed
        String temp = (textField.getText()).concat("0");
        textField.setText(temp);
    }//GEN-LAST:event_button_0ActionPerformed

    private void button_posNegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_posNegActionPerformed
        
        String temp = textField.getText();
        String firstChar = temp.substring(0, (temp.length() +1 - temp.length()));
                
        if (firstChar.equals("-")){
            String plus = "+";
            temp = plus.concat(temp.substring(1, temp.length()));
            textField.setText(temp);
        }
        
        else if (firstChar.equals("+")){
            String minus = "1";
            temp = minus.concat(temp.substring(1, temp.length()));
            textField.setText(temp);
        }
        
        else {
            String minus = "-";
            temp = minus.concat(temp);
            textField.setText(temp);
        }
        
    }//GEN-LAST:event_button_posNegActionPerformed

    private void button_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_addActionPerformed
        
        String temp = textField.getText();
        num1 = Double.valueOf(temp);
        x = 2;
        textField.setText("");
        switchControl = 1;
    }//GEN-LAST:event_button_addActionPerformed

    private void button_equalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_equalsActionPerformed
        
        num2 = Double.valueOf(textField.getText());
        
        switch (switchControl){
            
            case 1: product = num1 + num2;
                    break;
            case 2: product = num1 / num2;
                    break;
            case 3: product = num1 - num2;
                    break;
            case 4: product = num1 % num2;
                    break;
            case 5: product = num1 * num2;
                    break;

        }
        
        num1 = 1;
        num2 = 1;
        x = 2;
        textField.setText(Double.toString(product));
        
    }//GEN-LAST:event_button_equalsActionPerformed

    private void button_minusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_minusActionPerformed
        String temp = textField.getText();
        num1 = Double.valueOf(temp);
        x = 2;
        textField.setText("");
        switchControl = 3;
    }//GEN-LAST:event_button_minusActionPerformed

    private void button_modulusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_modulusActionPerformed
        String temp = textField.getText();
        num1 = Double.valueOf(temp);
        x = 2;
        textField.setText("");
        switchControl = 4;
    }//GEN-LAST:event_button_modulusActionPerformed

    private void button_multiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_multiplyActionPerformed
        String temp = textField.getText();
        num1 = Double.valueOf(temp);
        x = 2;
        textField.setText("");
        switchControl = 5;
    }//GEN-LAST:event_button_multiplyActionPerformed

    private void button_sqrtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_sqrtActionPerformed
        String temp = textField.getText();
        Double numTemp = Double.valueOf(temp);
        
        x = 2;
        
        textField.setText(Double.toString(Math.sqrt(numTemp)));
        
    }//GEN-LAST:event_button_sqrtActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void aboutBottonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutBottonActionPerformed
        JFrame frame = new JFrame("");
        JOptionPane.showMessageDialog(frame, "Jared Tully");
    }//GEN-LAST:event_aboutBottonActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutBotton;
    private javax.swing.JButton button_0;
    private javax.swing.JButton button_2;
    private javax.swing.JButton button_3;
    private javax.swing.JButton button_4;
    private javax.swing.JButton button_5;
    private javax.swing.JButton button_6;
    private javax.swing.JButton button_7;
    private javax.swing.JButton button_8;
    private javax.swing.JButton button_9;
    private javax.swing.JButton button_add;
    private javax.swing.JButton button_decimal;
    private javax.swing.JButton button_divide;
    private javax.swing.JButton button_equals;
    private javax.swing.JButton button_minus;
    private javax.swing.JButton button_modulus;
    private javax.swing.JButton button_multiply;
    private javax.swing.JButton button_posNeg;
    private javax.swing.JButton button_sqrt;
    private javax.swing.JMenuItem exitButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JTextField textField;
    // End of variables declaration//GEN-END:variables
}
