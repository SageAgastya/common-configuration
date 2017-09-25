package common;

/**
 * Created by phanindra on 25/09/17.
 */
public abstract class SetCommonConfig {
    protected CommonConfig commonConfig;

    public void setCommonConfig(CommonConfig config) {
        // or just use refection to set config - method param is not required in this case.
        this.commonConfig = config;
    }
}
