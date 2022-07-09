public class Credit {
    public int calculate(double summa, double percent, double time) {
        double s01 = percent / 100;
        double s02 = time * 12;
        double s0 = s01 / 12;
        double s1 = 1+s0;
        double s2 = Math.pow(s1, s02);
        double s3 = s0 * s2;
        double s4 = s2 - 1;
        double s5 = s3 / s4;
        double s6 =summa * s5;
        return (int) s6;
    }

}