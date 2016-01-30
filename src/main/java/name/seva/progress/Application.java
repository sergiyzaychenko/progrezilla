package name.seva.progress;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * @author Sergiy Zaychenko
 */
public class Application extends JFrame {

    public static void main(String[] args) {


        Application frame = new Application();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setSize(600, 400);

        frame.setLayout(new BorderLayout());

        JTextArea textArea = new JTextArea();

        JPanel topPanel = new JPanel();

        JButton button = new JButton("Exit");

        button.setSize(100, 100);

        button.addActionListener(e -> {

            System.exit(0);

        });

        topPanel.add(button);

        JButton title = new JButton("Title");

        title.setSize(100, 100);

        title.addActionListener(e -> {

            frame.setTitle("Program");

        });

        topPanel.add(title);

        JButton println = new JButton("Println");

        println.setSize(100, 100);

        println.addActionListener(e -> {

            System.out.println("Yes");

        });

        topPanel.add(println);

        frame.getContentPane().add(topPanel, BorderLayout.NORTH);

        JScrollPane scrollPane = new JScrollPane(textArea);

        frame.getContentPane().add(scrollPane, BorderLayout.CENTER);

        frame.setVisible(true);

    }

}
