class Main {
  
  public static void main(String[] args) {

    Cliente cliente_1 = new Cliente();
    cliente_1.setterNombre("Fernando");
    cliente_1.setterEdad(20);
    cliente_1.setterTelefono("4524");
    cliente_1.setterCredito(454323452);
    System.out.println(cliente_1.getterNombre());
    System.out.println(cliente_1.getterEdad());
    System.out.println(cliente_1.getterTelefono());
    System.out.println(cliente_1.getterCredito());


    Trabajador trabajador_1 = new Trabajador();
    trabajador_1.setterEdad(32);
    trabajador_1.setterNombre("Pancho");
    trabajador_1.setterTelefono("4234234");
    trabajador_1.setterSalario(3240);
    
    System.out.println(trabajador_1.getterNombre());
    System.out.println(trabajador_1.getterEdad());
    System.out.println(trabajador_1.getterTelefono());
    System.out.println(trabajador_1.getterSalario());
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

class Cliente extends Persona {
  private int credito;

  // Credito
  public void setterCredito(int credito){
    this.credito = credito;
  }
  
  public int getterCredito(){
    return this.credito;
  }
  
}

class Trabajador extends Persona {
  private int salario;

    // Salario
  public void setterSalario(int salario){
    this.salario = salario;
  }
  
  public int getterSalario(){
    return this.salario;
  }
}
