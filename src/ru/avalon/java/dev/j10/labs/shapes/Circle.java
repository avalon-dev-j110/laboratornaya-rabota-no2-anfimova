package ru.avalon.java.dev.j10.labs.shapes;

import java.util.Random;

/**
 * Представление об окружности.
 * <p>
 * Окру́жность — замкнутая плоская кривая, которая состоит из
 * всех точек на плоскости, равноудалённых от заданной точки.
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%9E%D0%BA%D1%80%D1%83%D0%B6%D0%BD%D0%BE%D1%81%D1%82%D1%8C">Окружность</a>
 */

public class Circle implements Ellipse {

    /*
     * TODO: Реализовать класс 'Circle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */

    private float x;
    private float y;

    public Circle() {
        this.x = getX();
        this.y = getY();
    }

    public float getX() {
        Random random = new Random();
        return random.nextInt(5) + 1;
    }

    public float getY() {
        Random random = new Random();
        return random.nextInt(5) + 1;
    }

    public float getLength() {
        return (float) (Math.PI * (x + y));
    }

    @Override
    public float getArea() {
        float radius = (float) Math.sqrt(x*x + y*y);
        return (float) (radius*radius*Math.PI);
    }

}
