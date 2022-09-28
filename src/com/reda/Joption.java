package com.reda;
import javax.swing.JOptionPane;
public class Joption {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter Your name");
        JOptionPane.showMessageDialog(null,"Hello "+name);
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter Your Aga :"));
        JOptionPane.showMessageDialog(null,"Your age is : "+age);
    }
}
