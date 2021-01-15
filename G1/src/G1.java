//import java.awt.FlowLayout;
//import java.awt.*;
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JPanel;
//import javax.swing.JTextField;
//import java.awt.event.*;
//public class G1 implements ActionListener{
//	JTextField tf1,tf2,tf3;
//	JButton button1,button2;
//	JLabel jl,j2,j3;
//	G1()
//	{
//        JFrame frame = new JFrame();
//         JPanel jp= new JPanel(null);
//         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         frame.setSize(300,400);
//         jl=new JLabel("Number");
//         j2=new JLabel("Number");
//         j3=new JLabel("Result");
//         jl.setBounds(10,20,200,50);
//         j2.setBounds(10,75,200,50);
//         j3.setBounds(10,140,200,50);
//         button1= new JButton("+");
//         button2= new JButton("-");
//         button1.setBounds(50,250,70,50);
//         button2.setBounds(150,250,70,50);
//         button1.addActionListener(this);  
//         button2.addActionListener(this); 
//              tf1= new JTextField("");
//              tf1.setBounds(60,35,200,30);
//              tf2= new JTextField("");
//              tf2.setBounds(60,90,200,30);
//              tf3= new JTextField("");
//              tf3.setBounds(60,150,200,30);
//              jp.add(jl);
//              jp.add(j2);
//              jp.add(j3);
//              jp.add(tf1); 
//              jp.add(tf2);
//              jp.add(tf3);
//        jp.add(button1);
//        jp.add(button2);
//       
//        frame.add(jp);       
//        frame.setVisible(true);
//	}
//	public void actionPerformed(ActionEvent e) {  
//        String s1=tf1.getText();  
//        String s2=tf2.getText();  
//        int a=Integer.parseInt(s1);  
//        int b=Integer.parseInt(s2);  
//        int c=0;  
//        if(e.getSource()==button1){  
//            c=a+b;  
//        }else if(e.getSource()==button2){  
//            c=a-b;  
//        }  
//        String result=String.valueOf(c);  
//        tf3.setText(result);  
//    }  
//	public static void main(String[] args) {
//		new G1();
//		// TODO Auto-generated method stub
//
//	}
//
//}
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.*;
public class G1
{
	JTextField tf;
	JButton button1;
	JLabel jl;
	G1()
	{
         JFrame frame = new JFrame("My First GUI");
         JPanel jp= new JPanel(new FlowLayout());
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setSize(500,500);
         jl=new JLabel("SIMPE GRAPHICAL USER INTERFACE");
        jl.setForeground(Color.red);
        jl.setFont(new Font("Georgia",Font.BOLD,24));
         button1= new JButton("Click");
         button1.setForeground(Color.pink);
              tf= new JTextField("Enter your name here");
              jp.add(jl);
              jp.add(tf);     
        jp.add(button1);
       
        frame.add(jp);       
        frame.setVisible(true);
   }
	 	 public static void main(String args[]){
		 new G1();
		 
}}

