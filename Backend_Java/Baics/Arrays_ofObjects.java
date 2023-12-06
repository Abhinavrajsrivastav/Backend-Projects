package Baics;

class Fans{
    String name;
    int price;

    void setName(String name){
        this.name = name;
    }

    void setPrice(int price){
        this.price = price;
    }

    void getData(){
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
    }
}

public class Arrays_ofObjects {
    public static void main(String[] args){
        Fans[] fan = new Fans[5];

        for(int i = 0;i<5;i++){
            fan[i] = new Fans();
        }

        fan[0].setName("Crompton");
        fan[0].setPrice(2000);

        fan[1].setName("Havells");
        fan[1].setPrice(3000);

        fan[2].setName("Bajaj");
        fan[2].setPrice(4000);

        fan[3].setName("Orient");
        fan[3].setPrice(5000);

        fan[4].setName("Usha");
        fan[4].setPrice(6000);

        for(int i = 0;i<5;i++){
            fan[i].getData();
            System.out.println();
        }
    }
}
