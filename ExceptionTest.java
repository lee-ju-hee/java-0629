public class ExceptionTest{
    public static void main(String[] args){

        BadClass bad = new BadClass();

        try{
            bad.badCode(true);
            System.out.println("프로그램 실행");
        }catch(IOException ex){
            System.out.println("IOException 오류발생");
        }catch(Exception e){
            System.out.println("오류발생");
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