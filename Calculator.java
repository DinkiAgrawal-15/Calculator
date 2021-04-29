package Calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;

public class calci {

	private JFrame frame;
	private JTextField textField;
	double first;
	double second;
	double result;
	String operation;
	String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calci window = new calci();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public calci() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.GRAY);
		frame.getContentPane().setForeground(new Color(0, 0, 0));
		frame.setBounds(100, 100, 411, 647);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 18));
		textField.setBackground(new Color(0, 255, 255));
		textField.setBounds(18, 30, 369, 64);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btn0 = new JButton("0");
		btn0.setForeground(new Color(128, 0, 0));
		btn0.setBackground(new Color(0, 206, 209));
		btn0.setFont(new Font("Sylfaen", Font.BOLD, 33));
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+btn0.getText();
				textField.setText(number);
			}
		});
		btn0.setBounds(40, 404, 75, 64);
		frame.getContentPane().add(btn0);
		
		JButton btn4 = new JButton("4");
		btn4.setBackground(new Color(0, 206, 209));
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setFont(new Font("Sylfaen", Font.BOLD, 25));
		btn4.setBounds(40, 256, 75, 64);
		frame.getContentPane().add(btn4);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setBackground(new Color(0, 206, 209));
		btn7.setFont(new Font("Sylfaen", Font.BOLD, 25));
		btn7.setBounds(40, 182, 75, 64);
		frame.getContentPane().add(btn7);
		
		JButton btnBackspace = new JButton("\uF0E7");
		btnBackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String backspace=null;
				if(textField.getText().length()>0) {
					StringBuilder str=new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backspace=str.toString();
					textField.setText(backspace);
				}
							}
		});
		btnBackspace.setForeground(new Color(128, 0, 0));
		btnBackspace.setBackground(new Color(0, 206, 209));
		btnBackspace.setFont(new Font("Wingdings", Font.BOLD, 24));
		btnBackspace.setBounds(40, 104, 75, 64);
		frame.getContentPane().add(btnBackspace);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setBackground(new Color(0, 206, 209));
		btn1.setFont(new Font("Sylfaen", Font.BOLD, 25));
		btn1.setBounds(40, 330, 75, 64);
		frame.getContentPane().add(btn1);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setBackground(new Color(0, 206, 209));
		btn5.setFont(new Font("Sylfaen", Font.BOLD, 25));
		btn5.setBounds(127, 256, 75, 64);
		frame.getContentPane().add(btn5);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setBackground(new Color(0, 206, 209));
		btn8.setFont(new Font("Sylfaen", Font.BOLD, 25));
		btn8.setBounds(127, 182, 75, 64);
		frame.getContentPane().add(btn8);
		
		JButton btnclear = new JButton("C");
		btnclear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(null);
			}
		});
		btnclear.setForeground(new Color(128, 0, 0));
		btnclear.setBackground(new Color(64, 224, 208));
		btnclear.setFont(new Font("Sylfaen", Font.BOLD, 24));
		btnclear.setBounds(125, 104, 75, 64);
		frame.getContentPane().add(btnclear);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setBackground(new Color(0, 206, 209));
		btn2.setFont(new Font("Sylfaen", Font.BOLD, 25));
		btn2.setBounds(127, 330, 75, 64);
		frame.getContentPane().add(btn2);
		
		JButton btndot = new JButton(".");
		btndot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+btndot.getText();
				textField.setText(number);
			}
		});
		btndot.setForeground(new Color(128, 0, 0));
		btndot.setBackground(new Color(0, 206, 209));
		btndot.setFont(new Font("Sylfaen", Font.BOLD, 34));
		btndot.setBounds(127, 404, 75, 64);
		frame.getContentPane().add(btndot);
		
		JButton btn00 = new JButton("00");
		btn00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+btn00.getText();
				textField.setText(number);
			}
		});
		btn00.setForeground(new Color(128, 0, 0));
		btn00.setBackground(new Color(64, 224, 208));
		btn00.setFont(new Font("Sylfaen", Font.BOLD, 24));
		btn00.setBounds(210, 104, 75, 64);
		frame.getContentPane().add(btn00);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setBackground(new Color(0, 206, 209));
		btn9.setFont(new Font("Sylfaen", Font.BOLD, 25));
		btn9.setBounds(212, 182, 75, 64);
		frame.getContentPane().add(btn9);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setBackground(new Color(0, 206, 209));
		btn6.setFont(new Font("Sylfaen", Font.BOLD, 25));
		btn6.setBounds(212, 256, 75, 64);
		frame.getContentPane().add(btn6);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setBackground(new Color(0, 206, 209));
		btn3.setFont(new Font("Sylfaen", Font.BOLD, 25));
		btn3.setBounds(212, 330, 75, 64);
		frame.getContentPane().add(btn3);
		
		JButton btneqalto = new JButton("=");
		btneqalto.setForeground(new Color(128, 0, 0));
		btneqalto.setBackground(new Color(0, 206, 209));
		btneqalto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String answer;
				second=Double.parseDouble(textField.getText());
				if(operation=="+") {
					result=first+second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="-") {
					result=first-second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="*") {
					result=first*second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="/") {
					result=first/second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="%") {
					result=first%second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
			}
		});
		btneqalto.setFont(new Font("Sylfaen", Font.BOLD, 30));
		btneqalto.setBounds(212, 404, 75, 64);
		frame.getContentPane().add(btneqalto);
		
		JButton btnplus = new JButton("+");
		btnplus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="+";
			}
		});
		btnplus.setForeground(new Color(128, 0, 0));
		btnplus.setBackground(new Color(0, 206, 209));
		btnplus.setFont(new Font("Sylfaen", Font.BOLD, 30));
		btnplus.setBounds(295, 104, 75, 64);
		frame.getContentPane().add(btnplus);
		
		JButton btnsub = new JButton("-");
		btnsub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="-";
			}
		});
		btnsub.setForeground(new Color(128, 0, 0));
		btnsub.setBackground(new Color(0, 206, 209));
		btnsub.setFont(new Font("Sylfaen", Font.BOLD, 30));
		btnsub.setBounds(297, 182, 75, 64);
		frame.getContentPane().add(btnsub);
		
		JButton btnmul = new JButton("*");
		btnmul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="*";
			}
		});
		btnmul.setForeground(new Color(128, 0, 0));
		btnmul.setBackground(new Color(0, 206, 209));
		btnmul.setFont(new Font("Sylfaen", Font.BOLD, 30));
		btnmul.setBounds(297, 255, 75, 64);
		frame.getContentPane().add(btnmul);
		
		JButton btndiv = new JButton("/");
		btndiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="/";
			}
		});
		btndiv.setForeground(new Color(128, 0, 0));
		btndiv.setBackground(new Color(0, 206, 209));
		btndiv.setFont(new Font("Sylfaen", Font.BOLD, 30));
		btndiv.setBounds(297, 330, 75, 64);
		frame.getContentPane().add(btndiv);
		
		JButton btnmod = new JButton("%");
		btnmod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="%";
			}
		});
		btnmod.setForeground(new Color(128, 0, 0));
		btnmod.setBackground(new Color(0, 206, 209));
		btnmod.setFont(new Font("Sylfaen", Font.BOLD, 30));
		btnmod.setBounds(297, 404, 75, 64);
		frame.getContentPane().add(btnmod);
		
		JButton btnclear_1 = new JButton("C");
		btnclear_1.setFont(new Font("Sylfaen", Font.BOLD, 18));
		btnclear_1.setBounds(125, 104, 75, 64);
		frame.getContentPane().add(btnclear_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(32, 478, 338, 46);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(32, 534, 338, 46);
		frame.getContentPane().add(lblNewLabel_1);
	}
}
