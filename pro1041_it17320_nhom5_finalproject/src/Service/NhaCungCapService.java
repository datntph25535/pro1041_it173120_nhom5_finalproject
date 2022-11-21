/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Model.NhaCungCap;
import Repository.NhaCungCapRepo;
import Service.Interface.NhaCungCapInterface;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class NhaCungCapService implements NhaCungCapInterface {

    private NhaCungCapRepo NccRepo;

    public NhaCungCapService() {
        this.NccRepo = new NhaCungCapRepo();
    }

    @Override
    public ArrayList<NhaCungCap> getListNcc() {
        return this.NccRepo.all();
    }

    @Override
    public void insert(NhaCungCap ncc) {

        this.NccRepo.insert(ncc);
    }

    @Override
    public void update(String id, NhaCungCap ncc) {

        this.NccRepo.update(id, ncc);
    }

    @Override
    public void delete(String id) {

        this.delete(id);
    }

}
