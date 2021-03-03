# QuizzAppMaster
### UNIVERSIDAD AUTÓNOMA DE YUCATÁN | FACULTAD DE INGENIERÍA | INGENIERÍA EN MECATRÓNICA
Herramientas Avanzadas de Programación | Profesor: M.C. Edson G. Estrada López
### Reporte de Proyecto #1: Quiz App Basic (1.1)
Integrantes del equipo: [Poot Pérez, Addy Elvira](https://github.com/pootpaddy); [Rodríguez Vargas, Hannia Jellian](https://github.com/Jellian); [Villanueva Ojeda, David](https://github.com/D-villanueva).

<p>El proyecto llamado “Quizz App Basic 1.1” es una aplicación de trivia de preguntas basado en los temas vistos en la clase. La finalidad del proyecto es crear una aplicación recreativa que haga un juego de preguntas aleatorias con tres partes. 
La primera es la pantalla, muestra el inicio del juego con la opción de ingresar al juego o escoger opciones del juego. En la pantalla del juego, se responden las preguntas, en la pantalla de opciones, el jugador  tiene la posibilidad de modificar las categorías de las preguntas, la cantidad de preguntas (máximo 10), la dificultad de estas (modificando el número posible de respuestas), colocar pistas para facilitar el juego y modificar la cantidad de pistas (máximo 3). 
La tercera parte es la visualización del resultado del jugador, en donde se observa los puntos obtenidos, las pistas usadas y el número de preguntas que contestaste bien.<p>


#### Objetivos del sistema:

* Permite la elección de categorías de preguntas para jugar.
* Permite la elección de la cantidad de preguntas a responder.
* Permite la oportunidad de elegir el uso de pistas y la cantidad de estas.
* Permite la opción de cambiar la dificultad del juego.
* Permite la elección entre posibles respuestas a una pregunta y compara para saber si lo obtenido es correcto.

#### Especificación de la API:

* Para poder correr la aplicación se requiere el uso de cualquiera de las APIs desde la 30 (Android 11.0).

#### Guía de funcionalidad

<p>La aplicación comienza con la pantalla principal donde se muestra el logo de la aplicación junto con los botones de jugar y opciones. Esta se puede observar en las figuras. únicamente en modo vertical (portrait).<p>

<p>A continuación, se deben modificar las opciones del juego en su respectiva pantalla, para esto hacemos click en el botón de opciones y se abrirá la pantalla que se observa.<p>

<p>En esta ventana se podrán modificar las opciones del juego como son seleccionar las diferentes categorías de las preguntas, la cantidad de preguntas, la dificultad del juego y si se desea o no habilitar las pistas, además de modificar la cantidad de pistas.

Al seleccionar las opciones se oprime el botón de back y las opciones se mantienen guardadas. A continuación, se presiona el botón de jugar para iniciar el juego. <p>

<p>Dependiendo de cómo se conteste la pregunta será el color que tomará el botón seleccionado. Para utilizar pistas se deberá tocar el texto de la pregunta y se verán los cambios en el text de la esquina superior derecha que dice “Pistas 0/3”. Automáticamente este aumentará en uno y descartará una de las opciones de respuesta, como se muestra en la figura, también se podrá saber la posición de que pregunta es la que se tiene. <p>

<p>Si se responde una pregunta utilizando pistas el texto de la pregunta se mostrará de color naranja. 

Es posible responder preguntas utilizando únicamente pistas.

Al finalizar de responder las preguntas se abrirá una ventana de dialogo donde se mostrará la información del juego la foto seleccionada por dificultad, de igual manera el icono que muestra si fue usada o no una pista y también como message dentro, la información del puntaje, pistas usadas y cuantas preguntas acertaste, el diálogo no se cierra aun después de realizar el giro de pantalla, solo al seleccionar el botón ok  y únicamente se muestra una vez.<p>

![](https://lh3.googleusercontent.com/StOOcrk-anLNnaUYHyrHFz19pVSLFTCejh4B6HiTY7XQ-KB7Ht2vvNX0XWkdvem9DhrF4dvw5AUE8irxy9wDIZFr6AeyOkWFhJ7k0k-StclCgUl5BpljhZtho31L32mGwbnglYhbFnM=w2400)


