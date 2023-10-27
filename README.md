# Projeto de Concorrente
Alunos: 

Guilherme de Senna Fernandes 

Paulo Henrique Ribeiro Medeiros Cruz


# Método
Este trabalho constitui um estudo dedicado à análise de desempenho do algoritmo de Bakery, Bakery Atomic, Tas e Ttas em cenários variados na linguagem JAVA. Nossa análise abordará o funcionamento do algoritmo em situações de baixa carga, caracterizadas por um número limitado de threads concorrentes, bem como em situações de alta carga, com um grande número de threads atuando simultaneamente. Além disso, iremos explorar diferentes ambientes de trabalho, incluindo um sistema com CPU de alto desempenho, com 8 núcleos e 16 threads(Ryzen 5700g), e outro com uma CPU que possui 2 núcleos e 4 threads(Intel Pentium Gold 7505), caracterizada por um desempenho inferior.

# Ferramenta
Usamos da ferramenta HyperFine para calcular nossos resultados. Essa ferramenta roda uma quantidade n de testes de um determiado programa e cria uma média que representa o valor mais próximo possível do que seria o tempo de execução.Foram executados 10 testes para cada medição de thread.

# Execução:
Foram Criados Scripts para automatizar a geração dos testes. Eles podem ser rodados pelo comando abaixo.
Ao rodar Graficos.ps1 (na pasta ./Scripts) Graficos de Tempo Médio de Execução serão criados na pasta ./Output
``` Scripts> & .\Grafico.ps1 ```


# Abaixo Os resultados Obtidos 


## Bakery CPU R5700g

[Link para os resultados Bakery Ryzen7](Scripts/output/Ryzen5700g/javaBakery.json)

+Valor médio com 2 threas
: 0.41191008599999995
       
+Valor médio com 4 threas
: 0.41429139600000003,
       
+Valor médio com 8 threas
: 0.44345564600000004,
        
+Valor médio com 16 threas
: 0.4425404060000001,
        
+Valor médio com 32 threas
: 0.43988704600000006,
         
+Valor médio com 64 threas
: 0.44564248599999995,
         
+Valor médio com 128 threas
: 0.45078622599999996,
         
+Valor médio com 256 threas
: 0.45917280600000004,
         
+Valor médio com 512 threas
: 0.4770935260000001,
         
+Valor médio com 1024 threas
: 0.511285706

