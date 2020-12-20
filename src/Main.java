import org.junit.Test;

public class Main {
    final String[] array = {"luni", "marti",
            "miercuri", "Joi", "vineri",
            "Sambata", "Duminica"};

    int day = 0;
    int hh = 0;
    int mm = 0;

    int hhLen = 0;
    int mmLen = 0;

    @Test
    public void ruta() {
        solve();
    }

    public void solve() {
        int day = 0;

        int hh = 5;
        int mm = 10;

        int hhLen = 6;
        int mmLen = 10;

        int minResult = mm + mmLen;
        int resultHour = 0;

        if (minResult >= 60) {
            resultHour = hhLen - (24 - hh) + 1;
            minResult = 0;
        } else {
            resultHour = hhLen - (24 - hh);
        }

        if (hh + hhLen < 24) {
            System.out.println(array[day]);
            System.out.println(hh + hhLen + " " + minResult);
        } else {

            if (hh + (24 - hh) >= 24) {
                day++;
            }

            if (day == 7) {
                day = 0;
            }
            System.out.println(array[day]);
            System.out.println(resultHour + " " + minResult);
        }
    }
}
