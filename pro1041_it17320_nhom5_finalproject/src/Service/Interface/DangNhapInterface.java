/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service.Interface;

import Model.Account;

import Repository.DangNhapRepo;

/**
 *
 * @author PC
 */
public interface DangNhapInterface {

    Account getAccount(String u, String p);



}
