#### Tenemos una entidad llamada "Fruta", que dispone de las siguientes propiedades:

int id  
String nombre  
Int cantidadQuilos  

Aprovechando la especificación  JPA , deberás persistir esta entidad en una base de datos  H2 , siguiendo el patrón  MVC . Para ello, dependiendo del Package principal, crearás una estructura de packages, donde ubicarás las clases que necesites:  

cat.itacademy.s04.t02.n01.controllers  
cat.itacademy.s04.t02.n01.model  
cat.itacademy.s04.t02.n01.services  
cat.itacademy.s04.t02.n01.repository  
cat.itacademy.s04.t02.n01.exception  

La clase ubicada en el paquete controllers (FruitaController, por ejemplo), deberá ser capaz de dar respuesta a las siguientes peticiones para actualizar y consultar información:  

http://localhost:8080/fruta/add  

http://localhost:8080/fruta/update  

http://localhost:8080/fruta/delete/{id}  

http://localhost:8080/fruta/getOne/{id}  

http://localhost:8080/fruta/getAll  

#### Importante:

Deberás tener en cuenta las buenas prácticas de diseño de las API, utilizando correctamente los códigos de error y las respuestas en caso de invocaciones incorrectas. (Puedes consultar información sobre ResponseEntity). Además, es necesario implementar un GlobalExceptionHandler para gestionar las excepciones globalmente en la aplicación. Esto permitirá capturar y tratar errores de forma centralizada, mejorando la robustez y la coherencia en la gestión de las excepciones.