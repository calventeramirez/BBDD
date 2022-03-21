/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Pablo Calvente
 */
public class VistaCDs extends javax.swing.JFrame {

    /**
     * Creates new form VistaLibros
     */
    public VistaCDs() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Base de Datos V0.3.1");
        setIconImage(new ImageIcon(getClass().getResource("/img/iconoapp.png")).getImage());
        //this.setExtendedState(MAXIMIZED_BOTH);
        this.setResizable(false);
        cargarDatosTabla();
    }
    Connection con = null;
    Statement st = null;
    ResultSet rs = null;
    
    public void cargarDatosTabla(){
        //cargar los datos de la BBDD a la tabla con el jar rs2xml.jar
        try{
            //con = DriverManager.getConnection("jdbc:derby://localhost:1527/database","ad","ad");
            con = DriverManager.getConnection("jdbc:derby:.\\database","ad","ad");
            st = con.createStatement();
            rs = st.executeQuery("select * from AD.CDS");
            //TablaCDsArea.setModel(DbUtils.resultSetToTableModel(rs));
            DefaultTableModel dfm = new DefaultTableModel();
            TablaCDsArea.setModel(dfm);
            dfm.setColumnIdentifiers((new Object[]{"ID", "NOMBRE", "CANTANTE", "NUMERO DE CDS"}));
            while(rs.next()){
                dfm.addRow(new Object[]{rs.getInt("ID"), rs.getString("NOMBRE"), rs.getString("CANTANTE"), rs.getInt("NUMCDS")});
            }
            con.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TablaCDsArea = new javax.swing.JTable();
        EditButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        AddButton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        DeleteButton = new javax.swing.JButton();
        NombreCDText = new javax.swing.JTextField();
        CantanteText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        NumCdsbox = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        CDjb = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        TablaCDsArea.setAutoCreateRowSorter(true);
        TablaCDsArea.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CD ID", "Nombre CD", "Cantante", "Numero CDs"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TablaCDsArea.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        TablaCDsArea.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TablaCDsArea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaCDsAreaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaCDsArea);

        EditButton.setText("Editar");
        EditButton.setActionCommand("jbBuscar");
        EditButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditButtonMouseClicked(evt);
            }
        });

        jButton2.setText("Inicio");
        jButton2.setActionCommand("jbInicio");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        AddButton.setText("Añadir CD");
        AddButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddButtonMouseClicked(evt);
            }
        });
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(255, 0, 0));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("© Pablo Jesús Calvente Ramírez");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addContainerGap(895, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 0, 0));

        jLabel1.setBackground(new java.awt.Color(255, 0, 51));
        jLabel1.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Base de Datos");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(334, 334, 334))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        DeleteButton.setText("Borrar");
        DeleteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteButtonMouseClicked(evt);
            }
        });

        NombreCDText.setBackground(new java.awt.Color(255, 255, 255));
        NombreCDText.setForeground(new java.awt.Color(0, 0, 0));
        NombreCDText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreCDTextActionPerformed(evt);
            }
        });

        CantanteText.setBackground(new java.awt.Color(255, 255, 255));
        CantanteText.setForeground(new java.awt.Color(0, 0, 0));

        jLabel2.setText("Nombre del CD: ");

        jLabel9.setText("Cantante: ");

        jLabel10.setText("Número de CDs");

        NumCdsbox.setBackground(new java.awt.Color(255, 255, 255));
        NumCdsbox.setForeground(new java.awt.Color(0, 0, 0));
        NumCdsbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
        NumCdsbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumCdsboxActionPerformed(evt);
            }
        });

        jLabel3.setText("CD ID: ");

        CDjb.setBackground(new java.awt.Color(255, 255, 255));
        CDjb.setForeground(new java.awt.Color(0, 0, 0));
        CDjb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CDjbActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CantanteText, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)
                            .addComponent(NombreCDText)
                            .addComponent(CDjb)
                            .addComponent(NumCdsbox, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(EditButton, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(DeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)))
                .addContainerGap())
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(CDjb, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(NombreCDText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(CantanteText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(NumCdsbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AddButton)
                            .addComponent(EditButton)
                            .addComponent(DeleteButton))
                        .addGap(30, 30, 30)
                        .addComponent(jButton2))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        EditButton.getAccessibleContext().setAccessibleName("jbBuscar");
        jButton2.getAccessibleContext().setAccessibleName("jbInicio");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        VistaPrincipal a = new VistaPrincipal();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_AddButtonActionPerformed

    private void NombreCDTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreCDTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreCDTextActionPerformed

    private void NumCdsboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumCdsboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumCdsboxActionPerformed

    private void AddButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddButtonMouseClicked
        // TODO add your handling code here:
        if(CDjb.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Introduzca el ID del libro que desea añadir.");
        }else{
            try{
                //con = DriverManager.getConnection("jdbc:derby://localhost:1527/database","ad","ad");
                con = DriverManager.getConnection("jdbc:derby:.\\database","ad","ad");
                PreparedStatement add = con.prepareStatement("insert into CDS values(?,?,?,?)");
               
                add.setInt(1, Integer.valueOf(CDjb.getText()));
                add.setString(2,NombreCDText.getText());
                add.setString(3,CantanteText.getText());
                add.setString(4, NumCdsbox.getSelectedItem().toString());
                int row = add.executeUpdate();
                JOptionPane.showMessageDialog(this, "Se ha añadido correctamente el CD.");
                con.close();
                cargarDatosTabla();
            }catch(SQLException e){
                e.printStackTrace();
            }
     }
    }//GEN-LAST:event_AddButtonMouseClicked

    private void CDjbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CDjbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CDjbActionPerformed
    private void TablaLibrosAreaMouseClicked(java.awt.event.MouseEvent evt) {                                             
        // Selecciona un elemento de la lista para colocar sus datos en los huecos.
        DefaultTableModel modelo = (DefaultTableModel)TablaCDsArea.getModel();
        int ind = TablaCDsArea.getSelectedRow();
        CDjb.setText(modelo.getValueAt(ind, 0).toString());
        NombreCDText.setText(modelo.getValueAt(ind, 1).toString());
        CantanteText.setText(modelo.getValueAt(ind, 2).toString());
        NumCdsbox.setSelectedItem(modelo.getValueAt(ind, 3).toString()); 
    }    
    
    private void EditButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditButtonMouseClicked
        // TODO add your handling code here:
        if(CDjb.getText().isEmpty()|| NombreCDText.getText().isEmpty()|| CantanteText.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Introduzca el ID del CD, el nombre de este y el cantante que desea editar.");
        }else{
            try{
                //con = DriverManager.getConnection("jdbc:derby://localhost:1527/database","ad","ad");
                con = DriverManager.getConnection("jdbc:derby:.\\database","ad","ad");
                String updateQuery = "update AD.CDS set NOMBRE='"+NombreCDText.getText()+"',CANTANTE='"+CantanteText.getText()+"',NUMCDS="+NumCdsbox.getSelectedItem(); 
                updateQuery += " where ID="+CDjb.getText();
                java.sql.Statement add = con.createStatement();
                add.executeUpdate(updateQuery);
                JOptionPane.showMessageDialog(this, "Actualización del CD ha sido llevada a cabo.");
                con.close();
                cargarDatosTabla();
            }catch(SQLException e){
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_EditButtonMouseClicked

    private void DeleteButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteButtonMouseClicked
        // TODO add your handling code here:
        if(CDjb.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Introduzca el ID del CD que desea borrar.");
        }else{
            try{
                //con = DriverManager.getConnection("jdbc:derby://localhost:1527/database","ad","ad");
                con = DriverManager.getConnection("jdbc:derby:.\\database","ad","ad");
                String id = CDjb.getText();
                String Query = "delete from AD.CDS where CDID="+id;
                Statement add = con.createStatement();
                add.executeUpdate(Query);
                con.close();
                cargarDatosTabla();
                JOptionPane.showMessageDialog(this, "CD Borrado");
            }catch(SQLException e){
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_DeleteButtonMouseClicked

    private void TablaCDsAreaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaCDsAreaMouseClicked
        // TODO add your handling code here:
        DefaultTableModel modelo = (DefaultTableModel)TablaCDsArea.getModel();
        int ind = TablaCDsArea.getSelectedRow();
        CDjb.setText(modelo.getValueAt(ind, 0).toString());
        NombreCDText.setText(modelo.getValueAt(ind, 1).toString());
        CantanteText.setText(modelo.getValueAt(ind, 2).toString());
        NumCdsbox.setSelectedItem(modelo.getValueAt(ind, 3).toString());
       
    }//GEN-LAST:event_TablaCDsAreaMouseClicked

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
            java.util.logging.Logger.getLogger(VistaCDs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaCDs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaCDs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaCDs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaCDs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JTextField CDjb;
    private javax.swing.JTextField CantanteText;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JButton EditButton;
    private javax.swing.JTextField NombreCDText;
    private javax.swing.JComboBox<String> NumCdsbox;
    private javax.swing.JTable TablaCDsArea;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
