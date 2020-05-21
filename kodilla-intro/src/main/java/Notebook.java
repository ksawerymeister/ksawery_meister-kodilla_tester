public class Notebook {
    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void checkPrice(){
        if (this.price<600){
            System.out.println("This notebook is very cheap");
        }if (this.price>=600 && this.price<900){
            System.out.println("This notebook is good");
        }if(this.price>1000){
            System.out.println("This notebook is very expensive");
        }
    }

    public void checkWeight(){
        if (this.weight<700){
            System.out.println("This notebook is very light");
        }
        if (this.weight>700 && this.weight<1000){
            System.out.println("This is normal notebook");
        }
        if (this.weight>1000){
            System.out.println("This notebook is heavy");
        }
    }
    public void isOkay(){
        if (this.price>700 && this.year<2015){
            System.out.println("This notebook is not okay");
        }
        else if(this.price>700 && this.year>2015){
            System.out.println("This notebook is okay");
        }
    }

}
