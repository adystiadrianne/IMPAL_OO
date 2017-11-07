/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.awt.event.ActionListener;
import Model.Application;
import View.View_SignUp;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
/**
 *
 * @author user
 */
public class ControllerSignUp implements ActionListener{
    private Application model;
    private View_SignUp View;
    
    public ControllerSignUp(Application model){
        this.model = model;
        View = new View_SignUp();
        View.setVisible(true);
        View.addActionListener(this);
}
    
    @Override 
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        if(source.equals(View.getBtnOk())){
            String username = View.getUsername();
            String nama = View.getNama();
            String password = View.getPassword();
            model.createMurid(username, nama, password);
            JOptionPane.showMessageDialog(View, "Sign Up Berhasil!");
            
        }else {
            ControllerMainMenu ControllerMainMenu = new ControllerMainMenu(model); 
            View.dispose();
        } 
        }
}
