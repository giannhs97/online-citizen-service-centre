import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;

public class PistGennisis {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PistGennisis window = new PistGennisis();
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
	public PistGennisis() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 712, 444);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u03A0\u03B9\u03C3\u03C4\u03BF\u03C0\u03BF\u03B9\u03B7\u03C4\u03AF\u03BA\u03BF \u0393\u03AD\u03BD\u03BD\u03B7\u03C3\u03B7\u03C2");
		lblNewLabel.setBackground(new Color(0, 128, 128));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 0, 676, 25);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u0395\u03C0\u03CE\u03BD\u03C5\u03BC\u03BF");
		lblNewLabel_1.setBounds(10, 36, 150, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\u038C\u03BD\u03BF\u03BC\u03B1");
		lblNewLabel_2.setBounds(10, 61, 150, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(407, 33, 267, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setBounds(407, 58, 267, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("\u03A6\u03CD\u03BB\u03BF");
		lblNewLabel_3.setBounds(10, 86, 150, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("\u038C\u03BD\u03BF\u03BC\u03B1 \u03BA\u03B1\u03B9 \u0395\u03C0\u03CE\u03BD\u03C5\u03BC\u03BF \u03C0\u03B1\u03C4\u03AD\u03C1\u03B1");
		lblNewLabel_4.setBounds(10, 111, 175, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("\u038C\u03BD\u03BF\u03BC\u03B1 \u03BA\u03B1\u03B9 \u0395\u03C0\u03CE\u03BD\u03C5\u03BC\u03BF \u03BC\u03B7\u03C4\u03AD\u03C1\u03B1\u03C2");
		lblNewLabel_5.setBounds(10, 136, 175, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("\u0393\u03AD\u03BD\u03BF\u03C2 \u03BC\u03B7\u03C4\u03AD\u03C1\u03B1\u03C2");
		lblNewLabel_6.setBounds(10, 161, 150, 14);
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("\u0397\u03BC\u03B5\u03C1\u03BF\u03BC\u03B7\u03BD\u03AF\u03B1 \u03B3\u03AD\u03BD\u03BD\u03B7\u03C3\u03B7\u03C2");
		lblNewLabel_7.setBounds(10, 186, 150, 14);
		frame.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("\u0394\u03AE\u03BC\u03BF\u03C2 \u03B3\u03AD\u03BD\u03BD\u03B7\u03C3\u03B7\u03C2");
		lblNewLabel_8.setBounds(10, 211, 150, 14);
		frame.getContentPane().add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("\u03A0\u03CC\u03BB\u03B7 \u03B3\u03AD\u03BD\u03BD\u03B7\u03C3\u03B7\u03C2");
		lblNewLabel_9.setBounds(10, 236, 150, 14);
		frame.getContentPane().add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("\u039D\u03BF\u03BC\u03CC\u03C2 \u03B3\u03AD\u03BD\u03BD\u03B7\u03C3\u03B7\u03C2");
		lblNewLabel_10.setBounds(10, 261, 150, 14);
		frame.getContentPane().add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("\u03A7\u03CE\u03C1\u03B1 \u03B3\u03AD\u03BD\u03BD\u03B7\u03C3\u03B7\u03C2");
		lblNewLabel_11.setBounds(10, 286, 150, 14);
		frame.getContentPane().add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("\u0399\u03B8\u03B1\u03B3\u03AD\u03BD\u03B5\u03B9\u03B1");
		lblNewLabel_12.setBounds(10, 311, 150, 14);
		frame.getContentPane().add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("\u03A0\u03B1\u03C1\u03B1\u03C4\u03B7\u03C1\u03AE\u03C3\u03B5\u03B9\u03C2:");
		lblNewLabel_13.setBounds(10, 352, 150, 14);
		frame.getContentPane().add(lblNewLabel_13);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setBounds(407, 83, 267, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setBounds(407, 108, 267, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setBounds(407, 133, 267, 20);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setBounds(407, 158, 267, 20);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setEditable(false);
		textField_6.setBounds(407, 183, 267, 20);
		frame.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setEditable(false);
		textField_7.setBounds(407, 208, 267, 20);
		frame.getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setEditable(false);
		textField_8.setBounds(407, 233, 267, 20);
		frame.getContentPane().add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setEditable(false);
		textField_9.setBounds(407, 258, 267, 20);
		frame.getContentPane().add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setEditable(false);
		textField_10.setBounds(407, 283, 267, 20);
		frame.getContentPane().add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setEditable(false);
		textField_11.setBounds(407, 308, 267, 20);
		frame.getContentPane().add(textField_11);
		textField_11.setColumns(10);
		
		textField_12 = new JTextField();
		textField_12.setEditable(false);
		textField_12.setBounds(10, 374, 598, 20);
		frame.getContentPane().add(textField_12);
		textField_12.setColumns(10);
		
		btnNewButton = new JButton("\u0388\u03BE\u03BF\u03B4\u03BF\u03C2");
		btnNewButton.setBounds(597, 348, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
