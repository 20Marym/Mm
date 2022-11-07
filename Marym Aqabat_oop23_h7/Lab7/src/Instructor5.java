public class Instructor5 extends Person7 {
    private double salary;
    public Instructor5(String name, String YearOfBirth, double salary)
    {
        super(name,YearOfBirth);
        this.salary=salary;
    }
    public String toString()
    {
        String fullInfo=super.toString()+" "+salary;
        return fullInfo;
    }
}
