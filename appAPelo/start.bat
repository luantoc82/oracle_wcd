@echo off
cls
echo ***********INICIANDO COMPILACION**************
javac -cp "C:/Program Files/Apache Software Foundation/Tomcat 7.0/lib/servlet-api.jar";"C:/Program Files/Apache Software Foundation/Tomcat 7.0/lib/jsp-api.jar";. -d WebContent/WEB-INF/classes src/com/bean/*.java src/com/pe/*.java src/com/util/*.java src/com/tld/*.java src/com/tag/*.java || goto :error
echo ***********COMPILACION EXITOSA**************
echo ***********GENERANDO WAR**************
cd WebContent
@echo off
jar cvf appApelo.war .
move appApelo.war ../
cd ..
echo ***********WAR GENERADO EXITOSAMENTE : appApelo.war**************
echo ***********DEPLOYANDO APP : appApelo.war**************
rmdir /s /q "C:/Program Files/Apache Software Foundation/Tomcat 7.0/webapps/appApelo"
copy appApelo.war "C:/Program Files/Apache Software Foundation/Tomcat 7.0/webapps/"
echo ***********APP DEPLOYADA EXITOSAMENTE**************
goto :fin
:error
echo Se presentaron errores
:fin
pause