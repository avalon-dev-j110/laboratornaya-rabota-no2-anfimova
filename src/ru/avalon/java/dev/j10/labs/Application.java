package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.shapes.Circle;
import ru.avalon.java.dev.j10.labs.shapes.Rectangle;
import ru.avalon.java.dev.j10.labs.shapes.Shape;
import ru.avalon.java.dev.j10.labs.shapes.Triangle;

import java.util.Random;

public class Application {

    public static void main(String[] args) {
        Shape[] shapes = generateShapes(10);
        getMaxArea(shapes);
        System.out.println(getMaxArea(shapes));

        /*
         * TODO: Выполнить действия над массивом 'shapes'
         *
         * 1. Проинициализировать переменную 'shapes' массивом
         *    содержащим 10 произвольных фигур. Массив должен
         *    содержать экземпляры классов Circle, Rectangle
         *    и Triangle.
         *
         * 2. Найти в массиве 'shapes' фигуру с максимальной
         *    площадью. Для поиска фигуры необходимо создать
         *    статический метод в текущем классе (Application).
         */
    }

    private static Shape[] generateShapes(int count) {
        Shape[] shapes = new Shape[count];
        Random random = new Random();
        for (int i = 0; i < shapes.length; i++) {
            int shapeType = random.nextInt(3);
            switch (shapeType) {
                case 0:
                    shapes[i] = new Circle();
                    break;
                case 1:
                    shapes[i] = new Triangle();
                    break;
                case 2:
                    shapes[i] = new Rectangle();
                    break;
            }
        }
        return shapes;
    }

    private static float getMaxArea(Shape[] shapes) {
        float maxArea = 0;
        for (int i = 0; i < shapes.length; i++) {
            float area = shapes[i].getArea();
//            System.out.println("area = " + area);
            if (area > maxArea) maxArea = area;
//            System.out.println("maxArea = " + maxArea);
        }
        return maxArea;
    }

}
