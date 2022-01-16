

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


public class scc extends javax.swing.JDialog {

      DefaultTableModel model;
      ogrenci islemler=new ogrenci();
  
    public scc(java.awt.Frame parent, boolean modal) {
        
        super(parent, modal);
        initComponents();
        model=(DefaultTableModel) ogrenci_tablosu.getModel();
        ogrenciGoruntule();
    }

   
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ogrenci_tablosu = new javax.swing.JTable();
        name_field = new javax.swing.JTextField();
        surname_field = new javax.swing.JTextField();
        university_field = new javax.swing.JTextField();
        bolum_field = new javax.swing.JTextField();
        tc_field = new javax.swing.JTextField();
        email_field = new javax.swing.JTextField();
        irk_field = new javax.swing.JTextField();
        cinsiyet_field = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        mesaj_yazisi = new javax.swing.JLabel();
        message_yazisi = new javax.swing.JLabel();
        ogrenci_add = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        yas_field = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setText("AD");

        jLabel2.setText("SOYAD");

        jLabel3.setText("ÜNİVERSİTE");

        jLabel4.setText("BÖLÜM");

        jLabel5.setText("TC");

        jLabel6.setText("EMAİL");

        jLabel7.setText("IRK");

        jLabel8.setText("CİNSİYET");

        ogrenci_tablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "İD", "AD", "SOYAD", "UNİVERSİTE", "TC", "BOLUM", "EMAİL", "IRK", "CİNSİYET", "YAS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ogrenci_tablosu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ogrenci_tablosuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ogrenci_tablosu);
        if (ogrenci_tablosu.getColumnModel().getColumnCount() > 0) {
            ogrenci_tablosu.getColumnModel().getColumn(0).setResizable(false);
            ogrenci_tablosu.getColumnModel().getColumn(1).setResizable(false);
            ogrenci_tablosu.getColumnModel().getColumn(2).setResizable(false);
            ogrenci_tablosu.getColumnModel().getColumn(3).setResizable(false);
            ogrenci_tablosu.getColumnModel().getColumn(4).setResizable(false);
            ogrenci_tablosu.getColumnModel().getColumn(5).setResizable(false);
            ogrenci_tablosu.getColumnModel().getColumn(6).setResizable(false);
            ogrenci_tablosu.getColumnModel().getColumn(7).setResizable(false);
            ogrenci_tablosu.getColumnModel().getColumn(8).setResizable(false);
            ogrenci_tablosu.getColumnModel().getColumn(9).setResizable(false);
        }

