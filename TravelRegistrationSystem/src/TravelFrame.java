import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;




public class TravelFrame extends JFrame {

	private ReservationFrame rf = new ReservationFrame();
	private JPanel [] panelsPrice = new JPanel[10];
	public static JRadioButton [] radio = new JRadioButton[10];


	//Nodes for linked list. Tours are keeps in Linked List.
	private static DoublyLinkedList dll = new DoublyLinkedList();
	private static Tours t5 = new Tours("Amsterdam", 111, 4, 800);
	private static Tours t1 = new Tours("Cappadocia", 222, 3, 500);
	private static Tours t3 = new Tours("Prague", 333, 4, 600);
	private static Tours t6 = new Tours("Berlin", 444, 4, 900);
	private static Tours t9 = new Tours("London", 555, 5, 1200);
	private static Tours t7 = new Tours("Spain", 666, 5, 1000);
	private static Tours t4 = new Tours("Budapest", 777, 4, 650);
	private static Tours t2 = new Tours("Polland", 888, 3, 550);
	private static Tours t8 = new Tours("Roma", 999, 6, 1100);
	private static Tours t = new Tours("Pamukkale", 1010, 2, 150);



	JRadioButton rbPrice;
	JRadioButton rbPopularity;
	JButton btnRegister1;
	ButtonGroup bg = new ButtonGroup();



	public TravelFrame() {
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new GridLayout(12,1));

		btnRegister1 = new JButton("Register");
		add(btnRegister1);

		//Implement panels.
		createPrice(dll);



		for(int i=0; i<10; i++) {
			add(panelsPrice[i]);
		}



		btnRegister1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int i=0;
				NodeTour current = dll.getFirst();

				//It is for updating quota after each registeration.
				for(int k=0; k<radio.length; k++) {

					if(radio[k].isSelected() == true) {
						i=k;
						rf.setTxtTravel(radio[i].getText());
						break;
					}

					else if(radio[k].isSelected() == false)
						continue;
				}
				for(int j=0; j<i; j++) {
					current=current.getNext();
				}

				current.getT().setQuota((current.getT().getQuota())-1);


				for(int k=0; k<panelsPrice.length; k++) {
					panelsPrice[k].setVisible(false);
					remove(panelsPrice[k]);

				}
				createPrice(dll);
				for(int k=0; k<panelsPrice.length; k++) {

					add(panelsPrice[k]);
					panelsPrice[k].setVisible(true);
					bg.add(radio[i]);
				}

				//Open the other window.
				rf.setVisible(true);

			}
		});
	}

	public void createPrice(DoublyLinkedList d) {
		//This method for implements tours' info panels.

		NodeTour current = dll.getFirst();
		JPanel [] panels = new JPanel[10];
		JLabel [] labels = new JLabel[10];

		for (int i = 0; i < 10; i++) {
			panels[i] = new JPanel(new FlowLayout(FlowLayout.LEFT));
			radio[i] = new JRadioButton(current.getT().getTourname());
			labels[i] = new JLabel(current.getT().toString());
			panels[i].add(radio[i]);
			panels[i].add(labels[i]);
			bg.add(radio[i]);
			panelsPrice[i] = panels[i];
			current = current.getNext();
		}

	}

	public static void main(String[] args) {


		//Build a linked list. Add each node to linked list.
		dll.insertAtFront(t);
		dll.insertAtFront(t1);
		dll.insertAtFront(t2);
		dll.insertAtFront(t3);
		dll.insertAtFront(t4);
		dll.insertAtFront(t5);
		dll.insertAtFront(t6);
		dll.insertAtFront(t7);
		dll.insertAtFront(t8);
		dll.insertAtFront(t9);

		//Open window.
		new TravelFrame().setVisible(true);

	}

}
