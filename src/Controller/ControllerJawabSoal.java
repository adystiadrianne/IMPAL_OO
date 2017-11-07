/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Application;
import Model.Murid;
import Model.soalDanJawaban;
import View.View_JawabSoal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class ControllerJawabSoal implements ActionListener{
    private Application model;
    private View_JawabSoal view;
    
    public void refresh(){
        String string = "";
        view.reset();
        for(soalDanJawaban s : model.getPelajaran().getMateri(model.getBabMateri()).getListSoal()){
            if(model.searchMurid(model.getLoginIdMurid()).searchSoalDanJawaban(s.getBabMateri(), s.getNoSoal()) == null){
                model.searchMurid(model.getLoginIdMurid()).createSoalDanJawaban(s);
            }
        }
        for(soalDanJawaban s : model.searchMurid(model.getLoginIdMurid()).getListSoal()){
            //if soalnya ada dan belum terjawab
            if(s.getBabMateri() == model.getBabMateri() && s.getStatusJawab() == 0){
                string += s.getNoSoal() +", ";
            }
        }
        if(string.equals("")){
            view.setNoSoal("Semua soal sudah terjawab");
        } else{
            view.setNoSoal(string);
        }
    }
    public ControllerJawabSoal(Application model){
        this.model = model;
        view = new View_JawabSoal();
        view.setVisible(true);
        view.addActionListener(this);
        refresh();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Object source = e.getSource();
        if(source.equals(view.getBtnSearch())){
            int noSoal = view.getNoSoal();
            //cek soal tersebut ada atau ga
            if(model.searchMurid(model.getLoginIdMurid()).searchSoalDanJawaban(model.getBabMateri(), noSoal) != null){
                //cek soal tersebut sudah dijawab atau belum
                if(model.searchMurid(model.getLoginIdMurid()).searchSoalDanJawaban(model.getBabMateri(), noSoal).getStatusJawab() != 1){
                    view.setSoal(model.searchMurid(model.getLoginIdMurid()).searchSoalDanJawaban(model.getBabMateri(), noSoal).getSoal());
                } else{
                    //soal tersebut sudah dijawab
                    view.setSoal("Soal tersebut sudah terjawab");
                }
            } else{
                //tidak ada soal dengan no tersebut
                JOptionPane.showMessageDialog(view, "tidak ada soal dengan nomor tersebut!");
            }
        } else if(source.equals(view.getBtnJawab())){
            int noSoal = view.getNoSoal();
            //cek soal tersebut ada atau ga
            if(model.searchMurid(model.getLoginIdMurid()).searchSoalDanJawaban(model.getBabMateri(), noSoal) != null){
                //cek soal tersebut sudah dijawab atau belum
                if(model.searchMurid(model.getLoginIdMurid()).searchSoalDanJawaban(model.getBabMateri(), noSoal).getStatusJawab() != 1){
                    String jawaban = view.getJawaban();
                    if(jawaban.equals(model.searchMurid(model.getLoginIdMurid()).searchSoalDanJawaban(model.getBabMateri(), noSoal).getJawaban())){
                        model.searchMurid(model.getLoginIdMurid()).searchSoalDanJawaban(model.getBabMateri(), noSoal).setJawabanBenar(1);
                    }
                    model.searchMurid(model.getLoginIdMurid()).searchSoalDanJawaban(model.getBabMateri(), noSoal).setStatusJawab(1);
                    JOptionPane.showMessageDialog(view, "Soal berhasil terjawab!");
                    refresh();
                } else{
                    //soal tersebut sudah dijawab
                    view.setSoal("Soal tersebut sudah terjawab");
                }
            } else{
                //tidak ada soal dengan no tersebut
                JOptionPane.showMessageDialog(view, "tidak ada soal dengan nomor tersebut!");
            }
        } else{
            new ControllerMenuMurid(model);
            view.dispose();
        }
    }
    
}
