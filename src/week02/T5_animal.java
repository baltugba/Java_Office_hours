package week02;

public class T5_animal {
    public static void main(String[] args) {

      String animal="CAT" ;
      switch (animal){
          case "DOG":
          case "CAT":
              System.out.println(animal + " is domestic animal");
              break;
          case "TIGER":
              System.out.println(animal + "is a wild animal");
              break;
          default:
              System.out.println(animal + "is not know");
              break;
      }



        /*
        te  a program that accepts animal as String

                            DOG     - domestic animal
                            CAT     - domestic animal
                            TIGER     - wild  animal

                            For other animal - unknown animal

                            INPUT : DOG         EXPECTED OUTPUT : DOG is domestic animal
         */
    }
}
