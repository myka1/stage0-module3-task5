package lang.print.gaps.task5;

public class TimeConvertor {
    public void convert(float minutes) {
        float seconds = minutes * 60f;
        System.out.println(seconds);
    }

    public static void main(String[] args) {
        TimeConvertor ten = new TimeConvertor();
        ten.convert(10f);
    }
}
