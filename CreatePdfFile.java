package gr.tests.teacher;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class CreatePdfFile extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	JButton btnNewButton;

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	JLabel lblNewLabel_2;

	private JButton btnNewButton_1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreatePdfFile frame = new CreatePdfFile();
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
	public CreatePdfFile() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(CreatePdfFile.class.getResource("/gr/tests/teacher/icn.png")));
		setTitle("CREATE PDF");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(600, 100, 529,400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("TYPE SURNAME OF STUDENT");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(21, 55, 186, 23);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(240, 57, 128, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("<HTML> TYPE <span style=\"color:red\">ID </span>OF STUDENT</HTML>");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(21, 110, 169, 23);
		contentPane.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(275, 112, 57, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("EXECUTE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int rt=Integer.parseInt(textField_1.getText());		
				String tr=textField.getText();
                String sql = "SELECT CONTEX FROM Results where ID="+rt+" AND SURNAME='"+tr+"'";
			File file = new File("C:\\Users\\Giorgos\\Desktop\\"+tr+".pdf");
			
				try {
					PreparedStatement pstmt = Exams.c.prepareStatement(sql);
					ResultSet rs = pstmt.executeQuery();
					FileOutputStream output = new FileOutputStream(file);
					lblNewLabel_2.setBackground(Color.green);
					  lblNewLabel_2.setText("SUCCESSFUL EXECUTION");
					  lblNewLabel_2.setForeground(Color.black);
					while (rs.next()) {
					    InputStream input = rs.getBinaryStream("CONTEX");
					    byte[] buffer = new byte[1024];
					    while (input.read(buffer) > 0) {
					        output.write(buffer);
					   	 }  
					} 
					output.close();
				} catch (IOException | SQLException e1) {
					e1.printStackTrace();				
				}
			}
		});
		btnNewButton.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton.setBackground(Color.PINK);
		btnNewButton.setFont(new Font("Sitka Text", Font.BOLD, 12));
		btnNewButton.setBounds(52, 225, 98, 23);
		contentPane.add(btnNewButton);
		
	    lblNewLabel_2 = new JLabel("<html>QUERY EXECUTION<br>&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;PENDING</html>");
		lblNewLabel_2.setBackground(new Color(250, 250, 210));
		lblNewLabel_2.setForeground(Color.ORANGE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(240, 194, 161, 94);
		contentPane.add(lblNewLabel_2);
		lblNewLabel_2.setOpaque(true);
		
		btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Parts parts=new Parts();
				parts.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setToolTipText("previous step");
		btnNewButton_1.setIcon(new ImageIcon(CreatePdfFile.class.getResource("/gr/tests/teacher/return.png")));
		btnNewButton_1.setBounds(67, 292, 44, 40);
		contentPane.add(btnNewButton_1);
	}
}
