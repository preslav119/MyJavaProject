package inclass;

public class CarMethodsDemo {
    public static void main(String[] args) {
        Car golf = new Car();
        golf.color = "blue";
        golf.gear = 5;
        golf.gearUp();
        golf.changeGear(4);
        golf.gearUp();
        System.out.println(golf.gear);

        Car honda = new Car();
        System.out.println(honda.gear);
        honda.gearUp();
        honda.gearUp();
        honda.gearUp();
        System.out.println(honda.gear);

        System.out.println(honda.owner);
        Person ivan = new Person();
        ivan.name = "Vankata";

        honda.owner = ivan;
        System.out.println(honda.owner.name);

        Person petya = new Person();
        petya.name = "Petyaaaaaa";
        honda.changeOwner(petya);
        System.out.println(honda.owner.name);

        honda.owner = new Person();
        honda.owner.name = "TheOwner";
        System.out.println(honda.owner.name);
        honda.owner = petya;
        System.out.println(honda.owner.name);
        System.out.println(ivan.weight);

//        petya = ivan;
//        System.out.println(petya.name);
//        System.out.println(petya);
//        System.out.println(ivan);



    }
}
