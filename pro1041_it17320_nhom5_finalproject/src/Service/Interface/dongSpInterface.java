/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service.Interface;

import Model.dongSP;
import ViewModel.dongSpViewModel;
import java.util.List;

/**
 *
 * @author Administrator
 */
public interface dongSpInterface {
    List<dongSpViewModel> getAll();
    
    String add(dongSP dsp);
    
    String update (dongSP dsp,String id);
    
    String delete(String id);
}
