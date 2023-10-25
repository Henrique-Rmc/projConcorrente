
javac ../Java/BakerySimples.java
hyperfine --runs 100 'java ../Java/BakerySimples.java 100', 'java ../Java/BakerySimples.java 200', 'java ../Java/BakerySimples.java 300' --export-json javaBakery.json
python .\plot_histogram.py javaBakery.json -o .\javaBakery.png

javac ../Java/BakeryAtomic.java
hyperfine --runs 100 'java ../Java/BakeryAtomic.java 100','java ../Java/BakeryAtomic.java 200', 'java ../Java/BakeryAtomic.java 300' --export-json javaAtomic.json
python .\plot_histogram.py javaAtomic.json -o .\javaAtomic.png
