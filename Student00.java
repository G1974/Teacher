package gr.tests.teacher;

import java.awt.EventQueue;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import com.itextpdf.text.Document;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfImportedPage;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import gr.tests.teacher.*;
import java.awt.Label;

public class Student00 extends JFrame {
	 Statement stmt = null;

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JLabel lblNewLabel_8;
	private JTextField textField_8;
	private JLabel lblNewLabel_9;
	private JTextField textField_9;
	private JLabel lblNewLabel_10;
	private JTextField textField_10;
	private JLabel lblNewLabel_11;
	private JTextField textField_11;
	private JLabel lblNewLabel_12;
	private JTextField textField_12;
	private JLabel lblNewLabel_13;
	private JTextField textField_13;
	private JTextField textField_14;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Student00 frame = new Student00();
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
	public Student00() {
		setTitle("                                       SAVE DETAILS");
		setFont(new Font("Sitka Text", Font.BOLD, 12));
		setForeground(new Color(255, 255, 255));
		setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(600, 100, 529, 536);
	
		contentPane = new JPanel();
		contentPane.setBackground(new Color(150, 231, 235));
		contentPane.setForeground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setIconImage(Toolkit.getDefaultToolkit().getImage(Student00.class.getResource("/gr/tests/teacher/icn.png")));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ID NUMBER");
		lblNewLabel.setBackground(new Color(192, 192, 192));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Sitka Text", Font.BOLD, 12));
		lblNewLabel.setBounds(46, 24, 82, 24);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NAME");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Sitka Text", Font.BOLD, 12));
		lblNewLabel_1.setBounds(46, 74, 82, 24);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("SURNAME");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Sitka Text", Font.BOLD, 12));
		lblNewLabel_2.setBounds(46, 123, 82, 24);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("LANDPHONE");
		lblNewLabel_3.setFont(new Font("Sitka Text", Font.BOLD, 12));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(46, 178, 94, 24);
		contentPane.add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setBackground(new Color(192, 192, 192));
		textField.setBounds(150, 24, 82, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBackground(new Color(192, 192, 192));
		textField_1.setBounds(150, 74, 82, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBackground(new Color(192, 192, 192));
		textField_2.setBounds(150, 123, 82, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBackground(new Color(192, 192, 192));
		textField_3.setBounds(150, 178, 82, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		lblNewLabel_4 = new JLabel("MOBILE PHONE");
		lblNewLabel_4.setFont(new Font("Sitka Text", Font.BOLD, 12));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(255, 24, 106, 20);
		contentPane.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("STUDENT AGE");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setFont(new Font("Sitka Text", Font.BOLD, 12));
		lblNewLabel_5.setBounds(255, 74, 106, 20);
		contentPane.add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("MONTHLY TEST");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setFont(new Font("Sitka Text", Font.BOLD, 12));
		lblNewLabel_6.setBounds(255, 123, 106, 20);
		contentPane.add(lblNewLabel_6);
		
		lblNewLabel_7 = new JLabel("CURRENT YEAR");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setFont(new Font("Sitka Text", Font.BOLD, 12));
		lblNewLabel_7.setBounds(255, 181, 106, 20);
		contentPane.add(lblNewLabel_7);
		
		textField_4 = new JTextField();
		textField_4.setBackground(new Color(192, 192, 192));
		textField_4.setBounds(379, 24, 86, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBackground(new Color(192, 192, 192));
		textField_5.setBounds(379, 74, 86, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBackground(new Color(192, 192, 192));
		textField_6.setBounds(379, 124, 86, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBackground(new Color(192, 192, 192));
		textField_7.setBounds(379, 174, 86, 20);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		lblNewLabel_8 = new JLabel("<html><u>TEACHER<br>EXAMINER</html>");
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setFont(new Font("Sitka Text", Font.BOLD, 12));
		lblNewLabel_8.setBounds(40, 223, 94, 38);
		contentPane.add(lblNewLabel_8);
		
		textField_8 = new JTextField();
		textField_8.setBackground(new Color(192, 192, 192));
		textField_8.setBounds(150, 230, 82, 20);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		lblNewLabel_9 = new JLabel("MARKS");
		lblNewLabel_9.setFont(new Font("Sitka Text", Font.BOLD, 12));
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_9.setBounds(275, 223, 67, 38);
		contentPane.add(lblNewLabel_9);
		
		textField_9 = new JTextField();
		textField_9.setBackground(new Color(192, 192, 192));
		textField_9.setBounds(379, 224, 86, 20);
		contentPane.add(textField_9);
		textField_9.setColumns(10);
		
		lblNewLabel_10 = new JLabel("<HTML>ENGLISH<br>COURSE</HTML>");
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_10.setFont(new Font("Sitka Text", Font.BOLD, 12));
		lblNewLabel_10.setBounds(53, 266, 68, 38);
		contentPane.add(lblNewLabel_10);
		
		textField_10 = new JTextField();
		textField_10.setBackground(new Color(192, 192, 192));
		textField_10.setBounds(150, 273, 82, 20);
		contentPane.add(textField_10);
		textField_10.setColumns(10);
		
		lblNewLabel_11 = new JLabel("<HTML>FRENCH<br>COURSE</HTML>");
		lblNewLabel_11.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_11.setFont(new Font("Sitka Text", Font.BOLD, 12));
		lblNewLabel_11.setBounds(277, 272, 65, 35);
		contentPane.add(lblNewLabel_11);
		
		textField_11 = new JTextField();
		textField_11.setBackground(new Color(192, 192, 192));
		textField_11.setBounds(379, 274, 86, 20);
		contentPane.add(textField_11);
		textField_11.setColumns(10);
		
		lblNewLabel_12 = new JLabel("CLASS");
		lblNewLabel_12.setFont(new Font("Sitka Text", Font.BOLD, 12));
		lblNewLabel_12.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_12.setBounds(66, 315, 46, 26);
		contentPane.add(lblNewLabel_12);
		
		textField_12 = new JTextField();
		textField_12.setBackground(new Color(192, 192, 192));
		textField_12.setBounds(150, 316, 82, 20);
		contentPane.add(textField_12);
		textField_12.setColumns(10);
		
		lblNewLabel_13 = new JLabel("CONTEX");
		lblNewLabel_13.setFont(new Font("Sitka Text", Font.BOLD, 12));
		lblNewLabel_13.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_13.setBounds(275, 325, 67, 16);
		contentPane.add(lblNewLabel_13);
		
		textField_13 = new JTextField();
		textField_13.setBackground(new Color(192, 192, 192));
		textField_13.setBounds(379, 316, 86, 20);
		contentPane.add(textField_13);
		textField_13.setColumns(10);
		
		JButton btnNewButton = new JButton("SAVE DETAILS");
		btnNewButton.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 12));
		btnNewButton.setBackground(new Color(192, 192, 192));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=Integer.parseInt(textField.getText());
				
				
				try {
					String  quer="SELECT ID FROM Results";
					PreparedStatement pp=Exams.c.prepareStatement(quer);
					ResultSet r=pp.executeQuery();
					
					while(r.next()) {
					int b=	r.getInt("ID");
						if(a==b) {
							JOptionPane.showMessageDialog(null, "ALREADY EXISTS THIS ID", "ERROR", JOptionPane.ERROR_MESSAGE);
							JOptionPane.showMessageDialog(null, "PLEASE TRY AGAIN", "ALERT", JOptionPane.WARNING_MESSAGE);
							r.close();
							pp.close();
							System.out.println(a+" +++++"+ b);break;
						}	

					}
		
				} catch (SQLException e1) {
					e1.printStackTrace();
				}		  
				  String rr=textField_13.getText();
				 
				  try {
					  File image = new File("C:\\Users\\Giorgos\\Desktop\\"+rr+".pdf");
					  FileInputStream   fis = new FileInputStream(image);
					  String sql =
							  "INSERT INTO Results(ID,NAME,SURNAME,LANDPHONE,MOBILEPHONE,TEACHER,AGE,MONTHLYTEST"
							  + ",CURRENTYEAR,MARK,ENGLISH,FRENCH,CLASS,CONTEX,EMAIL) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
							  
					  PreparedStatement pst = Exams.c.prepareStatement(sql);
				  pst.setInt(1,Integer.parseInt(textField.getText()));
				  pst.setString(2,textField_1.getText());
				  pst.setString(3,textField_2.getText());
				  pst.setString(4,textField_3.getText());
				  pst.setString(5,textField_4.getText());
				  pst.setString(6,textField_8.getText());
				  pst.setInt(7,Integer.parseInt(textField_5.getText()));
				  pst.setString(8,textField_6.getText());
				  pst.setString(9,textField_7.getText());
				  pst.setFloat(10,Float.parseFloat(textField_9.getText()));
				  pst.setString(11,textField_10.getText());
				  pst.setString(12,textField_11.getText());
				  pst.setString(13,textField_12.getText());
				  pst.setBinaryStream(14, fis,(int) image.length());
				 // pst.setBlob(14, fis);
				  pst.setString(15,textField_14.getText());
				  pst.execute();
				
				
				  JOptionPane.showMessageDialog(null,"   SUCCESSFUL SAVE", "STORED", JOptionPane.INFORMATION_MESSAGE);
				  
				  } catch (SQLException | FileNotFoundException e1) { e1.printStackTrace(); 
		
				  }
				 
				 
			
			
			}
		});
		btnNewButton.setToolTipText("student details to store");
		btnNewButton.setBounds(66, 403, 137, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon(Student00.class.getResource("/gr/tests/teacher/return.png")));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Parts parts=new Parts();
				parts.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1.setToolTipText("previous step");
		btnNewButton_1.setBounds(332, 403, 65, 38);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_14 = new JLabel("<HTML><span style=\"color:red\">E-MAIL</span></HTML>");
		lblNewLabel_14.setBackground(new Color(192, 192, 192));
		lblNewLabel_14.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_14.setFont(new Font("Sitka Text", Font.BOLD, 14));
		lblNewLabel_14.setBounds(61, 352, 67, 24);
		contentPane.add(lblNewLabel_14);
		
		textField_14 = new JTextField();
		textField_14.setBackground(new Color(192, 192, 192));
		textField_14.setBounds(236, 352, 229, 20);
		contentPane.add(textField_14);
		textField_14.setColumns(10);
		
		 
	}
	
}
