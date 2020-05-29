/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modul7;

/**
 *
 * @author USER
 */
public class TugasCalculator extends javax.swing.JFrame {

    int firstnum;
    int secondnum;
    int hasil;
    String operasi;

    public TugasCalculator() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jButtonEqual = new javax.swing.JButton();
        btnNol = new javax.swing.JButton();
        btnSatu = new javax.swing.JButton();
        btnDua = new javax.swing.JButton();
        btnTiga = new javax.swing.JButton();
        btnEmpat = new javax.swing.JButton();
        btnLima = new javax.swing.JButton();
        btnEnam = new javax.swing.JButton();
        btnTujuh = new javax.swing.JButton();
        btnDelapan = new javax.swing.JButton();
        btnSembilan = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnTitik = new javax.swing.JButton();
        btnTambah = new javax.swing.JButton();
        btnKurang = new javax.swing.JButton();
        btnKali = new javax.swing.JButton();
        btnBagi = new javax.swing.JButton();
        display = new javax.swing.JTextField();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonEqual.setFont(new java.awt.Font("Montserrat", 0, 24)); // NOI18N
        jButtonEqual.setText("=");
        jButtonEqual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEqualActionPerformed(evt);
            }
        });

        btnNol.setFont(new java.awt.Font("Montserrat", 0, 24)); // NOI18N
        btnNol.setText("0");
        btnNol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNolActionPerformed(evt);
            }
        });

        btnSatu.setFont(new java.awt.Font("Montserrat", 0, 24)); // NOI18N
        btnSatu.setText("1");
        btnSatu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSatuActionPerformed(evt);
            }
        });

        btnDua.setFont(new java.awt.Font("Montserrat", 0, 24)); // NOI18N
        btnDua.setText("2");
        btnDua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDuaActionPerformed(evt);
            }
        });

        btnTiga.setFont(new java.awt.Font("Montserrat", 0, 24)); // NOI18N
        btnTiga.setText("3");
        btnTiga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTigaActionPerformed(evt);
            }
        });

        btnEmpat.setFont(new java.awt.Font("Montserrat", 0, 24)); // NOI18N
        btnEmpat.setText("4");
        btnEmpat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpatActionPerformed(evt);
            }
        });

        btnLima.setFont(new java.awt.Font("Montserrat", 0, 24)); // NOI18N
        btnLima.setText("5");
        btnLima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimaActionPerformed(evt);
            }
        });

        btnEnam.setFont(new java.awt.Font("Montserrat", 0, 24)); // NOI18N
        btnEnam.setText("6");
        btnEnam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnamActionPerformed(evt);
            }
        });

        btnTujuh.setFont(new java.awt.Font("Montserrat", 0, 24)); // NOI18N
        btnTujuh.setText("7");
        btnTujuh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTujuhActionPerformed(evt);
            }
        });

        btnDelapan.setFont(new java.awt.Font("Montserrat", 0, 24)); // NOI18N
        btnDelapan.setText("8");
        btnDelapan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelapanActionPerformed(evt);
            }
        });

        btnSembilan.setFont(new java.awt.Font("Montserrat", 0, 24)); // NOI18N
        btnSembilan.setText("9");
        btnSembilan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSembilanActionPerformed(evt);
            }
        });

        btnClear.setFont(new java.awt.Font("Montserrat", 0, 24)); // NOI18N
        btnClear.setText("C");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnTitik.setFont(new java.awt.Font("Montserrat", 0, 24)); // NOI18N
        btnTitik.setText(".");
        btnTitik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTitikActionPerformed(evt);
            }
        });

        btnTambah.setFont(new java.awt.Font("Montserrat", 0, 24)); // NOI18N
        btnTambah.setText("+");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnKurang.setFont(new java.awt.Font("Montserrat", 0, 24)); // NOI18N
        btnKurang.setText("-");
        btnKurang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKurangActionPerformed(evt);
            }
        });

        btnKali.setFont(new java.awt.Font("Montserrat", 0, 24)); // NOI18N
        btnKali.setText("*");
        btnKali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKaliActionPerformed(evt);
            }
        });

        btnBagi.setFont(new java.awt.Font("Montserrat", 0, 24)); // NOI18N
        btnBagi.setText("/");
        btnBagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBagiActionPerformed(evt);
            }
        });

        display.setFont(new java.awt.Font("Montserrat", 0, 24)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(display)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnTujuh)
                                            .addComponent(btnEmpat)
                                            .addComponent(btnSatu))
                                        .addGap(21, 21, 21)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnDelapan)
                                            .addComponent(btnLima)
                                            .addComponent(btnDua)))
                                    .addComponent(btnNol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(btnTitik, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButtonEqual, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnClear, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnTambah, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnKurang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnKali, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBagi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSembilan, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnEnam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnTiga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(display, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTujuh)
                    .addComponent(btnDelapan)
                    .addComponent(btnSembilan)
                    .addComponent(btnBagi))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEmpat)
                    .addComponent(btnLima)
                    .addComponent(btnEnam)
                    .addComponent(btnKali))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSatu)
                    .addComponent(btnDua)
                    .addComponent(btnTiga)
                    .addComponent(btnKurang))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNol)
                    .addComponent(btnTambah)
                    .addComponent(btnTitik))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonEqual)
                    .addComponent(btnClear))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEqualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEqualActionPerformed
        secondnum=Integer.parseInt(display.getText());
       if(operasi.equals("+"))
           hasil = firstnum+secondnum;
       if(operasi.equals("-"))
           hasil = firstnum-secondnum;
       if(operasi.equals("/"))
           hasil = firstnum/secondnum;
       if(operasi.equals("*"))
           hasil = firstnum*secondnum;
       display.setText(hasil+ "");
    }//GEN-LAST:event_jButtonEqualActionPerformed

    
    private void btnKaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKaliActionPerformed
        firstnum = Integer.parseInt(display.getText());
        display.setText("");
        operasi = "*";    }//GEN-LAST:event_btnKaliActionPerformed

    private void btnNolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNolActionPerformed
        String Enternumber = display.getText()+btnNol.getText();
        display.setText(Enternumber);

    }//GEN-LAST:event_btnNolActionPerformed

    private void btnSatuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSatuActionPerformed
        String Enternumber = display.getText()+btnSatu.getText();
        display.setText(Enternumber);

    }//GEN-LAST:event_btnSatuActionPerformed

    private void btnDuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDuaActionPerformed
        String Enternumber = display.getText()+btnDua.getText();
        display.setText(Enternumber);

    }//GEN-LAST:event_btnDuaActionPerformed

    private void btnTigaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTigaActionPerformed
        String Enternumber = display.getText()+btnTiga.getText();
        display.setText(Enternumber);

    }//GEN-LAST:event_btnTigaActionPerformed

    private void btnEmpatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpatActionPerformed
        String Enternumber = display.getText()+btnEmpat.getText();
        display.setText(Enternumber);

    }//GEN-LAST:event_btnEmpatActionPerformed

    private void btnLimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimaActionPerformed
        String Enternumber = display.getText()+btnLima.getText();
        display.setText(Enternumber);

    }//GEN-LAST:event_btnLimaActionPerformed

    private void btnEnamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnamActionPerformed
        String Enternumber = display.getText()+btnEnam.getText();
        display.setText(Enternumber);

    }//GEN-LAST:event_btnEnamActionPerformed

    private void btnTujuhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTujuhActionPerformed
        String Enternumber = display.getText()+btnTujuh.getText();
        display.setText(Enternumber);

    }//GEN-LAST:event_btnTujuhActionPerformed

    private void btnDelapanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelapanActionPerformed
        String Enternumber = display.getText()+btnDelapan.getText();
        display.setText(Enternumber);

    }//GEN-LAST:event_btnDelapanActionPerformed

    private void btnSembilanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSembilanActionPerformed
        String Enternumber = display.getText()+btnSembilan.getText();
        display.setText(Enternumber);

    }//GEN-LAST:event_btnSembilanActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        firstnum = Integer.parseInt(display.getText());
        display.setText("");
        operasi = "+";
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnKurangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKurangActionPerformed
        firstnum = Integer.parseInt(display.getText());
        display.setText("");
        operasi = "-";
    }//GEN-LAST:event_btnKurangActionPerformed

    private void btnBagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBagiActionPerformed
        firstnum = Integer.parseInt(display.getText());
        display.setText("");
        operasi = "/";
    }//GEN-LAST:event_btnBagiActionPerformed

    private void btnTitikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTitikActionPerformed
        String Enternumber = display.getText()+btnTitik.getText();
        display.setText(Enternumber);
    }//GEN-LAST:event_btnTitikActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        secondnum = 0;
        display.setText("");

    }//GEN-LAST:event_btnClearActionPerformed

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
            java.util.logging.Logger.getLogger(TugasCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TugasCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TugasCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TugasCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TugasCalculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBagi;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelapan;
    private javax.swing.JButton btnDua;
    private javax.swing.JButton btnEmpat;
    private javax.swing.JButton btnEnam;
    private javax.swing.JButton btnKali;
    private javax.swing.JButton btnKurang;
    private javax.swing.JButton btnLima;
    private javax.swing.JButton btnNol;
    private javax.swing.JButton btnSatu;
    private javax.swing.JButton btnSembilan;
    private javax.swing.JButton btnTambah;
    private javax.swing.JButton btnTiga;
    private javax.swing.JButton btnTitik;
    private javax.swing.JButton btnTujuh;
    private javax.swing.JTextField display;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonEqual;
    // End of variables declaration//GEN-END:variables

}
