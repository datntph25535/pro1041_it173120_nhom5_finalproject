/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service.Interface;

import Model.LinhKien;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public interface LinhKieninterface {
    
    ArrayList<LinhKien> getAll();
    
    void insert(LinhKien lk);
    
    void update(LinhKien lk, String ma);
    
    void delete(String ma);
    
}
