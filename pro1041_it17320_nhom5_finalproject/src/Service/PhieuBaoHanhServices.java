/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.PhieuBaoHanh;
import Repository.BaoHanhRepo;
import Service.Interface.BaoHanhInterface;
import ViewModel.PhieuBaoHanhViewModel;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class PhieuBaoHanhServices implements BaoHanhInterface {

    private final BaoHanhRepo bhRepo = new BaoHanhRepo();

    @Override
    public List<PhieuBaoHanhViewModel> getAll() {
        return bhRepo.getAll();
    }

    @Override
    public String add(PhieuBaoHanh bh) {

        if (bhRepo.checkTrung(bh.getMa()) != null) {
            return "trùng mã";
        }

        boolean add = bhRepo.add(bh);
        if (add) {
            return "thêm thành công";
        } else {
            return "thêm thất bại";
        }
    }

    @Override
    public String update(PhieuBaoHanh bh, String id) {
        boolean update = bhRepo.update(bh, id);
        if (update) {
            return "sua thành công";
        } else {
            return "sua thất bại";
        }
    }

    @Override
    public String delete(String id) {
        boolean delete = bhRepo.delete(id);
        if (delete) {
            return "xoa thành công";
        } else {
            return "xoa thất bại";
        }
    }

}
