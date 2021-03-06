package kata6_v6;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import toyproduct.Toy;
import business.ToyBusiness;
import factories.regionalfactories.AmericanToyFactory;
import factories.regionalfactories.AsianToyFactory;

public class KATA6_V6{

    public static void main(String[] args) {
        
        //ToyBusiness business = new ToyBusiness(new AmericanToyFactory());
        ToyBusiness business = new ToyBusiness(new AsianToyFactory());
        ArrayList<Toy> toys =  new ArrayList<>();
        
        Scanner in =  new Scanner(System.in);
        String line =  "";
        while(!line.equals("exit")){
            line =  in.nextLine();
            
            switch (line) {
                case "car":
                case "helicopter":
                    toys.add(business.produceToy(line));
                    System.out.println(
                            "Built toys: "+toys.stream()
                                    .map(c -> c.toString())
                                    .collect(Collectors.joining(", ")));
                    break;
                
                case "exit":
                    System.out.println("Exiting...");
                    break;
                    
                default:
                    System.out.println("Command unknown!");
               
            }
        }
    }
    
}
