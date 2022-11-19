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
public class SanPham {
    
    private String idSP;
    private String maSP;
    private String tenSP;

    public SanPham() {
    }

    public SanPham(String idSP, String maSP, String tenSP) {
        this.idSP = idSP;
        this.maSP = maSP;
        this.tenSP = tenSP;
    }

    
    public String getIdSP() {
        return idSP;
    }

    public void setIdSP(String idSP) {
        this.idSP = idSP;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    @Override
    public String toString() {
        return tenSP + "-" + idSP;
    }
    
    
    
    
}
