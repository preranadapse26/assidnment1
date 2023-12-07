public class ProfitLoss {
    public static void main(String args[]){
    int CostPrice = 1000;
    int sellingPrice = 100;
    int Loss = CostPrice - sellingPrice;
    int Profit = sellingPrice - CostPrice;
    if(CostPrice>sellingPrice){
        System.out.println("Loss of"+Loss);
    } else if(sellingPrice>CostPrice){
        System.out.println("Profit of"+Profit);
    }else{
        System.out.println("no profit no loss");
    }
}
}
