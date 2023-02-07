package app;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.JTextField;
import java.awt.Color;

public class MyFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	int input;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyFrame frame = new MyFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public MyFrame() {
		setTitle("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 319, 428);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		

		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(6, 0, 0, 0));
		
		textField = new JTextField();
		contentPane.add(textField);
		textField.setColumns(10);
		//textField.setText(String.valueOf(input));
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(new GridLayout(0, 3, 5, 10));
		
		JButton btnNewButton = new JButton("10");
		btnNewButton.setFocusable(false);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input=10;
				textField.setText(textField.getText().concat(String.valueOf(input)));
			}
		});
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("20");
		btnNewButton_1.setFocusable(false);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input=20;
				textField.setText(textField.getText().concat(String.valueOf(input)));
			}
		});
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("30");
		btnNewButton_2.setFocusable(false);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input=30;
				textField.setText(textField.getText().concat(String.valueOf(input)));
			}
		});
		panel.add(btnNewButton_2);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1);
		panel_1.setLayout(new GridLayout(0, 3, 5, 10));
		
		JButton btnNewButton_3 = new JButton("40");
		btnNewButton_3.setFocusable(false);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input=40;
				textField.setText(textField.getText().concat(String.valueOf(input)));
			}
		});
		panel_1.add(btnNewButton_3);
		
		JButton btnNewButton_6 = new JButton("50");
		btnNewButton_6.setFocusable(false);
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input=50;
				textField.setText(textField.getText().concat(String.valueOf(input)));
			}
		});
		panel_1.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("60");
		btnNewButton_7.setFocusable(false);
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input=60;
				textField.setText(textField.getText().concat(String.valueOf(input)));
			}
		});
		panel_1.add(btnNewButton_7);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2);
		panel_2.setLayout(new GridLayout(0, 3, 5, 10));
		
		JButton btnNewButton_4 = new JButton("70");
		btnNewButton_4.setFocusable(false);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input=70;
				textField.setText(textField.getText().concat(String.valueOf(input)));
			}
		});
		panel_2.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("80");
		btnNewButton_5.setFocusable(false);

		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input=80;
				textField.setText(textField.getText().concat(String.valueOf(input)));
			}
		});
		panel_2.add(btnNewButton_5);
		
		JButton btnNewButton_11 = new JButton("90");
		btnNewButton_11.setFocusable(false);
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input=90;
				textField.setText(textField.getText().concat(String.valueOf(input)));
			}
		});
		panel_2.add(btnNewButton_11);
		
		JPanel panel_3 = new JPanel();
		contentPane.add(panel_3);
		panel_3.setLayout(new GridLayout(0, 3, 5, 10));
		
		JButton btnNewButton_8 = new JButton("CLEAR");
		btnNewButton_8.setFocusable(false);
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
			}
		});
		btnNewButton_8.setBackground(new Color(255, 0, 0));
		panel_3.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("100");
		btnNewButton_9.setFocusable(false);
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input=100;
				textField.setText(textField.getText().concat(String.valueOf(input)));
			}
		});
		panel_3.add(btnNewButton_9);
		
		JButton btnNewButton_12 = new JButton("× 5");
		btnNewButton_12.setFocusable(false);
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input*=5;
				textField.setText(textField.getText().concat(" × 5 = ") + input);
}
		});
		btnNewButton_12.setBackground(new Color(0, 128, 192));
		panel_3.add(btnNewButton_12);
		
		JPanel panel_4 = new JPanel();
		contentPane.add(panel_4);
		panel_4.setLayout(new GridLayout(0, 3, 5, 10));
		
		JButton btnNewButton_10 = new JButton("- 5");
		btnNewButton_10.setFocusable(false);
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input-=5;
				textField.setText(textField.getText().concat(" - 5 = ") + input);
}
		});
		btnNewButton_10.setBackground(new Color(0, 128, 192));
		panel_4.add(btnNewButton_10);
		
		JButton btnNewButton_13 = new JButton("+ 5");
		btnNewButton_13.setFocusable(false);
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input+=5;
				textField.setText(textField.getText().concat(" + 5 = ") + input);
}
		});
		btnNewButton_13.setBackground(new Color(0, 128, 192));
		panel_4.add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("÷ 5");
		btnNewButton_14.setFocusable(false);
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input/=5;
				textField.setText(textField.getText().concat(" ÷ 5 = ") + input);
}
		});
		btnNewButton_14.setBackground(new Color(0, 128, 192));
		panel_4.add(btnNewButton_14);
	}

}
