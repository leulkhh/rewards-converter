public class RewardValue {


    public double cashValue;
    public static double milesToCash = 0.0035;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;

    }

    public RewardValue(int milesValue){
        this.cashValue = milesToCashConversion(milesValue);
    }

    public static double milesToCashConversion(int milesValue){
        return milesValue * milesToCash;
    }

    public static int cashToMilesConversion(double cashValue){
        return (int)(cashValue / milesToCash);
    }



    public double getCashValue(){
        return cashValue;

    }
    public double getMilesValue(){
       return cashToMilesConversion(this.cashValue);
    }

}
