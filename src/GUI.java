import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class GUI
{

   public JFrame frame = new JFrame();
   public JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
   public JPopupMenu popupMenu = new JPopupMenu();
   public JButton btnAddRental = new JButton("Add rental");
   public JButton btnDisplay = new JButton("Display");
   public JButton btnSave = new JButton("Save");
   public JButton btnRemove = new JButton("Remove");
   public JMenuItem btnCar = new JMenuItem("Car");
   public JMenuItem btnVan = new JMenuItem("Van");
   public JMenuItem btnTruck = new JMenuItem("Truck");
   public JMenuItem btnCamper = new JMenuItem("Camper");
   public JTable carTable = new JTable();
   public JTable vanTable = new JTable();
   public JTable truckTable = new JTable();
   public JTable camperTable = new JTable();
   public JScrollPane scrollPane = new JScrollPane();
   public JScrollPane scrollPane_1 = new JScrollPane();
   public JScrollPane scrollPane_2 = new JScrollPane();
   public JScrollPane scrollPane_3 = new JScrollPane();
   

   public JSeparator separator = new JSeparator();

   public GUI()
   {

      initialize();
      addButtons();
      addButtonsToMenu();
      settingBounds();
      addingTabsToTheTabPane();
      settingViewForTables();
      tablesShit();

   }

   private void addButtons()
   {

      frame.getContentPane().add(btnRemove);
      frame.getContentPane().add(btnSave);
      frame.getContentPane().add(btnDisplay);
      frame.getContentPane().add(separator);
   }

   private void addButtonsToMenu()
   {
      popupMenu.add(btnCar);

      popupMenu.add(btnVan);

      popupMenu.add(btnTruck);

      popupMenu.add(btnCamper);
   }

   private void settingViewForTables()
   {
      scrollPane.setViewportView(carTable);
      scrollPane_1.setViewportView(truckTable);
      scrollPane_2.setViewportView(vanTable);
      scrollPane_3.setViewportView(camperTable);
   }

   private void settingBounds()
   {
      tabbedPane.setBounds(38, 42, 1000, 378);
      btnAddRental.setBounds(1061, 126, 113, 23);
      btnRemove.setBounds(1061, 181, 113, 23);

      btnSave.setBounds(1061, 275, 113, 23);

      btnDisplay.setBounds(1061, 332, 113, 23);
      separator.setBounds(1073, 239, 89, 2);
   }

   private void initialize()
   {

      frame.setBounds(80, 100, 1200, 500);
      frame.setVisible(true);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.getContentPane().setLayout(null);
      frame.getContentPane().add(tabbedPane);
      frame.getContentPane().add(btnAddRental);
      addPopup(btnAddRental, popupMenu);
      btnCar.addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent arg0)
         {
            new CarGUI();
         }
      });
      btnVan.addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent arg0)
         {
            new VanGUI();
         }
      });
      btnTruck.addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent arg0)
         {
            new TruckGUI();
         }
      });
      btnCamper.addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent arg0)
         {
            new CamperGUI();
         }
      });

   }

   private void addingTabsToTheTabPane()
   {
      tabbedPane.addTab("Car rental", null, scrollPane, null);
      tabbedPane.addTab("Van rental", null, scrollPane_2, null);
      tabbedPane.addTab("Truck rental", null, scrollPane_1, null);
      tabbedPane.addTab("Camper rental", null, scrollPane_3, null);
   }

   private static void addPopup(Component component, final JPopupMenu popup)
   {
      component.addMouseListener(new MouseAdapter()
      {
         public void mouseClicked(MouseEvent e)
         {
            showMenu(e);
         }

         private void showMenu(MouseEvent e)
         {
            popup.show(e.getComponent(), e.getX(), e.getY());
         }
      });
   }

   private void tablesShit()
   {
      carTable.setModel(new DefaultTableModel(new Object[][] {}, new String[] {
            "ID", "Name", "Pick up time", "Return time", "Pick up location",
            "Delivery location", "Driver's license", "Car Preference",
            "Est. KM" }));
      carTable.getColumnModel().getColumn(0).setPreferredWidth(10);
      vanTable.setModel(new DefaultTableModel(new Object[][] {}, new String[] {
            "ID", "Name", "Pick up time", "Return time", "Pick up location",
            "Delivery location", "Driver's license", "Van Size", "Est. KM" }));
      vanTable.getColumnModel().getColumn(0).setPreferredWidth(10);
      vanTable.getColumnModel().getColumn(8).setPreferredWidth(10);
      vanTable.getColumnModel().getColumn(7).setPreferredWidth(10);
      truckTable.setModel(new DefaultTableModel(new Object[][] {},
            new String[] { "ID", "Name", "Pick up time", "Return time",
                  "Pick up location", "Delivery location", "Driver's license",
                  "Est. KM" }));
      truckTable.getColumnModel().getColumn(0).setPreferredWidth(10);
      truckTable.getColumnModel().getColumn(7).setPreferredWidth(10);
      camperTable.setModel(new DefaultTableModel(new Object[][] {},
            new String[] { "ID", "Name", "Pick up time", "Return time",
                  "Pick up location", "Delivery location", "Driver's license",
                  "Week/Weekend rental", "Est. KM" }));
      camperTable.getColumnModel().getColumn(8).setPreferredWidth(10);
      camperTable.getColumnModel().getColumn(0).setPreferredWidth(10);
   }

   public void addCarsToTable(Cars obj)
   {
      DefaultTableModel model = (DefaultTableModel) carTable.getModel();
      model.setRowCount(0);
      for (int i = 0; i < obj.getNumberOfCarCustomers(); i++)
      {

         model.addRow(new Object[] { obj.getCarCustomer(i).getId(),
               obj.getCarCustomer(i).getNameOfRenter(),
               obj.getCarCustomer(i).getPickUpTime(),
               obj.getCarCustomer(i).getReturnTime(),
               obj.getCarCustomer(i).getPickUpLocation(),
               obj.getCarCustomer(i).getDeliveryLocation(),
               obj.getCarCustomer(i).getDriverLicenseNo(),
               obj.getCarCustomer(i).getCarPreference(),
               obj.getCarCustomer(i).getEstKm() });

      }
   }

   public void addVansToTable(Vans obj)
   {
      DefaultTableModel model = (DefaultTableModel) vanTable.getModel();
      model.setRowCount(0);
      for (int i = 0; i < obj.getNumberOfVans(); i++)
      {

         model.addRow(new Object[] { obj.getVan(i).getId(),
               obj.getVan(i).getNameOfRenter(), obj.getVan(i).getPickUpTime(),
               obj.getVan(i).getReturnTime(),
               obj.getVan(i).getPickUpLocation(),
               obj.getVan(i).getDeliveryLocation(),
               obj.getVan(i).getDriverLicenseNo(), obj.getVan(i).getSize(),
               obj.getVan(i).getEstKm() });

      }
   }

   public void addTrucksToTable(Trucks obj)
   {
      DefaultTableModel model = (DefaultTableModel) truckTable.getModel();
      model.setRowCount(0);
      for (int i = 0; i < obj.getNumberOfTrucks(); i++)
      {

         model.addRow(new Object[] { obj.getTruck(i).getId(),
               obj.getTruck(i).getNameOfRenter(),
               obj.getTruck(i).getPickUpTime(),
               obj.getTruck(i).getReturnTime(),
               obj.getTruck(i).getPickUpLocation(),
               obj.getTruck(i).getDeliveryLocation(),
               obj.getTruck(i).getDriverLicenseNo(),

               obj.getTruck(i).getEstKm() });

      }
   }

   public void addCampersToTable(Campers obj)
   {
      DefaultTableModel model = (DefaultTableModel) camperTable.getModel();
      model.setRowCount(0);
      for (int i = 0; i < obj.getNumberOfCamperCustomers(); i++)
      {

         model.addRow(new Object[] { obj.getCamperCustomer(i).getId(),
               obj.getCamperCustomer(i).getNameOfRenter(),
               obj.getCamperCustomer(i).getPickUpTime(),
               obj.getCamperCustomer(i).getReturnTime(),
               obj.getCamperCustomer(i).getPickUpLocation(),
               obj.getCamperCustomer(i).getDeliveryLocation(),
               obj.getCamperCustomer(i).getDriverLicenseNo(),
               obj.getCamperCustomer(i).getWeekOrWeekend(),
               obj.getCamperCustomer(i).getEstKm() });

      }
   }

   public int getCarElementFromTable()
   {
      return carTable.getSelectedRow();
   }

   public int getVanElementFromTable()
   {
      return vanTable.getSelectedRow();
   }

   public int getTruckElementFromTable()
   {
      return truckTable.getSelectedRow();
   }

   public int getCamperElementFromTable()
   {
      return camperTable.getSelectedRow();
   }
}
