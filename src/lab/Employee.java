
package lab;
public class Employee{
    private String surname;
    private int salary;
    private boolean isHavingChild;
    public static int totalSalary;
    public static int numberOfEmployees;
    public static int amountWithChildren;

    public Employee(String surname, int salary, boolean isHavingChild){
        this.surname = surname;
        this.salary = salary;
        this.isHavingChild = isHavingChild;
        totalSalary += salary;
        numberOfEmployees++;
        if (this.isHavingChild){
            amountWithChildren++;
        }
    }
   public Employee(){
       surname = "Default";
       salary = 0;
       isHavingChild = false;
       numberOfEmployees++;

   }
   public Employee(String surname, int salary){
       this.surname = surname;
       this.salary = salary;
       isHavingChild = true;
       totalSalary += salary;
       numberOfEmployees++;
       amountWithChildren++;
   }
   public String getSurname(){
       return this.surname;
   }
   public void setSurname(String surname){
       this.surname = surname;
   }
    public int getSalary(){
        return this.salary;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
    public boolean getIsHavingChild(){
        return this.isHavingChild;
    }
    public void isHavingChild(boolean isHavingChild){
        this.isHavingChild = isHavingChild;
    }
    public void print(){
        System.out.println(this.surname);
        System.out.println(this.salary);
        System.out.println(this.isHavingChild);
    }
}