/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Application;
import View.View_LiatMateri;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class ControllerLiatMateri implements ActionListener{
    private Application model;
    private View_LiatMateri view;
    
    public ControllerLiatMateri(Application model){
        this.model = model;
        view = new View_LiatMateri();
        view.setVisible(true);
        view.addActionListener(this);
        view.setNamaPelajaran("Pelajaran: KIMIA");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Object source = e.getSource();
        if(source.equals(view.getBtnOk())){
            int bab = view.getBabMateri();
            if(model.getPelajaran().getMateri(bab) != null){
                view.setJudulMateri(model.getPelajaran().getMateri(bab).getJudul_materi());
                view.setIsiMateri(model.getPelajaran().getMateri(bab).getIsi_materi());
            } else{
                JOptionPane.showMessageDialog(view, "bab tersebut tidak ada!");
            }
        } else{
            new ControllerMenuMurid(model);
            view.dispose();
        }
    }
    
}
