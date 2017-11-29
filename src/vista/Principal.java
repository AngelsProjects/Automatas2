/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Color;
import java.awt.event.*;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.text.AttributeSet;
import javax.swing.text.Position;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;
import javax.swing.text.StyledDocument;
import modelo.Archivitos;

public class Principal extends javax.swing.JFrame implements ActionListener {

    public Principal() {
        initComponents();
        setTitle("Sin Titulo_" + numHoja);
        txtNumLineas.append(numLin + "\n");
        areaTexto.setComponentPopupMenu(jPopupMenu1);
        poneAcciones();

    }
//Este método sirve para agregar las acciones a cada componente

    private void poneAcciones() {
        areaTexto.addKeyListener(new KeyAdapter() {

            public void keyReleased(KeyEvent evt) {
                presionaTecla(evt);
            }

            public void keyTyped(KeyEvent evt) {
            }
        });
        btnAbrir.addActionListener(this);
        btnNuevo.addActionListener(this);
        btnGuardar.addActionListener(this);
        jmiAbrir.addActionListener(this);
        jmiNuevo.addActionListener(this);
        jmiGuardar.addActionListener(this);
        jmiGuardarComo.addActionListener(this);
        jmiCopiar.addActionListener(this);
        jmiCortar.addActionListener(this);
        jmiPegar.addActionListener(this);
        jpmiCopiar.addActionListener(this);
        jpmiCortar.addActionListener(this);
        jpmiPegar.addActionListener(this);
        jmiAcerca.addActionListener(this);
        jmiSalir.addActionListener(this);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jpmiCopiar = new javax.swing.JMenuItem();
        jpmiCortar = new javax.swing.JMenuItem();
        jpmiPegar = new javax.swing.JMenuItem();
        jToolBar1 = new javax.swing.JToolBar();
        btnNuevo = new javax.swing.JButton();
        btnAbrir = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtNumLineas = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        areaTexto = new javax.swing.JTextPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        salida = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnArchivo = new javax.swing.JMenu();
        jmiAbrir = new javax.swing.JMenuItem();
        jmiNuevo = new javax.swing.JMenuItem();
        jmiGuardar = new javax.swing.JMenuItem();
        jmiGuardarComo = new javax.swing.JMenuItem();
        jmiSalir = new javax.swing.JMenuItem();
        mnEdicion = new javax.swing.JMenu();
        jmiCopiar = new javax.swing.JMenuItem();
        jmiCortar = new javax.swing.JMenuItem();
        jmiPegar = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        mnAyuda = new javax.swing.JMenu();
        jmiAcerca = new javax.swing.JMenuItem();

        jpmiCopiar.setText("Copiar");
        jPopupMenu1.add(jpmiCopiar);

        jpmiCortar.setText("Cortar");
        jPopupMenu1.add(jpmiCortar);

        jpmiPegar.setText("Pegar");
        jPopupMenu1.add(jpmiPegar);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JC Editor");

        jToolBar1.setRollover(true);

        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nuevo.gif"))); // NOI18N
        btnNuevo.setFocusable(false);
        btnNuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNuevo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnNuevo);

        btnAbrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/abrir.png"))); // NOI18N
        btnAbrir.setFocusable(false);
        btnAbrir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAbrir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnAbrir);

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/SAVE.GIF"))); // NOI18N
        btnGuardar.setFocusable(false);
        btnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnGuardar);

        getContentPane().add(jToolBar1, java.awt.BorderLayout.PAGE_START);

        txtNumLineas.setEditable(false);
        txtNumLineas.setBackground(new java.awt.Color(192, 192, 192));
        txtNumLineas.setColumns(3);
        txtNumLineas.setRows(1);
        jScrollPane2.setViewportView(txtNumLineas);

        getContentPane().add(jScrollPane2, java.awt.BorderLayout.LINE_START);

        jScrollPane3.setViewportView(areaTexto);

        getContentPane().add(jScrollPane3, java.awt.BorderLayout.CENTER);

        jScrollPane1.setEnabled(false);

        salida.setEditable(false);
        salida.setColumns(20);
        salida.setRows(5);
        salida.setText("Output");
        jScrollPane1.setViewportView(salida);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.PAGE_END);

        jMenuBar1.setAlignmentX(2.0F);
        jMenuBar1.setMargin(new java.awt.Insets(1, 2, 0, 0));
        jMenuBar1.setMinimumSize(new java.awt.Dimension(0, 3));

        mnArchivo.setText("File");
        mnArchivo.setAlignmentX(2.0F);

        jmiAbrir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jmiAbrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/abrir.png"))); // NOI18N
        jmiAbrir.setText("Abrir");
        mnArchivo.add(jmiAbrir);

        jmiNuevo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jmiNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nuevo.png"))); // NOI18N
        jmiNuevo.setText("Nuevo");
        mnArchivo.add(jmiNuevo);

        jmiGuardar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        jmiGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/SAVE.GIF"))); // NOI18N
        jmiGuardar.setText("Guardar");
        mnArchivo.add(jmiGuardar);

        jmiGuardarComo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/gwget.png"))); // NOI18N
        jmiGuardarComo.setText("Guardar como");
        mnArchivo.add(jmiGuardarComo);

        jmiSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        jmiSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.png"))); // NOI18N
        jmiSalir.setText("Salir");
        mnArchivo.add(jmiSalir);

        jMenuBar1.add(mnArchivo);

        mnEdicion.setText("Edit");

        jmiCopiar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jmiCopiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/copiar.gif"))); // NOI18N
        jmiCopiar.setText("Copy");
        mnEdicion.add(jmiCopiar);

        jmiCortar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        jmiCortar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cortar.gif"))); // NOI18N
        jmiCortar.setText("Cut");
        mnEdicion.add(jmiCortar);

        jmiPegar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        jmiPegar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pegar.gif"))); // NOI18N
        jmiPegar.setText("Paste");
        mnEdicion.add(jmiPegar);

        jMenuItem1.setText("Compile");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        mnEdicion.add(jMenuItem1);

        jMenuItem2.setText("Run");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        mnEdicion.add(jMenuItem2);

        jMenuBar1.add(mnEdicion);

        mnAyuda.setText("Ayuda");
        mnAyuda.setActionCommand("Help");

        jmiAcerca.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, java.awt.event.InputEvent.CTRL_MASK));
        jmiAcerca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/wink.gif"))); // NOI18N
        jmiAcerca.setText("About...");
        mnAyuda.add(jmiAcerca);

        jMenuBar1.add(mnAyuda);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(867, 532));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

