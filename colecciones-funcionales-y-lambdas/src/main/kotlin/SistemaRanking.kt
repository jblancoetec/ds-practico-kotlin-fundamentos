/**
 * Ejercicio 3: SortBy y Lambdas
 * 
 * Implementa los métodos de esta clase para que pasen todos los tests
 * del archivo Ejercicio3SortByLambdaTest.kt
 * 
 * IMPORTANTE: No modifiques la firma de los métodos, solo implementa su lógica.
 */
class SistemaRanking {
    
    // Parte A: Ordenamiento Simple con sortBy
    
    fun ordenarPorSalario(empleados: List<Ejercicio3SortByLambdaTest.Empleado>): List<Ejercicio3SortByLambdaTest.Empleado> {
        TODO("Implementar: Debe ordenar empleados por salario de menor a mayor")
    }
    
    fun ordenarPorExperienciaDesc(empleados: List<Ejercicio3SortByLambdaTest.Empleado>): List<Ejercicio3SortByLambdaTest.Empleado> {
        TODO("Implementar: Debe ordenar por años de experiencia de mayor a menor")
    }
    
    fun ordenarPorNombre(empleados: List<Ejercicio3SortByLambdaTest.Empleado>): List<Ejercicio3SortByLambdaTest.Empleado> {
        TODO("Implementar: Debe ordenar alfabéticamente por nombre")
    }
    
    // Parte B: Lambdas Complejas
    
    fun ordenarPorEficiencia(empleados: List<Ejercicio3SortByLambdaTest.Empleado>): List<Ejercicio3SortByLambdaTest.Empleado> {
        TODO("Implementar: Debe ordenar por eficiencia (proyectosCompletados / añosExperiencia) descendente")
    }
    
    fun ordenarPorPuntuacionCompuesta(empleados: List<Ejercicio3SortByLambdaTest.Empleado>): List<Ejercicio3SortByLambdaTest.Empleado> {
        TODO("Implementar: Debe ordenar por puntuación = (evaluacionDesempeño * 2) + (proyectosCompletados * 0.1) descendente")
    }
    
    fun ordenarITPrimero(empleados: List<Ejercicio3SortByLambdaTest.Empleado>): List<Ejercicio3SortByLambdaTest.Empleado> {
        TODO("Implementar: Debe ordenar con empleados de IT primero, luego por salario ascendente")
    }
    
    // Parte C: Ordenamiento Múltiple
    
    fun ordenarPorDepartamentoYSalario(empleados: List<Ejercicio3SortByLambdaTest.Empleado>): List<Ejercicio3SortByLambdaTest.Empleado> {
        TODO("""
            Implementar: Debe ordenar por:
            1) Departamento alfabéticamente
            2) Dentro del mismo departamento, por salario descendente
            3) Si mismo departamento y salario, por experiencia ascendente
        """)
    }
    
    fun ordenarSegunSeniority(empleados: List<Ejercicio3SortByLambdaTest.Empleado>): List<Ejercicio3SortByLambdaTest.Empleado> {
        TODO("""
            Implementar: 
            - Juniors (experiencia < 5): ordenar por evaluación descendente
            - Seniors (experiencia >= 5): ordenar por proyectos completados descendente
            - Mantener juniors antes que seniors en la lista final
        """)
    }
    
    // Parte D: Lambdas como Parámetros de Configuración
    
    fun <T : Comparable<T>> ordenarConEstrategia(
        empleados: List<Ejercicio3SortByLambdaTest.Empleado>,
        estrategia: (Ejercicio3SortByLambdaTest.Empleado) -> T
    ): List<Ejercicio3SortByLambdaTest.Empleado> {
        TODO("Implementar: Debe ordenar usando la estrategia proporcionada descendentemente")
    }
    
    fun obtenerTopEmpleados(
        empleados: List<Ejercicio3SortByLambdaTest.Empleado>,
        filtro: (Ejercicio3SortByLambdaTest.Empleado) -> Boolean,
        ordenamiento: (Ejercicio3SortByLambdaTest.Empleado) -> Double,
        limite: Int
    ): List<Ejercicio3SortByLambdaTest.Empleado> {
        TODO("""
            Implementar: 
            1) Filtrar empleados según el predicado
            2) Ordenar por el criterio dado (descendente)
            3) Tomar solo los primeros 'limite' empleados
        """)
    }
}