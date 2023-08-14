package view;
import controller.ParController;

public class Principal {
    public static void main(String[] args) {
        ParController pc = new ParController();

        int res = pc.CalcNumPar(new int[]{1, 5, 7, 8, 2, 6, 4, 3, 7, 3}, 10);

        System.out.println(res); // resultado esperado: 5

    }
}
