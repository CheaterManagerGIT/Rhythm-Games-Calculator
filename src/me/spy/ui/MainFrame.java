package me.spy.ui;

import me.spy.main.Main;

import javax.swing.*;

public class MainFrame extends JFrame {

    JPanel pnl = new JPanel();
    JButton ctd = new JButton();
    JButton arc = new JButton();



    public MainFrame(){

        //JButton
        ctd.setText("启动Cytoid功能");
        ctd.setBounds(20, 20, 410, 40);
        arc.setText("启动Arcaea功能");
        arc.setBounds(20, 70, 410, 40);
        //JPanel
        pnl.setLayout(null);
        pnl.add(ctd);
        pnl.add(arc);

        //Frame
        setTitle("Rhythm Games' Calculator");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(470, 200);
        setLocationRelativeTo(null);
        setResizable(false);
        add(pnl);
        addListeners();
        setVisible(true);

    }

    void addListeners(){

        ctd.addActionListener(event->{

            Main.getFrameManager().getCytoidFrame().setVisible(true);
            setVisible(false);

        });

        arc.addActionListener(event->{

            Main.getFrameManager().getArcaeaFrame().setVisible(true);
            setVisible(false);

        });

    }

}
