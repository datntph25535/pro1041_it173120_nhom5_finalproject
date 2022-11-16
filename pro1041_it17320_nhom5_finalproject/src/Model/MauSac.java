/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Administrator
 */
public class MauSac {
    private String idMS;
    private String MaMS;
    private String tenMS;

    public MauSac() {
    }

    public MauSac(String idMS, String MaMS, String tenMS) {
        this.idMS = idMS;
        this.MaMS = MaMS;
        this.tenMS = tenMS;
    }

    public String getIdMS() {
        return idMS;
    }

    public void setIdMS(String idMS) {
        this.idMS = idMS;
    }

    public String getMaMS() {
        return MaMS;
    }

    public void setMaMS(String MaMS) {
        this.MaMS = MaMS;
    }

    public String getTenMS() {
        return tenMS;
    }

    public void setTenMS(String tenMS) {
        this.tenMS = tenMS;
    }
    
    
}
