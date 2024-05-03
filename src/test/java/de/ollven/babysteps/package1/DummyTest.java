package de.ollven.babysteps.package1;


import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class DummyTest {

    @Test
    public void testThatAlwaysFails() throws InterruptedException {
        Thread.sleep(2000);
        assertTrue(false);    }

    @Test
    public void testThatAlwaysPasses() throws InterruptedException {
        Thread.sleep(1000);
        assertTrue(true);
    }

    @Test
    public void testThatIsSlowButAlwaysFails() throws InterruptedException {
        Thread.sleep(1000);
        assertTrue(true);
    }

    @Test
    public void testThatIsSlowButAlwaysPasses() throws InterruptedException {
        Thread.sleep(1000);
        assertTrue(true);
    }
}
