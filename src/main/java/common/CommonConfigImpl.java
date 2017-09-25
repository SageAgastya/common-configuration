package common;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by phanindra on 25/09/17.
 */
public class CommonConfigImpl implements CommonConfig {

    @Override
    public List<String> commonCode(String html) {
        Document document = Jsoup.parse(html);
        Elements h2 = document.getElementsByTag("h2");
        return h2.stream().map(e-> e.text()).collect(Collectors.toList());
    }
}
