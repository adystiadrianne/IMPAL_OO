/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import java.awt.event.ActionListener;
import Model.Application;
import View.View_LoginAdmin;
import View.View_MainMenu;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
/**
 *
 * @author user
 */
public class ControllerMainMenu implements ActionListener {
    private Application model;
    private View_MainMenu View;
    
    public ControllerMainMenu(Application model){
        this.model = model;
        View = new View_MainMenu();
        View.setVisible(true);
        View.addActionListener(this);
}
    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        if(source.equals(View.getBtnLoginAdmin())){
            new ControllerLoginAdmin(model);
            View.dispose();
        } else if(source.equals(View.getBtnLoginMurid())){
            new ControllerLoginMurid(model);
            View.dispose();
        } else{
            new ControllerSignUp(model);
            View.dispose();
        }
    }
}
