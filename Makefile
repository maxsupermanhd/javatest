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
	balls/Ball.java \
	shape/Shape.java \
	rectangle/Rectangle.java \
	square/Square.java \
	movablepoint/MovablePoint.java \
	movable/Movable.java \
	movablecircle/MovableCircle.java \
	guidemo/GuiDemo.java \
	Tester.java

all: classes

classes: $(CLASSES:.java=.class)

clean:
	$(RM) *.class student/*.class circle/*.class dog/*.class balls/*.class shape/*.class rectangle/*.class square/*.class movable/*.class movablepoint/*.class guidemo/*.class
