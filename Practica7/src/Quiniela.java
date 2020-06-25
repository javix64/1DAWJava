
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author x535
 */
public class Quiniela extends javax.swing.JFrame {
  
    /**
     * Creates new form Quiniela
     */
    public Quiniela() {
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

        Entrada = new javax.swing.JDialog();
        LabelPartido = new javax.swing.JLabel();
        InputPartido = new javax.swing.JTextField();
        EnterPartido = new javax.swing.JButton();
        QuinielasFree = new javax.swing.JLabel();
        Nuevo = new javax.swing.JButton();
        Borrar = new javax.swing.JButton();
        Vaciar = new javax.swing.JButton();
        Generar = new javax.swing.JButton();
        inputPartidos = new java.awt.List();
        outputPartidos = new java.awt.List();

        Entrada.setMinimumSize(new java.awt.Dimension(700, 300));
        Entrada.setModal(true);

        LabelPartido.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        LabelPartido.setText("Partido:");

        InputPartido.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        InputPartido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputPartidoActionPerformed(evt);
            }
        });

        EnterPartido.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        EnterPartido.setText("Añadir");
        EnterPartido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnterPartidoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout EntradaLayout = new javax.swing.GroupLayout(Entrada.getContentPane());
        Entrada.getContentPane().setLayout(EntradaLayout);
        EntradaLayout.setHorizontalGroup(
            EntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EntradaLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(LabelPartido, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(InputPartido, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(EnterPartido, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        EntradaLayout.setVerticalGroup(
            EntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EntradaLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(EntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelPartido, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InputPartido, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EnterPartido, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(90, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(37, 37, 37));

        QuinielasFree.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        QuinielasFree.setText("Quinielas FREE");

        Nuevo.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Nuevo.setText("Nuevo");
        Nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoActionPerformed(evt);
            }
        });

        Borrar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Borrar.setText("Borrar");
        Borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarActionPerformed(evt);
            }
        });

        Vaciar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Vaciar.setText("Vaciar");
        Vaciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VaciarActionPerformed(evt);
            }
        });

        Generar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Generar.setText("Generar");
        Generar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(inputPartidos, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Borrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Nuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Vaciar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Generar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(QuinielasFree, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 189, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(444, Short.MAX_VALUE)
                    .addComponent(outputPartidos, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(33, 33, 33)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(QuinielasFree, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(Nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(Vaciar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Generar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(41, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(inputPartidos, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(130, Short.MAX_VALUE)
                    .addComponent(outputPartidos, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(31, 31, 31)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoActionPerformed
        Entrada.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_NuevoActionPerformed

    private void InputPartidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputPartidoActionPerformed
        String partido=InputPartido.getText();
        inputPartidos.add(partido); 
        InputPartido.setText(null);
        InputPartido.requestFocus();
    }//GEN-LAST:event_InputPartidoActionPerformed

    private void EnterPartidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnterPartidoActionPerformed
        String partido=InputPartido.getText();
        inputPartidos.add(partido);   
        InputPartido.setText(null);
        InputPartido.requestFocus();
    }//GEN-LAST:event_EnterPartidoActionPerformed

    private void BorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarActionPerformed
      try{
        inputPartidos.remove(inputPartidos.getSelectedIndex());  
      }catch(ArrayIndexOutOfBoundsException e){
          JOptionPane.showMessageDialog(this, "Te has equivocado");
      }
        
    }//GEN-LAST:event_BorrarActionPerformed

    private void VaciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VaciarActionPerformed
        inputPartidos.removeAll();
        outputPartidos.removeAll();
    }//GEN-LAST:event_VaciarActionPerformed

    private void GenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerarActionPerformed
        int i, contarquiniela;
        for(i=0; i<inputPartidos.getItemCount(); i++){
                contarquiniela=(int) (Math.random()*10+1);
                if (contarquiniela<=5)
                   outputPartidos.add(inputPartidos.getItem(i)+" 1 ");
                else if (contarquiniela>=8)
                        outputPartidos.add(inputPartidos.getItem(i)+" X ");
                    else 
                        outputPartidos.add(inputPartidos.getItem(i)+" 2 ");
        }       
    }//GEN-LAST:event_GenerarActionPerformed

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
            java.util.logging.Logger.getLogger(Quiniela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Quiniela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Quiniela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Quiniela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Quiniela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Borrar;
    private javax.swing.JButton EnterPartido;
    private javax.swing.JDialog Entrada;
    private javax.swing.JButton Generar;
    private javax.swing.JTextField InputPartido;
    private javax.swing.JLabel LabelPartido;
    private javax.swing.JButton Nuevo;
    private javax.swing.JLabel QuinielasFree;
    private javax.swing.JButton Vaciar;
    private java.awt.List inputPartidos;
    private java.awt.List outputPartidos;
    // End of variables declaration//GEN-END:variables
}