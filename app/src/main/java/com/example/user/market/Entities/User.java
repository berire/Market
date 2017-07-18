package com.example.user.market.Entities;

import java.util.Date;

/**
 * Created by Casper on 18.07.2017.
 */

public class User {
    private String ad;
    private String soyad;
    private String sifre;
    private Date dogumGunu;

    //Sehirin plaka kodu
    private int sehir;

    // Semtin veri tabanindaki unique numarasi
    private int semt;

    // Mahallenin veri tabanindaki unique numarasi
    private int mahalle;

    public User( String ad, String soyad, String sifre, Date dogumGunu, int sehir, int semt, int mahalle){
        this.ad = ad;
        this.soyad = soyad;
        this.sifre = sifre;
        this.dogumGunu = dogumGunu;
        this.sehir = sehir;
        this.semt = semt;
        this.mahalle = mahalle;
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

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    public Date getDogumGunu() {
        return dogumGunu;
    }

    public void setDogumGunu(Date dogumGunu) {
        this.dogumGunu = dogumGunu;
    }

    public int getSehir() {
        return sehir;
    }

    public void setSehir(int sehir) {
        this.sehir = sehir;
    }

    public int getSemt() {
        return semt;
    }

    public void setSemt(int semt) {
        this.semt = semt;
    }

    public int getMahalle() {
        return mahalle;
    }

    public void setMahalle(int mahalle) {
        this.mahalle = mahalle;
    }


}
