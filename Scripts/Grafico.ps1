#Scripts para rodar testes (rodar na pasta /Scripts)
#Java Bakery 100 a 500 threads
#Tempo Mínimo 10 Minutos
javac ../Java/BakerySimples.java
hyperfine --runs 100 'java ../Java/BakerySimples.java 100' --export-markdown ./output/javaBakery100.md --export-json ./output/javaBakery100.json 
python .\plot_histogram.py ./output/javaBakery100.json -o .\javaBakery100.png

hyperfine --runs 100 'java ../Java/BakerySimples.java 200' --export-markdown ./output/javaBakery200.md --export-json ./output/javaBakery200.json 
python .\plot_histogram.py ./output/javaBakery200.json -o .\javaBakery200.png

hyperfine --runs 100 'java ../Java/BakerySimples.java 300' --export-markdown ./output/javaBakery300.md --export-json ./output/javaBakery300.json 
python .\plot_histogram.py ./output/javaBakery300.json -o .\javaBakery300.png

hyperfine --runs 100 'java ../Java/BakerySimples.java 400' --export-markdown ./output/javaBakery400.md --export-json ./output/javaBakery400.json 
python .\plot_histogram.py ./output/javaBakery400.json -o .\javaBakery400.png

hyperfine --runs 100 'java ../Java/BakerySimples.java 500' --export-markdown ./output/javaBakery500.md --export-json ./output/javaBakery500.json 
python .\plot_histogram.py ./output/javaBakery500.json -o .\javaBakery500.png

#Java Bakery with Atomic 100 a 500 threads
javac ../Java/BakeryAtomic.java
hyperfine --runs 100 'java ../Java/BakeryAtomic.java 100' --export-markdown ./output/javaAtomic100.md --export-json ./output/javaAtomic100.json 
python .\plot_histogram.py ./output/javaAtomic100.json -o ./output/javaAtomic100.png

hyperfine --runs 100 'java ../Java/BakeryAtomic.java 200' --export-markdown ./output/javaAtomic200.md --export-json ./output/javaAtomic200.json 
python .\plot_histogram.py ./output/javaAtomic200.json -o ./output/javaAtomic200.png

hyperfine --runs 100 'java ../Java/BakeryAtomic.java 300' --export-markdown ./output/javaAtomic300.md --export-json ./output/javaAtomic300.json 
python .\plot_histogram.py ./output/javaAtomic300.json -o ./output/javaAtomic300.png

hyperfine --runs 100 'java ../Java/BakeryAtomic.java 400' --export-markdown ./output/javaAtomic400.md --export-json ./output/javaAtomic400.json 
python .\plot_histogram.py ./output/javaAtomic400.json -o ./output/javaAtomic400.png

hyperfine --runs 100 'java ../Java/BakeryAtomic.java 500' --export-markdown ./output/javaAtomic500.md --export-json ./output/javaAtomic500.json 
python .\plot_histogram.py ./output/javaAtomic500.json -o ./output/javaAtomic500.png