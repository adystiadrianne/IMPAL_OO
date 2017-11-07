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
public class Application {
    ArrayList<Murid> daftarMurid;
    ArrayList<Admin> daftarAdmin;
    private Pelajaran pelajaran;
    private String LoginidAdmin;
    private String LoginidMurid;
    private int babMateri;

    public int getBabMateri(){
        return babMateri;
    }
    public void setBabMateri(int babMateri){
        this.babMateri = babMateri;
    }
        
    public Application(){
        daftarMurid = new ArrayList<>();
        daftarAdmin = new ArrayList<>();
    }
    
    public ArrayList<Murid> getDaftarMurid(){
        return daftarMurid;
    }
    
    public String getLoginIdAdmin() {
        return LoginidAdmin;
    }
    public void setLoginIdAdmin(String id){
        LoginidAdmin = id;
    }
     
    public void setLoginIdMurid(String id){
        LoginidMurid = id;
    }
    public String getLoginIdMurid(){
        return LoginidMurid;
    }
    
    public Admin searchAdmin(String idAdmin){
        for(Admin b : daftarAdmin){
            if(b.getIdAdmin().equals(idAdmin)){
                return b;
            }
        }
        return null;
    }
    
    public void createAdmin(String idAdmin, String password){
        if(searchAdmin(idAdmin) != null){
            throw new IllegalArgumentException("ID telah dipakai!");
        }
        Admin b;
        b = new Admin(idAdmin, password);
        daftarAdmin.add(b);
        //db.savePetugas(p);
    }
    
    public Murid searchMurid(String username){
        for(Murid m : daftarMurid){
            if(m.getUsername().equals(username)){
                return m;
            }
        }
        return null;
    }
    
    public void createMurid(String username,String nama, String password){
        if(searchMurid(username) != null){
            throw new IllegalArgumentException("ID telah dipakai!");
        }
        Murid m;
        m = new Murid(username, nama, password);
        daftarMurid.add(m);
        //db.savePetugas(p);
    }
    
    public void setPelajaran(Pelajaran pelajaran){
        this.pelajaran = pelajaran;
    }
    public Pelajaran getPelajaran(){
        return pelajaran;
    }
    
    public void addMateri(int bab_materi, String judul_materi, String isi_materi ){
        if(pelajaran != null){
            pelajaran.createMateri(bab_materi, judul_materi, isi_materi);
        } else{
            System.out.println("error pelajaran null");
        }
    }
    
}
