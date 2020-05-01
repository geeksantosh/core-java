package AccessModifiers;
import MethodOverloading.*;
public class B
{
    public static void main(String args[])
    {
        A obj = new A();
        //trying to access private method of another class
        obj.display();

      /*  SumOverloading sumOverloading = new SumOverloading();
        sumOverloading.getInput();*/

    }
}
