import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Window.Type;
import javax.swing.ImageIcon;

public class LhksiarxikhPrakshThanatou {

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
	private JButton btnNewButton;
	private JButton button;

	/**
	 * Launch the application.
	 */
	public static void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LhksiarxikhPrakshThanatou window = new LhksiarxikhPrakshThanatou();
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
	public LhksiarxikhPrakshThanatou() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("\u039A\u0395\u03A0");
		frame.setType(Type.UTILITY);
		frame.getContentPane().setBackground(new Color(135, 206, 235));
		frame.setBounds(100, 100, 954, 704);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBackground(new Color(135, 206, 235));
		textField.setFont(new Font("Tahoma", Font.BOLD, 24));
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setText("\u03A0\u03A1\u0391\u039E\u0397 \u0398\u0391\u039D\u0391\u03A4\u039F\u03A5");
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("\u0395\u03C0\u03CE\u03BD\u03C5\u03BC\u03BF");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblNewLabel_1 = new JLabel("\u038C\u03BD\u03BF\u03BC\u03B1");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblNewLabel_2 = new JLabel("\u038C\u03BD\u03BF\u03BC\u03B1 \u03C0\u03B1\u03C4\u03AD\u03C1\u03B1");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblNewLabel_3 = new JLabel("\u0395\u03C0\u03CE\u03BD\u03C5\u03BC\u03BF \u03C0\u03B1\u03C4\u03AD\u03C1\u03B1");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblNewLabel_4 = new JLabel("\u038C\u03BD\u03BF\u03BC\u03B1 \u03BC\u03B7\u03C4\u03AD\u03C1\u03B1\u03C2");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblNewLabel_5 = new JLabel("\u0395\u03C0\u03CE\u03BD\u03C5\u03BC\u03BF \u03BC\u03B7\u03C4\u03AD\u03C1\u03B1\u03C2");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblNewLabel_6 = new JLabel("\u0397\u03BC\u03B5\u03C1\u03BF\u03BC\u03B7\u03BD\u03AF\u03B1 \u03B3\u03AD\u03BD\u03BD\u03B7\u03C3\u03B7\u03C2");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblNewLabel_7 = new JLabel("\u03A4\u03CC\u03C0\u03BF\u03C2 \u03B3\u03AD\u03BD\u03BD\u03B7\u03C3\u03B5\u03C9\u03C2");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblNewLabel_8 = new JLabel("\u0394\u03B7\u03BC\u03CC\u03C4\u03B7\u03C2");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblNewLabel_9 = new JLabel("\u03A4\u03CC\u03C0\u03BF\u03C2 \u03B8\u03B1\u03BD\u03AC\u03C4\u03BF\u03C5");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblNewLabel_10 = new JLabel("\u0391\u03BD\u03B1\u03C6\u03B5\u03C1\u03CC\u03BC\u03B5\u03BD\u03B7 \u03B7\u03BC\u03B5\u03C1\u03BF\u03BC\u03B7\u03BD\u03AF\u03B1 \u03B8\u03B1\u03BD\u03AC\u03C4\u03BF\u03C5");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblNewLabel_11 = new JLabel("\u0391\u03BD\u03B1\u03C6\u03B5\u03C1\u03CC\u03BC\u03B5\u03BD\u03B7 \u03CE\u03C1\u03B1 \u03B8\u03B1\u03BD\u03AC\u03C4\u03BF\u03C5");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblNewLabel_12 = new JLabel("\u0391\u03B9\u03C4\u03AF\u03B1 \u03B8\u03B1\u03BD\u03AC\u03C4\u03BF\u03C5");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
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
		
		textField_8 = new JTextField();
		textField_8.setEditable(false);
		textField_8.setColumns(10);
		
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
		
		textField_13 = new JTextField();
		textField_13.setEditable(false);
		textField_13.setColumns(10);
		
