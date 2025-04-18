/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package SuitElemenGame;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/**
 *
 * @author rizal
 */
public class HalPemain1 extends javax.swing.JFrame {
    public static Pemain pemain1;
    public static Pemain pemain2;
    public static int ronde;
    public static KontrolGamee kontrolGamee;
    public Timer timer;
    public static int waktuTersisa;

    /**
     * Creates new form Player1
     * @param pemain1
     * @param pemain2
     */
    public HalPemain1(Pemain pemain1, Pemain pemain2, int ronde) {
        this.pemain1 = pemain1;
        this.pemain2 = pemain2;
        this.ronde = ronde;
        initComponents();
        LRonde.setText("RONDE " + Integer.toString(ronde));
        LNamaPemain1.setText(pemain1.getNama());
        LHpPemain1.setText("HP : " + Integer.toString(pemain1.getHp()));
        waktuTersisa = 10;
        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(waktuTersisa > 0) {
                    waktuTersisa--;
                    LTimer.setText("Waktu tersisa : " + waktuTersisa + "detik");    
                } else {
                    timer.stop();
                    if(pemain1.getPilihan() == null && pemain1.getElemen() == null) {
                        kontrolGamee.randomPilihan(pemain1);
                        kontrolGamee.randomElemen(pemain1);
                        System.out.println("dua-dua null");
                        System.out.println(pemain1.getPilihan());
                        System.out.println(pemain1.getElemen());
                        HalTungguPemain2 halTungguPemain2 = new HalTungguPemain2(pemain1, pemain2, ronde);
                        halTungguPemain2.setVisible(true);
                        HalPemain1.this.dispose();
                    } else if(pemain1.getPilihan() == null && pemain1.getElemen() != null) {
                        KontrolGamee.randomPilihan(pemain1);
                        System.out.println("pilihan kosong");
                        System.out.println(pemain1.getPilihan());
                        System.out.println(pemain1.getElemen());
                        HalTungguPemain2 halTungguPemain2 = new HalTungguPemain2(pemain1, pemain2, ronde);
                        halTungguPemain2.setVisible(true);
                        HalPemain1.this.dispose();
                    } else if(pemain1.getElemen() == null && pemain1.getPilihan() != null) {
                        KontrolGamee.randomElemen(pemain1);
                        System.out.println("elemen kosong");
                        System.out.println(pemain1.getPilihan());
                        System.out.println(pemain1.getElemen());
                        HalTungguPemain2 halTungguPemain2 = new HalTungguPemain2(pemain1, pemain2, ronde);
                        halTungguPemain2.setVisible(true);
                        HalPemain1.this.dispose();
                    } else {
                        HalTungguPemain2 halTungguPemain2 = new HalTungguPemain2(pemain1, pemain2, ronde);
                        System.out.println("elemen dan pilihan tidak kosong");
                        System.out.println(pemain1.getPilihan());
                        System.out.println(pemain1.getElemen());
                        halTungguPemain2.setVisible(true);
                        HalPemain1.this.dispose();
                    }
                }
            }
        });
        timer.start();
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
        jPanel1 = new javax.swing.JPanel();
        LNamaPemain1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BGunting = new javax.swing.JButton();
        BBatu = new javax.swing.JButton();
        BKertas = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        BAir = new javax.swing.JButton();
        BApi = new javax.swing.JButton();
        BAngin = new javax.swing.JButton();
        BTanah = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        LRonde = new javax.swing.JLabel();
        LPemain = new javax.swing.JLabel();
        LHpPemain1 = new javax.swing.JLabel();
        LTimer = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        LNamaPemain1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LNamaPemain1.setForeground(new java.awt.Color(255, 255, 255));
        LNamaPemain1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LNamaPemain1.setText("Rijul");
        LNamaPemain1.setAlignmentY(0.0F);
        LNamaPemain1.setIconTextGap(0);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Tentukan Pilihan Suit");

        BGunting.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BGunting.setText("Gunting");
        BGunting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BGuntingActionPerformed(evt);
            }
        });

        BBatu.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BBatu.setText("Batu");
        BBatu.setMaximumSize(new java.awt.Dimension(100, 32));
        BBatu.setMinimumSize(new java.awt.Dimension(100, 32));
        BBatu.setPreferredSize(new java.awt.Dimension(100, 32));
        BBatu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBatuActionPerformed(evt);
            }
        });

        BKertas.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BKertas.setText("Kertas");
        BKertas.setPreferredSize(new java.awt.Dimension(100, 32));
        BKertas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BKertasActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Pilih Elemen");

        BAir.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BAir.setText("Air");
        BAir.setPreferredSize(new java.awt.Dimension(85, 32));
        BAir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAirActionPerformed(evt);
            }
        });

        BApi.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BApi.setText("Api");
        BApi.setPreferredSize(new java.awt.Dimension(85, 32));
        BApi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BApiActionPerformed(evt);
            }
        });

        BAngin.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BAngin.setText("Angin");
        BAngin.setPreferredSize(new java.awt.Dimension(85, 32));
        BAngin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAnginActionPerformed(evt);
            }
        });

        BTanah.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BTanah.setText("Tanah");
        BTanah.setPreferredSize(new java.awt.Dimension(85, 32));
        BTanah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTanahActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(51, 51, 51));
        jButton8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("Lanjut");
        jButton8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        LRonde.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        LRonde.setForeground(new java.awt.Color(255, 255, 255));
        LRonde.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LRonde.setText("RONDE 11");

        LPemain.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        LPemain.setForeground(new java.awt.Color(255, 255, 255));
        LPemain.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LPemain.setText("Pemain 1");
        LPemain.setAlignmentY(0.0F);
        LPemain.setIconTextGap(0);

        LHpPemain1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LHpPemain1.setForeground(new java.awt.Color(255, 255, 255));
        LHpPemain1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LHpPemain1.setText("HP : 80");
        LHpPemain1.setAlignmentY(0.0F);
        LHpPemain1.setIconTextGap(0);

        LTimer.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LTimer.setForeground(new java.awt.Color(255, 255, 255));
        LTimer.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LTimer.setText("Waktu tersisa :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LHpPemain1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(BTanah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BAir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BApi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BAngin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(BGunting)
                                .addGap(18, 18, 18)
                                .addComponent(BBatu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BKertas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LNamaPemain1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(LPemain, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
                        .addComponent(LTimer, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(278, 278, 278)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(314, 314, 314)
                        .addComponent(LRonde, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(325, 325, 325)
                        .addComponent(jLabel3)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(344, 344, 344)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LPemain)
                    .addComponent(LTimer))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LNamaPemain1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LHpPemain1)
                .addGap(53, 53, 53)
                .addComponent(LRonde)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BBatu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BKertas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BGunting))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BApi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BAngin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BAir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTanah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton8)
                .addGap(208, 208, 208))
        );

        //public JLabel getLNamaPemain1() {
            //    return LNamaPemain1
            //}
        //public JLabel getLNamaPemain1() {
            //    return LNamaPemain1
            //}
        //public JLabel getLNamaPemain1() {
            //    return LNamaPemain1
            //}

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void BAirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAirActionPerformed
        // TODO add your handling code here:
        pemain1.setElemen("air");
        BAir.setForeground(Color.red);
        BApi.setForeground(Color.black);
        BTanah.setForeground(Color.black);
        BAngin.setForeground(Color.black);
    }//GEN-LAST:event_BAirActionPerformed

    private void BGuntingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BGuntingActionPerformed
        // TODO add your handling code here:
        pemain1.setPilihan("gunting");
        BGunting.setForeground(Color.red);
        BKertas.setForeground(Color.black);
        BBatu.setForeground(Color.black);
    }//GEN-LAST:event_BGuntingActionPerformed

    private void BBatuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBatuActionPerformed
        // TODO add your handling code here:
        pemain1.setPilihan("batu");
        BBatu.setForeground(Color.red);
        BGunting.setForeground(Color.black);
        BKertas.setForeground(Color.black);
    }//GEN-LAST:event_BBatuActionPerformed

    private void BKertasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BKertasActionPerformed
        // TODO add your handling code here:
        pemain1.setPilihan("kertas");
        BKertas.setForeground(Color.red);
        BBatu.setForeground(Color.black);
        BGunting.setForeground(Color.black);
    }//GEN-LAST:event_BKertasActionPerformed

    private void BTanahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTanahActionPerformed
        // TODO add your handling code here:
        pemain1.setElemen("tanah");
        BTanah.setForeground(Color.red);
        BApi.setForeground(Color.black);
        BAir.setForeground(Color.black);
        BAngin.setForeground(Color.black);
    }//GEN-LAST:event_BTanahActionPerformed

    private void BApiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BApiActionPerformed
        // TODO add your handling code here:
        pemain1.setElemen("api");
        BApi.setForeground(Color.red);
        BTanah.setForeground(Color.black);
        BAir.setForeground(Color.black);
        BAngin.setForeground(Color.black);
    }//GEN-LAST:event_BApiActionPerformed

    private void BAnginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAnginActionPerformed
        // TODO add your handling code here:
        pemain1.setElemen("angin");
        BAngin.setForeground(Color.red);
        BTanah.setForeground(Color.black);
        BAir.setForeground(Color.black);
        BApi.setForeground(Color.black);
    }//GEN-LAST:event_BAnginActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        HalTungguPemain2 halTungguPemain2 = new HalTungguPemain2(pemain1, pemain2, ronde);
        
        //debugging
        System.out.println(pemain1.getElemen() + pemain1.getPilihan());
        
        System.out.println(pemain1.getPilihan());
        System.out.println(pemain1.getElemen());
        
        timer.stop();
        
        halTungguPemain2.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton8ActionPerformed

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
            java.util.logging.Logger.getLogger(HalPemain1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HalPemain1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HalPemain1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HalPemain1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HalPemain1(pemain1, pemain2, ronde).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BAir;
    private javax.swing.JButton BAngin;
    private javax.swing.JButton BApi;
    private javax.swing.JButton BBatu;
    private javax.swing.JButton BGunting;
    private javax.swing.JButton BKertas;
    private javax.swing.JButton BTanah;
    private javax.swing.JLabel LHpPemain1;
    private javax.swing.JLabel LNamaPemain1;
    private javax.swing.JLabel LPemain;
    private javax.swing.JLabel LRonde;
    private javax.swing.JLabel LTimer;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
