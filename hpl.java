import java.time.LocalDateTime;

public class Hpl {


    public static void main(String args[]) {
        

            /*
             * Kunde (KundeID 78) bestiller 3 pizzaer: 1 stk. Fire Cheese (5) og 2 stk. Meat Lovers (15)
             * Pizzaerne bliver afhentet
             */

            int[][] pizza = {{1, 3},
                            {20,1}};

            LocalDateTime ctime = LocalDateTime.now();

            Ordrer myOrdrer = new Ordrer();
            myOrdrer.create(pizza, ctime, 0, 78);
    }
}