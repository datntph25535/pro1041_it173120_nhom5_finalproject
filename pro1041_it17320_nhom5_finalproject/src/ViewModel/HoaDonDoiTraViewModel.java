/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewModel;

import Model.NhanVien;
import java.sql.Date;

/**
 *
 * @author Admin
 */
public class HoaDonDoiTraViewModel {

    private String id;
    private NhanVien nv;
//    private ChiTietSP ctsp;
    private String ma;
    private Date ngayDoi;
    private Date ngayNhan;
    private int soLuong;

    public HoaDonDoiTraViewModel() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public NhanVien getNv() {
        return nv;
    }

    public void setNv(NhanVien nv) {
        this.nv = nv;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public Date getNgayDoi() {
        return ngayDoi;
    }

    public void setNgayDoi(Date ngayDoi) {
        this.ngayDoi = ngayDoi;
    }

    public Date getNgayNhan() {
        return ngayNhan;
    }

    public void setNgayNhan(Date ngayNhan) {
        this.ngayNhan = ngayNhan;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public HoaDonDoiTraViewModel(String id, NhanVien nv, String ma, Date ngayDoi, Date ngayNhan, int soLuong) {
        this.id = id;
        this.nv = nv;
        this.ma = ma;
        this.ngayDoi = ngayDoi;
        this.ngayNhan = ngayNhan;
        this.soLuong = soLuong;
    }
}
