/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Application;
import Model.soalDanJawaban;
import View.View_MenuMurid;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class ControllerMenuMurid implements ActionListener{
    private Application model;
    private View_MenuMurid view;
    
    public ControllerMenuMurid(Application model){
        this.model = model;
        view = new View_MenuMurid();
        view.setVisible(true);
        view.addActionListener(this);
        view.setGreeting(model.searchMurid(model.getLoginIdMurid()).getNama());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Object source = e.getSource();
        if(source.equals(view.getBtnMateri())){
            new ControllerLiatMateri(model);
            view.dispose();
        } else if(source.equals(view.getBtnNilai())){
            int babMateri = Integer.parseInt(JOptionPane.showInputDialog("Input Bab Materi"));
            if(model.getPelajaran().getMateri(babMateri) != null){
                model.setBabMateri(babMateri);
                int jawabanBenar = 0;
                int jumlahSoal = 0;
                for(soalDanJawaban s : model.searchMurid(model.getLoginIdMurid()).getListSoal()){
                    if(s.getBabMateri() == babMateri && s.getStatusJawab() == 1 && s.getJawabanBenar() == 1){
                        jawabanBenar++;
                    }
                }
                //nyari jumlahsoal pada bab tertentu
                for(soalDanJawaban s : model.searchMurid(model.getLoginIdMurid()).getListSoal()){
                    if(s.getBabMateri() == babMateri){
                        jumlahSoal++;
                    }
                }
                double angka1 = (double) jawabanBenar;
                double angka2 = (double) jumlahSoal;
                double angka3 = 100;
                double nilai = (angka1/angka2)*angka3;
                JOptionPane.showMessageDialog(view, "Nilai Bab " +model.getBabMateri() +"\n"
                        +"Anda menjawab benar " +jawabanBenar +" dari " +jumlahSoal +" soal." +"\n"
                        +"Nilai anda adalah " +nilai);
            } else{
                JOptionPane.showMessageDialog(view, "Materi tersebut tidak ada!");
            }
        } else if(source.equals(view.getBtnSoal())){
            int babMateri = Integer.parseInt(JOptionPane.showInputDialog("Input Bab Materi"));
            if(model.getPelajaran().getMateri(babMateri) != null){
                model.setBabMateri(babMateri);
                new ControllerJawabSoal(model);
                view.dispose();
            } else{
                JOptionPane.showMessageDialog(view, "Materi tersebut tidak ada!");
            }
        } else{
            model.setLoginIdMurid(null);
            new ControllerMainMenu(model);
            view.dispose();
        }
    }
    
}
