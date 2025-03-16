package edu.paulo.challengedio;

public class Contador {

    public  void diferenca(int num1, int num2) throws ParametrosInvalido{

        if (num1 > num2){
            throw new ParametrosInvalido("Erros nos parametros");
        }else if ((num2 - num1) == 0){
            throw new ParametrosInvalido("O parametros não podem serem iguais");
        }

        for (int iterador = 1; iterador <= (num2 - num1); iterador++){

            if (iterador == (num2 - num1)){
                System.out.printf("Foi nescessario %d iterações", iterador);
                return;
            }
        }
    }
}
