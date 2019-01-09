package com.zainul.httpconnectionexample.httpexample;

import com.google.gson.annotations.SerializedName;

/**
 *
 * @author user-root
 */
public class Event {
    @SerializedName("id")
    private int id;
    
    @SerializedName("kode")
    private String kode;
    
    @SerializedName("nama")
    private String nama;
    
    @SerializedName("tanggal")
    private String tanggal;

    public Event(int id, String kode, String nama, String tanggal) {
        this.id = id;
        this.kode = kode;
        this.nama = nama;
        this.tanggal = tanggal;
    }

    public Event(String kode, String nama, String tanggal) {
        this.kode = kode;
        this.nama = nama;
        this.tanggal = tanggal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }
    
    
    
}
