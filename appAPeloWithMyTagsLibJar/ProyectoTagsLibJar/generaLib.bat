@echo off
cls
echo ***********INICIANDO COMPILACION**************
javac -cp "C:/Program Files/Apache Software Foundation/Tomcat 7.0/lib/servlet-api.jar";"C:/Program Files/Apache Software Foundation/Tomcat 7.0/lib/jsp-api.jar";. -d classes src/com/tag/*.java || goto :error
echo ***********COMPILACION EXITOSA**************
echo ***********GENERANDO JAR**************
cd classes
@echo off
jar cvf myTags.jar .  || GOTO :error
move myTags.jar ../
cd ..
echo ***********JAR GENERADO EXITOSAMENTE : myTags.JAR**************
goto :fin
:error
echo Se presentaron errores
:fin
pause