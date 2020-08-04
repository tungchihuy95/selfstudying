package Helloworld;

public class HelloWorld {
    //phuong thuc k co "static"
    public void nonstatictest() {
        System.out.println("non static method");
    }

    public static void statictest() {
        System.out.println("static method");
    }

    public static void main(String[] args) {
        HelloWorld helloWorldObject = new HelloWorld();
        System.out.println("Hello world!");
        helloWorldObject.nonstatictest(); //vì phương thức test() bên trên k có "static" nên phải gọi Object: helloWorldObject
        statictest(); // vì phương thức này có "static" nên có thể gọi ngay


    }
}
