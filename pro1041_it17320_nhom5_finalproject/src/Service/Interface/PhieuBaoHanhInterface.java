/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service.Interface;

import Model.PhieuBaoHanh;
import ViewModel.PhieuBaoHanhViewModel;
import java.util.List;

/**
 *
 * @author Administrator
 */
public interface PhieuBaoHanhInterface {
    List<PhieuBaoHanhViewModel> getAll();
    
    String add(PhieuBaoHanh bh);
    
    String update(PhieuBaoHanh bh , String id);
    
    String delete(String id);
}
