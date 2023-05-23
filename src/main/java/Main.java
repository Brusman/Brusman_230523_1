import ru.netology.services.CalcRest;

public class Main {

    public static void main(String[] args) {
        CalcRest service = new CalcRest();
        int months = service.calculate(100000, 60000, 150000);
        System.out.println(months);
    }
}
