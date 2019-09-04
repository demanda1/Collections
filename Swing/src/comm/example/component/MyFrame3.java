package comm.example.component;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.proteanit.sql.DbUtils;

import javax.swing.JScrollPane;
import javax.swing.JTable;

public class MyFrame3 extends JFrame {
	private JTable table;
	private RS2XMLConfig config=null;
	
	public MyFrame3() throws SQLException {
		config=new RS2XMLConfig();
		getContentPane().setLayout(null);
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 434, 261);
		getContentPane().add(scrollPane);
		
		table = new JTable();
		ResultSet rs=config.getAllEmployees();
		table.setModel(DbUtils.resultSetToTableModel(rs));
		scrollPane.setViewportView(table);
		this.setVisible(true);
	}


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyFrame3 frame = new MyFrame3();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	

}
