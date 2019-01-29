package provuppg1.dogs;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Administratör
 */
public abstract class Dog {

    private static  String name;
    private static  String breed;
    private static  boolean hungry;
    private static  boolean happy;
    private static  boolean awake;
    private static  int id;
    private static  int age;

    public String eat() {
        return "Eating";
    }

    public String sleep() {
        return "Sleeping";
    }

    public String wake() {
        return "Waking Up";
    }

    public abstract String bark();

    @Override
    public String toString() {
        return "Dog{" + "name=" + name + ", breed=" + breed + ", hungry=" + hungry + ", happy=" + happy + ", awake=" + awake + ", id=" + id + ", age=" + age + '}';
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); 
    }

    public Dog() {
        
    }
    
    public Dog(int id) {
        Dog.id = id;
    }

    public Dog(String name, String breed, boolean hungry, boolean happy, boolean awake, int id, int age) {
        Dog.name = name;
        Dog.breed = breed;
        Dog.hungry = hungry;
        Dog.happy = happy;
        Dog.awake = awake;
        Dog.id = id;
        Dog.age = age;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Dog.name = name;
    }

    public static String getBreed() {
        return breed;
    }

    public static void setBreed(String breed) {
        Dog.breed = breed;
    }

    public static boolean isHungry() {
        return hungry;
    }

    public static void setHungry(boolean hungry) {
        Dog.hungry = hungry;
    }

    public static boolean isHappy() {
        return happy;
    }

    public static void setHappy(boolean happy) {
        Dog.happy = happy;
    }

    public static boolean isAwake() {
        return awake;
    }

    public static void setAwake(boolean awake) {
        Dog.awake = awake;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Dog.id = id;
    }

    public static int getAge() {
        return age;
    }

    public static void setAge(int age) {
        Dog.age = age;
    }

 
}
