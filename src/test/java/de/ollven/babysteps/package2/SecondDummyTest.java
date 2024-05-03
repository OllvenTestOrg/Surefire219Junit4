package de.ollven.babysteps.package2;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class SecondDummyTest {

    @Test
    public void secondtestThatAlwaysFails() throws InterruptedException {
        Thread.sleep(1000);
        assertTrue(true);
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
