public class BearService{

// Instance variables
  private String type;
  private String material;
  private double price;

// no arguement constructor
  public BearService(){
    type = "no bear";
    material = "none chosen";
    price = 0.0;
  }
// parameterized constructor
  public BearService(String type, String material, double price){
    this.type = type;
    this.material = material;
    this.price = price;
  }
/*
Accessor and Mutator methods
  */ 
/*
* Accessor and mutator method for type of bear
  */
  public String getType(){
    return type;
  }
  public void setType (String type){
    this.type = type;
  }
  /*
* Accessor and mutator method for material of bear
  */
  public String getMaterial(){
    return material;
}
  public void setMaterial(){
    this.material = material;
  }
/*
* Accessor and mutator method for type of bear
  */
  public double getPrice(){
    return price;
}
  public void setPrice(){
    this.price = price;
  }

/* to string method override
* public String toString(){
  */ 

  public String toString(){
    return "Type: " + type + "\nMaterial: "+ material + "\nPrice: " + price;
  }
}