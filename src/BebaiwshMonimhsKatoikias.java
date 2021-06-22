import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.CardLayout;
import javax.swing.SpringLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import net.miginfocom.swing.MigLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import com.jgoodies.forms.factories.FormFactory;
import java.awt.Insets;
import javax.swing.JCheckBox;
import java.awt.Color;
import javax.swing.JButton;

public class BebaiwshMonimhsKatoikias {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_6;
	private JLabel label;
	private JLabel label_1;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JTextField textField_1;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JTextField textField_3;
	private JLabel label_2;
	private JLabel label_3;
	private JTextField textField_4;
	private JLabel label_4;
	private JLabel label_5;
	private JLabel label_6;
	private JLabel lblNewLabel_5;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BebaiwshMonimhsKatoikias window = new BebaiwshMonimhsKatoikias();
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
	public BebaiwshMonimhsKatoikias() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(135, 206, 235));
		frame.setBounds(100, 100, 915, 462);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBounds(83, 118, 100, 22);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setBounds(258, 118, 78, 22);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBackground(new Color(135, 206, 235));
		textField_6.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_6.setEditable(false);
		textField_6.setHorizontalAlignment(SwingConstants.CENTER);
		textField_6.setText("\u0392\u0395\u0392\u0391\u0399\u03A9\u03A3\u0397 \u039C\u039F\u039D\u0399\u039C\u0397\u03A3 \u039A\u0391\u03A4\u039F\u0399\u039A\u0399\u0391\u03A3");
		textField_6.setBounds(0, 0, 898, 22);
		frame.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		label = new JLabel("\u039F/\u0397");
		label.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label.setBounds(28, 120, 56, 16);
		frame.getContentPane().add(label);
		
		label_1 = new JLabel("\u039F \u0394\u03AE\u03BC\u03B1\u03C1\u03C7\u03BF\u03C2 \u039B\u03B1\u03BC\u03B9\u03AD\u03C9\u03BD \u03A6\u03B8\u03B9\u03CE\u03C4\u03B9\u03B4\u03B1\u03C2");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_1.setBounds(28, 35, 220, 16);
		frame.getContentPane().add(label_1);
		
		lblNewLabel = new JLabel("\u0392\u03B5\u03B2\u03B1\u03B9\u03CE\u03BD\u03B5\u03B9 \u03CC\u03C4\u03B9 :");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(28, 63, 204, 16);
		frame.getContentPane().add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("\u03C4\u03BF\u03C5");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(205, 120, 56, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("\u03BA\u03B1\u03B9 \u03C4\u03B7\u03C2");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(360, 120, 56, 16);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setBounds(411, 118, 116, 22);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		lblNewLabel_3 = new JLabel("\u03B5\u03AF\u03BD\u03B1\u03B9 \u03BC\u03CC\u03BD\u03B9\u03BC\u03BF\u03C2/\u03B7 \u03BA\u03AC\u03C4\u03BF\u03B9\u03BA\u03BF\u03C2 \u03C4\u03B7\u03C2 \u0394\u03B7\u03BC\u03BF\u03C4\u03B9\u03BA\u03AE\u03C2 \u0395\u03BD\u03CC\u03C4\u03B7\u03C4\u03B1\u03C2");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(538, 120, 324, 16);
		frame.getContentPane().add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("\u039B\u03B1\u03BC\u03AF\u03B1\u03C2 \u03C4\u03BF\u03C5 \u0394\u03AE\u03BC\u03BF\u03C5 \u039B\u03B1\u03BC\u03B9\u03AD\u03C9\u03BD \u03A6\u03B8\u03B9\u03CE\u03C4\u03B9\u03B4\u03B1\u03C2 \u03BA\u03B1\u03B9 \u03B4\u03B9\u03B1\u03BC\u03AD\u03BD\u03B5\u03B9 \u03B5\u03C0\u03AF \u03C4\u03B7\u03C2 \u03BF\u03B4\u03BF\u03CD");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(28, 151, 421, 16);
		frame.getContentPane().add(lblNewLabel_4);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setBounds(456, 149, 116, 22);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		label_2 = new JLabel(",");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_2.setBounds(583, 151, 56, 16);
		frame.getContentPane().add(label_2);
		
		label_3 = new JLabel("\u03A4.\u039A.");
		label_3.setBounds(604, 152, 56, 16);
		frame.getContentPane().add(label_3);
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setBounds(639, 149, 78, 22);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		label_4 = new JLabel(".");
		label_4.setBounds(729, 152, 56, 16);
		frame.getContentPane().add(label_4);
		
		label_5 = new JLabel("\u0395\u03BA\u03B4\u03AF\u03B4\u03B5\u03C4\u03B1\u03B9 \u03B7 \u03C0\u03B1\u03C1\u03BF\u03CD\u03C3\u03B1 \u03BC\u03B5\u03C4\u03AC \u03B1\u03C0\u03CC \u03B1\u03AF\u03C4\u03B7\u03C3\u03B7 \u03C4\u03BF\u03C5/\u03B7\u03C2 \u03B5\u03BD\u03B4\u03B9\u03B1\u03C6\u03B5\u03C1\u03CC\u03BC\u03B5\u03BD\u03BF\u03C5/\u03B7\u03C2 \u03B3\u03B9\u03B1 \u03BD\u03B1 \u03C4\u03B7 \u03C7\u03C1\u03B7\u03C3\u03B9\u03BC\u03B5\u03CD\u03C3\u03B5\u03B9 \u03C3\u03B5 \u03BA\u03AC\u03B8\u03B5 \u03BD\u03CC\u03BC\u03B9\u03BC\u03B7 \u03C7\u03C1\u03AE\u03C3\u03B7.");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_5.setBounds(28, 180, 834, 16);
		frame.getContentPane().add(label_5);
		
		label_6 = new JLabel("\u039C\u03B5 \u03B5\u03BD\u03C4\u03BF\u03BB\u03AE \u0394\u03B7\u03BC\u03AC\u03C1\u03C7\u03BF\u03C5");
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_6.setBounds(389, 282, 190, 16);
		frame.getContentPane().add(label_6);
		
		lblNewLabel_5 = new JLabel("\u039F/\u0397 \u03C5\u03C0\u03AC\u03BB\u03BB\u03B7\u03BB\u03BF\u03C2 \u03C4\u03BF\u03C5 \u0394\u03B7\u03BC\u03BF\u03C4\u03BF\u03BB\u03BF\u03B3\u03AF\u03BF\u03C5 ");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_5.setBounds(340, 311, 282, 16);
		frame.getContentPane().add(lblNewLabel_5);
		
		btnNewButton = new JButton("\u0388\u03BE\u03BF\u03B4\u03BF\u03C2");
		btnNewButton.setBounds(800, 389, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
