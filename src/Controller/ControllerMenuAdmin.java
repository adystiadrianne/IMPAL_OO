/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Application;
import View.View_MenuAdmin;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class ControllerMenuAdmin implements ActionListener{
    private Application model;
    private View_MenuAdmin View;
    
    public ControllerMenuAdmin(Application model){
        this.model = model;
        View = new View_MenuAdmin();
        View.setVisible(true);
        View.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Object source = e.getSource();
        if(source.equals(View.getBtnMateri())){
            ControllerInputMateri controllerInputMateri = new ControllerInputMateri(model);
            View.dispose();
        } else if(source.equals(View.getBtnSoal())){
            new ControllerInputSoal(model);
            View.dispose();
        } else{
            model.setLoginIdAdmin(null);
            JOptionPane.showMessageDialog(View, "Logout !");
            ControllerMainMenu controllerMainMenu = new ControllerMainMenu(model);
            View.dispose();
        }
    }
    
}
