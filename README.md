1 Se hace un clean-build del proyecto, este creará una imagen Docker con el microservicio Build.   

2 Cuando la imagen esté creada, ya se puede hacer el docker-compose up para innicializar el contenedor.    

3 Acceder a http://localhost:5050/swagger-ui.html y comprobar los datos, para introducir en el metodo POST-post y para comprobar que los datos se introducen en el metodo GET-list   

4 Se ha creado annotations para que se valide los parametros de Build, pero no se están comprobando, por otra parte se podría crear una clase para que hiciera esta comprobaciones en los metodos setter. El fallo puede ser por que se tendría que utilizar el plugin swagger-ui de org.webjars
