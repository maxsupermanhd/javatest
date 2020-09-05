.PHONY: all classes

JFLAGS = -g
JC = javac
.SUFFIXES: .java .class

.java.class:
	$(JC) $(JFLAGS) $*.java

CLASSES = \
	student/Student.java \
	circle/Circle.java \
	dog/Dog.java \
	Tester.java

all: classes

classes: $(CLASSES:.java=.class)

clean:
	$(RM) *.class student/*.class circle/*.class dog/*.class
