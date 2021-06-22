import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ipiresies {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ipiresies window = new Ipiresies();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ipiresies() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 139, 139));
		frame.setBounds(100, 100, 744, 427);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBackground(new Color(0, 139, 139));
		textField.setFont(new Font("Tahoma", Font.BOLD, 26));
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setEditable(false);
		textField.setText("\u03A5\u03A0\u0397\u03A1\u0395\u03A3\u0399\u0395\u03A3");
		textField.setBounds(145, 9, 434, 31);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("\u03A7\u03BF\u03C1\u03AE\u03B3\u03B7\u03C3\u03B7 \u03B2\u03B5\u03B2\u03B1\u03AF\u03C9\u03C3\u03B7\u03C2 \u03BF\u03B9\u03BA\u03BF\u03B3\u03B5\u03BD\u03B9\u03B1\u03BA\u03AE\u03C2 \u03BA\u03B1\u03C4\u03AC\u03C3\u03C4\u03B1\u03C3\u03B7\u03C2");
		btnNewButton_1.setBounds(145, 280, 434, 69);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("\u03A7\u03BF\u03C1\u03AE\u03B3\u03B7\u03C3\u03B7 \u03B2\u03B5\u03B2\u03B1\u03AF\u03C9\u03C3\u03B7\u03C2 \u03BC\u03CC\u03BD\u03B9\u03BC\u03B7\u03C2 \u03BA\u03B1\u03C4\u03BF\u03B9\u03BA\u03AF\u03B1\u03C2");
		btnNewButton_2.setBounds(145, 200, 434, 69);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("\u03A7\u03BF\u03C1\u03AE\u03B3\u03B7\u03C3\u03B7 \u03B1\u03BD\u03C4\u03B9\u03B3\u03C1\u03AC\u03C6\u03BF\u03C5 \u03C0\u03B9\u03C3\u03C4\u03BF\u03C0\u03BF\u03B9\u03B7\u03C4\u03B9\u03BA\u03BF\u03CD \u03B3\u03AD\u03BD\u03BD\u03B7\u03C3\u03B7\u03C2");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_3.setBounds(145, 123, 434, 66);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_7 = new JButton("\u03A7\u03BF\u03C1\u03AE\u03B3\u03B7\u03C3\u03B7 \u03B1\u03BD\u03C4\u03B9\u03B3\u03C1\u03AC\u03C6\u03BF\u03C5 \u03BB\u03B7\u03BE\u03B9\u03B1\u03C1\u03C7\u03B9\u03BA\u03AE\u03C2 \u03C0\u03C1\u03AC\u03BE\u03B7\u03C2 \u03B8\u03B1\u03BD\u03AC\u03C4\u03BF\u03C5");
		btnNewButton_7.setBounds(145, 51, 434, 61);
		frame.getContentPane().add(btnNewButton_7);
		
		JButton btnNewButton = new JButton("\u0388\u03BE\u03BF\u03B4\u03BF\u03C2");
		btnNewButton.setBounds(629, 354, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}

}
