package ru.progwards.java1.lessons.basics;

public class Distance3D {
    public static double distance(double x1, double y1,double z1, double x2, double y2,
                                  double z2) {
        double AB;
        double xb = x2;
        double xa = x1;
        double yb = y2;
        double ya = y1;
        double zb = z2;
        double za = z1;
        AB = (xb - xa)*2 + (yb - ya)*2 + (zb - za)*2;
        System.out.println(Math.sqrt(AB));
        return AB;
    }

    public static void main(String[] args) {
  //      distance(36.265195026061036, 24.464059817226385, 35.35018883007724, 24.464059817226385, 24.464059817226385, 33.17537824627905);
    }
}
