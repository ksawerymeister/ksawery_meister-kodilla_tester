public class Grades {

    private int [] grades2;
    private int size;
    private int sum = 0;


    public Grades(){
        this.grades2 = new int[10];
        this.size = 0;

    }

    public void addNumber(int value){
        if (this.size == 10)
            return;
        grades2[size] = value;
        size++;
    }

    public double averageGrade(){
        int i;
        for(i=0; i<this.grades2.length; i++){
            sum = sum + this.grades2[i];
        }
        return (double)sum/i;
    }

    public int lastGrade(){
        int lastValue = this.grades2[this.grades2.length - 1];
        return lastValue;
    }
    public int[] getGrades2() {
        return this.grades2;
    }


}
