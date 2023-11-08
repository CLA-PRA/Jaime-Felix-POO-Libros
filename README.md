# Proyecto - Libros Abstractos

El alumno debe implementar la jerarquía Libro descrita en el diagrama de clases

## Ejecución

Tu programa debería ejecutarse de la siguiente manera:

```
Libros
======

Libro de Ficcion:
Proporcione el titulo del libro:Las mil y una noches
Proporcione el autor del libro:Desconocido
Proporcione el número de paginas del libro:1000
Libro Profesional:
Proporcione el titulo del libro:Java en 21 días
Proporcione el autor del libro:Varios
Proporcione el numero de paginas del libro:800
Proporcione el tipo de pasta del libro (S=Suave, D=Dura):Dura

Libro Ficcion: Titulo: Las mil y una noches, Autor: Desconocido, Paginas: 1000, Precio: $500.00
Libro Profesional: Titulo: Java en 21 dias, Autor: Varios, Paginas: 800, Pasta: D, Precio: $850.00
```

## Diagrama de clases
[Editor en línea](https://mermaid.live/)
```mermaid
---
title: Libros
---
classDiagram
      Libro <|-- LibroFiccion
      Libro <|-- LibroProfesional
      Libro: -titulo
      Libro: -autor
      Libro: -numeroPaginas
      Libro: +precio()*
      class LibroFiccion{
            +precio()
      }
      class LibroProfesional{
            -tipoPasta
            +precio()
      }
```
[Referencia-Mermaid](https://mermaid.js.org/syntax/classDiagram.html)

## Diagrama de clases UML con draw.io
El repositorio está configurado para crear Diagramas de clases UML con ```draw.io```. Para usarlo simplemente agrega un archivo con extensión ```.drawio.png```, das doble clic sobre el mismo y se activará el editor ```draw.io``` incrustado en ```VSCode``` para edición. Asegúrate de agregar las formas UML en el menú de formas del lado izquierdo (opción ```+Más formas```).

## Uso del proyecto con make

### Default - Compilar+Probar+Ejecutar
```
make
```
### Compilar
```
make compile
```
### Probar todo
```
make test
```
### Ejecutar App
```
make run
```
### Limpiar binarios
```
make clean
```
## Comandos Git-Cambios y envío a Autograding

### Por cada cambio importante que haga, actualice su historia usando los comandos:
```
git add .
git commit -m "Descripción del cambio"
```
### Envíe sus actualizaciones a GitHub para Autograding con el comando:
```
git push origin main
```
## Comandos individuales
### Compilar

```
find ./ -type f -name "*.java" > compfiles.txt
javac -d build -cp lib/junit-platform-console-standalone-1.5.2.jar @compfiles.txt
```
Ejecutar ambos comandos en 1 sólo paso:

```
find ./ -type f -name "*.java" > compfiles.txt ; javac -d build -cp lib/junit-platform-console-standalone-1.5.2.jar @compfiles.txt
```


### Ejecutar Todas la pruebas locales de 1 Test Case

```
java -jar lib/junit-platform-console-standalone-1.5.2.jar -class-path build --select-class miTest.AppTest
```
### Ejecutar 1 prueba local de 1 Test Case

```
java -jar lib/junit-platform-console-standalone-1.5.2.jar -class-path build --select-method miTest.AppTest#appHasAGreeting
```
### Ejecutar App
```
java -cp build miPrincipal.Principal
```
Los comandos anteriores están considerados para un ambiente Linux. [Referencia.](https://www.baeldung.com/junit-run-from-command-line)
