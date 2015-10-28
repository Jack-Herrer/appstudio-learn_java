class Flea {
   
   // Properties of the class...
   public String name;
   
   // Constructor of the class...
   public Flea(String aName) {
      name = aName;
   }

   // Methods of the class...
   public String toString() {
      return "I am a flea called " + name;
   }

}

class Dog {

   // Properties of the class...
   public String name;
   private int    age;
   public Flea   dogsFlea;

   // Constructor of the class...
   public Dog(String aName, int anAge, Flea aFlea) {
      name     = aName;
      age      = anAge;
      dogsFlea = aFlea;
   }
   public String toString() {
    return "I am a dog called " + name +
    " \nmy age is " + age +
    " \nI have a flea called " + dogsFlea.name + "\n";
    }
}

class DogOwner {

    public String name;
    public int    salary;
    public Dog    ownersDog;
    
    public DogOwner(String aName, int aSalary, Dog aDog) {
    name   = aName;
    salary = aSalary;
    ownersDog = aDog;
    }
    public String toString() {
    return "I am " + name +
    "\nmy salary is " + salary +
    "\nmy dog is " + ownersDog.name;
    }
}

class DogTest {

   // The main method is the point of entry into the program...
   public static void main(String[] args) {
    Flea p = new Flea("Pop");
    Flea s = new Flea("Squeak");
    Flea z = new Flea("Zip");
    
    Dog r = new Dog("Rex",  3,p);
    Dog j = new Dog("Jimbo",4,s);
    Dog f = new Dog("Fido", 5,z);
    
    System.out.println(r.toString());
    System.out.println(j.toString());
    System.out.println(f.toString());
    
    DogOwner a = new DogOwner("Angus",  10000,r);
    DogOwner b = new DogOwner("Brian",  20000,j);
    DogOwner c = new DogOwner("Charles",30000,f);
    
    System.out.println(a.toString());
    System.out.println(b.toString());
    System.out.println(c.toString());
    
    System.out.println(a.ownersDog.dogsFlea.toString());
   }
}

