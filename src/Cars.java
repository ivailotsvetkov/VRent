import java.util.ArrayList;
import java.io.*;

public class Cars
{

   private ArrayList<Car> cars;

   public Cars()
   {
      cars = new ArrayList<Car>();
   }

   // Creates a new
   public void addCarCostumer(Car obj)
   {
      if (cars.size() < 27)
      {

         obj.setId(cars.size());
         cars.add(obj);
      }
   }

   public void addCarCostumer(String nameOfRenter, MyDate pickUpTime,
         MyDate returnTime, String pickUpLocation, String deliveryLocation,
         String carPreference, int estKm, int driverLicenseNo, int id)
   {
      if (cars.size() < 27)
      {
         id = cars.size();
         Car temp = new Car(nameOfRenter, pickUpTime, returnTime,
               pickUpLocation, deliveryLocation, driverLicenseNo,
               carPreference, estKm, id);

         cars.add(temp);
      }
   }

   public Car getCarCustomer(int id)
   {
      return cars.get(id);
   }

   // Resets all the IDs in order to avoid ID dublication, Called every time a
   // element is removed
   private void resetId()
   {
      for (int i = 0; i < cars.size(); i++)
      {
         cars.get(i).setId(i);
      }
   }

   public void removeCarCustomer(int id)
   {
      cars.remove(id);
      resetId();
   }

   public int getNumberOfCarCustomers()
   {
      return cars.size();
   }

   // Writes Objects to file
   public void saveCars()
   {
      ObjectOutputStream out = null;
      try
      {
         File file = new File("cars");
         FileOutputStream fos = new FileOutputStream(file);
         out = new ObjectOutputStream(fos);
         out.writeObject(cars);

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
   public void readCars()
   {
      ObjectInputStream in = null;
      cars = null;
      try
      {
         File file = new File("cars");
         FileInputStream fis = new FileInputStream(file);
         in = new ObjectInputStream(fis);
         @SuppressWarnings("unchecked")
         ArrayList<Car> readObject = (ArrayList<Car>) in.readObject();
         cars = readObject;

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