![javaBakeryR75700](https://github.com/Henrique-Rmc/projConcorrente/assets/49095666/d7da4caa-d750-4fc5-acb7-398dc8b07d7f)

## Bakery no Pentium Gold

[Link para os resultados Bakery Pentium Gold](Scripts/output/PentiumGold7505/javaBakery.jsonn)

+Valor médio com 2 threas
: 0.685290708
       
+Valor médio com 4 threas
: 0.6742107180000001,
       
+Valor médio com 8 threas
: 0.7307258080000002,
        
+Valor médio com 16 threas
: 0.6940887480000001,
        
+Valor médio com 32 threas
: 0.7172503280000001,
         
+Valor médio com 64 threas
: 0.685449518,
         
+Valor médio com 128 threas
: 0.704858108,
         
+Valor médio com 256 threas
: 0.7360442380000001,
         
+Valor médio com 512 threas
: 0.8039463580000001,
         
+Valor médio com 1024 threas
: 1.094666898

![javaBakery](https://github.com/Henrique-Rmc/projConcorrente/assets/49095666/ab3a6929-a8c9-4c2d-ad88-0502eb4e04b8)

# Bakery Atomic

## Bakery Atomic CPU R5700

[Link para os resultados Bakery Atomic Ryzen7](Scripts/output/Ryzen5700g/javaAtomic.json)

+Valor médio com 2 threas
: 0.48373093800000005
       
+Valor médio com 4 threas
: 0.485709428,
       
+Valor médio com 8 threas
: 0.47013198800000006,
        
+Valor médio com 16 threas
: 0.4838493980000001,
        
+Valor médio com 32 threas
: 0.47785997800000013,
         
+Valor médio com 64 threas
: 0.485640368,
         
+Valor médio com 128 threas
: 0.495643598,
         
+Valor médio com 256 threas
: 0.534276188,
         
+Valor médio com 512 threas
: 0.703485898,
         
+Valor médio com 1024 threas
: 0.641596708,

![javaAtomicR75700](https://github.com/Henrique-Rmc/projConcorrente/assets/49095666/be4e20a2-01b8-4b16-a74f-2ff6694d8836)

## Bakery Atomic CPU Pentium Gold

[Link para os resultados Bakery Atomic Pentium Gold](Scripts/output/PentiumGold7505/javaAtomic.json)

+Valor médio com 2 threas
: 0.74649817
       
+Valor médio com 4 threas
: 0.72585306,
       
+Valor médio com 8 threas
: 0.77029321,
        
+Valor médio com 16 threas
: 0.7343206600000001,
        
+Valor médio com 32 threas
: 0.73822755,
         
+Valor médio com 64 threas
: 0.74092618,
         
+Valor médio com 128 threas
: 0.76870202,
         
+Valor médio com 256 threas
: 0.78392192,
         
+Valor médio com 512 threas
: 0.91540166,
         
+Valor médio com 1024 threas
: 1.3920784

![javaAtomic](https://github.com/Henrique-Rmc/projConcorrente/assets/49095666/72d9b723-b375-44f7-b178-3d2336e23798)

# TAS

## TAS CPU 5700

[Link para os resultados TAS Pentium Gold](Scripts/output/Ryzen5700g/javaTas.json)

+Valor médio com 2 threas
: 0.462935508
       
+Valor médio com 4 threas
: 0.46036222800000004,
       
+Valor médio com 8 threas
: 0.46394451800000003,
        
+Valor médio com 16 threas
: 0.46909539800000005,
        
+Valor médio com 32 threas
: 0.462625758,
         
+Valor médio com 64 threas
: 0.4725640080000001,
         
+Valor médio com 128 threas
: 0.47705693800000004,
         
+Valor médio com 256 threas
: 0.47843450800000015,
         
+Valor médio com 512 threas
: 0.496989988,
         
+Valor médio com 1024 threas
: 0.516050788,

![javaTasR75700](https://github.com/Henrique-Rmc/projConcorrente/assets/49095666/ffec94bb-d65d-4720-8622-bd30bca16c00)

## TAS CPU Pentium Gold

[Link para os resultados TAS Pentium Gold](Scripts/output/PentiumGold7505/javaTas.json)

+Valor médio com 2 threas
: 0.748394058
       
+Valor médio com 4 threas
: 0.751846138,
       
+Valor médio com 8 threas
: 0.741835048,
        
+Valor médio com 16 threas
: 0.7650573279999999,
        
+Valor médio com 32 threas
: 0.760406068,
         
+Valor médio com 64 threas
: 0.751348558,
         
+Valor médio com 128 threas
: 0.759087978,
         
+Valor médio com 256 threas
: 0.784316838,
         
+Valor médio com 512 threas
: 0.8123538380000002,
         
+Valor médio com 1024 threas
: 0.8798207080000001,

![javaTas](https://github.com/Henrique-Rmc/projConcorrente/assets/49095666/099fa78b-5b94-40a1-a1b1-d8d5cbf8d451)

#TTAS
## TTAS CPU 5700

[Link para os resultados TTAS Pentium Gold](Scripts/output/Ryzen5700g/javaTtas.json)

+Valor médio com 2 threas
: 0.471298206
       
+Valor médio com 4 threas
: 0.465346786,
       
+Valor médio com 8 threas
: 0.469704476,
        
+Valor médio com 16 threas
: 0.46978444599999997,
        
+Valor médio com 32 threas
: 0.471691116,
         
+Valor médio com 64 threas
: 0.4699303960000001,
         
+Valor médio com 128 threas
: 0.48042494599999996,
         
+Valor médio com 256 threas
: 0.477909336,
         
+Valor médio com 512 threas
: 0.5049338860000001,
         
+Valor médio com 1024 threas
: 0.5200199560000001,

![javaTtasR75700](https://github.com/Henrique-Rmc/projConcorrente/assets/49095666/33955d81-d4dc-4626-8550-055f34e56d2f)

## TTAS CPU Pentium Gold

[Link para os resultados TTAS Pentium Gold](Scripts/output/PentiumGold7505/javaTas.json)

+Valor médio com 2 threas
: 0.73991579
       
+Valor médio com 4 threas
: 0.74719522,
       
+Valor médio com 8 threas
: 0.75732338,
        
+Valor médio com 16 threas
: 0.7517309000000001,
        
+Valor médio com 32 threas
: 0.7477605200000002,
         
+Valor médio com 64 threas
: 0.75568578,
         
+Valor médio com 128 threas
: 0.7715813500000002,
         
+Valor médio com 256 threas
: 0.8011336400000001,
         
+Valor médio com 512 threas
: 0.7963043200000002,
         
+Valor médio com 1024 threas
: 0.9040042900000002,

![javaTtas](https://github.com/Henrique-Rmc/projConcorrente/assets/49095666/ffc94fcf-a367-4aaf-9a63-9575139e05c3)

# Análise de Resultados Ryzen 5700
Para um pequeno número de threads (2, 4, 8), o Bakery Lock é o mais rápido.

Conforme o número de threads aumenta, o Bakery Lock mantém sua eficiência, enquanto o Bakery Atomic começa a ficar mais lento. Indicando que a complexidade desses algoritmos pode ser uma desvantagem em sistemas mais poderosos.

O TTAS e o TAS apresentam tempos de execução consistentemente curtos em uma ampla faixa de concorrência, de 2 a 1024 threads.

# Análise de Resultados Pentium Gold
Para um pequeno número de threads (2, 4, 8), o TTAS é o mais rápido.
Conforme o número de threads aumenta, o Bakery Atomic e o TAS também têm bons desempenhos, mas o TTAS permanece competitivo.
O Bakery apresenta os tempos mais altos, especialmente à medida que o número de threads aumenta.

# Análise de Resultados Ryzen 7 vs Pentium Gold

A diferença mais notável entre os resultados é a queda significativa no tempo de execução dos algoritmos no processador Ryzen 7 com mais núcleos e threads em comparação com o Pentium Gold. Isso se deve à capacidade de paralelização dos algoritmos em sistemas com mais threads disponíveis. Quando há mais threads, os algoritmos de exclusão mútua podem escalonar melhor e competir de maneira mais eficaz pela CPU.

## Conclusão

O desempenho dos algoritmos de exclusão mútua é fortemente influenciado pela configuração do hardware.

Sistemas com mais núcleos e threads têm uma vantagem clara no gerenciamento de concorrência e, portanto, algoritmos mais simples, como TTAS e TAS, tendem a se destacar nesses cenários.

O aumento na quantidade de threads beneficia significativamente o desempenho do TTAS e TAS, tornando-os escolhas sólidas para sistemas com alta concorrência.

Algoritmos mais complexos, como Bakery e Bakery Atomic, podem ser menos eficazes em sistemas com um grande número de threads, uma vez que a complexidade desses algoritmos pode começar a afetar negativamente o desempenho.

