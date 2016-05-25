package com.jui;

import javax.swing.*;

/**
 * Created by lxflxf on 2016/5/25.
 */
public class Demo1 extends JFrame{

    JButton jb1 = null;

    public Demo1(){
        jb1 = new JButton("我是一个按钮");
        this.setTitle("hello world");
        this.setSize(200,200);
        this.add(jb1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        Demo1 demo1 = new Demo1();
    }

}
