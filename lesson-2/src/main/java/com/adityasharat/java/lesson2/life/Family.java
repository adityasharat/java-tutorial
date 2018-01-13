package com.adityasharat.java.lesson2.life;

import com.adityasharat.java.lesson2.Entity;
import com.sun.istack.internal.NotNull;

/**
 * @author Aditya Sharat
 */
public class Family implements Entity {

    @NotNull
    private final Order order;

    @NotNull
    private final String name;

    public Family(Order order, String name) {
        this.order = order;
        this.name = name;
    }

    @NotNull
    public Order getOrder() {
        return order;
    }

    @NotNull
    public String getName() {
        return name;
    }
}
