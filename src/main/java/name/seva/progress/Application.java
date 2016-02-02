package name.seva.progress;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * @author Sergiy Zaychenko
 */
public class Application extends JFrame {


    private final JPanel topPanel = new JPanel();

    private final JButton exitButton = new JButton("Exit");

    private final JButton addButton = new JButton("+");

    private void composeLayout() {


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setSize(600, 400);

        setLayout(new BorderLayout());

        exitButton.setSize(100, 100);

        exitButton.addActionListener(e -> {

            System.exit(0);

        });

        topPanel.add(exitButton);

        addButton.setSize(100, 100);

        addButton.addActionListener(e -> {


        });

        topPanel.add(addButton);

        getContentPane().add(topPanel, BorderLayout.NORTH);

    }

    public Application() {

        super();

        composeLayout();

    }

    public static void main(String[] args) {

        Application frame = new Application();

        frame.setVisible(true);

    }

}



