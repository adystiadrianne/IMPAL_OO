/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author user
 */
public class soalDanJawaban {
    private int noSoal;
    private String soal;
    private String jawaban;
    private int statusJawab; //0 = soal belum terjawab oleh user
    private int jawabanBenar; //0 = user memberikan jawaban yang salah, 1 = benar
    private int babMateri;
    
    public soalDanJawaban(int babMateri, int noSoal, String soal, String jawaban){
        setBabMateri(babMateri);
        setNoSoal(noSoal);
        setSoal(soal);
        setJawaban(jawaban);
        statusJawab = 0;
        jawabanBenar = 0;
    }

    public int getNoSoal() {
        return noSoal;
    }

    public void setNoSoal(int noSoal) {
        this.noSoal = noSoal;
    }

    public String getSoal() {
        return soal;
    }

    public void setSoal(String soal) {
        this.soal = soal;
    }

    public String getJawaban() {
        return jawaban;
    }

    public void setJawaban(String jawaban) {
        this.jawaban = jawaban;
    }

    public int getStatusJawab() {
        return statusJawab;
    }

    public void setStatusJawab(int statusJawab) {
        this.statusJawab = statusJawab;
    }

    public int getJawabanBenar() {
        return jawabanBenar;
    }

    public void setJawabanBenar(int jawabanBenar) {
        this.jawabanBenar = jawabanBenar;
    }

    public int getBabMateri() {
        return babMateri;
    }

    public void setBabMateri(int babMateri) {
        this.babMateri = babMateri;
    }
    
    
    
}
