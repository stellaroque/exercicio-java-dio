package exercicios.java.dio;

public class Main {

    public static void main(String[] args) {

        //Execicio: Calcular Operações Básicas
        System.out.println("\nCalculadora Dio:\n");
        CalculadoraDio.soma(10,5);
        CalculadoraDio.subtracao(10,5);
        CalculadoraDio.multiplicacao(10,5);
        CalculadoraDio.divisao(10,5);

        //Exercicio: Mostrar Determinado Cumprimento De Acordo Com A Hora Do Dia
        System.out.println("\nHora do dia:\n");
        HoraDia.obterMensagem(9);
        HoraDia.obterMensagem(14);
        HoraDia.obterMensagem(1);

        //Exercicio: Calcular Valor Final de Um Emprestimo
        System.out.println("\nExercicio Empréstimo:\n");
        ExercicioEmprestimo.calcular(1000,ExercicioEmprestimo.getDuasParcelas());
        ExercicioEmprestimo.calcular(1000,ExercicioEmprestimo.getTresParcelas());
        ExercicioEmprestimo.calcular(1000, 5);

    }


}
