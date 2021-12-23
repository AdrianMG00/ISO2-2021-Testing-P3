package BC.Ej_Testing_3;

public class ejercicio3 {
	public ejercicio3() {}
	
	int certificado_calidad_funcional(int rango_completitudF, int rango_correccionF, int rango_pertinenciaF) {
	    //adecuación funcional
	    int completitud = 0;
	    int correccion = 0;
	    int pertinencia = 0;
	    int adecuacion_funcional = 0;
	    
	    if ( rango_completitudF >= 0 & rango_completitudF < 10) {
	        completitud = 0;
	    }
	    if ( rango_completitudF >= 10 & rango_completitudF < 35) {
	        completitud = 1;
	    }
	    if ( rango_completitudF >= 35 & rango_completitudF < 70) {
	        completitud = 2;
	    }
	    if ( rango_completitudF >= 70 & rango_completitudF < 90) {
	        completitud = 3;
	    }
	    if ( rango_completitudF >= 90 & rango_completitudF <= 100) {
	        completitud = 4;
	    }

	    if ( rango_correccionF >= 0 & rango_correccionF < 10) {
	        correccion = 0;
	    }
	    if ( rango_correccionF >= 10 & rango_correccionF < 50) {
	        correccion = 1;
	    }
	    if ( rango_correccionF >= 050& rango_correccionF < 70) {
	        correccion = 2;
	    }
	    if ( rango_correccionF >= 70 & rango_correccionF < 90) {
	        correccion = 3;
	    }
	    if ( rango_correccionF >= 90 & rango_correccionF <= 100) {
	        correccion = 5;
	    }

	    if ( rango_pertinenciaF >= 0 & rango_pertinenciaF < 10) {
	        pertinencia = 0;
	    }
	    if ( rango_pertinenciaF >= 10 & rango_pertinenciaF < 50) {
	        pertinencia = 2;
	    }
	    if ( rango_pertinenciaF >= 050& rango_pertinenciaF < 70) {
	        pertinencia = 3;
	    }
	    if ( rango_pertinenciaF >= 70 & rango_pertinenciaF < 90) {
	        pertinencia = 4;
	    }
	    if ( rango_pertinenciaF >= 90 & rango_pertinenciaF <= 100) {
	        pertinencia = 5;
	    }

	    adecuacion_funcional = completitud;
	    if (correccion < completitud) {
	        adecuacion_funcional = correccion;
	    }
	    if (pertinencia < correccion || pertinencia < completitud) {
	        adecuacion_funcional = pertinencia;
	    }
	    return adecuacion_funcional;

	}
	int certificado_calidad_M(int rango_modularidad, int rango_reusabilidad, int rango_analizabilidad, int rango_modificabilidad, int rango_testable) {
	    int modularidad = 0;
	    int reusabilidad = 0;
	    int analizabilidad = 0;
	    int modificabilidad = 0;
	    int testable = 0;
	    int mantenibilidad = 0;

	    if ( rango_modularidad >= 0 & rango_modularidad < 10) {
	        modularidad = 0;
	    }
	    if ( rango_modularidad >= 10 & rango_modularidad < 35) {
	        modularidad = 1;
	    }
	    if ( rango_modularidad >= 35 & rango_modularidad < 70) {
	        modularidad = 2;
	    }
	    if ( rango_modularidad >= 70 & rango_modularidad < 90) {
	        modularidad = 3;
	    }
	    if ( rango_modularidad >= 90 & rango_modularidad <= 100) {
	        modularidad = 4;
	    }

	    if ( rango_reusabilidad >= 0 & rango_reusabilidad < 10) {
	        reusabilidad = 0;
	    }
	    if ( rango_reusabilidad >= 10 & rango_reusabilidad < 35) {
	        reusabilidad = 1;
	    }
	    if ( rango_reusabilidad >= 35 & rango_reusabilidad < 70) {
	        reusabilidad = 2;
	    }
	    if ( rango_reusabilidad >= 70 & rango_reusabilidad < 90) {
	        reusabilidad = 3;
	    }
	    if ( rango_reusabilidad >= 90 & rango_reusabilidad <= 100) {
	        reusabilidad = 5;
	    }

	    if ( rango_analizabilidad >= 0 & rango_analizabilidad < 35) {
	        analizabilidad = 0;
	    }
	    if ( rango_analizabilidad >= 35 & rango_analizabilidad < 50) {
	        analizabilidad = 1;
	    }
	    if ( rango_analizabilidad >= 50& rango_analizabilidad < 70) {
	        analizabilidad = 2;
	    }
	    if ( rango_analizabilidad >= 70 & rango_analizabilidad < 90) {
	        analizabilidad = 3;
	    }
	    if ( rango_analizabilidad >= 90 & rango_analizabilidad <= 100) {
	        analizabilidad = 5;
	    }

	    if ( rango_modificabilidad >= 0 & rango_modificabilidad < 10) {
	        modificabilidad = 0;
	    }
	    if ( rango_modificabilidad >= 10 & rango_modificabilidad < 35) {
	        modificabilidad = 1;
	    }
	    if ( rango_modificabilidad >= 35 & rango_modificabilidad < 50) {
	        modificabilidad = 2;
	    }
	    if ( rango_modificabilidad >= 50 & rango_modificabilidad < 70) {
	        modificabilidad = 3;
	    }
	    if ( rango_modificabilidad >= 70 & rango_modificabilidad < 90) {
	        modificabilidad = 4;
	    }
	    if ( rango_modificabilidad >= 90 & rango_modificabilidad <= 100) {
	        modificabilidad = 5;
	    }

	    if ( rango_testable >= 0 & rango_testable < 10) {
	        testable = 0;
	    }
	    if ( rango_testable >= 10 & rango_testable < 50) {
	        testable = 1;
	    }
	    if ( rango_testable >= 050& rango_testable < 70) {
	        testable = 2;
	    }
	    if ( rango_testable >= 70 & rango_testable <= 100) {
	        testable = 4;
	    }

	    mantenibilidad = modularidad;
	    if (mantenibilidad < reusabilidad) {
	        mantenibilidad = reusabilidad;
	    }
	    if (mantenibilidad < analizabilidad) {
	        mantenibilidad = analizabilidad;
	    }
	    if (mantenibilidad < modificabilidad) {
	        mantenibilidad = modificabilidad;
	    }
	    if (mantenibilidad < testable) {
	        mantenibilidad = testable;
	    }
	    return mantenibilidad;
	    }

	int calidad (int mantenibilidad, int adecuacion_funcional) {

	    int calidad = 0;
	    if (adecuacion_funcional == 1) {
	        calidad = 1;
	    }
	    if (mantenibilidad == 5) {
	        calidad = adecuacion_funcional;
	    }
	    if (mantenibilidad == 3 || mantenibilidad == 4) {
	        if (adecuacion_funcional == 2) {
	            calidad = 2;
	        }
	        if (adecuacion_funcional == 3) {
	            calidad = 3;
	        }
	        if (adecuacion_funcional == 4) {
	            calidad = 3;
	        }
	        if (adecuacion_funcional == 5) {
	            calidad = 4;
	        }
	    }
	    if (mantenibilidad == 1 || mantenibilidad == 2) {
	        if (adecuacion_funcional > 3) {
	            calidad = 3;
	        }
	        if (adecuacion_funcional == 3) {
	            calidad = 2;
	        }
	        if (adecuacion_funcional == 2) {
	            calidad = mantenibilidad;
	        }
	    }
	    return calidad;
	}
}
