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
public class Murid{
    private String username;
    private String nama;
    private String password;
    private ArrayList<soalDanJawaban> listSoal;

    public Murid(String username, String nama, String password) {
        this.username = username;
        this.nama = nama;
        this.password = password;
        listSoal = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public soalDanJawaban searchSoalDanJawaban(int babMateri, int noSoal){
        for(soalDanJawaban s : listSoal){
            if(s.getBabMateri() == babMateri && s.getNoSoal() == noSoal){
                return s;
            }
        }
        return null;
    }
    public void createSoalDanJawaban(soalDanJawaban soal){
        if(searchSoalDanJawaban(soal.getBabMateri(), soal.getNoSoal()) == null){
            soalDanJawaban s = soal;
            listSoal.add(s);
        } else{
            throw new IllegalArgumentException("soal tersebut sudah ada!");
        }
    }

    public ArrayList<soalDanJawaban> getListSoal() {
        return listSoal;
    }
}
