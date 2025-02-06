## Ejecución del proyecto
1. Abrir la `consola` en la raiz del proyecto

2. Ejecutar `mvn clean package`

3. Ejecutar el aplicativo `java -jar target/retotecnicoanimal-1.0-SNAPSHOT.jar "perro|terrestre|guau" "pez|acuatico|glup"`

> .[!NOTA].
> Despues del `SNAPSHOT.jar` escriba los datos que desee tiendo encuenta la siguiente estructura `"perro|terrestre|guau" "pez|acuatico|glup"`


## Reto Técnico

Se debe implementar la creación de objetos de animales que tengan la funcionalidad de onomatopeyas por cada tipo o especie; además, deberán tener un método que indique si es un animal terrestre, volador o acuático.

Para proveer la data de entrada se utilizará los argumentos del método main mediante cadenas de texto (el desarrollador puede elegir el formato de entrada. Por ejemplo: nombre|tipo|onomatopeya) y en pantalla deberá imprimir un mensaje amigable agrupando los animales por tipo.

Requerimientos del reto técnico:
- La implementación deberá estar bajo un proyecto Maven
- Se deberá usar Java en cualquiera de sus versiones 8, 11 o 17.
- El candidato deberá responder el correo teniendo en cuenta la información necesaria para lograr la ejecución de lo implementado según considere necesario. Por ejemplo: Formato de entrada de texto utilizado, lineas de comando a utilizar para la ejecución en consola, etc.
- El código deberá ser entregado en un repositorio de git(bitbucket, github, gitlab, etc) , bajo un Pull Request. Solo se deberá responder el presente correo dejando el enlace de referencia al PR.
      Master
      Develop
      Feature/retoTecnico
      -creacion del proyecto
      -implementacion del reto
      -implementacion de los test
      PR hacia develop

Se valorará del reto técnico:
- El uso de Spring Framework (core, beans, context, etc). No Spring Boot.
- Las buenas practicas de desarrollo
- El uso de los 4 pilares de la POO.
- El correcto uso de enums, interfaces, clases abstractas y concretas.
- El uso del API Streams.
- La implementación de TDD usando JUnit.

Duracion del reto 24 H

## Datos del proyecto
- Proyecto: **Maven**
- Lenguaje: **Java**
- Version lenguaje: **17**
- Spring: **3.3.8**