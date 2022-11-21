/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author DELL
 */
public class PhieuBaoHanh {
    private String id;
    private String ma;
    private Date ngayMuaHang;
    private Date ngayBH;
    private Date thoiGianBH;
    private String tenKH;
    private hdct hdct;

    public PhieuBaoHanh() {
    }

    public PhieuBaoHanh(String id, String ma, Date ngayBH, Date ngayMuaHang, String diaChi, Date thoiGianBH, String tenNguoiNhan) {
        this.id = id;
        this.ma = ma;
        this.ngayBH = ngayBH;
        this.ngayMuaHang = ngayMuaHang;
        this.diaChi = diaChi;
        this.thoiGianBH = thoiGianBH;
        this.tenNguoiNhan = tenNguoiNhan;
        
    }

    public PhieuBaoHanh(String id) {
        this.id = id;
    }
    

   
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public Date getNgayBH() {
        return ngayBH;
    }

    public void setNgayBH(Date ngayBH) {
        this.ngayBH = ngayBH;
    }

    public Date getNgayMuaHang() {
        return ngayMuaHang;
    }

    public void setNgayMuaHang(Date ngayMuaHang) {
        this.ngayMuaHang = ngayMuaHang;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public Date getThoiGianBH() {
        return thoiGianBH;
    }

    public void setThoiGianBH(Date thoiGianBH) {
        this.thoiGianBH = thoiGianBH;
    }

    public String getTenNguoiNhan() {
        return tenNguoiNhan;
    }

    public void setTenNguoiNhan(String tenNguoiNhan) {
        this.tenNguoiNhan = tenNguoiNhan;
    }
    
    
}
