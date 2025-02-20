package jpu2016.javapetri.controller;

import jpu2016.javapetri.ihm.JavaPetriConsole;
import jpu2016.javapetri.model.JavaCell;
import jpu2016.javapetri.model.JavaPetri;
import jpu2016.javapetri.model.Position;

import java.awt.Color;
import java.util.Random;

public class JavaPetriController {
    static private int WIDTH = 100;
    static private int HEIGHT = 100;
    static private int STRENGTH = 50;
    static private int NB_CELL_START = 10;
    private final JavaPetri javaPetri;
    private final JavaPetriConsole ihm;

    public JavaPetriController() {
        final Random rand = new Random();
        this.javaPetri = new JavaPetri(WIDTH, HEIGHT);
        for (int i = 0; i < NB_CELL_START; i++) {
            this.javaPetri.addJavaCell(new JavaCell(this.javaPetri, new
                    Position(rand.nextInt(WIDTH), rand.nextInt(HEIGHT)), STRENGTH, new Color(rand.nextInt())));
        }
        this.ihm = new JavaPetriConsole(this.javaPetri);
    }
    public void start() {
        this.javaPetri.animate();
    }
}
