package test;

public class TestTryMethod {

    static  int test(){
        int i=1;
        int j=0;
        try{
            i++;
            if(i==2){
                return i;
            }
            j++;
            System.out.println(j);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println(++i);
        }
        return 0;
    }


    public static void main(String[] args) {
        System.out.println(new TestTryMethod().test());
    }
}
