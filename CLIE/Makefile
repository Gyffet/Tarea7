JC = javac
JVM= java 

.SUFFIXES: .java .class

.java.class:
	$(JC) -cp .:* $*.java

CLASSES = Client.java

MAIN = Client

default: classes

classes: $(CLASSES:.java=.class)

run: $(MAIN).class
	$(JVM) -cp .:* $(MAIN)

clean:
	$(RM) *.class
