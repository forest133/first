package myGUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyGui01 {
	
	JFrame f = new JFrame();
	
	JPanel p1 = new JPanel(new BorderLayout());
	JPanel p2 = new JPanel();
	
	JButton b1 = new JButton("RED");
	JButton b2 = new JButton("GREEN");
	JButton b3 = new JButton("BLUE");
	JButton b4 = new JButton("GRAY");
	
	public void init() {
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p1.setSize(300,150);
		p2.add(b1);
		p2.add(b2);
		p2.add(b3);
		p2.add(b4);
		
		p1.add(p2,BorderLayout.SOUTH);
		
		f.setContentPane(p1);
		f.pack();
		f.setVisible(true);
		
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				p1.setBackground(Color.red);
			}
			
		});
		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				p1.setBackground(Color.green);
			}
			
		});	
		b3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				p1.setBackground(Color.blue);
			}
			
		});
		b4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				p1.setBackground(Color.gray);
			}
			
		});
	}
	public static void main(String[]args) {
		new MyGui01().init();
	}
	

}
