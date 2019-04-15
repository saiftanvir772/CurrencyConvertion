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
			
			
            String pattern = "##.##";
			DecimalFormat f = new DecimalFormat(pattern);

            Scanner sc = new Scanner(System.in);

            String x = "Enter The Currency Code \n1:Taka\n2:Rupee\n3:Dollar\n4:Pound\n5:Euro\n6:Yen\n7:Canadian Dollar\n8:Australian Dollar\n9:Singaporean Dollar\n10:Chinese Huan";
        System.out.println(x);
            
            System.out.print("Enter Your Choice : ");
			int code = sc.nextInt();
                
            
            switch (code) {
                case 1:
                // For Taka Conversion
                 System.out.print("Enter the amount in BDT : ");    
                 int amount1 = sc.nextInt();   
                double taka_res1 = amount1/taka;
                System.out.println("Taka : " + f.format(taka_res1));
                double rupee_res1 = amount1/rupee;
                System.out.println("Rupee : " + f.format(rupee_res1));
                double dollar_res1 = amount1/dollar;
                System.out.println("Dollar : " + f.format(dollar_res1));
                double pound_res1 = amount1/pound;
                System.out.println("Pound : " + f.format(pound_res1));
                double euro_res1 = amount1/euro;
                System.out.println("Euro : " + f.format(euro_res1));
                double yen_res1 = amount1/yen;
                System.out.println("Yen : " + f.format(yen_res1));
                double cad_res1 = amount1/cad;
                System.out.println("Canadian Dollar : " + f.format(cad_res1));
                double aud_res1 = amount1/aud;
                System.out.println("Australian Dollar : " + f.format(aud_res1));
                double sgd_res1 = amount1/sgd;
                System.out.println("Singaporean Dollar : " + f.format(sgd_res1));
                double cnh_res1 = amount1/cnh;
                System.out.println("Chinese Huan : " + f.format(cnh_res1));
                    break;
                case 2:
                // For Rupee Conversion
                System.out.print("Enter the amount in Rupee : ");
                int amount2 = sc.nextInt();
                double taka_res2 = amount2 / taka * rupee;
                System.out.println("Taka : " + f.format(taka_res2));
                double rupee_res2 = amount2 / rupee * rupee;
                System.out.println("Rupee : " + f.format(rupee_res2));
                double dollar_res2 = amount2 / dollar * rupee;
                System.out.println("Dollar : " + f.format(dollar_res2));
                double pound_res2 = amount2 / pound * rupee;
                System.out.println("Pound : " + f.format(pound_res2));
                double euro_res2 = amount2 / euro * rupee;
                System.out.println("Euro : " + f.format(euro_res2));
                double yen_res2 = amount2 / yen * rupee;
                System.out.println("Yen : " + f.format(yen_res2));
                double cad_res2 = amount2 / cad * rupee;
                System.out.println("Canadian Dollar : " + f.format(cad_res2));
                double aud_res2 = amount2 / aud * rupee;
                System.out.println("Australian Dollar : " + f.format(aud_res2));
                double sgd_res2 = amount2 / sgd * rupee;
                System.out.println("Singaporean Dollar : " + f.format(sgd_res2));
                double cnh_res2 = amount2 / cnh * rupee;
                System.out.println("Chinese Huan : " + f.format(cnh_res2));
                    break;
                case 3:
                // For Dollar Conversion
                System.out.print("Enter the amount in Dollar : ");
                int amount3 = sc.nextInt();
                double taka_res3 = amount3 / taka * dollar;
                System.out.println("Taka : " + f.format(taka_res3));
                double rupee_res3 = amount3 / rupee * dollar;
                System.out.println("Rupee : " + f.format(rupee_res3));
                double dollar_res3 = amount3 / dollar * dollar;
                System.out.println("Dollar : " + f.format(dollar_res3));
                double pound_res3 = amount3 / pound * dollar;
                System.out.println("Pound : " + f.format(pound_res3));
                double euro_res3 = amount3 / euro * dollar;
                System.out.println("Euro : " + f.format(euro_res3));
                double yen_res3 = amount3 / yen * dollar;
                System.out.println("Yen : " + f.format(yen_res3));
                double cad_res3 = amount3 / cad * dollar;
                System.out.println("Canadian Dollar : " + f.format(cad_res3));
                double aud_res3 = amount3 / aud * dollar;
                System.out.println("Australian Dollar : " + f.format(aud_res3));
                double sgd_res3 = amount3 / sgd * dollar;
                System.out.println("Singaporean Dollar : " + f.format(sgd_res3));
                double cnh_res3 = amount3 / cnh * dollar;
                System.out.println("Chinese Huan : " + f.format(cnh_res3));
                    break;
                case 4:
                // For Pound Conversion
                System.out.print("Enter the amount in Pound : ");
                int amount4 = sc.nextInt();
                double taka_res4 = amount4 / taka * pound;
                System.out.println("Taka : " + f.format(taka_res4));
                double rupee_res4 = amount4 / rupee * pound;
                System.out.println("Rupee : " + f.format(rupee_res4));
                double dollar_res4 = amount4 / dollar * pound;
                System.out.println("Dollar : " + f.format(dollar_res4));
                double pound_res4 = amount4 / pound * pound;
                System.out.println("Pound : " + f.format(pound_res4));
                double euro_res4 = amount4 / euro * pound;
                System.out.println("Euro : " + f.format(euro_res4));
                double yen_res4 = amount4 / yen * pound;
                System.out.println("Yen : " + f.format(yen_res4));
                double cad_res4 = amount4 / cad * pound;
                System.out.println("Canadian Dollar : " + f.format(cad_res4));
                double aud_res4 = amount4 / aud * pound;
                System.out.println("Australian Dollar : " + f.format(aud_res4));
                double sgd_res4 = amount4 / sgd * pound;
                System.out.println("Singaporean Dollar : " + f.format(sgd_res4));
                double cnh_res4 = amount4 / cnh * pound;
                System.out.println("Chinese Huan : " + f.format(cnh_res4));
                    break;
                case 6:
                // For Japanese Yen Conversion
                System.out.print("Enter the amount in Yen : ");
                int amount6 = sc.nextInt();
                double taka_res6 = amount6 / taka * yen;
                System.out.println("Taka : " + f.format(taka_res6));
                double rupee_res6 = amount6 / rupee * yen;
                System.out.println("Rupee : " + f.format(rupee_res6));
                double dollar_res6 = amount6 / dollar * yen;
                System.out.println("Dollar : " + f.format(dollar_res6));
                double pound_res6 = amount6 / pound * yen;
                System.out.println("Pound : " + f.format(pound_res6));
                double euro_res6 = amount6 / euro * yen;
                System.out.println("Euro : " + f.format(euro_res6));
                double yen_res6 = amount6 / yen * yen;
                System.out.println("Yen : " + f.format(yen_res6));
                double cad_res6 = amount6 / cad * yen;
                System.out.println("Canadian Dollar : " + f.format(cad_res6));
                double aud_res6 = amount6 / aud * yen;
                System.out.println("Australian Dollar : " + f.format(aud_res6));
                double sgd_res6 = amount6 / sgd * yen;
                System.out.println("Singaporean Dollar : " + f.format(sgd_res6));
                double cnh_res6 = amount6 / cnh * yen;
                System.out.println("Chinese Huan : " + f.format(cnh_res6));
                    break;
                case 7:
                // For Canadian Dollar Conversion
                    System.out.print("Enter the amount in Canadian Dollar : ");
                int amount7 = sc.nextInt();
                double taka_res7 = amount7 / taka * cad;
                System.out.println("Taka : " + f.format(taka_res7));
                double rupee_res7 = amount7 / rupee * cad;
                System.out.println("Rupee : " + f.format(rupee_res7));
                double dollar_res7 = amount7 / dollar * cad;
                System.out.println("Dollar : " + f.format(dollar_res7));
                double pound_res7 = amount7 / pound * cad;
                System.out.println("Pound : " + f.format(pound_res7));
                double euro_res7 = amount7 / euro * cad;
                System.out.println("Euro : " + f.format(euro_res7));
                double yen_res7 = amount7 / yen * cad;
                System.out.println("Yen : " + f.format(yen_res7));
                double cad_res7 = amount7 / cad * cad;
                System.out.println("Canadian Dollar : " + f.format(cad_res7));
                double aud_res7 = amount7 / aud * cad;
                System.out.println("Australian Dollar : " + f.format(aud_res7));
                double sgd_res7 = amount7 / sgd * cad;
                System.out.println("Singaporean Dollar : " + f.format(sgd_res7));
                double cnh_res7 = amount7 / cnh * cad;
                System.out.println("Chinese Huan : " + f.format(cnh_res7));
                    break;
                case 8:
                // For Australian Dollar Conversion
                System.out.print("Enter the amount in Australian Dollar : ");
                int amount8 = sc.nextInt();
                double taka_res8 = amount8 / taka * aud;
                System.out.println("Taka : " + f.format(taka_res8));
                double rupee_res8 = amount8 / rupee * aud;
                System.out.println("Rupee : " + f.format(rupee_res8));
                double dollar_res8 = amount8 / dollar * aud;
                System.out.println("Dollar : " + f.format(dollar_res8));
                double pound_res8 = amount8 / pound * aud;
                System.out.println("Pound : " + f.format(pound_res8));
                double euro_res8 = amount8 / euro * aud;
                System.out.println("Euro : " + f.format(euro_res8));
                double yen_res8 = amount8 / yen * aud;
                System.out.println("Yen : " + f.format(yen_res8));
                double cad_res8 = amount8 / cad * aud;
                System.out.println("Canadian Dollar : " + f.format(cad_res8));
                double aud_res8 = amount8 / aud * aud;
                System.out.println("Australian Dollar : " + f.format(aud_res8));
                double sgd_res8 = amount8 / sgd * aud;
                System.out.println("Singaporean Dollar : " + f.format(sgd_res8));
                double cnh_res8 = amount8 / cnh * aud;
                System.out.println("Chinese Huan : " + f.format(cnh_res8));
                    break;
                case 9:
                    // For Singaporean Dollar Conversion
                System.out.print("Enter the amount in Singaporean Dollar : ");
                int amount9 = sc.nextInt();
                double taka_res9 = amount9 / taka * sgd;
                System.out.println("Taka : " + f.format(taka_res9));
                double rupee_res9 = amount9 / rupee * sgd;
                System.out.println("Rupee : " + f.format(rupee_res9));
                double dollar_res9 = amount9 / dollar * sgd;
                System.out.println("Dollar : " + f.format(dollar_res9));
                double pound_res9 = amount9 / pound * sgd;
                System.out.println("Pound : " + f.format(pound_res9));
                double euro_res9 = amount9 / euro * sgd;
                System.out.println("Euro : " + f.format(euro_res9));
                double yen_res9 = amount9 / yen * sgd;
                System.out.println("Yen : " + f.format(yen_res9));
                double cad_res9 = amount9 / cad * sgd;
                System.out.println("Canadian Dollar : " + f.format(cad_res9));
                double aud_res9 = amount9 / aud * sgd;
                System.out.println("Australian Dollar : " + f.format(aud_res9));
                double sgd_res9 = amount9 / sgd * sgd;
                System.out.println("Singaporean Dollar : " + f.format(sgd_res9));
                double cnh_res9 = amount9 / cnh * sgd;
                System.out.println("Chinese Huan : " + f.format(cnh_res9));
                    break;
                case 10:
                // For Chinese Huan Conversion
                System.out.print("Enter the amount in Chinese Huan : ");
                int amount10 = sc.nextInt();
                double taka_res10 = amount10 / taka * cnh;
                System.out.println("Taka : " + f.format(taka_res10));
                double rupee_res10 = amount10 / rupee * cnh;
                System.out.println("Rupee : " + f.format(rupee_res10));
                double dollar_res10 = amount10 / dollar * cnh;
                System.out.println("Dollar : " + f.format(dollar_res10));
                double pound_res10 = amount10 / pound * cnh;
                System.out.println("Pound : " + f.format(pound_res10));
                double euro_res10 = amount10 / euro * cnh;
                System.out.println("Euro : " + f.format(euro_res10));
                double yen_res10 = amount10 / yen * cnh;
                System.out.println("Yen : " + f.format(yen_res10));
                double cad_res10 = amount10 / cad * cnh;
                System.out.println("Canadian Dollar : " + f.format(cad_res10));
                double aud_res10 = amount10 / aud * cnh;
                System.out.println("Australian Dollar : " + f.format(aud_res10));
                double sgd_res10 = amount10 / sgd * cnh;
                System.out.println("Singaporean Dollar : " + f.format(sgd_res10));
                double cnh_res10 = amount10 / cnh * cnh;
                System.out.println("Chinese Huan : " + f.format(cnh_res10));
                    break;
                default:
                    System.out.println("Invalid Choice");
                    break;
            }
                

    }
                
}
