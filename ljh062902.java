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
        System.out.println("�μ����̸ż� " + pages);
        System.out.println("�μ������ܷ� " + availablecount);
        System.out.println("�μ������Ѹż� " + PrintedCount);
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
        System.out.println("��ũ�ܷ�" + availableInk);
    }
}

public class ljh062902{
    public static void main(String[] args){

        PrintInk p1 = new PrintInk("������","�Ｚ",100, 200);

        p1.print(20);
        p1.print(15);
        p1.printInk(15);
    }
}