/*
* @Author: Marte
* @Date:   2018-07-11 10:51:45
* @Last Modified by:   Marte
* @Last Modified time: 2018-07-11 14:47:23
*/

public class First {

    ArrayList<Integer> list = new ArrayList<Integer>();


    public void setlist(){
        list.add("string");
        list.add("sql");
        list.add("git commands");
    }


   public void printList(){
      System.out.println(list);
   }

    public static void main(String[] args) {
        System.out.println("hello world");
        First first = new First();
        first.setlist();
        first.printList();
    }

}