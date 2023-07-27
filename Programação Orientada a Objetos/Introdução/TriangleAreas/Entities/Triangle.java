// Está dentro do pacote pois está sendo considerado que Triangle{} é uma entidade
package TriangleAreas.Entities;

public class Triangle {
    // Foram criados membros para a classe Triange{}
    // Sendo eles a, b, c; Todos double e public
    // Quando um membro é 'public' ele pode ser acessado por outro arquivo, é público
    public double a;
    public double b;
    public double c;

    // 'public' indica que esta função poderá ser usada em outro arquivo
    // 'double' indica que a função retornará um valor do tipo double
    // Se a função não retornar nada, usamos 'void' no lugar do 'double'
    public double Area() {
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}