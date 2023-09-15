public class ComandaClasses {

    interface Comanda{
        public void nazvanie();
        public void nazvanieSomeone(String someone);
    }
    public void ComandaName() {

        class JapanComanda implements Comanda{
            String name = " Inadzuma Eleven";
            public void nazvanie() {
                nazvanieSomeone(" Inadzuma Eleven тренер команды:");
            }
            public void nazvanieSomeone(String someone) {
                name = someone;
                    System.out.println(name+" Mamoru Endo");
            }
        }
        Comanda japanComanda = new JapanComanda ();
        //Анонимный класс
        Comanda frenchComanda= new Comanda() {

            String name = "Bonus";
            public void nazvanie() {
                nazvanieSomeone("Bonus");
            }

            public void nazvanieSomeone(String someone) {
                name = someone;
                System.out.println(name+" Jenson Jons");
            }
        };
        //Анонимный класс
        Comanda russiaComanda = new Comanda () {
            String name = "Kazaki";
            public void nazvanie() {
                nazvanieSomeone("Kazaki тренер команды: ");
            }
            public void nazvanieSomeone(String someone) {
                name = someone;
                System.out.println(name + "  Alexsandr Ivanov");
            }
        };
        japanComanda.nazvanie();
        frenchComanda.nazvanieSomeone("Fate тренер команды:");
        russiaComanda.nazvanie();

    }

    public static void main(String... args) {
        ComandaClasses myApp =
                new ComandaClasses();
        myApp.ComandaName();
    }
}



