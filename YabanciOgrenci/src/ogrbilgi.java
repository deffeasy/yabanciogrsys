/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author musta
 */
public class ogrbilgi {
    
    public int id;
    public String ad;
    public String soyad;
    public String universite;
    public String bolum;
    public String tc;
    public String email;
    public String irk;
    public String cinsiyet;
    public String yas;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getUniversite() {
        return universite;
    }

    public void setUniversite(String universite) {
        this.universite = universite;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public String getTc() {
        return tc;
    }

    public void setTc(String tc) {
        this.tc = tc;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIrk() {
        return irk;
    }

    public void setIrk(String irk) {
        this.irk = irk;
    }

    public String getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(String cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    public String getYas() {
        return yas;
    }

    public void setYas(String yas) {
        this.yas = yas;
    }

    public ogrbilgi(int id, String ad, String soyad, String universite, String bolum, String tc, String email, String irk, String cinsiyet, String yas) {
        this.id = id;
        this.ad = ad;
        this.soyad = soyad;
        this.universite = universite;
        this.bolum = bolum;
        this.tc = tc;
        this.email = email;
        this.irk = irk;
        this.cinsiyet = cinsiyet;
        this.yas = yas;
    }
    
}
