public class ExceptionTest{
    public static void main(String[] args){

        BadClass bad = new BadClass();

        try{
            bad.badCode(true);
            System.out.println("���α׷� ����");
        }catch(IOException ex){
            System.out.println("IOException �����߻�");
        }catch(Exception e){
            System.out.println("�����߻�");
        }
    }
}

class BadClass{
    public void badCode(boolean bool)throws Exception{

        if(bool){
            throw new Exception();
        }
    }
}