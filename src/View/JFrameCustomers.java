/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.table.DefaultTableModel;
import com.mongodb.BasicDBObject;
import com.mongodb.Mongo;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;

public class JFrameCustomers extends javax.swing.JFrame {

    /**
     * Creates new form JFrameCustomers
     */
    Mongo mongo = null;
    DB db;
    DBCollection collection;
    DBCursor cursor = null;
    MongoClient mongoClient = null;
    
    
    public JFrameCustomers() {
        initComponents();
        mongoClient = new MongoClient("localhost", 27017);
        db = mongoClient.getDB("warungITB");
        collection = db.getCollection("customers");
        cursor = collection.find();
        
        load_table();
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
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        textid = new javax.swing.JTextField();
        textnama = new javax.swing.JTextField();
        textalamat = new javax.swing.JTextField();
        textnotelp = new javax.swing.JTextField();
        btnadd = new javax.swing.JButton();
        btnedit = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblcustomers = new javax.swing.JTable();
        btnreset = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("CUSTOMERS");

        jLabel2.setText("ID Customer");

        jLabel3.setText("Nama Customers");

        jLabel4.setText("Alamat Customers");

        jLabel5.setText("No Telp Customers");

        btnadd.setText("Simpan");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });

        btnedit.setText("Update");
        btnedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditActionPerformed(evt);
            }
        });

        btndelete.setText("Delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        tblcustomers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID Customers", "Nama Customers", "Alamat Customers", "No Telp Customers"
            }
        ));
        tblcustomers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblcustomersMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblcustomers);

        btnreset.setBackground(new java.awt.Color(255, 51, 0));
        btnreset.setText("Reset");
        btnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresetActionPerformed(evt);
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
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 576, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnedit)
                                .addGap(18, 18, 18)
                                .addComponent(btndelete)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textid)
                                    .addComponent(textnama)
                                    .addComponent(textalamat)
                                    .addComponent(textnotelp))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnadd)
                                    .addComponent(btnreset))
                                .addGap(79, 79, 79))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnreset))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(textnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(textalamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(textnotelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnadd))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnedit)
                    .addComponent(btndelete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void load_table(){
        DefaultTableModel model = (DefaultTableModel) tblcustomers.getModel();
        while(cursor.hasNext()){
            DBObject obj = cursor.next();
            String textid = (String)obj.get("idCustomer");
            String textnama = (String)obj.get("namaCustomer");
            String textalamat = (String)obj.get("alamatCustomer");
            String textnotelp = (String)obj.get("notelpCustomer");
            
            model.addRow(new Object[] {
                textid, textnama, textalamat, textnotelp
            });
        }
        tblcustomers.setModel(model);
    }
    
    private void btneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditActionPerformed
        // TODO add your handling code here:
        
        BasicDBObject indexupdate = new BasicDBObject();
        indexupdate.put("idCustomer", textid.getText());
        BasicDBObject update = new BasicDBObject();
        update.put("idCustomer", textid.getText());
        update.put("namaCustomer", textnama.getText());
        update.put("alamatCustomer", textalamat.getText());
        update.put("notelpCustomer", textnotelp.getText());
        
        tbl.setValueAt(textid.getText(), Baris, 0);
        tbl.setValueAt(textnama.getText(), Baris, 1);
        tbl.setValueAt(textalamat.getText(), Baris, 2);
        tbl.setValueAt(textnotelp.getText(), Baris, 3);
        reset();
        tblcustomers.setModel(tbl);
        collection.update(indexupdate, update);
   
    }//GEN-LAST:event_btneditActionPerformed

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        // TODO add your handling code here:
        BasicDBObject add = new BasicDBObject();
        add.put("idCustomer", textid.getText());
        add.put("namaCustomer", textnama.getText());
        add.put("alamatCustomer", textalamat.getText());
        add.put("notelpCustomer", textnotelp.getText());
        
        collection.insert(add);
//        JFrameCustomers main = new JFrameCustomers();
//        main.setVisible(true);
//        this.dispose();

        tbl.addRow(new Object[] {
        textid.getText(), textnama.getText(), textalamat.getText(), textnotelp.getText()
    });
        tblcustomers.setModel(tbl);
        textid.setText("");
        textnama.setText("");
        textalamat.setText("");
        textnotelp.setText("");
        
    }//GEN-LAST:event_btnaddActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        tblcustomers.setModel(tbl);
    }//GEN-LAST:event_formComponentShown

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        // TODO add your handling code here:
//        tbl.removeRow("");
//        tbl.setValueAt(textid.getText(), Baris, 0);
//        tbl.setValueAt(textnama.getText(), Baris, 1);
//        tbl.setValueAt(textalamat.getText(), Baris, 2);
//        tbl.setValueAt(textnotelp.getText(), Baris, 3);
        
        BasicDBObject indexhapus = new BasicDBObject();
        indexhapus.put("idCustomer", textid.getText());
        
        collection.remove(indexhapus);
        tbl.removeRow(Baris);
        reset();
//        JFrameCustomers main = new JFrameCustomers();
//        main.setVisible(true);
//        this.dispose();
    }//GEN-LAST:event_btndeleteActionPerformed

    private void btnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresetActionPerformed
        // TODO add your handling code here:
        textid.setText("");
        textnama.setText("");
        textalamat.setText("");
        textnotelp.setText("");
//        this.dispose();
    }//GEN-LAST:event_btnresetActionPerformed

    private void tblcustomersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblcustomersMouseClicked
        // TODO add your handling code here:
        int baris = tblcustomers.rowAtPoint(evt.getPoint());
        String id = tblcustomers.getValueAt(baris, 0).toString();
        textid.setText(id);
        String nama = tblcustomers.getValueAt(baris, 1).toString();
        textnama.setText(nama);
        String alamat = tblcustomers.getValueAt(baris, 2).toString();
        textalamat.setText(alamat);
        String notelp = tblcustomers.getValueAt(baris, 3).toString();
        textnotelp.setText(notelp);
    }//GEN-LAST:event_tblcustomersMouseClicked

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
            java.util.logging.Logger.getLogger(JFrameCustomers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameCustomers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameCustomers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameCustomers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameCustomers().setVisible(true);
            }
        });
    }
    
    int Baris = 0;
    static Object kolom[] = {"ID Customer","Nama Customer","Alamat Customer","No Telp Customer"};
    DefaultTableModel tbl = new DefaultTableModel(kolom, Baris);

    void reset(){
        textid.setText("");
        textnama.setText("");
        textalamat.setText("");
        textnotelp.setText("");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnedit;
    private javax.swing.JButton btnreset;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tblcustomers;
    private javax.swing.JTextField textalamat;
    private javax.swing.JTextField textid;
    private javax.swing.JTextField textnama;
    private javax.swing.JTextField textnotelp;
    // End of variables declaration//GEN-END:variables
}
