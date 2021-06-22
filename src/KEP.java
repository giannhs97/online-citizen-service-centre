import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Dialog.ModalExclusionType;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;

public class KEP {

	private JFrame frmK;
	private JTextField txtLogin;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KEP window = new KEP();
					window.frmK.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public KEP() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmK = new JFrame();
		frmK.setTitle("K\u0395\u03A0");
		frmK.setBounds(100, 100, 784, 436);
		frmK.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmK.getContentPane().setLayout(null);
		
		txtLogin = new JTextField();
		txtLogin.setBounds(0, 0, 766, 38);
		txtLogin.setFont(new Font("Tahoma", Font.BOLD, 26));
		txtLogin.setHorizontalAlignment(SwingConstants.CENTER);
		txtLogin.setEditable(false);
		txtLogin.setText("LOGIN");
		frmK.getContentPane().add(txtLogin);
		txtLogin.setColumns(10);
		
		JLabel lblUsername = new JLabel("Username :");
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblUsername.setBounds(182, 139, 168, 16);
		frmK.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password :");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPassword.setBounds(182, 215, 109, 16);
		frmK.getContentPane().add(lblPassword);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField.setBounds(345, 138, 199, 22);
		frmK.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_1.setBounds(345, 214, 199, 22);
		frmK.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//gia na paei apo KEP sthn ArxikhSelida
				
				ArxikiSelida nw=new ArxikiSelida();
				nw.NewScreen();
			
			}

		
		});
		btnNewButton.setBounds(447, 317, 97, 25);
		frmK.getContentPane().add(btnNewButton);
	}

}
