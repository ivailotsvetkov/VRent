import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import java.util.ArrayList;

public class Trucks
{

   private ArrayList<Truck> trucks;

   public Trucks()
   {
      trucks = new ArrayList<Truck>();
   }

   // Creates a new
   public void addTruckCostumer(Truck obj)
   {
      if (trucks.size() < 4)
      {
         int id = trucks.size();
         obj.setId(id);
         trucks.add(obj);
      }
   }

   public void addTruckCostumer(String nameOfRenter, MyDate pickUpTime,
         MyDate returnTime, String pickUpLocation, String deliveryLocation,
         int estKm, int driverLicenseNo)
   {
      if (trucks.size() < 4)
      {
         int id = trucks.size();
         Truck temp = new Truck(nameOfRenter, pickUpTime, returnTime,
               pickUpLocation, deliveryLocation, driverLicenseNo, estKm, id);
         trucks.add(temp);
      }
   }

   public Truck getTruck(int id)
   {
      return trucks.get(id);
   }

   // Resets all the IDs in order to avoid ID dublication, Called every time a
   // element is removed
   public void resetId()
   {
      for (int i = 0; i < trucks.size(); i++)
      {
         trucks.get(i).setId(i);
      }
   }

   public void removeTruck(int id)
   {
      trucks.remove(id);
      resetId();
   }

   public int getNumberOfTrucks()
   {
      return trucks.size();
   }

   // Writes Objects to file
   public void saveTruck()
   {
      ObjectOutputStream out = null;
      try
      {
         File file = new File("trucks");
         FileOutputStream fos = new FileOutputStream(file);
         out = new ObjectOutputStream(fos);
         out.writeObject(trucks);

      }
      catch (IOException e)
      {

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
   public void readTrucks()
   {
      ObjectInputStream in = null;
      trucks = null;
      try
      {
         File file = new File("trucks");
         FileInputStream fis = new FileInputStream(file);
         in = new ObjectInputStream(fis);
         @SuppressWarnings("unchecked")
         ArrayList<Truck> readObject = (ArrayList<Truck>) in.readObject();
         trucks = readObject;

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
