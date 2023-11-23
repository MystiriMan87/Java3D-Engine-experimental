import java.util.ArrayList;

public class Screen {
    private int[][] map;
    private int mapWidth;
    private int mapHeight;
    private ArrayList<Texture> textures;
    private int screenWidth;
    private int screenHeight;

    public Screen(int[][] map, int mapWidth, int mapHeight, ArrayList<Texture> textures, int screenWidth, int screenHeight) {
        this.map = map;
        this.mapWidth = mapWidth;
        this.mapHeight = mapHeight;
        this.textures = textures;
        this.screenWidth = screenWidth;
        this.screenHeight = screenHeight;
    }

    public void update(Camera camera, int[] pixels) {
        // Your existing update method code
    }
}
