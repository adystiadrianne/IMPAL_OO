/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Application;
import View.View_InputMateri;
import View.View_MenuAdmin;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class ControllerInputMateri implements ActionListener{
    private Application model;
    private View_InputMateri View;
    
    public ControllerInputMateri(Application model){
        this.model = model;
        View = new View_InputMateri();
        View.setVisible(true);
        View.addActionListener(this);
        View.setNamaPelajaran(model.getPelajaran().getNamaPelajaran());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Object source = e.getSource();
        if(source.equals(View.getBtnOk())){
            int bab_materi = View.getBabMateri();
            String judul_materi = View.getJudulMateri();
            String isi_materi = View.getIsiMateri();
            if(model.getPelajaran().getMateri(bab_materi) == null){
                model.getPelajaran().createMateri(bab_materi, judul_materi, isi_materi);
                JOptionPane.showMessageDialog(View, "Input materi berhasil!");
            } else{
                JOptionPane.showMessageDialog(View, "Error: bab sudah ada !");
            }
        } else{
            ControllerMenuAdmin controllerMenuAdmin = new ControllerMenuAdmin(model);
            View.dispose();
        }
    }
    
}
