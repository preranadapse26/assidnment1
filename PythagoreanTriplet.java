public class PythagoreanTriplet {
    public static void main(String[] args){
        int a=1;
        int b=6;
        int c=9;
        if(a*a+b*b==c*c || a*a+c*c==b*b || b*b+c*c==a*a){
            System.out.println("it is a pythagorean triplet");
        }else{
            System.out.println("not a pythagorean triplet");
        }
    }
}
