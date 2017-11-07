/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class Pelajaran {
    private String namaPelajaran;
    private ArrayList<Materi> listMateri;
    
    public Pelajaran(String namaPelajaran){
        setNamaPelajaran(namaPelajaran);
        listMateri = new ArrayList<>();
    }
    
    public void setNamaPelajaran(String namaPelajaran){
        this.namaPelajaran = namaPelajaran;
    }
    public String getNamaPelajaran(){
        return namaPelajaran;
    }
    
    public Materi getMateri(int bab_materi){
        for(Materi m : listMateri){
            if(m.getBab_materi() == bab_materi){
                return m;
            }
        }
        return null;
    }
    public void createMateri(int bab_materi, String judul_materi, String isi_materi){
        if(getMateri(bab_materi) != null){
            System.out.println("Error");
        } else{
            Materi m  = new Materi(bab_materi, judul_materi, isi_materi);
            listMateri.add(m);
        }
    }
    public void setMateri(int bab_materi){
        if(getMateri(bab_materi) != null){
            Materi m = getMateri(bab_materi);
            listMateri.remove(m);
        } else{
            System.out.println("Error");
        }
    }
}
