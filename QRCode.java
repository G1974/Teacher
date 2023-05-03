package gr.tests.teacher;

import java.awt.EventQueue;
import gr.tests.teacher.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import  gr.tests.teacher.*;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.BarcodeQRCode;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;

import java.awt.Toolkit;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;

public class QRCode extends JFrame {
	JLabel lblNewLabel;
	private JPanel contentPane;
	 String data;
	 String form0;
	 
	 JButton btnNewButton;
	JTextField textField;
	JLabel lblNewLabel_1;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QRCode frame = new QRCode();
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
	public QRCode() {
		setTitle("QRcode CREATE");
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(QRCode.class.getResource("/gr/tests/teacher/icn.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(600, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
	    btnNewButton = new JButton("QRcode CREATION");
		btnNewButton.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton.setBackground(new Color(255, 128, 192));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				form0=textField.getText().toString();
			Document doc=new Document(new Rectangle(PageSize.A4));
			try {
				PdfWriter writer=PdfWriter.getInstance(doc, new FileOutputStream("C:\\Users\\Giorgos\\Desktop\\test00.pdf"));
		        doc.open();
		        doc.add(new Paragraph("QRcode"));	       
		       PdfReader pdfReader=new PdfReader("C:\\Users\\Giorgos\\Desktop\\"+form0+".pdf");
		        int pages = pdfReader.getNumberOfPages(); 
		        for(int i=1; i<=pages; i++) {
		        	data=PdfTextExtractor.getTextFromPage(pdfReader, i);
		        	 
			        BarcodeQRCode code=new BarcodeQRCode(data, 1, 1, null);
			        Image img=code.getImage();
			        doc.add(img);      
		        }
		        doc.close();
		        pdfReader.close();
			} catch (IOException | DocumentException e1) { 
				//e1.printStackTrace();
				JOptionPane.showMessageDialog(null,"SOMETHING WENT WRONG", "ERROR", JOptionPane.INFORMATION_MESSAGE);
			}
			
			}

			
		});
		btnNewButton.setBounds(10, 109, 152, 62);
		contentPane.add(btnNewButton);
		
	    lblNewLabel = new JLabel("");
	    lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
	    lblNewLabel.setIcon(new ImageIcon(QRCode.class.getResource("/gr/tests/teacher/QR.png")));
		lblNewLabel.setBounds(175, 77, 134, 110);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		  Parts parts=new Parts();
		  parts.setVisible(true);
		  dispose();
			}
			
		});
		btnNewButton_1.setIcon(new ImageIcon(QRCode.class.getResource("/gr/tests/teacher/return.png")));
		btnNewButton_1.setBounds(324, 109, 45, 50);
		contentPane.add(btnNewButton_1);
		
		textField = new JTextField();
		textField.setBounds(23, 67, 126, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		lblNewLabel_1 = new JLabel("TYPE SURNAME");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Sitka Text", Font.BOLD, 12));
		lblNewLabel_1.setBounds(23, 42, 126, 14);
		contentPane.add(lblNewLabel_1);
	}
	
	
}
