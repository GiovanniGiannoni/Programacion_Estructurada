# 🔁 Proyecto Java – Estructuras de Repetición

Este proyecto tiene como objetivo demostrar el uso práctico de las estructuras de repetición en Java: `for`, `while` y `do-while`. Además, incluye el uso de bucles anidados y validaciones básicas, implementado todo en un entorno de consola con entrada del usuario.

---

## 📚 Tabla de Contenidos

- [Introducción](#💡-Introducción)
- [Objetivos](#🎯-objetivos)
- [Estructuras Implementadas](#🔁-Estructuras-Implementadas)
  - [Bucle for](#🔹-Bucle-for-contador-simple)
  - [Bucle while](#🔹-bucle-while-acumulador-con-condición)
  - [Bucle do-while](#🔹-bucle-do-while-validación-de-entrada)
  - [Bucles anidados](#🔹-bucles-anidados-tablas-de-multiplicar)
- [Validación de entradas](#📐-validación-de-entradas)
- [Ejercicio de repaso](#📦-ejercicio-final-dibujo-con-bucles-anidados)
- [Conclusión y aprendizaje](#✅-conclusión-y-aprendizaje)

---

## 💡 Introducción

Las estructuras de repetición son fundamentales en cualquier lenguaje de programación. Este proyecto demuestra cómo utilizarlas en Java para resolver distintos problemas prácticos, como contar, acumular valores, validar datos y generar figuras por consola.

---

## 🎯 Objetivos

- Aplicar estructuras de control repetitivas en diferentes situaciones.
- Validar datos ingresados por el usuario.
- Utilizar bucles anidados para construir figuras.
- Fortalecer la lógica de programación básica en Java.

---

## 🔁 Estructuras Implementadas

### 🔹 Bucle for: Contador simple

```java
for (int i = 1; i <= 10; i++) {
    System.out.println("Número: " + i);
}
```

Muestra los primeros 10 números enteros, ilustrando el uso de un contador.


### 🔹 Bucle while: Acumulador con condición

```java
System.out.println("Ingrese números (0 para terminar): ");
numero = sc.nextInt();

while (numero != 0) {
    suma += numero;
    numero = sc.nextInt();
}
```

Suma todos los números ingresados por el usuario hasta que se ingresa un 0.

### 🔹 Bucle do-while: Validación de entrada

```java
int edad;
Scanner sc = new Scanner(System.in);

do {
    System.out.print("Ingrese su edad (positiva): ");
    edad = sc.nextInt();
} while (edad <= 0);

System.out.println("Edad ingresada: " + edad);
```

Solicita una edad y asegura que sea un número positivo.

### 🔹 Bucles anidados: Tablas de multiplicar

```java
for (int tabla = 1; tabla <= 3; tabla++) {
    for (int i = 1; i <= 10; i++) {
        System.out.println(tabla + " x " + i + " = " + (tabla * i));
    }
    System.out.println(); // Línea en blanco entre tablas
}
```

Genera las tablas de multiplicar del 1 al 3 usando bucles anidados.

---

## 📐 Validación de Entradas
Se realiza validación para asegurarse de que los valores ingresados (como edad, ancho y alto) sean positivos:
```java
int ancho;
Scanner sc = new Scanner(System.in);

System.out.print("Ingresá el ancho: ");
ancho = sc.nextInt();

while (ancho <= 0) {
    System.out.print("ERROR. Ingresá el ancho: ");
    ancho = sc.nextInt();
}
```

---

## 📦 Ejercicio Final: Dibujo con bucles anidados
Se solicita al usuario el ingreso del ancho y alto, y se imprime un rectángulo utilizando el carácter 'X'.
Ejemplo:
```yaml
Ingresá el ancho: 4  
Ingresá el alto: 3

XXXX  
XXXX  
XXXX  
```
Código utilizado:
```java
int ancho, alto;
Scanner sc = new Scanner(System.in);

System.out.print("Ingresá el ancho: ");
ancho = sc.nextInt();

while (ancho <= 0) {
    System.out.print("ERROR. Ingresá el ancho: ");
    ancho = sc.nextInt();
}

System.out.print("Ingresá el alto: ");
alto = sc.nextInt();

while (alto <= 0) {
    System.out.print("ERROR. Ingresá el alto: ");
    alto = sc.nextInt();
}

for (int f = 1; f <= alto; f++) {
    for (int c = 1; c <= ancho; c++) {
        System.out.print('X');
    }
    System.out.println();
}  
```

---

## ✅ Conclusión y aprendizaje

Este proyecto permitió repasar los conceptos fundamentales de estructuras repetitivas en Java, destacando:

- Diferencias entre for, while y do-while.
- Validación de entrada para evitar errores lógicos.
- Aplicación de bucles anidados para resolver problemas visuales.
- Importancia de una lógica clara y estructurada

