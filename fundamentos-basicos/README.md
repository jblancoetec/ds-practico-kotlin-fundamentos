# Fundamentos Básicos

## Objetivo General

Introducir los conceptos fundamentales del lenguaje Kotlin mediante la metodología de Test Driven Development (TDD), donde los estudiantes implementarán funcionalidades guiados por tests que inicialmente fallan.

## Temas Evaluados

- Variables y tipos de datos
- Inferencia de tipos
- Funciones
- Condicionales (if/else)
- Bucles (for, while)
- Sentencia when

## Reglas de Trabajo

### Metodología TDD

Sigue el ciclo **Red → Green → Refactor** en cada ejercicio:

1. **Red**: Escribe un test que falla (el test define qué debe hacer el código)
2. **Green**: Implementa el código mínimo necesario para que el test pase
3. **Refactor**: Mejora el código manteniendo los tests pasando

### Restricciones

- Solo puedes utilizar las funcionalidades de Kotlin especificadas en cada ejercicio
- No uses soluciones de internet durante la resolución
- Cada ejercicio debe completarse antes de pasar al siguiente

## Estructura del Proyecto

```
fundamentos-basicos/
├── src/
│   ├── main/kotlin/          # Código de producción (eskeletos)
│   │   └── edu/etec/ds/
│   │       └── fundamentos/
│   │           └── *.kt
│   └── test/kotlin/          # Tests (deben fallar inicialmente)
│       └── edu/etec/ds/
│           └── fundamentos/
│               └── *Test.kt
├── pom.xml
├── mvnw / mvnw.cmd
└── README.md
```

## Ejercicios

El práctico contiene 6 ejercicios递增:

1. **Variables y Tipos de Datos**: Manipulación de tipos primitivos
2. **Inferencia de Tipos**: Comprensión del sistema de tipos de Kotlin
3. **Funciones**: Definición y uso de funciones
4. **Condicionales**: Lógica de decisión con if/else
5. **Bucles**: Iteraciones y operaciones sobre colecciones
6. **Sentencia when**: Expresiones de control avanzadas

## Instrucciones para Ejecutar los Tests

### Requisitos Previos

- JDK 21 o superior; configura `JAVA_HOME` si tienes varios JDK instalados.
- Maven 3.9.16 se descarga mediante el wrapper; no necesitas instalarlo.
- Ejecuta los comandos desde `fundamentos-basicos/`. En Windows usa `mvnw.cmd` en lugar de `./mvnw`.

### Ejecutar Todos los Tests

```bash
./mvnw test
```

### Ejecutar Tests de un Ejercicio Específico

```bash
./mvnw test -Dtest=edu.etec.ds.fundamentos.Ejercicio1Test
```

### Ver Resultados

```bash
./mvnw test
# Reportes de texto y XML: target/surefire-reports/
```

### Modo Verboso

```bash
./mvnw test -X
```

## Configuración de IDE

Se recomienda **IntelliJ IDEA** para el desarrollo, pero el proyecto es independiente de la IDE.

### Pasos en IntelliJ IDEA

1. File → Open → Seleccionar carpeta `fundamentos-basicos`
2. Esperar a que Maven sincronice el proyecto (`pom.xml`)
3. Ejecutar tests desde la pestaña "Run" o con `Ctrl+Shift+F10`

## GitHub Actions

El repositorio incluye un workflow de CI en `../.github/workflows/ci.yml` que:
- Ejecuta los tests en cada push y pull request
- Verifica que todos los tests pasen
- Usa Java 21 y Maven Wrapper
- Los fallos por ejercicios sin implementar son esperados hasta completar el práctico

## Entrega

1. Completa todos los ejercicios en orden
2. Asegúrate de que todos los tests pasen (`./mvnw test`)
3. Sube el proyecto a un repositorio GitHub
4. Verifica que el pipeline de CI pase exitosamente
