package CarDealershipAssignment;

public class Dealership {

    public static void main(String[] args) {
        Customer cust1 = new Customer();
        cust1.setName("Tom");
        cust1.setAddress( "27 Coxwell Boulevard");
        cust1.setCashOnHand( 20000);

        Vehicle vehicle = new Vehicle("Honda","Accord",15000);


        Employee emp = new Employee();

        cust1.purchseCar(vehicle,emp,true);

       /*
       handleCustomer(Customer cust,boolean finance, Vehicle vehicle)
       if(finance == true)
            runCreditHistory(Customer cust, double doubleAmount)
       else if (vehicle.getPrice() <= cust.getCashOnHans());
            processTransaction(Customer cust, Vehicle vehicle)
       else:
            System.out.println("Tell customer to bring more money");
       * */



    }

}
