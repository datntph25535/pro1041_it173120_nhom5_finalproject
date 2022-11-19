/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service.Interface;

import Model.KhachHang;
import java.util.ArrayList;

/**
 *
 * @author PC
 */
public interface KhachHangInterface {
    ArrayList<KhachHang> getList();
    
    void insert(KhachHang kh);
    
    void delete(String id);
    
    void update(String id, KhachHang kh);
    
    KhachHang searchMa(String ma);
}
