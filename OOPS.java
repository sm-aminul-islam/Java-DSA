import encapsulation.Encapsulation;

public class OOPs {
    public static void main(String[] args) {
      person p1=new person("Robin",30);
       person p2=new person();
       p2.name="Raja";
       p2.age=22;
//        System.out.println(p1.name+" "+p1.age);
//        System.out.println(p2.name+" "+p2.age);
        p1.walk(2);
        p1.walk();
        System.out.println(person.count);
        Developer d1=new Developer("shohan",30);
        d1.walk();
        Encapsulation obj=new Encapsulation();


    }
}
class  Developer extends person{
  public  Developer(String name,int age){
      super(name, age);
  }
  void walk(){
      System.out.println("Developer"+name+" is walking");
  }
}

class  person{
    String name;
    int age;
    static  int count;
    //default constructor checking
    public person(){
        count++;
        System.out.println("creating a new object");
    }
    public  person(String name,int age){
       this. name=name;
       this.age=age;

    }
    void walk(){
        System.out.println(name+" is walking");
    }
    void  eat(){
        System.out.println(name+" is eating ");
    }
    void walk(int steps){
        System.out.println(name+" walked "+steps+" steps");
    }
    void doWork(){
        System.out.println("person is working");
    }
}
