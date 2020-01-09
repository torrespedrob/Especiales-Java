package gatos;

public class GatoSimple {
// atributos /////////////////////////////

  String color, raza, sexo;
  int edad;
  double peso;
// métodos ///////////////////////////////
// constructor

  GatoSimple(String s) {
    this.sexo = s;
  }
// getter

  String getSexo() {
    return this.sexo;
  }

  /**
   * Hace que el gato maulle
   */
  void maulla() {
    System.out.println("Miauuuu");
  }

  /**
   * Hace que el gato ronronee
   */
  void ronronea() {
    System.out.println("mrrrrrr");
  }

  void come(String comida) {
    if (comida.equals("pescado")) {
      System.out.println("Hmmmm, gracias");
    } else {
      System.out.println("Lo siento, yo solo como pescado");
    }
  }

  /**
   * Pone a pelear dos gatos. Solo se van a pelear dos machos entre sí.
   *
   * @param contrincante es el gato contra el que pelear
   */
  void peleaCon(GatoSimple contrincante) {
    if (this.sexo.equals("hembra")) {
      System.out.println("no me gusta pelear");
    } else {
      if (contrincante.getSexo().equals("hembra")) {
        System.out.println("no peleo contra gatitas");
      } else {
        System.out.println("ven aquí que te vas a enterar");
      }
    }
  }

  GatoSimple apareaCon(GatoSimple pareja) {
    //Genera probabilidades
    int probab = (int) (Math.random() * 100);
    int probab2 = (int) (Math.random() * 100);
    //
    if ((this.sexo.equals("macho") && pareja.sexo.equals("hembra")) || (this.sexo.equals("hembra") && pareja.sexo.equals("macho"))) {
      if (probab > 80) {
        return null;
      } else { //Cria con exito
        System.out.println("Enhorabuena, los gatos han tenido una cría");
        System.out.println("Su nombre es cria01");
        if (probab2 > 50) {
          GatoSimple cria01 = new GatoSimple("macho");
          return cria01;
        } else {
          GatoSimple cria01 = new GatoSimple("hembra");
          return cria01;
        }
      }
    } else {
      System.out.println("No quiero aparearme");
    }
  }
}
