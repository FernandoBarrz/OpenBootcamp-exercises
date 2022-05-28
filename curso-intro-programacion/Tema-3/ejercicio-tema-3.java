class Main {
  
  public static void main(String[] args) {

    Coche myCoche = new Coche(4);
    myCoche.incrementaNumPuertas(1);
    System.out.println(myCoche.mostrarNumPuertas());
    
    
  }
  
  public static int sumaNumeros (int num1, int num2, int num3){
      return num1 + num2 + num3;
  }
  
}

class Coche{
  public int numPuertas;

  public Coche(int numPuertas){
    this.numPuertas = numPuertas;
  }

  public void incrementaNumPuertas(int cantidadPuertas){
    this.numPuertas += cantidadPuertas;
  }
  public int mostrarNumPuertas(){
    return this.numPuertas;
  } 
}
