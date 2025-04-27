# Calculadora en Java

## Descripción
Este proyecto implementa una calculadora en Java que permite realizar operaciones aritméticas básicas como suma, resta, multiplicación y división, así como operaciones más avanzadas como potencias y raíces cuadradas. La aplicación se ejecuta en la consola y proporciona una interfaz amigable para el usuario.

## Funcionalidades
La calculadora incluye las siguientes operaciones:
- Suma de dos números
- Resta de dos números
- Multiplicación de dos números
- División de dos números
- Potencia de un número elevado a otro
- Raíz cuadrada de un número

## Estructura del Proyecto
El proyecto está organizado en varias clases, cada una con una responsabilidad específica:

- `Main.java`: Punto de entrada de la aplicación, maneja la interfaz de usuario y llama a las clases correspondientes.
- `Suma.java`: Implementa la operación de suma.
- `Resta.java`: Implementa la operación de resta.
- `Multiplicacion.java`: Implementa la operación de multiplicación.
- `Division.java`: Implementa la operación de división.
- `Potencia.java`: Implementa la operación de potencia.
- `RaizCuadrada.java`: Implementa la operación de raíz cuadrada.

## Requisitos del Sistema
- Java 8 o superior
- Compilador de Java (javac)
- Terminal o consola para ejecutar la aplicación

## Instalación y Ejecución
1. Clone o descargue este repositorio.
2. Navegue hasta el directorio del proyecto.
3. Compile los archivos Java:
   ```
   javac *.java
   ```
4. Ejecute la aplicación:
   ```
   java Main
   ```
   O para usar la versión alternativa:
   ```
   java MainAlternativo
   ```

## Uso
1. Al iniciar la aplicación, se mostrará un menú con las operaciones disponibles.
2. Seleccione una operación ingresando el número correspondiente.
3. Siga las instrucciones para ingresar los valores requeridos.
4. El resultado se mostrará en la pantalla.
5. Puede continuar realizando operaciones o salir de la aplicación seleccionando la opción 0.

## Manejo de Excepciones
La aplicación incluye manejo de excepciones para casos como:
- Entrada de datos no válidos (por ejemplo, ingresar letras en lugar de números)
- División por cero
- Cálculo de raíz cuadrada de números negativos

## Ejemplo de Uso
```
===== CALCULADORA =====
Elija una opción:
1 - Sumar
2 - Restar
3 - Multiplicar
4 - Dividir
5 - Potencia
6 - Raíz Cuadrada
0 - Salir
Su opción: 1

Ingrese el valor del número 1: 5
Ingrese el valor del número 2: 3
Resultado: 8.0
```

## Desarrollo y Mejoras
Este proyecto aplica conceptos de programación orientada a objetos como:
- Encapsulación
- Abstracción
- Herencia
- Manejo de excepciones
- Buenas prácticas de codificación


## Autor
Ezequiel Campos

## Licencia
Este proyecto está bajo la Licencia Open Source.