//Para mostrar u ocultar numeros de linea
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        update();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void update() {
        try {
            String[] array = areaTexto.getText().split("#");
            // Start with the current input attributes for the JTextPane. This
            // should ensure that we do not wipe out any existing attributes
            // (such as alignment or other paragraph attributes) currently
            // set on the text area.
            Style defaultStyle = StyleContext.
                    getDefaultStyleContext().
                    getStyle(StyleContext.DEFAULT_STYLE);
            StyledDocument doc = areaTexto.getStyledDocument();
            doc.setCharacterAttributes(0, doc.getLength(), defaultStyle, true);

            StyleContext sc = StyleContext.getDefaultStyleContext();

            AttributeSet inicio = sc.addAttribute(SimpleAttributeSet.EMPTY, StyleConstants.Background, Color.YELLOW);
            AttributeSet ciclo = sc.addAttribute(SimpleAttributeSet.EMPTY, StyleConstants.Background, Color.PINK);
            AttributeSet mensaje = sc.addAttribute(SimpleAttributeSet.EMPTY, StyleConstants.Background, Color.ORANGE);
            AttributeSet fin = sc.addAttribute(SimpleAttributeSet.EMPTY, StyleConstants.Background, Color.CYAN);
            Map<String, AttributeSet> map = new HashMap<String, AttributeSet>();
            map.put("INICIO", inicio);
            map.put("ENSAJE", ciclo);
            map.put("UNDO", mensaje);
            map.put("FIN", fin);
            List<String> list = Arrays.asList("INICIO", "ENSAJE", "UNDO", "FIN");
            boolean start = false, end = false, error = false;
            if (array.length > 0) {
                for (int x = 0; x < array.length; x++) {
                    String temp = list.stream()
                            .filter(array[x].trim().toUpperCase()::contains)
                            .findFirst()
                            .map(v -> v)
                            .orElse(null);
                    int startindex = 0, endindex = 0;
                    if (temp != null) {
                        switch (temp) {
                            case "INICIO":
                                if (start || end) {
                                    error = true;
                                    break;
                                }
                                start = true;
                                startindex = array[x].trim().toUpperCase().indexOf(temp);
                                endindex = startindex + 6;
                                break;
                            case "ENSAJE":
                                for (int y = 0; y < x; y++) {
                                    startindex = startindex + array[y].length() + 1;
                                }
                                startindex = array[x].trim().toUpperCase().indexOf(temp) + startindex;
                                //inicio#
                                //mensaje#
                                endindex = 6;
                                break;
                            case "UNDO":
                                for (int y = 0; y < x; y++) {
                                    startindex = startindex + array[y].length() + 1;
                                }
                                startindex = array[x].trim().toUpperCase().indexOf(temp) + startindex;
                                endindex = 5;
                                break;
                            case "FIN":
                                if (end) {
                                    error = true;
                                    break;
                                }
                                end = true;
                                for (int y = 0; y < x; y++) {
                                    startindex = startindex + array[y].length() + 1;
                                }
                                startindex = array[x].trim().toUpperCase().indexOf(temp) + startindex - 1;
                                endindex = 3;

                                break;
                        }
                    }
                    if (!error) {
                        doc.setCharacterAttributes(startindex, endindex, map.get(temp), true);
                    }

                }
            }
        } catch (Exception ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
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

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane areaTexto;
    private javax.swing.JButton btnAbrir;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenuItem jmiAbrir;
    private javax.swing.JMenuItem jmiAcerca;
    private javax.swing.JMenuItem jmiCopiar;
    private javax.swing.JMenuItem jmiCortar;
    private javax.swing.JMenuItem jmiGuardar;
    private javax.swing.JMenuItem jmiGuardarComo;
    private javax.swing.JMenuItem jmiNuevo;
    private javax.swing.JMenuItem jmiPegar;
    private javax.swing.JMenuItem jmiSalir;
    private javax.swing.JMenuItem jpmiCopiar;
    private javax.swing.JMenuItem jpmiCortar;
    private javax.swing.JMenuItem jpmiPegar;
    private javax.swing.JMenu mnArchivo;
    private javax.swing.JMenu mnAyuda;
    private javax.swing.JMenu mnEdicion;
    private javax.swing.JTextArea salida;
    private javax.swing.JTextArea txtNumLineas;
    // End of variables declaration//GEN-END:variables
    Archivitos a;
    private int numLin = 1, numHoja = 1, guardado = 0, abierto = 0;
    private Vector<String> filas = new Vector<String>();

    //Aqui se ubican todas las acciones realizadas por cada uno de los botones o jmenuitems
    @Override
    public void actionPerformed(ActionEvent e) {
        //Aqui se especifica la accion a realizar para abrir un archivo
        if (e.getSource() == jmiAbrir || e.getSource() == btnAbrir) {
            try {
                a = new Archivitos();
                areaTexto.setText(a.abrirArchivo());
                guardaFilas();
                poneNumLineas();
                this.setTitle(a.getNombreArchivo());
                abierto++;
            } catch (IOException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
        } //Aqui se ubica el codigo para un nuevo documento y se ubica controles
        else if (e.getSource() == jmiNuevo || e.getSource() == btnNuevo) {
            if (areaTexto.getText().isEmpty()) {//En caso de que el area de texto esté vacia
                this.setTitle("Sin Titulo_" + numHoja);
                guardado = 0;
            } else {//Si existe texto en el area de texto
                String titulo = this.getTitle();
                String l = titulo.substring(0, titulo.length() - 1);
                if (l.equalsIgnoreCase("Sin Titulo_") || guardado > 0) {
                    int p = JOptionPane.showConfirmDialog(null, "¿Desea guardar los cambios?", "Guardar", JOptionPane.YES_NO_OPTION);
                    if (p == JOptionPane.YES_OPTION) {
                        if (l.equalsIgnoreCase("Sin Titulo_")) {
                            guarda();
                        } else {
                            guardaDos();
                        }
                    }
                    areaTexto.setText(null);
                    this.setTitle("Sin Titulo_" + numHoja);
                    guardado = 0;
                } else if (abierto > 0) {
                    numLin = 1;
                    areaTexto.setText(null);
                    txtNumLineas.setText(null);
                    txtNumLineas.append(numLin + "\n");
                    this.setTitle("Sin Titulo_" + numHoja);
                    guardado = 0;
                    abierto = 0;
                }
            }
            numHoja = numHoja + 1;
        } else if (e.getSource() == jmiGuardar || e.getSource() == btnGuardar) {
            String titulo = this.getTitle();
            String l = titulo.substring(0, titulo.length() - 1);
            if (l.equalsIgnoreCase("Sin Titulo_")) {
                guarda();
            } else {
                guardaDos();
            }
            guardado++;
        } else if (e.getSource() == jmiGuardarComo) {
            guarda();
            guardado++;
        } else if (e.getSource() == jmiSalir) {
            System.exit(0);
        } else if (e.getSource() == jmiCopiar || e.getSource() == jpmiCopiar) {
            areaTexto.copy();
            System.out.println("Si llega copiar");
        } else if (e.getSource() == jmiCortar || e.getSource() == jpmiCortar) {
            areaTexto.cut();
        } else if (e.getSource() == jmiPegar || e.getSource() == jpmiPegar) {
            areaTexto.paste();
            System.out.println("Si llega pegar");
        } else if (e.getSource() == jmiAcerca) {
            new Acerca(this, true).setVisible(true);
        }
    }
//metodo que permite guardar mostrando el cuadro de guardado

    private void guarda() {
        String s = areaTexto.getText();
        try {
            a = new Archivitos();
            a.crearArchivo(s);
            this.setTitle(a.getNombreArchivo());
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error de E/S");
        }
    }
//este método es para guardar sin que se pida el nombre de archivo

    private void guardaDos() {
        String s = areaTexto.getText();
        try {
            a.crearArchivoUno(s, a.getNombreArchivo());
            this.setTitle(a.getNombreArchivo());
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error de E/S");
        }
    }
//Este método sirve principalmente para ir añadiendo numeros de linea, 

    public void presionaTecla(KeyEvent evt) {
        Style defaultStyle = StyleContext.
                getDefaultStyleContext().
                getStyle(StyleContext.DEFAULT_STYLE);
        StyledDocument doc = areaTexto.getStyledDocument();
        doc.setCharacterAttributes(0, doc.getLength(), defaultStyle, true);

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            numLin++;
            txtNumLineas.append(numLin + "\n");
        } else if (evt.getKeyCode() == KeyEvent.VK_BACK_SPACE || evt.getKeyCode() == KeyEvent.VK_DELETE) {
            guardaFilas();
            txtNumLineas.setText("");
            numLin = 1;
            for (String s : filas) {
                txtNumLineas.append(numLin + "\n");
                numLin++;
            }
            numLin--;
            if (areaTexto.getText().equals("")) {
                txtNumLineas.append(1 + "\n");
                numLin = 1;
            }
        }
    }

//En este método, cada fila del editor se va guardando en un vector
    public void guardaFilas() {
        filas = new Vector<String>();
        StringTokenizer st = new StringTokenizer(areaTexto.getText(), "\n");
        while (st.hasMoreTokens()) {
            filas.add(st.nextToken());
        }
    }

//genera los numeros de linea del editor, se utiliza principalmente para cuando se abre un archivo
    public void poneNumLineas() {
        for (String s : filas) {
            numLin++;
            txtNumLineas.append(numLin + "\n");
        }
    }
}
