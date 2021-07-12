package tdd;

public class Year {

    public boolean isLeapYear(int year){

        if(year % 4 == 0 && year % 100 != 0){
            return true;
        }else{
            return false;
        }
    }
}
