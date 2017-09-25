package common;

import org.junit.Test;

import java.util.List;

import static junit.framework.TestCase.*;

/**
 * Created by phanindra on 25/09/17.
 */
public class CommonConfigImplTest {

    CommonConfig commonConfig = new CommonConfigImpl();

    @Test
    public void test_split_based_on_h2_elements() {
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
        List<String> h2Strings = commonConfig.commonCode(html);
        assertNotNull(h2Strings);
        assertEquals(3, h2Strings.size());
        assertTrue(h2Strings.contains("faq1"));
        assertTrue(h2Strings.contains("faq2"));
        assertTrue(h2Strings.contains("faq3"));
        assertFalse(h2Strings.contains("faq4"));
    }
}
