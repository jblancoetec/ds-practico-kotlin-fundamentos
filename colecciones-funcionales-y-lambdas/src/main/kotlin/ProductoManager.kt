/**
 * Ejercicio 1: Map y Filter
 * 
 * Implementa los métodos de esta clase para que pasen todos los tests
 * del archivo Ejercicio1MapFilterTest.kt
 * 
 * IMPORTANTE: No modifiques la firma de los métodos, solo implementa su lógica.
 */
class ProductoManager {
    
    // Parte A: Operaciones con Map
    
    fun obtenerNombres(productos: List<Ejercicio1MapFilterTest.Producto>): List<String> {
        TODO("Implementar: Debe retornar una lista con solo los nombres de los productos")
    }
    
    fun aplicarDescuento(productos: List<Ejercicio1MapFilterTest.Producto>, descuentoPorcentaje: Double): List<Double> {
        TODO("Implementar: Debe retornar una lista con los precios después de aplicar el descuento")
    }
    
    fun generarEtiquetas(productos: List<Ejercicio1MapFilterTest.Producto>): List<String> {
        TODO("Implementar: Debe generar etiquetas en formato 'nombre - $precio (estado)'")
    }
    
    // Parte B: Operaciones con Filter
    
    fun obtenerProductosEnStock(productos: List<Ejercicio1MapFilterTest.Producto>): List<Ejercicio1MapFilterTest.Producto> {
        TODO("Implementar: Debe retornar solo los productos que están en stock")
    }
    
    fun filtrarPorPrecio(
        productos: List<Ejercicio1MapFilterTest.Producto>, 
        precioMin: Double, 
        precioMax: Double
    ): List<Ejercicio1MapFilterTest.Producto> {
        TODO("Implementar: Debe retornar productos cuyo precio esté entre precioMin y precioMax")
    }
    
    fun filtrarPorCategoria(
        productos: List<Ejercicio1MapFilterTest.Producto>, 
        categoria: String
    ): List<Ejercicio1MapFilterTest.Producto> {
        TODO("Implementar: Debe retornar solo los productos de la categoría especificada")
    }
    
    // Parte C: Combinación de Map y Filter
    
    fun obtenerNombresProductosDisponibles(productos: List<Ejercicio1MapFilterTest.Producto>): List<String> {
        TODO("Implementar: Debe filtrar productos en stock y retornar sus nombres")
    }
    
    fun aplicarDescuentoCategoria(
        productos: List<Ejercicio1MapFilterTest.Producto>,
        categoria: String,
        descuentoPorcentaje: Double
    ): List<Double> {
        TODO("Implementar: Debe aplicar descuento solo a productos de la categoría especificada")
    }
    
    fun generarReporteProductosCaros(
        productos: List<Ejercicio1MapFilterTest.Producto>,
        precioMinimo: Double
    ): List<String> {
        TODO("Implementar: Debe generar reporte de productos caros disponibles en formato especial")
    }
}