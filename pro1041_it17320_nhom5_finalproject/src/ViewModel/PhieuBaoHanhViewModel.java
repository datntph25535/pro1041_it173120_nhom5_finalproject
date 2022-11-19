/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModel;

import java.util.Date;

/**
 *
 * @author Administrator
 */
public class PhieuBaoHanhViewModel {
    private String id;
    private String ma;
    private Date ngayBH;
    private Date ngayMuaHang;
    private String diaChi;
    private Date thoiGianBH;
    private String tenNguoiNhan;

    public PhieuBaoHanhViewModel() {
    }

    public PhieuBaoHanhViewModel(String id, String ma, Date ngayBH, Date ngayMuaHang, String diaChi, Date thoiGianBH, String tenNguoiNhan) {
        this.id = id;
        this.ma = ma;
        this.ngayBH = ngayBH;
        this.ngayMuaHang = ngayMuaHang;
        this.diaChi = diaChi;
        this.thoiGianBH = thoiGianBH;
        this.tenNguoiNhan = tenNguoiNhan;
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
    
    public Object[] toDataRow(){
        return new Object[]{id,  ma,  ngayBH, ngayMuaHang, diaChi,  thoiGianBH,  tenNguoiNhan};
    }
}
