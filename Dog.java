
/**  Write a Java program to create a class called "Dog" with a name and breed attribute.
     Create two instances of the "Dog" class, set their attributes using the constructor and
     modify the attributes using the setter methods and print the updated values. **/
public class Dog {
    private String name;
    private String breed;
    public Dog(String name,String breed){
        this.name=name;
        this.breed=breed;
    }
    public String getname(){
        return this.name;
    }
    public void setname(String name){
        this.name=name;
    }
    public String getbreed(){
        return this.breed;
    }
    public void setbreed(String breed){
        this.breed=breed;
    }

    @Override
    public String toString() {
        return "Name : "+name+", Breed : "+breed;
    }
    public static void main(String[] args) {
        Dog d1 =new Dog("Buddy", "Golden Retriever");
        Dog d2 =new Dog("Charlie", "Bulldog");
        System.out.println(d1);
        System.out.println(d2);
        d1.setname("villan");
        d2.setbreed("puppy");
        System.out.println(d1);
        System.out.println(d2);
        System.out.println("End the program ");
         //  no need this line so remove the last print statement.
    }
}
