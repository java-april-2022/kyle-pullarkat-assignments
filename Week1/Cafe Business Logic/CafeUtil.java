import java.util.ArrayList;

// this file has all the functions, whereas TestCafe is where everything is called

public class CafeUtil {

    // #1 Get Streak Goal
    public int getStreakGoal(){
        int sum = 0;
        for(int week = 1; week <= 10; week++){
            sum+= week;
        }
        return sum;
    }


    // #2 Get Order Total

    public double getOrderTotal(double[] lineItems){
        double sum = 0;

        for (double price: lineItems) {
            sum += price;
        
        }
        return sum;
    }

    
    // #3 add Customer 
    public void addCustomer(ArrayList<String> customerList){
            System.out.println("Please enter your name:");
            String userName = System.console().readLine();
            System.out.printf("Hello, %s! ", userName);
            // uses list size to show how many people are ahead
            System.out.printf("There are %s people ahead of you.\n", customerList.size());
            customerList.add(userName);
            System.out.println(customerList);
        }

        // #4 Display Menu
    public void displayMenu(ArrayList<String> menuItems) {

        for (int id = 0; id < menuItems.size(); id++) {
            System.out.printf("%s %s \n", id, menuItems.get(id));
        }
    }

}