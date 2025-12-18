package ma.enset.hamzaelghazouani;

import ma.enset.hamzaelghazouani.templates.MoroccoImpl;
import ma.enset.hamzaelghazouani.templates.Template;

public class Test {
    public static void main(String[] args) {
        Template template = new MoroccoImpl();
        System.out.println(template.perform(2,5));
    }
}
