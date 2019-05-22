package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class Pain extends JPanel {

    private JButton numders[] = new JButton[10];
    private Font font = new Font("SanSerif", Font.BOLD, 20);
    private JTextField output = new JTextField();
    private JButton backspace = new JButton("C"), equ = new JButton("=");
    private JButton plus = new JButton("+"), multi = new JButton("*"), div = new JButton("/"), minus = new JButton("-");

    public Pain(){
        setLayout(null);
        setFocusable(true);
        grabFocus();

        backspace.setBounds(10, 250, 50, 50);
        backspace.setFont(font);
        add(backspace);

        plus.setBounds(190, 70, 50, 50);
        plus.setFont(font);
        add(plus);

        minus.setBounds(190, 130, 50, 50);
        minus.setFont(font);
        add(minus);

        div.setBounds(190, 190, 50, 50);
        div.setFont(font);
        add(div);

        multi.setBounds(190, 250, 50, 50);
        multi.setFont(font);
        add(multi);

        equ.setBounds(130, 250, 50, 50);
        equ.setFont(font);
        add(equ);

        numders[0] = new JButton( "0");
        numders[0].setBounds(70, 250, 50, 50);
        numders[0].setFont(font);
        add(numders[0]);

        for (int y = 0; y < 3; y++){
            for (int x = 0; x < 3; x++){
                numders[y * 3 + x + 1] = new JButton((y * 3 + x + 1) + "");
                numders[y * 3 + x + 1].setBounds(x *( 50 + 10) + 10, y *(50 + 10) + 70, 50, 50);
                numders[y * 3 + x + 1].setFont(font);
                add(numders[y* 3 + x + 1]);

            }
        }

        output.setBounds(10, 10, 230, 50);
        output.setFont(font);
        output.setEditable(false);
        add(output);

        ActionListener l = (ActionEvent e) ->{
            JButton b = (JButton)e.getSource();
            output.setText(output.getText() + b.getText());
        };

        for (JButton b : numders){
            b.addActionListener(l);
        }

        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                char symbol = e.getKeyChar();

                if (!Character.isDigit(symbol))
                    return;

                output.setText(output.getText() + symbol);
            }
        });


    }
}