        ogrenci_add.setText("ADD");
        ogrenci_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ogrenci_addActionPerformed(evt);
            }
        });

        jButton1.setText("UPDATE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("DELETE");
        jButton2.setToolTipText("");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel9.setText("YAŞ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(message_yazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(email_field, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                            .addComponent(name_field, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(surname_field)
                            .addComponent(university_field)
                            .addComponent(bolum_field)
                            .addComponent(tc_field)
                            .addComponent(irk_field)
                            .addComponent(cinsiyet_field)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(yas_field)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(mesaj_yazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ogrenci_add, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(478, 478, 478))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 815, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(130, 130, 130))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(name_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(surname_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(university_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(bolum_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tc_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(email_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(irk_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(cinsiyet_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(51, 51, 51))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(yas_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9)))
                        .addGap(4, 4, 4)
                        .addComponent(message_yazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(32, 32, 32)
                                        .addComponent(jLabel12))
                                    .addComponent(mesaj_yazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ogrenci_add)
                                    .addComponent(jButton1)
                                    .addComponent(jButton2))))))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ogrenci_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ogrenci_addActionPerformed
       mesaj_yazisi.setText("");
       String ad=name_field.getText();
       String soyad=surname_field.getText();
       String universite=university_field.getText();
       String bolum=bolum_field.getText();
       String tc =tc_field.getText();
       String email =email_field.getText();
       String irk =irk_field.getText();
       String cinsiyet =cinsiyet_field.getText(); 
       String yas =yas_field.getText();
       
       
       islemler.ogrenciEkle(ad,soyad,universite,bolum,tc,email,irk,cinsiyet,yas);
       ogrenciGoruntule();
       
       mesaj_yazisi.setText("Yeni öğrenci başarıyla eklendi...");
    }//GEN-LAST:event_ogrenci_addActionPerformed

    private void ogrenci_tablosuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ogrenci_tablosuMouseClicked
         int selectedrow = ogrenci_tablosu.getSelectedRow();
        
        name_field.setText(model.getValueAt(selectedrow,1).toString());
        surname_field.setText(model.getValueAt(selectedrow,2).toString());
        university_field.setText(model.getValueAt(selectedrow,3).toString());
        bolum_field.setText(model.getValueAt(selectedrow,4).toString());
        tc_field.setText(model.getValueAt(selectedrow,5).toString());
        email_field.setText(model.getValueAt(selectedrow,6).toString());
        irk_field.setText(model.getValueAt(selectedrow,7).toString());
        cinsiyet_field.setText(model.getValueAt(selectedrow,8).toString());
        yas_field.setText(model.getValueAt(selectedrow,9).toString());
        
    }//GEN-LAST:event_ogrenci_tablosuMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         
        String ad=name_field.getText();
        String soyad=surname_field.getText();
        String universite=university_field.getText();
        String bolum=bolum_field.getText();
        String tc=tc_field.getText();
        String email=email_field.getText();
        String irk=irk_field.getText();
        String cinsiyet=cinsiyet_field.getText();
        String yas=yas_field.getText();
        
        
        int selectedrow=ogrenci_tablosu.getSelectedRow();
        
        if(selectedrow==-1){
            if(model.getRowCount()==0)
            {
                mesaj_yazisi.setText("Öğrenci tablosu şu anda boş");
            }
            else
            {
                mesaj_yazisi.setText("Lütfen güncellenecek bir çalışan seçin");
            }
            
            
    }//GEN-LAST:event_jButton1ActionPerformed
 else 
        {
         
            int id=(int)model.getValueAt(selectedrow,0);
            islemler.ogrenciGuncelle(id,ad,soyad,universite,bolum,tc,email,irk,cinsiyet,yas);
            ogrenciGoruntule();
            mesaj_yazisi.setText("Öğrenci başarıyla güncellendi");
            
           
        }
    }            
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
  mesaj_yazisi.setText("");
       int selectedrow=ogrenci_tablosu.getSelectedRow();
        
       if(selectedrow==-1) //tablo ya boştur ya da herhangi bir alan seçilmemiştir
       {
           if(model.getRowCount()==0){
               mesaj_yazisi.setText("Öğrenci tablosu şu anda boş...");
               
           }
           else{
           mesaj_yazisi.setText("Lütfen bir öğrenci seçin...");
           }
       }
       else{ //tablo dolu ve öğrenci seçilmişse
           
           int id=(int)model.getValueAt(selectedrow,0);
           islemler.ogrenciSil(id);
           ogrenciGoruntule();
           mesaj_yazisi.setText("Öğrenci başarıyla silindi...");
           
           
       }
    }//GEN-LAST:event_jButton2ActionPerformed
       
 
     public void ogrenciGoruntule(){
        
         model.setRowCount(0); //ogrenciler bosalmıs olucak ogrenci goruntule metodunu cagırdıgımızda tekrardan goruntulencek
        ArrayList<ogrbilgi> ogrenciler=new ArrayList<ogrbilgi>();
        
        
        ogrenciler=islemler.ogrencileriGetir();
        
        if(ogrenciler!=null)
        {
            for(ogrbilgi ogrenci:ogrenciler)
            {
                Object[] eklenecek={ogrenci.getId(),ogrenci.getAd(),ogrenci.getSoyad(),ogrenci.getUniversite(),ogrenci.getBolum(),ogrenci.getTc(),ogrenci.getEmail(),ogrenci.getIrk(),ogrenci.getCinsiyet(),ogrenci.getYas()};
                model.addRow(eklenecek);
                
            }
            
        }
        
    }
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
            java.util.logging.Logger.getLogger(scc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(scc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(scc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(scc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                scc dialog = new scc(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bolum_field;
    private javax.swing.JTextField cinsiyet_field;
    private javax.swing.JTextField email_field;
    private javax.swing.JTextField irk_field;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel mesaj_yazisi;
    private javax.swing.JLabel message_yazisi;
    private javax.swing.JTextField name_field;
    private javax.swing.JButton ogrenci_add;
    private javax.swing.JTable ogrenci_tablosu;
    private javax.swing.JTextField surname_field;
    private javax.swing.JTextField tc_field;
    private javax.swing.JTextField university_field;
    private javax.swing.JTextField yas_field;
    // End of variables declaration//GEN-END:variables
}
