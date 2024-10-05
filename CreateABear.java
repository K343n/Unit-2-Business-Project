public class CreateABear extends BearService{

  // Instance variables
  String typeOfHeart;

  // no arguement constructor
  public CreateABear(){
    typeOfHeart = "none selected";
  }
// parameterized constructor
  public CreateABear(String type, String material, double price, String typeOfHeart){
    super(type, material, price);
    this.typeOfHeart = typeOfHeart;
  }
/*
Accessor and Mutator methods
  */ 

  public String getTypeOfHeart(){
    return typeOfHeart;
  }
  public void setTypeOfheart (String typeOfheart){
    this.typeOfHeart = typeOfHeart;
  }


/* to string method override
* public String toString(){
  */ 
  public String toString(){
    return super.toString() + "\nType of Heart: " + typeOfHeart;
  }
}

