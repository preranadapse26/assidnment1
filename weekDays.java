public class weekDays {
    public static void main(String[] args){
        int day=7;
        if(day>7 || day<1){
            System.out.println("invalid day");
        }else if(day==1){
            System.out.println("Monday");
        }else if(day==2){
            System.out.println("Tuesday");
        }else if(day==3){
            System.out.println("Wednesday");
        }else if(day==4){
            System.out.println("Thursday");
        }else if(day==5){
            System.out.println("friday");
        }else if(day==6){
            System.out.println("saturday");
        }else if(day==7){
            System.out.println("sunday");
        }
    }
}
