/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import simulacion.Proceso;
import simulacion.Recurso;

/**
 *
 * @author ASUS
 */
public class Principal extends javax.swing.JFrame {

    private static List<Proceso> nuevo = new ArrayList<>();
    private static List<Proceso> prosesosN = new ArrayList<>();
    private static List<Proceso> listo = new ArrayList<>();
    private static List<Proceso> bloqueado = new ArrayList<>();
    private static List<Proceso> terminado = new ArrayList<>();
    private static List<Proceso> ejecucion = new ArrayList<>();
    private static List<Recurso> recursos = new ArrayList<>();
    Recurso ob = new Recurso(null, "R1", true);
    Recurso ob1 = new Recurso(null, "R2", true);
    Recurso ob2 = new Recurso(null, "R3", true);
    Recurso ob3 = new Recurso(null, "R4", true);
    Recurso ob4 = new Recurso(null, "R5", true);
    Recurso ob5 = new Recurso(null, "R6", true);

    public void llenar_recursos() {
        recursos.add(ob);
        recursos.add(ob1);
        recursos.add(ob2);
        recursos.add(ob3);
        recursos.add(ob4);
        recursos.add(ob5);
    }

    public List getProceso() {
        return prosesosN;
    }

    public void setProceso(Proceso procesos) {
        prosesosN.add(procesos);

    }

    public List<Proceso> getProsesosN() {
        return prosesosN;
    }

    public void setProsesosN(List<Proceso> prosesosN) {
        this.prosesosN = prosesosN;
    }

