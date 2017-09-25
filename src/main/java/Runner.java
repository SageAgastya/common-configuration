import foo.Config2;
import common.CommonConfigImpl;
import foo.Config1;
import foo.Config3;

/**
 * Created by phanindra on 25/09/17.
 */
public class Runner {
    public static void main(String[] args) {
        Config1 config1 = new Config1();
        config1.foo();

        Config2 config2 = new Config2();
        config2.setCommonConfig(new CommonConfigImpl());
        config2.foo();

        Config3 config3  = new Config3();
        config3.setCommonConfig(new CommonConfigImpl());
        config3.foo();

    }
}
