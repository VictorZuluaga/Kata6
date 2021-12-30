package kata6;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import toys.*;


public class Kata6 {
    
    public static void main(String[] args) {
        
        ToyBusiness business = new ToyBusiness();
        ArrayList<Car> cars = new ArrayList<>();
        ArrayList<Helicopter> helicopters = new ArrayList<>();
        
        Scanner in = new Scanner(System.in);
        String line = "";
        
        while(!line.equals("exit")){
            line = in.nextLine();
            
            switch(line){
                case "car":
                    cars.add(business.createCar());
                    System.out.println(
                        "built cars: "+cars.stream()
                                .map(c -> c.getSerialNumber().toString())
                                .collect(Collectors.joining(", ")));
                    break;
                    
                    case "helicopter":
                    helicopters.add(business.createHelicopter());
                    System.out.println(
                        "built helicopters: "+helicopters.stream()
                                .map(c -> c.getSerialNumber().toString())
                                .collect(Collectors.joining(", ")));
                    break;
                    
                    case "exit":
                        System.out.println("Exiting...");
                        break;
                        
                    default:
                        System.out.println("command unknown");
                    
                
            }
        }
    }
    
}