    /*
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        llenarnuevo();
        llenar_recursos();
    }

    public Principal(List<Proceso> lista) {
        initComponents();
        prosesosN = lista;
        llenarnuevo();

    }

    private void llenarnuevo() {

        DefaultTableModel modelo = (DefaultTableModel) this.tablaNuevo.getModel();
        modelo.getDataVector().clear();
        if (prosesosN != null) {
            for (Proceso pro : prosesosN) {
                if (pro.getEstado().equals("nuevo")) {
                    modelo.addRow(new Object[]{pro.getNombre(), pro.getTamano()});
                }
            }
        }
    }

    private void llenarlisto(Proceso pro) {

        DefaultTableModel modelo = (DefaultTableModel) this.tablalisto.getModel();

        if (pro.getEstado().equals("listo")) {
            modelo.addRow(new Object[]{pro.getNombre(), pro.getTamano()});

        }

    }

    private void llenarejecucion(Proceso pro) {

        DefaultTableModel modelo = (DefaultTableModel) this.tablaEnproceso.getModel();

        if (pro.getEstado().equals("ejecucion")) {
            modelo.addRow(new Object[]{pro.getNombre(), pro.getTamano()});

        }

    }

    private void llenarbloq(Proceso pro) {

        DefaultTableModel modelo = (DefaultTableModel) this.tablaBloeado.getModel();

        if (pro.getEstado().equals("bloqueado")) {
            modelo.addRow(new Object[]{pro.getNombre(), pro.getTamano()});

        }

    }

    private void llenarListaPro() {
        DefaultTableModel modelo = (DefaultTableModel) this.tablaListaPro.getModel();
        modelo.getDataVector().clear();
        if (prosesosN != null) {
            for (Proceso pro : prosesosN) {
                modelo.addRow(new Object[]{pro.getId(), pro.getNombre(), pro.getTamano(), pro.getNoHilos(), pro.getRecursos(),
                    pro.getEstado()});
            }
        }
    }

    private void llenarterm(Proceso pro) {

        DefaultTableModel modelo = (DefaultTableModel) this.tablaTerminado.getModel();

        if (pro.getEstado().equals("terminado")) {
            modelo.addRow(new Object[]{pro.getNombre(), pro.getTamano()});

        }

    }
private void limpiarlisto() {
 DefaultTableModel modelo = (DefaultTableModel) this.tablalisto.getModel();
        
        while(modelo.getRowCount()>0){
            modelo.removeRow(0);}
}
private void limpiarBloqueado() {
 DefaultTableModel modelo = (DefaultTableModel) this.tablaBloeado.getModel();
        
        while(modelo.getRowCount()>0){
            modelo.removeRow(0);}
}
private void limpiarejecucion() {
 DefaultTableModel modelo = (DefaultTableModel) this.tablaEnproceso.getModel();
        
        while(modelo.getRowCount()>0){
            modelo.removeRow(0);}
}
private void limpiarnuevo() {
 DefaultTableModel modelo = (DefaultTableModel) this.tablaNuevo.getModel();
        
        while(modelo.getRowCount()>0){
            modelo.removeRow(0);}
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tablaNuevo = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tablalisto = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        tablaBloeado = new javax.swing.JTable();
        jScrollPane8 = new javax.swing.JScrollPane();
        tablarecursos = new javax.swing.JTable();
        jScrollPane9 = new javax.swing.JScrollPane();
        tablaEnproceso = new javax.swing.JTable();
        jScrollPane10 = new javax.swing.JScrollPane();
        tablaListaPro = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        tablaTerminado = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        butonNuevo = new javax.swing.JButton();
        botonEjecutar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nuevo");

        jLabel2.setText("Listo");

        jLabel3.setText("En proceso");

        jLabel4.setText("Terminado");

        tablaNuevo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "Proceso", "Peso"
            }
        ));
        jScrollPane5.setViewportView(tablaNuevo);

        jLabel5.setText("Bloqueado");

        tablalisto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Proceso", "Peso"
            }
        ));
        jScrollPane6.setViewportView(tablalisto);

        tablaBloeado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Proceso", "Peso"
            }
        ));
        jScrollPane7.setViewportView(tablaBloeado);

        tablarecursos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Recurso", "Estado", "Procesos"
            }
        ));
        jScrollPane8.setViewportView(tablarecursos);

        tablaEnproceso.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Proceso", "Peso"
            }
        ));
        jScrollPane9.setViewportView(tablaEnproceso);

        tablaListaPro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Tamaño", "Numero de hilos", "Recursos", "Estado"
            }
        ));
        jScrollPane10.setViewportView(tablaListaPro);

        jLabel6.setText("Recursos");

        tablaTerminado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Proceso", "Peso"
            }
        ));
        jScrollPane11.setViewportView(tablaTerminado);

        jLabel7.setText("lista de procesos");

        butonNuevo.setText("Nuevo proceso");
        butonNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butonNuevoActionPerformed(evt);
            }
        });

        botonEjecutar.setText("Ejecutar");
        botonEjecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEjecutarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(1121, 1121, 1121))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane10, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(247, 247, 247)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                            .addComponent(jLabel5)
                                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                        .addGap(33, 33, 33))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(248, 248, 248)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(134, 134, 134))
                                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(632, 632, 632)))
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(334, 334, 334))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(185, 185, 185))
                                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addGap(155, 155, 155))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addGap(556, 556, 556)
                                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(butonNuevo)
                                .addGap(18, 18, 18)
                                .addComponent(botonEjecutar)))
                        .addGap(172, 172, 172))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                            .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                        .addGap(9, 9, 9)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butonNuevo)
                    .addComponent(botonEjecutar)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void butonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butonNuevoActionPerformed

        Vista_Chiquita ob = new Vista_Chiquita(this, true);
        ob.show();
        llenarnuevo();
        llenarListaPro();
    }//GEN-LAST:event_butonNuevoActionPerformed

    private void botonEjecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEjecutarActionPerformed
        Proceso aux = new Proceso();
        for (Proceso pro : prosesosN) {
            pro.setEstado("listo");
            llenarlisto(pro);
        }
        llenarListaPro();

        Ejecutar();
    }//GEN-LAST:event_botonEjecutarActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    public void Thread() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void Ejecutar() {
        new Thread() {
            @Override
            public void run() {
                while (tablalisto.getModel().getRowCount()!=0) {
                    for (Proceso pro : prosesosN) {
                        if(validarRecursos(pro)){
                            pro.setEstado("listo");
                        }
                        if (pro.getEstado().equals("listo")) {
                            if (validaEjecu(pro)) {
                                if(pro.getTamano()!=0){
                                pro.setEstado("ejecucion");
                                llenarejecucion(pro);
                                llenarListaPro();
                                Thread();
                                pro.setTamano(pro.getTamano() - 1);
                                
                                if (ramdon() == true) {
                                    liberarRecursos();
                                    limpiarBloqueado();
                                    pasarListo();
                                }

                                if (pro.getTamano() != 0) {
                                    pro.setEstado("listo");
                                    limpiarejecucion();
                                } else {
                                    pro.setEstado("terminado");
                                    liberarRecursos();
                                    llenarterm(pro);
                                    limpiarejecucion();
                                }
                                llenarListaPro();
                                }else{
                                    break;
                                }    
                            } else {
                                pro.setEstado("bloqueado");
                                llenarbloq(pro);
                                llenarListaPro();
                            }
                        } else {
                            //poner que no hay procesos para jecutar
                        }
                    }
                }
            }
        }.start();

    }

    private void liberarRecursos() {
        for (Recurso re : recursos) {
            re.setEstado(true);
            re.setProceso(null);
        }
    }

    private void pasarListo() {
        for (Proceso pro : prosesosN) {
            if (pro.getEstado().equals("bloqueado")) {
                pro.setEstado("listo");
                llenarlisto(pro);
            }
        }
    }

    public boolean ramdon() {
        int numero = (int) (Math.random() * 2 + 1);
        if (numero == 3) {
            return true;
        } else {
            return false;
        }
    }
    public boolean validarRecursos(Proceso pro) {
        String[] recursosPro = pro.getRecursos().split(" ");

        int estado = 0;
        ///si no hay un recurso disponible
        for (int i = 0; i < recursos.size(); i++) {
            for (String recPro : recursosPro) {
                if (recPro.equals(recursos.get(i).getNombre())) {
                    if (recursos.get(i).isEstado()!=true && recursos.get(i).getProceso().getId()!=pro.getId()) {
                        estado++;
                    }
                    if (recursos.get(i).isEstado()!=true && recursos.get(i).getProceso().getId()==pro.getId()){
                        return true;
                    }
                }
            }

        }
        if(estado==0){
            return true;
        }else{
            return false;
        }
    }

    public boolean validaEjecu(Proceso pro) {
        String[] recursosPro = pro.getRecursos().split(" ");

        int estado = 0;
        ///si no hay un recurso disponible
        for (int i = 0; i < recursos.size(); i++) {
            for (String recPro : recursosPro) {
                if (recPro.equals(recursos.get(i).getNombre())) {
                    if (recursos.get(i).isEstado()!=true && recursos.get(i).getProceso().getId()!=pro.getId()) {
                        estado++;
                    }
                    if (recursos.get(i).isEstado()!=true && recursos.get(i).getProceso().getId()==pro.getId()){
                        return true;
                    }
                }
            }

        }
        Recurso aux = new Recurso();
        if (estado == 0) {
            for (int i = 0; i < recursos.size(); i++) {
                for (String recPro : recursosPro) {
                    if (recPro.equals(recursos.get(i).getNombre())) {
                        aux = recursos.get(i);
                        aux.setProceso(pro);
                        aux.setEstado(false);
                        recursos.remove(i);
                        recursos.add(aux);
                    }
                }
            }
            return true;
        } else {
            return false;
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonEjecutar;
    private javax.swing.JButton butonNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTable tablaBloeado;
    private javax.swing.JTable tablaEnproceso;
    private javax.swing.JTable tablaListaPro;
    private javax.swing.JTable tablaNuevo;
    private javax.swing.JTable tablaTerminado;
    private javax.swing.JTable tablalisto;
    private javax.swing.JTable tablarecursos;
    // End of variables declaration//GEN-END:variables
}
