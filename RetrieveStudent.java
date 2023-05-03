package gr.tests.teacher;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.JTableHeader;
import net.proteanit.sql.DbUtils;

import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import javax.swing.JScrollBar;
import javax.swing.border.LineBorder;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.MatteBorder;
import java.awt.Font;
import javax.swing.border.CompoundBorder;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;

public class RetrieveStudent extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textField;
	private JLabel lblNewLabel_1;
	private JTextField textField_1;
	private JButton btnNewButton_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RetrieveStudent frame = new RetrieveStudent();
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
	public RetrieveStudent() {
		setTitle("PREVIEW");
		setFont(new Font("Courier New", Font.BOLD, 12));
		setIconImage(Toolkit.getDefaultToolkit().getImage(RetrieveStudent.class.getResource("/gr/tests/teacher/icn.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 100, 1500, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("ALL RECORDS");
		btnNewButton.setToolTipText("PRESS TO SEE ALL RECORDS");
		btnNewButton.setBackground(new Color(192, 192, 192));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String quer ="select * from Results";
				
				try {
					
					PreparedStatement pp = Exams.c.prepareStatement(quer);
					ResultSet r=pp.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(r));
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				
				
			}
		});
		btnNewButton.setBounds(10, 11, 131, 23);
		contentPane.add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportBorder(new TitledBorder(new CompoundBorder(null, UIManager.getBorder("CheckBoxMenuItem.border")), "", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLUE));
		scrollPane.setBounds(10, 57, 1452, 363);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.BOLD, 12));
		table.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(255, 0, 0)));
		table.setEnabled(false);
		table.setBackground(Color.LIGHT_GRAY);
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel = new JLabel("ENTER SURNAME");
		lblNewLabel.setBackground(new Color(250, 250, 210));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(222, 16, 110, 14);
		contentPane.add(lblNewLabel);
		lblNewLabel.setOpaque(true);
		
		textField = new JTextField();
		textField.setBounds(356, 13, 119, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		lblNewLabel_1 = new JLabel("ENTER MONTH");
		lblNewLabel_1.setBackground(new Color(250, 250, 210));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(535, 16, 99, 14);
		contentPane.add(lblNewLabel_1);
		lblNewLabel_1.setOpaque(true);
		
		textField_1 = new JTextField();
		textField_1.setBounds(642, 13, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("EXECUTE QUERY");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String quer ="select * from Results  where SURNAME ='"+textField.getText()+"' AND MONTHLYTEST ='"+textField_1.getText()+"'";
                 try {	
					PreparedStatement pp = Exams.c.prepareStatement(quer);
					ResultSet r=pp.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(r));
					btnNewButton_1.setBackground(Color.green);
				} catch (SQLException e1) {btnNewButton_1.setBackground(Color.red);
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_1.setBackground(new Color(255, 215, 0));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1.setBounds(827, 12, 139, 23);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("");
		btnNewButton_2.setToolTipText("previous step");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Parts parts=new Parts();
				parts.setVisible(true);
				dispose();
			}
		});
		btnNewButton_2.setIcon(new ImageIcon(RetrieveStudent.class.getResource("/gr/tests/teacher/return.png")));
		btnNewButton_2.setBounds(1279, 12, 44, 37);
		contentPane.add(btnNewButton_2);
		
	}
}
