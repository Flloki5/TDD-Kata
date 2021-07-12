package tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class BowlingTest {

    private Bowling bowling;

    @BeforeEach
    public void beforeEachTestMethod(){
        this.bowling = new Bowling();
    }

    @Test
    public void roll_Should_ReturnNumberOfKnockedPins(){

        bowling.roll(5);

        assertEquals(5, bowling.getKnockedPins());
    }

    @Test
    public void roll_3Times_ShouldReturnNumberOfKnockedPins(){

        bowling.roll(2);
        bowling.roll(3);
        bowling.roll(4);

        finishGame(17, 0);

        assertEquals(9, bowling.getKnockedPins());
    }

    @Test
    public void roll_Spare_ShouldReturnNumberOfPointsForSpare(){

        bowling.roll(5);
        bowling.roll(5);
        bowling.roll(5);
        bowling.roll(4);
        bowling.roll(10);

        finishGame(15, 0);

        assertEquals(34, bowling.score());
    }

    @Test
    public void roll_Strike_ShouldReturnNumberOfPointsForStrike(){

        bowling.roll(10);
        bowling.roll(3);
        bowling.roll(2);

        finishGame(17, 0);

        assertEquals(20, bowling.score());
    }

    private void finishGame(int rolls, int value){
        for(int i = 0; i < rolls; i++){
            bowling.roll(value);
        }
    }
}
