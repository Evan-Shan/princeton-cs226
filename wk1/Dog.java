public class Dog {
    int weight;
    String name;

//    constructor
    Dog(String n, int w){
        name = n;
        weight = w;
    }

    void makeNoise(){
        if (weight < 10){
            System.out.println("YipYip");
        }
        else if (weight < 30){
            System.out.println("BarkBark");
        }else{
            System.out.println("Oooof");
        }
    }

    static String compareWeight(Dog d1, Dog d2){
        if (d1.weight > d2.weight){
            return d1.name;
        }else{
            return d2.name;
        }
    }

    public static void main(String[] args){
        Dog d1 = new Dog("a", 20);
        Dog d2 = new Dog("b", 30);
        d1.makeNoise();
        d2.makeNoise();
        System.out.println(compareWeight(d1,d2));
    }

}