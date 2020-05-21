import java.util.Random;

public class Main {
    public static void main(String[] args) {


        //Zadanie 2.5.2

        RandomNumbers random = new RandomNumbers();

        random.isFinished();
        System.out.println(random.getMinNumber());
        System.out.println(random.getMaxNumber());

        //Zadanie 2.5.1

        User user = new User("Franek", 60);
        User user2 = new User("Radek", 24);
        User user3 = new User("Grzesiu", 52);
        User user4 = new User("Ksawery", 24);

        User[] tablicaUser = new User[4];
        tablicaUser[0] = user;
        tablicaUser[1] = user2;
        tablicaUser[2] = user3;
        tablicaUser[3] = user4;

        int sum = 0;

        for (int i=0; i<tablicaUser.length; i++){
            sum = sum + tablicaUser[i].getAge();
        }

        int averageSum = sum / tablicaUser.length;

        for (int i=0; i<tablicaUser.length; i++){
            if (tablicaUser[i].getAge()<averageSum) {
                System.out.println(tablicaUser[i].getName());
            }
        }

        //Zadanie 2.4

        Random generator = new Random();


        Grades oceny = new Grades();
        for (int i = 0; i < 10; i++) {
            oceny.addNumber(generator.nextInt(5) + 1);
        }
        int[] grades = oceny.getGrades();
        for (int grade : grades) {
            System.out.println(grade);
        }
        System.out.println("Ostatnia ocena ucznia: " + oceny.lastGrade());
        System.out.println(oceny.averageGrade());


        // Zadanie 1.
//        Notebook notebook = new Notebook(600, 300, 2018);
//        notebook.isOkay();
//
//
//        Notebook oldNotebook = new Notebook(1200, 800,2013);
//        oldNotebook.isOkay();
//
//        Notebook heavyNotebook = new Notebook(2000, 1100, 2020);
//        heavyNotebook.isOkay();
//
//        Notebook notebook2 = new Notebook(500, 600, 2014);
//        notebook2.isOkay();
//
//        Notebook notebook3 = new Notebook(700,1000,2014);
//        notebook3.isOkay();



    }

}
