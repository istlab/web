%.dot: %.java
	javadoc -docletpath UmlGraph.jar -doclet UmlGraph -private $<
	mv graph.dot $@

%.eps: %.dot
	dot -Tps -o$@ $<

all: Diag.eps rankyear.eps
	dot -Tps -o distro.eps distro.dot
	dot -Tps -o dep-graph.eps dep-graph.dot
	latex declweb.tex
	bibtex declweb
	latex declweb.tex
	latex declweb.tex

show: all
	dvips declweb.dvi
	gv declweb.ps

clean:
	-rm -f *.aux
	-rm -f *.blg
	-rm -f *.dvi
	-rm -f *.log
	-rm -f *~
	-rm -f *.bbl
	-rm -f Diag.eps rankyear.eps distro.eps dep-graph.eps
