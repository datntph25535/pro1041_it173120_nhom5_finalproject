/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Model.ChiTietLinhKien;
import Repository.ChiTietLinhKienRepo;
import Service.Interface.ChiTietLinhKieninterface;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class ChiTietLinhKienService implements ChiTietLinhKieninterface{
    
    ChiTietLinhKienRepo ctr = new ChiTietLinhKienRepo();

    @Override
    public ArrayList<ChiTietLinhKien> getAll() {
        return ctr.getAll();
    }

    @Override
    public void insert(ChiTietLinhKien ctlk) {
        ctr.insert(ctlk);
    }

    @Override
    public void update(ChiTietLinhKien ctlk, String idLK, String idHDCT) {
        ctr.update(ctlk, idLK, idHDCT);
    }

    @Override
    public void delete(String idLK, String idHDCT) {
        ctr.delete(idLK, idHDCT);
    }
    
}
