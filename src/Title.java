import java.util.Scanner;
public class Title extends Page {
    public Title(String input){
        Scanner get = new Scanner(input);
        String space = " ";
        String Title = get.nextLine();
        space = space.repeat((60-Title.length())/2);
        System.out.println(space+Title);

    }

}
