public class BonusService {

//    public int calcBonus(int amount, boolean isRegistred) {
//        int percent = isRegistred ? 3 : 1;
//        int bonus = amount * percent / 100;
//        if (bonus > 500) {
//            bonus = 500;
//        }
//        return bonus;

        public long calculate(long amount, boolean registered) {
            int Percent = registered ? 3 : 1;
            long bonus = amount * Percent / 100;
            long limit = 500;
            if (bonus > limit) {
                bonus = limit;
            }
            return bonus;
    }
}
