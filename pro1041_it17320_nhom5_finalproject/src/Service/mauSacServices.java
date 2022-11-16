/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.MauSac;
import Repository.mauSacRepo;
import Service.Interface.mauSacInterface;
import ViewModel.mauSacViewModel;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class mauSacServices implements mauSacInterface {

    private final mauSacRepo msRepo = new mauSacRepo();

    @Override
    public List<mauSacViewModel> getAll() {
        return msRepo.getAll();
    }

    @Override
    public String add(MauSac ms) {
        boolean addMS = msRepo.add(ms);
        if (addMS) {
            return "Add success";
        } else {
            return "Add error";
        }
    }

    @Override
    public String update(MauSac ms,String id ) {
        boolean updaMS = msRepo.update(ms, id);
        if (updaMS) {
            return "Update success";
        } else {
            return "Update error";
        }
    }

    @Override
    public String delete(String id) {
        boolean deleMS = msRepo.delete(id);
        if (deleMS) {
            return "Delete success";
        } else {
            return "Delete error";
        }
    }

}
