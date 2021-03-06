package test.Constructor;

public class TestMethod {
    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println(dog.name);
    }
}




             /*   新手学习Java在构造方法这里很容易踩雷,构造方法是用来初始化的,这句勉强没错,
               可构造方法是用来创建对象的,这句就错了,实际上,在构造方法执行之前,
               类的内存空间已经开辟完成了,意思就是说对象已经创建了,这步是由new关键字来完成的,而构造方法的作用是给类中的变量进行初始化赋值
               假设,假设构造方法是用来创建对象用的,就无法解释抽象类中为什么允许构造方法的存在,抽象类无法实例化,不能被创建,
               但是抽象类中允许构造方法的存在,举例从侧面证明一下:*/

       /* 当执行Dog d = new Dog()这句代码时,大致会分两步,一是加载类,开辟类的内存空间,这是由new完成的,
        第二步执行构造方法,为类中的变量初始化赋值,在执行Dog的无参构造时,系统会默认调用父类的无参构造,也就是super(),
        super关键字是对该类的父类进行的引用,它并不是一个对象,这也是个难点,感兴趣的可以去查一下,而super()这句代码可以简单理解为调用这个类的父类的无参构造
        在上述代码中,父类Animal是一个抽象类,而抽象类不可被实例化,如果构造方法的作用是创建对象,在这一步上逻辑就无法自洽,而实际情况是:抽象类执行了构造方法,
        但却没有创建对象,同时成员变量name也有了初始值null
*/

