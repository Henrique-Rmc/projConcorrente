# Projeto de Concorrente


Ao rodar Graficos.ps1 (na pasta ./Scripts) Graficos de Tempo Médio de Execução serão criados na pasta ./Output

# Método
Este trabalho constitui um estudo dedicado à análise de desempenho do algoritmo de Bakery, Bakery Atomic, Tas e Ttas em cenários variados. Nossa análise abordará o funcionamento do algoritmo em situações de baixa carga, caracterizadas por um número limitado de threads concorrentes, bem como em situações de alta carga, com um grande número de threads atuando simultaneamente. Além disso, iremos explorar diferentes ambientes de trabalho, incluindo um sistema com CPU de alto desempenho, com 8 núcleos e 16 threads(Ryzen 5700g), e outro com uma CPU que possui 2 núcleos e 4 threads(Intel Pentium Gold 7505), caracterizada por um desempenho inferior.

# Ferramenta
Usamos da ferramenta HyperFine para gerar nossos resultados. Essa ferramenta gera uma quantidade n de testes de um determiado programa e cria uma média que representa o valor mais próximo possível do que seria o tempo de execução.

# Execução:
Ao rodar Graficos.ps1 (na pasta ./Scripts) Graficos de Tempo Médio de Execução serão criados na pasta ./Output
``` Scripts> & .\Grafico.ps1 ```


# Abaixo Os resultados Obtidos 


# Bakery no Ryzen 7 5700g
+Valor médio com 2 threas
"median": 0.39510174400000003
       
+Valor médio com 4 threas
"median": 0.394800594,
       
+Valor médio com 8 threas
"median": 0.39401594400000006,
        
+Valor médio com 16 threas
"median": 0.39439859400000005,
        
+Valor médio com 32 threas
"median": 0.39422354400000004,
         
+Valor médio com 64 threas
"median": 0.39454749400000005,
         
+Valor médio com 128 threas
"median": 0.40845689400000007,
         
+Valor médio com 256 threas
"median": 0.42708264400000007,
         
+Valor médio com 512 threas
"median": 0.42659449400000005,
         
+Valor médio com 1024 threas
"median": 0.44301834400000006,
![javaBakeryR75700](https://github.com/Henrique-Rmc/projConcorrente/assets/49095666/d7da4caa-d750-4fc5-acb7-398dc8b07d7f)

# Bakery no Pentium Gold
+Valor médio com 2 threas
"median": 0.6792471280000001
       
+Valor médio com 4 threas
"median": 0.6787365780000001,
       
+Valor médio com 8 threas
"median": 0.6875500280000001,
        
+Valor médio com 16 threas
"median": 0.6941885780000001,
        
+Valor médio com 32 threas
"median": 0.6953764280000001,
         
+Valor médio com 64 threas
"median": 0.6851513280000001,
         
+Valor médio com 128 threas
"median": 0.703393428,
         
+Valor médio com 256 threas
"median": 0.7333647280000001,
         
+Valor médio com 512 threas
"median": 0.8053519280000001,
         
+Valor médio com 1024 threas
"median": 1.056969578,

![javaBakery](https://github.com/Henrique-Rmc/projConcorrente/assets/49095666/ab3a6929-a8c9-4c2d-ad88-0502eb4e04b8)
