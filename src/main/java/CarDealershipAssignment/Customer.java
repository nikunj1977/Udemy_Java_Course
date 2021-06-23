package CarDealershipAssignment;


public class Customer {

    private String name;
    private String address;
    private double cashOnHand;

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCashOnHand(double cashOnHand) {
        this.cashOnHand = cashOnHand;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public double getCashOnHand() {
        return cashOnHand;
    }



    public void purchseCar(Vehicle vehicle, Employee emp, boolean finance){
        emp.handleCustomer(this, finance,vehicle);
    }
}
