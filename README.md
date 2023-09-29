# javaReLearning - resgatando conhecimentos de Java

# casting de tipos
        
    int numero = 128;
    byte teste = (numero/2); - error, a maquina não sabe como tratar o resultado dessa expressão
    
    byte teste = (byte) (numero/2);
    teste ==> 64
    ...
    float numero = 10.25; - warning, tipo double sendo encaixado em float
    
    float numero = (float)10.25;
    numero ==> 10.25
- Para Java, é necessário expecificar qual será o resultado de uma declaração caso essa declaração utilize variaveis em sua expressão. Ou seja, quanto entregamos uma expressão matemática envolvendo variaveis é uma boa prática pré indicar como o compilador deve tratar esse dado