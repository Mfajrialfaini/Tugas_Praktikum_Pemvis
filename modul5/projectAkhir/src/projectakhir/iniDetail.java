/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projectakhir;

import com.formdev.flatlaf.FlatLightLaf;
import java.awt.CardLayout;
import javax.swing.UIManager;

/**
 *
 * @author Admin
 */
public class iniDetail extends javax.swing.JFrame {

    /**
     * Creates new form iniDetail
     */
    public iniDetail() {
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
        jPanelCreateRecipeDetail = new javax.swing.JPanel();
        jTextFieldNamaKuliner = new javax.swing.JTextField();
        jLabelNamaKuliner = new javax.swing.JLabel();
        jLabelBahanUtama = new javax.swing.JLabel();
        jTextFieldBahanUtama = new javax.swing.JTextField();
        jLabelTotalHargaBahan = new javax.swing.JLabel();
        jTextFieldTotalHargaBahan = new javax.swing.JTextField();
        jLabelAsal = new javax.swing.JLabel();
        jComboBoxAsal = new javax.swing.JComboBox<>();
        jLabelLangkah = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaLangkah = new javax.swing.JTextArea();
        jButtonNext = new javax.swing.JButton();
        jPanelCreateRecipe2Detail = new javax.swing.JPanel();
        jLabelSejarah = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreajLabelSejarah = new javax.swing.JTextArea();
        jLabelDeskripsi1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextAreaDeskripsi1 = new javax.swing.JTextArea();
        jButtonSubmit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));
        jPanel1.setLayout(new java.awt.CardLayout());

        jPanelCreateRecipeDetail.setBackground(new java.awt.Color(255, 255, 255));

        jTextFieldNamaKuliner.setBackground(new java.awt.Color(242, 242, 238));

        jLabelNamaKuliner.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelNamaKuliner.setText("Nama Coulinary");

        jLabelBahanUtama.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelBahanUtama.setText("Bahan Utama");

        jTextFieldBahanUtama.setBackground(new java.awt.Color(242, 242, 238));

        jLabelTotalHargaBahan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelTotalHargaBahan.setText("Total Harga Bahan");

        jTextFieldTotalHargaBahan.setBackground(new java.awt.Color(242, 242, 238));
        jTextFieldTotalHargaBahan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTotalHargaBahanActionPerformed(evt);
            }
        });

        jLabelAsal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelAsal.setText("Asal");

        jComboBoxAsal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabelLangkah.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelLangkah.setText("Bahan-bahan/Langkah-langkah");

        jTextAreaLangkah.setColumns(20);
        jTextAreaLangkah.setRows(5);
        jScrollPane1.setViewportView(jTextAreaLangkah);

        jButtonNext.setBackground(new java.awt.Color(233, 157, 40));
        jButtonNext.setForeground(new java.awt.Color(255, 255, 255));
        jButtonNext.setText("Next");
        jButtonNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelCreateRecipeDetailLayout = new javax.swing.GroupLayout(jPanelCreateRecipeDetail);
        jPanelCreateRecipeDetail.setLayout(jPanelCreateRecipeDetailLayout);
        jPanelCreateRecipeDetailLayout.setHorizontalGroup(
            jPanelCreateRecipeDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCreateRecipeDetailLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanelCreateRecipeDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCreateRecipeDetailLayout.createSequentialGroup()
                        .addGroup(jPanelCreateRecipeDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelCreateRecipeDetailLayout.createSequentialGroup()
                                .addComponent(jTextFieldNamaKuliner, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldTotalHargaBahan))
                            .addGroup(jPanelCreateRecipeDetailLayout.createSequentialGroup()
                                .addGroup(jPanelCreateRecipeDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelBahanUtama, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldBahanUtama, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelCreateRecipeDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBoxAsal, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanelCreateRecipeDetailLayout.createSequentialGroup()
                                        .addComponent(jLabelAsal, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 43, Short.MAX_VALUE))))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelCreateRecipeDetailLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButtonNext, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(45, 45, 45))
                    .addGroup(jPanelCreateRecipeDetailLayout.createSequentialGroup()
                        .addGroup(jPanelCreateRecipeDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelLangkah, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelCreateRecipeDetailLayout.createSequentialGroup()
                                .addComponent(jLabelNamaKuliner, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(433, 433, 433)
                                .addComponent(jLabelTotalHargaBahan, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanelCreateRecipeDetailLayout.setVerticalGroup(
            jPanelCreateRecipeDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCreateRecipeDetailLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCreateRecipeDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNamaKuliner, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTotalHargaBahan, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCreateRecipeDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNamaKuliner, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldTotalHargaBahan, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelCreateRecipeDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelBahanUtama, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelAsal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCreateRecipeDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldBahanUtama, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxAsal, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addComponent(jLabelLangkah, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonNext, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(74, Short.MAX_VALUE))
        );

        jPanel1.add(jPanelCreateRecipeDetail, "cardRecipe");

        jPanelCreateRecipe2Detail.setBackground(new java.awt.Color(255, 255, 255));

        jLabelSejarah.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelSejarah.setText("Sejarah Singkat Kuliner");

        jTextAreajLabelSejarah.setColumns(20);
        jTextAreajLabelSejarah.setRows(5);
        jScrollPane2.setViewportView(jTextAreajLabelSejarah);

        jLabelDeskripsi1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelDeskripsi1.setText("Deskripsi Kuliner");

        jTextAreaDeskripsi1.setColumns(20);
        jTextAreaDeskripsi1.setRows(5);
        jScrollPane3.setViewportView(jTextAreaDeskripsi1);

        jButtonSubmit.setBackground(new java.awt.Color(2, 97, 60));
        jButtonSubmit.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSubmit.setText("Back");
        jButtonSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSubmitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelCreateRecipe2DetailLayout = new javax.swing.GroupLayout(jPanelCreateRecipe2Detail);
        jPanelCreateRecipe2Detail.setLayout(jPanelCreateRecipe2DetailLayout);
        jPanelCreateRecipe2DetailLayout.setHorizontalGroup(
            jPanelCreateRecipe2DetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCreateRecipe2DetailLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanelCreateRecipe2DetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelCreateRecipe2DetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 792, Short.MAX_VALUE)
                        .addComponent(jLabelDeskripsi1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelSejarah, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanelCreateRecipe2DetailLayout.setVerticalGroup(
            jPanelCreateRecipe2DetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCreateRecipe2DetailLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabelSejarah, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelDeskripsi1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jButtonSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(90, Short.MAX_VALUE))
        );

        jPanel1.add(jPanelCreateRecipe2Detail, "cardDeskripsi");

        getContentPane().add(jPanel1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldTotalHargaBahanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTotalHargaBahanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTotalHargaBahanActionPerformed

    private void jButtonNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNextActionPerformed
        // TODO add your handling code here:
        CardLayout cl = (CardLayout) (jPanel1.getLayout());
        cl.show(jPanel1, "cardDeskripsi");
    }//GEN-LAST:event_jButtonNextActionPerformed

    private void jButtonSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSubmitActionPerformed
        // TODO add your handling code here:
        CardLayout cl = (CardLayout) (jPanel1.getLayout());
        cl.show(jPanel1, "cardRecipe");
        
    }//GEN-LAST:event_jButtonSubmitActionPerformed

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
            UIManager.setLookAndFeel(new FlatLightLaf());
//            UIManager.put( "TextComponent.arc", 10 );
            UIManager.put( "Button.arc", 10 );
            UIManager.put( "TextComponent.arc", 10 );
            UIManager.put( "ScrollBar.width", 5 );
//            UIManager.put("Button.border", BorderFactory.createLineBorder(Color.RED));
  

        } catch (Exception e) {
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new iniDetail().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonNext;
    private javax.swing.JButton jButtonSubmit;
    private javax.swing.JComboBox<String> jComboBoxAsal;
    private javax.swing.JLabel jLabelAsal;
    private javax.swing.JLabel jLabelBahanUtama;
    private javax.swing.JLabel jLabelDeskripsi1;
    private javax.swing.JLabel jLabelLangkah;
    private javax.swing.JLabel jLabelNamaKuliner;
    private javax.swing.JLabel jLabelSejarah;
    private javax.swing.JLabel jLabelTotalHargaBahan;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelCreateRecipe2Detail;
    private javax.swing.JPanel jPanelCreateRecipeDetail;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextAreaDeskripsi1;
    private javax.swing.JTextArea jTextAreaLangkah;
    private javax.swing.JTextArea jTextAreajLabelSejarah;
    private javax.swing.JTextField jTextFieldBahanUtama;
    private javax.swing.JTextField jTextFieldNamaKuliner;
    private javax.swing.JTextField jTextFieldTotalHargaBahan;
    // End of variables declaration//GEN-END:variables
}
