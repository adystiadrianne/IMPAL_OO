/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Driver;

import Model.Application;
import Controller.ControllerMainMenu;
import Model.Pelajaran;
/**
 *
 * @author user
 */
public class Main {
    public static void main(String[] args) {
       //Aplikasi app = new Aplikasi();
       //app.mainMenu();
      Application app = new Application();
      
      app.createAdmin("tubes", "impal");
      Pelajaran p = new Pelajaran("Kimia");
      app.setPelajaran(p);
      app.createMurid("vindo", "vindo", "bangun");
      
        System.out.println(app.searchAdmin("tubes").getIdAdmin());
        System.out.println(app.searchMurid("vindo").getUsername());
        
        double angka1 = 1;
        double angka2 = 3;
        double angka3 = 100;
        
        double nilai = (angka1/angka2)*angka3;
        System.out.println(nilai);
      new ControllerMainMenu(app);
    }
}
