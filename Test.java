import java.util.*;

import javafx.scene.effect.Light.Spot;
public class Test {  
    
    
    public static void main(String[] args) {      
        
        int [] arr = {5, 1, 4, 6, 7, 3, 5, 7, 3} ;   

        System.out.println("TEST 1");  
        System.out.println("Duplicate elements in given array: ");  
        for(int i = 0; i < arr.length; i++) {  
            for(int j = i + 1; j < arr.length; j++) {  
                if(arr[i] == arr[j])  
                    System.out.println(arr[j]);  
            }  
        }

        System.out.println();
        System.out.println();

        System.out.println("TEST 2");
        for(int i = 1; i <= 6; i++) {  
            for(int i2 = 1 ; i2 <= i; i2++) {  
              
                    System.out.print(i);  
            }  
            System.out.println();  
        }
        
        System.out.println();
        System.out.println();

        System.out.println("TEST 3");
        Scanner scan = new Scanner(System.in);
    

        People people_hired = new People();
        People people_permanent = new People();
        People people_resined = new People();

        System.out.print("Enter the number of newly hired males:");
        people_hired.males = scan.nextInt();
        System.out.print("Enter the number of newly hired females:");
        people_hired.females = scan.nextInt();

        System.out.print("Enter the number of permanent position males:");
        people_permanent.males = scan.nextInt();
        System.out.print("Enter the number of permanent position females:");
        people_permanent.females = scan.nextInt();

        System.out.print("Enter the number of resigned males:");
        people_resined.males = scan.nextInt();
        System.out.print("Enter the number of resigned females:");
        people_resined.females = scan.nextInt();

        System.out.println();
        System.out.println("===");
        System.out.println("Thank you for the Information");
        System.out.println("===");
        System.out.println("Here is the Summary !!!");
        System.out.println();

        System.out.println("Number of hired employee = "+ (int)people_hired.total()); 
        System.out.printf("Male = %.2f%%%n", people_hired.male_percentage());
        System.out.printf("Female = %.2f%%%n", people_hired.female_percentage());

        System.out.println("Number of Permanent Employee = "+ (int)people_permanent.total()); 
        System.out.printf("Male = %.2f%%%n", people_permanent.male_percentage());
        System.out.printf("Female = %.2f%%%n", people_permanent.female_percentage());

        System.out.println("Number of Resigned Employee = "+ (int)people_resined.total()); 
        System.out.printf("Male = %.2f%%%n", people_resined.male_percentage());
        System.out.printf("Female = %.2f%%%n", people_resined.female_percentage());

      
    }  

    
}  