package Entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Sorteio {

    private List<Integer> NumerosSorteados = new ArrayList<Integer>();
    private Random NumRandom = new Random();

    public List<Integer> getNumerosSorteados() {
        return NumerosSorteados;
    }

    public int Sortear() {
        try
        {
            int numero;
            do {
                numero = NumRandom.nextInt(75);
                numero = VerificarNumeroSorteado(numero);

                if (numero != 0) {
                    NumerosSorteados.add(numero);
                }
            } while (numero == 0);
            return numero;
        }
        catch (Exception exception)
        {
            throw exception;
        }
    }

    private int VerificarNumeroSorteado(int numeroSorteado) {
        try
        {
            for (int i = 0; i < NumerosSorteados.size(); i++) {
                if (NumerosSorteados.get(i) == numeroSorteado) {
                    return 0;
                }
            }
            return numeroSorteado;
        }
        catch(Exception exception)
        {
          throw  exception;
        }
    }
}
