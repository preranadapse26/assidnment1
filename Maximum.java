public class Maximum {
    public static void main(String[] args) {
        int i =42;
        int j =32;
        int n =42;
        if(i>n && i>j){
            System.out.println(i+" maximum");
        }else if(j>i &&j>n){
            System.out.println(j+" maximum");
        }else if(n>i && n>j){
            System.out.println(n+" maximum");
        }else if(i>j && i==n){
            System.out.println(i+ "is greater than "+j+" and"+ i+" is equal to  "+n);
        }else if(j>i && j==n){
            System.out.println(j+"greater than"+i+ "and eqaul to"+n);
        }else if(n>i && n==j){
            System.out.println(n+"greater than"+i+ "and eqaul to"+j);
        }else{
            System.out.println("All are eqaul");
        }
    }
}

