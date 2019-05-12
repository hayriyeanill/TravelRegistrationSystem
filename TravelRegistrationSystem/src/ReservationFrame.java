import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.basic.BasicBorders.RadioButtonBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class ReservationFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtFullname;
	private JTextField txtIDNumber;
	private JTextField txtEMail;
	private JTextField txtPhoneNumber;
	private JTextField txtCreditCardInfo;
	private JTextField txtTravel = new JTextField();


	//It is for implement tree. Tree keeps customer infos.
	private static NaryTreeNode root = new NaryTreeNode("Customer", 10);



	/**
	 * Create the frame.
	 */
	public ReservationFrame() {

		//Add childs for the tree. 
		root.addChild("London");
		root.addChild("Roma");
		root.addChild("Spain");
		root.addChild("Berlin");
		root.addChild("Amsterdam");
		root.addChild("Budapest");
		root.addChild("Prague");
		root.addChild("Polland");
		root.addChild("Cappadocia");
		root.addChild("Pamukkale");
		
		initialiseComponents();


		JButton btnAdd = new JButton("Register");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {



				String exp = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
						+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

				//Get input customers infos.
				Customer c = new Customer(txtFullname.getText(),
						Integer.parseInt(txtIDNumber.getText()),
						txtEMail.getText(),
						Integer.parseInt(txtPhoneNumber.getText()),
						Integer.parseInt(txtCreditCardInfo.getText()));



				//It is for add child includes customer infos to right parent.
				for(int i=0; i<10; i++) {

					if(txtTravel.getText().equals(root.getChild(i).toString())) {
						root.getChild(i).addChild(c.toString());
						break;
					}else {
						continue;
					}	
				}
				//It is for see the tree.
				NaryTreeNode.print(root);
				
				txtFullname.setText("");
				txtCreditCardInfo.setText("");
				txtEMail.setText("");
				txtIDNumber.setText("");
				txtPhoneNumber.setText("");

			}
		});
		
		btnAdd.setBounds(159, 190, 116, 25);
		contentPane.add(btnAdd);




	}

	public void initialiseComponents(){
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 301, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNameAndSurname = new JLabel("Name and Surname: ");
		lblNameAndSurname.setBounds(12, 13, 135, 16);
		contentPane.add(lblNameAndSurname);

		JLabel lblIdNumber = new JLabel("ID Number: ");
		lblIdNumber.setBounds(12, 42, 116, 16);
		contentPane.add(lblIdNumber);

		JLabel lblEmail = new JLabel("E-Mail: ");
		lblEmail.setBounds(12, 71, 116, 16);
		contentPane.add(lblEmail);

		JLabel lblPhoneNumber = new JLabel("Phone Number: ");
		lblPhoneNumber.setBounds(12, 100, 116, 16);
		contentPane.add(lblPhoneNumber);

		JLabel lblCreditCardInfo = new JLabel("Credit card Info: ");
		lblCreditCardInfo.setBounds(12, 129, 116, 16);
		contentPane.add(lblCreditCardInfo);

		JLabel lblTravel = new JLabel("Travel to: ");
		lblTravel.setBounds(12, 155, 116, 16);
		contentPane.add(lblTravel);

		txtFullname = new JTextField();
		txtFullname.setBounds(159, 10, 116, 22);
		contentPane.add(txtFullname);
		txtFullname.setColumns(10);

		txtIDNumber = new JTextField();
		txtIDNumber.setColumns(10);
		txtIDNumber.setBounds(159, 39, 116, 22);
		contentPane.add(txtIDNumber);

		txtEMail = new JTextField();
		txtEMail.setColumns(10);
		txtEMail.setBounds(159, 68, 116, 22);
		contentPane.add(txtEMail);

		txtPhoneNumber = new JTextField();
		txtPhoneNumber.setColumns(10);
		txtPhoneNumber.setBounds(159, 97, 116, 22);
		contentPane.add(txtPhoneNumber);

		txtCreditCardInfo = new JTextField();
		txtCreditCardInfo.setColumns(10);
		txtCreditCardInfo.setBounds(159, 129, 116, 22);
		contentPane.add(txtCreditCardInfo);


		txtTravel.setColumns(10);
		txtTravel.setBounds(159, 155, 116, 22);
		contentPane.add(txtTravel);
		txtTravel.setEditable(false);



	}

	public JTextField getTxtTravel() {
		return txtTravel;
	}

	public void setTxtTravel(String text) {
		this.txtTravel.setText(text);
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ReservationFrame frame = new ReservationFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
