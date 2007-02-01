#
# ELTRUN Web site
# document compilation and creation
# 
# $Id$
#

all: docs

docs: presentation.tex user-manual.tex
	pdflatex presentation.tex
	pdflatex user-manual.tex

clean:
	-rm -f *.dvi
	-rm -f *.log
	-rm -f *.aux
	-rm -f *~
	-rm -f *.ps
