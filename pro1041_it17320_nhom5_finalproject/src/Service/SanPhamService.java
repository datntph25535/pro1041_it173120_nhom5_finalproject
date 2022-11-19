/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Service;

import Model.SanPham;
import Repository.SanPhamRepo;
import Service.Interface.SanPhamInterface;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class SanPhamService implements SanPhamInterface{
    
    SanPhamRepo spr = new SanPhamRepo();

    @Override
    public ArrayList<SanPham> getAll() {
        return spr.getAll();
    }

    @Override
    public void insert(SanPham sp) {
        spr.insert(sp);
    }

    @Override
    public void update(SanPham sp, String maSP) {
        spr.update(sp, maSP);
    }

    @Override
    public void delete(String maSP) {
        spr.delete(maSP);
    }
    
    

}
