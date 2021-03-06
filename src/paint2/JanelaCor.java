
package paint2;
import java.awt.*;
import javax.swing.JButton;
import javax.swing.JColorChooser;

//Alunos : Caio Gabriel Bispo dos Santos, Obertran Oliveira Lima Júnior
public class JanelaCor extends javax.swing.JFrame {
    protected boolean estadoBotaoConfirmar = false;
    protected Color c;
    /**
     * Creates new form JanelaCor
     */
    public void centralizarComponente() {
        Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension dw = getSize();
        setLocation((ds.width - dw.width) / 2, (ds.height - dw.height) / 2);
    }
    
    public JanelaCor() {
        initComponents();
        centralizarComponente();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelDeCores = new javax.swing.JColorChooser();
        BotaoConfirmar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PainelDeCores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PainelDeCoresMouseClicked(evt);
            }
        });

        BotaoConfirmar.setBackground(new java.awt.Color(0, 0, 255));
        BotaoConfirmar.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        BotaoConfirmar.setText("Confirmar");
        BotaoConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoConfirmarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelDeCores, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(202, 202, 202)
                .addComponent(BotaoConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PainelDeCores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotaoConfirmar, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void BotaoConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoConfirmarActionPerformed
        c = PainelDeCores.getColor();
        estadoBotaoConfirmar = true;
        dispose();
        estadoBotaoConfirmar = false;
    }//GEN-LAST:event_BotaoConfirmarActionPerformed

    private void PainelDeCoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PainelDeCoresMouseClicked

    }//GEN-LAST:event_PainelDeCoresMouseClicked


    public void setEstadoBotaoConfirmar(boolean estadoBotaoConfirmar) {
        this.estadoBotaoConfirmar = estadoBotaoConfirmar;
    }

    public JButton getBotaoConfirmar() {
        return BotaoConfirmar;
    }

    public JColorChooser getPainelDeCores() {
        return PainelDeCores;
    }
    
    public Color getC(){
        return c;
    }
    
    
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
            java.util.logging.Logger.getLogger(JanelaCor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaCor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaCor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaCor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaCor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoConfirmar;
    private javax.swing.JColorChooser PainelDeCores;
    // End of variables declaration//GEN-END:variables
}
