package by.it._tasks_.jd01_06;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class TaskA1 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder(Poem.text);
        Pattern p=Pattern.compile("[А-яЁё]{4,}");
        Matcher m=p.matcher(Poem.text);
        while (m.find()){
            sb.replace(m.start()+3,m.start()+4,"#");
            if (m.group().length()>6)
                sb.replace(m.start()+6,m.start()+7,"#");
        }
        System.out.println(sb.toString());
    }
}
