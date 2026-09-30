# Repository guidance

## Project boundaries and exercise rules

- The three top-level exercise directories are independent Maven projects with their own POM and wrapper, not modules of a root reactor. There is no root POM.
- These are deliberately unfinished TDD exercises: `fundamentos-basicos` and `colecciones-funcionales-y-lambdas` contain `TODO()` implementations; `programacion-orientada-a-objetos-en-kotlin` has tests but no production classes yet. Failures are expected; do not solve unrelated exercises just to make the whole repository green.
- Read the target project's README and exercise tests before implementing. Preserve supplied tests and method signatures; follow exercise order and required Kotlin concepts. The OOP README restricts implementations to behavior covered by tests; the fundamentals README forbids internet solutions and limits language features per exercise.
- Fundamentals uses package `edu.etec.ds.fundamentos`. Collections and OOP use the default package; keep their sources separate (both exercises define a different `Producto`). For OOP, create `Estudiante.kt`, `CuentaBancaria.kt`, and `Producto.kt` under that project's `src/main/kotlin/` as requested.

## Toolchain

- Maven runs on the JDK selected by `JAVA_HOME` (21+ required); it does not download a Java toolchain. Check `./mvnw --version` when diagnosing Java issues.
- Each wrapper pins Maven 3.9.16 using the `only-script` distribution: no wrapper JAR is needed. Initial use downloads Maven, so network access and curl/wget (or PowerShell on Windows) are needed.
- Kotlin is 2.0.21 in fundamentals/collections, but 2.2.0 in OOP; preserve the per-project versions.
- `install_intellij_in_mint.sh` is a system installer using `sudo` and replacing `/opt/idea`, not a build prerequisite; do not run it to test the exercises.

## Verification

Run these from the repository root:

```sh
./fundamentos-basicos/mvnw -f fundamentos-basicos/pom.xml test
./colecciones-funcionales-y-lambdas/mvnw -f colecciones-funcionales-y-lambdas/pom.xml test
./programacion-orientada-a-objetos-en-kotlin/mvnw -f programacion-orientada-a-objetos-en-kotlin/pom.xml test
```

For focused verification, append the relevant filter to its command:

- Fundamentals: `-Dtest=edu.etec.ds.fundamentos.Ejercicio1Test`.
- Collections: `'-Dtest=Ejercicio1MapFilterTest*'` (includes JUnit `@Nested` classes); single method: `'-Dtest=Ejercicio1MapFilterTest$MapOperations#obtenerNombresDeProductos'`. Keep quotes to prevent shell expansion.
- OOP: `-Dtest=Ejercicio1Test`. Maven still compiles **all** test sources before filtering, so unresolved classes from other OOP exercises block even a single-exercise run.
- Collections also has a pre-existing test compilation error: `Ejercicio4FuncionesComoArgumentosTest.kt` uses `Locale` without importing `java.util.Locale`. This blocks all test filters; do not treat it as a Maven dependency issue or silently change supplied tests.

Reports are text/XML under each project's `target/surefire-reports/`, not HTML. `compile` checks production sources; `test-compile` also checks all test sources. No separate lint/formatter plugins are configured.

The root `.github/workflows/ci.yml` runs all three projects independently with Java 21; intentional exercise failures are not suppressed, and the matrix keeps running other projects after a failure.
