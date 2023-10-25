#Apenas para testes internos, não considerer
javac .\Java\BakerySimples.java
Measure-Command { java .\Java\BakerySimples.java 100| Out-Default }

javac .\Java\BakeryAtomic.java
Measure-Command { java .\Java\BakeryAtomic.java 100| Out-Default }
