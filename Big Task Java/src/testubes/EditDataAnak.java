/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testubes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.TableModel;

/**
 *
 * @author User
 */
public class EditDataAnak extends javax.swing.JInternalFrame {

    private void kosongkan_form(){
       //nama.setEditable(true);
        nama.setText(null);
        tanggalmasuk.setText(null);
        tanggallahir.setText(null);
        penyakit.setText(null);
        keterangan.setText(null);
    }
    /**
     * Creates new form editdataanak
     */
    public EditDataAnak() {
        initComponents();
         this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        nama = new javax.swing.JTextField();
        tanggalmasuk = new javax.swing.JTextField();
        tanggallahir = new javax.swing.JTextField();
        penyakit = new javax.swing.JTextField();
        keterangan = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        edit = new javax.swing.JButton();
        tmblKembali = new javax.swing.JButton();

        setVisible(false);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(1024, 740));

        jLabel1.setText("Nama");

        jLabel2.setText("Tanggal Masuk");

        jLabel3.setText("Tanggal Lahir");

        jLabel4.setText("Penyakit");

        jLabel5.setText("Keterangan");

        jLabel6.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jLabel6.setText("Form Edit Data Anak");

        edit.setText("Edit");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });

        tmblKembali.setText("Kembali");
        tmblKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tmblKembaliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(313, 313, 313)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel2)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(penyakit, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tanggallahir, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tanggalmasuk, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(tmblKembali)
                            .addGap(18, 18, 18)
                            .addComponent(edit))
                        .addComponent(keterangan, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(439, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(jLabel6)
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tanggalmasuk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tanggallahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(penyakit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(keterangan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edit)
                    .addComponent(tmblKembali))
                .addContainerGap(333, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        // TODO add your handling code here:
        try{
            int index = DataAnak.tabel_anak_asuh.getSelectedRow();
            TableModel model= DataAnak.tabel_anak_asuh.getModel();
            String nm=model.getValueAt(index, 0).toString();
            
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/panti_asuhan","root","");
            Statement stat=conn.createStatement();
            String sql ="UPDATE `tabel_anak_asuh` SET `nama`='%s',`tanggal masuk`='%s',`tanggal lahir`='%s',`penyakit`='%s',`keterangan`='%s' WHERE `nama`='%s'";
            sql = String.format(sql,nama.getText(),tanggalmasuk.getText(),tanggallahir.getText(),penyakit.getText(),keterangan.getText(),nm);
            if(stat.executeUpdate(sql)>=1){              
                JOptionPane.showMessageDialog(null,"ANDA BERHASIL EDIT DATA","PEMBERITAHUAN",JOptionPane.INFORMATION_MESSAGE); 
            }
            else{
                JOptionPane.showMessageDialog(null,"MAAF ANDA TIDAK BISA EDIT DATA","PEMBERITAHUAN",JOptionPane.INFORMATION_MESSAGE);
            }
            kosongkan_form();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
            //System.out.println("Error : "+ e.getMessage());
        }
    }//GEN-LAST:event_editActionPerformed

    private void tmblKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tmblKembaliActionPerformed
        // TODO add your handling code here:
        jPanel1.removeAll(); 
        DataAnak das= new DataAnak();               
        jPanel1.add(das).setVisible(true);
    }//GEN-LAST:event_tmblKembaliActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton edit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JTextField keterangan;
    public javax.swing.JTextField nama;
    public javax.swing.JTextField penyakit;
    public javax.swing.JTextField tanggallahir;
    public javax.swing.JTextField tanggalmasuk;
    private javax.swing.JButton tmblKembali;
    // End of variables declaration//GEN-END:variables
}
