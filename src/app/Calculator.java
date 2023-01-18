package app;

import java.awt.*;

import javax.swing.*;

public class Calculator extends JFrame {
	//creating jframe components
	JButton numBtn[] = new JButton[10] ;
	JButton btnAdd = new JButton(" + 5");
	JButton btnSubtract = new JButton(" - 5");
	JButton btnDivide = new JButton("÷ 5");
	JButton btnMultiply = new JButton("× 5");
	JButton btnClear = new JButton("C");
	JTextField input = new JTextField(14);
	GridLayout grid = new GridLayout(6,0);
	FlowLayout flow = new FlowLayout();
	JPanel row1 = new JPanel();
	JPanel row2 = new JPanel();
	JPanel row3 = new JPanel();
	JPanel row4 = new JPanel();
	JPanel row5 = new JPanel();
	JPanel row6 = new JPanel();
		int val=0;
	
	//create calculator class
	public Calculator() {
		//call calcFrame method
		this.calcFrame();
		
	}
	//create calcFrame method
	private void calcFrame() {
		
		
		btnAdd.setBackground(Color.cyan);
		btnSubtract.setBackground(Color.cyan);
		btnDivide.setBackground(Color.cyan);
		btnMultiply.setBackground(Color.cyan);
		btnClear.setBackground(new Color(0xFD5C5C));
		row1.setBackground(Color.decode("#A0C1D1"));
		row2.setBackground(Color.decode("#A0C1D1"));
		row3.setBackground(Color.decode("#A0C1D1"));
		row4.setBackground(Color.decode("#A0C1D1"));
		row5.setBackground(Color.decode("#A0C1D1"));
		row6.setBackground(Color.decode("#A0C1D1"));
		for(int i=1;i<=6;i++) {
			
		}
		int numValue = 10;
		for(int i = 0; i<numBtn.length; i++) {
		numBtn[i]= new JButton(String.valueOf(numValue));
		numBtn[i].setBackground(Color.decode("#DADFF7"));
		numValue+=10;}
		input.setText("");
		input.setEditable(false);
		input.setBackground(Color.decode("#FFFFFF"));
		this.getContentPane().setLayout(grid);
		this.setSize(300,400);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setTitle("Calculator");
		this.getContentPane().add(row1);
		this.getContentPane().add(row2);
		this.getContentPane().add(row3);
		this.getContentPane().add(row4);
		this.getContentPane().add(row5);
		this.getContentPane().add(row6);
		row1.setLayout(flow);
		row2.setLayout(flow);
		row3.setLayout(flow);
		row4.setLayout(flow);
		row5.setLayout(flow);
		row6.setLayout(flow);
		row1.add(input);
		row2.add(numBtn[0]);
		row2.add(numBtn[1]);
		row2.add(numBtn[2]);
		row3.add(numBtn[3]);
		row3.add(numBtn[4]);
		row3.add(numBtn[5]);
		row4.add(numBtn[6]);
		row4.add(numBtn[7]);
		row4.add(numBtn[8]);
		row5.add(btnClear);
		row5.add(numBtn[9]);
		row5.add(btnAdd);
		row6.add(btnSubtract);
		row6.add(btnDivide);
		row6.add(btnMultiply);
		btnClear.setFocusable(false);
		btnAdd.setFocusable(false);
		btnSubtract.setFocusable(false);
		btnDivide.setFocusable(false);
		btnMultiply.setFocusable(false);
		for(int i = 0; i<numBtn.length;i++) {
			numBtn[i].setFocusable(false);
		}
	
		numBtn[0].addActionListener(e->{
			val=10;
			input.setText(input.getText().concat(String.valueOf(val)));
			});
		numBtn[1].addActionListener(e->{
			val=20;
			input.setText(input.getText().concat(String.valueOf(val)));
			});
		numBtn[2].addActionListener(e->{
			val=30;
			input.setText(input.getText().concat(String.valueOf(val)));
			});
		numBtn[3].addActionListener(e->{
			val=40;
			input.setText(input.getText().concat(String.valueOf(val)));
			});
		numBtn[4].addActionListener(e->{
			val=50;
			input.setText(input.getText().concat(String.valueOf(val)));
			});
		numBtn[5].addActionListener(e->{
			val=60;
			input.setText(input.getText().concat(String.valueOf(val)));
			});
		numBtn[6].addActionListener(e->{
			val=70;
			input.setText(input.getText().concat(String.valueOf(val)));
			});
		numBtn[7].addActionListener(e->{
			val=80;
			input.setText(input.getText().concat(String.valueOf(val)));
			});
		numBtn[8].addActionListener(e->{
			val=90;
			input.setText(input.getText().concat(String.valueOf(val)));
			});
		numBtn[9].addActionListener(e->{
			val=100;
			input.setText(input.getText().concat(String.valueOf(val)));
			});
		btnMultiply.addActionListener(e->{
			val*=5;
			input.setText(input.getText().concat(" × 5 = ")+ val);
			});
		btnDivide.addActionListener(e->{
			val/=5;
			input.setText(input.getText().concat(" ÷ 5 = ")+ val);
			});
		btnClear.addActionListener(e->{
			val=0;
			input.setText("");
			});
		btnAdd.addActionListener(e->{
			val+=5;
			input.setText(input.getText().concat(" + 5 = ")+ val);
			});
		btnSubtract.addActionListener(e->{
			val-=5;
			input.setText(input.getText().concat(" - 5 = ")+ val);
			});
	}
	

	public static void main(String[] args) {
		
		new Calculator();
		

	}

}
