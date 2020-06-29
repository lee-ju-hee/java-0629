class Printer
{
    String model;
    String mnufacturer;
    int PrintedCount;
    int availablecount;

    Printer(String model1, String mnufacturer1, int availablecount1)
    {
        model = model1;
        mnufacturer = mnufacturer1;
        PrintedCount = 0;
        availablecount = availablecount1;
    }
    void print(int pages)
    {
        availablecount -= pages;
        PrintedCount += pages;
        System.out.println("ÀÎ¼âÁ¾ÀÌ¸Å¼ö " + pages);
        System.out.println("ÀÎ¼âÁ¾ÀÌÀÜ·® " + availablecount);
        System.out.println("ÀÎ¼âÁ¾ÀÌÃÑ¸Å¼ö " + PrintedCount);
    }
}

class PrintInk extends Printer
{
    int availableInk;

    PrintInk(String model1, String mnufacturer1, int availablecount1, int availableInk1)
    {
        super(model1, mnufacturer1, availablecount1);
        availableInk = availableInk1;
    }
    void printInk(int ink)
    {
        availableInk -= ink;
        System.out.println("À×Å©ÀÜ·®" + availableInk);
    }
}

public class ljh062902{
    public static void main(String[] args){

        PrintInk p1 = new PrintInk("·¹ÀÌÀú","»ï¼º",100, 200);

        p1.print(20);
        p1.print(15);
        p1.printInk(15);
    }
}