package ru.itpark;

public class CalcWallPaper {
    public double calculate(double longWall, double longWall2, double ceilingHeight) {
        double stripWallpaper = ((longWall + longWall2) * 2) / 1;
        double canvasWallpaper = 10 / (ceilingHeight + 0.10);
        int summWallpaper = (int) (stripWallpaper / canvasWallpaper) + 1;
        return summWallpaper;
    }
}
