/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModel;

/**
 *
 * @author Administrator
 */
public class mauSacViewModel {
     private String idMS;
    private String MaMS;
    private String tenMS;

    public mauSacViewModel() {
    }

    public mauSacViewModel(String idMS, String MaMS, String tenMS) {
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

    public Object[] toDataRow(){
        return new Object[]{idMS,MaMS,tenMS};
    }

    @Override
    public String toString() {
        return tenMS + "-" + idMS;
    }
    
    
}
