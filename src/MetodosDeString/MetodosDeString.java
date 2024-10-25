package MetodosDeString;

public class MetodosDeString {
    public static void main(String[] args) {
        
        //Execute e a saída e o código escrito para entender.

        String texto = "teXTo EXEMplar      ";

        System.out.println("Texto original: " + texto);
        
        //método para ficar tudo em minúsculo
        String minusculo = texto.toLowerCase();
        System.out.println("ToLoweCase: "+ minusculo);
        
        //método para ficar tudo em maiúsculo
        String maiusculo = texto.toUpperCase();
        System.out.println("ToUpperCase: "+ maiusculo);
        
        //método para tirar os espaços vazios em ambas pontas (direita e esquerda)
        String tirar_espacos_em_branco = texto.trim();
        System.out.println("trim: " + tirar_espacos_em_branco);

        //método para cortar o texto, no exemplo abaixo o texto vale após a terceira linha e até a décima linha (3,10)
        String cortar_texto = texto.substring(3, 10);
        System.out.println("substring: " + cortar_texto);

        //método para pegar por espaço " " um texto
        String [] separador = texto.split(" ");
        System.out.println("split: " + separador[0]);
        System.out.println("split: " + separador[1]);
        
    }
}
