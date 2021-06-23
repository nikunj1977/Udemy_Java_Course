package CarDealershipAssignment;

public class Employee {
    double loamAmount;
    public void handleCustomer(Customer cust, boolean finance, Vehicle vehicle) {
        if (finance == true && vehicle.getPrice() > cust.getCashOnHand()) {
            double loamAmount = vehicle.getPrice() - cust.getCashOnHand();
            runCreditHistory(cust, loamAmount);
        }else if(vehicle.getPrice() <=cust.getCashOnHand()){
            processTransaction(cust,vehicle);
        }else {
            System.out.println("Customer " +cust.getName() + " will need more money to purchase the vechile: " + vehicle);
        }

    }

    public void runCreditHistory(Customer cust,double loanAmount){

        System.out.println("Ran credit history for "+ cust.getName()+ "and required loan about is .. " + loanAmount);

    }

    public void processTransaction(Customer cust, Vehicle vehicle){
        System.out.println("Customer "+ cust.getName() +" has purchased the vehicle :" + vehicle + "for the price  "
                + vehicle.getPrice() );
    }

}
