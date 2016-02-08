package NameRandomizer;

import java.util.Date;

public class Name {
    public static void main(String[] args) throws Exception {
        String name = "VI";
        Date date = new Date();
        String dateS = date.toString();
        String mas [] = dateS.split(" ");
        String month = mas[1];
        String day = mas[0];
        String day_number = mas[2];
        String[] number = {"One", "Two", "Three","Four", "Five", "Six","Seven", "Eight", "Nine","Ten", "Eleven", "Thirteen","Fourteen", "Fifteen", "Sixteen","Seventeen", "Eighteen", "Nineteen","Twenty", "Twenty-one", "Twenty-two","Twenty-three", "Twenty-four", "Twenty-five","Twenty-six", "Twenty-seven", "Twenty-eight","Twenty-nine", "Thirty", "Thirty-one","Thirty-two", "Thirty-three", "Thirty-four","Thirty-five", "Thirty-six", "Thirty-seven","Thirty-eight", "Thirty-nine", "Forty","Forty-one", "Forty-two", "Forty-three","Forty-four", "Forty-five", "Forty-six","Forty-seven", "Forty-eight", "Forty-nine", "Fifty"};
        for (String tester: number)
        {
            int i = 0;
            System.out.println(name+month+day+day_number+tester);
            i++;
        }
    }
}
