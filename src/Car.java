import java.io.Serializable;

public class Car implements Serializable
{
   /**
    * 
    */
   private static final long serialVersionUID = 1L;
   private String nameOfRenter;
   private MyDate pickUpTime;
   private MyDate returnTime;
   private String pickUpLocation;
   private String deliveryLocation;
   private int driverLicenseNo;
   private int id;
   private String carPreference;
   private int estKm;

   public Car(String nameOfRenter, MyDate pickUpTime, MyDate returnTime,
         String pickUpLocation, String deliveryLocation, int driverLicenseNo,
         String carPreference, int estKm, int id)
   {
      this.nameOfRenter = nameOfRenter;
      this.pickUpTime = pickUpTime;
      this.returnTime = returnTime;
      this.pickUpLocation = pickUpLocation;
      this.deliveryLocation = deliveryLocation;
      this.driverLicenseNo = driverLicenseNo;
      this.carPreference = carPreference;
      this.estKm = estKm;
      this.setId(id);
   }

   public String getNameOfRenter()
   {
      return nameOfRenter;
   }

   public void setNameOfRenter(String nameOfRenter)
   {
      this.nameOfRenter = nameOfRenter;
   }

   public MyDate getPickUpTime()
   {
      return pickUpTime;
   }

   public void setPickUpTime(MyDate pickUpTime)
   {
      this.pickUpTime = pickUpTime;
   }

   public MyDate getReturnTime()
   {
      return returnTime;
   }

   public void setReturnTime(MyDate returnTime)
   {
      this.returnTime = returnTime;
   }

   public String getPickUpLocation()
   {
      return pickUpLocation;
   }

   public void setPickUpLocation(String pickUpLocation)
   {
      this.pickUpLocation = pickUpLocation;
   }

   public String getDeliveryLocation()
   {
      return deliveryLocation;
   }

   public void setDeliveryLocation(String deliveryLocation)
   {
      this.deliveryLocation = deliveryLocation;
   }

   public int getDriverLicenseNo()
   {
      return driverLicenseNo;
   }

   public void setDriverLicenseNo(int driverLicenseNo)
   {
      this.driverLicenseNo = driverLicenseNo;
   }

   public int getId()
   {
      return id;
   }

   public void setId(int id)
   {
      this.id = id;
   }

   public String getCarPreference()
   {
      return carPreference;
   }

   public void setCarPreference(String carPreference)
   {
      this.carPreference = carPreference;
   }

   public int getEstKm()
   {
      return estKm;
   }

   public void setEstKm(int estKm)
   {
      this.estKm = estKm;
   }
}
