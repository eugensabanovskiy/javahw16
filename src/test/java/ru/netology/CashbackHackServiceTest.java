package ru.netology;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void shouldReturn100IfAmount900() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(900);
        int expected = 100;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn0IfAmount1000() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1000);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn500IfAmount500() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(500);
        int expected = 500;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn1IfAmount999() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(999);
        int expected = 1;
        assertEquals(expected, actual);
    }
}
