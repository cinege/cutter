package Cutter;

import java.awt.event.KeyListener;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JCheckBox;

public class Cutter {
    private static JTextField source;
    private static JTextField target;
    private static JCheckBox mode;
    
	public static void main(String[] args) {
		final JFrame frame = new JFrame("Cutter Ver 0.2");
        frame.setAlwaysOnTop(true);
        frame.setSize(400, 100);
        final Font font1 = new Font("SansSerif", 1, 20);
        
        (Cutter.source = new JTextField()).setHorizontalAlignment(0);
        Cutter.source.setFont(font1);
        frame.getContentPane().add(Cutter.source, "West");
        Cutter.source.setColumns(10);
        
        (Cutter.target = new JTextField()).setHorizontalAlignment(0);
        Cutter.target.setFont(font1);
        frame.getContentPane().add(Cutter.target, "East");
        Cutter.target.setColumns(10);
              
        Cutter.mode = new JCheckBox("ASCII");
        frame.getContentPane().add(Cutter.mode, "South");
        
        frame.setVisible(true);
        Cutter.source.addKeyListener((KeyListener)new MyKeyListener(Cutter.source, Cutter.target, Cutter.mode));
        
	}

}
