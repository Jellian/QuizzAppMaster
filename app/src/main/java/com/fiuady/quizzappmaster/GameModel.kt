package com.fiuady.quizzappmaster

import androidx.lifecycle.ViewModel


class GameModel: ViewModel() {

    private val questionArrays= arrayListOf<Question>(
            //Cine
            Question(0, "Pensamos demasiado y sentimos muy poco", 2, "El Gran Dictador", "Vida de Perros", "El gordo y el flaco", "La clase osciosa", "El Gran Dictador", false, false, false, false, false, false, false, false),
            Question(0, "Hakuna Matata", 2, "El Rey León", "Pinocho", "Zootopia", "Cenicienta  ", "El Rey León", false, false, false, false, false, false, false, false),
            Question(0, "Yo soy tu padre", 2, "Star Wars", "Harry Potter", "El señor de los anillos", "Narnia", "Star Wars", false, false, false, false, false, false, false, false),
            Question(0, "Puede que no sea muy listo, pero sé lo que es el amor", 2, "Forest Gump", "En busca de la felicidad", "Milagros inesperados", "Quisiera ser grande", "Forest Gump", false, false, false, false, false, false, false, false),
            Question(0, "Dicen que los mejores brillan con más fuerza en las situaciones más difíciles", 2, "El castillo ambulate", "Mi vecino Totoro", "Recuerdos del ayer", "Mary y la flor de la bruja", "El castillo ambulate", false, false, false, false, false, false, false, false),

            //Música
            Question(0, "Sonata -- Claro de Luna", 4,  "Beethoven", "Bach", "Vivaldi", "Tchaikovsky", "Beethoven", false, false, false, false, false, false, false, false),
            Question(0, "Las cuatro estaciones", 4,  "Vivaldi", "Beethoven", "Tchaikovsky", " Bach", "Vivaldi", false, false, false, false, false, false, false, false),
            Question(0, "Ballet de Rosamunda", 4,  "Schubert", "Sibelius", "Beethoven", "Vivaldi", "Schubert", false, false, false, false, false, false, false, false),
            Question(0, "La flauta mágica – La reina de la noche", 4,  "Mozart", "Paganini", "Sibelius", "Tchaikovsky", "Mozart", false, false, false, false, false, false, false, false),
            Question(0, "El destino toca a la puerta", 4,  "Beethoven", "Brahms",  "Dvořák",  "Grieg", "Beethoven", false, false, false, false, false, false, false, false),

            //Ciencia
            Question(0, "¿Qué tipo de carga tienen los electrones?", 1,"Carga negativa","Carga positiva",  "Carga neutra",  "No tiene cargas", "Carga negativa", false, false, false, false, false, false, false, false),
            Question(0, "¿Qué es el H2O?", 1,"Agua","Sodio","Sal",  "Hidrógeno", "Agua", false, false, false, false, false, false, false, false),
            Question(0, "¿Cuánto es 10 + 90 -50 +30", 1,"80","30","100 ",  "25", "80", false, false, false, false, false, false, false, false),
            Question(0, "¿Cuál es la ciencia que estudia los insectos?", 1,"Entomología","Psicología","Filosofía ",  "Paleontología ", "Entomología", false, false, false, false, false, false, false, false),
            Question(0, "¿Cuál es el nombre científico de los glóbulos rojos?", 1, "eritrocitos","Leucocitos","Megacariocitos",  "Hematocitos ", "Eritrocitos", false, false, false, false, false, false, false, false),


            //Deporte
            Question(0, "¿Cuánto vale un tiro de media cancha en basquetbol?", 3, "3","2","5",  "1 ", "3", false, false, false, false, false, false, false, false),
            Question(0, "¿En que año fueron los últimos fuego olímpicos?", 3, "2000","2016","2018",  "2014 ", "2004", false, false, false, false, false, false, false, false),
            Question(0, "¿Qué deporte no se juega en cesped?", 3, "Futbol Americano","Futbol Soccer","Baloncesto",  "Rugby", "Ninguna de las anteriores", false, false, false, false, false, false, false, false),
            Question(0, "¿A qué distancia está situado el punto de penalti de la portería?", 3, "11 metros","6 metros","20 metros",  "30 metros ", "15 metros", false, false, false, false, false, false, false, false),
            Question(0, "¿Cómo se llama al jugador que lanza la pelota en Beisbol?", 3, "Catcher","Pitcher","Fielder",  "Baseman", "3", false, false, false, false, false, false, false, false),


            //Arte
            Question(0, "¿Quien es el autor de la mona lisa?", 5, "Leonardo Da Vinci","Vicent Van Gogh","Salvador Dalí",  "Miguel Ángel ", "Leonardo Da Vinci", false, false, false, false, false, false, false, false),
            Question(0, "Para Vincent van Gogh también fue muy importante una persona que le brindó apoyo financiero de manera continua y desinteresada, ¿quién fue?", 5, "Su hermano Theo","Sus padres","Su hermano Cornelius",  "Un adinerado de Zundert ", "Su hermano Theo", false, false, false, false, false, false, false, false),
            Question(0, "El Juicio Final o El Juicio Universal es un mural realizado al fresco que se encuentra en la Capilla Sixtina y fue pintado por:", 5, "Miguel Ángel","Pinturicchio","Sandro Botticelli",  "Pietro Perugino ", "Miguel Ángel", false, false, false, false, false, false, false, false),
            Question(0, "¿Quién es el pintor de Las meninas? ", 5, "Diego Velázquez","Giotto","Kandinsky",  "Caravaggio", "Diego Velázquez", false, false, false, false, false, false, false, false),
            Question(0, "Hacer arte nunca ha sido sencillo y esta influyente familia del Renacimiento destacó por ser mecenas de importantes artistas y científicos de su época: ", 5, "Médici","Gozzolli","Pitti",  "Alighieri",  "Médici" , false, false, false, false, false, false, false, false),

            //Videojuegos
            Question(0, "¿Qué videojuego fue primero? ", 6,  "Pong", "Pac-man", "Tetris", "Mario bros", "Pong" , false, false, false, false, false, false, false, false),
            Question(0, "¿Cuál es un videojuego de autos de carrera? ", 6,  "Top gear", "Snake",  "Frogger", "R-type",  "Top gear" , false, false, false, false, false, false, false, false),
            Question(0, "¿Cómo se llama el enemigo de Sonic? ", 6,"Dr. Robotnik", "Robotech",  "Tails", "Dr. Malo",   "Dr. Robotnik" , false, false, false, false, false, false, false, false),
            Question(0, "¿De que material es la primera espada que recibes en The Legend of Zelda", 6,"Madera",  "Hueso",  "Acero",  "Hierro",   "Madera" , false, false, false, false, false, false, false, false),
            Question(0, "¿Cómo se llama la ciudad en la que se desenvuelve Resident Evil", 6,"Raccoon city",  "Metrópolis",  "New York",  "Hierro",   "Resident city" , false, false, false, false, false, false, false, false),

            )


}