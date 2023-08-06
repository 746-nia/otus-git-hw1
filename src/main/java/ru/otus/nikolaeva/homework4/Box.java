package ru.otus.nikolaeva.homework4;

public class Box {
    private float length;
    private float width;
    private float height;
    private String color;
    private boolean stateOpen;
    public String content;

    public Box(float length, float width, float height, String color) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public float getLength() {
        return length;
    }

    public float getWidth() {
        return width;
    }

    public float getHeight() {
        return height;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean open(){
        System.out.println("Коробка открыта");
        stateOpen = true;
        return stateOpen;
    }

    public boolean close(){
        System.out.println("Коробка закрыта");
        stateOpen = false;
        return stateOpen;
    }

    public void info(){
        System.out.println("Информация о коробке.");
        System.out.println("Характеристики коробки: длина - " + length + ", ширина - " + width + ", высота - " + height + ", цвет - " + color);
    }

    public void putObj(String obj) {
        if(stateOpen){
            if(content == null){
                System.out.println("Коробка заполнена. В ней ноходится предмет " + obj);
                content = obj;

            }else {
                if(content.equals(obj)){
                    System.out.println("Коробка пуста. Предмет " + obj + " вытащен из коробки.");
                    content = "";
                } else System.out.println("Сначала нужно поместить предмет " + obj + " в коробку. Для этого вытащите из коробки предмет " + content);

            }

        }else System.out.println("Коробка закрыта. Откройте ее.");
    }

}
