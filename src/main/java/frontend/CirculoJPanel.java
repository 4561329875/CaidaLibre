/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package frontend;

import backend.Circulo;
import backend.Triangulo;
import javax.swing.ImageIcon;

/**
 *
 * @author david
 */
public class CirculoJPanel extends javax.swing.JPanel {

    /**
     * Creates new form MenuJPanel
     */
    public CirculoJPanel() {
        
        initComponents();
        
        jLabelTitulo.putClientProperty( "FlatLaf.styleClass", "h2" );
        jLabelParrafo.putClientProperty( "FlatLaf.styleClass", "h4" );
        jLabelArea.putClientProperty( "FlatLaf.styleClass", "h4" );
        jLabelRadio.putClientProperty( "FlatLaf.styleClass", "h4" );
        jLabelResArea.putClientProperty( "FlatLaf.styleClass", "h3" );
        jButtonCalcular.putClientProperty( "FlatLaf.styleClass", "h3" );
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelParrafo = new javax.swing.JLabel();
        jLabelImg = new javax.swing.JLabel();
        jLabelRadio = new javax.swing.JLabel();
        jLabelArea = new javax.swing.JLabel();
        jLabelResArea = new javax.swing.JLabel();
        jButtonCalcular = new javax.swing.JButton();
        jTextFieldRadio = new javax.swing.JTextField();

        jToggleButton1.setText("jToggleButton1");

        setPreferredSize(new java.awt.Dimension(424, 251));

        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("Area del Circulo");
        jLabelTitulo.setToolTipText("");

        jLabelParrafo.setText("<html>El área de un círculo se calcula mediante la fórmula A = π * r², donde π (pi) es una constante aproximadamente igual a 3.14159, y r es el radio del círculo, que es la distancia desde el centro del círculo hasta cualquier punto en su borde. </html>");

        jLabelImg.setIcon(new javax.swing.ImageIcon("E:/poo/areasFigurasGrafico/src/main/java/resourses/circulo.png"));

        jLabelRadio.setText("Radio:");

        jLabelArea.setText("Area:");

        jLabelResArea.setText("0.00");

        jButtonCalcular.setText("Calcular");
        jButtonCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCalcularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelParrafo, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabelImg, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelRadio)
                                .addGap(15, 15, 15)
                                .addComponent(jTextFieldRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jButtonCalcular))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelArea)
                                .addGap(54, 54, 54)
                                .addComponent(jLabelResArea)))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelParrafo, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelRadio)
                            .addComponent(jTextFieldRadio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelArea)
                            .addComponent(jLabelResArea))
                        .addGap(21, 21, 21)
                        .addComponent(jButtonCalcular))
                    .addComponent(jLabelImg, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCalcularActionPerformed
        Circulo cir = new Circulo(Double.parseDouble(jTextFieldRadio.getText()));
        jLabelResArea.setText(String.valueOf(cir.calcularArea()));
        
        
    }//GEN-LAST:event_jButtonCalcularActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCalcular;
    private javax.swing.JLabel jLabelArea;
    private javax.swing.JLabel jLabelImg;
    private javax.swing.JLabel jLabelParrafo;
    private javax.swing.JLabel jLabelRadio;
    private javax.swing.JLabel jLabelResArea;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JTextField jTextFieldRadio;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}