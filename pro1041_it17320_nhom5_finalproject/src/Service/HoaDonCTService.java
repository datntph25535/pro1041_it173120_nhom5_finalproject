/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Model.HoaDonChiTiet;
import Repository.HoaDonCTRepo;
import Service.Interface.IHoaDonCT;
import ViewModel.HoaDonCTViewModel;
import java.util.List;

/**
 *
 * @author Admin
 */
public class HoaDonCTService implements IHoaDonCT {

    private HoaDonCTRepo repo;

    public HoaDonCTService() {
        repo = new HoaDonCTRepo();
    }

    @Override
    public List<HoaDonCTViewModel> getList() {
        return this.repo.all();
    }

    @Override
    public Integer insertHDCT(HoaDonChiTiet hdct) {
        return this.repo.inserHDCTR(hdct);
    }

    @Override
    public Integer updtaeHDCT(HoaDonChiTiet hdct, String id) {
        return this.repo.updateHDCTR(hdct, id);
    }

    @Override
    public Integer deleleHDCT(String id) {
        return this.repo.deleteHDR(id);
    }

}
