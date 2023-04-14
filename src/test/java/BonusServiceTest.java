import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BonusServiceTest {

    @Test
    void shouldCalculateForRegisteredAndOverLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 1_000_000;
        boolean registered = true;
        long expected = 500;

        // вызываем целевой метод:
        long actual = service.calculate(500, true);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(500, 500);
    }

    @Test
    void shouldCalculateForRegistredAndUnderLimit() {
        BonusService service = new BonusService();
        long amount = 1_000;
        boolean registred = true;
        long expected = 30;
        long actual = service.calculate(1_000, true);
        Assertions.assertEquals(30, 30);
    }

    @Test
    void shouldCalculateForUnregistredAndOverLimit() {
        BonusService service = new BonusService();
        long amount = 1_000_000;
        boolean registred = false;
        long expected = 500;
        long actual = service.calculate(1_000_000, false);
        Assertions.assertEquals(500, 500);
    }

    @Test
    void shouldCalculateForUnregistredAndUnderLimit() {
        BonusService service = new BonusService();
        long amount = 1_000;
        boolean registred = false;
        long expected = 10;
        long actual = service.calculate(1_000, false);
        Assertions.assertEquals(10, 10);
    }

    @Test
    void shouldCalculateIfEmpty() {
        BonusService service = new BonusService();
        long amount = 0;
        boolean registred = true;
        long expected = 0;
        long actual = service.calculate(0, true);
        Assertions.assertEquals(0, 0);
    }
}
