/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service.Interface;
import Model.ChiTietSanPham;
import java.util.ArrayList;
/**
 *
 * @author Admin
 */
public interface ChiTietSanPhaminterface {
    
    ArrayList<ChiTietSanPham> getList();
    
    void insert(ChiTietSanPham ctsp);
    
    void update(ChiTietSanPham ctsp, String id);
    
    void delete(String id);
    
    
}
