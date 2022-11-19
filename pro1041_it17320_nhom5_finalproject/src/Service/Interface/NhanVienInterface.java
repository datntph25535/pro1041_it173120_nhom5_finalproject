/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service.Interface;

import Model.NhanVien;
import java.util.ArrayList;

/**
 *
 * @author PC
 */
public interface NhanVienInterface {
    ArrayList<NhanVien> getList();
    
    void insert(NhanVien nv);
    
    void delete(String id);
    
    void update(String id, NhanVien nv);
    
    NhanVien search(String ma);
}
