package foo;

import common.SetCommonConfig;

import java.util.List;

/**
 * Created by phanindra on 25/09/17.
 */
// someone needs to set commonConfig
public class Config3 extends SetCommonConfig {
    public void foo() {
        System.out.println("in config3");
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
        List<String> strings = commonConfig.commonCode(html);
        strings.stream().forEach(System.out::println);
    }
}
