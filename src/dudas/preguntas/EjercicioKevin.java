package dudas.preguntas;

public class EjercicioKevin {

	public static void main(String[] args) {
		int salarios[][] = { { 700, 900, 1300 }, { 1000, 950, 1080 }, { 1300, 930, 1200 } };
		String empleados[] = { "Javier Marías", "Antonio Muñoz", "Isabel Allende" };
		int salarioTotal = 0;
		for (int i = 0; i < salarios.length; i++) {
			for (int j = 0; j < salarios[i].length; j++) {
				salarioTotal += salarios[i][j];
			}
			System.out.println(empleados[i] + ":" + salarioTotal);
			salarioTotal = 0;
		}
	}

}
