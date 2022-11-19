/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service.Interface;

import Model.HoaDonChiTiet;
import ViewModel.HoaDonCTViewModel;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface IHoaDonCT {

    List<HoaDonCTViewModel> getList();

    Integer insertHDCT(HoaDonChiTiet hdct);

    Integer updtaeHDCT(HoaDonChiTiet hdct, String id);

    Integer deleleHDCT(String id);
}