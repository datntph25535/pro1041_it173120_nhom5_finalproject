/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service.Interface;

import Model.ChiTietLinhKien;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public interface ChiTietLinhKieninterface {
    
    ArrayList<ChiTietLinhKien> getAll();
    
    void insert(ChiTietLinhKien ctlk);
    
    void update(ChiTietLinhKien ctlk, String idLK, String idHDCT);
    
    void delete(String idLK, String idHDCT);
    
}
