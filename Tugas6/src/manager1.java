package dpraktek6;

public class manager1 extends Employee {
    private double bonus;
    public manager1(String name, double salary, int year, int month, int day){
    super(name, salary, year, month, day);
    bonus = 0;
    }

    public void setBonus(double bonus){
    this.bonus = bonus;
    }
    public double getSalary(){
    double baseSalary = super.getSalary();
    return baseSalary+bonus;
    }
   
   }