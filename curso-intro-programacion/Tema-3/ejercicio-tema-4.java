class Main {
  
  public static void main(String[] args) {

    int numeroIf = -64;
    if(numeroIf > 0){
      System.out.println("Número positivo: " + numeroIf);
    }else if (numeroIf < 0){
      System.out.println("El número es negativo: " + numeroIf);
    }else {
      System.out.println("El número es 0");
    }
    /*Ciclo While*/
    int numeroWhile = -7;
    while(numeroWhile < 3){
      System.out.println(numeroWhile);
      numeroWhile++;
    }

    /*Ciclo Do-While*/
    int numeroDoWhile = 0;
    do {
      numeroDoWhile++;
      System.out.println(numeroDoWhile);
    }while(numeroDoWhile < 3);


    /*Ciclo For*/
    for(int numeroFor = 0; numeroFor <= 3; numeroFor++){
      System.out.println(numeroFor);
    }

    /*Switch*/
    String estacion = "Summer";
    switch(estacion){
      case "Spring":
        System.out.println("Estas en la estacion del año: " + estacion);
        break;
      case "Summer":
        System.out.println("Estas en la estacion del año: " + estacion);
        break;
      case "Fall":
        System.out.println("Estas en la estacion del año: " + estacion);
        break;
      case "Winter":
        System.out.println("Estas en la estacion del año: " + estacion);
        break;
      default:
        System.out.println("NO es una estacion del año");
        break;
    }
    


    
    
  }

}
