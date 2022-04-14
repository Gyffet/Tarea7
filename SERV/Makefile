JC = javac
JVM= java 

.SUFFIXES: .java .class

.java.class:
	$(JC) -cp ./lib/javax.ws.rs-api-2.0.1.jar:./lib/gson-2.3.1.jar:. -d ./WEB-INF/classes $*.java

CLASSES = ./NEG/Servicio.java

default: classes

classes: $(CLASSES:.java=.class)

deploy: ./WEB-INF/classes/NEG/Service.class
	jar cvf Service.war WEB-INF META-INF

clean:
	$(RM) ./WEB-INF/classes/NEG/*.class && $(RM) Service.war
