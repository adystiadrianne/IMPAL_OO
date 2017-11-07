package Controller;


import Model.Application;
import View.View_InputSoal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class ControllerInputSoal implements ActionListener{
    private Application model;
    private View_InputSoal view;
    
    public ControllerInputSoal(Application model){
        this.model = model;
        view = new View_InputSoal();
        view.setVisible(true);
        view.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Object source = e.getSource();
        if(source.equals(view.getBtnInput())){
            int babMateri = view.getBab();
            int noSoal = view.getNoSoal();
            String soal = view.getSoal();
            String jawaban = view.getJawaban();
            //cek materi yg diinput ada ga
            if(model.getPelajaran().getMateri(babMateri) != null){
                //cek no soal yang diinput ada ga
                if(model.getPelajaran().getMateri(babMateri).searchSoalDanJawaban(noSoal) == null){
                    if(jawaban.equals("a") || jawaban.equals("b") || jawaban.equals("c") || jawaban.equals("d")){
                        //jawaban sudah legit
                        model.getPelajaran().getMateri(babMateri).createSoalDanJawaban(noSoal, soal, jawaban);
                        JOptionPane.showMessageDialog(view, "Input soal dan jawaban berhasil!");
                    } else{
                        //jawaban tidak legit
                        JOptionPane.showMessageDialog(view, "Jawaban tidak memenuhi syarat!");
                    }
                } else{
                    //no soal tersebut sudah ada 
                    JOptionPane.showMessageDialog(view, "Nomor soal tersebut sudah ada!");
                }
            } else{
                //materi tersebut tidak ada
                JOptionPane.showMessageDialog(view, "Materi tersebut tidak ada!");
            }
        } else if(source.equals(view.getBtnReset())){
            view.reset();
        } else{
            new ControllerMenuAdmin(model);
            view.dispose();
        }
    }
    
}
