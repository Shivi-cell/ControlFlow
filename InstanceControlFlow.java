package ControlFlow;

public class InstanceControlFlow
{
    int i = 10;
    {
        m1();
        System.out.println("First static block");
    }
    InstanceControlFlow()
    {
        System.out.println("constructor called..");
    }
    public static void main(String[] args) // first static method main() will be executed
    {
        InstanceControlFlow i = new InstanceControlFlow(); // instance control flow starts here when we create an object
        i.m1();
        System.out.println("main method..");
    }

    public void m1()
    {
        System.out.println(j);
    }
    {
        System.out.println("second static block");
    }
    int j = 20;
}
