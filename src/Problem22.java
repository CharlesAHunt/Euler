import java.util.ArrayList;
import java.util.List;

/**
 * User: Charles
 * Date: 5/2/13
 *
 * Using names.txt, a 46K text file containing over five-thousand first names, begin by sorting it into alphabetical order. Then working out the alphabetical value for each name,
 * multiply this value by its alphabetical position in the list to obtain a name score.
 For example, when the list is sorted into alphabetical order, COLIN, which is worth 3 + 15 + 12 + 9 + 14 = 53, is the 938th name in the list. So, COLIN would obtain a score of 938  53 = 49714.
 What is the total of all the name scores in the file?
 */
public class Problem22 {

    List<String> nameList = new ArrayList<String>();

    public Long solve() {

        Long result = 0L;

        sortList();

        Integer nameValue = 1;
        Long totalNameValues = 0L;

        for(String name : nameList) {
            nameValue++;      //todo
        }

        return result;
    }

    private void sortList() {
        //TODO
    }

    private int getAlphaValue(char character) {

        if(character == 'a')
            return 1;
        if(character == 'b')
            return 2;
        if(character == 'c')
            return 3;
        if(character == 'd')
            return 4;
        if(character == 'e')
            return 5;
        if(character == 'f')
            return 6;
        if(character == 'g')
            return 7;
        if(character == 'h')
            return 8;
        if(character == 'i')
            return 9;
        if(character == 'j')
            return 10;
        if(character == 'k')
            return 11;
        if(character == 'l')
            return 12;
        if(character == 'm')
            return 13;
        if(character == 'n')
            return 14;
        if(character == 'o')
            return 15;
        if(character == 'p')
            return 16;
        if(character == 'q')
            return 17;
        if(character == 'r')
            return 18;
        if(character == 's')
            return 19;
        if(character == 't')
            return 20;
        if(character == 'u')
            return 21;
        if(character == 'v')
            return 22;
        if(character == 'w')
            return 23;
        if(character == 'x')
            return 24;
        if(character == 'y')
            return 25;
        if(character == 'z')
            return 26;
        else
            throw new RuntimeException();
    }

}
