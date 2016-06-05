package com.jui;

import javax.swing.*;
import java.awt.*;

/**
 * Created by lxflxf on 2016/5/25.
 */
public class Demo2 {
    public static void main(String[] args){
        Ui ui = new Ui();
    }
}

class Ui extends JFrame{
    JButton jb1,jb2,jb3,jb4,jb5;

    public Ui(){
        jb1 = new JButton("左边");
        jb2 = new JButton("右边");
        jb3 = new JButton("中间");
        jb4 = new JButton("上边");
        jb5 = new JButton("下边");
        this.add(jb1, BorderLayout.WEST);
        this.add(jb2, BorderLayout.EAST);
        this.add(jb3, BorderLayout.CENTER);
        this.add(jb4, BorderLayout.NORTH);
        this.add(jb5, BorderLayout.SOUTH);
        setSize(500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
    }
}
