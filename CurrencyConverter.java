import java.util.*;
import java.text.DecimalFormat;

class CurrencyConverter
{
    public static void main(String[] args) 
        {
            double taka = 1.00;
			double rupee = 1.22;
			double dollar = 84.35;
			double pound = 110.41;
			double euro = 95.09;
			double yen = 0.76;
			double cad = 63.30;
			double aud = 60.48;
			double sgd = 62.38;
			double cnh = 12.55;
			double code;
			
            DecimalFormat f = new DecimalFormat("##.###");

            Scanner sc = new Scanner(System.in);

            System.out.println
			("Enter The Currency Code \n1:Taka\n2:Rupee\n3:Dollar\n4:Pound\n5:Euro\n6:Yen\n7:Canadian Dollar\n8:Australian Dollar\n9:Singaporean Dollar\n10:Chinese Huan"); 
            
			code = sc.nextInt();

            //For BDT Conversion
            if(code == 1)
            {
                System.out.println("Enter amount in Taka");
                takaInp = sc.nextFloat();
                 
                rupee = takaInp / 1.22;
                System.out.println("Dollar : "+f.format(dollar));
				
				dollar = takaInp / 84.35;
                System.out.println("Dollar : "+f.format(dollar));
				
				pound = takaInp / 110.41;
                System.out.println("Dollar : "+f.format(dollar));
				
				

            }

            //For Dollar Conversion
            else if (code == 2)
            {
                System.out.println("Enter amount in dollar");
                dollar = sc.nextFloat();

                
            }

            //For Pound Conversion
            else if(code == 3)
            {
                System.out.println("Enter amount in Pound");
                pound = sc.nextFloat();

               
            }

            //For Euro Conversion
            else if(code == 4)
            {
                System.out.println("Enter amount in Euro");
                euro = sc.nextFloat();

                
            }

            //For Yen Conversion
            else if(code == 5)
            {
                System.out.println("Enter amount in Yen");
                yen = sc.nextFloat();

                
            }

            else
                System.out.println("Invalid Code");

    }
                
}
