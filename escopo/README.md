## Escopo

SE A VARIAVEL E DE CLASSE ELA PODE SER ACESSA DE TODOS OS METODOS DA CLASSE.

SE A VARIAVEL E DO METODO ELA SO E ACESSA DO METODOS QUE CORRESPONDE A ELA.

Em Java, o termo "escopo" refere-se à visibilidade e acessibilidade de variáveis, métodos e classes em um programa. Existem diferentes tipos de escopos em Java:

Escopo de Classe (ou Escopo de Compilação): Variáveis e métodos declarados fora de qualquer método em uma classe têm escopo de classe e são acessíveis em toda a classe.

public class Exemplo {<br>
   Variável de escopo de classe
    private static int numero = 10;  
    public static void main(String[] args) {
        // A variável 'numero' pode ser acessada aqui
        System.out.println(numero);
    }
}



## Escopo de metodo (ou escopo de bloco)

Escopo de Método (ou Escopo de Bloco): Variáveis declaradas dentro de um método têm escopo apenas dentro desse método e não podem ser acessadas fora dele.


public class Exemplo {<br>
    public static void main(String[] args) {<br>
        Variável de escopo de método
        int numero = 10;<br>
        // A variável 'numero' só é acessível dentro deste bloco<br>
        System.out.println(numero);
    }}

## Escopo de bloco

Escopo de Bloco: Em Java, você pode definir blocos de código usando chaves {}. As variáveis declaradas dentro de um bloco têm escopo apenas dentro desse bloco.

public class Exemplo {<br>
    public static void main(String[] args) {<br>
        int numero = 10;<br>  
        {<br>
            // Variável de escopo de bloco<br>
            int outroNumero = 20;<br>
            System.out.println(outroNumero); // Isso funciona<br>
        }
        // System.out.println(outroNumero); // Isso resultaria em um erro de compilação, 'outroNumero' não está acessível aqui
    }
}


## Escopo de parametro

Escopo de Parâmetro: Parâmetros de métodos têm escopo dentro do método e não podem ser acessados fora dele.

public class Exemplo {<br>
    public static void main(String[] args) {<br>
        int resultado = soma(5, 3);<br>
        // System.out.println(a); // Isso resultaria em um erro de compilação, 'a' não está acessível aqui
    }
    public static int soma(int a, int b) {<br>
        // Parâmetros 'a' e 'b' têm escopo dentro deste método<br>
        return a + b;
    }
}

Em resumo, o escopo em Java determina onde uma variável, método ou classe é acessível e visível dentro do código. Entender os escopos é fundamental para escrever código claro e evitar erros de acesso indevido.





