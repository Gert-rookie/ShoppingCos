package top.fotg.vo;

public class Color {
        private String color;
        private String color_name;
        private int restnumber;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor_name() {
        return color_name;
    }

    public void setColor_name(String color_name) {
        this.color_name = color_name;
    }

    public int getRestnumber() {
        return restnumber;
    }

    public void setRestnumber(int restnumber) {
        this.restnumber = restnumber;
    }

    public Color(String color, String color_name, int restnumber) {
        this.color = color;
        this.color_name = color_name;
        this.restnumber = restnumber;
    }
}
