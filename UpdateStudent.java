package gr.tests.teacher;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class UpdateStudent extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UpdateStudent frame = new UpdateStudent();
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
	public UpdateStudent() {
		setTitle("UPDATE DETAILS OF STUDENT");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(600, 100, 540, 451);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("TYPE  NEW LANDPHONE");
		lblNewLabel.setFont(new Font("Sitka Text", Font.BOLD, 12));
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setBounds(23, 63, 174, 24);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("TYPE  NEW MOBILEPHONE");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setFont(new Font("Sitka Text", Font.BOLD, 12));
		lblNewLabel_1.setBounds(23, 28, 194, 24);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("<HTML>TYPE  NEW<span  style=\"color:red\"> EMAIL</span></HTML>");
		lblNewLabel_2.setFont(new Font("Sitka Text", Font.BOLD, 12));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2.setBounds(23, 98, 174, 24);
		contentPane.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(227, 28, 129, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(227, 63, 129, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(227, 101, 129, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("<HTML>&nbsp;UPDATE<br>EXECUTE</HTML>");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				String exc="update Results set MOBILEPHONE='"+textField.getText()+"',LANDPHONE='"+textField_1.getText()+"',EMAIL='"+textField_2.getText()+"' WHERE SURNAME='"+textField_3.getText()+"'";
				try {
					PreparedStatement ps=Exams.c.prepareStatement(exc);
					ps.executeUpdate();
					lblNewLabel_4.setBackground(Color.green);
					lblNewLabel_4.setText("UPDATE SUCCESSFUL");
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			
			}
		});
		btnNewButton.setBackground(new Color(255, 153, 0));
		btnNewButton.setBounds(413, 148, 82, 59);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("<HTML>TYPE <span style=color:red;> SURNAME</HTML>");
		lblNewLabel_3.setFont(new Font("Sitka Text", Font.BOLD, 12));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3.setBounds(23, 133, 174, 14);
		contentPane.add(lblNewLabel_3);
		
		textField_3 = new JTextField();
		textField_3.setBounds(227, 132, 129, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		lblNewLabel_4 = new JLabel("UPDATE FORM");
		lblNewLabel_4.setBackground(new Color(192, 192, 192));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Sitka Text", Font.BOLD, 12));
		lblNewLabel_4.setBounds(60, 221, 245, 113);
		contentPane.add(lblNewLabel_4);
		lblNewLabel_4.setOpaque(true);
		
		lblNewLabel_5 = new JLabel("AFTER UPDATING THE PREVIOUS DATA WILL BE ERASED");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setFont(new Font("Sitka Text", Font.BOLD, 12));
		lblNewLabel_5.setBackground(new Color(255, 128, 64));
		lblNewLabel_5.setBounds(42, 345, 425, 24);
		contentPane.add(lblNewLabel_5);
		lblNewLabel_5.setOpaque(true);
		
		btnNewButton_1 = new JButton("");
		btnNewButton_1.setToolTipText("previous step");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Parts parts=new Parts();
				parts.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setIcon(new ImageIcon(UpdateStudent.class.getResource("/gr/tests/teacher/return.png")));
		btnNewButton_1.setBounds(442, 260, 42, 40);
		contentPane.add(btnNewButton_1);
		
	}
}
