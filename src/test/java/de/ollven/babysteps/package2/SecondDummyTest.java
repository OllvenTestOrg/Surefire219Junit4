package de.ollven.babysteps.package2;

import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SecondDummyTest {

    private final Random rnd = new Random();

    @Test
    public void secondtestThatAlwaysFails() throws InterruptedException {
        Thread.sleep(1000);
//        boolean a = rnd.nextBoolean();
//        assertTrue(a);
        int b = rnd.nextInt(3);
        assertEquals(b, 1);
    }

    @Test
    public void secondtestThatAlwaysPasses() throws InterruptedException {
        Thread.sleep(1000);
        assertTrue(true);
    }

    @Test
    public void secondtestThatIsSlowButAlwaysFails() throws InterruptedException {
        Thread.sleep(1000);
        assertTrue(true);
    }

    @Test
    public void secondtestThatIsSlowButAlwaysPasses() throws InterruptedException {
        Thread.sleep(2000);
        assertTrue(true);
    }
}
