# P4 - Práctica de Depuración de código en Eclipse

## 1. Descripción de los errores encontrados (qué pasaba y por qué).

El contador = 0. Al estar inicializado en 0 se introuce una nota de alumno más. Por ejemplo si introducimos un 2 Nos pedirá la nota del alumno número 0, 1 y 2.

La variable suma esta declarada sin condición por loque si se introduce un número fuera del rango lo añadirá a la nota media (cuando lo que debería de hacer es saltar un error).

## 2. Cómo los detectaste (qué breakpoint/qué vista/qué valor te lo mostró).

En el caso del contador, me dí cuenta cuando puse el breakpoint en el primer while. 
En el segundo caso cuando estaba haciendo comprobaciones

## 3. Qué cambios hiciste para corregirlos.

En el primer caso contador lo inicializo a 1.

Otro error sería que, si ponemos un número fuera del rango, pasa al siguiente en vez de volverlo a repetir. Por ello usaremos la condición if dentro del bucle, y le pedimos que lo vuelva a introducir un número entre 0 y 10.
