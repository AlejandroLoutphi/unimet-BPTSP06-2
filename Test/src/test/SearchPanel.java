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
import java.awt.event.ActionListener;
public class SearchPanel extends JPanel {
    private JComboBox<String> searchMethodCombo;
    private JLabel timeLabel;

    public SearchPanel() {
        JButton searchAllButton = new JButton("Search All Words");
        JButton searchSpecificButton = new JButton("Search Specific Word");
        searchMethodCombo = new JComboBox<>(new String[]{"DFS", "BFS"});
        timeLabel = new JLabel("Time: 0 ms");

        searchAllButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Logic to search all words
            }
        });

        searchSpecificButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Logic to search a specific word
            }
        });

        add(searchAllButton);
        add(searchSpecificButton);
        add(searchMethodCombo);
        add(timeLabel);
    }
}