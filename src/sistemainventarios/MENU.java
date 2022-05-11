package sistemainventarios;

import ConexionDB.SqlConexion;
import com.itextpdf.kernel.geom.PageSize;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import com.itextpdf.kernel.pdf.*;
import com.itextpdf.layout.Document;
import com.itextpdf.io.image.*;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.borders.Border;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.property.TextAlignment;
import java.io.*;
import java.net.MalformedURLException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class MENU extends javax.swing.JFrame {

    SqlConexion cc = new SqlConexion();
    Connection con = cc.conexion();

    DefaultTableModel modelo2;

    public MENU() {
        initComponents();
        this.tabla.setDefaultRenderer(Object.class, new ColorFilas());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        R = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        OOOO = new javax.swing.JLabel();
        I = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        RES = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        LR = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        PanelGeneral = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        P2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        filtro = new javax.swing.JComboBox<>();
        CambiarEstado = new javax.swing.JButton();
        P3 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        resguardante = new javax.swing.JTextField();
        depa = new javax.swing.JTextField();
        numem = new javax.swing.JTextField();
        Puesto = new javax.swing.JTextField();
        Empresa = new javax.swing.JTextField();
        Lugar = new javax.swing.JTextField();
        Tipo = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaResguardo = new javax.swing.JTable();
        RG = new javax.swing.JButton();
        AgregarFilaTabla = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        TipoAdquisicion = new javax.swing.JTextField();
        Equipo = new javax.swing.JComboBox<>();
        NEquipo = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        P1 = new javax.swing.JPanel();
        departamento = new javax.swing.JComboBox<>();
        equipo = new javax.swing.JComboBox<>();
        marca = new javax.swing.JComboBox<>();
        serie = new javax.swing.JTextField();
        modelo = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        Color = new javax.swing.JTextField();
        IdInventario = new javax.swing.JTextField();
        jPanel16 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaListaResguardo = new javax.swing.JTable();
        imprimir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 51, 153));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/vidant.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 33, 214, 171));

        R.setForeground(new java.awt.Color(102, 102, 102));
        R.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                RMouseMoved(evt);
            }
        });
        R.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                RMousePressed(evt);
            }
        });
        R.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        R.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 16, -1, -1));

        OOOO.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        OOOO.setForeground(new java.awt.Color(102, 102, 102));
        OOOO.setText("INVENTARIO");
        R.add(OOOO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 114, 36));

        jPanel3.add(R, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 180, 40));

        I.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                IMouseMoved(evt);
            }
        });
        I.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                IMouseExited(evt);
            }
        });
        I.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        I.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 11, -1, 40));

        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("RESGUARDO");
        I.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        jPanel3.add(I, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 180, 40));

        RES.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                RESMouseMoved(evt);
            }
        });
        RES.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RESMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RESMouseExited(evt);
            }
        });
        RES.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        RES.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 24, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("REGISTRO");
        RES.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, 21));

        jPanel3.add(RES, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 180, 40));

        LR.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                LRMouseMoved(evt);
            }
        });
        LR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LRMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LRMouseExited(evt);
            }
        });
        LR.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        LR.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 11, -1, 40));

        jLabel34.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(102, 102, 102));
        jLabel34.setText("REGUARDOS LISTA");
        LR.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        jPanel3.add(LR, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 180, 40));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 790));

        jPanel1.setBackground(new java.awt.Color(0, 51, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("GRUPO VIDANTA");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, -1, -1));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 1050, 140));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logoVidanta.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(294, 294, 294)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(389, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(290, Short.MAX_VALUE))
        );

        PanelGeneral.addTab("tab4", jPanel4);

        P2.setBackground(new java.awt.Color(102, 102, 255));
        P2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabla.setBackground(new java.awt.Color(204, 255, 204));
        tabla.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabla.setGridColor(new java.awt.Color(153, 153, 255));
        tabla.setRowHeight(20);
        jScrollPane1.setViewportView(tabla);

        P2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 900, 500));

        jButton2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jButton2.setText("BUSCAR TODOS LOS DATOS");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        P2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 50, -1, -1));

        jButton3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jButton3.setText("FILTRAR BUSQUEDA");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        P2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 90, -1, -1));

        filtro.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        filtro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR", "CPU", "MONITOR", "IMPRESORA", "LAPTOP", "TELÉFONO IP CISCO", "TELÉFONO IP AVAYA", "ACCESS POINT", "AUDIO", "SWICHT", "PANTALLA" }));
        P2.add(filtro, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 90, -1, -1));

        CambiarEstado.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        CambiarEstado.setText("Cambiar Estado");
        CambiarEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CambiarEstadoActionPerformed(evt);
            }
        });
        P2.add(CambiarEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        PanelGeneral.addTab("tab2", P2);

        P3.setBackground(new java.awt.Color(204, 204, 255));
        P3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel20.setText("Resguardante:");
        P3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, -1, -1));

        jLabel21.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel21.setText("Departamento:");
        P3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, -1, -1));

        jLabel22.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel22.setText("Num. Empleado:");
        P3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, -1, -1));

        jLabel23.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel23.setText("Puesto:");
        P3.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 80, -1, -1));

        jLabel24.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel24.setText("EQUIPO:");
        P3.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        jLabel25.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel25.setText("Lugar y Fecha:");
        P3.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 160, -1, -1));

        jLabel26.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel26.setText("Empresa:");
        P3.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 120, -1, -1));

        jLabel27.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel27.setText("Tipo de Adquisición:");
        P3.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 240, -1, -1));

        resguardante.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        P3.add(resguardante, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 203, -1));

        depa.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        P3.add(depa, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 203, -1));

        numem.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        P3.add(numem, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 203, -1));

        Puesto.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        P3.add(Puesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 80, 203, -1));

        Empresa.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        P3.add(Empresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 120, 203, -1));

        Lugar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        P3.add(Lugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 160, 203, -1));

        Tipo.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        Tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipoActionPerformed(evt);
            }
        });
        P3.add(Tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 200, 203, -1));

        jLabel28.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel28.setText("RESGUARDO");
        P3.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(414, 11, -1, -1));

        tablaResguardo.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        tablaResguardo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tablaResguardo);

        P3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 820, 210));

        RG.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        RG.setText("REGISTRAR");
        RG.setBorderPainted(false);
        RG.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                RGMouseMoved(evt);
            }
        });
        RG.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RGMouseExited(evt);
            }
        });
        RG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RGActionPerformed(evt);
            }
        });
        P3.add(RG, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 290, 200, -1));

        AgregarFilaTabla.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        AgregarFilaTabla.setText("Agregar");
        AgregarFilaTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarFilaTablaActionPerformed(evt);
            }
        });
        P3.add(AgregarFilaTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 280, 100, 30));

        jLabel31.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel31.setText("Tipo de Movimiento:");
        P3.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 200, -1, -1));

        TipoAdquisicion.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        TipoAdquisicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipoAdquisicionActionPerformed(evt);
            }
        });
        P3.add(TipoAdquisicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 240, 203, -1));

        Equipo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        Equipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EquipoActionPerformed(evt);
            }
        });
        P3.add(Equipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, 160, -1));

        NEquipo.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        P3.add(NEquipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, 160, -1));

        jButton4.setBackground(new java.awt.Color(255, 0, 0));
        jButton4.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Remover");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        P3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 350, -1, -1));

        PanelGeneral.addTab("tab3", P3);

        P1.setBackground(new java.awt.Color(102, 102, 255));
        P1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        departamento.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        departamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR", "TI", "VRM" }));
        departamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                departamentoActionPerformed(evt);
            }
        });
        P1.add(departamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 223, 42));

        equipo.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        equipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR", "CPU", "MONITOR", "IMPRESORA", "LAPTOP", "TELÉFONO IP CISCO", "TELÉFONO IP AVAYA", "ACCESS POINT", "AUDIO", "SWICHT", "PANTALLA" }));
        P1.add(equipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 220, 42));

        marca.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        marca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR", "DELL", "HP", "CISCO" }));
        P1.add(marca, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 220, 42));

        serie.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        serie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serieActionPerformed(evt);
            }
        });
        P1.add(serie, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, 211, 40));

        modelo.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        P1.add(modelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, 210, 40));

        jPanel10.setBackground(new java.awt.Color(0, 0, 153));

        jLabel10.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Departamento");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel15))
                .addGap(28, 28, 28))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        P1.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 220, 40));

        jPanel11.setBackground(new java.awt.Color(0, 0, 153));

        jLabel9.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Equipo");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jLabel9)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        P1.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 220, 40));

        jPanel12.setBackground(new java.awt.Color(0, 0, 153));

        jLabel11.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Marca");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addGap(63, 63, 63)
                .addComponent(jLabel11)
                .addContainerGap(82, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(jLabel11)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        P1.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 220, 40));

        jPanel13.setBackground(new java.awt.Color(0, 0, 153));

        jLabel12.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Numero de Serie");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        P1.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, 210, 40));

        jPanel14.setBackground(new java.awt.Color(0, 0, 153));

        jLabel13.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Modelo");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13)
                .addGap(67, 67, 67))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addComponent(jLabel13)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        P1.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, 210, 40));

        jButton1.setBackground(new java.awt.Color(0, 0, 153));
        jButton1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("REGISTRAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        P1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 420, 210, -1));

        jPanel15.setBackground(new java.awt.Color(0, 0, 153));

        jLabel29.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Color");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap(76, Short.MAX_VALUE)
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel29)
                .addGap(71, 71, 71))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel30)
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addComponent(jLabel29)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        P1.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 250, 210, 40));

        Color.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        P1.add(Color, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 300, 210, 40));

        IdInventario.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        IdInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdInventarioActionPerformed(evt);
            }
        });
        P1.add(IdInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 80, 211, 40));

        jPanel16.setBackground(new java.awt.Color(0, 0, 153));

        jLabel32.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Id Inventario");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel33)
                .addGap(30, 30, 30)
                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel33)
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addComponent(jLabel32)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        P1.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 30, 210, 40));

        PanelGeneral.addTab("tab1", P1);

        jLabel35.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel35.setText("LISTA DE RESGUARDO");

        tablaListaResguardo.setBackground(new java.awt.Color(204, 255, 204));
        tablaListaResguardo.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        tablaListaResguardo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaListaResguardo.setRowHeight(20);
        jScrollPane3.setViewportView(tablaListaResguardo);

        imprimir.setBackground(new java.awt.Color(204, 204, 255));
        imprimir.setFont(new java.awt.Font("Century Gothic", 1, 17)); // NOI18N
        imprimir.setText("IMPRIMIR");
        imprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imprimirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(383, 383, 383)
                        .addComponent(jLabel35))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 801, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(imprimir)))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel35)
                .addGap(51, 51, 51)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imprimir))
                .addContainerGap(146, Short.MAX_VALUE))
        );

        PanelGeneral.addTab("tab5", jPanel5);

        jPanel2.add(PanelGeneral, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 1070, 680));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1217, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 787, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void departamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_departamentoActionPerformed

    }//GEN-LAST:event_departamentoActionPerformed

    private void serieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serieActionPerformed
    }//GEN-LAST:event_serieActionPerformed

    private void RMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RMouseClicked
        PanelGeneral.setSelectedIndex(1);
    }//GEN-LAST:event_RMouseClicked

    private void RMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RMouseMoved
        R.setBackground(new Color(214, 180, 248));
    }//GEN-LAST:event_RMouseMoved

    private void RMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RMouseExited
        R.setBackground(new Color(242, 230, 255));
    }//GEN-LAST:event_RMouseExited

    private void IMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IMouseClicked
        PanelGeneral.setSelectedIndex(2);
        BusquedaResguardo();
        Equipo.removeAllItems();

        BuscarEquipo();


    }//GEN-LAST:event_IMouseClicked

    private void RESMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RESMouseClicked
        PanelGeneral.setSelectedIndex(3);

    }//GEN-LAST:event_RESMouseClicked

    private void RMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RMousePressed

    }//GEN-LAST:event_RMousePressed

    private void IMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IMouseMoved
        I.setBackground(new Color(214, 180, 248));

    }//GEN-LAST:event_IMouseMoved

    private void RESMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RESMouseMoved
        RES.setBackground(new Color(214, 180, 248));

    }//GEN-LAST:event_RESMouseMoved

    private void IMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IMouseExited
        I.setBackground(new Color(242, 230, 255));
    }//GEN-LAST:event_IMouseExited

    private void RESMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RESMouseExited
        RES.setBackground(new Color(242, 230, 255));
    }//GEN-LAST:event_RESMouseExited

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        PanelGeneral.setSelectedIndex(0);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Insertar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        BusquedaGeneral();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        BusquedaFiltrada();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void RGMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RGMouseMoved
        RG.setBackground(new Color(214, 180, 248));
    }//GEN-LAST:event_RGMouseMoved

    private void RGMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RGMouseExited
        RG.setBackground(new Color(242, 230, 255));
    }//GEN-LAST:event_RGMouseExited

    private void RGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RGActionPerformed
        RegistrarResguardo();
        CorrerFunciones();
        BusquedaResguardo();
        Equipo.removeAllItems();
        BuscarEquipo();
    }//GEN-LAST:event_RGActionPerformed


    private void TipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TipoActionPerformed

    private void TipoAdquisicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipoAdquisicionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TipoAdquisicionActionPerformed

    private void IdInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdInventarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IdInventarioActionPerformed

    private void AgregarFilaTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarFilaTablaActionPerformed
        modelo2 = (DefaultTableModel) tablaResguardo.getModel();
        Object[] fila = new Object[5];

        if (Equipo.getSelectedItem().toString().equals("Seleccionar")) {
            JOptionPane.showMessageDialog(null, "Error, Elija una Opcion Valida ");

        } else {
            try {
                String sql = ("SELECT Equipo, Serie, IdInventario, Color FROM sistemainventario.resgistro where IdInventario='" + Equipo.getSelectedItem().toString() + "';");
                PreparedStatement pst = con.prepareStatement(sql);

                ResultSet consul = pst.executeQuery();

                while (consul.next()) {

                    fila[0] = "1";
                    fila[1] = consul.getString("Equipo");
                    fila[2] = consul.getString("Serie");
                    fila[3] = consul.getString("IdInventario");
                    fila[4] = consul.getString("Color");
                }
                modelo2.addRow(fila);
                Equipo.setSelectedIndex(0);
                NEquipo.setText("");
            } catch (Exception e) {

            }

        }

    }//GEN-LAST:event_AgregarFilaTablaActionPerformed

    private void EquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EquipoActionPerformed
        try {
            String sql = ("SELECT Equipo FROM sistemainventario.resgistro where IdInventario='" + Equipo.getSelectedItem().toString() + "';");
            PreparedStatement pst = con.prepareStatement(sql);

            ResultSet consul = pst.executeQuery();

            while (consul.next()) {

                NEquipo.setText(consul.getString("Equipo"));

            }

        } catch (Exception e) {
        }


    }//GEN-LAST:event_EquipoActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int filaSeleccion = tablaResguardo.getSelectedRow();
        modelo2.removeRow(filaSeleccion);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void CambiarEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CambiarEstadoActionPerformed
        int filaSeleccion = tabla.getSelectedRow();

        String idInven = tabla.getValueAt(filaSeleccion, 9).toString();

        try {
            String sql = ("UPDATE `sistemainventario`.`resgistro` SET `Estatus` = 'Activado' WHERE (`IdInventario` = '" + idInven + "');");
            PreparedStatement pst = con.prepareStatement(sql);

            pst.execute();
            JOptionPane.showMessageDialog(null, "Se Activo un producto");

        } catch (Exception e) {
        }
        BusquedaGeneral();
    }//GEN-LAST:event_CambiarEstadoActionPerformed

    private void LRMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LRMouseMoved
        LR.setBackground(new Color(214, 180, 248));
    }//GEN-LAST:event_LRMouseMoved

    private void LRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LRMouseClicked
        PanelGeneral.setSelectedIndex(4);
        BusquedaListaResguardo();
    }//GEN-LAST:event_LRMouseClicked

    private void LRMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LRMouseExited
        LR.setBackground(new Color(242, 230, 255));
    }//GEN-LAST:event_LRMouseExited


    private void imprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imprimirActionPerformed
        int valorFila = tablaListaResguardo.getSelectedRow();

        int idResgu = Integer.parseInt(tablaListaResguardo.getValueAt(valorFila, 0).toString());

        String Resguardante = tablaListaResguardo.getValueAt(valorFila, 1).toString();
        String Departamento = tablaListaResguardo.getValueAt(valorFila, 2).toString();
        String NEmpleado = tablaListaResguardo.getValueAt(valorFila, 3).toString();
        String Puesto = tablaListaResguardo.getValueAt(valorFila, 4).toString();
        String Empresa = tablaListaResguardo.getValueAt(valorFila, 5).toString();
        String LugarF = tablaListaResguardo.getValueAt(valorFila, 6).toString();
        String TipoMovi = tablaListaResguardo.getValueAt(valorFila, 7).toString();
        String TipoAdqui = tablaListaResguardo.getValueAt(valorFila, 9).toString();

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yy HH-mm-ss");

        String fecha = dtf.format(LocalDateTime.now());
        String DEST = "C:/Users/Public/Documents/Reporte" + fecha + ".pdf";

        PdfDocument pdf = null;
        try {
            pdf = new PdfDocument(new PdfWriter(DEST));

        } catch (FileNotFoundException ex) {
            Logger.getLogger(MENU.class.getName()).log(Level.SEVERE, null, ex);
        }
        Document document = new Document(pdf, PageSize.LETTER.rotate());

        Image imagen = null;
        try {
            imagen = new Image(ImageDataFactory.create("src/img/vidan.png"));
        } catch (MalformedURLException ex) {
            Logger.getLogger(MENU.class.getName()).log(Level.SEVERE, null, ex);
        }

        document.add(imagen);
        document.add(new Paragraph("Resguardo de Hardware").setFontSize(26).setBold().setTextAlignment(TextAlignment.CENTER));

        Table tablapdf = new Table(2).setWidth(700);

        Cell cel1 = new Cell();
        cel1.setBorder(Border.NO_BORDER);
        cel1.add(new Paragraph("Resguardante: " + Resguardante).setFontSize(12).setMargin(0).setPadding(0)).setWidth(350);

        Cell cel2 = new Cell();
        cel2.setBorder(Border.NO_BORDER);
        cel2.add(new Paragraph("Lugar y Fecha: " + LugarF).setFontSize(12).setMargin(0).setPadding(0)).setWidth(350);

        Cell cel3 = new Cell();
        cel3.setBorder(Border.NO_BORDER);
        cel3.add(new Paragraph("Departamento: " + Departamento).setFontSize(12).setMargin(0).setPadding(0)).setWidth(350);

        Cell cel4 = new Cell();
        cel4.setBorder(Border.NO_BORDER);
        cel4.add(new Paragraph("Tipo de Movimiento: " + TipoMovi).setFontSize(12).setMargin(0).setPadding(0)).setWidth(350);

        Cell cel5 = new Cell();
        cel5.setBorder(Border.NO_BORDER);
        cel5.add(new Paragraph("Numero de Empleado: " + NEmpleado).setFontSize(12).setMargin(0).setPadding(0)).setWidth(350);

        Cell cel6 = new Cell();
        cel6.setBorder(Border.NO_BORDER);
        cel6.add(new Paragraph("Tipo de Adquisición: " + TipoAdqui).setFontSize(12).setMargin(0).setPadding(0)).setWidth(350);

        Cell cel7 = new Cell();
        cel7.setBorder(Border.NO_BORDER);
        cel7.add(new Paragraph("Puesto: " + Puesto).setFontSize(12).setMargin(0).setPadding(0)).setWidth(350);

        Cell cel8 = new Cell();
        cel8.setBorder(Border.NO_BORDER);
        cel8.add(new Paragraph(" ").setFontSize(12).setMargin(0).setPadding(0)).setWidth(350);

        Cell cel9 = new Cell();
        cel9.setBorder(Border.NO_BORDER);
        cel9.add(new Paragraph("Empresa: " + Empresa).setFontSize(12).setMargin(0).setPadding(0)).setWidth(350);

        Cell cel10 = new Cell();
        cel10.setBorder(Border.NO_BORDER);
        cel10.add(new Paragraph(" ").setFontSize(12).setMargin(0).setPadding(0)).setWidth(350);

        tablapdf.addCell(cel1);
        tablapdf.addCell(cel2);
        tablapdf.addCell(cel3);
        tablapdf.addCell(cel4);
        tablapdf.addCell(cel5);
        tablapdf.addCell(cel6);
        tablapdf.addCell(cel7);
        tablapdf.addCell(cel8);
        tablapdf.addCell(cel9);
        tablapdf.addCell(cel10);

        document.add(tablapdf);

        document.add(new Paragraph("HARDWARE").setFontSize(12).setTextAlignment(TextAlignment.CENTER).setWidth(700));

        Table tablapdf2 = new Table(5).setWidth(700);

        tablapdf2.addCell(new Paragraph("Qty").setFontSize(12).setWidth(100));
        tablapdf2.addCell(new Paragraph("Descripción del Bien").setFontSize(12).setWidth(150));
        tablapdf2.addCell(new Paragraph("N.Serie").setFontSize(12).setWidth(150));
        tablapdf2.addCell(new Paragraph("ID Inventario").setFontSize(12).setWidth(150));
        tablapdf2.addCell(new Paragraph("Color").setFontSize(12).setWidth(150));

        RetornoResguardo(idResgu, tablapdf2);

        document.add(tablapdf2);

        document.add(new Paragraph("\n\n"));

        Table tablapdf3 = new Table(3).setWidth(700);

        Cell cel11 = new Cell();
        cel11.setBorder(Border.NO_BORDER);
        cel11.add(new Paragraph(Resguardante).setFontSize(12).setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER)).setWidth(350).setMargin(0).setPadding(0);

        Cell cel12 = new Cell();
        cel12.setBorder(Border.NO_BORDER);
        cel12.add(new Paragraph("Williams Nava Díaz").setFontSize(12).setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER)).setWidth(350).setMargin(0).setPadding(0);

        Cell cel13 = new Cell();
        cel13.setBorder(Border.NO_BORDER);
        cel13.add(new Paragraph("Carlos Silva").setFontSize(12).setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER)).setWidth(350).setMargin(0).setPadding(0);

        Cell cel14 = new Cell();
        cel14.setBorder(Border.NO_BORDER);
        cel14.add(new Paragraph("__________________").setFontSize(12).setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER)).setWidth(350).setMargin(0).setPadding(0);

        Cell cel15 = new Cell();
        cel15.setBorder(Border.NO_BORDER);
        cel15.add(new Paragraph("__________________").setFontSize(12).setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER)).setWidth(350).setMargin(0).setPadding(0);

        Cell cel16 = new Cell();
        cel16.setBorder(Border.NO_BORDER);
        cel16.add(new Paragraph("__________________").setFontSize(12).setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER)).setWidth(350).setMargin(0).setPadding(0);

        Cell cel17 = new Cell();
        cel17.setBorder(Border.NO_BORDER);
        cel17.add(new Paragraph("Nombre y Firma del Responsable").setFontSize(12).setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER)).setWidth(350).setMargin(0).setPadding(0);

        Cell cel18 = new Cell();
        cel18.setBorder(Border.NO_BORDER);
        cel18.add(new Paragraph("Elaboró").setFontSize(12).setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER)).setWidth(350).setMargin(0).setPadding(0);

        Cell cel19 = new Cell();
        cel19.setBorder(Border.NO_BORDER);
        cel19.add(new Paragraph("VoBo").setFontSize(12).setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER)).setWidth(350).setMargin(0).setPadding(0);

        tablapdf3.addCell(cel11);
        tablapdf3.addCell(cel12);
        tablapdf3.addCell(cel13);
        tablapdf3.addCell(cel14);
        tablapdf3.addCell(cel15);
        tablapdf3.addCell(cel16);
        tablapdf3.addCell(cel17);
        tablapdf3.addCell(cel18);
        tablapdf3.addCell(cel19);

        document.add(tablapdf3);

        document.add(new Paragraph("Recivi de conformidad de Ventas Rivera Maya S.A. DE C.V. las herramientas de trabajo "
                + "activos y otros que estarasn bajo mi resguardo me comprometo a utilizar estos articulos en los terminos del "
                + "articulo No. 134 Fracc. VI de la ley federal de trabajo y en caso de perdida o mal uso, me obligo a cubir con cargo a mi sueldo"
                + "y al precio de reposicion(precio actual) de la fecha que se me indique el faltante, el valor de los articulos que se me "
                + "entregan deacuerdo con la disposición  de Art. No. 110 Fracc. I de la ley invocada. Dicho equipo podrá ser inventariado "
                + "y revisado en cualquier momento que sea solicitado en mi presencia por un representante autorizado por la empresa").setFontSize(8).setTextAlignment(TextAlignment.JUSTIFIED));

        document.close();

        JOptionPane.showMessageDialog(null, "SE CREO EL PDF" );


    }//GEN-LAST:event_imprimirActionPerformed

    public void RetornoResguardo(int idresguardo, Table tabla) {

        int respuesta = 0;
        try {
            String sql = ("select * from sistemainventario.regis_reguar where idResguardo='" + idresguardo + "'");
            PreparedStatement pst = con.prepareStatement(sql);

            ResultSet consul = pst.executeQuery();

            while (consul.next()) {

                respuesta = Integer.parseInt(consul.getString("idResgistro"));
                buscarRegistro(respuesta, tabla);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error Retorno Resguardo" + e.getMessage());
        }

    }

    public void buscarRegistro(int respuesta, Table tabla) {
        try {
            String sql = ("select r.Equipo, r.Serie, r.IdInventario, r.Color from sistemainventario.resgistro r "
                    + "where r.idResgistro='" + respuesta + "';");
            PreparedStatement pst = con.prepareStatement(sql);

            ResultSet consul = pst.executeQuery();

            while (consul.next()) {
                String Eq = consul.getString("r.Equipo");
                String Se = consul.getString("r.Serie");
                String II = consul.getString("r.IdInventario");
                String Co = consul.getString("r.Color");

                tabla.addCell(new Paragraph("1").setFontSize(12).setWidth(100));
                tabla.addCell(new Paragraph(Eq).setFontSize(12).setWidth(150));
                tabla.addCell(new Paragraph(Se).setFontSize(12).setWidth(150));
                tabla.addCell(new Paragraph(II).setFontSize(12).setWidth(150));
                tabla.addCell(new Paragraph(Co).setFontSize(12).setWidth(150));
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error Retorno Registro" + e.getMessage());
        }
    }

    public void CorrerFunciones() {
        int CantidadFila = tablaResguardo.getRowCount();

        for (int i = 0; i < CantidadFila; i++) {
            String serie = tablaResguardo.getValueAt(i, 2).toString();
            int serieRegistro = Registro(serie);
            int ultimoResguardo = UltimoResguardo();
            InsersionRegisRegu(serieRegistro, ultimoResguardo);
            CambioEstado(serie);

        }
    }

    public int UltimoResguardo() {
        int NumeroRegistro = 0;
        try {
            String sql = ("SELECT MAX(idResguardo) AS idResguardo FROM sistemainventario.resguardo;");
            PreparedStatement pst = con.prepareStatement(sql);

            ResultSet consul = pst.executeQuery();

            while (consul.next()) {

                NumeroRegistro = Integer.parseInt(consul.getString("idResguardo"));

            }

        } catch (SQLException e) {
            System.out.println("Error al Traer el Resguardo");
        }
        return NumeroRegistro;
    }

    public int Registro(String serie) {
        int r = 0;
        try {
            String sql = ("SELECT idResgistro FROM sistemainventario.resgistro where serie='" + serie + "';");
            PreparedStatement pst = con.prepareStatement(sql);

            ResultSet consul = pst.executeQuery();

            while (consul.next()) {

                r = Integer.parseInt(consul.getString("idResgistro"));

            }

        } catch (SQLException e) {
            System.out.println("Error al Traer el Registro");
        }

        return r;
    }

    public void CambioEstado(String serie) {

        int idRegistro = Registro(serie);
        try {
            String sql = ("UPDATE `sistemainventario`.`resgistro` SET `Estatus` = 'Desactivado' WHERE (`idResgistro` = '" + idRegistro + "');");
            PreparedStatement pst = con.prepareStatement(sql);

            pst.execute();
        } catch (Exception e) {
        }

    }

    public void InsersionRegisRegu(int regis, int resgu) {
        try {
            String sql = ("INSERT INTO `sistemainventario`.`regis_reguar` (`idResgistro`, `idResguardo`) "
                    + "VALUES ('" + regis + "', '" + resgu + "');");
            PreparedStatement pst = con.prepareStatement(sql);

            pst.execute();
            JOptionPane.showMessageDialog(null, "Se Registraron los productos con exito ");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error Nose Pudo Registrar " + e.getMessage());

        }

    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MENU().setVisible(true);
            }
        });
    }

    public void Insertar() {

        if (departamento.getSelectedItem().toString().equals("SELECCIONAR") || equipo.getSelectedItem().toString().equals("SELECCIONAR")
                || marca.getSelectedItem().toString().equals("SELECCIONAR") || serie.getText().equals("") || modelo.getText().equals("")
                || Color.getText().equals("") || IdInventario.getText().equals("")) {

            JOptionPane.showMessageDialog(null, "Rellene los Campos Vacios o Seleccione un Valor Correcto");

        } else {
            try {
                String sql = ("INSERT INTO `sistemainventario`.`resgistro` (`Departamento`, `Equipo`, "
                        + "`Marca`, `Serie`, `Modelo`,`FechaEquipo`,`Color`,`Estatus`,`IdInventario`) VALUES ('" + departamento.getSelectedItem().toString() + "', "
                        + "'" + equipo.getSelectedItem().toString() + "', '" + marca.getSelectedItem().toString() + "', "
                        + "'" + serie.getText() + "','" + modelo.getText() + "','" + LocalDateTime.now() + "','" + Color.getText() + "',"
                        + "'Activado', '" + IdInventario.getText() + "');");
                PreparedStatement pst = con.prepareStatement(sql);

                pst.execute();

                JOptionPane.showMessageDialog(null, "Se Registro el Equipo");

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error Nose Pudo Registrar " + e.getMessage());

            }

            departamento.setSelectedIndex(0);
            equipo.setSelectedIndex(0);
            marca.setSelectedIndex(0);
            serie.setText("");
            modelo.setText("");
            Color.setText("");
            IdInventario.setText("");
        }

    }

    public void BusquedaListaResguardo() {
        DefaultTableModel modelo = new DefaultTableModel();
        tablaListaResguardo.setModel(modelo);

        try {
            String sql = ("SELECT * FROM sistemainventario.resguardo order by idResguardo DESC;");
            PreparedStatement pst = con.prepareStatement(sql);

            pst.executeQuery();

            ResultSet consul = pst.executeQuery();
            ResultSetMetaData rsmd = consul.getMetaData();
            int cantidadColumnas = rsmd.getColumnCount();

            modelo.addColumn("ID");
            modelo.addColumn("RESGUARDANTE");
            modelo.addColumn("DEPARTAMENTO");
            modelo.addColumn("NUMERO DE EMPLEADO");
            modelo.addColumn("PUESTO");
            modelo.addColumn("EMPRESA");
            modelo.addColumn("LUGAR Y FECHA");
            modelo.addColumn("TIPO DE MOVIMIENTO");
            modelo.addColumn("FECHA DE REGISTRO");
            modelo.addColumn("TIPO DE ADQUISICIÓN");

            while (consul.next()) {
                Object[] filas = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = consul.getObject(i + 1);

                }
                modelo.addRow(filas);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error Nose Pudo Obtener los Datos " + e.getMessage());

        }
    }

    public void BusquedaGeneral() {
        DefaultTableModel modelo = new DefaultTableModel();
        tabla.setModel(modelo);

        try {
            String sql = ("SELECT * FROM sistemainventario.resgistro;");
            PreparedStatement pst = con.prepareStatement(sql);

            pst.executeQuery();

            ResultSet consul = pst.executeQuery();
            ResultSetMetaData rsmd = consul.getMetaData();
            int cantidadColumnas = rsmd.getColumnCount();

            modelo.addColumn("ID");
            modelo.addColumn("DEPARTAMENTO");
            modelo.addColumn("EQUIPO");
            modelo.addColumn("MARCA");
            modelo.addColumn("SERIE");
            modelo.addColumn("MODELO");
            modelo.addColumn("FECHA");
            modelo.addColumn("COLOR");
            modelo.addColumn("ESTATUS");
            modelo.addColumn("ID INVENTARIO");

            while (consul.next()) {
                Object[] filas = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = consul.getObject(i + 1);

                }
                modelo.addRow(filas);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error Nose Pudo Obtener los Datos " + e.getMessage());

        }

    }

    public void BusquedaFiltrada() {
        DefaultTableModel modelo = new DefaultTableModel();
        tabla.setModel(modelo);

        if (filtro.getSelectedItem().toString().equals("SELECCIONAR")) {

            JOptionPane.showMessageDialog(null, "Por Favor Seleccione un Campo Valido");

        } else {
            try {
                String sql = ("SELECT * FROM sistemainventario.resgistro where Equipo = '" + filtro.getSelectedItem().toString() + "';");
                PreparedStatement pst = con.prepareStatement(sql);

                pst.executeQuery();

                ResultSet consul = pst.executeQuery();
                ResultSetMetaData rsmd = consul.getMetaData();
                int cantidadColumnas = rsmd.getColumnCount();

                modelo.addColumn("ID");
                modelo.addColumn("DEPARTAMENTO");
                modelo.addColumn("EQUIPO");
                modelo.addColumn("MARCA");
                modelo.addColumn("SERIE");
                modelo.addColumn("MODELO");
                modelo.addColumn("FECHA");

                while (consul.next()) {
                    Object[] filas = new Object[cantidadColumnas];
                    for (int i = 0; i < cantidadColumnas; i++) {
                        filas[i] = consul.getObject(i + 1);
                    }
                    modelo.addRow(filas);
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error Nose Pudo Obtener los Datos " + e.getMessage());

            }
        }
    }

    public void RegistrarResguardo() {
        if (resguardante.getText().equals("") || depa.getText().equals("") || numem.getText().equals("")
                || Puesto.getText().equals("") || Empresa.getText().equals("") || Lugar.getText().equals("") || Tipo.getText().equals("")
                || TipoAdquisicion.getText().equals("")) {

            JOptionPane.showMessageDialog(null, "Rellene los Campos Vacios");

        } else {
            try {
                String sql = ("INSERT INTO `sistemainventario`.`resguardo` (`Resguardante`, `Departamento`, `NumeroEmpleado`, "
                        + "`Puesto`, `Empresa`, `LugarFecha`, `TipoMovimiento`, `Fecha`,`TipoAdquisicion`) "
                        + "VALUES ('" + resguardante.getText() + "', '" + depa.getText() + "', '" + numem.getText() + "', '" + Puesto.getText() + "', '" + Empresa.getText() + "', "
                        + "'" + Lugar.getText() + "', '" + Tipo.getText() + "', '" + LocalDateTime.now() + "', '" + TipoAdquisicion.getText() + "');");
                PreparedStatement pst = con.prepareStatement(sql);

                pst.execute();

                JOptionPane.showMessageDialog(null, "Se Registro un Resguardo");

                resguardante.setText("");
                depa.setText("");
                numem.setText("");
                Puesto.setText("");
                Empresa.setText("");
                Lugar.setText("");
                Tipo.setText("");
                TipoAdquisicion.setText("");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error Nose Pudo Registrar " + e.getMessage());

            }

        }

    }

    public void BusquedaResguardo() {
        DefaultTableModel modelo = new DefaultTableModel();
        tablaResguardo.setModel(modelo);

        modelo.addColumn("Qty");
        modelo.addColumn("Descripción del Bien");
        modelo.addColumn("N. de Serie");
        modelo.addColumn("ID Inventario");
        modelo.addColumn("Color");

    }

    public void BuscarEquipo() {

        try {
            String sql = ("SELECT Estatus, IdInventario FROM sistemainventario.resgistro where Estatus='Activado';");
            PreparedStatement pst = con.prepareStatement(sql);

            ResultSet consul = pst.executeQuery();

            Equipo.addItem("Seleccionar");
            while (consul.next()) {

                Equipo.addItem(consul.getString("IdInventario"));

            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error " + e.getMessage());
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarFilaTabla;
    private javax.swing.JButton CambiarEstado;
    private javax.swing.JTextField Color;
    private javax.swing.JTextField Empresa;
    private javax.swing.JComboBox<String> Equipo;
    private javax.swing.JPanel I;
    private javax.swing.JTextField IdInventario;
    private javax.swing.JPanel LR;
    private javax.swing.JTextField Lugar;
    private javax.swing.JTextField NEquipo;
    private javax.swing.JLabel OOOO;
    private javax.swing.JPanel P1;
    private javax.swing.JPanel P2;
    private javax.swing.JPanel P3;
    private javax.swing.JTabbedPane PanelGeneral;
    private javax.swing.JTextField Puesto;
    private javax.swing.JPanel R;
    private javax.swing.JPanel RES;
    private javax.swing.JButton RG;
    private javax.swing.JTextField Tipo;
    private javax.swing.JTextField TipoAdquisicion;
    private javax.swing.JTextField depa;
    private javax.swing.JComboBox<String> departamento;
    private javax.swing.JComboBox<String> equipo;
    private javax.swing.JComboBox<String> filtro;
    private javax.swing.JButton imprimir;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JComboBox<String> marca;
    private javax.swing.JTextField modelo;
    private javax.swing.JTextField numem;
    private javax.swing.JTextField resguardante;
    private javax.swing.JTextField serie;
    private javax.swing.JTable tabla;
    private javax.swing.JTable tablaListaResguardo;
    private javax.swing.JTable tablaResguardo;
    // End of variables declaration//GEN-END:variables
}
