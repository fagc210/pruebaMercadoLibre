# pruebaMercadoLibre
Este proyecto permite validar una cadena de DNA suminsitarda en un Strin[] para identificar si cumple con la condiciones para identificar aun mutante
el string[] representa una matriz de nxn

1. String[] dna = {"ATGCGA","CAGTGC","TTATGT","AGAAGG","CCCCTA","TCACTG"};

condicion a evaluar : Sabrás si un humano es mutante, si encuentras más de una secuencia de cuatro letras
iguales, de forma oblicua, horizontal o vertical.

Procedimiento para desplegar en microservicion local

	configuración:
	el microservicio fue construido con springframework.boot version '2.7.9', gradle y Java 11
	y puede ser desplegado en cualquier id de desarrollo
1.Request:	
	La API expone un metodo *POST* en la ruta *localhost:8080/mutant/* 
	se debe enviar en el body un json que correspende a una clase que contiene un atributo  String[] dna; 
	con lo muestra el siguiente ejemplo
		{
			"dna": ["ATGCGA","CAGTGC","TTATGT","AGAAGG","CCCCTA","TCACTT"]
		}


2.Response
		si validar el request el String[] dna, cumple con la caracteristcas para se un mutante se respondera un codigo Htpps 200 OK
		si validar el request el String[] dna, *NO* cumple con la caracteristcas para se un mutante se respondera un codigo Htpps 403 Forbidden
		
En este repositorio encontarás  una colección de postman con el nombre mercadoLibreCollection que te permitirá realizar peticiones a la ruta de local	

	
