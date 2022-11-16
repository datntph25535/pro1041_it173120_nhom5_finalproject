/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.dongSP;
import Repository.dongSPRepo;
import Service.Interface.dongSpInterface;
import ViewModel.dongSpViewModel;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class dongSPServices implements dongSpInterface{
    private final dongSPRepo dsp1 = new dongSPRepo();

    @Override
    public List<dongSpViewModel> getAll() {
        return dsp1.getAll();
    }

    @Override
    public String add(dongSP dsp) {
       boolean addDSP = dsp1.add(dsp);
       if(addDSP){
           return "Add success";
       }else{
           return "Add error";
       }
    }

    @Override
    public String update(dongSP dsp,String id ) {
      boolean updaDSP = dsp1.update(dsp, id);
       if(updaDSP){
           return "update success";
       }else{
           return "update error";
       }
    }

    @Override
    public String delete(String id) {
      boolean deleDSP = dsp1.delete(id);
       if(deleDSP){
           return "delete success";
       }else{
           return "delete error";
       }
    }
    
}
