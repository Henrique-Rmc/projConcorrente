#Scripts para rodar testes (rodar na pasta /Scripts)
#Java Bakery 100 a 500 threads
#Tempo Mínimo 10 Minutos

$MyVariable = "2,4,8,16,32,64,128,256,512,1024"

javac ../Java/BakerySimples.java
hyperfine --runs 10 -L n_threads $MyVariable 'java ../Java/BakerySimples.java {n_threads}' --export-json ./output/javaBakery.json
python .\plot_custom.py ./output/javaBakery.json -o ./output/javaBakery.png 

#Java Bakery with Atomic 100 a 500 threads
javac ../Java/BakeryAtomic.java
hyperfine --runs 10 -L n_threads $MyVariable 'java ../Java/BakeryAtomic.java {n_threads}' --export-json ./output/javaAtomic.json
python .\plot_custom.py ./output/javaAtomic.json -o ./output/javaAtomic.png 

#Java Tas Lock
javac ../Java/Tas.java
hyperfine --runs 10 -L n_threads $MyVariable 'java ../Java/Tas.java {n_threads}' --export-json ./output/javaTas.json
python .\plot_custom.py ./output/javaTas.json -o ./output/javaTas.png 

#Java Ttas Lock
javac ../Java/Ttas.java
hyperfine --runs 10 -L n_threads $MyVariable 'java ../Java/Ttas.java {n_threads}' --export-json ./output/javaTtas.json
python .\plot_custom.py ./output/javaTtas.json -o ./output/javaTtas.png 
