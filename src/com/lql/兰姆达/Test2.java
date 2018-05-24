package com.lql.兰姆达;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test2 {
    public static void main(String[] args) {
        JButton show = new JButton("show");
        show.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("1.7");
            }
        });

        show.addActionListener((e)->{
            System.out.println(1.8);
        });
    }
}
