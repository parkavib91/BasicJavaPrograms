public class LeapYear {
    public void LeapYearMethod(int year){
        if((year % 400 ==0)||(year % 4 == 0)&&(year % 100 != 0)) {
         System.out.println(year + " : Leap year");
        }
        else{
         System.out.println(year + " : Non - Leap year");
        }
    }   
}