# Padrão de Projetos

Projeto de estudo de Padrões de Projetos JAVA, apresentando conceitos gerais de padrões de projeto e detalhe de 3 padrões escolhidos de foco de estudo. 

*Detalhes dos Códigos :* 

- IDE Intellij - projeto Java
- Java 17
- Organizados em pacotes condizentes ao  padrão de projeto : Criação / Estrutural / Comportamental
- Comentários em cada código detalhando a função do código na construção do padrao

*Detalhes dos Conceitos :* 

- Apresenta resumo do conceito de Padrões de Projeto
- Apresenta resumo dos  conceito dos tipos de padrões estudados
  - Criação -> Construtor
  - Comportamental -> Estado
  - Estrutural -> Adaptador
    - Apresenta resumo do conceito de Padrões de Projeto
- Apresenta exemplo do dia a dia cada um dos 3  padrões estudados
- Apresenta resumo da situação escolhida para ser desenvolvida com cada um dos padrões

### O que são padrões de projeto?

Durante as experiências com construção de soluções, a turma de desenvolvimento encontrou um grande número de problemas, e uma variedade de soluções foram propostas para resolvê-los.

Uma tentativa foi feita por um grupo de quatro pessoas, famosamente chamado de “Gang-Of-Four” ou GoF, para apresentar um conjunto de problemas e soluções comuns- Padrões de Projeto .



### Por que padrões de projeto?

As vantagens dos padrões de projeto são:

- Para fornecer terminologia padrão que todos entendam
- Para não repetir os mesmos erros uma e outra vez

### Quais são os tipos de padrões de projeto?

Os padrões de projeto, aqui vistos sob perspectiva da orientação a objetos, são:

- Padrões de criação
- Padrões Estruturais
- Padrões comportamentais

#### A. Criação

Padrões de criação lidam com a criação de objetos.

#### B. Estrutural

Trata com como classes e objetos podem ser compostos, para formar estruturas maiores.

Os padrões de projeto estrutural **simplificam a estrutura identificando os relacionamentos** .

Esses padrões se concentram em como as classes herdam umas das outras e como elas são compostas de outras classes.

#### C. Comportamental

Os padrões comportamentais focam mais no comportamento dos objetos, ou mais precisamente, nos relacionamento entre objetos. 

#### 1. *Padrão de Criação  - Construtor*

**Construtor**:  separa a construção do objeto de sua representação. 

O Construtor diz que "construa um objeto complexo a partir de objetos simples usando uma abordagem passo a passo

As principais vantagens do Construto são as seguintes:

​		Ele fornece uma separação clara entre a construção e a representação de um objeto.
​		Proporciona melhor controle sobre o processo de construção.
​		Ele suporta alterar a representação interna de objetos

As vantagens de usar o padrão construtor são:

- Simplifica a criação de objetos
- Leva a um código mais legível
- Não permite que os valores sejam modificados

**Exemplo do dia a dia**

Suponha que você saia para um jantar de vários pratos em um restaurante. 

Haveria muitas opções :  entradas, prato principal e sobremesas. 

O que voce vai querer ?  

Pode ser : entradas e prato principal , mas sem sobremesas. 

Ou prefere :  prato principal e as sobremesas, sem entradas ? 

Situações semelhantes podem surgir no projeto de software. 

Pode ser necessário construir um objeto usando um subconjunto das opções disponíveis. 

Ou talvez seja necessário criar o objeto de várias maneiras. É aqui que o padrão do construtor é útil.

**Código exemplo**

Uma máquina que "constrói"  o café dentro de suas preferencias a partir de um grupo de opções disponíveis



#### 2. *Padrão Comportamental  - Estado*

Um padrão de estado diz que "o comportamento da classe/objeto muda com base em seu estado". 

No padrão Estado, criamos objetos que representam vários estados e um objeto de contexto cujo comportamento varia conforme seu objeto de estado muda.

O Padrão de Estado também é conhecido como Objetos para Estados.

**Benefícios:**
	Ele mantém o comportamento específico do estado.
	Torna explícitas quaisquer transições de estado.

**Uso:**
	Quando o comportamento do objeto depende de seu estado e deve ser capaz de alterar seu comportamento em tempo de execução de acordo com o novo estado.
	É usado quando as operações têm instruções condicionais grandes e com várias partes que dependem do estado de um objeto

**Exemplo do dia a dia** 

Controle de ventilador de parede. 

O controle de parede do ventilador controla a velocidade com a rotação do ventilador. 

Possui níveis de velocidade que variam de 0 a 5. 

Quando está no nível 0, o ventilador não gira, e no nível 5 gira o mais rápido .

Quando você gira o botão do controle do ventilador, o nível muda, e isso faz com que a velocidade do ventilador também mude. 

Este é um caso clássico de mudança de estado (nível) causando uma mudança de comportamento (velocidade).

**Código exemplo**

Sistema de controle  de uma empresa dentro do contexto Contabilidade / Vendas / Gerenciamento, onde o comportamento do objeto se altera segundo o seu estado ( abrir, fechar , registrra transação , atualizar  )



#### 3. *Padrão Estrutural   - Adaptador*

Um adaptador é usado para combinar interfaces de diferentes classes.

Um padrão de adaptador diz que apenas "converte a interface de uma classe em outra interface que um cliente deseja".

Em outras palavras, fornecer a interface de acordo com o requisito do cliente ao usar os serviços de uma classe com uma interface diferente.

O Padrão Adaptador também é conhecido como Wrapper.

Vantagem do Padrão Adaptador
	Ele permite que dois ou mais objetos anteriormente incompatíveis interajam.
	Permite a reutilização de funcionalidades existentes

Uso do padrão Adaptador
	Quando um objeto precisa utilizar uma classe existente com uma interface incompatível.
	Quando você deseja criar uma classe reutilizável que coopera com classes que não possuem interfaces compatíveis.
	Quando você deseja criar uma classe reutilizável que coopera com classes que não possuem interfaces compatíveis

**Exemplo do dia a dia : adaptadores de energia.**

**Problema** : Se você comprar um celular fora de seu pais , ele vem com um carregador que só funciona com tomadas usadas no pais de origem. 

**Solução** : A solução é usar um adaptador de viagem que você possa usar com o carregador quando viajar. Você pode conectar seu carregador ao adaptador de viagem, e o adaptador de viagem é usado para conectar à tomada em um determinado país.

Da mesma forma, quando você tenta falar com um sistema que usa um formato de mensagem ou um idioma diferente, você precisa de um adaptador para traduzir as mensagens.

Um exemplo interessante é a comunicação entre um programa Java e um serviço web. 

Antes de enviar os dados para o serviço, precisamos converter o objeto em formato XML ou JSON. Estamos implementando o padrão adaptador!

**Existem as seguintes especificações para o padrão do adaptador:**

- Interface de destino: 

- Classe Adaptada: 

- Classe adaptadora: 
- Cliente:

**Código exemplo**

Quando um cliente  utilizar um cartão de crédito,  é necessario interagir com o banco e obter as informações especificas da situação em curso. aprovação do uso do cartão. 

### Referencias

```
https://dzone.com/articles/design-patterns-for-beginners-with-java-examples

https://www.javatpoint.com/structural-design-patterns
```





