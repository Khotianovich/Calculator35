package com.company;
import javax.swing.*;;

public class Main {

    private JFrame window;

    public Main(){
        window = new JFrame("Calculator");
        window.setSize(255, 345);
        window.add(new Pain());
        window.setLocationRelativeTo(null);
        window.setResizable(false);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Main();
            }
        });
    }
}
