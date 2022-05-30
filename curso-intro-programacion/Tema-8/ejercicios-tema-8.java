class Main {
  
  public static void main(String[] args) {
    Persona carpinterto = new Persona();
    carpinterto.setterEdad(20);
    carpinterto.setterNombre("Pedro");
    carpinterto.setterTelefono("5345345");

    System.out.println("Nombre: " + carpinterto.getterNombre());
    System.out.println("Edad: " + carpinterto.getterEdad());
    System.out.println("Telefono: " + carpinterto.getterTelefono());
    
  }
}


class Persona{
  private int edad;
  private String nombre;
  private String telefono;


  // Edad
  public void setterEdad(int edad){
    this.edad = edad;
  }
  
  public int getterEdad(){
    return this.edad;
  }
  // Nombre
  public void setterNombre(String nombre){
    this.nombre = nombre;
  }
  
  public String getterNombre(){
    return this.nombre;
  }
  // Telefono
  public void setterTelefono(String telefono){
    this.telefono = telefono;
  }
  
  public String getterTelefono(){
    return this.telefono;
  }
}
