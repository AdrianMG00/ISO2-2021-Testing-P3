package BC.Ej_Testing_3;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import BC.Ej_Testing_3.ejercicio3;

public class ejercicio3_test extends TestCase {

	@Test
	public void test () {
		ejercicio3 ej = new ejercicio3();
		
		/*Se inicializan todos los valores que se van a usar
		en el testing para luego elegir sobre cada variable
		los que se van a usar */
		String letra = "a";
		int valor1 = -1;
		int valor2 = 0;
		int valor3 = 1;
		int valor4 = 9;
		int valor5 = 10;
		int valor6 = 11;
		int valor7 = 34;
		int valor8 = 35;
		int valor9 = 36;
		int valor10 = 69;
		int valor11 = 70;
		int valor12 = 71;
		int valor13 = 89;
		int valor14 = 90;
		int valor15 = 91;
		int valor16 = 99;
		int valor17 = 100;
		int valor18 = 101;
		int valor19 = 2147483647;
		int valor20 = -2147483648;
		int valor21 = 49;
		int valor22 = 50;
		int valor23 = 51;
		
		//Testing con el método at-least-once
		//orden de las variables en la llamada: int rango_completitudF, int rango_correccionF, int rango_pertinenciaF
		assertTrue(ej.certificado_calidad_funcional(valor1, valor1, valor1)<6&ej.certificado_calidad_funcional(valor1, valor1, valor1)>-1);
		int fun1 = ej.certificado_calidad_funcional(valor1, valor1, valor1);
		assertTrue(ej.certificado_calidad_funcional(valor2, valor2, valor2)<6&ej.certificado_calidad_funcional(valor2, valor2, valor2)>-1);
		assertTrue(ej.certificado_calidad_funcional(valor3, valor3, valor3)<6&ej.certificado_calidad_funcional(valor3, valor3, valor3)>-1);
		assertTrue(ej.certificado_calidad_funcional(valor4, valor4, valor4)<6&ej.certificado_calidad_funcional(valor4, valor4, valor4)>-1);
		int fun2 = ej.certificado_calidad_funcional(valor4, valor4, valor4);
		assertTrue(ej.certificado_calidad_funcional(valor5, valor5, valor5)<6&ej.certificado_calidad_funcional(valor5, valor5, valor5)>-1);
		assertTrue(ej.certificado_calidad_funcional(valor6, valor6, valor6)<6&ej.certificado_calidad_funcional(valor6, valor6, valor6)>-1);	
		assertTrue(ej.certificado_calidad_funcional(valor7, valor21, valor21)<6&ej.certificado_calidad_funcional(valor7, valor21, valor21)>-1);
		int fun3 = ej.certificado_calidad_funcional(valor7, valor21, valor21);
		assertTrue(ej.certificado_calidad_funcional(valor8, valor22, valor22)<6&ej.certificado_calidad_funcional(valor8, valor22, valor22)>-1);
		assertTrue(ej.certificado_calidad_funcional(valor9, valor23, valor23)<6&ej.certificado_calidad_funcional(valor9, valor23, valor23)>-1);
		assertTrue(ej.certificado_calidad_funcional(valor10, valor10, valor10)<6&ej.certificado_calidad_funcional(valor10, valor10, valor10)>-1);
		int fun4 = ej.certificado_calidad_funcional(valor10, valor10, valor10);
		assertTrue(ej.certificado_calidad_funcional(valor11, valor11, valor11)<6&ej.certificado_calidad_funcional(valor11, valor11, valor11)>-1);
		assertTrue(ej.certificado_calidad_funcional(valor12, valor12, valor12)<6&ej.certificado_calidad_funcional(valor12, valor12, valor12)>-1);
		assertTrue(ej.certificado_calidad_funcional(valor13, valor13, valor13)<6&ej.certificado_calidad_funcional(valor13, valor13, valor13)>-1);
		int fun5 = ej.certificado_calidad_funcional(valor13, valor13, valor13);
		assertTrue(ej.certificado_calidad_funcional(valor14, valor14, valor14)<6&ej.certificado_calidad_funcional(valor14, valor14, valor14)>-1);
		assertTrue(ej.certificado_calidad_funcional(valor15, valor15, valor15)<6&ej.certificado_calidad_funcional(valor15, valor15, valor15)>-1);
		assertTrue(ej.certificado_calidad_funcional(valor16, valor16, valor16)<6&ej.certificado_calidad_funcional(valor16, valor16, valor16)>-1);
		assertTrue(ej.certificado_calidad_funcional(valor17, valor17, valor17)<6&ej.certificado_calidad_funcional(valor17, valor17, valor17)>-1);
		assertTrue(ej.certificado_calidad_funcional(valor18, valor18, valor18)<6&ej.certificado_calidad_funcional(valor18, valor18, valor18)>-1);
		assertTrue(ej.certificado_calidad_funcional(valor19, valor19, valor19)<6&ej.certificado_calidad_funcional(valor19, valor19, valor19)>-1);
		assertTrue(ej.certificado_calidad_funcional(valor20, valor20, valor20)<6&ej.certificado_calidad_funcional(valor20, valor20, valor20)>-1);
		
		
		assertTrue(ej.certificado_calidad_M(valor1, valor1, valor1, valor1, valor1)<6&ej.certificado_calidad_M(valor1, valor1, valor1, valor1, valor1)>-1);
		int man1 = ej.certificado_calidad_M(valor1, valor1, valor1, valor1, valor1);
		assertTrue(ej.certificado_calidad_M(valor2, valor2, valor2, valor2, valor2)<6&ej.certificado_calidad_M(valor2, valor2, valor2, valor2, valor2)>-1);
		assertTrue(ej.certificado_calidad_M(valor3, valor3, valor3, valor3, valor3)<6&ej.certificado_calidad_M(valor3, valor3, valor3, valor3, valor3)>-1);
		assertTrue(ej.certificado_calidad_M(valor4, valor4, valor4, valor4, valor4)<6&ej.certificado_calidad_M(valor4, valor4, valor4, valor4, valor4)>-1);
		int man2 = ej.certificado_calidad_M(valor4, valor4, valor4, valor4, valor4);
		assertTrue(ej.certificado_calidad_M(valor5, valor5, valor5, valor5, valor5)<6&ej.certificado_calidad_M(valor5, valor5, valor5, valor5, valor5)>-1);
		assertTrue(ej.certificado_calidad_M(valor6, valor6, valor6, valor6, valor6)<6&ej.certificado_calidad_M(valor6, valor6, valor6, valor6, valor6)>-1);
		assertTrue(ej.certificado_calidad_M(valor7, valor7, valor7, valor7, valor21)<6&ej.certificado_calidad_M(valor21, valor7, valor7, valor7, valor21)>-1);
		int man3 = ej.certificado_calidad_M(valor7, valor7, valor7, valor7, valor21);
		assertTrue(ej.certificado_calidad_M(valor8, valor8, valor8, valor8, valor22)<6&ej.certificado_calidad_M(valor22, valor8, valor8, valor8, valor22)>-1);
		assertTrue(ej.certificado_calidad_M(valor9, valor9, valor9, valor9, valor23)<6&ej.certificado_calidad_M(valor23, valor9, valor9, valor9, valor23)>-1);
		assertTrue(ej.certificado_calidad_M(valor10, valor10, valor21, valor21, valor10)<6&ej.certificado_calidad_M(valor10, valor21, valor10, valor21, valor10)>-1);
		int man4 = ej.certificado_calidad_M(valor10, valor10, valor21, valor21, valor10);
		assertTrue(ej.certificado_calidad_M(valor11, valor11, valor22, valor22, valor11)<6&ej.certificado_calidad_M(valor11, valor22, valor11, valor22, valor11)>-1);
		assertTrue(ej.certificado_calidad_M(valor12, valor12, valor23, valor23, valor12)<6&ej.certificado_calidad_M(valor12, valor23, valor12, valor23, valor12)>-1);
		assertTrue(ej.certificado_calidad_M(valor13, valor13, valor10, valor10, valor16)<6&ej.certificado_calidad_M(valor13, valor10, valor13, valor10, valor16)>-1);
		int man5 = ej.certificado_calidad_M(valor13, valor13, valor10, valor10, valor16);
		assertTrue(ej.certificado_calidad_M(valor14, valor14, valor11, valor11, valor17)<6&ej.certificado_calidad_M(valor14, valor11, valor14, valor11, valor17)>-1);
		assertTrue(ej.certificado_calidad_M(valor15, valor15, valor12, valor12, valor18)<6&ej.certificado_calidad_M(valor15, valor12, valor15, valor12, valor18)>-1);
		assertTrue(ej.certificado_calidad_M(valor16, valor16, valor13, valor13, valor19)<6&ej.certificado_calidad_M(valor16, valor13, valor16, valor13, valor19)>-1);
		assertTrue(ej.certificado_calidad_M(valor17, valor17, valor14, valor14, valor20)<6&ej.certificado_calidad_M(valor17, valor14, valor17, valor14, valor20)>-1);
		assertTrue(ej.certificado_calidad_M(valor18, valor18, valor15, valor15, valor3)<6&ej.certificado_calidad_M(valor18, valor15, valor18, valor15, valor3)>-1);
		assertTrue(ej.certificado_calidad_M(valor19, valor19, valor16, valor16, valor3)<6&ej.certificado_calidad_M(valor19, valor16, valor19, valor16, valor3)>-1);
		assertTrue(ej.certificado_calidad_M(valor20, valor20, valor17, valor17, valor3)<6&ej.certificado_calidad_M(valor20, valor17, valor20, valor17, valor3)>-1);
		assertTrue(ej.certificado_calidad_M(valor3, valor3, valor18, valor18, valor3)<6&ej.certificado_calidad_M(valor3, valor18, valor3, valor18, valor3)>-1);
		assertTrue(ej.certificado_calidad_M(valor3, valor3, valor19, valor19, valor3)<6&ej.certificado_calidad_M(valor3, valor19, valor3, valor19, valor3)>-1);
		assertTrue(ej.certificado_calidad_M(valor3, valor3, valor20, valor20, valor3)<6&ej.certificado_calidad_M(valor3, valor20, valor3, valor20, valor3)>-1);

		/*
		 * En el caso de la variable "letra" que es de tipo String, no se ha añadido en el testing
		 * Esta variable no puede usarse en los métodos ya que solo admiten números enteros, para 
		 * cubrir el comportamiento del programa ante estos posibles errores habría que capturar
		 * una excepción para que no se pueda introducir un valor que no sea de tipo "int"
		 */
		
		assertTrue(ej.calidad(fun1, man1)<6&ej.calidad(fun1, man1)>-1);
		assertTrue(ej.calidad(fun2, man2)<6&ej.calidad(fun2, man2)>-1);
		assertTrue(ej.calidad(fun3, man3)<6&ej.calidad(fun3, man3)>-1);
		assertTrue(ej.calidad(fun4, man4)<6&ej.calidad(fun4, man4)>-1);
		assertTrue(ej.calidad(fun5, man5)<6&ej.calidad(fun5, man5)>-1);

	}
	
}
