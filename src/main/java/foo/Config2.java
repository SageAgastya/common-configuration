package foo;

import common.CommonConfig;
import common.CommonConfigImpl;

import java.util.List;

/**
 * Created by phanindra on 25/09/17.
 */
// requires to add setter methods.
    // someone needs to set commonConfig

public class Config2 {

    private CommonConfig commonConfig;
    public void foo() {
        System.out.println("in config2");
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

    public CommonConfig getCommonConfig() {
        return commonConfig;
    }

    public void setCommonConfig(CommonConfig commonConfig) {
        this.commonConfig = commonConfig;
    }



}
