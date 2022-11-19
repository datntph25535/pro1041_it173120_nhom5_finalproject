/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

/**
 *
 * @author Administrator
 */
public class PhieuBaoHanhCT {
    private ChiTietSanPham idCtsp;
    private PhieuBaoHanh idBH;
    private int soLuong;
    private Date ngNhan;
    private String moTa;
    
    

    public PhieuBaoHanhCT() {
    }

    public PhieuBaoHanhCT(ChiTietSanPham idCtsp, PhieuBaoHanh idBH, int soLuong, Date ngNhan, String moTa) {
        this.idCtsp = idCtsp;
        this.idBH = idBH;
        this.soLuong = soLuong;
        this.ngNhan = ngNhan;
        this.moTa = moTa;
    }

    public ChiTietSanPham getIdCtsp() {
        return idCtsp;
    }

    public void setIdCtsp(ChiTietSanPham idCtsp) {
        this.idCtsp = idCtsp;
    }

    public PhieuBaoHanh getIdBH() {
        return idBH;
    }

    public void setIdBH(PhieuBaoHanh idBH) {
        this.idBH = idBH;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public Date getNgNhan() {
        return ngNhan;
    }

    public void setNgNhan(Date ngNhan) {
        this.ngNhan = ngNhan;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }
    
    
}
