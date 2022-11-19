/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Model.HoaDonDoiTra;
import Repository.HoaDonDTRepo;
import Service.Interface.IHoaDonDoiTra;
import ViewModel.HoaDonDoiTraViewModel;
import java.util.List;

/**
 *
 * @author Admin
 */
public class HoaDonDoiTraSerVice implements IHoaDonDoiTra {

    private HoaDonDTRepo repo;

    public HoaDonDoiTraSerVice() {
        repo = new HoaDonDTRepo();
    }

    @Override
    public List<HoaDonDoiTraViewModel> getAll() {
        return this.repo.all();
    }

    @Override
    public Integer deleteHD(String ma) {
        return this.repo.deleteHDDTR(ma);
    }

    @Override
    public Integer insertHD(HoaDonDoiTra hd) {
        return this.repo.insertHDDTR(hd);
    }

    @Override
    public Integer updateHD(HoaDonDoiTra hd, String id) {
        return this.repo.updateHDDTR(hd, id);
    }

}
