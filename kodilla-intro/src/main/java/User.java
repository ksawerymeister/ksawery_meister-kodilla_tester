public class User {
    private String name;
    private double age;
    private double height;

    public User(String name, double age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public boolean isNameNull() {
        if (name == null) {
            return true;
        } else return false;
    }

    public double getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public String getName() {
        return name;
    }

    public boolean isAgeOver30() {
        if (age > 30) {
            return true;
        } else return false;
    }

    public boolean isHeightOver160() {
        if (height > 160) {
            return true;
        } else return false;
    }

    public void userDescription() {
        if (isNameNull() & isAgeOver30() & isHeightOver160()) {
            System.out.println("User is older than 30 and higher than 160 cm");
        } else if ((isNameNull() & !isAgeOver30() || !isHeightOver160())) {
            System.out.println("User is younger than 30 or lower than 160 cm");
        }
        else if (!isNameNull()) {
            System.out.println("User has a name");
        }
        else ;
    }
}

