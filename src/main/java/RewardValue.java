public class RewardValue {


    public double cashValue;
    public int milesValue;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;

    }

    public RewardValue(int milesValue){
        this.milesValue = milesValue;
    }



    public double getCashValue(){
        return cashValue;

    }
    public double getMilesValue(){
       return cashValue / 0.0035;
    }

}
