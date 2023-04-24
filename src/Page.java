import java.util.ArrayList;

public class Page {
    ArrayList<String> list = new ArrayList<>();

    /*public Page(String word){
        if (!checker(word)){
            System.out.println();
            System.out.println();
        }
    }
    */
    public boolean checker(String word){
      if(list.size()==0){
          list.add(word);
          return true;
      }
      else if(list.get(list.size()).length()<60){
          list.add(list.size(),list.get(list.size())+word);
          list.remove(list.size()+1);
          return true;
      }
      else if(list.size()<42 && list.get(list.size()).length()>60){
          list.add(list.size(),"\n"+word);
          list.remove(list.size()+1);
          return true;
      }
      else return list.size() != 42;
    }

}
