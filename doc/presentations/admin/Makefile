#
# ELTRUN Web site
# document compilation and creation
# 
# $Id$
#

all: docs

docs: presentation.tex user-manual.tex
	latex presentation.tex
	dvips presentation.dvi
	latex user-manual.tex
	dvips user-manual.dvi

clean:
	-rm -f *.dvi
	-rm -f *.log
	-rm -f *.aux
	-rm -f *~
	-rm -f *.ps
