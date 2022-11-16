/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Administrator
 */
public class dongSP {
     private String idDSP;
    private String MaDSP;
    private String tenDSP;

    public dongSP() {
    }

    public dongSP(String idDSP, String MaDSP, String tenDSP) {
        this.idDSP = idDSP;
        this.MaDSP = MaDSP;
        this.tenDSP = tenDSP;
    }

    public String getIdDSP() {
        return idDSP;
    }

    public void setIdDSP(String idDSP) {
        this.idDSP = idDSP;
    }

    public String getMaDSP() {
        return MaDSP;
    }

    public void setMaDSP(String MaDSP) {
        this.MaDSP = MaDSP;
    }

    public String getTenDSP() {
        return tenDSP;
    }

    public void setTenDSP(String tenDSP) {
        this.tenDSP = tenDSP;
    }
    
}
