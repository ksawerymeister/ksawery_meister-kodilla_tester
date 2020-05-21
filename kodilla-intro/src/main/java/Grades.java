public class Grades {

    private int [] grades;
    private int size;
    private int sum = 0;


    public Grades(){
        this.grades = new int[10];
        this.size = 0;

    }

    public void addNumber(int value){
        if (this.size == 10)
            return;
        grades[size] = value;
        size++;
    }

    public double averageGrade(){
        int i;
        for(i=0; i<this.grades.length; i++){
            sum = sum + this.grades[i];
        }
        return (double)sum/i;
    }

    public int lastGrade(){
        int lastValue = this.grades[this.grades.length - 1];
        return lastValue;
    }
    public int[] getGrades() {
        return this.grades;
    }


}
