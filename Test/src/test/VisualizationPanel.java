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
import java.awt.*;

public class VisualizationPanel extends JPanel {
    private JTextArea boardArea;
    private JTextArea dictionaryArea;

    public VisualizationPanel() {
        setLayout(new GridLayout(2, 1));
        boardArea = new JTextArea(4, 4);
        boardArea.setEditable(false);
        dictionaryArea = new JTextArea(10, 20);
        dictionaryArea.setEditable(false);

        add(new JScrollPane(boardArea));
        add(new JScrollPane(dictionaryArea));
    }

    public void updateBoard(String board) {
        boardArea.setText(board);
    }

    public void updateDictionary(String dictionary) {
        dictionaryArea.setText(dictionary);
    }
}
