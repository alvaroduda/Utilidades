package SobreEnum;

public class Sistema {
    
    /*
    aqui eu declaro um método privado, static que não vai retornar nada,
    dentro dos () eu declaro uma "variável" dia do tipo "DiaSemana",
    depois eu crio condições usando switch/case e boto em condição os valores enums declarados no "DiaSemana"
    para assim atribuir uma condição para cada valor enum.                                                                                */
    private static void imprimirDiaSemana(DiaSemana dia) {
        switch (dia) {
            case SEGUNDA_FEIRA:
                System.out.println("Segunda-feira");
                break;
            case TERCA_FEIRA:
                System.out.println("Terça-feira");
                break;
            case QUARTA_FEIRA:
                System.out.println("Quarta-feira");
                break;
            case QUINTA_FEIRA:
                System.out.println("Quinta-feira");
                break;
            case SEXTA_FEIRA:
                System.out.println("Sexta-feira");
                break;
            case SABADO:
                System.out.println("Sábado");
                break;
            case DOMINGO:
                System.out.println("Domingo");
                break;
        }
    }

    /*
    aqui eu declaro um método privado, static que não vai retornar nada,
    nele eu crio variáveis do tipo "DiaSemana" e dou a elas o valor dos valores enums que DiaSemana contém
    após isso eu chamo o método acima "imprimirDiaSemana(DiaSemana dia)" e passo como argumento entre os ()
    apenas os valores das variáveis criadas que armazenam todo o valor de cada valor enum.
    */
    private static void dias_da_semana() {
        DiaSemana segunda = DiaSemana.SEGUNDA_FEIRA;
        DiaSemana terca = DiaSemana.TERCA_FEIRA;
        DiaSemana quarta = DiaSemana.QUARTA_FEIRA;
        DiaSemana quinta = DiaSemana.QUINTA_FEIRA;
        DiaSemana sexta = DiaSemana.SEXTA_FEIRA;
        DiaSemana sabado = DiaSemana.SABADO;
        DiaSemana domingo = DiaSemana.DOMINGO;
    
        imprimirDiaSemana(segunda);
        imprimirDiaSemana(terca);
        imprimirDiaSemana(quarta);
        imprimirDiaSemana(quinta);
        imprimirDiaSemana(sexta);
        imprimirDiaSemana(sabado);
        imprimirDiaSemana(domingo);   
    }


    //outra forma de atingir o mesmo resultado do método acima ("dias_da_semana")
    private static void dias_da_semana2() {
        
        imprimirDiaSemana(DiaSemana.SEGUNDA_FEIRA);
        imprimirDiaSemana(DiaSemana.TERCA_FEIRA);
        imprimirDiaSemana(DiaSemana.QUARTA_FEIRA);
        imprimirDiaSemana(DiaSemana.QUINTA_FEIRA);
        imprimirDiaSemana(DiaSemana.SEXTA_FEIRA);
        imprimirDiaSemana(DiaSemana.SABADO);
        imprimirDiaSemana(DiaSemana.DOMINGO);   
   
    }


    /*
    método principal (poderia ser usado em outra classe, mas ai eu precisaria chamar os métodos com a instanciação
    de um objeto dessa classe (Sistema)*/
    public static void main(String[] args) {
        System.out.println("----------------------------------");
        System.out.println("Primeiro método (dias_da_semana())");
        System.out.println("----------------------------------");
        dias_da_semana();
        System.out.println("-----------------------------------");
        System.out.println("Segundo método (dias_da_semana2())");
        System.out.println("----------------------------------");
        dias_da_semana2();
    }

}
