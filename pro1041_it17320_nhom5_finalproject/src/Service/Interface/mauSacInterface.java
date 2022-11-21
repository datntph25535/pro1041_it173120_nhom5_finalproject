/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service.Interface;

import Model.MauSac;
import ViewModel.mauSacViewModel;
import java.util.List;

/**
 *
 * @author Administrator
 */
public interface mauSacInterface {
    List<mauSacViewModel> getAll();
    
    String add(MauSac ms);
    
    String update( MauSac ms,String id );
    
    String delete(String id);
}
