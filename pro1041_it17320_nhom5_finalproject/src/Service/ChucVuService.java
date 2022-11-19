/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Model.ChucVu;
import Repository.ChucVuRepo;
import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class ChucVuService {
    ChucVuRepo cvr = new ChucVuRepo();
    
    public ArrayList<ChucVu> getList(){
        return cvr.getList();
    }
    
    public void insert(ChucVu cv){
        cvr.insert(cv);
    }
    
    public void delete(String id){
        cvr.delete(id);
    }
    
    public void update(String id, ChucVu cv){
        cvr.update(id, cv);
    }
    
    public ChucVu search(String ma){
        return cvr.search(ma);
    }
}
