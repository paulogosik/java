package TriangleAreas.Entities;

public class Triangle {
    // Foram criados membros para a classe Triange{}
    // Sendo eles a, b, c; Todos double e public
    public double a;
    public double b;
    public double c;

    public double Area() {
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
    
}
