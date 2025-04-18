/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package SuitElemenGame;

/**
 *
 * @author rizal
 */
public class HalPemenang extends javax.swing.JFrame {
    public static Pemain pemain1;
    public static Pemain pemain2;
    public static int ronde;
    public static LogicSuit logicSuit;

    /**
     * Creates new form HalPemenang
     */
    public HalPemenang(Pemain pemain1, Pemain pemain2, int ronde) {
        HalPemenang.pemain1 = pemain1;
        HalPemenang.pemain2 = pemain2;
        this.ronde = ronde;
        initComponents();
        LRonde.setText("RONDE " + ronde);
        KontrolGamee.tentukanMenangKalahSeri(pemain1, pemain2);
//        KontrolGamee.tentukanMenangKalahSeri(pemain1, pemain2);
        
        //debugging
        System.out.println(pemain1.getHp());
        System.out.println(pemain2.getHp());
                    
        if(pemain1.getHp() <= 0 || pemain2.getHp() <= 0) {
            System.out.println("Game telah selesai");
            BLanjutRondeOrNewGame.setText("Kembali ke halaman awal");
        } else {
            this.ronde++;
        }
        LNamaPemain1.setText(pemain1.getNama());
        LPilihanPemain1.setText(pemain1.getPilihan());
        LElemenPemain1.setText(pemain1.getElemen());
        LNamaPemain2.setText(pemain2.getNama());
        LPilihanPemain2.setText(pemain2.getPilihan());
        LElemenPemain2.setText(pemain2.getElemen());
        if(LogicSuit.tentukanPemenangSuit(pemain1, pemain2) == 1) {
            LMenangKalahSeriPemain1.setText("Menang");
            LMenangKalahSeriPemain2.setText("Kalah");
        } else if(LogicSuit.tentukanPemenangSuit(pemain1, pemain2) == 2) {
            LMenangKalahSeriPemain1.setText("Kalah");
            LMenangKalahSeriPemain2.setText("Menang");
        } else {
            LMenangKalahSeriPemain1.setText("Seri");
            LMenangKalahSeriPemain2.setText("Seri");
        }
        LHpPemain1.setText("HP : " + Integer.toString(pemain1.getHp()));
        LHpPemain2.setText("HP : " + Integer.toString(pemain2.getHp()));
        LWinnerLoserPemain1.setVisible(false);
        LWinnerLoserPemain2.setVisible(false);
        if(pemain1.getHp() <= 0) {
            LWinnerLoserPemain1.setVisible(true);
            LWinnerLoserPemain1.setText("LOSERRR");
            LWinnerLoserPemain2.setVisible(true);
            LWinnerLoserPemain2.setText("WINNER!!");
        }
        if(pemain2.getHp() <= 0) {
            LWinnerLoserPemain1.setVisible(true);
            LWinnerLoserPemain1.setText("WINNER!!");
            LWinnerLoserPemain2.setVisible(true);
            LWinnerLoserPemain2.setText("LOSERRR");
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
        LRonde = new javax.swing.JLabel();
        BLanjutRondeOrNewGame = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        LPemain1 = new javax.swing.JLabel();
        LNamaPemain1 = new javax.swing.JLabel();
        LPilihanPemain1 = new javax.swing.JLabel();
        LElemenPemain2 = new javax.swing.JLabel();
        LNamaPemain2 = new javax.swing.JLabel();
        LPilihanPemain2 = new javax.swing.JLabel();
        LElemenPemain1 = new javax.swing.JLabel();
        LHpPemain1 = new javax.swing.JLabel();
        LHpPemain2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        LMenangKalahSeriPemain1 = new javax.swing.JLabel();
        LMenangKalahSeriPemain2 = new javax.swing.JLabel();
        LWinnerLoserPemain2 = new javax.swing.JLabel();
        LWinnerLoserPemain1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        LRonde.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        LRonde.setForeground(new java.awt.Color(255, 255, 255));
        LRonde.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LRonde.setText("Ronde");

        BLanjutRondeOrNewGame.setBackground(new java.awt.Color(51, 51, 51));
        BLanjutRondeOrNewGame.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BLanjutRondeOrNewGame.setForeground(new java.awt.Color(255, 255, 255));
        BLanjutRondeOrNewGame.setText("Lanjut Ronde Selanjutnya");
        BLanjutRondeOrNewGame.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        BLanjutRondeOrNewGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BLanjutRondeOrNewGameActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Hasil Suit Elemen");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Pemain 2");

        LPemain1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        LPemain1.setForeground(new java.awt.Color(255, 255, 255));
        LPemain1.setText("Pemain 1");

        LNamaPemain1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LNamaPemain1.setForeground(new java.awt.Color(255, 255, 255));
        LNamaPemain1.setText("Nama");

        LPilihanPemain1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LPilihanPemain1.setForeground(new java.awt.Color(255, 255, 255));
        LPilihanPemain1.setText("Pilihan");

        LElemenPemain2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LElemenPemain2.setForeground(new java.awt.Color(255, 255, 255));
        LElemenPemain2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LElemenPemain2.setText("Elemen");

        LNamaPemain2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LNamaPemain2.setForeground(new java.awt.Color(255, 255, 255));
        LNamaPemain2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LNamaPemain2.setText("Nama");

        LPilihanPemain2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LPilihanPemain2.setForeground(new java.awt.Color(255, 255, 255));
        LPilihanPemain2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LPilihanPemain2.setText("Pilihan");

        LElemenPemain1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LElemenPemain1.setForeground(new java.awt.Color(255, 255, 255));
        LElemenPemain1.setText("Elemen");

        LHpPemain1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LHpPemain1.setForeground(new java.awt.Color(255, 255, 255));
        LHpPemain1.setText("HP");

        LHpPemain2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LHpPemain2.setForeground(new java.awt.Color(255, 255, 255));
        LHpPemain2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LHpPemain2.setText("HP");

        LMenangKalahSeriPemain1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        LMenangKalahSeriPemain1.setForeground(new java.awt.Color(255, 255, 255));
        LMenangKalahSeriPemain1.setText("Menang");

        LMenangKalahSeriPemain2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        LMenangKalahSeriPemain2.setForeground(new java.awt.Color(255, 255, 255));
        LMenangKalahSeriPemain2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LMenangKalahSeriPemain2.setText("Kalah");

        LWinnerLoserPemain2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        LWinnerLoserPemain2.setForeground(new java.awt.Color(255, 255, 255));
        LWinnerLoserPemain2.setText("WINNER");

        LWinnerLoserPemain1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        LWinnerLoserPemain1.setForeground(new java.awt.Color(255, 255, 255));
        LWinnerLoserPemain1.setText("WINNER");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(377, 377, 377)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(296, 296, 296))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(LRonde, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(276, 276, 276))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(BLanjutRondeOrNewGame, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(254, 254, 254))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(LWinnerLoserPemain1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LWinnerLoserPemain2))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LNamaPemain1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LPilihanPemain1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LPemain1, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                            .addComponent(LMenangKalahSeriPemain1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(58, 58, 58)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
                            .addComponent(LMenangKalahSeriPemain2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LNamaPemain2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LPilihanPemain2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LElemenPemain1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LHpPemain1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(LHpPemain2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(LElemenPemain2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(73, 73, 73))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(LRonde)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LWinnerLoserPemain2)
                    .addComponent(LWinnerLoserPemain1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LPemain1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LMenangKalahSeriPemain2)
                    .addComponent(LMenangKalahSeriPemain1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LNamaPemain1)
                    .addComponent(LNamaPemain2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LPilihanPemain1)
                    .addComponent(LPilihanPemain2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LElemenPemain1)
                    .addComponent(LElemenPemain2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LHpPemain1)
                    .addComponent(LHpPemain2))
                .addGap(85, 85, 85)
                .addComponent(BLanjutRondeOrNewGame)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void BLanjutRondeOrNewGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BLanjutRondeOrNewGameActionPerformed
        // TODO add your handling code here:
        pemain1.setPilihan(null);
        pemain1.setElemen(null);
        pemain2.setPilihan(null);
        pemain2.setPilihan(null); 
        
        if(pemain1.getHp() > 0 && pemain2.getHp() > 0) {
            HalRonde halRonde = new HalRonde(pemain1, pemain2, ronde);
            halRonde.setVisible(true);
            this.dispose();
        } else {
            HalAwal halAwal = new HalAwal();
            halAwal.setVisible(true);
            this.dispose();
        }   
    }//GEN-LAST:event_BLanjutRondeOrNewGameActionPerformed

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
            java.util.logging.Logger.getLogger(HalPemenang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HalPemenang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HalPemenang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HalPemenang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HalPemenang(pemain1, pemain2, ronde).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BLanjutRondeOrNewGame;
    private javax.swing.JLabel LElemenPemain1;
    private javax.swing.JLabel LElemenPemain2;
    private javax.swing.JLabel LHpPemain1;
    private javax.swing.JLabel LHpPemain2;
    private javax.swing.JLabel LMenangKalahSeriPemain1;
    private javax.swing.JLabel LMenangKalahSeriPemain2;
    private javax.swing.JLabel LNamaPemain1;
    private javax.swing.JLabel LNamaPemain2;
    private javax.swing.JLabel LPemain1;
    private javax.swing.JLabel LPilihanPemain1;
    private javax.swing.JLabel LPilihanPemain2;
    private javax.swing.JLabel LRonde;
    private javax.swing.JLabel LWinnerLoserPemain1;
    private javax.swing.JLabel LWinnerLoserPemain2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
