/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.areasfigurasgrafico;


import backend.Figura;
import backend.Triangulo;
import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.intellijthemes.FlatCyanLightIJTheme;
import com.formdev.flatlaf.intellijthemes.FlatDarkFlatIJTheme;
import frontend.MenuJFrame;
import java.awt.Color;
import java.util.Arrays;
import java.util.Collections;
import javax.swing.UIManager;


/**
 *
 * @author david
 * 
 * clave   KP9HDghFn1HfOXD7
 * 
 * WjykdQ47BQOqZoDm
 */
public class AreasFigurasGrafico {

    public static void main(String[] args) {
        
        
        FlatLaf.setGlobalExtraDefaults( Collections.singletonMap( "@accentColor", "#31524F" ) );
        
        FlatLaf.setGlobalExtraDefaults( Collections.singletonMap( "@foreground", "#000000" ) );
        FlatLightLaf.setup();
        UIManager.put("Button.background", Color.decode("#28C9BF"));
        UIManager.put("TextField.background", Color.decode("#2DE3E3"));
        UIManager.put("Panel.background",Color.decode("#00B8AB"));
        MenuJFrame menu = new MenuJFrame();
        menu.setVisible(true);
        
        
        
                
        
        
        
    }
}
