package com.jui;

import javax.swing.*;
import java.awt.*;

/**
 * Created by lxflxf on 2016/5/25.
 */
public class Demo3 {
    public static void main(String[] args){
        UI3 ui2 = new UI3();
    }
}

class UI3 extends JFrame{
    public UI3(){
        JButton jbs[] = new JButton[9];
        this.setLayout(new GridLayout(3,3, 10, 10));
        for (int i = 0; i<9; i++){
            jbs[i] = new JButton(String.valueOf(i));
            this.add(jbs[i]);
        }
        this.setTitle("网格布局");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(200,200);
        this.setSize(400,400);
        this.setVisible(true);
    }
}
