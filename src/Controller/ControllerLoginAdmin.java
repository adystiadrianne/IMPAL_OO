/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Application;
import View.View_LoginAdmin;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class ControllerLoginAdmin implements ActionListener{
    private Application model;
    private View_LoginAdmin view;
    
    public ControllerLoginAdmin(Application model){
        this.model = model;
        view = new View_LoginAdmin();
        view.setVisible(true);
        view.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Object source = e.getSource();
        if(source.equals(view.getBtnOk())){
            String username = view.getAdmin();
            String password = view.getPassword();
            //cek ada ga admin dengan username tersebut
            if(model.searchAdmin(username) != null){
                //cek usernamenya sama ga sama password
                if(model.searchAdmin(username).getPassword().equals(password)){
                    //masuk
                    model.setLoginIdAdmin(username);
                    JOptionPane.showMessageDialog(view, "login berhasil");
                    new ControllerMenuAdmin(model);
                    view.dispose();
                } else{
                    //username dan password tidak cocok
                    JOptionPane.showMessageDialog(view, "Username dan password tidak cocok!");
                }
            } else{
                //admin tidak ada
                JOptionPane.showMessageDialog(view, "Admin dengan username tersebut tidak ada!");
            }
        } else{
            new ControllerMainMenu(model);
            view.dispose();
        }
    }
    
}
