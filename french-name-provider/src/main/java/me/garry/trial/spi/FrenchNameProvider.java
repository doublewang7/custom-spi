package me.garry.trial.spi;

public class FrenchNameProvider implements CustomNameProvider {
    @Override
    public String getName() {
        return "Français";
    }
}
