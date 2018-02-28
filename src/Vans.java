import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import java.util.ArrayList;

public class Vans 
{


   private ArrayList<Van> vans;

   public Vans()
   {
      vans = new ArrayList<Van>();
   }

   // Creates a new
   public void addVanCostumer(Van obj)
   {
      if (vans.size() < 12)
      {
         int id = vans.size();
         obj.setId(id);
         vans.add(obj);
      }
   }

   public void addVanCostumer(String nameOfRenter, MyDate pickUpTime,
         MyDate returnTime, String pickUpLocation, String deliveryLocation,
         int estKm, int size, int driverLicenseNo)
   {
      if (vans.size() < 12)
      {
         int id = vans.size();
         Van temp = new Van(nameOfRenter, pickUpTime, returnTime,
               pickUpLocation, deliveryLocation, driverLicenseNo, estKm, size,
               id);
         vans.add(temp);
      }
   }

   public Van getVan(int id)
   {
      return vans.get(id);
   }

   // Resets all the IDs in order to avoid ID dublication, Called every time a
   // element is removed
   public void resetId()
   {
      for (int i = 0; i < vans.size(); i++)
      {
         vans.get(i).setId(i);
      }
   }

   public void removeVan(int id)
   {
      vans.remove(id);
      resetId();
   }

   public int getNumberOfVans()
   {
      return vans.size();
   }

   // Writes Objects to file
   public void saveVans()
   {
      ObjectOutputStream out = null;
      try
      {
         File file = new File("vans");
         FileOutputStream fos = new FileOutputStream(file);
         out = new ObjectOutputStream(fos);
         out.writeObject(vans);

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
   public void readVans()
   {
      ObjectInputStream in = null;
      vans = null;
      try
      {
         File file = new File("vans");
         FileInputStream fis = new FileInputStream(file);
         in = new ObjectInputStream(fis);
         @SuppressWarnings("unchecked")
         ArrayList<Van> readObject = (ArrayList<Van>) in.readObject();
         vans = readObject;

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
