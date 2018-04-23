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
        
        ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource("download.jpg"));
        
        //Create Lable and ImageIcon setting
        
        JLabel lbl = new JLabel(icon);
        //add Label to the Panel
        this.add(lbl);
        
        JLabel lbl2 = new JLabel("<html><b>Library Management System Ver 2.0<br><br><b><p>Developed By:Molife and Sharon</p><br>"
             );
        
        lbl2.setFont(new Font("Tahoma",Font.PLAIN,12));
        this.add(lbl2);
                
    }
}

