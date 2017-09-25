package foo;

import common.CommonConfig;
import common.CommonConfigImpl;

import java.util.List;

/**
 * Created by phanindra on 25/09/17.
 */
// implement method
    // someone needs to call the right commonConfig code
public class Config1 implements CommonConfig {

    public void foo() {
        System.out.println("in config1");
        String html = "<!DOCTYPE html>\n" +
                "<html>\n" +
                "<body>\n" +
                "\n" +
                "<h1>This is heading 1</h1>\n" +
                "<h2>faq1</h2>\n" +
                "<h2>faq2</h2>\n" +
                "<h2>faq3</h2>\n" +
                "\n" +
                "</body>\n" +
                "</html>\n";
        List<String> strings = commonCode(html);
        strings.stream().forEach(System.out::println);


    }

    @Override
    public List<String> commonCode(String html) {
        return new CommonConfigImpl().commonCode(html);
    }
}
