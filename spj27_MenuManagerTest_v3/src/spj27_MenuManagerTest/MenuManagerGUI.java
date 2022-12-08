package spj27_MenuManagerTest;

import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class MenuManagerGUI implements ActionListener, ListSelectionListener, MouseListener {

	private JFrame mainMenuWindow;
	private JLabel lblEntrees;
	private JLabel lblSides;
	private JLabel lblSalads;
	private JLabel lblDesserts;
	private JLabel lblH1, lblH2, lblH3;
	private JComboBox<Entree> cboEntrees;
	private JComboBox<Side> cboSides;
	private JComboBox<Salad> cboSalads;
	private JComboBox<Dessert> cboDesserts;
	private JButton btnCreateMenu;
	private JButton btnRandomMenu;
	private JButton btnMinMenu;
	private JButton btnMaxMenu;
	private JButton btnDetails;
	private JButton btnDelete;
	private JButton btnSave;
	private JList<Menu> list1;
	private DefaultListModel<Menu> listModel;

	MenuManager manager = new MenuManager("data/dishes.txt");	
	ArrayList<Menu> allMenus = new ArrayList<Menu>();			


	/**
	 * Generate the main menu manager GUI form
	 */
	/**
	 * 
	 */
	public MenuManagerGUI() {

		mainMenuWindow = new JFrame("Menu Manager // SPJ27");
		mainMenuWindow.setLayout(null);
		mainMenuWindow.setBounds(100,100,600,470);
		mainMenuWindow.setResizable(false);
		mainMenuWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainMenuWindow.setAlwaysOnTop(true);

		lblH1 = new JLabel("Create your own:");
		lblH1.setBounds(10, 5, 135, 25);
		lblH2 = new JLabel("Created menus:");
		lblH2.setBounds(350, 10, 100, 25);
		lblH3 = new JLabel("Generate a Menu:");
		lblH3.setBounds(10, 250, 120, 25);

		lblEntrees = new JLabel("Entrees:");
		lblEntrees.setBounds(15, 30, 70, 25);

		lblSalads = new JLabel("Salads:");
		lblSalads.setBounds(15, 65, 70, 25);

		lblSides = new JLabel("Sides:");
		lblSides.setBounds(15, 100, 70, 25);

		lblDesserts = new JLabel("Desserts:");
		lblDesserts.setBounds(15, 135, 70, 25);

		mainMenuWindow.add(lblEntrees);
		mainMenuWindow.add(lblSides);
		mainMenuWindow.add(lblSalads);
		mainMenuWindow.add(lblDesserts);
		mainMenuWindow.add(lblH1);
		mainMenuWindow.add(lblH2);
		mainMenuWindow.add(lblH3);

		cboEntrees = new JComboBox<Entree>();
		cboEntrees.setBounds(90,30,195,25);

		cboSalads = new JComboBox<Salad>();
		cboSalads.setBounds(90,65,195,25);

		cboSides = new JComboBox<Side>();
		cboSides.setBounds(90,100,195,25);

		cboDesserts = new JComboBox<Dessert>();
		cboDesserts.setBounds(90,135,195,25);

		mainMenuWindow.add(cboEntrees);
		mainMenuWindow.add(cboSalads);
		mainMenuWindow.add(cboSides);
		mainMenuWindow.add(cboDesserts);

		btnCreateMenu = new JButton("Create Menu with these Dishes");
		btnCreateMenu.setBounds(15,170,270,30);

		btnRandomMenu = new JButton("Create Random Menu");
		btnRandomMenu.setBounds(15,280,270,30);

		btnMinMenu = new JButton("Create Minimum Calorie Menu");
		btnMinMenu.setBounds(15,315,270,30);

		btnMaxMenu = new JButton("Create Maximum Calorie Menu");
		btnMaxMenu.setBounds(15,350,270,30);

		btnDetails = new JButton("Details");
		btnDetails.setBounds(350,360,210,25);

		btnDelete = new JButton("Delete All");
		btnDelete.setBounds(360,400,90,25);

		btnSave = new JButton("Save All");
		btnSave.setBounds(460,400,90,25);

		listModel = new DefaultListModel<Menu>();
		list1 = new JList<Menu>(listModel);
		list1.setBounds(350,40,210,300);
		list1.setBorder(BorderFactory.createLineBorder(Color.black));
		list1.addListSelectionListener(this);
		list1.addMouseListener((MouseListener) this);

		mainMenuWindow.add(btnCreateMenu);
		mainMenuWindow.add(btnRandomMenu);
		mainMenuWindow.add(btnMinMenu);
		mainMenuWindow.add(btnMaxMenu);
		mainMenuWindow.add(btnDetails);
		mainMenuWindow.add(btnDelete);
		mainMenuWindow.add(btnSave);
		mainMenuWindow.add(list1);

		btnCreateMenu.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){

				Entree selectedEntree = (Entree) cboEntrees.getSelectedItem();
				Side selectedSide = (Side) cboSides.getSelectedItem();
				Salad selectedSalad = (Salad) cboSalads.getSelectedItem();
				Dessert selectedDessert = (Dessert) cboDesserts.getSelectedItem();

				String menuName = JOptionPane.showInputDialog("Name for the menu?");
				if(menuName != null){
					Menu m = new Menu(menuName,selectedEntree,selectedSide,selectedSalad,selectedDessert);
					listModel.addElement(m);
					allMenus.add(m);
				}
			}
		});

		btnDelete.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				allMenus.removeAll(allMenus);
				listModel.removeAllElements();
			}
		});

		btnSave.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				FileManager.writeMenu("data/menus.txt", allMenus);
				JOptionPane.showMessageDialog(null,allMenus.size() + " Menus saved to menus.txt");
			}
		});

		btnRandomMenu.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String menuName = JOptionPane.showInputDialog("Name for the menu?");
				Menu randMenu = manager.randomMenu(menuName.toString());
				listModel.addElement(randMenu);
				allMenus.add(randMenu);
			}
		});


		btnDetails.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				try {
					detailsPane(listModel.elementAt(list1.getSelectedIndex()));
				} catch (Exception f){		
				}
			}
		});

		fillComboBoxes();
		mainMenuWindow.setVisible(true);		
	}

	public void fillComboBoxes(){
		for (Entree item: MenuManager.getEntrees()) cboEntrees.addItem(item); 
		for (Salad item: MenuManager.getSalads()) cboSalads.addItem(item); 
		for (Side item: MenuManager.getSides()) cboSides.addItem(item); 
		for (Dessert item: MenuManager.getDesserts()) cboDesserts.addItem(item); 
	}

	public static void detailsPane(Menu menu){
		JFrame frmDetails = new JFrame("Menu: " + menu);
		frmDetails.setLayout(null);
		frmDetails.setBounds(250,250,900,500);
		frmDetails.setResizable(false);
		//frmDetails.setDefaultCloseOperation(JFrame.NORMAL);
		frmDetails.setAlwaysOnTop(true);
		//Insets margins = new Insets(1,3,1,1);

		JLabel lblEntrees1 = new JLabel("Entree:");
		lblEntrees1.setBounds(15, 30, 70, 25);

		JLabel lblSalads1 = new JLabel("Salad:");
		lblSalads1.setBounds(15, 100, 70, 25);

		JLabel lblSides1 = new JLabel("Side:");
		lblSides1.setBounds(15, 170, 70, 25);

		JLabel lblDesserts1 = new JLabel("Dessert:");
		lblDesserts1.setBounds(15, 240, 70, 25);

		JLabel lblCalories = new JLabel("TTL Calories:");
		lblCalories.setBounds(15, 320, 90, 35);

		JLabel lblPrice = new JLabel("TTL Price:");
		lblPrice.setBounds(15, 400, 90, 35);

		JTextArea txtArea1 = new JTextArea(3,40);
		txtArea1.setBounds(90,30,750,50);

		JTextArea txtArea2 = new JTextArea(3,40);
		txtArea2.setBounds(90,100,750,50);
		
		JTextArea txtArea3 = new JTextArea(3,40);
		txtArea3.setBounds(90,170,750,50);

		JTextArea txtArea4 = new JTextArea(3,40);
		txtArea4.setBounds(90,240,750,50);

		JTextArea txtArea5 = new JTextArea(1,10);
		txtArea5.setBounds(110,325,60,20);

		JTextArea txtArea6 = new JTextArea(1,10);
		txtArea6.setBounds(110,410,60,20);

		frmDetails.add(lblEntrees1);
		frmDetails.add(lblSides1);
		frmDetails.add(lblSalads1);
		frmDetails.add(lblDesserts1);
		frmDetails.add(lblCalories);
		frmDetails.add(lblPrice);
		frmDetails.add(txtArea1);
		frmDetails.add(txtArea2);
		frmDetails.add(txtArea3);
		frmDetails.add(txtArea4);
		frmDetails.add(txtArea5);
		frmDetails.add(txtArea6);

		txtArea1.setText(menu.getEntree() +"\n"+ menu.getEntree().getDescription()+ "\nCalories: " + menu.getEntree().getCalories()+ "   Price: $" + menu.getEntree().getPrice());
		txtArea2.setText(menu.getSalad() +"\n"+ menu.getSalad().getDescription()+ "\nCalories: " + menu.getSalad().getCalories()+ "   Price: $" + menu.getSalad().getPrice());
		txtArea3.setText(menu.getSide() +"\n"+ menu.getSide().getDescription()+ "\nCalories: " + menu.getSide().getCalories()+ "   Price: $" + menu.getSide().getPrice());
		txtArea4.setText(menu.getDessert() +"\n"+ menu.getDessert().getDescription()+ "\nCalories: " + menu.getDessert().getCalories()+ "   Price: $" + menu.getDessert().getPrice());
		txtArea5.setText("  " + menu.totalCalories());
		txtArea6.setText("$ " + menu.totalPrice());

		frmDetails.setVisible(true);
	}

	public static void main(String[] args) {
		MenuManagerGUI g = new MenuManagerGUI();
	}

	@Override	//double click item in list to bring up details pane
	public void mouseClicked(MouseEvent event) {
		if(event.getClickCount() == 2) detailsPane(listModel.elementAt(list1.getSelectedIndex()));
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {}

	@Override
	public void mouseExited(MouseEvent arg0) {}

	@Override
	public void mousePressed(MouseEvent arg0) {}

	@Override
	public void mouseReleased(MouseEvent arg0) {}

	@Override
	public void valueChanged(ListSelectionEvent e) {}

	@Override
	public void actionPerformed(ActionEvent e) {}

}
