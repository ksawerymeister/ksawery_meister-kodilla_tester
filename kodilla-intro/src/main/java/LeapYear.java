public class LeapYear {
    public static void main(String[] args) {
        int year = 2020;

        int divideBy4 = year % 4;
        int divideBy100 = year % 100;
        int divideBy400 = year % 400;

        if(divideBy4 == 0 && divideBy100 == 0 && divideBy400 == 0){
            System.out.println("Rok " + year + " jest przestępny");
        }
        else{
            System.out.println("Rok " + year + " nie jest przestępny");
        }

    }
}
