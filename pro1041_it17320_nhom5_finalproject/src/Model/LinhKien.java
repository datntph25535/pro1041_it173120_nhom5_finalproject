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
public class LinhKien {
    
    private String id;
    private String maLinhKien;
    private String tenLinhKien;

    public LinhKien() {
    }

    public LinhKien(String id, String maLinhKien, String tenLinhKien) {
        this.id = id;
        this.maLinhKien = maLinhKien;
        this.tenLinhKien = tenLinhKien;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMaLinhKien() {
        return maLinhKien;
    }

    public void setMaLinhKien(String maLinhKien) {
        this.maLinhKien = maLinhKien;
    }

    public String getTenLinhKien() {
        return tenLinhKien;
    }

    public void setTenLinhKien(String tenLinhKien) {
        this.tenLinhKien = tenLinhKien;
    }

    @Override
    public String toString() {
        return tenLinhKien + "-" + id;
    }
    
    
    
    
}
