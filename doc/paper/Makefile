%.dot: %.java
	javadoc -docletpath UmlGraph.jar -doclet UmlGraph -private $<
	mv graph.dot $@

%.eps: %.dot
	dot -Tps -o$@ $<

all: Diag.eps rankyear.eps
	latex declweb.tex

clean:
	-rm *.eps *.aux *.blg *.dvi *.log *.ps *.eps *~