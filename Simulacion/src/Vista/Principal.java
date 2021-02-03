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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N

        jLabel1.setBackground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Nuevo");

        jLabel2.setBackground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("Listo");

        jLabel3.setBackground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("En proceso");

        jLabel4.setBackground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("Terminado");

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

        jLabel5.setBackground(new java.awt.Color(0, 102, 102));
        jLabel5.setText("Bloqueado");

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

        jLabel6.setBackground(new java.awt.Color(0, 102, 102));
        jLabel6.setText("Recursos");

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

        jLabel7.setBackground(new java.awt.Color(0, 102, 102));
        jLabel7.setText("lista de procesos");

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

        jLabel8.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        jLabel8.setText("INSERTAR PROCESO");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        jLabel9.setText("EJECUTAR");

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
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                        .addGap(134, 134, 134))
                                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addGap(632, 632, 632)))
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(334, 334, 334))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addGap(155, 155, 155))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addGap(556, 556, 556)
                                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(butonNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel8))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel9))
                                    .addComponent(botonEjecutar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 740, Short.MAX_VALUE)))
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
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel6)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                        .addGap(109, 109, 109))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(butonNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonEjecutar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(21, 21, 21))))
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
        limpiarREcursos();
        llenar_recursos();
        Proceso aux = new Proceso();
        limpiarnuevo();
        for (Proceso pro : prosesosN) {
            pro.setEstado("listo");
            llenarlisto();
        }
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
    private javax.swing.JLabel jLabel1;
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
