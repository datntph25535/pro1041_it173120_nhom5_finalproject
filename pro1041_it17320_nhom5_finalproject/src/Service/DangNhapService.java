/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Model.Account;
import Repository.DangNhapRepo;
import Service.Interface.DangNhapInterface;

/**
 *
 * @author PC
 */
public class DangNhapService implements DangNhapInterface {

    DangNhapRepo dnr = new DangNhapRepo();

    @Override
    public Account getAccount(String u, String p) {
        return dnr.getAccount(u, p);
    }

}
