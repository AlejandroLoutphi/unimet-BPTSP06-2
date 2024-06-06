package test;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ayahzaheraldeen
 */
import javax.swing.*;
import java.awt.event.ActionEvent;
    public class FileLoadingPanel extends JPanel {
    public FileLoadingPanel() {
        JButton loadButton = new JButton("Load File");
        loadButton.addActionListener((ActionEvent e) -> {
            JFileChooser fileChooser = new JFileChooser();
            int result = fileChooser.showOpenDialog(null);
            if (result == JFileChooser.APPROVE_OPTION) {
                
            }
        });
        add(loadButton);
    }
}
    
