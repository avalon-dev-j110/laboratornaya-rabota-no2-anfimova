package ru.avalon.java.dev.j10.labs.shapes;

import java.util.Random;

/**
 * Представление о треугольнике.
 * <p>
 * Треуго́льник (в евклидовом пространстве) — геометрическая
 * фигура, образованная тремя отрезками, которые соединяют
 * три точки, не лежащие на одной прямой. Указанные три
 * точки называются вершинами треугольника, а отрезки —
 * сторонами треугольника. Часть плоскости, ограниченная
 * сторонами, называется внутренностью треугольника: нередко
 * треугольник рассматривается вместе со своей внутренностью
 * (например, для определения понятия площади).
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%A2%D1%80%D0%B5%D1%83%D0%B3%D0%BE%D0%BB%D1%8C%D0%BD%D0%B8%D0%BA">Треугольник</a>
 */

public class Triangle implements Polygon {

    /*
     * TODO: Реализовать класс 'Triangle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */

    private float a;
    private float b;
    private float c;

    public Triangle() {
        this.a = getSide();
        this.b = getSide();
        this.c = getSide();
    }

    @Override
    public float getSide() {
        Random random = new Random();
        float side = random.nextInt(5) + 1;
        return side;
    }

    @Override
    public float getPerimeter() {
        return a + b + c;
    }

    @Override
    public float getArea() {
        float halfP = getPerimeter() / 2;
        return (float) Math.sqrt(halfP * (halfP - a) * (halfP - b) * (halfP - c));
    }
}
