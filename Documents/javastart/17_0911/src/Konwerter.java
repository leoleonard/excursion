public class Konwerter {

    public static Double[] konwerterWag (String kg, String g, String mg) {

        Double kilogramy = 0.0;
        Double gramy = 0.0;
        Double miligramy = 0.0;

        int check = 0;
        if (!kg.isEmpty()) {
            kilogramy = Double.valueOf(kg);
            gramy = kilogramy * 1000;
            miligramy = kilogramy * 1000000;
            check = check + 1;

        }

        if (!g.isEmpty()) {
            gramy = Double.valueOf(g);
            kilogramy = gramy * 0.001;
            miligramy = gramy * 1000;
            check = check + 1;
        }

        if (!mg.isEmpty()) {
            miligramy = Double.valueOf(mg);
            gramy = miligramy * 0.001;
            kilogramy = miligramy * 0.000001;
            check = check + 1;
        }

        if (check == 1) {
            Double[] wyniki = new Double[]{kilogramy, gramy, miligramy};
            return wyniki;
        } else {
            return null;
        }
    }

    public static Double[] konwerterOdleglosci (String m, String cm, String mm) {

        Double metry = 0.0;
        Double centymetry = 0.0;
        Double milimetry = 0.0;

        int check = 0;
        if (!m.isEmpty()) {
            metry = Double.valueOf(m);
            centymetry = metry * 100;
            milimetry = metry * 1000;
            check = check + 1;

        }

        if (!cm.isEmpty()) {
            centymetry = Double.valueOf(cm);
            metry = centymetry * 0.01;
            milimetry = centymetry * 10;
            check = check + 1;
        }

        if (!mm.isEmpty()) {
            milimetry = Double.valueOf(mm);
            metry = milimetry * 0.001;
            centymetry = milimetry * 0.01;
            check = check + 1;
        }

        if (check == 1) {
            Double[] wyniki = new Double[]{metry, centymetry, milimetry};
            return wyniki;
        } else {
            return null;
        }
    }
}
