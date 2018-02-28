import java.awt.event.*;

import javax.swing.*;

;
public class CarGUI
{

   JLabel lblDeliveryLoc = new JLabel("Delivery location:");
   JLabel lblDriverLicenceNumber = new JLabel("Driver licence number:");
   JLabel lblDayRet = new JLabel("Day:");
   JLabel lvlMonthRet = new JLabel("Month:");
   JLabel lvlYearRet = new JLabel("Year:");
   JLabel lblDayPick = new JLabel("Day:");
   JLabel lblMonthPick = new JLabel("Month:");
   JLabel lblYearPick = new JLabel("Year:");
   JLabel lblName = new JLabel("Name:");
   JLabel lblPickUpTime = new JLabel("Pick up time: ");
   JLabel lblReturnTime = new JLabel("Return time: ");
   JLabel lblPickUpLoc = new JLabel("Pick up location: ");
   JFrame frame = new JFrame();
   JTextField textFieldName = new JTextField(20);
   JTextField textField_DriverLic = new JTextField(20);
   JTextField textField_PickUpLoc = new JTextField(20);
   JTextField textFieldDayPick = new JTextField(20);
   JTextField textMonthPick = new JTextField(20);
   JTextField textFieldYearPick = new JTextField(20);
   JTextField textField_DeliveryLoc = new JTextField(20);
   JButton btnAdd = new JButton("Add");
   JButton btnCancel = new JButton("Cancel");
   JTextField textFieldMonthReturn = new JTextField(20);
   JTextField textFieldDayReturn = new JTextField(20);
   JTextField textFieldYearReturn = new JTextField(20);

   JTextField textFieldCarPref = new JTextField(20);
   JTextField textField_EstKm = new JTextField(20);
   JLabel lblEstimatedKm = new JLabel("Estimated KM:");
   JLabel lblCarPref = new JLabel("Car Preference:");

   public CarGUI()
   {

      initialize();
      settingBounds();
      addingToFrame();

   }

   /**
    * Initialize the contents of the frame.
    */
   private void addingToFrame()
   {
      frame.getContentPane().add(textField_DeliveryLoc);
      frame.getContentPane().add(lblDeliveryLoc);
      frame.getContentPane().add(textFieldName);
      frame.getContentPane().add(lblName);
      frame.getContentPane().add(lblPickUpTime);
      frame.getContentPane().add(lblReturnTime);
      frame.getContentPane().add(btnCancel);
      frame.getContentPane().add(lblPickUpLoc);
      frame.getContentPane().add(textFieldMonthReturn);
      frame.getContentPane().add(textField_DriverLic);
      frame.getContentPane().add(textField_PickUpLoc);
      frame.getContentPane().add(textFieldDayPick);
      frame.getContentPane().add(lblDayRet);
      frame.getContentPane().add(lvlYearRet);
      frame.getContentPane().add(textMonthPick);
      frame.getContentPane().add(textFieldYearReturn);
      frame.getContentPane().add(textFieldYearPick);
      frame.getContentPane().add(lblDayPick);
      frame.getContentPane().add(btnAdd);
      frame.getContentPane().add(lblMonthPick);
      frame.getContentPane().add(lblDriverLicenceNumber);
      frame.getContentPane().add(textFieldDayReturn);
      frame.getContentPane().add(lvlMonthRet);
      frame.getContentPane().add(lblYearPick);
      frame.getContentPane().add(lblEstimatedKm);
      frame.getContentPane().add(lblCarPref);
      frame.getContentPane().add(textFieldCarPref);
      frame.getContentPane().add(textField_EstKm);

   }

   private void initialize()
   {
      frame.setTitle("Car GUI");
      frame.getContentPane().setLayout(null);
      frame.setBounds(400, 150, 500, 500);
      frame.setVisible(true);
      frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      frame.setResizable(false);
      btnCancel.addMouseListener(new MouseAdapter()
      {
         @Override
         public void mouseClicked(MouseEvent e)
         {
            frame.dispose();
         }
      });

   }

   private void settingBounds()
   {
      textFieldCarPref.setBounds(227, 316, 232, 20);
      textFieldName.setBounds(217, 56, 242, 20);
      lblName.setBounds(42, 58, 63, 17);
      lblPickUpTime.setBounds(42, 98, 100, 14);
      textField_DriverLic.setBounds(227, 275, 232, 20);
      lblReturnTime.setBounds(42, 179, 89, 14);
      textField_PickUpLoc.setBounds(267, 134, 192, 20);
      lblPickUpLoc.setBounds(42, 136, 110, 17);
      textFieldDayPick.setBounds(171, 95, 46, 20);
      textMonthPick.setBounds(310, 95, 46, 20);
      textFieldYearPick.setBounds(413, 95, 46, 20);
      lblDeliveryLoc.setBounds(42, 222, 100, 14);
      textField_DeliveryLoc.setBounds(227, 220, 232, 17);
      btnAdd.setBounds(211, 417, 89, 23);
      btnCancel.setBounds(310, 417, 89, 23);
      lblDayPick.setBounds(144, 98, 73, 14);
      lblMonthPick.setBounds(254, 98, 46, 14);
      lblYearPick.setBounds(371, 98, 46, 14);
      textFieldMonthReturn.setBounds(282, 176, 46, 20);
      textFieldDayReturn.setBounds(171, 176, 46, 20);
      textFieldYearReturn.setBounds(413, 176, 46, 20);
      lvlYearRet.setBounds(357, 179, 46, 14);
      lvlMonthRet.setBounds(226, 179, 46, 14);
      lblDayRet.setBounds(143, 179, 37, 14);
      lblDriverLicenceNumber.setBounds(42, 278, 192, 14);
      lblCarPref.setBounds(42, 319, 110, 14);
      lblEstimatedKm.setBounds(42, 360, 100, 14);
      textField_EstKm.setBounds(227, 357, 232, 20);
   }

}
