/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Application;
import View.View_LoginMurid;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class ControllerLoginMurid implements ActionListener{
    private Application model;
    private View_LoginMurid view;
    
    public ControllerLoginMurid(Application model){
        this.model = model;
        view = new View_LoginMurid();
        view.setVisible(true);
        view.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Object source = e.getSource();
        if(source.equals(view.getBtnOk())){
            String username = view.getUsername();
            String password = view.getPassword();
            if(model.searchMurid(username) != null){
                if(model.searchMurid(username).getPassword().equals(password)){
                    model.setLoginIdMurid(username);
                    JOptionPane.showMessageDialog(view, "Login murid berhasil!");
                    new ControllerMenuMurid(model);
                    view.dispose();
                } else{
                    //username dengan password tidak cocok
                    JOptionPane.showMessageDialog(view, "Username dan password tidak cocok!");
                }
            } else{
                //murid blm terdaftar
                JOptionPane.showMessageDialog(view, "Murid dengan username tersebut tidak ada!");
            }
        } else{
            new ControllerMainMenu(model);
            view.dispose();
        }
    }
    
}
