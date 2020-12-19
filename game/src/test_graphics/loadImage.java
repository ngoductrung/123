package test_graphics;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class loadImage {

    public static BufferedImage image;
    public static BufferedImage entities;
    public static BufferedImage player, enemy;

    /*public static void init() {
        image = imageLoader("night.png");
        entities = imageLoader("airplane.png");
        crop();

    }

    public static BufferedImage imageLoader (String path) {
        try {
            return ImageIO.read(loadImage.class.getResource(path));
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }
        return null;
    }*/
    public static void paint(Graphics g) {
        try {
            image = ImageIO.read(new File("C:\\Users\\ngo duc trung\\IdeaProjects\\game\\src\\night.PNG"));
            entities = ImageIO.read(new File("C:\\Users\\ngo duc trung\\IdeaProjects\\game\\src\\airplane.png"));
        }catch (IOException e) {
            e.printStackTrace();
        }
        crop();
    }

    public static void crop() {
        enemy = entities.getSubimage(0, 0, 83, 95);
        player = entities.getSubimage(83, 0, 115, 95);

    }
}


