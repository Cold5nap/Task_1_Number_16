import java.awt.*;

public class PaintStar {
    /*16.	Геометрическая фигура – звезда (вида https://ru.wikipedia.org/wiki/Звезда_(геометрия)).
Задается параметрами: координатами центра, внежним радиусом, внутренним радиусом и кол-вом "лучиков".
Реализовать методы: отображение, перемещение, массштабирование (см. задачу № 14).
В идеале (часть задания, которую можно не выполнять) сделать метод сохранения фигуры в svg-формате.
*/
    public static void main(String[] args){
        FrameMain frameMain = new FrameMain();
        /**
         * zoomFactor - маштабирование звезды
         */
        double zoomFactor = 1;
        double outRadius = 200;
        double inRadius = 100;
        double xCenter = outRadius;
        double yCenter = outRadius;
        int numberOfRays = 14;
        frameMain.setSize((int)(outRadius*2*zoomFactor+40),(int)(zoomFactor*outRadius*2+40) );
        Star star;
        /**
         * 1)
         * a)Звезда задается в программе
         */
        star = new Star(xCenter, yCenter, outRadius, inRadius, numberOfRays);

        /**
         * 1)Если хочется ввести параметры звезды с консоли
         * b)Ввод звезды с консоли(координата центра,
         * внешний и внутренний радиус, кол-во лучей)
         */
        //star = Star.enterStarFromConsole();
        /**
         * 2)Отображение звезды через FrameMain(наследник JFrame)
         */
        DisplayStar ds = new DisplayStar(star,zoomFactor);
        frameMain.add(ds);
        frameMain.repaint();
        System.out.println("Чтобы звезда отобразилась при вводе через консоль\n измените размер рамки, сдвинув границу окна");
    }

    /**
     * 3)Перемещение звезды(смщение по оси х,смещение по у)
     */
    void changeLocationStar(FrameMain frameMain,Star star) {
        star.changeStarCoordinates(100,50);
        frameMain.repaint();
    }

}
