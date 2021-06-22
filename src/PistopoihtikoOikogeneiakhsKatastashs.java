import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Window.Type;
import javax.swing.LayoutStyle.ComponentPlacement;

public class PistopoihtikoOikogeneiakhsKatastashs {

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
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField txtGpapadakishotmailgr;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PistopoihtikoOikogeneiakhsKatastashs window = new PistopoihtikoOikogeneiakhsKatastashs();
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
	public PistopoihtikoOikogeneiakhsKatastashs() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setOpacity(10.0f);
		frame.setTitle("\u039A\u0395\u03A0");
		frame.setType(Type.UTILITY);
		frame.getContentPane().setBackground(new Color(135, 206, 235));
		frame.setBackground(new Color(135, 206, 235));
		frame.setBounds(100, 100, 954, 687);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBackground(new Color(135, 206, 235));
		textField.setFont(new Font("Tahoma", Font.BOLD, 24));
		textField.setEditable(false);
		textField.setText("\u03A0\u0399\u03A3\u03A4\u039F\u03A0\u039F\u0399\u0397\u03A4\u0399\u039A\u039F \u039F\u0399\u039A\u039F\u0393\u0395\u039D\u0395\u0399\u0391\u039A\u0397\u03A3 \u039A\u0391\u03A4\u0391\u03A3\u03A4\u0391\u03A3\u0397\u03A3");
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("\u03A3\u03A4\u039F\u0399\u03A7\u0395\u0399\u0391 \u0391\u0399\u03A4\u039F\u03A5\u039D\u03A4\u039F\u03A3");
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		
		JLabel lblNewLabel_1 = new JLabel("\u039F /\u0397 \u038C\u03BD\u03BF\u00B5\u03B1:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel lblNewLabel_2 = new JLabel("\u0395\u03C0\u03CE\u03BD\u03C5\u03BC\u03BF:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel label = new JLabel("\u038C\u03BD\u03BF\u00B5\u03B1 \u03A0\u03B1\u03C4\u03AD\u03C1\u03B1:");
		label.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel label_1 = new JLabel("\u038C\u03BD\u03BF\u03BC\u03B1 \u039C\u03B7\u03C4\u03AD\u03C1\u03B1\u03C2 :");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel lblNewLabel_3 = new JLabel("\u0395\u03C0\u03CE\u03BD\u03C5\u00B5\u03BF \u03A0\u03B1\u03C4\u03AD\u03C1\u03B1:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel label_2 = new JLabel("\u0395\u03C0\u03CE\u03BD\u03C5\u00B5\u03BF \u039C\u03B7\u03C4\u03AD\u03C1\u03B1\u03C2:");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel label_3 = new JLabel("\u0391\u03C1\u03B9\u03B8. \u2206\u03B5\u03BB\u03C4. \u03A4\u03B1\u03C5\u03C4\u03CC\u03C4\u03B7\u03C4\u03B1\u03C2:");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setEditable(false);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setEditable(false);
		textField_7.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("\u0391.\u03A6.\u039C :");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel label_4 = new JLabel("\u039F\u03A1\u0399\u03A3\u039C\u039F\u03A3/\u03A3\u03A4\u039F\u0399\u03A7\u0395\u0399\u0391 \u0395\u039A\u03A0\u03A1\u039F\u03A3\u03A9\u03A0\u039F\u03A5");
		label_4.setFont(new Font("Trebuchet MS", Font.ITALIC, 18));
		
		textField_8 = new JTextField();
		textField_8.setEditable(false);
		textField_8.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("\u0391\u03C1\u03B9\u03B8\u00B5\u03CC\u03C2 \u2206\u03B7\u00B5\u03BF\u03C4\u03BF\u03BB\u03BF\u03B3\u03AF\u03BF\u03C5 :");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		textField_9 = new JTextField();
		textField_9.setEditable(false);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setEditable(false);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setEditable(false);
		textField_11.setColumns(10);
		
		textField_12 = new JTextField();
		textField_12.setEditable(false);
		textField_12.setColumns(10);
		
		JLabel label_5 = new JLabel("\u0397\u00B5\u03B5\u03C1\u03BF\u00B5\u03B7\u03BD\u03AF\u03B1 \u03B3\u03AD\u03BD\u03BD\u03B7\u03C3\u03B7\u03C2:");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel label_6 = new JLabel("\u03A4\u03CC\u03C0\u03BF\u03C2 \u0393\u03AD\u03BD\u03BD\u03B7\u03C3\u03B7\u03C2:");
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel label_7 = new JLabel("\u03A4\u03CC\u03C0\u03BF\u03C2 \u039A\u03B1\u03C4\u03BF\u03B9\u03BA\u03AF\u03B1\u03C2:");
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel label_8 = new JLabel("\u039F\u03B4\u03CC\u03C2 :");
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel label_9 = new JLabel("\u0391\u03C1\u03B9\u03B8\u03BC\u03CC\u03C2 :");
		label_9.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		textField_13 = new JTextField();
		textField_13.setEditable(false);
		textField_13.setColumns(10);
		
		textField_14 = new JTextField();
		textField_14.setEditable(false);
		textField_14.setColumns(10);
		
		JLabel label_10 = new JLabel("\u03A4.\u039A. :");
		label_10.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel label_11 = new JLabel("\u03A4\u03B7\u03BB\u03AD\u03C6\u03C9\u03BD\u03BF :");
		label_11.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel lblEmail = new JLabel("E-mail :");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		textField_15 = new JTextField();
		textField_15.setEditable(false);
		textField_15.setColumns(10);
		
		textField_16 = new JTextField();
		textField_16.setEditable(false);
		textField_16.setColumns(10);
		
		textField_17 = new JTextField();
		textField_17.setEditable(false);
		textField_17.setColumns(10);
		
		JLabel lblE = new JLabel("E\u03A0\u03A9\u039D\u03A5\u039C\u039F :");
		lblE.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel lblOnoma = new JLabel("ONOMA :");
		lblOnoma.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel label_14 = new JLabel("\u039F\u039D\u039F\u039C\u0391\u03A4\u0395\u03A0\u03A9\u039D\u03A5\u039C\u039F \u03A0\u0391\u03A4\u0395\u03A1\u0391 :");
		label_14.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		textField_18 = new JTextField();
		textField_18.setText("\u0393\u0399\u03A9\u03A1\u0393\u039F\u03A3");
		textField_18.setEditable(false);
		textField_18.setColumns(10);
		
		textField_19 = new JTextField();
		textField_19.setText("\u03A0\u0391\u03A0\u0391\u0394\u0391\u039A\u0397\u03A3");
		textField_19.setEditable(false);
		textField_19.setColumns(10);
		
		textField_20 = new JTextField();
		textField_20.setText("\u039C\u0399\u03A7\u0391\u039B\u0397\u03A3 \u03A0\u0391\u03A0\u0391\u0394\u0391\u039A\u0397\u03A3");
		textField_20.setEditable(false);
		textField_20.setColumns(10);
		
		JLabel label_12 = new JLabel("\u039F\u0394\u039F\u03A3 :");
		label_12.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		textField_21 = new JTextField();
		textField_21.setText("\u0391\u0398\u0397\u039D\u03A9\u039D");
		textField_21.setEditable(false);
		textField_21.setColumns(10);
		
		JLabel label_13 = new JLabel("\u0391\u03A1\u0399\u0398\u039C\u039F\u03A3 :");
		label_13.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel label_15 = new JLabel("\u03A4.\u039A. :");
		label_15.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel label_16 = new JLabel(" \u03A4\u0397\u039B\u0395\u03A6\u03A9\u039D\u039F :");
		label_16.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		textField_22 = new JTextField();
		textField_22.setText("92");
		textField_22.setEditable(false);
		textField_22.setColumns(10);
		
		textField_23 = new JTextField();
		textField_23.setText("35100");
		textField_23.setEditable(false);
		textField_23.setColumns(10);
		
		textField_24 = new JTextField();
		textField_24.setText("6989898425");
		textField_24.setEditable(false);
		textField_24.setColumns(10);
		
		JLabel label_17 = new JLabel("E-mail :");
		label_17.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		txtGpapadakishotmailgr = new JTextField();
		txtGpapadakishotmailgr.setText("g.papadakis@hotmail.gr");
		txtGpapadakishotmailgr.setEditable(false);
		txtGpapadakishotmailgr.setColumns(10);
		
		btnNewButton = new JButton("\u0388\u03BE\u03BF\u03B4\u03BF\u03C2");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose(); //KLEINEI TO PARATHYRO META TO BUTTON CLICK
				Exodos kt= new Exodos(); //POIA SELIDA THA ANOIKSEI META TO CLICK
				kt.NewScreen(); //ANOIGEI KAINOURGIO SCREEN
				kt.setVisible(true);	
			}
		});
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(10)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 208, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(10)
					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
					.addGap(64)
					.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 203, GroupLayout.PREFERRED_SIZE)
					.addGap(20)
					.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 301, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(10)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(2)
							.addComponent(label, GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE)))
					.addGap(28)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 203, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(14)
							.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 189, GroupLayout.PREFERRED_SIZE)))
					.addGap(20)
					.addComponent(lblOnoma, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
					.addGap(131)
					.addComponent(textField_18, GroupLayout.PREFERRED_SIZE, 286, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(10)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 166, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 183, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 183, GroupLayout.PREFERRED_SIZE))
					.addGap(12)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 189, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, 189, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, 189, GroupLayout.PREFERRED_SIZE))
					.addGap(17)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(3)
							.addComponent(lblE, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
							.addGap(64)
							.addComponent(textField_19, GroupLayout.PREFERRED_SIZE, 287, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(label_14)
							.addGap(12)
							.addComponent(textField_20, GroupLayout.PREFERRED_SIZE, 242, GroupLayout.PREFERRED_SIZE))))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(10)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 208, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(195)
							.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, 189, GroupLayout.PREFERRED_SIZE)))
					.addGap(20)
					.addComponent(label_12, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
					.addGap(130)
					.addComponent(textField_21, GroupLayout.PREFERRED_SIZE, 286, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(10)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE)
							.addGap(17)
							.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, 234, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblNewLabel_5, GroupLayout.PREFERRED_SIZE, 197, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(195)
							.addComponent(textField_9, GroupLayout.PREFERRED_SIZE, 189, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(label_5, GroupLayout.PREFERRED_SIZE, 183, GroupLayout.PREFERRED_SIZE)
							.addGap(12)
							.addComponent(textField_10, GroupLayout.PREFERRED_SIZE, 189, GroupLayout.PREFERRED_SIZE))
						.addComponent(label_6, GroupLayout.PREFERRED_SIZE, 166, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(150)
							.addComponent(textField_11, GroupLayout.PREFERRED_SIZE, 234, GroupLayout.PREFERRED_SIZE))
						.addComponent(label_8, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(150)
							.addComponent(textField_12, GroupLayout.PREFERRED_SIZE, 234, GroupLayout.PREFERRED_SIZE))
						.addComponent(label_7, GroupLayout.PREFERRED_SIZE, 166, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(150)
							.addComponent(textField_13, GroupLayout.PREFERRED_SIZE, 234, GroupLayout.PREFERRED_SIZE)))
					.addGap(13)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(7)
							.addComponent(label_13, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(7)
							.addComponent(label_15, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE))
						.addComponent(label_16, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(7)
							.addComponent(label_17, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)))
					.addGap(87)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(textField_22, GroupLayout.PREFERRED_SIZE, 287, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_23, GroupLayout.PREFERRED_SIZE, 287, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_24, GroupLayout.PREFERRED_SIZE, 287, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtGpapadakishotmailgr, GroupLayout.PREFERRED_SIZE, 287, GroupLayout.PREFERRED_SIZE)))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(10)
					.addComponent(label_9, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
					.addGap(33)
					.addComponent(textField_14, GroupLayout.PREFERRED_SIZE, 234, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(10)
					.addComponent(label_10, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
					.addGap(57)
					.addComponent(textField_15, GroupLayout.PREFERRED_SIZE, 233, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(10)
					.addComponent(label_11, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
					.addGap(39)
					.addComponent(textField_16, GroupLayout.PREFERRED_SIZE, 234, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(10)
					.addComponent(lblEmail, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
					.addGap(56)
					.addComponent(textField_17, GroupLayout.PREFERRED_SIZE, 234, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(799)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE))
				.addComponent(textField, GroupLayout.DEFAULT_SIZE, 936, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
					.addGap(7)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(8)
							.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(9)
							.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
						.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))
					.addGap(11)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
							.addGap(8)
							.addComponent(label, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(2)
							.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
							.addGap(5)
							.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(6)
							.addComponent(lblOnoma, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(4)
							.addComponent(textField_18, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)))
					.addGap(1)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblNewLabel_3)
							.addGap(2)
							.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
							.addComponent(label_2))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(2)
							.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(5)
							.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(4)
							.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(8)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(2)
									.addComponent(lblE, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))
								.addComponent(textField_19, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
							.addGap(13)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(2)
									.addComponent(label_14, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))
								.addComponent(textField_20, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))))
					.addGap(5)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(label_3)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(2)
							.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(label_12)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(1)
							.addComponent(textField_21, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)))
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(1)
									.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))
								.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(6)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_5)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(1)
									.addComponent(textField_9, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)))
							.addGap(1)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(label_5)
								.addComponent(textField_10, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
							.addGap(4)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(label_6)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(2)
									.addComponent(textField_11, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(56)
									.addComponent(label_8))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(33)
									.addComponent(textField_12, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(30)
									.addComponent(label_7))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(58)
									.addComponent(textField_13, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(10)
							.addComponent(label_13)
							.addGap(13)
							.addComponent(label_15)
							.addGap(20)
							.addComponent(label_16)
							.addGap(7)
							.addComponent(label_17))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(11)
							.addComponent(textField_22, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(textField_23, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(textField_24, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(txtGpapadakishotmailgr, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)))
					.addGap(3)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(label_9)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(2)
							.addComponent(textField_14, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(1)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(label_10)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(1)
							.addComponent(textField_15, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)))
					.addGap(2)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(1)
							.addComponent(label_11))
						.addComponent(textField_16, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
					.addGap(1)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblEmail)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(2)
							.addComponent(textField_17, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(59)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
		);
		frame.getContentPane().setLayout(groupLayout);



		try {



            Class.forName("com.mysql.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ergasiadb", "root", "");

            PreparedStatement st = con.prepareStatement("select * from userpass where iduserpass=1;");



            ResultSet rs = st.executeQuery();
            while (rs.next()) {

                String s1 = rs.getString(4);

                String s2 = rs.getString(5);

                String s3 = rs.getString(6);

                String s4 = rs.getString(10);

                String s5 = rs.getString(7);

                String s6 = rs.getString(11);

                String s7 = rs.getString(25);

                String s8 = rs.getString(26);

                String s9 = rs.getString(27);

                String s10 = rs.getString(12);
                
                String s11 = rs.getString(13);
                
                String s12 = rs.getString(30);

                String s13 = rs.getString(8);
                
                String s14 = rs.getString(31);
                
                String s15 = rs.getString(9);
                
                String s16 = rs.getString(28);
                
                String s17 = rs.getString(29);
                
              

                textField_1.setText(s1);

                textField_2.setText(s2);

                textField_3.setText(s3);

                textField_4.setText(s4);

                textField_5.setText(s5);

                textField_6.setText(s6);

                textField_7.setText(s7);

                textField_8.setText(s8);

                textField_9.setText(s9);

                textField_10.setText(s10);

                textField_11.setText(s11);

                textField_12.setText(s12);

                textField_13.setText(s13);

                textField_14.setText(s14);

                textField_15.setText(s15);

                textField_16.setText(s16);

                textField_17.setText(s17);

              
            }

        } //Create Exception Handler

        catch (Exception ex) {

            System.out.println(ex);

        }

	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}

}
