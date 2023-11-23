import java.awt.Color;
import java.awt.image.BufferedImage;

public class Texture {
    public static Texture wood = new Texture(1, 1);
    public static Texture brick = new Texture(1, 1);
    public static Texture bluestone = new Texture(1, 1);
    public static Texture stone = new Texture(1, 1);

    private int[] pixels;
    private int width;
    private int height;

    public Texture(int w, int h) {
        this.width = w;
        this.height = h;
        pixels = new int[w * h];
        // Your existing initialization code
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int[] getPixels() {
        return pixels;
    }
}
