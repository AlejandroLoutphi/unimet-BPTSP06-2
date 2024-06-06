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

public class TestFrame {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            // Create a new JFrame
            JFrame frame = new JFrame("Basic JFrame Test");

            // Set the size of the frame
            frame.setSize(400, 300);

            // Set default close operation
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // Make the frame visible
            frame.setVisible(true);
        });
    }
}