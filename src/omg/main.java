/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package omg;

import View.*;
import java.util.ArrayList;

/**
 *
 * @author MTJP Project
 */
public class main {
    
    public static void main(String[] args){
//        JFrameMenu es = new JFrameMenu();
        JFrameRegis desktop = new JFrameRegis();
        desktop.setVisible(true);
        desktop.pack();
        desktop.setLocationRelativeTo(null);
        desktop.setDefaultCloseOperation(JFrameRegis.EXIT_ON_CLOSE);
    }
}