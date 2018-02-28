import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Campers
{
   private ArrayList<Camper> campers;

   public Campers()
   {
      campers = new ArrayList<Camper>();
   }

   // Creates a new
   public void addCamperCostumer(Camper obj)
   {
      if (campers.size() < 6)
      {

         obj.setId(campers.size());
         campers.add(obj);
      }
   }

   public void addCamperCostumer(String nameOfRenter, MyDate pickUpTime,
         MyDate returnTime, String pickUpLocation, String deliveryLocation,
         String WeekOrWeekend, int estKm, int driverLicenseNo, int id)
   {
      if (campers.size() < 6)
      {
         id = campers.size();
         Camper temp = new Camper(nameOfRenter, pickUpTime, returnTime,
               pickUpLocation, deliveryLocation, driverLicenseNo,
               WeekOrWeekend, estKm, id);

         campers.add(temp);
      }
   }

   public Camper getCamperCustomer(int id)
   {
      return campers.get(id);
   }

   // Resets all the IDs in order to avoid ID dublication, Called every time a
   // element is removed
   private void resetId()
   {
      for (int i = 0; i < campers.size(); i++)
      {
         campers.get(i).setId(i);
      }
   }

   public void removeCamperCustomer(int id)
   {
      campers.remove(id);
      resetId();
   }

   public int getNumberOfCamperCustomers()
   {
      return campers.size();
   }

   // Writes Objects to file
   public void saveCampers()
   {
      ObjectOutputStream out = null;
      try
      {
         File file = new File("campers");
         FileOutputStream fos = new FileOutputStream(file);
         out = new ObjectOutputStream(fos);
         out.writeObject(campers);

      }
      catch (IOException e)
      {
         System.out.println("Exception in cars");
      }
      finally
      {
         try
         {
            out.close();
         }
         catch (IOException e)
         {
            e.printStackTrace();
         }
      }
   }

   // Read objects from the file
   public void readCampers()
   {
      ObjectInputStream in = null;
      campers = null;
      try
      {
         File file = new File("campers");
         FileInputStream fis = new FileInputStream(file);
         in = new ObjectInputStream(fis);
         @SuppressWarnings("unchecked")
         ArrayList<Camper> readObject = (ArrayList<Camper>) in.readObject();
         campers = readObject;

      }
      catch (IOException | ClassNotFoundException e)
      {
         e.printStackTrace();
      }
      finally
      {
         try
         {
            in.close();
         }
         catch (IOException e)
         {
            e.printStackTrace();
         }
      }
   }
}
