import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FrontMatter extends Chapter {
    public FrontMatter() {
        File f = new File("C:\\Users\\James\\IdeaProjects\\CMPS 260\\pa5-data-fullbook\\title.txt");
        try (Scanner in = new Scanner(f)) {
            while (in.hasNextLine()) {
                new Title(in.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Error reading file " + f.getName() + "\n" + e);
        }

        System.out.println();
        String dashes = "-";
        System.out.println(dashes.repeat(60)+"Table of Contents\n");

        File g = new File("C:\\Users\\James\\IdeaProjects\\CMPS 260\\pa5-data-fullbook\\toc.txt");
        try (Scanner in = new Scanner(g)) {
            while (in.hasNextLine()) {
                new TOC(in.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Error reading file " + g.getName() + "\n" + e);
        }

        File h = new File("C:\\Users\\James\\IdeaProjects\\CMPS 260\\pa5-data-fullbook\\toc.txt");
        try (Scanner in = new Scanner(h)) {
            while (in.hasNextLine()) {
                Public preface = new Public();

            }
        } catch (Exception e) {
            System.out.println("Error reading file " + h.getName() + "\n" + e);
        }
    }


}
