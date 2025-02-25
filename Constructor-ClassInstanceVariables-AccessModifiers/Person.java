public class Person {
    private String name;
    private int age;
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    public Person(Person otherPerson){
        this.name=otherPerson.name;
        this.age=otherPerson.age;
    }
    public void displayDetails(){
        System.out.println("Name:"+name+" Age:"+age);
    }
    public static void main(String[] args) {
        Person person1=new Person("Kartik",22);
        person1.displayDetails();
        Person person2=new Person(person1);
        person2.displayDetails();
    }
}
