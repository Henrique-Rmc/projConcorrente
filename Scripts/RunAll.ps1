Measure-Command { python .\Python\BakeryLock.py | Out-Default }

javac .\Java\BakerySimples.java
Measure-Command { java .\Java\BakerySimples.java | Out-Default }

javac .\Java\BakeryAtomic.java
Measure-Command { java .\Java\BakeryAtomic.java | Out-Default }
