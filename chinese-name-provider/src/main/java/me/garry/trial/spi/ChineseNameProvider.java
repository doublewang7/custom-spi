package me.garry.trial.spi;

public class ChineseNameProvider implements CustomNameProvider {
    @Override
    public String getName() {
        return "中文";
    }
}
