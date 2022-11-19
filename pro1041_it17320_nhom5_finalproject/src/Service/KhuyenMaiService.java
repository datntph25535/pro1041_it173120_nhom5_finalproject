/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Model.KhuyenMai;
import Repository.KhuyenMaiRepo;
import Service.Interface.KhuyenMaiInterface;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class KhuyenMaiService implements KhuyenMaiInterface{
      private KhuyenMaiRepo KMRepo;

    public KhuyenMaiService() {
        this.KMRepo = new KhuyenMaiRepo();
    }

    @Override
    public ArrayList<KhuyenMai> getListKM() {
        return this.KMRepo.all();
    }

    @Override
    public void insert(KhuyenMai km) {
        this.KMRepo.insert(km);
    }

    @Override
    public void update(String id, KhuyenMai km) {
        this.KMRepo.update(id, km);
    }

    @Override
    public void delete(String id) {
        this.KMRepo.delete(id);
    }
    
}
