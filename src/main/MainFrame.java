package main;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;
import java.awt.event.ActionEvent;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextArea;

public class MainFrame extends JFrame {

	private JPanel contentPane;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainFrame() {
		
		
		
		setForeground(Color.GRAY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 977, 395);
		contentPane = new JPanel();
		contentPane.setForeground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		JLabel lblPudge_1 = new JLabel("Pudge");
		lblPudge_1.setFont(new Font("Times New Roman", Font.BOLD, 21));
		lblPudge_1.setBounds(462, 47, 69, 25);
		contentPane.add(lblPudge_1);
		
		JLabel lblReplics = new JLabel("Replics :");
		lblReplics.setFont(new Font("Times New Roman", Font.BOLD, 21));
		lblReplics.setBounds(318, 77, 99, 25);
		contentPane.add(lblReplics);
		
		
		JLabel label_2 = new JLabel("PUDGE");
		label_2.setVisible(false);
		label_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		label_2.setBounds(137, 206, 113, 16);
		contentPane.add(label_2);
		
		
		Date date = new Date();
		
		JLabel lblPudge = new JLabel("PUDGE");
		lblPudge.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		lblPudge.setBounds(137, 189, 113, 16);
		contentPane.add(lblPudge);
		
		JLabel label = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/Pudge_Icon.png")).getImage();
		label.setIcon(new ImageIcon(img));
		label.setBounds(50, 29, 232, 176);
		contentPane.add(label);
		
		JLabel lblRep = new JLabel("");
		lblRep.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblRep.setBounds(402, 115, 275, 30);
		contentPane.add(lblRep);
		
		JLabel lblRep_1 = new JLabel("");
		lblRep_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblRep_1.setBounds(402, 141, 275, 30);
		contentPane.add(lblRep_1);
		
		JLabel lblRep_2 = new JLabel("");
		lblRep_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblRep_2.setBounds(402, 175, 275, 16);
		contentPane.add(lblRep_2);
	

		Image img2 = new ImageIcon(this.getClass().getResource("/ger_pudge.png")).getImage();

		JTextArea textArea = new JTextArea();
		textArea.setBounds(689, 86, 258, 150);
		contentPane.add(textArea);
		
//		JButton btnNewButton_3 = new JButton("Log Info");
//		btnNewButton_3.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent arg0) {
//				Date date = new Date();
//				for(int i = 0;i<10;i++) {
//					String sm;
//				
//					if(btnNewButton.isEnabled()) {
//						textArea.setText(btnNewButton.getName()+ " "+ date);
//					}
//				}
//				
//				
//			}
//		});
//		btnNewButton_3.setBounds(778, 253, 97, 25);
//		contentPane.add(btnNewButton_3);
//	
//	
		
		
		JButton btnNewButton = new JButton("ENG");
		btnNewButton.setName("ENG");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String lang = "en";
				String country = "EN";
				
				Locale currentLocale =  new Locale(lang,country);
				ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle",currentLocale);
				lblRep.setText(messages.getString("rep1"));
				lblRep_2.setText(messages.getString("rep2"));
				lblRep_1.setText(messages.getString("rep3"));
				lblReplics.setText(messages.getString("info"));
				textArea.append(btnNewButton.getName()+ " "+ date +"\n");
				label.setIcon(new ImageIcon(img));
				label_2.setVisible(false);
			}
		});
		btnNewButton.setBounds(50, 253, 97, 25);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("GER");
		btnNewButton_1.setName("Ger");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				String lang = "de";
				String country = "DE";
				
				Locale currentLocale =  new Locale(lang,country);
				ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle",currentLocale);
				lblRep.setText(messages.getString("rep1"));
				lblRep_2.setText(messages.getString("rep2"));
				lblRep_1.setText(messages.getString("rep3"));
				lblReplics.setText(messages.getString("info"));
				textArea.append(btnNewButton_1.getName()+ " "+ date +"\n");
				label.setIcon(new ImageIcon(img2));
				label_2.setVisible(true);
			}
		});
	
		btnNewButton_1.setBounds(172, 253, 97, 25);
		contentPane.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("RUS");
		btnNewButton_2.setName("Rus");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String lang = "ru";
				String country = "RU";
				
				Locale currentLocale =  new Locale(lang,country);
				ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle",currentLocale);
				lblRep.setText(messages.getString("rep1"));
				lblRep_2.setText(messages.getString("rep2"));
				lblRep_1.setText(messages.getString("rep3"));
				lblReplics.setText(messages.getString("info"));
				textArea.append(btnNewButton_2.getName()+ " "+ date +"\n");
				label.setIcon(new ImageIcon(img));
				label_2.setVisible(false);
			}
		});
		btnNewButton_2.setBounds(299, 253, 97, 25);
		contentPane.add(btnNewButton_2);
		
		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnClose.setBounds(809, 299, 97, 25);
		contentPane.add(btnClose);
		
	
		
		
		
	
		}
	}
