/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service.Interface;

import Model.PhieuBaoHanh;
import Model.PhieuBaoHanhCT;
import ViewModel.BaoHanhCTViewModel;
import java.util.List;

/**
 *
 * @author Administrator
 */
public interface BaoHanhCTInterface {

    List<BaoHanhCTViewModel> getAll();

    String add(PhieuBaoHanhCT bh);

    String delete(String idBH);
}
