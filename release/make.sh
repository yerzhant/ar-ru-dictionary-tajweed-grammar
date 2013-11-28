#!/bin/bash
rm ArabicDictionary.zip
cp ../dist/ArabicDictionary.jar .
cp ../misc/'Грамматика. Справочник. Часть 1.pdf' 'Grammar. Reference Guide. Part 1.pdf'
cp ../misc/Таджуиид.pdf Tajweed.pdf
zip ArabicDictionary * -x make.sh
rm *.jar *.pdf
