package test.arrayList;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 链接：https://blog.csdn.net/ztlzlzl/article/details/106987229
 */
public class ListError {
   /* public static void main(String[] args) {
        ArrayList<Integer> arrayLists = new ArrayList<>();
        arrayLists.add(new Integer(1));
        arrayLists.add(new Integer(2));
        arrayLists.add(new Integer(3));
        arrayLists.add(new Integer(4));
        arrayLists.add(new Integer(5));
        arrayLists.add(new Integer(6));
        arrayLists.add(new Integer(7));
        arrayLists.add(new Integer(8));

        for (Integer num:arrayLists) {
            if(num.equals(new Integer(3))){
                arrayLists.remove(new Integer(3));
            }
        }
    }*/

    /*public static void main(String[] args) {
        ArrayList<Integer> arrayLists = new ArrayList<>();
        arrayLists.add(new Integer(1));
        arrayLists.add(new Integer(2));
        arrayLists.add(new Integer(3));
        arrayLists.add(new Integer(4));
        arrayLists.add(new Integer(5));
        arrayLists.add(new Integer(6));
        arrayLists.add(new Integer(7));
        arrayLists.add(new Integer(8));

        Iterator<Integer> iterator = arrayLists.iterator();
        while(iterator.hasNext()){
            Integer num = iterator.next();
            if(num.equals(new Integer(3))){
                arrayLists.remove(3);//importance
            }
        }

    }*/
    public static void main(String[] args) {
        ArrayList<Integer> arrayLists = new ArrayList<>();
        arrayLists.add(new Integer(1));
        arrayLists.add(new Integer(2));
        arrayLists.add(new Integer(3));
        arrayLists.add(new Integer(4));
        arrayLists.add(new Integer(5));
        arrayLists.add(new Integer(6));
        arrayLists.add(new Integer(7));
        arrayLists.add(new Integer(8));

        Iterator<Integer> iterator = arrayLists.iterator();
        while(iterator.hasNext()){
            Integer num = iterator.next();
            if(num.equals(new Integer(3))){
                iterator.remove();//importance
            }
        }
        System.out.println(arrayLists.toString());
    }
    /**
     * [1, 2, 4, 5, 6, 7, 8]
     */
}
