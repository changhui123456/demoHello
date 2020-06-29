package test.jvm;

public class StackTest {
    public static void Foo(){
        Foo();
    }

    public static void main(String[] args) {
        Foo();
    }
}
