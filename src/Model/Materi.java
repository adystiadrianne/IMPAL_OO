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
public class Materi {
    private int bab_materi;
    private String judul_materi;
    private String isi_materi;
    private ArrayList<soalDanJawaban> listSoal;
    private int jumlahSoal;

    public Materi(int bab_materi, String judul_materi, String isi_materi) {
        this.bab_materi = bab_materi;
        this.judul_materi = judul_materi;
        this.isi_materi = isi_materi;
        listSoal = new ArrayList<>();
        jumlahSoal = 0;
    }

    public int getBab_materi() {
        return bab_materi;
    }

    public void setBab_materi(int bab_materi) {
        this.bab_materi = bab_materi;
    }

    public String getJudul_materi() {
        return judul_materi;
    }

    public void setJudul_materi(String judul_materi) {
        this.judul_materi = judul_materi;
    }

    public String getIsi_materi() {
        return isi_materi;
    }

    public void setIsi_materi(String isi_materi) {
        this.isi_materi = isi_materi;
    }
    
    public soalDanJawaban searchSoalDanJawaban(int noSoal){
        for(soalDanJawaban s : listSoal){
            if(s.getNoSoal() == noSoal){
                return s;
            }
        }
        return null;
    }
    public void createSoalDanJawaban(int noSoal, String soal, String jawaban){
        if(searchSoalDanJawaban(noSoal) == null){
            soalDanJawaban s = new soalDanJawaban(bab_materi, noSoal, soal, jawaban);
            listSoal.add(s);
            jumlahSoal++;
        } else{
            throw new IllegalArgumentException("soal tersebut sudah ada!");
        }
    }

    public int getJumlahSoal() {
        return jumlahSoal;
    }

    public ArrayList<soalDanJawaban> getListSoal() {
        return listSoal;
    }
    
}
