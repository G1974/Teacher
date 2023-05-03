package gr.tests.teacher;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Label;
import java.awt.Panel;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JLabel;



public class Exams extends JFrame {

	private JPanel contentPane;
	static Connection c=null;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exams frame = new Exams();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Exams() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				try {
					c=DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Giorgos\\eclipse-workspace\\TeacherExam\\src\\sqlite\\result.db");
				
					System.out.println("Sqlite is connected");
					} catch (SQLException e1) {
					
					e1.printStackTrace();
				}
			}
		});
		setIconImage(Toolkit.getDefaultToolkit().getImage(Exams.class.getResource("/gr/tests/teacher/icn.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(600, 100, 529, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setUndecorated(true);
		
		Panel panel = new Panel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(198, 62, 138, 91);
		contentPane.add(panel);
		panel.setLayout(null);
		
		
		Label label = new Label("VERSION 1.0.0");
		label.setBounds(22, 35, 95, 23);
		label.setAlignment(Label.CENTER);
		panel.add(label);
		label.setBackground(Color.CYAN);
		label.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Parts parts=new Parts();
				parts.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setFont(new Font("Times New Roman", Font.ITALIC, 12));
		btnNewButton.setBackground(new Color(0, 153, 255));
		btnNewButton.setBounds(220, 211, 103, 23);
		contentPane.add(btnNewButton);
		
		Label label_1 = new Label("DATA BASE IS CONNECTED");
		label_1.setAlignment(Label.CENTER);
		label_1.setFont(new Font("DialogInput", Font.BOLD | Font.ITALIC, 12));
		label_1.setBackground(new Color(128, 255, 128));
		label_1.setBounds(185, 250, 172, 22);
		contentPane.add(label_1);
	}
}
