%.dot: %.java
	javadoc -docletpath UmlGraph.jar -doclet UmlGraph -private $<
	mv graph.dot $@

%.eps: %.dot
	dot -Tps -o$@ $<

all: Diag.eps rankyear.eps
	dot -Tps -o distro.eps distro.dot
	latex declweb.tex
	bibtex declweb
	latex declweb.tex

clean:
	-rm -f *.aux *.blg *.dvi *.log *~ *.bbl
	-rm -f Diag.eps rankyear.eps distro.eps
