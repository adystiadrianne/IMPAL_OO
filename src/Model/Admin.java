/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.*;
/**
 *
 * @author user
 */

public class Admin{
    
    private String idAdmin;
    private String password;
    private ArrayList<Materi> daftarMateri; 
    

    public Admin(String idAdmin, String password) {
        this.idAdmin = idAdmin;
        this.password = password;
        daftarMateri = new ArrayList();
    }

    public String getIdAdmin() {
        return idAdmin;
    }

   

    public void setIdAdmin(String idAdmin) {
        this.idAdmin = idAdmin;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
