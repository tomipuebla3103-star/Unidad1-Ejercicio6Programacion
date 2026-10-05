<img width="841" height="129" alt="image" src="https://github.com/user-attachments/assets/aec55862-2421-48ec-98ef-1f50fd27b2be" />
 Boleto de Aerolínea Low-Cost

 Descripción

El programa utiliza una clase llamada `BoletoVuelo` para guardar los datos de un pasaje aéreo y calcular su precio final.

El precio puede cambiar dependiendo de si el pasajero lleva equipaje extra.

 Objetivo

El objetivo del ejercicio es practicar algunos conceptos de Programación Orientada a Objetos (POO), como:

 Clases y objetos.
 Atributos.
 Constructores.
 Métodos.
 Uso de valores booleanos.
 Cálculos con atributos de un objeto.

Clase BoletoVuelo

La clase `BoletoVuelo` tiene los siguientes atributos:

 `pasajero`: nombre de la persona que viaja.
  `destino`: lugar al que viaja el pasajero.
 `tarifaBase`: precio inicial del boleto.
 `llevaEquipajeExtra`: indica si el pasajero lleva equipaje extra.

 Constructor

El constructor recibe los datos básicos necesarios para crear un boleto.

Estos datos son el pasajero, el destino, la tarifa base y si lleva o no equipaje extra.

 Métodos

 `calcularPrecioFinal()`

Calcula el precio final del boleto.

Si el pasajero lleva equipaje extra, se suma un **20%** a la tarifa base.

Si no lleva equipaje extra, se mantiene el precio original.

 Ejemplo

En el `main` se crean dos boletos diferentes:

 Uno con equipaje extra.
  Uno sin equipaje extra.

Después se calcula el precio final de cada boleto y se muestran los precios por consola para poder compararlos.
