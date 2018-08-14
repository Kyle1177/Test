/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itcs3166_project;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author Kyle
 */
public class ITCS3166_Project {

    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {    
    SwingUtilities.invokeLater(new Runnable() {
        public void run() {
            UI gui = new UI();
            JFrame frame = new JFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.getContentPane().add(gui);
            frame.pack();
            frame.setVisible(true);
        }
    });
}
    
}
