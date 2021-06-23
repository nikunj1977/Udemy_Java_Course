package objectOrientation;

public class Zoo {
    public static void main(String[] args) {


        Animal sparrow = new Sparrow(12, "Male", 50);
        //sparrow.move();

        Animal fish = new Fish(1,"M",2);
        //fish.move();

        moveAnimal(sparrow);

        moveAnimal(fish);

    }

    public static void moveAnimal(Animal animal){
        animal.move();
    }
}
