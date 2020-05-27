package test;

        import com.alibaba.fastjson.JSON;

        import java.util.StringTokenizer;

/**
 *split与StringTokenizer的区别
 */
public class TestArray {
    public static void main(String[] args) {
        String  a="ni,wo,ta,dajia,hao,a";
        //spilt方法
        String[] b=a.split(",");
        System.out.println(JSON.toJSONString(b,Boolean.TRUE));
        //StringTokenizer方法
        StringTokenizer tokenizer = new StringTokenizer(a,",");
        String[] c=new String[tokenizer.countTokens()];
        String[] d = new String[c.length];
        int i=0;
        while(tokenizer.hasMoreTokens()){
            d[i]=tokenizer.nextToken();
            i++;
        }
        System.out.println(JSON.toJSONString(d,Boolean.TRUE));

    }



}
