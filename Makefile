.PHONY: all classes

JFLAGS = -g
JC = javac
.SUFFIXES: .java .class

.java.class:
	$(JC) $(JFLAGS) $*.java

CLASSES = $(shell find -name "*.java")

all: classes

classes: $(CLASSES:.java=.class)

clean:
	$(RM) $(shell find -name "*.class")
