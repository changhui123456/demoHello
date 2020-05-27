package test.Constructor;

public abstract class Animal {
    String name;
    /**
     * 抽象父类（无参构造）
     */
    public Animal(){
        System.out.println("父类无参构造方法");

    }


    abstract void  eat();
}
