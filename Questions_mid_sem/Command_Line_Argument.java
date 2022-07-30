package Questions_Mid_Sem;

class Command_Line_Argument {
    public static void main(String[]args)
    {
        System.out.println("Sum of two numbers : ");

        int sum = Integer.parseInt(args[0]) + Integer.parseInt(args[1]);
        System.out.println("THE SUM : " +sum );
    }
}