		btnNewButton = new JButton("\u0388\u03BE\u03BF\u03B4\u03BF\u03C2");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose(); //KLEINEI TO PARATHYRO META TO BUTTON CLICK
				Exodos kl= new Exodos(); //POIA SELIDA THA ANOIKSEI META TO CLICK
				kl.NewScreen(); //ANOIGEI KAINOURGIO SCREEN
				kl.setVisible(true);	
			}
		});
		
		button = new JButton("\u0395\u03BA\u03C4\u03CD\u03C0\u03C9\u03C3\u03B7");
		button.setIcon(new ImageIcon(LhksiarxikhPrakshThanatou.class.getResource("/com/sun/java/swing/plaf/windows/icons/Computer.gif")));
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(textField, GroupLayout.DEFAULT_SIZE, 936, Short.MAX_VALUE)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(102)
					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 163, GroupLayout.PREFERRED_SIZE)
					.addGap(342)
					.addComponent(textField_1, GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
					.addGap(83))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(102)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 183, GroupLayout.PREFERRED_SIZE)
					.addGap(322)
					.addComponent(textField_2, GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
					.addGap(83))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(102)
					.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 183, GroupLayout.PREFERRED_SIZE)
					.addGap(322)
					.addComponent(textField_3, GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
					.addGap(83))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(102)
					.addComponent(lblNewLabel_7, GroupLayout.PREFERRED_SIZE, 183, GroupLayout.PREFERRED_SIZE)
					.addGap(322)
					.addComponent(textField_8, GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
					.addGap(83))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(102)
					.addComponent(lblNewLabel_8, GroupLayout.PREFERRED_SIZE, 183, GroupLayout.PREFERRED_SIZE)
					.addGap(322)
					.addComponent(textField_9, GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
					.addGap(83))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(102)
					.addComponent(lblNewLabel_9, GroupLayout.PREFERRED_SIZE, 183, GroupLayout.PREFERRED_SIZE)
					.addGap(322)
					.addComponent(textField_10, GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
					.addGap(83))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(102)
					.addComponent(lblNewLabel_10, GroupLayout.PREFERRED_SIZE, 335, GroupLayout.PREFERRED_SIZE)
					.addGap(170)
					.addComponent(textField_11, GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
					.addGap(82))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(102)
					.addComponent(lblNewLabel_11, GroupLayout.PREFERRED_SIZE, 269, GroupLayout.PREFERRED_SIZE)
					.addGap(236)
					.addComponent(textField_12, GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
					.addGap(82))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(104)
					.addComponent(lblNewLabel_12, GroupLayout.PREFERRED_SIZE, 230, GroupLayout.PREFERRED_SIZE)
					.addGap(273)
					.addComponent(textField_13, GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
					.addGap(81))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(22)
					.addComponent(button, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
					.addGap(687)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(102)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblNewLabel_5, GroupLayout.PREFERRED_SIZE, 183, GroupLayout.PREFERRED_SIZE)
							.addGap(322)
							.addComponent(textField_6, GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblNewLabel_6, GroupLayout.PREFERRED_SIZE, 204, GroupLayout.PREFERRED_SIZE)
							.addGap(301)
							.addComponent(textField_7, GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)))
					.addGap(83))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(102)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 183, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 183, GroupLayout.PREFERRED_SIZE))
					.addGap(322)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(textField_5, GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
						.addComponent(textField_4, GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE))
					.addGap(83))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
					.addGap(20)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(11)
							.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
					.addGap(6)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(7)
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
					.addGap(5)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(8)
							.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
					.addGap(3)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(8)
							.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
						.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(18)
							.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)))
					.addGap(12)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_5, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
					.addGap(11)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(2)
							.addComponent(lblNewLabel_6, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
						.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
					.addGap(3)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(8)
							.addComponent(lblNewLabel_7, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
						.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
					.addGap(5)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(8)
							.addComponent(lblNewLabel_8, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
						.addComponent(textField_9, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
					.addGap(5)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(14)
							.addComponent(lblNewLabel_9, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
						.addComponent(textField_10, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
					.addGap(9)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(7)
							.addComponent(lblNewLabel_10))
						.addComponent(textField_11, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
					.addGap(4)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(9)
							.addComponent(lblNewLabel_11, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
						.addComponent(textField_12, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
					.addGap(8)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(10)
							.addComponent(lblNewLabel_12, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
						.addComponent(textField_13, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
					.addGap(97)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(button, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
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

                String s7 = rs.getString(12);

                String s8 = rs.getString(13);

                String s9 = rs.getString(14);

                String s10 = rs.getString(15);
                
                String s11 = rs.getString(16);
                
                String s12 = rs.getString(17);
                
                String s13 = rs.getString(18);


                textField.setText(s1);

                textField_1.setText(s2);

                textField_2.setText(s3);

                textField_3.setText(s4);

                textField_4.setText(s5);

                textField_5.setText(s6);

                textField_6.setText(s7);

                textField_7.setText(s8);

                textField_8.setText(s9);

                textField_9.setText(s10);
                
                textField_9.setText(s11);
                
                textField_9.setText(s12);
                
                textField_9.setText(s13);

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
