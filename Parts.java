package gr.tests.teacher;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.awt.Window.Type;
import java.awt.Label;

public class Parts extends JFrame {
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Parts frame = new Parts();
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
	public Parts() {
		setBackground(new Color(255, 255, 255));
		setResizable(false);
		setFont(new Font("Dialog", Font.BOLD, 10));
		setTitle("                         DATA BASE IS CONNECTED");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Parts.class.getResource("/gr/tests/teacher/icn.png")));
		setBounds(600, 100, 448,357);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 204, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JButton btnNewButton = new JButton("STUDENT DETAILS");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {		
				
				Student00 student00=new Student00();
				student00.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Sitka Text", Font.BOLD, 12));
		btnNewButton.setBackground(new Color(240, 230, 140));
		btnNewButton.setBounds(23, 11, 167, 79);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("DELETE STUDENT");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DeleteStudent deletestudent=new DeleteStudent();
				deletestudent.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Sitka Text", Font.BOLD, 12));
		btnNewButton_1.setBackground(new Color(240, 230, 140));
		btnNewButton_1.setBounds(23, 93, 167, 79);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("RETRIEVE DETAILS ");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RetrieveStudent retrievestudent = new RetrieveStudent();
				retrievestudent.setVisible(true);
				dispose(); 
			}
		});
		btnNewButton_2.setFont(new Font("Sitka Text", Font.BOLD, 12));
		btnNewButton_2.setBackground(new Color(240, 230, 140));
		btnNewButton_2.setBounds(23, 175, 167, 79);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("UPDATE DETAILS");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UpdateStudent updatestudent=new UpdateStudent();
				updatestudent.setVisible(true);
				dispose();
			}
		});
		btnNewButton_3.setFont(new Font("Sitka Text", Font.BOLD, 12));
		btnNewButton_3.setBackground(new Color(240, 230, 140));
		btnNewButton_3.setBounds(236, 11, 167, 79);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("PDF CREATE");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CreatePdfFile createpdffile =new CreatePdfFile();
				createpdffile.setVisible(true);
				dispose();
			
			}
		});
		btnNewButton_4.setFont(new Font("Sitka Text", Font.BOLD, 12));
		btnNewButton_4.setBackground(new Color(240, 230, 140));
		btnNewButton_4.setBounds(236, 93, 167, 79);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("QR CODE CREATE");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				QRCode qrcode=new QRCode();
				qrcode.setVisible(true);
				dispose();
			}
		});
		btnNewButton_5.setFont(new Font("Sitka Text", Font.BOLD, 12));
		btnNewButton_5.setBackground(new Color(240, 230, 140));
		btnNewButton_5.setBounds(236, 175, 167, 79);
		contentPane.add(btnNewButton_5);
		
	
	}
}
