# Projeto de Concorrente


Ao rodar Graficos.ps1 (na pasta ./Scripts) Graficos de Tempo Médio de Execução serão criados na pasta ./Output

# Método
Este trabalho constitui um estudo dedicado à análise de desempenho do algoritmo de Bakery, Bakery Atomic, Tas e Ttas em cenários variados. Nossa análise abordará o funcionamento do algoritmo em situações de baixa carga, caracterizadas por um número limitado de threads concorrentes, bem como em situações de alta carga, com um grande número de threads atuando simultaneamente. Além disso, iremos explorar diferentes ambientes de trabalho, incluindo um sistema com CPU de alto desempenho, com 8 núcleos e 16 threads(Ryzen 5700g), e outro com uma CPU que possui 2 núcleos e 4 threads(Intel Pentium Gold 7505), caracterizada por um desempenho inferior.

# Ferramenta
Usamos da ferramenta HyperFine para gerar nossos resultados. Essa ferramenta gera uma quantidade n de testes de um determiado programa e cria uma média que representa o valor mais próximo possível do que seria o tempo de execução.Foram executados 10 testes para cada medição de thread

# Execução:
Ao rodar Graficos.ps1 (na pasta ./Scripts) Graficos de Tempo Médio de Execução serão criados na pasta ./Output
``` Scripts> & .\Grafico.ps1 ```


# Abaixo Os resultados Obtidos 


## Bakery CPU R5700g
+Valor médio com 2 threas
"median": 0.41191008599999995
       
+Valor médio com 4 threas
"median": 0.41429139600000003,
       
+Valor médio com 8 threas
"median": 0.44345564600000004,
        
+Valor médio com 16 threas
"median": 0.4425404060000001,
        
+Valor médio com 32 threas
"median": 0.43988704600000006,
         
+Valor médio com 64 threas
"median": 0.44564248599999995,
         
+Valor médio com 128 threas
"median": 0.45078622599999996,
         
+Valor médio com 256 threas
"median": 0.45917280600000004,
         
+Valor médio com 512 threas
"median": 0.4770935260000001,
         
