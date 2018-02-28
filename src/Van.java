import java.io.Serializable;

public class Van implements Serializable
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
   private int size;
   private int id;
   private int estKm;

   public Van(String nameOfRenter, MyDate pickUpTime, MyDate returnTime,
         String pickUpLocation, String deliveryLocation, int driverLicenseNo,
         int size, int estKm, int id)
   {
      this.nameOfRenter = nameOfRenter;
      this.pickUpTime = pickUpTime;
      this.returnTime = returnTime;
      this.pickUpLocation = pickUpLocation;
      this.deliveryLocation = deliveryLocation;
      this.driverLicenseNo = driverLicenseNo;
      this.id = id;
      this.size = size;
      this.estKm = estKm;

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

   public int getSize()
   {
      return size;
   }

   public void setSize(int size)
   {
      this.size = size;
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
