import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JTabbedPane;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Dialog.ModalExclusionType;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.JScrollPane;

public class ArxikiSelida {

	private JFrame frmKe;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void NewScreen(){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ArxikiSelida window = new ArxikiSelida();
					window.frmKe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ArxikiSelida() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmKe = new JFrame();
		frmKe.setResizable(false);
		frmKe.setTitle("KE\u03A0");
		frmKe.getContentPane().setBackground(new Color(0, 139, 139));
		frmKe.setBounds(100, 100, 744, 427);
		frmKe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmKe.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("\u03A5\u03A0\u0397\u03A1\u0395\u03A3\u0399\u0395\u03A3");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				 Ipiresies nw = new Ipiresies();
				nw.NewScreen();
			}
		});
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(224, 112, 272, 53);
		frmKe.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\u039B\u039F\u0393\u0391\u03A1\u0399\u0391\u03A3\u039C\u039F\u03A3");
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setBounds(224, 178, 272, 53);
		frmKe.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("\u0395\u03A0\u0399\u039A\u039F\u0399\u039D\u03A9\u039D\u0399\u0391");
		btnNewButton_2.setBackground(Color.WHITE);
		btnNewButton_2.setBounds(224, 244, 272, 53);
		frmKe.getContentPane().add(btnNewButton_2);
		
		JPanel panel = new JPanel();
		panel.setBorder(null);
		panel.setBounds(224, 13, 272, 53);
		frmKe.getContentPane().add(panel);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(0, 0, 272, 53);
		panel.add(textField);
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Tahoma", Font.BOLD, 26));
		textField.setForeground(new Color(0, 0, 0));
		textField.setBackground(new Color(0, 128, 128));
		textField.setEditable(false);
		textField.setText("\u0391\u03A1\u03A7\u0399\u039A\u0397 \u03A3\u0395\u039B\u0399\u0394\u0391");
		textField.setColumns(10);
		
		JButton btnNewButton_3 = new JButton("\u0388\u03BE\u03BF\u03B4\u03BF\u03C2");
		btnNewButton_3.setBounds(639, 352, 89, 23);
		frmKe.getContentPane().add(btnNewButton_3);
	}
}
