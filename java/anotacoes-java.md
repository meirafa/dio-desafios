### Atalhos Intelij

- Rodar primeira vez o programa:
    Ctrl + Shift + F10
- Rodar o programa
    Shift + F10
- Abrir janela de constructor/getters/setters
    Alt + Insert
- Comentar por bloco
    Selecione o bloco a ser comentado, Ctrl + Shift + /
- Comentar por linha
    Selecione as linhas a ser comentadas, Ctrl + /
- Apagar os importes não utilizados
    Ctrl + Alt + o
- Criar o 'console.log'
    sout
- Criar método main
    main
- Duplicar linha
    Ctrl + D
- Deletar linha
    Ctrl + Y
- Refatorar a classe
    Clicar na classe, Shift + F6
- Apenas editor de texto a mostra
    Shift + F12
- Identar código
    Ctrl + Alt + L
- Alterar linha de lugar
    Ctrl + Shift + setas p cima ou baixo

**Mais sobre: http://www.basef.com.br/index.php/Atalhos_do_IntelliJ_Idea**

---

## Boas práticas para criação de variáveis

- Usar camelCase para declarar variáveis com nomes de facil compreensão:
    int nomeCompleto;
- Usar letra maiúscula separada por underline para declarar constantes:
    final int NOME_COMPLETO;

### Tipos de variáveis:
textual:
    char caracterT = '\u0084';
        (aspas simples)
        valor default '\u0000'
    String name = "name";
        (aspas duplas e String é maiusculo pois é uma classe)
        valor default null
numeral - valor default 0:
    byte tamanhoByte = 127;
    short tamanhoShort = -32768;
    int tamanhoInteiro = 2147483647;
    double tamanhoDouble = 3.14;
        valor default 0
    long tamanhoLong = 9223372036854775807L;
        (long tem final L após número)
        valor default 0L
    float tamanhoFloat = 3.14f;
        (float tem final f após número)
        valor default 0.0f
booleano:
    boolean verdadeiro = true;
    boolean falso = false;
        valor default false

### Operadores aritméticos
pós-fixado:
    exp++ e exp--
prefixado:
    ++exp ou --exp
multiplicativo:
    *, /, %
aditivo:
    +, -
atribuição:
    =, +=, -=, *=, /=, %=

### Sobre métodos:
O que é?
    Todo método deve ser criado dentro da classe, para ser executado precisa ser chamado a partir de uma classe ou um objeto, feito esta requisição ele realiza o comportamento que lhe foi determinado.

Padrão de definição do método:
    
    visibilidade? tipo? modificador? retorno nome (parametros?) exceções? {
        corpo
    }
    
    O método deve conter como obrigatóriedade um retorno, nome e corpo, sendo opcional a visibilidade, tipo, modificador, parametros e exceções, sendo:
        Visibilidade: public, protected ou private
        Tipo: concreto ou abstrato
        Modificador: static ou final
        Retorno: tipo de dados primitivos (int, double, etc) ou não primitivos (objeto, classe), ou void (só executa)
        Nome: nome que é fornecido ao método, sendo descritivo mas curto, notação camelCase
        Parametro: parametros que pode receber seguindo do tipo e nome, obrigatórios os parenteses mesmo se não obtiver parametros fornecidos
        Exceções: exceções que pode lançar
        Corpo: código que possui tendo boa prática ser de 80 a 120 linhas ou podendo ser vazio.

    exemplo "visibilidade modificador retorno nome (paramentro){corpo};"
    ficaria:
        public static void executar(Cliente cliente){...};
    chamando o metodo acima:
        nome_da_classe.executar(["antonio", "29 anos"]){...};

    outros tipos de chamar o método:
        Math.random(); //metodo a partir de classe
        usuario.getEmail(); //metodo a partir de objeto
