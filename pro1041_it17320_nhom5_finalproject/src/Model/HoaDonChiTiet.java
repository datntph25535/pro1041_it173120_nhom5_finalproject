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
public class HoaDonChiTiet {

    private String id;
    private HoaDon hd;
//    private ChiTietSanPham ctsp;
//    private KhuyenMai km;
    private int soLuong;
    private double donGia;
    private double tienKM;

    public HoaDonChiTiet() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public HoaDon getHd() {
        return hd;
    }

    public void setHd(HoaDon hd) {
        this.hd = hd;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getTienKM() {
        return tienKM;
    }

    public void setTienKM(double tienKM) {
        this.tienKM = tienKM;
    }

 
    
    

}
