/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Model.ChiTietSanPham;
import Repository.ChiTietSanPhamRepo;
import Service.Interface.ChiTietSanPhaminterface;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class ChiTietSanPhamService implements ChiTietSanPhaminterface{
    
    ChiTietSanPhamRepo cr = new ChiTietSanPhamRepo();

    @Override
    public ArrayList<ChiTietSanPham> getList() {
        return cr.getList();
    }

    @Override
    public void insert(ChiTietSanPham ctsp) {
        cr.insert(ctsp);
    }

    @Override
    public void update(ChiTietSanPham ctsp, String id) {
        cr.update(ctsp, id);
    }

    @Override
    public void delete(String id) {
        cr.delete(id);
    }
    
    
    
}
