%.dot: %.java
	javadoc -docletpath /dds/src/Research/umlgraph/build/UmlGraph.jar -doclet UmlGraph -private $<
	mv graph.dot $@

%.eps: %.dot
	dot -Tps -o$@ $<

all: Diag.eps rankyear.eps

clean:
	rm *.eps *.aux *.blg *.dvi *.log *.ps *.eps
