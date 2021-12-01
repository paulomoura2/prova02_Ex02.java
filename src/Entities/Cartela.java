package Entities;

public class Cartela { 

    private int[][] DimensaoCartela = new int[5][5];
    private int QtdDisponivel = 24;

    public void PreencherCartela()
    {
        int lin_A = 0, lin_B = 0, lin_C = 0, lin_D = 0, lin_E = 0;
        int numeroSorteado;
        Sorteio sorteio = new Sorteio();

        while (QtdDisponivel != 0) {
            int numColuna;
            int numLinha;
            numeroSorteado = sorteio.Sortear();

            if (numeroSorteado <= 15) {
                numColuna = 0;
                numLinha = lin_A++;
            } else if (numeroSorteado <= 30) {
                numColuna = 1;
                numLinha = lin_B++;
            } else if (numeroSorteado <= 45) {
                numColuna = 2;
                numLinha = lin_C++;
            } else if (numeroSorteado <= 60) {
                numColuna = 3;
                numLinha = lin_D++;
            } else {
                numColuna = 4;
                numLinha = lin_E++;
            }

            if (numLinha == 2 && numColuna == 2) {
                DimensaoCartela[numLinha][numColuna] = 0;
                continue;
            }
            if (numLinha <= 4) {
                DimensaoCartela[numLinha][numColuna] = numeroSorteado;
                QtdDisponivel -= 1;
            }
        }
    }

    @Override
    public String toString()
    {
        String impressaoCartela = "";
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (DimensaoCartela[i][j] < 10) {
                    impressaoCartela += "| " + DimensaoCartela[i][j] + "  | ";
                } else {
                    impressaoCartela += "| " + DimensaoCartela[i][j] + " | ";
                }
            }
            impressaoCartela += "\n";
        }

        return impressaoCartela;
    }
}
