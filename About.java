/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarysystem;

/**
 *
 * @author GUARDIAN
 */

import javax.swing.*;
import java.awt.*;

public class About extends JPanel{
    
    public About(){
    JOptionPane.showMessageDialog(null,"This Is The Berekuso Library System Ver.1.0.1\n created by Molife Chaplain and Sharon Adelade Asomani-Wiafe."
            + "The system has Administrators (Librarians) and Students \nwho have access to information determined by their credentials.\n"
            + "The System is designed to accept and report queries as \ngiven by the user and allow the user to interact with the system\n"
            + "and the back end.\n"
            + "System will continue being updated, due to the creators'\n need to assure quality."
            + "1..2..Testing");
    
    }
}

