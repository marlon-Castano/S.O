/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import simulacion.Proceso;
import simulacion.Simulacion;

/**
 *
 * @author Usuario
 */
public class Vista_Chiquita extends javax.swing.JDialog {

    /**
     * Creates new form Vista_Chiquita
     */
    
     static int auxid =1;
     List<Proceso>  prosesos = new ArrayList<>();
     public Vista_Chiquita(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        int val=auxid++;
        int id=val;
        
        id_proceso.setText(""+val);
        
    }



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    public  void agregarProcesos(Proceso pro){
       Principal ob = new Principal();
        
       if(ob.getProsesosN()!=null){ 
         prosesos=ob.getProsesosN();
        prosesos.add(pro);
        ob.setProsesosN(prosesos);
       }else{
           prosesos.add(pro);
        ob.setProsesosN(prosesos);
       }
    }
    public void limpiarvista(){
        id_proceso.setText("");
        nombre.setText("");
        tamano.setText("");
        Recurso1.setSelected(false);
        Recurso2.setSelected(false);
        Recurso3.setSelected(false);
        Recurso4.setSelected(false);
        Recurso5.setSelected(false);
        Recurso6.setSelected(false);
    }
    public String validarChec(){
        String recursos = new String();
        if(Recurso1.isSelected()){
            recursos=Recurso1.getText();
        }
        if(Recurso2.isSelected()){
            recursos=recursos +" "+ Recurso2.getText();
        }
        if(Recurso3.isSelected()){
            recursos= recursos +" "+Recurso3.getText();
        }
        if(Recurso4.isSelected()){
            recursos=recursos +" "+ Recurso4.getText();
        }
        if(Recurso5.isSelected()){
            recursos=recursos +" "+Recurso5.getText();
        }
        if(Recurso6.isSelected()){
            recursos=recursos +" "+Recurso6.getText();
        }
        return recursos;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        id_proceso = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        tamano = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Recurso2 = new javax.swing.JCheckBox();
        Recurso3 = new javax.swing.JCheckBox();
        Recurso4 = new javax.swing.JCheckBox();
        Recurso5 = new javax.swing.JCheckBox();
        Recurso6 = new javax.swing.JCheckBox();
        Recurso1 = new javax.swing.JCheckBox();
        botonAceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        id_proceso.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        id_proceso.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        id_proceso.setEnabled(false);
        id_proceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_procesoActionPerformed(evt);
            }
        });
        id_proceso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                id_procesoKeyTyped(evt);
            }
        });

        nombre.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        nombre.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombreKeyTyped(evt);
            }
        });

        tamano.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        tamano.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tamano.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tamanoKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel1.setText("Id proceso");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel2.setText("Nombre");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel3.setText("Tamaño");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(id_proceso)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(tamano))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(id_proceso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tamano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        Recurso2.setText("R2");
        Recurso2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Recurso2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Recurso2ActionPerformed(evt);
            }
        });

        Recurso3.setText("R3");
        Recurso3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Recurso3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Recurso3ActionPerformed(evt);
            }
        });

        Recurso4.setText("R4");
        Recurso4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Recurso5.setText("R5");
        Recurso5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Recurso6.setText("R6");
        Recurso6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Recurso1.setText("R1");
        Recurso1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Recurso1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Recurso1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Recurso2)
                    .addComponent(Recurso1))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Recurso4)
                    .addComponent(Recurso3))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Recurso6)
                    .addComponent(Recurso5))
                .addGap(32, 32, 32))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 14, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Recurso3)
                            .addComponent(Recurso5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Recurso4)
                            .addComponent(Recurso6)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(Recurso1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Recurso2))))
        );

        botonAceptar.setText("Aceptar");
        botonAceptar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(botonAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Recurso2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Recurso2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Recurso2ActionPerformed

    private void botonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAceptarActionPerformed
try{
    if(Integer.parseInt(tamano.getText())>30){
        JOptionPane.showMessageDialog(this, "el tamaño esta muy grande");
    }else{
        
        Proceso proceso= new Proceso();
        String recursos;
        recursos= validarChec();
        int id =Integer.parseInt(id_proceso.getText());
        String nombre =this.nombre.getText();
        int tamano =Integer.parseInt(this.tamano.getText());
        
        proceso= new Proceso("nuevo", tamano, nombre, id, 1, recursos);
        simulacion.Simulacion.principal.setProceso(proceso);
        dispose();}
    }
catch (Exception e){
    if(id_proceso.getText().length()==0){
        JOptionPane.showMessageDialog(this,"El id es un campo Numerio obligatorio");
    }else{
    try{
    Integer.parseInt(id_proceso.getText());
    }
    catch(Exception b){
        JOptionPane.showMessageDialog(this,"El id debe ser un digito");
    }
    }
    if(nombre.getText().length()==0){
        JOptionPane.showMessageDialog(this,"El Nombre es un campo obligatorio");}
    if(tamano.getText().length()==0){
        JOptionPane.showMessageDialog(this,"El tamaño es un campo obligatorio");}
    else{
    try{
    Integer.parseInt(tamano.getText());
    }
    catch(Exception b){
        JOptionPane.showMessageDialog(this,"El tamaño debe ser un digito");
    }}
    if(validarChec().length()==0){
        JOptionPane.showMessageDialog(this,"No se a seleccionado ningun recurso");}
}
        /*agregarProcesos(proceso);
        limpiarvista();*/
    }//GEN-LAST:event_botonAceptarActionPerformed

    private void Recurso1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Recurso1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Recurso1ActionPerformed

    private void Recurso3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Recurso3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Recurso3ActionPerformed

    private void id_procesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_procesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_procesoActionPerformed

    private void id_procesoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_id_procesoKeyTyped
        char validar = evt.getKeyChar();
        
        if(Character.isLetter(validar)){
            
            evt.consume();
        }else if(evt.getKeyChar()>32 && evt.getKeyChar()<=47){
            evt.consume();
        }
    }//GEN-LAST:event_id_procesoKeyTyped

    private void nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreKeyTyped

    private void tamanoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tamanoKeyTyped
        char validar = evt.getKeyChar();
        
        if(Character.isLetter(validar)){
            
            evt.consume();
        }else if(evt.getKeyChar()>32 && evt.getKeyChar()<=47){
            evt.consume();
        }
    }//GEN-LAST:event_tamanoKeyTyped

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
            java.util.logging.Logger.getLogger(Vista_Chiquita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista_Chiquita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista_Chiquita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista_Chiquita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Vista_Chiquita dialog = new Vista_Chiquita(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox Recurso1;
    private javax.swing.JCheckBox Recurso2;
    private javax.swing.JCheckBox Recurso3;
    private javax.swing.JCheckBox Recurso4;
    private javax.swing.JCheckBox Recurso5;
    private javax.swing.JCheckBox Recurso6;
    private javax.swing.JButton botonAceptar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField id_proceso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField tamano;
    // End of variables declaration//GEN-END:variables
}
