/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Model.NhanVien;
import Repository.NhanVienRepo;
import java.util.ArrayList;


/**
 *
 * @author PC
 */
public class NhanVienService {
    NhanVienRepo nvr = new NhanVienRepo();
    
    public ArrayList<NhanVien> getList(){
        return nvr.getList();
    }
    
    public void insert(NhanVien nv){
        nvr.insert(nv);
    }
    
    public void delete(String id){
        nvr.delele(id);
    }
    
    public void update(String id, NhanVien nv){
        nvr.update(id, nv);
    }
    
    public NhanVien search(String ma){
        return nvr.search(ma);
    }
}
