package gr.tests.teacher;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Toolkit;
import javax.swing.JTextField;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class DeleteStudent extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JLabel lblNewLabel_2;
	private JPanel contentPane;
	private JTextField txtTypeId;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeleteStudent frame = new DeleteStudent();
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
	public DeleteStudent() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(DeleteStudent.class.getResource("/gr/tests/teacher/icn.png")));
		setTitle("DELETION FORM");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(600, 100, 540, 451);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("<html>TYPE <span style=\"color:red\">ID </span> FOR DELETE</html>");
		lblNewLabel.setLabelFor(this);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBackground(new Color(192, 192, 192));
		lblNewLabel.setBounds(34, 59, 132, 37);
		contentPane.add(lblNewLabel);
		lblNewLabel.setOpaque(true);
		
		txtTypeId = new JTextField();
		txtTypeId.setToolTipText("TYPE ID");
		txtTypeId.setHorizontalAlignment(SwingConstants.CENTER);
		txtTypeId.setBackground(SystemColor.activeCaption);
		txtTypeId.setBounds(205, 59, 67, 37);
		contentPane.add(txtTypeId);
		txtTypeId.setColumns(10);
		
		JButton btnNewButton = new JButton("PRESS FOR DELETE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int numberOfRowsAffected=0;
				int num=Integer.parseInt(txtTypeId.getText());
				String url="delete from results  where ID="+num+"";
				try {
					PreparedStatement ps=Exams.c.prepareStatement(url);
					int btn =	JOptionPane.showConfirmDialog (null, "ARE YOU SURE ?",  "Warning", JOptionPane.YES_NO_OPTION);
					if (btn == JOptionPane.YES_OPTION){ numberOfRowsAffected = ps.executeUpdate();}
					 lblNewLabel_2.setIcon(new ImageIcon(DeleteStudent.class.getResource("/gr/tests/teacher/bb.png")));
					
					
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnNewButton.setBackground(new Color(255, 228, 196));
		btnNewButton.setBounds(310, 59, 132, 37);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("THE RECORD AFTER DELETION CAN NOT BE RETRIEVED");
		lblNewLabel_1.setLabelFor(lblNewLabel_1);
		lblNewLabel_1.setBackground(new Color(255, 128, 64));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(57, 315, 408, 24);
		contentPane.add(lblNewLabel_1);
		lblNewLabel_1.setOpaque(true);
		
	    lblNewLabel_2 = new JLabel("DELETION FORM");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(108, 145, 270, 144);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Parts parts=new Parts();
				parts.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setToolTipText("previous step");
		btnNewButton_1.setIcon(new ImageIcon(DeleteStudent.class.getResource("/gr/tests/teacher/return.png")));
		btnNewButton_1.setBounds(237, 350, 48, 51);
		contentPane.add(btnNewButton_1);
	}
}
