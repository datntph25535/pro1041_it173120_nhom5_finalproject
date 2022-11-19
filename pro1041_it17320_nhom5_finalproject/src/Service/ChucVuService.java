/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Model.ChucVu;
import Repository.ChucVuRepo;
import Service.Interface.ChucVuInterface;
import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class ChucVuService implements ChucVuInterface{
    ChucVuRepo cvr = new ChucVuRepo();
    
    @Override
    public ArrayList<ChucVu> getList(){
        return cvr.getList();
    }
    
    @Override
    public void insert(ChucVu cv){
        cvr.insert(cv);
    }
    
    @Override
    public void delete(String id){
        cvr.delete(id);
    }
    
    @Override
    public void update(String id, ChucVu cv){
        cvr.update(id, cv);
    }
    
    @Override
    public ChucVu search(String ma){
        return cvr.search(ma);
    }
}
