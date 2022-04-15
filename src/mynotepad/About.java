
package mynotepad;

import java.awt.Font;
import java.awt.Image;
import javax.swing.*;
import java.awt.event.*;

public class About extends JFrame implements ActionListener{
    
    JButton b1;
    About(){
        setBounds(400, 100, 700, 600);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("mynotepad/icons/windows.png"));
        Image i2 = i1.getImage().getScaledInstance(400, 80, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(150, 40, 400, 80);
        add(l1);
        
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("mynotepad/icons/notepad.png"));
        Image i5 = i4.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel l2 = new JLabel(i6);
        l2.setBounds(50, 180, 70, 70);
        add(l2);
        
        JLabel l3 = new JLabel("<html>Developed By Anmol<br>Version NotePad 2.0<br>&#169; A Corp, All Rights Reserved<br><br>Notepad is a word processing program<br>which allows changing of text in computer file,<br>Notepad is simple text editor for basic text editing program<br>which enables computer user to create documents.</html>");
        l3.setBounds(150, 130, 500, 300);
        l3.setFont(new Font("SAN_SERIF", Font.PLAIN,18));
        add(l3);
        
        b1 = new JButton("OK");
        b1.setBounds(580,500,80,25);
        b1.addActionListener(this);
        add(b1);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        this.setVisible(false);
    }
    
    public static void main(String[] args){
        new About().setVisible(true);
    }
    
}
