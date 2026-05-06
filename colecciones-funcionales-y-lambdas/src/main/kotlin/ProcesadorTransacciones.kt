/**
 * Ejercicio 4: Funciones como Argumentos
 * 
 * Implementa los métodos de esta clase para que pasen todos los tests
 * del archivo Ejercicio4FuncionesComoArgumentosTest.kt
 * 
 * IMPORTANTE: No modifiques la firma de los métodos, solo implementa su lógica.
 */
class ProcesadorTransacciones {
    
    // Parte A: Funciones de Transformación como Parámetros
    
    fun transformarMontos(
        transacciones: List<Ejercicio4FuncionesComoArgumentosTest.Transaccion>,
        transformacion: (Double) -> Double
    ): List<Double> {
        TODO("Implementar: Debe aplicar la función de transformación a cada monto")
    }
    
    fun <T> procesarCon(
        transacciones: List<Ejercicio4FuncionesComoArgumentosTest.Transaccion>,
        procesador: (Ejercicio4FuncionesComoArgumentosTest.Transaccion) -> T
    ): List<T> {
        TODO("Implementar: Debe procesar cada transacción con la función dada")
    }
    
    // Parte B: Funciones de Filtrado como Parámetros
    
    fun filtrarTransacciones(
        transacciones: List<Ejercicio4FuncionesComoArgumentosTest.Transaccion>,
        predicado: (Ejercicio4FuncionesComoArgumentosTest.Transaccion) -> Boolean
    ): List<Ejercicio4FuncionesComoArgumentosTest.Transaccion> {
        TODO("Implementar: Debe filtrar transacciones usando el predicado")
    }
    
    fun filtrarConMultiplesCriterios(
        transacciones: List<Ejercicio4FuncionesComoArgumentosTest.Transaccion>,
        criterios: List<(Ejercicio4FuncionesComoArgumentosTest.Transaccion) -> Boolean>
    ): List<Ejercicio4FuncionesComoArgumentosTest.Transaccion> {
        TODO("Implementar: Debe filtrar transacciones que cumplan TODOS los criterios")
    }
    
    // Parte C: Funciones de Agregación como Parámetros
    
    fun <T> agregar(
        transacciones: List<Ejercicio4FuncionesComoArgumentosTest.Transaccion>,
        valorInicial: T,
        agregador: (T, Ejercicio4FuncionesComoArgumentosTest.Transaccion) -> T
    ): T {
        TODO("Implementar: Debe agregar valores usando la función agregadora")
    }
    
    // Parte D: Composición de Funciones
    
    fun ejecutarPipeline(
        transacciones: List<Ejercicio4FuncionesComoArgumentosTest.Transaccion>,
        filtro1: (Ejercicio4FuncionesComoArgumentosTest.Transaccion) -> Boolean,
        filtro2: (Ejercicio4FuncionesComoArgumentosTest.Transaccion) -> Boolean,
        transformacion: (Ejercicio4FuncionesComoArgumentosTest.Transaccion) -> Double,
        agregacion: (Double, Double) -> Double
    ): Double {
        TODO("""
            Implementar pipeline:
            1) Aplicar filtro1
            2) Aplicar filtro2
            3) Transformar cada transacción a Double
            4) Agregar todos los valores con la función de agregación (inicial: 0.0)
        """)
    }
    
    fun procesarConConfiguracion(
        transacciones: List<Ejercicio4FuncionesComoArgumentosTest.Transaccion>,
        config: Ejercicio4FuncionesComoArgumentosTest.ConfiguracionProcesamiento
    ): List<String> {
        TODO("""
            Implementar:
            1) Filtrar usando config.filtro
            2) Transformar usando config.transformacion
            3) Formatear usando config.formateo
        """)
    }
    
    fun procesarConEventos(
        transacciones: List<Ejercicio4FuncionesComoArgumentosTest.Transaccion>,
        onTransaccionProcesada: (Ejercicio4FuncionesComoArgumentosTest.Transaccion) -> Unit,
        onTransaccionRechazada: (Ejercicio4FuncionesComoArgumentosTest.Transaccion) -> Unit
    ) {
        TODO("""
            Implementar:
            - Para transacciones PROCESADAS: ejecutar onTransaccionProcesada
            - Para transacciones RECHAZADAS: ejecutar onTransaccionRechazada
        """)
    }
}