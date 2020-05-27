package test.Constructor;

public class Dog extends Animal{
    /**
     * 子类无参构造方法
     */
    public Dog(){
        super();
        System.out.println("子类无参构造方法");
    }
    @Override
    void eat() {

    }
}