+Valor médio com 1024 threas
"median": 0.511285706,
![javaBakeryR75700](https://github.com/Henrique-Rmc/projConcorrente/assets/49095666/d7da4caa-d750-4fc5-acb7-398dc8b07d7f)

## Bakery no Pentium Gold
+Valor médio com 2 threas
"median": 0.685290708
       
+Valor médio com 4 threas
"median": 0.6742107180000001,
       
+Valor médio com 8 threas
"median": 0.7307258080000002,
        
+Valor médio com 16 threas
"median": 0.6940887480000001,
        
+Valor médio com 32 threas
"median": 0.7172503280000001,
         
+Valor médio com 64 threas
"median": 0.685449518,
         
+Valor médio com 128 threas
"median": 0.704858108,
         
+Valor médio com 256 threas
"median": 0.7360442380000001,
         
+Valor médio com 512 threas
"median": 0.8039463580000001,
         
+Valor médio com 1024 threas
"median": 1.094666898,
![javaBakery](https://github.com/Henrique-Rmc/projConcorrente/assets/49095666/ab3a6929-a8c9-4c2d-ad88-0502eb4e04b8)

# Bakery Atomic

## Bakery Atomic CPU R5700

[Link para os resultados Bakery Atomic Ryzen7](Scripts/output/Ryzen5700g/javaAtomic.json)

+Valor médio com 2 threas
"median": 0.48373093800000005
       
+Valor médio com 4 threas
"median": 0.485709428,
       
+Valor médio com 8 threas
"median": 0.47013198800000006,
        
+Valor médio com 16 threas
"median": 0.4838493980000001,
        
+Valor médio com 32 threas
"median": 0.47785997800000013,
         
+Valor médio com 64 threas
"median": 0.485640368,
         
+Valor médio com 128 threas
"median": 0.495643598,
         
+Valor médio com 256 threas
"median": 0.534276188,
         
+Valor médio com 512 threas
"median": 0.703485898,
         
+Valor médio com 1024 threas
"median": 0.641596708,

![javaAtomicR75700](https://github.com/Henrique-Rmc/projConcorrente/assets/49095666/be4e20a2-01b8-4b16-a74f-2ff6694d8836)

## Bakery Atomic CPU Pentium Gold
[Link para os resultados Bakery Atomic Pentium Gold](Scripts/output/PentiumGold7505/javaAtomic.json)
+Valor médio com 2 threas
"median": 0.74649817
       
+Valor médio com 4 threas
"median": 0.72585306,
       
+Valor médio com 8 threas
"median": 0.77029321,
        
+Valor médio com 16 threas
"median": 0.7343206600000001,
        
+Valor médio com 32 threas
"median": 0.73822755,
         
+Valor médio com 64 threas
"median": 0.74092618,
         
+Valor médio com 128 threas
"median": 0.76870202,
         
+Valor médio com 256 threas
"median": 0.78392192,
         
+Valor médio com 512 threas
"median": 0.91540166,
         
+Valor médio com 1024 threas
"median": 1.3920784

![javaAtomic](https://github.com/Henrique-Rmc/projConcorrente/assets/49095666/72d9b723-b375-44f7-b178-3d2336e23798)

# TAS

## TAS CPU 5700
[Link para os resultados TAS Pentium Gold](Scripts/output/Ryzen5700g/javaTas.json)

+Valor médio com 2 threas
"median": 0.462935508
       
+Valor médio com 4 threas
"median": 0.46036222800000004,
       
+Valor médio com 8 threas
"median": 0.46394451800000003,
        
+Valor médio com 16 threas
"median": 0.46909539800000005,
        
+Valor médio com 32 threas
"median": 0.462625758,
         
+Valor médio com 64 threas
"median": 0.4725640080000001,
         
+Valor médio com 128 threas
"median": 0.47705693800000004,
         
+Valor médio com 256 threas
"median": 0.47843450800000015,
         
+Valor médio com 512 threas
"median": 0.496989988,
         
+Valor médio com 1024 threas
"median": 0.516050788,

![javaTasR75700](https://github.com/Henrique-Rmc/projConcorrente/assets/49095666/ffec94bb-d65d-4720-8622-bd30bca16c00)

## TAS CPU Pentium Gold
[Link para os resultados TAS Pentium Gold](Scripts/output/PentiumGold7505/javaTas.json)

+Valor médio com 2 threas
"median": 0.748394058
       
+Valor médio com 4 threas
"median": 0.751846138,
       
+Valor médio com 8 threas
"median": 0.741835048,
        
+Valor médio com 16 threas
"median": 0.7650573279999999,
        
+Valor médio com 32 threas
"median": 0.760406068,
         
+Valor médio com 64 threas
"median": 0.751348558,
         
+Valor médio com 128 threas
"median": 0.759087978,
         
+Valor médio com 256 threas
"median": 0.784316838,
         
+Valor médio com 512 threas
"median": 0.8123538380000002,
         
+Valor médio com 1024 threas
"median": 0.8798207080000001,

![javaTas](https://github.com/Henrique-Rmc/projConcorrente/assets/49095666/099fa78b-5b94-40a1-a1b1-d8d5cbf8d451)

#TTAS
## TTAS CPU 5700
[Link para os resultados TTAS Pentium Gold](Scripts/output/Ryzen5700g/javaTtas.json)

+Valor médio com 2 threas
"median": 0.471298206
       
+Valor médio com 4 threas
"median": 0.465346786,
       
+Valor médio com 8 threas
"median": 0.469704476,
        
+Valor médio com 16 threas
"median": 0.46978444599999997,
        
+Valor médio com 32 threas
"median": 0.471691116,
         
+Valor médio com 64 threas
"median": 0.4699303960000001,
         
+Valor médio com 128 threas
"median": 0.48042494599999996,
         
+Valor médio com 256 threas
"median": 0.477909336,
         
+Valor médio com 512 threas
"median": 0.5049338860000001,
         
+Valor médio com 1024 threas
"median": 0.5200199560000001,

![javaTtasR75700](https://github.com/Henrique-Rmc/projConcorrente/assets/49095666/33955d81-d4dc-4626-8550-055f34e56d2f)

## TTAS CPU Pentium Gold
[Link para os resultados TTAS Pentium Gold](Scripts/output/PentiumGold7505/javaTas.json)

+Valor médio com 2 threas
"median": 0.73991579
       
+Valor médio com 4 threas
"median": 0.74719522,
       
+Valor médio com 8 threas
"median": 0.75732338,
        
+Valor médio com 16 threas
"median": 0.7517309000000001,
        
+Valor médio com 32 threas
"median": 0.7477605200000002,
         
+Valor médio com 64 threas
"median": 0.75568578,
         
+Valor médio com 128 threas
"median": 0.7715813500000002,
         
+Valor médio com 256 threas
"median": 0.8011336400000001,
         
+Valor médio com 512 threas
"median": 0.7963043200000002,
         
+Valor médio com 1024 threas
"median": 0.9040042900000002,

![javaTtas](https://github.com/Henrique-Rmc/projConcorrente/assets/49095666/ffc94fcf-a367-4aaf-9a63-9575139e05c3)
