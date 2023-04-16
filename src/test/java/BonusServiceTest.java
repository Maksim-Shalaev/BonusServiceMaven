import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BonusServiceTest {

    @Test
    void shouldCalculateForRegisteredAndOverLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 30_000;
        boolean registered = true;
        long expected = 500;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateForRegistredAndUnderLimit() {
        BonusService service = new BonusService();
        long amount = 10_000;
        boolean registred = true;
        long expected = 300;
        long actual = service.calculate(amount, registred);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateForUnregistredAndOverLimit() {
        BonusService service = new BonusService();
        long amount = 650_000;
        boolean registred = false;
        long expected = 500;
        long actual = service.calculate(amount, registred);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateForUnregistredAndUnderLimit() {
        BonusService service = new BonusService();
        long amount = 12_000;
        boolean registred = false;
        long expected = 120;
        long actual = service.calculate(amount, registred);
        Assertions.assertEquals(expected, actual);
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
