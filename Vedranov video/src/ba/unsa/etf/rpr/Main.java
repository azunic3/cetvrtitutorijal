package ba.unsa.etf.rpr;

public class Main {
    private static void promijeniDatum(Datum d) throws Exception { //prima referencu d, ne mogu se primitivni tipovi slat po referenci
        d.setMjesec(10);
    }

    public static void main(String[] args) throws Exception {

//Datum d; //ovo je referenca na datum
        //Datum d=new Datum(); //mora new, ovo je poziv konstruktora(defaultnog ako ne napravimo vlastiti), on nema parametre i postavlja sve atribute na 0
        //posto smo kreirali vlastiti konstruktor, izbacujemo defaultni
        Datum d = new Datum(31, 3, 2020); //pozivamo vlastiti konstruktor
        //ovo d gore je referenca
        /*try{
            d=new Datum(15,13,2020);
        } catch(Exception e){
            System.out.println(e,getMessage());
        }*/
        //mozemo pozvati metodu provjeriDatum iz klase Datum jer je public:
        try {
            Datum.provjeriDatum(29, 2, 2020);
            System.out.println("Datum je ispravan");
        } catch (Exception e) {
            System.out.println("Datum nije ispravan");
        }
        Datum d1 = d;
        try {
            d1.setMjesec(4); //bit ce problem jer april nema 31 dan
        } catch (Exception e) {
            System.out.println(e, GetMessage());

        }

        promijeniDatum(d1);

        //  d.dan=15;
        // d.mjesec=10;
        // d.godina=2022;
        d1.ispisiDatum();
        d1.unesiDatum();
        try {
            d1.setMjesec(11);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        int m = d1.getMjesec();
        System.out.println("Mjesec je " + m);


        private static void ispisDatum(Datum d1){
            System.out.println(d1.dan + "," + d1.mjesec + "," + d1.godina);
        }

        //NEVEZANO ZA DATUM
        IntWrapper a = new IntWrapper(15);
        promijeniInt(a);
        IntWrapper b=new IntWrapper(42);
                if(a.equals(b))  //equals metoda iz klase object, treba je implementirati u clasi IntWrapper
                    System.out.println("Jednaki su");
        System.out.println("Int je "+a);
    }

    private static void promijeniInt(IntWrapper a){
        //a=new Integer(42); ovako n mozemo promijeniti vr
        a.setX(42); //ovako
    }
}

