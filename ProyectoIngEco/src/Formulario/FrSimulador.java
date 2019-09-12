package Formulario;

import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Diana Pinzon O
 */

public class FrSimulador extends javax.swing.JFrame {
    public DefaultTableModel tabla;
    public NumberFormat nf = NumberFormat.getNumberInstance(Locale.getDefault());
    public Calendar fecha = new GregorianCalendar();
    public int año = fecha.get(Calendar.YEAR);
    public int mes = fecha.get(Calendar.MONTH) + 1;
    public int dia = fecha.get(Calendar.DAY_OF_MONTH);
    public float pagos = 0f;
    public float dias = 0f;
    public float periodos = 0f;
    public float meses = 0f;
    public float gracia = 0f;
    public float cuotas = 0f;
    public float ip = 0f;
    public float ea = 0f;
    public float na = 0f;
    public float A = 0f;
    public int f = 0;
    public float p = 0f;
    public Formulas calculo = new Formulas();
    public Locale locale = new Locale("es", "CO");
    public DecimalFormat formato = new DecimalFormat("0.00");
    /**
     * Crear nuevo form FrSimulador
     */
    public FrSimulador() {
        initComponents();
        lst_PeriodoGracia.setVisible(false);
        TiempoDeGracia.setVisible(false);
        tabla = (DefaultTableModel) tab_Cuadro_Resultados.getModel();
    }
    String plazo = "";
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TiposDeCredito = new javax.swing.ButtonGroup();
        TituloBanco = new javax.swing.JLabel();
        LogoBanco = new javax.swing.JLabel();
        Nombre = new javax.swing.JLabel();
        Cedula = new javax.swing.JLabel();
        MontoDelPrestamo = new javax.swing.JLabel();
        txt_Nombre = new javax.swing.JTextField();
        txt_Cedula = new javax.swing.JTextField();
        txt_Monto = new javax.swing.JTextField();
        Pn_TipoCredito = new javax.swing.JPanel();
        opt_CuotaFija = new javax.swing.JRadioButton();
        opt_PeriodoDeGracia = new javax.swing.JRadioButton();
        TiempoDeGracia = new javax.swing.JLabel();
        lst_Plazo = new javax.swing.JComboBox<>();
        PeriodoDeAmortizacion = new javax.swing.JLabel();
        lst_PeriodoDeAmortización = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        EfectivoAnual = new javax.swing.JLabel();
        NominalAnual = new javax.swing.JLabel();
        Periodico = new javax.swing.JLabel();
        txt_EfectivoAnual = new javax.swing.JTextField();
        txt_NominalAnual = new javax.swing.JTextField();
        txt_Periodico = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btn_Calcular = new javax.swing.JButton();
        btn_Salir = new javax.swing.JButton();
        btn_Limpiar = new javax.swing.JButton();
        Plazo1 = new javax.swing.JLabel();
        lst_PeriodoGracia = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tab_Cuadro_Resultados = new javax.swing.JTable();
        CuadroDeAmortización = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Simulador de Crédito");
        setBackground(new java.awt.Color(227, 227, 253));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(1330, 700));
        getContentPane().setLayout(null);

        TituloBanco.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        TituloBanco.setText("Banco Corporación Industrial");
        getContentPane().add(TituloBanco);
        TituloBanco.setBounds(220, 20, 290, 30);

        LogoBanco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/logo.png"))); // NOI18N
        getContentPane().add(LogoBanco);
        LogoBanco.setBounds(20, 20, 120, 100);

        Nombre.setText("Nombre Completo:");
        getContentPane().add(Nombre);
        Nombre.setBounds(150, 60, 110, 30);

        Cedula.setText("Cédula:");
        getContentPane().add(Cedula);
        Cedula.setBounds(150, 100, 90, 30);

        MontoDelPrestamo.setText("Monto del Prestamo:  COP  $");
        getContentPane().add(MontoDelPrestamo);
        MontoDelPrestamo.setBounds(80, 140, 170, 30);

        txt_Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_NombreActionPerformed(evt);
            }
        });
        txt_Nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_NombreKeyTyped(evt);
            }
        });
        getContentPane().add(txt_Nombre);
        txt_Nombre.setBounds(280, 60, 240, 30);

        txt_Cedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_CedulaActionPerformed(evt);
            }
        });
        txt_Cedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_CedulaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_CedulaKeyTyped(evt);
            }
        });
        getContentPane().add(txt_Cedula);
        txt_Cedula.setBounds(280, 100, 240, 30);

        txt_Monto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_MontoActionPerformed(evt);
            }
        });
        txt_Monto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_MontoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_MontoKeyTyped(evt);
            }
        });
        getContentPane().add(txt_Monto);
        txt_Monto.setBounds(280, 140, 240, 30);

        Pn_TipoCredito.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tipos de Crédito", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 11))); // NOI18N
        Pn_TipoCredito.setLayout(null);

        TiposDeCredito.add(opt_CuotaFija);
        opt_CuotaFija.setText("Cuota Fija");
        opt_CuotaFija.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opt_CuotaFijaActionPerformed(evt);
            }
        });
        Pn_TipoCredito.add(opt_CuotaFija);
        opt_CuotaFija.setBounds(20, 30, 90, 23);

        TiposDeCredito.add(opt_PeriodoDeGracia);
        opt_PeriodoDeGracia.setText("Periodo de gracia propiamente dicho");
        opt_PeriodoDeGracia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opt_PeriodoDeGraciaActionPerformed(evt);
            }
        });
        Pn_TipoCredito.add(opt_PeriodoDeGracia);
        opt_PeriodoDeGracia.setBounds(230, 30, 250, 23);

        getContentPane().add(Pn_TipoCredito);
        Pn_TipoCredito.setBounds(30, 180, 490, 70);

        TiempoDeGracia.setText("Periodo de Gracia:");
        getContentPane().add(TiempoDeGracia);
        TiempoDeGracia.setBounds(40, 290, 140, 20);

        lst_Plazo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lst_PlazoActionPerformed(evt);
            }
        });
        getContentPane().add(lst_Plazo);
        lst_Plazo.setBounds(220, 250, 160, 30);

        PeriodoDeAmortizacion.setText("Periodo de Amortización:");
        getContentPane().add(PeriodoDeAmortizacion);
        PeriodoDeAmortizacion.setBounds(40, 330, 150, 20);

        lst_PeriodoDeAmortización.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lst_PeriodoDeAmortizaciónActionPerformed(evt);
            }
        });
        getContentPane().add(lst_PeriodoDeAmortización);
        lst_PeriodoDeAmortización.setBounds(220, 330, 160, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Tasas de Interés");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 380, 130, 20);

        EfectivoAnual.setText("Efectivo Anual (EA)");
        getContentPane().add(EfectivoAnual);
        EfectivoAnual.setBounds(100, 420, 120, 20);

        NominalAnual.setText("Nominal Anual");
        getContentPane().add(NominalAnual);
        NominalAnual.setBounds(100, 450, 130, 20);

        Periodico.setText("Periodico (IP)");
        getContentPane().add(Periodico);
        Periodico.setBounds(100, 480, 120, 20);

        txt_EfectivoAnual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_EfectivoAnualActionPerformed(evt);
            }
        });
        txt_EfectivoAnual.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_EfectivoAnualKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_EfectivoAnualKeyTyped(evt);
            }
        });
        getContentPane().add(txt_EfectivoAnual);
        txt_EfectivoAnual.setBounds(250, 400, 120, 30);

        txt_NominalAnual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_NominalAnualActionPerformed(evt);
            }
        });
        txt_NominalAnual.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_NominalAnualKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_NominalAnualKeyTyped(evt);
            }
        });
        getContentPane().add(txt_NominalAnual);
        txt_NominalAnual.setBounds(250, 440, 120, 30);

        txt_Periodico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_PeriodicoActionPerformed(evt);
            }
        });
        txt_Periodico.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_PeriodicoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_PeriodicoKeyTyped(evt);
            }
        });
        getContentPane().add(txt_Periodico);
        txt_Periodico.setBounds(250, 480, 120, 30);

        jLabel2.setText("%");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(380, 410, 20, 20);

        jLabel3.setText("%");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(380, 450, 20, 20);

        jLabel4.setText("%");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(380, 490, 20, 20);

        btn_Calcular.setText("Calcular");
        btn_Calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CalcularActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Calcular);
        btn_Calcular.setBounds(250, 570, 90, 30);

        btn_Salir.setText("Salir");
        btn_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SalirActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Salir);
        btn_Salir.setBounds(400, 570, 60, 30);

        btn_Limpiar.setText("Limpiar");
        btn_Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Limpiar);
        btn_Limpiar.setBounds(110, 570, 70, 30);

        Plazo1.setText("Plazo:");
        getContentPane().add(Plazo1);
        Plazo1.setBounds(40, 250, 80, 20);

        lst_PeriodoGracia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lst_PeriodoGraciaActionPerformed(evt);
            }
        });
        getContentPane().add(lst_PeriodoGracia);
        lst_PeriodoGracia.setBounds(220, 290, 160, 30);

        tab_Cuadro_Resultados.setBackground(new java.awt.Color(212, 236, 213));
        tab_Cuadro_Resultados.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tab_Cuadro_Resultados.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        tab_Cuadro_Resultados.setForeground(new java.awt.Color(0, 51, 51));
        tab_Cuadro_Resultados.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tab_Cuadro_Resultados.setRowMargin(2);
        tab_Cuadro_Resultados.setRowSelectionAllowed(false);
        tab_Cuadro_Resultados.setSelectionBackground(new java.awt.Color(160, 239, 182));
        jScrollPane1.setViewportView(tab_Cuadro_Resultados);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(570, 60, 720, 510);

        CuadroDeAmortización.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        CuadroDeAmortización.setText("Cuadro de Amortización:");
        getContentPane().add(CuadroDeAmortización);
        CuadroDeAmortización.setBounds(570, 40, 180, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lst_PlazoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lst_PlazoActionPerformed
       
    }//GEN-LAST:event_lst_PlazoActionPerformed

    private void opt_CuotaFijaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opt_CuotaFijaActionPerformed
        if (opt_CuotaFija.isSelected() == true) {
            lst_PeriodoGracia.setVisible(false);
            TiempoDeGracia.setVisible(false);
            lst_Plazo.removeAllItems();
            lst_PeriodoGracia.removeAllItems();
            lst_PeriodoDeAmortización.removeAllItems();
            ArrayList cuota = new ArrayList();
            cuota.add("Seleccione");
            cuota.add("36 Mes");
            cuota.add("48 Mes");
            cuota.add("60 Mes");
            cuota.add("72 Mes");
            cuota.add("84 Mes");
            for (Object o : cuota) {
                lst_Plazo.addItem(o.toString());
            }
            ArrayList periodo = new ArrayList();
            periodo.add("Seleccione");
            periodo.add("Mensual");
            periodo.add("Bimestral");
            for (Object p : periodo) {
                lst_PeriodoDeAmortización.addItem(p.toString());
            }
        }
    }//GEN-LAST:event_opt_CuotaFijaActionPerformed

    private void opt_PeriodoDeGraciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opt_PeriodoDeGraciaActionPerformed
                
        if (opt_PeriodoDeGracia.isSelected() == true) {
            lst_Plazo.removeAllItems();
            lst_PeriodoGracia.removeAllItems();
            lst_PeriodoGracia.setVisible(true);
            TiempoDeGracia.setVisible(true);
            lst_PeriodoDeAmortización.removeAllItems();
            ArrayList cuota = new ArrayList();
            cuota.add("Seleccione");
            cuota.add("60 Mes");
            cuota.add("72 Mes");
            cuota.add("84 Mes");
            cuota.add("96 Mes");
            cuota.add("108 Mes");
            cuota.add("120 Mes");
            for (Object o : cuota) {
                lst_Plazo.addItem(o.toString());
            }
            ArrayList gracia = new ArrayList();
            gracia.add("Seleccione");
            gracia.add("24 Mes");
            gracia.add("36 Mes");
            for (Object g : gracia) {
                lst_PeriodoGracia.addItem(g.toString());
            }
            ArrayList periodo = new ArrayList();
            periodo.add("Seleccione");
            periodo.add("Mensual");
            periodo.add("Trimestral");
            for (Object p : periodo) {
                lst_PeriodoDeAmortización.addItem(p.toString());
            }
        }
    }//GEN-LAST:event_opt_PeriodoDeGraciaActionPerformed

    private void lst_PeriodoDeAmortizaciónActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lst_PeriodoDeAmortizaciónActionPerformed
    }//GEN-LAST:event_lst_PeriodoDeAmortizaciónActionPerformed

    private void txt_NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NombreActionPerformed
    }//GEN-LAST:event_txt_NombreActionPerformed

    private void txt_CedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_CedulaActionPerformed
    }//GEN-LAST:event_txt_CedulaActionPerformed

    private void txt_MontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_MontoActionPerformed
    
    }//GEN-LAST:event_txt_MontoActionPerformed

    private void txt_NombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_NombreKeyTyped
        char Nom = evt.getKeyChar();
        if (Character.isLetter(Nom) || Nom == KeyEvent.VK_SPACE){
            
        } else {
            evt.setKeyChar((char)KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null,"Solo ingrese letras!","Ventana Error Datos",JOptionPane.ERROR_MESSAGE);
            evt.consume();
            getToolkit().beep();
        }
    }//GEN-LAST:event_txt_NombreKeyTyped

    private void txt_CedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_CedulaKeyTyped
         int Ced = evt.getKeyChar();
        if (Character.isDigit(Ced)){

        } else {
            evt.consume();
            getToolkit().beep();
        }    
    }//GEN-LAST:event_txt_CedulaKeyTyped

    private void txt_MontoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_MontoKeyTyped
       int Ced = evt.getKeyChar();
        if (Character.isDigit(Ced)){

        } else {
            evt.consume();
            getToolkit().beep();
        }
          
    }//GEN-LAST:event_txt_MontoKeyTyped

    private void txt_EfectivoAnualKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_EfectivoAnualKeyTyped
        int EA = evt.getKeyChar();
        if (Character.isDigit(EA)){

        } else {
            evt.consume();
            getToolkit().beep();
        }
        
    }//GEN-LAST:event_txt_EfectivoAnualKeyTyped

    private void txt_NominalAnualKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_NominalAnualKeyTyped
        int NA = evt.getKeyChar();
        if (Character.isDigit(NA)){

        } else {
            evt.consume();
            getToolkit().beep();
        }
        
    }//GEN-LAST:event_txt_NominalAnualKeyTyped

    private void txt_PeriodicoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_PeriodicoKeyTyped
        int IP = evt.getKeyChar();
        if (Character.isDigit(IP)){

        } else {
            evt.consume();
            getToolkit().beep();
        }
        
    }//GEN-LAST:event_txt_PeriodicoKeyTyped

    private void txt_EfectivoAnualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_EfectivoAnualActionPerformed

    }//GEN-LAST:event_txt_EfectivoAnualActionPerformed

    private void txt_NominalAnualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NominalAnualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_NominalAnualActionPerformed

    private void txt_PeriodicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_PeriodicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_PeriodicoActionPerformed

    private void btn_CalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CalcularActionPerformed
        tabla.setColumnCount(0);
        tabla.setRowCount(0);
        nf.setParseIntegerOnly(true);
        año = fecha.get(Calendar.YEAR);
        mes = fecha.get(Calendar.MONTH) + 1;
        try {
            p = Float.valueOf(nf.parse(txt_Monto.getText()).toString());
        } catch (ParseException ex) {
            Logger.getLogger(FrSimulador.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if (opt_CuotaFija.isSelected() == true && !lst_Plazo.getSelectedItem().equals("Seleccione") && !lst_PeriodoDeAmortización.getSelectedItem().equals("Seleccione") && txt_Periodico.getText().length() != 0 && txt_Monto.getText().length() != 0) {
            tabla.addColumn("# cuotas");
            tabla.addColumn("Fechas");
            tabla.addColumn("Saldo capital");
            tabla.addColumn("Amort. capital");
            tabla.addColumn("Amort. interes");
            tabla.addColumn("Cuota fija");
            tabla.addColumn("Flujo caja");
            String[] fila = {"", "", "", "", "", "", ""};
            float n = meses / pagos;
            A = calculo.cuotaFija(ip, n, p);
            for (int i = 0; i <= n; i++) {
                if (i == 0) {
                    fila[0] = "0";
                    fila[1] = dia + "-" + mes + "-" + año;
                    fila[2] = nf.format(p);
                    fila[3] = "----------";
                    fila[4] = "----------";
                    fila[5] = "----------";
                    fila[6] = nf.format(p);
                    tabla.addRow(fila);
                } else {
                    float I = p * ip;
                    float AmorCap = A - I;
                    p -= AmorCap;
                    fila[0] = "" + i;
                    fila[1] = getFecha(pagos);
                    fila[2] = nf.format(p);
                    fila[3] = "" + nf.format(AmorCap);
                    fila[4] = "" + nf.format(I);
                    fila[5] = nf.format(A);
                    fila[6] = "-(" + nf.format(A) + ")";
                    tabla.addRow(fila);
                }
            }
            System.out.println("A: " + A);
        } else if (opt_PeriodoDeGracia.isSelected() == true && !lst_PeriodoGracia.getSelectedItem().equals("Seleccione") && !lst_Plazo.getSelectedItem().equals("Seleccione") && !lst_PeriodoDeAmortización.getSelectedItem().equals("Seleccione") && txt_Periodico.getText().length() != 0 && txt_Monto.getText().length() != 0) {
            tabla.addColumn("# cuotas");
            tabla.addColumn("Fechas");
            tabla.addColumn("Saldo capital");
            tabla.addColumn("Amort. capital");
            tabla.addColumn("Amort. interes");
            tabla.addColumn("Flujo caja");
            String[] fila = {"", "", "", "", "", ""};
            float n = meses / pagos;
            getGracia();
            float g = gracia / pagos;
            float n2 = n - g;
            for (int i = 0; i <= n; i++) {
                if (i == 0) {
                    fila[0] = "0";
                    fila[1] = dia + "-" + mes + "-" + año;
                    fila[2] = nf.format(p);
                    fila[3] = "----------";
                    fila[4] = "----------";
                    fila[5] = nf.format(p);
                    tabla.addRow(fila);
                } else if(i>g){
                    float I = p * ip;
                    float AmorCap = p/n2;
                    float flujoCaja= p-AmorCap;
                    p -= AmorCap;
                    fila[0] = "" + i;
                    fila[1] = getFecha(pagos);
                    fila[2] = nf.format(p);
                    fila[3] = nf.format(AmorCap);
                    fila[4] = nf.format(I);
                    fila[5] = "-(" + nf.format(flujoCaja) + ")";
                    tabla.addRow(fila);
                }else{
                    float I = p * ip;
                    fila[0] = "" + i;
                    fila[1] = getFecha(pagos);
                    fila[2] = nf.format(p);
                    fila[3] = "----------";
                    fila[4] = nf.format(I);
                    fila[5] = "-(" + nf.format(I) + ")";
                    tabla.addRow(fila);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe proporcionar mas datos");
        }
    }//GEN-LAST:event_btn_CalcularActionPerformed

    private void btn_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SalirActionPerformed
        // configuracion boton salir
        System.exit(0);
    }//GEN-LAST:event_btn_SalirActionPerformed

    private void btn_LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LimpiarActionPerformed
        // configuracion boton limpiar
        txt_Cedula.setText(null);
        txt_EfectivoAnual.setText(null);
        txt_Monto.setText(null);
        txt_Nombre.setText(null);
        txt_NominalAnual.setText(null);
        txt_Periodico.setText(null);
        
    }//GEN-LAST:event_btn_LimpiarActionPerformed

    private void lst_PeriodoGraciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lst_PeriodoGraciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lst_PeriodoGraciaActionPerformed

    private void txt_MontoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_MontoKeyReleased
        // TODO add your handling code here:
        if (txt_Monto.getText().length() > 0) {
            nf.setParseIntegerOnly(true);
            try {
                p = Float.valueOf(nf.parse(txt_Monto.getText()).toString());
                System.out.println(p);
                txt_Monto.setText(nf.format(nf.parse(txt_Monto.getText())));
            } catch (ParseException ex) {
                Logger.getLogger(FrSimulador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_txt_MontoKeyReleased

    private void txt_CedulaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_CedulaKeyReleased
        // TODO add your handling code here:
        if (txt_Cedula.getText().length() > 0) {
            nf.setParseIntegerOnly(true);
            try {
                System.out.println(nf.parse(txt_Cedula.getText()));
                txt_Cedula.setText(nf.format(nf.parse(txt_Cedula.getText())));
            } catch (ParseException ex) {
                Logger.getLogger(FrSimulador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_txt_CedulaKeyReleased

    private void txt_EfectivoAnualKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_EfectivoAnualKeyReleased
        // TODO add your handling code here:
       if (opt_CuotaFija.isSelected() == true || opt_PeriodoDeGracia.isSelected() == true && !lst_PeriodoDeAmortización.getSelectedItem().equals("Seleccione")) {
            if (!txt_EfectivoAnual.getText().equals("")) {
                getDias();
                getMeses();
                ea = Float.parseFloat(txt_EfectivoAnual.getText());
                ip = calculo.periodicoEA(ea / 100, dias);
                txt_Periodico.setText(formato.format(ip * 100));
                na = calculo.nominalAnual((ip * 100), periodos);
                txt_NominalAnual.setText(formato.format(na));
            } else {
                txt_Periodico.setText("");
                txt_NominalAnual.setText("");
            }
        } else {
            txt_NominalAnual.setText("");
            txt_EfectivoAnual.setText("");
            txt_Periodico.setText("");
            JOptionPane.showMessageDialog(null, "Seleccione el credito y el periodo antes de ingresar los intereses");
        }
    }//GEN-LAST:event_txt_EfectivoAnualKeyReleased

    private void txt_NominalAnualKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_NominalAnualKeyReleased
        // TODO add your handling code here:
        if (opt_CuotaFija.isSelected() == true || opt_PeriodoDeGracia.isSelected() == true && !lst_PeriodoDeAmortización.getSelectedItem().equals("Seleccione")) {
            if (!txt_NominalAnual.getText().equals("")) {
                getDias();
                getMeses();
                na = Float.parseFloat(txt_NominalAnual.getText());
                ip = calculo.periodicoNA(na, periodos) / 100;
                txt_Periodico.setText(formato.format(ip * 100));
                ea = calculo.efectivoAnual(ip, dias);
                txt_EfectivoAnual.setText(formato.format(ea * 100));
            } else {
                txt_Periodico.setText("");
                txt_EfectivoAnual.setText("");
            }
        } else {
            txt_NominalAnual.setText("");
            txt_EfectivoAnual.setText("");
            txt_Periodico.setText("");
            JOptionPane.showMessageDialog(null, "Seleccione el credito y el periodo antes de ingresar los intereses");
        }
    }//GEN-LAST:event_txt_NominalAnualKeyReleased

    private void txt_PeriodicoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_PeriodicoKeyReleased
        // TODO add your handling code here:
        if (opt_CuotaFija.isSelected() == true || opt_PeriodoDeGracia.isSelected() == true && !lst_PeriodoDeAmortización.getSelectedItem().equals("Seleccione")) {
            if (!txt_Periodico.getText().equals("")) {
                getDias();
                getMeses();
                ip = Float.parseFloat(txt_Periodico.getText()) / 100;
                na = calculo.nominalAnual(ip * 100, periodos);
                txt_NominalAnual.setText(formato.format(na));
                ea = calculo.efectivoAnual(ip, dias);
                txt_EfectivoAnual.setText(formato.format(ea * 100));
            } else {
                txt_NominalAnual.setText("");
                txt_EfectivoAnual.setText("");
            }
        } else {
            txt_NominalAnual.setText("");
            txt_EfectivoAnual.setText("");
            txt_Periodico.setText("");
            JOptionPane.showMessageDialog(null, "Seleccione el credito y el periodo antes de ingresar los intereses");
        }
    }//GEN-LAST:event_txt_PeriodicoKeyReleased

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
            java.util.logging.Logger.getLogger(FrSimulador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrSimulador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrSimulador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrSimulador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrSimulador().setVisible(true);
            }
        });
    }
    
    public String getFecha(float pagos) {
        for (int i = 0; i < pagos; i++) {
            if (mes == 12) {
                mes = 1;
                año += 1;
            } else {
                mes += 1;
            }
        }
        return dia + "-" + mes + "-" + año;
    }
    
    public void getMeses() {
        if (lst_Plazo.getSelectedItem().equals("36 Mes")) {
            meses = 36;
            cuotas = meses / pagos;
        } else if (lst_Plazo.getSelectedItem().equals("48 Mes")) {
            meses = 48;
            cuotas = meses / pagos;
        } else if (lst_Plazo.getSelectedItem().equals("60 Mes")) {
            meses = 60;
            cuotas = meses / pagos;
        } else if (lst_Plazo.getSelectedItem().equals("72 Mes")) {
            meses = 72;
            cuotas = meses / pagos;
        } else if (lst_Plazo.getSelectedItem().equals("84 Mes")) {
            meses = 84;
            cuotas = meses / pagos;
        } else if (lst_Plazo.getSelectedItem().equals("96 Mes")) {
            meses = 96;
            cuotas = meses / pagos;
        } else if (lst_Plazo.getSelectedItem().equals("108 Mes")) {
            meses = 108;
            cuotas = meses / pagos;
        } else if (lst_Plazo.getSelectedItem().equals("120 Mes")) {
            meses = 120;
            cuotas = meses / pagos;
        } else {
            meses = 0;
            cuotas = meses / pagos;
        }
    }

    public void getDias() {
        if (lst_PeriodoDeAmortización.getSelectedItem().equals("Mensual")) {
            dias = 30;
            periodos = 12;
            pagos = 1;
        } else if (lst_PeriodoDeAmortización.getSelectedItem().equals("Bimestral")) {
            dias = 60;
            periodos = 6;
            pagos = 2;
        } else if (lst_PeriodoDeAmortización.getSelectedItem().equals("Trimestral")) {
            dias = 90;
            periodos = 4;
            pagos = 3;
        } else {
            pagos = 0;
        }
    }
    
    public void getGracia(){
        if (lst_PeriodoGracia.getSelectedItem().equals("24 Mes")) {
            gracia = 24;
        } else if (lst_PeriodoGracia.getSelectedItem().equals("36 Mes")) {
            gracia = 36;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cedula;
    private javax.swing.JLabel CuadroDeAmortización;
    private javax.swing.JLabel EfectivoAnual;
    private javax.swing.JLabel LogoBanco;
    private javax.swing.JLabel MontoDelPrestamo;
    private javax.swing.JLabel Nombre;
    private javax.swing.JLabel NominalAnual;
    private javax.swing.JLabel Periodico;
    private javax.swing.JLabel PeriodoDeAmortizacion;
    private javax.swing.JLabel Plazo1;
    private javax.swing.JPanel Pn_TipoCredito;
    private javax.swing.JLabel TiempoDeGracia;
    private javax.swing.ButtonGroup TiposDeCredito;
    private javax.swing.JLabel TituloBanco;
    private javax.swing.JButton btn_Calcular;
    private javax.swing.JButton btn_Limpiar;
    private javax.swing.JButton btn_Salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> lst_PeriodoDeAmortización;
    private javax.swing.JComboBox<String> lst_PeriodoGracia;
    private javax.swing.JComboBox<String> lst_Plazo;
    private javax.swing.JRadioButton opt_CuotaFija;
    private javax.swing.JRadioButton opt_PeriodoDeGracia;
    private javax.swing.JTable tab_Cuadro_Resultados;
    private javax.swing.JTextField txt_Cedula;
    private javax.swing.JTextField txt_EfectivoAnual;
    private javax.swing.JTextField txt_Monto;
    private javax.swing.JTextField txt_Nombre;
    private javax.swing.JTextField txt_NominalAnual;
    private javax.swing.JTextField txt_Periodico;
    // End of variables declaration//GEN-END:variables
}
