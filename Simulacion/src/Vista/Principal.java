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

    private void llenarlisto() {

        DefaultTableModel modelo = (DefaultTableModel) this.tablalisto.getModel();
        int c = 0;
        for (int i = 0; i < modelo.getRowCount(); i++) {
            modelo.removeRow(0);
        }
        for (Proceso pro : prosesosN) {
            if (pro.getEstado().equals("listo")) {
                c++;
                modelo.addRow(new Object[]{pro.getNombre(), pro.getTamano()});
            }
        }

    }

    private void llenarejecucion() {

        DefaultTableModel modelo = (DefaultTableModel) this.tablaEnproceso.getModel();
        for (Proceso pro : prosesosN) {
            if (pro.getEstado().equals("ejecucion")) {
                modelo.addRow(new Object[]{pro.getNombre(), pro.getTamano()});

            }
        }

    }

    private void llenarbloq() {

        DefaultTableModel modelo = (DefaultTableModel) this.tablaBloeado.getModel();
        for (Proceso pro : prosesosN) {
            if (pro.getEstado().equals("bloqueado")) {
                modelo.addRow(new Object[]{pro.getNombre(), pro.getTamano()});
            }
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

    private void llenarRecursos() {
        DefaultTableModel modelo = (DefaultTableModel) this.tablarecursos.getModel();
        modelo.getDataVector().clear();
        if (recursos != null) {
            for (Recurso re : recursos) {
                if (re.getProceso() == null) {
                    modelo.addRow(new Object[]{re.getNombre(), re.isEstado(), "vacio"});
                } else {
                    modelo.addRow(new Object[]{re.getNombre(), re.isEstado(), re.getProceso().getNombre()});
                }

            }
        }
    }

    private void llenarterm() {

        DefaultTableModel modelo = (DefaultTableModel) this.tablaTerminado.getModel();
        for (Proceso pro : prosesosN) {
            if (pro.getEstado().equals("terminado")) {
                modelo.addRow(new Object[]{pro.getNombre(), pro.getTamano()});
            }
        }

    }

    private void limpiarlisto() {
        DefaultTableModel modelo = (DefaultTableModel) this.tablalisto.getModel();

        for (int i = 0; i < modelo.getRowCount(); i++) {
            modelo.removeRow(i);
        }
    }

    private void limpiarBloqueado() {
        DefaultTableModel modelo = (DefaultTableModel) this.tablaBloeado.getModel();
        for (int i = 0; i < modelo.getRowCount(); i++) {
            modelo.removeRow(i);
        }
    }

    private void limpiarejecucion() {
        DefaultTableModel modelo = (DefaultTableModel) this.tablaEnproceso.getModel();

        for (int i = 0; i < modelo.getRowCount(); i++) {
            modelo.removeRow(i);
        }
    }

    private void limpiarnuevo() {
        DefaultTableModel modelo = (DefaultTableModel) this.tablaNuevo.getModel();

        for (int i = 0; i < modelo.getRowCount(); i++) {
            modelo.removeRow(i);
        }
    }

    private void limpiarREcursos() {
        DefaultTableModel modelo = (DefaultTableModel) this.tablarecursos.getModel();

        for (int i = 0; i < modelo.getRowCount(); i++) {
            modelo.removeRow(i);
        }
    }
    private void limpiarTerminado() {
        DefaultTableModel modelo = (DefaultTableModel) this.tablaTerminado.getModel();

        for (int i = 0; i < modelo.getRowCount(); i++) {
            modelo.removeRow(i);
        }
    }

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
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        flecha6 = new javax.swing.JLabel();
        flecha7 = new javax.swing.JLabel();
        flecha8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        flecha4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Nuevo");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 36, -1));

        jLabel2.setBackground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("Listo");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(319, 11, -1, -1));

        jLabel3.setBackground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("En proceso");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(589, 11, 1, -1));

        jLabel4.setBackground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("Terminado");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 10, 51, -1));

        jScrollPane5.setBackground(new java.awt.Color(0, 102, 102));

        tablaNuevo.setBackground(new java.awt.Color(204, 204, 255));
        tablaNuevo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        tablaNuevo.setFont(new java.awt.Font("Yu Gothic UI", 2, 12)); // NOI18N
        tablaNuevo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "Proceso", "Peso"
            }
        ));
        tablaNuevo.setGridColor(new java.awt.Color(0, 0, 0));
        tablaNuevo.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane5.setViewportView(tablaNuevo);

        getContentPane().add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 36, 214, 150));

        jLabel5.setBackground(new java.awt.Color(0, 102, 102));
        jLabel5.setText("Bloqueado");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 210, -1, -1));

        jScrollPane6.setBackground(new java.awt.Color(0, 102, 102));

        tablalisto.setBackground(new java.awt.Color(204, 255, 204));
        tablalisto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        tablalisto.setFont(new java.awt.Font("Yu Gothic UI", 3, 12)); // NOI18N
        tablalisto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Proceso", "Peso"
            }
        ));
        jScrollPane6.setViewportView(tablalisto);

        getContentPane().add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, 210, 150));

        jScrollPane7.setBackground(new java.awt.Color(0, 102, 102));
        jScrollPane7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        tablaBloeado.setBackground(new java.awt.Color(252, 10, 46));
        tablaBloeado.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        tablaBloeado.setFont(new java.awt.Font("Yu Gothic UI", 2, 12)); // NOI18N
        tablaBloeado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Proceso", "Peso"
            }
        ));
        jScrollPane7.setViewportView(tablaBloeado);

        getContentPane().add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 250, 210, 120));

        jScrollPane8.setBackground(new java.awt.Color(0, 102, 102));

        tablarecursos.setBackground(new java.awt.Color(216, 248, 247));
        tablarecursos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        tablarecursos.setFont(new java.awt.Font("Yu Gothic UI", 2, 12)); // NOI18N
        tablarecursos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Recurso", "Estado", "Procesos"
            }
        ));
        jScrollPane8.setViewportView(tablarecursos);

        getContentPane().add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 407, 230, 190));

        jScrollPane9.setBackground(new java.awt.Color(0, 102, 102));

        tablaEnproceso.setBackground(new java.awt.Color(255, 204, 204));
        tablaEnproceso.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        tablaEnproceso.setFont(new java.awt.Font("Yu Gothic UI", 2, 12)); // NOI18N
        tablaEnproceso.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Proceso", "Peso"
            }
        ));
        jScrollPane9.setViewportView(tablaEnproceso);

        getContentPane().add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 40, 200, 150));

        jScrollPane10.setBackground(new java.awt.Color(0, 102, 102));

        tablaListaPro.setBackground(new java.awt.Color(0, 0, 0));
        tablaListaPro.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        tablaListaPro.setFont(new java.awt.Font("Yu Gothic UI", 2, 12)); // NOI18N
        tablaListaPro.setForeground(new java.awt.Color(255, 255, 255));
        tablaListaPro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Tamaño", "Numero de hilos", "Recursos", "Estado"
            }
        ));
        jScrollPane10.setViewportView(tablaListaPro);

        getContentPane().add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 714, 180));

        jLabel6.setBackground(new java.awt.Color(0, 102, 102));
        jLabel6.setText("Recursos");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 380, 120, -1));

        jScrollPane11.setBackground(new java.awt.Color(0, 102, 102));

        tablaTerminado.setBackground(new java.awt.Color(255, 255, 204));
        tablaTerminado.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        tablaTerminado.setFont(new java.awt.Font("Yu Gothic UI", 2, 12)); // NOI18N
        tablaTerminado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Proceso", "Peso"
            }
        ));
        jScrollPane11.setViewportView(tablaTerminado);

        getContentPane().add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 40, 215, 150));

        jLabel7.setBackground(new java.awt.Color(0, 102, 102));
        jLabel7.setText("lista de procesos");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 82, -1));

        butonNuevo.setBackground(new java.awt.Color(0, 0, 0));
        butonNuevo.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        butonNuevo.setForeground(new java.awt.Color(255, 255, 255));
        butonNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Controlador/iNSERTAR RPOCESO.png"))); // NOI18N
        butonNuevo.setText("Nuevo proceso");
        butonNuevo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        butonNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butonNuevoActionPerformed(evt);
            }
        });
        getContentPane().add(butonNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 610, 98, 73));

        botonEjecutar.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        botonEjecutar.setForeground(new java.awt.Color(255, 255, 255));
        botonEjecutar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Controlador/1154606.png"))); // NOI18N
        botonEjecutar.setText("Ejecutar");
        botonEjecutar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonEjecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEjecutarActionPerformed(evt);
            }
        });
        getContentPane().add(botonEjecutar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 610, 97, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        jLabel8.setText("INSERTAR PROCESO");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 690, 120, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        jLabel9.setText("COMENZAR");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 690, -1, -1));

        flecha6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Sin título.png"))); // NOI18N
        getContentPane().add(flecha6, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 70, 130, 80));

        flecha7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Sin título.png"))); // NOI18N
        getContentPane().add(flecha7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 130, 80));

        flecha8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Sin título.png"))); // NOI18N
        getContentPane().add(flecha8, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 70, 130, 80));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/diagonal.png"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, 110, 80));

        flecha4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/diagonal2.png"))); // NOI18N
        getContentPane().add(flecha4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 190, 140, 80));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void butonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butonNuevoActionPerformed

        Vista_Chiquita ob = new Vista_Chiquita(this, true);
        ob.show();
        llenarnuevo();
        llenarListaPro();
    }//GEN-LAST:event_butonNuevoActionPerformed

    private void botonEjecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEjecutarActionPerformed
        if(recursos.size()==0){
            System.out.println("entro");
            llenar_recursos();
        }
        
   
            
        
        Proceso aux = new Proceso();
        limpiarnuevo();
        for (Proceso pro : prosesosN) {
            if(pro.getEstado().equals("nuevo")){
            pro.setEstado("listo");
            
            }
        }
        llenarlisto();
        limpiarnuevo();
        llenarListaPro();

        Ejecutar();
        for(Proceso pro: prosesosN){
            pro.toString();
        }
    }//GEN-LAST:event_botonEjecutarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    public void Thread() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void Ejecutar() {
        new Thread() {
            @Override
            public void run() {
                while (tablalisto.getModel().getRowCount() != 0) {
                    for (Proceso pro : prosesosN) {
                        if (validarRecursos(pro) && pro.getTamano()>0) {
                            pro.setEstado("listo");
                        }
                        if (pro.getEstado().equals("listo") && pro.getTamano() > 0) {
                            if (validaEjecu(pro)) {
                                if (pro.getTamano() != 0) {
                                    pro.setEstado("ejecucion");
                                    limpiarREcursos();
                                    llenarRecursos();
                                    llenarListaPro();
                                    limpiarlisto();
                                    llenarlisto();
                                    llenarejecucion();
                                    Thread();
                                    pro.setTamano(pro.getTamano() - 1);

                                    if (ramdon() == true) {
                                        limpiarREcursos();
                                        llenarRecursos();
                                        liberarRecursos();
                                        limpiarBloqueado();
                                        pasarListo();
                                        llenarlisto();
                                    }

                                    if (pro.getTamano() > 0) {
                                        pro.setEstado("listo");
                                        limpiarejecucion();
                                        llenarlisto();
                                    } else {
                                        pro.setEstado("terminado");
                                        liberarRecursos();
                                        limpiarTerminado();
                                        llenarterm();
                                        
                                        limpiarejecucion();
                                        limpiarBloqueado();
                                        llenarRecursos();
                                    }
                                    llenarListaPro();
                                } else {
                                    break;
                                }
                            } else {
                                pro.setEstado("bloqueado");
                                llenarbloq();
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
            }
        }
        limpiarlisto();
        llenarlisto();
    }

    public boolean ramdon() {
        int numero = (int) (Math.random() * 2 + 1);
        if (numero ==3) {
            System.out.println("va a limpar recursos");
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
                    if (recursos.get(i).isEstado() != true && recursos.get(i).getProceso().getId() != pro.getId()) {
                        estado++;
                    }
                    if (recursos.get(i).isEstado() != true && recursos.get(i).getProceso().getId() == pro.getId()) {
                        return true;
                    }
                }
            }

        }
        if (estado == 0) {
            return true;
        } else {
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
                    if (recursos.get(i).isEstado() != true && recursos.get(i).getProceso().getId() != pro.getId()) {
                        estado++;
                    }
                    if (recursos.get(i).isEstado() != true && recursos.get(i).getProceso().getId() == pro.getId()) {
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
                        recursos.get(i).setProceso(pro);
                        recursos.get(i).setEstado(false);
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
    private javax.swing.JLabel flecha4;
    private javax.swing.JLabel flecha6;
    private javax.swing.JLabel flecha7;
    private javax.swing.JLabel flecha8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
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
