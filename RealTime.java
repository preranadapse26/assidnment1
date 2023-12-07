class RealTime{
    public static void main(String[] args){
        int marks = 99;
        if(marks>=90 && marks<=100){
            System.out.println("Distinction");
        }else if(marks>=60 && marks<=89){
            System.out.println("First Class");
        }else if(marks>=40 && marks<=59){
            System.out.println("Pass");
        }else{
            System.out.println("fail");
        }
    }
}
