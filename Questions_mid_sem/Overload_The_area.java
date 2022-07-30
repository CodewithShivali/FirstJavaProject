package Questions_Mid_Sem;

/*
QUESTION

* Create a class “Shape” having area() method to calculate area.
*  Overload the area() method for shapes like triangle, rectangle and circle.
* */

class shape{
    double area;

    void area(int length,int bredth)
    {
        //Area of reactangle
        area = length * bredth;
    }

    void area(int radius)
    {
        //Area of circle
        area = 3.14 * radius * radius;
    }
    void display()
    {
        System.out.println("Area is : " + area);
    }

    public static void main(String [] args)
    {
        shape s = new shape();

        s.area(3,5);
        s.display();

        s.area(10);
        s.display();
    }
}
