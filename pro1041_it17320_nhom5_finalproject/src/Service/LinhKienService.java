/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Model.LinhKien;
import Repository.LinhKienRepo;
import Service.Interface.LinhKieninterface;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class LinhKienService implements LinhKieninterface {

    LinhKienRepo lkr = new LinhKienRepo();

    @Override
    public ArrayList<LinhKien> getAll() {
        return lkr.getAll();
    }

    @Override
    public void insert(LinhKien lk) {
        lkr.insert(lk);
    }

    @Override
    public void update(LinhKien lk, String ma) {
        lkr.update(lk, ma);
    }

    @Override
    public void delete(String ma) {
        lkr.delete(ma);
    }

}
