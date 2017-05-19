/**
 * Created by arkan on 19.05.2017.
 */
public class TestJavaCore2 {
   public static void main(String[] argc){

       Employee e_first = new Employee("Adam", 2500, 24, 2);
       Employee e_second = new Employee("Bear", 3000, 32, 10);
       Manager m_first = new Manager("Don", 3500, 27, 5, 500);
       Manager m_second = new Manager("Don", 3500, 27, 5, 500);
       DiferentEmployee d_first = new DiferentEmployee("Adam", 26);
       System.out.println("e_1: " + e_first.getClass() + ", m_1: " + m_first.getClass() + ", d_1: " + d_first.getClass());
       System.out.println("e1.equals(m1): " + e_first.equals(m_first));     // false
       System.out.println("m1.equals(e1): " + m_first.equals(e_first));     // false
       System.out.println("e1.equals(e2): " + e_first.equals(e_second));    // false
       System.out.println("e1.name.equals(m1.name): " + e_first.getName().equals(d_first.getPseudo())); // true - the same value
       System.out.println(m_first instanceof Manager);
       System.out.println("pod instanceof nad: " + (m_first instanceof Employee)); // podklasa instanceof nadklasa true
       System.out.println("nad instanceof pod: " + (e_first instanceof Manager));  // nadklasa instanceof podklasa false
       /* The same effect like above but with getClass function: */
       System.out.println("m1 == e1: " + (m_first.getClass() == e_first.getClass())); // different class
       System.out.println("e1 == e2: " + (e_first.getClass() == e_second.getClass())); // the same class
       System.out.println();
   }
}

class Employee{
    private String name;
    private int salary, age, timeOfWork;
    public Employee(String name, int salary, int age, int timeOfWork){
        this.name = name;
        this.setSalary(salary);
        this.age = age;
        this.timeOfWork = timeOfWork;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setTimeOfWork(int timeOfWork){
        this.timeOfWork = timeOfWork;
    }
    public String getName(){return name;}
    public int getSalary(){return salary;}
    public int getAge() {return age;}
    public int getTimeOfWork(){return timeOfWork;}
}

class Manager extends Employee{
    private int bonus;
    public Manager(String name, int salary, int age, int timeOfWork, int bonus){
        super(name, salary, age, timeOfWork);
        this.bonus = bonus;
    }
}

class DiferentEmployee{
    String pseudo;
    int age;
    public DiferentEmployee(String pseudo, int age){
        this.pseudo = pseudo;
        this.age = age;
    }
    public String getPseudo(){
        return pseudo;
    }
}
