package Questions_Mid_Sem;


/*
QUESTION

* Create a class “Bank” having method getRateOfInterest().
*  Create child classes as HDFC, SBI and PNB and override getRateOfInterest()
*  and return interest rates as 4.0, 4.5 and 5% correspondingly.

Use concept of Upcasting to implement this scenario.

* */

class Bank {
    float getRateOfInterset()
    {
        return 10f;
    }
}

class PNB extends Bank{
    float getRateOfInterset()
    {
        return 4.5f;
    }
}

class HDFC extends Bank{
    float getRateOfInterset()
    {
        return 5.7f;
    }
}

class SBI extends Bank{
    float getRateOfInterset()
    {
        return 7.4f;
    }
}


class main
{
    public static void main(String[]args)
    {
        Bank obj;
        obj = new HDFC();
        System.out.println("HDFC interest "+obj.getRateOfInterset());

        obj = new SBI();
        System.out.println("SBI interest "+obj.getRateOfInterset());

        obj = new PNB();
        System.out.println("PNB interest "+obj.getRateOfInterset());
    }
}