/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Admin
 */
public class ChiTietLinhKien {
    
    private String idLK;
    private String idHDCT;
    private int soLuongTon;
    private double giaNhap;
    private double giaBan;
    private String moTa;

    public ChiTietLinhKien() {
    }

    public ChiTietLinhKien(String idLK, String idHDCT, int soLuongTon, double giaNhap, double giaBan, String moTa) {
        this.idLK = idLK;
        this.idHDCT = idHDCT;
        this.soLuongTon = soLuongTon;
        this.giaNhap = giaNhap;
        this.giaBan = giaBan;
        this.moTa = moTa;
    }

    public String getIdLK() {
        return idLK;
    }

    public void setIdLK(String idLK) {
        this.idLK = idLK;
    }

    public String getIdHDCT() {
        return idHDCT;
    }

    public void setIdHDCT(String idHDCT) {
        this.idHDCT = idHDCT;
    }

    public int getSoLuongTon() {
        return soLuongTon;
    }

    public void setSoLuongTon(int soLuongTon) {
        this.soLuongTon = soLuongTon;
    }

    public double getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(double giaNhap) {
        this.giaNhap = giaNhap;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }
    
    
    
}
