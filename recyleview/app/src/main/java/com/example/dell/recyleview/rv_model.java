package com.example.dell.recyleview;

public class rv_model{
    private String id;
    private String nama;
    private String alamat;

    public rv_model(String id,String nama, String alamat){
        this.id = id;
        this.nama = nama;
        this.alamat = alamat;

    }

    public String getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }
}