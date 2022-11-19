/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service.Interface;

import Model.HoaDonDoiTra;
import ViewModel.HoaDonDoiTraViewModel;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface IHoaDonDoiTra {

    List<HoaDonDoiTraViewModel> getAll();

    Integer insertHD(HoaDonDoiTra hd);

    Integer updateHD(HoaDonDoiTra hd, String id);

    Integer deleteHD(String ma);
}
