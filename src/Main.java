import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JMenuItem;
import javax.swing.JTabbedPane;
import javax.swing.JTable;

public class Main
{
   public static void main(String[] args)
   {
      Cars cars = new Cars();
      Trucks trucks = new Trucks();
      Vans vans = new Vans();
      GUI gui = new GUI();
      Campers campers = new Campers();

      JButton guiSave = gui.btnSave;
      JButton guiDisplay = gui.btnDisplay;
      JButton guiRemove = gui.btnRemove;
      JTable carTable = gui.carTable;
      JTable truckTable = gui.truckTable;
      JTable vanTable = gui.vanTable;
      JTable camperTable = gui.camperTable;
      JMenuItem btnCar = gui.btnCar;
      JMenuItem btnVan = gui.btnVan;
      JMenuItem btnTruck = gui.btnTruck;
      JMenuItem btnCamper = gui.btnCamper;
      JTabbedPane tabs = gui.tabbedPane;

      btnCar.addMouseListener(new MouseAdapter()
      {
         public void mousePressed(MouseEvent e)
         {
            CarGUI carGui = new CarGUI();
            carGui.btnAdd.addMouseListener(new MouseAdapter()
            {
               public void mouseClicked(MouseEvent arg0)
               {

                  String name = carGui.textFieldName.getText();
                  int driverLic = Integer.parseInt(carGui.textField_DriverLic
                        .getText());
                  int dayPick = Integer.parseInt(carGui.textFieldDayPick
                        .getText());
                  int monthPick = Integer.parseInt(carGui.textMonthPick
                        .getText());
                  int yearPick = Integer.parseInt(carGui.textFieldYearPick
                        .getText());
                  MyDate pickDate = new MyDate(dayPick, monthPick, yearPick);
                  int dayReturn = Integer.parseInt(carGui.textFieldDayReturn
                        .getText());
                  int monthReturn = Integer
                        .parseInt(carGui.textFieldMonthReturn.getText());
                  int yearReturn = Integer.parseInt(carGui.textFieldYearReturn
                        .getText());
                  MyDate returnDate = new MyDate(dayReturn, monthReturn,
                        yearReturn);
                  String pickUpLocation = carGui.textField_PickUpLoc.getText();
                  String deliveryLocation = carGui.textField_DeliveryLoc
                        .getText();
                  String carPref = carGui.textFieldCarPref.getText();
                  int estKm = Integer.parseInt(carGui.textField_EstKm.getText());
                  Car temporary = new Car(name, pickDate, returnDate,
                        pickUpLocation, deliveryLocation, driverLic, carPref,
                        estKm, 0);
                  cars.addCarCostumer(temporary);
                  cars.saveCars();
                  gui.addCarsToTable(cars);
                  carGui.frame.dispose();
               }
            });

         }
      });

      btnVan.addMouseListener(new MouseAdapter()
      {
         public void mousePressed(MouseEvent e)
         {
            VanGUI vanGui = new VanGUI();
            vanGui.btnAdd.addMouseListener(new MouseAdapter()
            {
               public void mouseClicked(MouseEvent arg0)
               {

                  String name = vanGui.textFieldName.getText();
                  int driverLic = Integer.parseInt(vanGui.textField_DriverLic
                        .getText());
                  int dayPick = Integer.parseInt(vanGui.textFieldDayPick
                        .getText());
                  int monthPick = Integer.parseInt(vanGui.textMonthPick
                        .getText());
                  int yearPick = Integer.parseInt(vanGui.textFieldYearPick
                        .getText());
                  MyDate pickDate = new MyDate(dayPick, monthPick, yearPick);
                  int dayReturn = Integer.parseInt(vanGui.textFieldDayReturn
                        .getText());
                  int monthReturn = Integer
                        .parseInt(vanGui.textFieldMonthReturn.getText());
                  int yearReturn = Integer.parseInt(vanGui.textFieldYearReturn
                        .getText());
                  MyDate returnDate = new MyDate(dayReturn, monthReturn,
                        yearReturn);
                  String pickUpLocation = vanGui.textField_PickUpLoc.getText();
                  String deliveryLocation = vanGui.textField_DeliveryLoc
                        .getText();
                  int vanSize = Integer.parseInt(vanGui.textFieldVanSize
                        .getText());
                  int estKm = Integer.parseInt(vanGui.textField_EstKm.getText());
                  Van temporary = new Van(name, pickDate, returnDate,
                        pickUpLocation, deliveryLocation, driverLic, vanSize,
                        estKm, 0);

                  vans.addVanCostumer(temporary);
                  vans.saveVans();
                  gui.addVansToTable(vans);
                  vanGui.frame.dispose();
               }
            });

         }
      });

      btnTruck.addMouseListener(new MouseAdapter()
      {
         public void mousePressed(MouseEvent e)
         {
            TruckGUI truckGui = new TruckGUI();
            truckGui.btnAdd.addMouseListener(new MouseAdapter()
            {
               public void mouseClicked(MouseEvent arg0)
               {

                  String name = truckGui.textFieldName.getText();
                  int driverLic = Integer.parseInt(truckGui.textField_DriverLic
                        .getText());
                  int dayPick = Integer.parseInt(truckGui.textFieldDayPick
                        .getText());
                  int monthPick = Integer.parseInt(truckGui.textMonthPick
                        .getText());
                  int yearPick = Integer.parseInt(truckGui.textFieldYearPick
                        .getText());
                  MyDate pickDate = new MyDate(dayPick, monthPick, yearPick);
                  int dayReturn = Integer.parseInt(truckGui.textFieldDayReturn
                        .getText());
                  int monthReturn = Integer
                        .parseInt(truckGui.textFieldMonthReturn.getText());
                  int yearReturn = Integer
                        .parseInt(truckGui.textFieldYearReturn.getText());
                  MyDate returnDate = new MyDate(dayReturn, monthReturn,
                        yearReturn);
                  String pickUpLocation = truckGui.textField_PickUpLoc
                        .getText();
                  String deliveryLocation = truckGui.textField_DeliveryLoc
                        .getText();

                  int estKm = Integer.parseInt(truckGui.textField_EstKm
                        .getText());
                  Truck temporary = new Truck(name, pickDate, returnDate,
                        pickUpLocation, deliveryLocation, driverLic, estKm, 0);

                  trucks.addTruckCostumer(temporary);
                  trucks.saveTruck();
                  gui.addTrucksToTable(trucks);
                  truckGui.frame.dispose();
               }
            });

         }
      });

      btnCamper.addMouseListener(new MouseAdapter()
      {
         public void mousePressed(MouseEvent e)
         {
            CamperGUI camperGui = new CamperGUI();
            camperGui.btnAdd.addMouseListener(new MouseAdapter()
            {
               public void mouseClicked(MouseEvent arg0)
               {

                  String name = camperGui.textFieldName.getText();
                  int driverLic = Integer
                        .parseInt(camperGui.textField_DriverLic.getText());
                  int dayPick = Integer.parseInt(camperGui.textFieldDayPick
                        .getText());
                  int monthPick = Integer.parseInt(camperGui.textMonthPick
                        .getText());
                  int yearPick = Integer.parseInt(camperGui.textFieldYearPick
                        .getText());
                  MyDate pickDate = new MyDate(dayPick, monthPick, yearPick);
                  int dayReturn = Integer.parseInt(camperGui.textFieldDayReturn
                        .getText());
                  int monthReturn = Integer
                        .parseInt(camperGui.textFieldMonthReturn.getText());
                  int yearReturn = Integer
                        .parseInt(camperGui.textFieldYearReturn.getText());
                  MyDate returnDate = new MyDate(dayReturn, monthReturn,
                        yearReturn);
                  String pickUpLocation = camperGui.textField_PickUpLoc
                        .getText();
                  String deliveryLocation = camperGui.textField_DeliveryLoc
                        .getText();
                  String weekOrWknd = camperGui.textWeekOrWeekend.getText();
                  int estKm = Integer.parseInt(camperGui.textField_EstKm
                        .getText());
                  Camper temporary = new Camper(name, pickDate, returnDate,
                        pickUpLocation, deliveryLocation, driverLic,
                        weekOrWknd, estKm, 0);
                  campers.addCamperCostumer(temporary);
                  campers.saveCampers();
                  gui.addCampersToTable(campers);
                  camperGui.frame.dispose();
               }
            });

         }
      });

      guiDisplay.addMouseListener(new MouseAdapter()
      {
         @Override
         public void mousePressed(MouseEvent e)
         {
            cars.readCars();
            vans.readVans();
            trucks.readTrucks();
            campers.readCampers();
            gui.addCarsToTable(cars);
            gui.addVansToTable(vans);
            gui.addTrucksToTable(trucks);
            gui.addCampersToTable(campers);
         }
      });
      guiRemove.addMouseListener(new MouseAdapter()
      {
         @Override
         public void mousePressed(MouseEvent e)
         {
            if (tabs.getSelectedIndex() == 0
                  && gui.getCarElementFromTable() != -1)
            {
               cars.removeCarCustomer(gui.getCarElementFromTable());
               gui.addCarsToTable(cars);
               ;
            }
            else if (tabs.getSelectedIndex() == 1
                  && gui.getVanElementFromTable() != -1)
            {
               vans.removeVan(gui.getVanElementFromTable());
               gui.addVansToTable(vans);

            }
            else if (tabs.getSelectedIndex() == 2
                  && gui.getTruckElementFromTable() != -1)
            {
               trucks.removeTruck(gui.getTruckElementFromTable());
               gui.addTrucksToTable(trucks);
            }
            else
            {
               campers.removeCamperCustomer(gui.getCamperElementFromTable());
               gui.addCampersToTable(campers);
            }
         }

      });
      guiSave.addMouseListener(new MouseAdapter()
      {
         @Override
         public void mousePressed(MouseEvent e)
         {
            for (int i = 0; i < carTable.getRowCount(); i++)
            {
               String value = carTable.getModel().getValueAt(i, 0).toString();
               String value1 = carTable.getModel().getValueAt(i, 1).toString();
               String value2 = carTable.getModel().getValueAt(i, 2).toString();
               String value3 = carTable.getModel().getValueAt(i, 3).toString();
               String value4 = carTable.getModel().getValueAt(i, 4).toString();
               String value5 = carTable.getModel().getValueAt(i, 5).toString();
               String value6 = carTable.getModel().getValueAt(i, 6).toString();
               String value7 = carTable.getModel().getValueAt(i, 7).toString();
               String value8 = carTable.getModel().getValueAt(i, 8).toString();

               int id = Integer.parseInt(value);
               int estKM = Integer.parseInt(value8);
               int driverLic = Integer.parseInt(value6);
               String[] partsPick = value2.split("/", 3);
               int day = Integer.parseInt(partsPick[0]);
               int month = Integer.parseInt(partsPick[1]);
               int year = Integer.parseInt(partsPick[2]);
               MyDate pickDate = new MyDate(day, month, year);
               String[] partsReturn = value3.split("/", 3);
               int dayReturn = Integer.parseInt(partsReturn[0]);
               int monthReturn = Integer.parseInt(partsReturn[1]);
               int yearReturn = Integer.parseInt(partsReturn[2]);
               MyDate pickReturn = new MyDate(dayReturn, monthReturn,
                     yearReturn);
               cars.getCarCustomer(i).setId(id);
               cars.getCarCustomer(i).setNameOfRenter(value1);
               cars.getCarCustomer(i).setPickUpTime(pickDate);
               cars.getCarCustomer(i).setReturnTime(pickReturn);
               cars.getCarCustomer(i).setPickUpLocation(value4);
               cars.getCarCustomer(i).setDeliveryLocation(value5);
               cars.getCarCustomer(i).setDriverLicenseNo(driverLic);
               cars.getCarCustomer(i).setCarPreference(value7);
               cars.getCarCustomer(i).setEstKm(estKM);

            }
            cars.saveCars();
            for (int i = 0; i < vanTable.getRowCount(); i++)
            {
               String value = vanTable.getModel().getValueAt(i, 0).toString();
               String value1 = vanTable.getModel().getValueAt(i, 1).toString();
               String value2 = vanTable.getModel().getValueAt(i, 2).toString();
               String value3 = vanTable.getModel().getValueAt(i, 3).toString();
               String value4 = vanTable.getModel().getValueAt(i, 4).toString();
               String value5 = vanTable.getModel().getValueAt(i, 5).toString();
               String value6 = vanTable.getModel().getValueAt(i, 6).toString();
               String value7 = vanTable.getModel().getValueAt(i, 7).toString();
               String value8 = vanTable.getModel().getValueAt(i, 8).toString();

               int id = Integer.parseInt(value);
               int estKM = Integer.parseInt(value8);
               int driverLic = Integer.parseInt(value6);
               int size = Integer.parseInt(value7);
               String[] partsPick = value2.split("/", 3);
               int day = Integer.parseInt(partsPick[0]);
               int month = Integer.parseInt(partsPick[1]);
               int year = Integer.parseInt(partsPick[2]);
               MyDate pickDate = new MyDate(day, month, year);
               String[] partsReturn = value3.split("/", 3);
               int dayReturn = Integer.parseInt(partsReturn[0]);
               int monthReturn = Integer.parseInt(partsReturn[1]);
               int yearReturn = Integer.parseInt(partsReturn[2]);
               MyDate pickReturn = new MyDate(dayReturn, monthReturn,
                     yearReturn);

               vans.getVan(i).setId(id);
               vans.getVan(i).setNameOfRenter(value1);
               vans.getVan(i).setPickUpTime(pickDate);
               vans.getVan(i).setReturnTime(pickReturn);
               vans.getVan(i).setPickUpLocation(value4);
               vans.getVan(i).setDeliveryLocation(value5);
               vans.getVan(i).setDriverLicenseNo(driverLic);
               vans.getVan(i).setSize(size);
               vans.getVan(i).setEstKm(estKM);

            }
            vans.saveVans();
            for (int i = 0; i < truckTable.getRowCount(); i++)
            {
               String value = truckTable.getModel().getValueAt(i, 0).toString();
               String value1 = truckTable.getModel().getValueAt(i, 1)
                     .toString();
               String value2 = truckTable.getModel().getValueAt(i, 2)
                     .toString();
               String value3 = truckTable.getModel().getValueAt(i, 3)
                     .toString();
               String value4 = truckTable.getModel().getValueAt(i, 4)
                     .toString();
               String value5 = truckTable.getModel().getValueAt(i, 5)
                     .toString();
               String value6 = truckTable.getModel().getValueAt(i, 6)
                     .toString();
               String value7 = truckTable.getModel().getValueAt(i, 7)
                     .toString();

               int id = Integer.parseInt(value);
               int estKM = Integer.parseInt(value7);
               int driverLic = Integer.parseInt(value6);

               String[] partsPick = value2.split("/", 3);
               int day = Integer.parseInt(partsPick[0]);
               int month = Integer.parseInt(partsPick[1]);
               int year = Integer.parseInt(partsPick[2]);
               MyDate pickDate = new MyDate(day, month, year);
               String[] partsReturn = value3.split("/", 3);
               int dayReturn = Integer.parseInt(partsReturn[0]);
               int monthReturn = Integer.parseInt(partsReturn[1]);
               int yearReturn = Integer.parseInt(partsReturn[2]);
               MyDate pickReturn = new MyDate(dayReturn, monthReturn,
                     yearReturn);

               trucks.getTruck(i).setId(id);
               trucks.getTruck(i).setNameOfRenter(value1);
               trucks.getTruck(i).setPickUpTime(pickDate);
               trucks.getTruck(i).setReturnTime(pickReturn);
               trucks.getTruck(i).setPickUpLocation(value4);
               trucks.getTruck(i).setDeliveryLocation(value5);
               trucks.getTruck(i).setDriverLicenseNo(driverLic);
               trucks.getTruck(i).setEstKm(estKM);

            }
            trucks.saveTruck();
            for (int i = 0; i < camperTable.getRowCount(); i++)
            {
               String value = camperTable.getModel().getValueAt(i, 0)
                     .toString();
               String value1 = camperTable.getModel().getValueAt(i, 1)
                     .toString();
               String value2 = camperTable.getModel().getValueAt(i, 2)
                     .toString();
               String value3 = camperTable.getModel().getValueAt(i, 3)
                     .toString();
               String value4 = camperTable.getModel().getValueAt(i, 4)
                     .toString();
               String value5 = camperTable.getModel().getValueAt(i, 5)
                     .toString();
               String value6 = camperTable.getModel().getValueAt(i, 6)
                     .toString();
               String value7 = camperTable.getModel().getValueAt(i, 7)
                     .toString();
               String value8 = camperTable.getModel().getValueAt(i, 8)
                     .toString();

               int id = Integer.parseInt(value);
               int estKM = Integer.parseInt(value8);
               int driverLic = Integer.parseInt(value6);
               String[] partsPick = value2.split("/", 3);
               int day = Integer.parseInt(partsPick[0]);
               int month = Integer.parseInt(partsPick[1]);
               int year = Integer.parseInt(partsPick[2]);
               MyDate pickDate = new MyDate(day, month, year);
               String[] partsReturn = value3.split("/", 3);
               int dayReturn = Integer.parseInt(partsReturn[0]);
               int monthReturn = Integer.parseInt(partsReturn[1]);
               int yearReturn = Integer.parseInt(partsReturn[2]);
               MyDate pickReturn = new MyDate(dayReturn, monthReturn,
                     yearReturn);
               campers.getCamperCustomer(i).setId(id);
               campers.getCamperCustomer(i).setNameOfRenter(value1);
               campers.getCamperCustomer(i).setPickUpTime(pickDate);
               campers.getCamperCustomer(i).setReturnTime(pickReturn);
               campers.getCamperCustomer(i).setPickUpLocation(value4);
               campers.getCamperCustomer(i).setDeliveryLocation(value5);
               campers.getCamperCustomer(i).setDriverLicenseNo(driverLic);
               campers.getCamperCustomer(i).setWeekOrWeekend(value7);
               campers.getCamperCustomer(i).setEstKm(estKM);

            }
            campers.saveCampers();
         }
      });

   }
}
