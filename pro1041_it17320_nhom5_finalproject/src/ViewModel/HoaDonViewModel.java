/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewModel;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class HoaDonViewModel {

    private String id;
    private String ma;
    private Date ngayThanhToan;
    private Date ngayNhan;
    private Date ngayTao;
    private String diaChi;
    private double thanhtien;
    private String trangThai;

    public HoaDonViewModel() {
    }

    public HoaDonViewModel(String id, String ma, Date ngayThanhToan, Date ngayNhan, Date ngayTao, String diaChi, double thanhtien, String trangThai) {
        this.id = id;
        this.ma = ma;
        this.ngayThanhToan = ngayThanhToan;
        this.ngayNhan = ngayNhan;
        this.ngayTao = ngayTao;
        this.diaChi = diaChi;
        this.thanhtien = thanhtien;
        this.trangThai = trangThai;
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

    public Date getNgayThanhToan() {
        return ngayThanhToan;
    }

    public void setNgayThanhToan(Date ngayThanhToan) {
        this.ngayThanhToan = ngayThanhToan;
    }

    public Date getNgayNhan() {
        return ngayNhan;
    }

    public void setNgayNhan(Date ngayNhan) {
        this.ngayNhan = ngayNhan;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public double getThanhtien() {
        return thanhtien;
    }

    public void setThanhtien(double thanhtien) {
        this.thanhtien = thanhtien;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

}
