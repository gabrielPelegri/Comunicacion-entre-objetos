# Comunicacion-entre-objetos

Ejercicios realizado por: 

Victor Navarro Carrillo

Gabriel Pelegri Riis 

David César Moro Nieto 

Repositorio ubicado en: https://github.com/gabrielPelegri/Comunicacion-entre-objetos

# Ejercicio de comunicación entre objetos

## 1. Ejercicio 1
a. Enunciado
Este ejercicio consiste en escribir un programa que cree varias ventanas (de tipo JFrame) identificadas por un número en sus barras de título y que «trace» los eventos «presionar» y «soltar» del ratón en cada una de estas ventanas. Indicaremos cada evento mostrando en la salida por la consola de IntelliJ IDEA un mensaje que precise su naturaleza (presionar o soltar), el número de ventana y las coordenadas del puntero del ratón en el momento del evento.

images/04RI07V2.png
Para esto, implementaremos un listener más especializado que actionListener: utilizaremos mouseListener.

## 2. Ejercicio 2
a. Enunciado
La implementación de la interfaz MouseListener en la clase Ventana ha declarado cinco métodos, de los cuales tres no se utilizan. En este ejercicio esto no es muy grave, pero en un código más largo puede perjudicar su legibilidad.

Hemos visto que, para resolver este problema, el API Java ofrece una clase abstracta MouseAdapter, que contiene las implementaciones por defecto de los métodos de la interfaz MouseListener.

En este ejercicio 2, debe modificar el código del ejercicio 1 para utilizar la clase abstracta MouseAdapter.

Atención: la clase Ventana ya extiende la clase JFrame, y recuerde que es posible extender varias clases a la vez en Java.
