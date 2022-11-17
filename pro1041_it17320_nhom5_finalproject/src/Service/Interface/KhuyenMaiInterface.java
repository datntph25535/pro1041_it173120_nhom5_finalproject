/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service.Interface;

import Model.KhuyenMai;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public interface KhuyenMaiInterface {
    ArrayList<KhuyenMai> getListKM();
    
    void insert(KhuyenMai km);
    
    void update(String id,KhuyenMai km);
    
    void delete(String id);
}
