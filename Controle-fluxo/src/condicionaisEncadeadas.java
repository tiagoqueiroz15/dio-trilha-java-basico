public class condicionaisEncadeadas {
  public static void main(String[] args) {
    
   int nota = 10;

    if (nota >= 7)
    System.out.println("Aprovado");

    else if (nota >= 5 && nota < 7) 
      System.out.println("prova de recuperação");
    
     if (nota >= 9 && nota == 10) 
      System.out.println("nota maxima");
    
    else
    System.out.println("Reprovado");

  }
}
