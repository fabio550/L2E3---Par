package controller;

public class ParController {
    public ParController() {
        super();
    }

    public int CalcNumPar(int[] vetor, int tamanho) {

        if (tamanho == 0) {
            return 0;
        } else {
            if (vetor[tamanho-1] % 2 == 0) {
                return CalcNumPar(vetor, tamanho -1) + 1;
            } else {
                return CalcNumPar(vetor, tamanho -1);
            }
        }
    }
}
