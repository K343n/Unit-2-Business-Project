public class DressABear extends BearService{

// Instance variables
  boolean hasCostume;
  String typeOfCostume;

   /*
 no arguement constructor
 */ 
  public DressABear () {
    hasCostume = false;
    typeOfCostume = "none chosen";
  }

/*
parameterized constructor
*/ 
  public DressABear(String type, String material, double price, boolean hasCostume, String typeOfCostume){
    super(type, material, price);
    this.hasCostume = hasCostume;
    this.typeOfCostume = typeOfCostume;
  }
/*
Accessor and Mutator methods for HasCostume
  */ 
  public boolean getHasCostume(){
    return hasCostume;
  }
  public void setHasCostume (boolean hasCostume){
    this.hasCostume = hasCostume;
  }
/*
Accessor and Mutator methods for typeOfCostume
  */ 
  public String getTypeOfCostume(){
    return typeOfCostume;
  }
  public void setTypeOfCostume (String typeOfCostume){
    this.typeOfCostume = typeOfCostume;
  }

/* to string method override
* public String toString(){
  */ 
  public String toString(){
    return super.toString() + "\nHas Costume? " + hasCostume + "\nType of Costume: " + typeOfCostume;
  }


}

