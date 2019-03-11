package ru.itpark;

public class CalcWallPaper {
    public double calculate(double wallWidth, double wallLength, double ceilingHeight) {

        int lengthWallpaperRoll = 10; // Длина обойного рулона = 10м
        double additionalStockCeiling = 0.10; // Дополнительный запас к высоте потолка
        double widthWallpaper = 1.06;
        double stripWallpaper = ((wallLength + wallWidth) * 2) / widthWallpaper;
        double canvasWallpaper = lengthWallpaperRoll / (ceilingHeight + additionalStockCeiling);
        int summWallpaper = (int) (stripWallpaper / canvasWallpaper) + 1;
        return summWallpaper;
    }
}
