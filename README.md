# Convertir vers PascalCaseSolution

Ecrire une méthode qui convertit une chaine en PascalCaseSolution : pratique qui consiste à écrire un ensemble de mots en les liant sans espace ni ponctuation, et en mettant en capitale la première lettre de chaque mot.

Résoudre l'exercice en utilisant uniquement les Stream, pas de boucles autorisées !

Exemples :

* "a" > "A"
* "a b" > "AB"
* "suite de mots" > "SuiteDeMots"
* "tExTE mAl fICHu" > "TexteMalFichu"

Rappel des commande junit :

    javac -cp .:junit-4.12.jar PascalCaseTest.java
    java -cp .:junit-4.12.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore PascalCaseTest

