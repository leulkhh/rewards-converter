import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {


    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue());
    }

    @Test
    void create_with_miles_value() {
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue);
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_cash_to_miles() {
        RewardValue rewardValue = new RewardValue( 200.00);
        double milesToCash = 0.0035;
        double result = rewardValue.getMilesValue();
        assertEquals(57142.0,result,0.0001);
    }

    @Test
    void convert_from_miles_to_cash() {
        RewardValue rewardValue = new RewardValue( 100);
        double milesToCash = 0.0035;
        double result = rewardValue.milesToCashConversion(100);
        assertEquals(0.35,result,0.0001);
    }
}
