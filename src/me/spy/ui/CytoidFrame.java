package me.spy.ui;

import me.spy.main.Main;
import me.spy.utils.CalcUtils;

import javax.swing.*;

public class CytoidFrame extends JFrame {

    JPanel pnl = new JPanel();
    JButton calc = new JButton();
    JButton exit = new JButton();
    JLabel lvl = new JLabel();
    JLabel tpl = new JLabel();
    JTextField lvt = new JTextField();
    JTextField tpt = new JTextField();

    public CytoidFrame(){

        //JButton
        calc.setText("计算Rating");
        calc.setBounds(130, 100, 100, 30);
        exit.setText("退出到菜单");
        exit.setBounds(250, 100, 100, 30);
        //JLabel
        lvl.setText("请输入谱面定数：");
        lvl.setBounds(20 ,10, 130, 30);
        tpl.setText("请输入您的TP：");
        tpl.setBounds(20, 50, 130, 30);
        //JTextField
        lvt.setBounds(150, 10, 200, 30);
        tpt.setBounds(150, 50, 200, 30);
        //JPanel
        pnl.setLayout(null);
        pnl.add(calc);
        pnl.add(exit);
        pnl.add(lvl);
        pnl.add(tpl);
        pnl.add(lvt);
        pnl.add(tpt);

        //

        //
        setTitle("Cytoid Rating Calculator");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(390, 190);
        setLocationRelativeTo(null);
        setResizable(false);
        add(pnl);
        addListeners();

    }

    void addListeners(){
        calc.addActionListener(event->{

            try{
                float tp = Float.parseFloat(tpt.getText().trim());
                float lv = Float.parseFloat(lvt.getText().trim());
                float rt = CalcUtils.ctdCalc(tp, lv);

                if(rt != -1f){
                    JOptionPane.showMessageDialog(null,"Rating:" + rt, "计算成功", JOptionPane.INFORMATION_MESSAGE);
                }else{
                    JOptionPane.showMessageDialog(null, "Rating计算失败，请检查您输入的数值。", "计算错误", JOptionPane.ERROR_MESSAGE);
                }
            }catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, "您输入了错误的格式或空的计算信息\n" + e.getMessage(), "输入错误", JOptionPane.ERROR_MESSAGE);
                
            }


        });

        exit.addActionListener(event->{

            setVisible(false);
            Main.getFrameManager().getMainFrame().setVisible(true);

        });
    }

}
