//1.1 Problem

package taskstwo;
public class Person {

   private String name;
   private static int age = 18;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }

   public static void main(String[] args) {

    Person person1 = new Person("Caesar", age);
    System.out.println(person1.getName() + " is " + person1.getAge() + " years old.");
    }
}

//  Output :
//        Caesar is 18 years old.