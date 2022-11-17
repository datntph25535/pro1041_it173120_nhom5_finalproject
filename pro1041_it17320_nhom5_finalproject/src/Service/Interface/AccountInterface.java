/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service.Interface;

import Model.Account;
import ViewModel.AccountViewModel;
import java.util.List;

/**
 *
 * @author Administrator
 */
public interface AccountInterface {
    List<AccountViewModel> getAll();
    
    String add(Account ac);
    
    String update(Account ac,String UserName  );
    
    String delete(String UserName);
}
