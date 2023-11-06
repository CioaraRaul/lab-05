package test;

public class Employee {
    private String name;
    private String email;
    private double hourRate;
    private int capacity;
    private double freeDays;
    private double dailyIncome;
    private double monthlyIncome;
    public Employee(String name, String email, double hourRate, int capacity, double freeDays){
        this.name = name;
        this.email = email;
        this.hourRate = hourRate;
        this.capacity = capacity;
        this.freeDays = freeDays;

    }
    public void setName(String name){
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setHourRate(double hourRate) {
        this.hourRate = hourRate;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setFreeDays(double freeDays) {
        this.freeDays = freeDays;
    }

    public String getName(){
        return this.name;
    }

    public String getEmail() {
        return email;
    }

    public double getHourRate() {
        return hourRate;
    }

    public int getCapacity() {
        return capacity;
    }

    public double getFreeDays() {
        return freeDays;
    }
    public double getCalculateDailyIncome(){
        return this.capacity * this.hourRate;
    }

    public double getCalculateMonthlyIncome(){
       return this.monthlyIncome = getCalculateDailyIncome() * 30 - (this.freeDays * this.hourRate* this.capacity);
    }


}
