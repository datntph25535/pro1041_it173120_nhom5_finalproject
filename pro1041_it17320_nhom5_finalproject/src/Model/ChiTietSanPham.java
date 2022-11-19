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
public class ChiTietSanPham {
    
    private String id;
    private double giaNhap;
    private double giaBan;
    private int soLuongTon;
    private String ram;
    private String cpu;
    private String serialNumber;
    private String cardMang;
    private String kichThuoc;
    private String manHinh;
    private String congKetNoi;
    private String idSP;
    private String idNCC;
    private String idMS;
    private String idDSP;

    public ChiTietSanPham() {
    }

    public ChiTietSanPham(String id, double giaNhap, double giaBan, int soLuongTon, String ram, String cpu, String serialNumber, String cardMang, String kichThuoc, String manHinh, String congKetNoi, String idSP, String idNCC, String idMS, String idDSP) {
        this.id = id;
        this.giaNhap = giaNhap;
        this.giaBan = giaBan;
        this.soLuongTon = soLuongTon;
        this.ram = ram;
        this.cpu = cpu;
        this.serialNumber = serialNumber;
        this.cardMang = cardMang;
        this.kichThuoc = kichThuoc;
        this.manHinh = manHinh;
        this.congKetNoi = congKetNoi;
        this.idSP = idSP;
        this.idNCC = idNCC;
        this.idMS = idMS;
        this.idDSP = idDSP;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public int getSoLuongTon() {
        return soLuongTon;
    }

    public void setSoLuongTon(int soLuongTon) {
        this.soLuongTon = soLuongTon;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getCardMang() {
        return cardMang;
    }

    public void setCardMang(String cardMang) {
        this.cardMang = cardMang;
    }

    public String getKichThuoc() {
        return kichThuoc;
    }

    public void setKichThuoc(String kichThuoc) {
        this.kichThuoc = kichThuoc;
    }

    public String getManHinh() {
        return manHinh;
    }

    public void setManHinh(String manHinh) {
        this.manHinh = manHinh;
    }

    public String getCongKetNoi() {
        return congKetNoi;
    }

    public void setCongKetNoi(String congKetNoi) {
        this.congKetNoi = congKetNoi;
    }

    public String getIdSP() {
        return idSP;
    }

    public void setIdSP(String idSP) {
        this.idSP = idSP;
    }

    public String getIdNCC() {
        return idNCC;
    }

    public void setIdNCC(String idNCC) {
        this.idNCC = idNCC;
    }

    public String getIdMS() {
        return idMS;
    }

    public void setIdMS(String idMS) {
        this.idMS = idMS;
    }

    public String getIdDSP() {
        return idDSP;
    }

    public void setIdDSP(String idDSP) {
        this.idDSP = idDSP;
    }
    
    
    
}
