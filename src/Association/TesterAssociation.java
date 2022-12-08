package Association;

public class TesterAssociation {
    public static void main (String[] args)
    {
        Bank bank = new Bank("BRI");
        Employee emp = new Employee("BI");

        System.out.println(emp.getEmployeeName() +
                " is employee of " + bank.getBankName());
    }
}
