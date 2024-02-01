/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.caidalibre;

import frontend.MenuJFrame;
import java.awt.Color;
import java.util.Collections;
import javax.swing.UIManager;

/**
 *
 * @author danta
 */
public class CaidaLibre {

    public static void main(String[] args) {
        UIManager.put("Button.background", Color.decode("#566199"));
        UIManager.put("TextField.background", Color.decode("#9ba3cc"));
        UIManager.put("Panel.background",Color.decode("#d6ddff"));
        MenuJFrame menu = new MenuJFrame();
        menu.setVisible(true);
    }
}
