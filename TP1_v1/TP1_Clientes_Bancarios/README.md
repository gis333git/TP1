# Trabajo Práctico 1 - Clientes Bancarios

Proyecto Maven/Java basado en la consigna del Trabajo Práctico 1.

## Estructura

- `Cliente`: clase base con atributos comunes.
- `ClientePersonaFisica`: hereda de `Cliente`.
- `ClienteEmpresa`: hereda de `Cliente`.
- `ClientePremium`: hereda de `Cliente`.
- `ClienteMoroso`: hereda de `Cliente`. 
- `Main`: crea una instancia de cada tipo e imprime sus datos.
- `ClienteTest`: prueba básica de la clase base.

## Requisitos

- JDK 17 o superior.
- IntelliJ IDEA con soporte Maven.

## Importar en IntelliJ

1. Descomprimir el ZIP.
2. IntelliJ IDEA -> File -> Open.
3. Seleccionar la carpeta del proyecto.
4. Verificar que IntelliJ detecte el `pom.xml` como proyecto Maven.
5. Esperar la sincronización de Maven.

## Ejecutar

Desde IntelliJ:
- Abrir `src/main/java/.../Main.java`.
- Ejecutar `Main`.

Desde la terminal:

```powershell
mvn clean compile
mvn exec:java
```

O, si el proyecto incluye Maven Wrapper:

```powershell
.\mvnw.cmd clean compile
.\mvnw.cmd exec:java
```

## Nota

El proyecto utiliza Java 21 y el paquete `practica.clase04`.
