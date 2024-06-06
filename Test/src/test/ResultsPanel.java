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

public class ResultsPanel extends JPanel {
    private JTextArea resultsArea;

    public ResultsPanel() {
        resultsArea = new JTextArea(10, 20);
        resultsArea.setEditable(false);
        add(new JScrollPane(resultsArea));
    }

    public void updateResults(String results) {
        resultsArea.setText(results);
    }
}
