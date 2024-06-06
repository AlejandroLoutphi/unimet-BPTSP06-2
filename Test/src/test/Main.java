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

public class Main extends JFrame {
    private FileLoadingPanel fileLoadingPanel;
    private VisualizationPanel visualizationPanel;
    private SearchPanel searchPanel;
    private ResultsPanel resultsPanel;
    private SavePanel savePanel;

    public Main() {
        setTitle("Word Search Solver");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLayout(new BorderLayout());

        // Initialize panels
        fileLoadingPanel = new FileLoadingPanel();
        visualizationPanel = new VisualizationPanel();
        searchPanel = new SearchPanel();
        resultsPanel = new ResultsPanel();
        savePanel = new SavePanel();

        // Add panels to the main frame
        add(fileLoadingPanel, BorderLayout.NORTH);
        add(visualizationPanel, BorderLayout.CENTER);
        add(searchPanel, BorderLayout.SOUTH);
        add(resultsPanel, BorderLayout.EAST);
        add(savePanel, BorderLayout.WEST);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Main().setVisible(true));
    }
}
    

