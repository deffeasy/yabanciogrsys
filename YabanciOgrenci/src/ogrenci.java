/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author musta
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;


import static java.sql.DriverManager.getConnection;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ogrenci {
    private Connection con = null; 
    private Statement statement = null;
    private PreparedStatement preparedStatement=null;
    
    
    
    public void ogrenciSil(int id){
        String sorgu="Delete from yabanciogr where id=?";
        
        try {
            preparedStatement=con.prepareStatement(sorgu);
            preparedStatement.setInt(1,id);
            
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ogrenci.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    public void ogrenciGuncelle(int id,String newname,String newsurname,String newuni,String newbolum,String newtc,String newemail,String newirk,String newcinsiyet,String newyas){
    
    String sorgu="Update yabanciogr set ad=? , soyad=? , email=? , universite=? , bolum=? , tc=? , email=? , irk=? , cinsiyet=? , yas=? where id=?"; //parametrede gireceimiz id si olanların name surname vs sini degistirir
        try {
            preparedStatement=con.prepareStatement(sorgu);
            preparedStatement.setString(1, newname);
            preparedStatement.setString(2, newsurname);
            preparedStatement.setString(3, newuni);
            preparedStatement.setString(4,newbolum);
            preparedStatement.setString(5,newtc);
            preparedStatement.setString(6,newemail);
            preparedStatement.setString(7,newirk);
            preparedStatement.setString(8,newcinsiyet);
            preparedStatement.setString(9,newyas);
            preparedStatement.setInt(10,id);
            
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(ogrenci.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    }
    
    
      public void ogrenciEkle(String ad,String soyad,String universite, String bolum, String tc, String email, String irk, String cinsiyet, String yas) {
        
        String sorgu = "Insert Into yabanciogr (ad,soyad,universite,bolum,tc,email,irk,cinsiyet,yas) VALUES(?,?,?,?,?,?,?,?,?)";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            
            
            preparedStatement.setString(1, ad);
            preparedStatement.setString(2, soyad);
            preparedStatement.setString(3, universite);
            preparedStatement.setString(4, tc);
            preparedStatement.setString(5, bolum);
            preparedStatement.setString(6, email);
            preparedStatement.setString(7, irk);
            preparedStatement.setString(8, cinsiyet);
             preparedStatement.setString(9, yas);
            
            
            preparedStatement.executeUpdate();
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(ogrenci.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
        
    }
    
    
    public ArrayList<ogrbilgi> ogrencileriGetir(){
        
      
        
        ArrayList<ogrbilgi> cikti=new ArrayList<ogrbilgi>();
        
        try {
            statement=con.createStatement();
            String sorgu="Select  * from yabanciogr";
            
            ResultSet rs=statement.executeQuery(sorgu);
            
            while(rs.next())
            {
                 int id=rs.getInt("id");
                 String ad=rs.getString("ad");
                 String soyad=rs.getString("soyad");
                 String universite=rs.getString("universite");
                 String bolum=rs.getString("bolum");
                 String tc=rs.getString("tc");
                 String email=rs.getString("email");
                 String irk=rs.getString("irk");
                 String cinsiyet=rs.getString("cinsiyet");
                 String yas=rs.getString("yas");
                 
                 
                 
                 cikti.add(new ogrbilgi(id,ad,soyad,universite,bolum,tc,email,irk,cinsiyet,yas));
                 
                         
            }
            return cikti;
            
        } catch (SQLException ex) {
            Logger.getLogger(ogrenci.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
        
    }
    public  boolean girisYap(String kullanici_adi,String parola){
        
        String sorgu="Select * From admin where username=? and password =? ";
        try {
            preparedStatement=con.prepareStatement(sorgu);
            
            
            preparedStatement.setString(1,kullanici_adi);
            preparedStatement.setString(2,parola);
            
            ResultSet rs=preparedStatement.executeQuery();
            
            if(rs.next()==false)
            {
                return false;
                
            }
            else{
                
                return true;
            } 
            
        } catch (SQLException ex) {
            Logger.getLogger(ogrenci.class.getName()).log(Level.SEVERE, null, ex);
            return false;
            
        }
        
        
    }

    public ogrenci()
    {

        //url: jdbc üzerinden mysql e bağlanıcaz host + port + veri tabanı ismi
        // yani--> jdbc:mysql://localhost:3306/demo
        String url = "jdbc:mysql://" + Db.host + ":" + Db.port + "/" + Db.db_ismi + "?useUnicode=true&characterEncoding=utf8";

        // veri tabanına bağlanmak için driverimizi oluşturuyoruz.


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


        try {
            con = getConnection(url, Db.kullanici_adi, Db.parola);
            System.out.println("Bağlantı başarılı");
        } catch (SQLException throwables) {
            System.out.println("Bağlantı başarısız");
        }

    }

    public static void main(String[] args){
        ogrenci islem=new ogrenci();

    }


}

