public class BonusMilesService {
    public int calculate(int  price) {

        int miles = 20; // стоимость одной мили
        int result  = price / miles;

        return miles;
    }
}
