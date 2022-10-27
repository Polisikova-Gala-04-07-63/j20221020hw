/* Galina Krüger, qa_36m,
Представьте, вы пишите программу для автопарка или, например,
для авиакомпании. Вам необходимо  создать класс Ticket ,
который должен содержать следующие поля Route route,
MyDateTime time,
double price. Как вы догадываетесь,Route route,
MyDateTime time, double price
Route и MyDateTime тоже  классы: Route{String number,
String  from, String destination, long distance}
MyDateTime (day,month,year,hour,min). Далее вам необходимо:
a)создать несколько разных билетов, положить их в массив.
b)Реализовать метод, который выводит информацию обо всех билетах
c)Реализовать метод, который считает суммарную стоимость билетов.
d)Необходимо посчитать суммарную дистанцию всех маршрутов
(предположим, что у вас нет билетов с одним и тем же маршрутом,
т.е. задача сводится к простому суммированию всех distance)
e)Реализовать в билете метод изменения времени отправления.*/

public class Main {
    public static void main(String[] args) {

        Route r1 = new Route("A1", "Stuttgart", "Kiev", 700);
        Route r2 = new Route("B2", "Stuttgart", "Berlin", 400);
        Route r3 = new Route("C3", "Stuttgart", "Geneva", 200);

        Ticket[] tickets = {
                new Ticket(r1, new MyDateTime(24, 2, 2022,
                        12, 40), 400),
                new Ticket(r2, new MyDateTime(5, 6, 2022,
                        20, 10), 200),
                new Ticket(r3, new MyDateTime(10, 5, 2022,
                        6, 10), 100),

        };

        //sumTickets(tickets);
        //print(tickets);
        sumOfDistance(tickets);
    }
        private static void print(Ticket[] tickets) {
            for (Ticket t : tickets) {
                System.out.println(t);
            }
        }

        public static void sumTickets(Ticket[] tickets){
            double sum = 0;
            for (Ticket t : tickets) {
                sum += t.getPrice();
            }
            System.out.println(sum);
        }

        public static void sumOfDistance(Ticket[] tickets){
            long sum = 0;
            for(Ticket t : tickets){
               sum += t.getDistance();
            }
            System.out.println(sum);
        }
            
}
