/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.PhieuBaoHanhCT;
import Repository.BaoHanhCTRepo;
import Service.Interface.BaoHanhCTInterface;
import ViewModel.BaoHanhCTViewModel;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class BaoHanhCTServices implements BaoHanhCTInterface {

    private final BaoHanhCTRepo bhctRepo = new BaoHanhCTRepo();

    @Override
    public List<BaoHanhCTViewModel> getAll() {
        return bhctRepo.getAll();
    }

    @Override
    public String add(PhieuBaoHanhCT bh) {
        boolean add = bhctRepo.add(bh);
        if (add) {
            return "Add success";
        } else {
            return "Add error";
        }
    }

    @Override
    public String delete(String idBH) {
        boolean delete = bhctRepo.delete(idBH);
        if (delete) {
            return "Delete success";
        } else {
            return "Delete error";
        }
    }

}
