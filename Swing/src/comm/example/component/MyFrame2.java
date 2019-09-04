package comm.example.component;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

import comm.example.service.*;
import comm.example.dao.*;
import comm.example.factory.*;
import comm.example.model.*;
import javax.swing.JScrollPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MyFrame2 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyFrame2 frame = new MyFrame2();
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
	private RS2XMLConfig config=null;
	private JTextField textField_4;
	public MyFrame2() throws SQLException {

		config = new RS2XMLConfig();
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 
		
		
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEmployeeId = new JLabel("Employee ID");
		lblEmployeeId.setBounds(27, 34, 67, 14);
		contentPane.add(lblEmployeeId);
		
		textField = new JTextField();
		textField.setBounds(119, 31, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setBounds(35, 70, 67, 14);
		contentPane.add(lblFirstName);
		
		textField_1 = new JTextField();
		textField_1.setBounds(119, 67, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setBounds(35, 108, 46, 14);
		contentPane.add(lblLastName);
		
		textField_2 = new JTextField();
		textField_2.setBounds(119, 105, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(35, 152, 46, 14);
		contentPane.add(lblEmail);
		
		textField_3 = new JTextField();
		textField_3.setBounds(119, 150, 86, 16);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		JButton btnSubmit = new JButton("Add Employee");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				EmployeeServiceImpl service = null;
				try {
					service = new EmployeeServiceImpl();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				service.createEmployee(new Employee(Integer.parseInt(textField.getText().toString()),textField_1.getText().toString(),
								textField_2.getText().toString(),textField_3.getText().toString()));
				
			}
			
		});
		btnSubmit.setBounds(34, 200, 124, 23);
		contentPane.add(btnSubmit);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
			}
		});
		btnReset.setBounds(185, 200, 89, 23);
		contentPane.add(btnReset);
		
		JButton btnViewData = new JButton("View Data");
		btnViewData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					new MyFrame3();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnViewData.setBounds(284, 200, 124, 23);
		contentPane.add(btnViewData);
		
		textField_4 = new JTextField();
		textField_4.setBounds(202, 169, 86, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnDeleteEmployee = new JButton("Delete Employee");
		btnDeleteEmployee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					EmployeeServiceImpl es=new EmployeeServiceImpl();
					es.deleteEmployee(Integer.parseInt(textField_4.getText().toString()));
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnDeleteEmployee.setBounds(284, 166, 124, 23);
		contentPane.add(btnDeleteEmployee);
		
		JButton btnUpdateEmployee = new JButton("Update Employee");
		btnUpdateEmployee.setBounds(284, 132, 124, 23);
		contentPane.add(btnUpdateEmployee);
		
		
	}
}
