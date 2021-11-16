package me.garry.trial;

import me.garry.trial.spi.CustomNameProvider;

import java.util.ServiceLoader;

public class Entry {
    public static void main(String[] args) {
        ServiceLoader<CustomNameProvider> loader = ServiceLoader.load(CustomNameProvider.class);
        loader.forEach(provider -> System.out.println(provider.getName()));
    }
}
