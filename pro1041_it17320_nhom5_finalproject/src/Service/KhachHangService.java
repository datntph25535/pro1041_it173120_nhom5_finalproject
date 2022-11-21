/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Model.KhachHang;
import Repository.KhachHangRepo;
import Service.Interface.KhachHangInterface;
import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class KhachHangService implements KhachHangInterface{
    KhachHangRepo khr = new KhachHangRepo();
    
    @Override
    public ArrayList<KhachHang> getList(){
        return khr.getList();
    }
    
    @Override
    public void insert(KhachHang kh){
        khr.insert(kh);
    }
    
    @Override
    public void delete(String ma){
        khr.delete(ma);
    }
    
    @Override
    public void update(String id, KhachHang kh){
        khr.update(id, kh);
    }
    
    @Override
    public KhachHang searchMa(String ma){
        return khr.searchMa(ma);
    }
}
