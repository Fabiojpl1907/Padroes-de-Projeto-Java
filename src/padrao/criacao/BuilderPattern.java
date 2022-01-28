package padrao.criacao;

// Utilizando o Padrão de Criação - Construtor
// em uma máquina de café
// os principais ingredientes do café são café, leite e açúcar.
// dependendo de seu gosto você escolhe se quer ou não açúcar e leite.
//  O padrão do construtor entra em cena para fornecer essas opções
//  de café para você.

public class BuilderPattern {


    public static void main(String[] args) {
        // O que temos dentro do Coffee é um construtor (Builder),
        // para o qual passamos nossas opções de café.
        // Conectado  a essa chamada, fazemos outras chamadas
        // acrescentando nossas preferências dos outros ingredientes.
        // Outra pessoa que quer um café diferente pode facilmente construí-lo.
        // Isso leva a uma enorme flexibilidade na construção de objetos.

        Coffee coffee = new BuilderPattern.Coffee.Builder("Mocha").milk(true).sugar(false).size("Large").build();
        System.out.println(coffee);
    }

    static class Coffee {

        // Os principais componentes de sua escolha de seu café
        // Tipo ( Mocha, Cappucino, Latte, etc)
        // Leite ( sim ou não )
        // Açúcar ( sim ou não )
        // Tamanho ( pequeno , médio e grande)
        // estes componertes serão indicados na hora da requisição ( instancia)
        // de forma que o construtor de café saiba o que construir
        // dentro das várias possibilidades

        private String  type;
        private boolean sugar;
        private boolean milk;
        private String  size;

        private Coffee(Builder builder) {
            this.type = builder.type;
            this.sugar = builder.sugar;
            this.milk = builder.milk;
            this.size = builder.size;
        }

        public static class Builder {
            private String type;
            private boolean sugar;
            private boolean milk;
            private String size;

            public Builder(String type) {
                this.type = type;
            }
            public Builder sugar(boolean value) {
                this.sugar = value;
                return this;
            }

            public Builder milk(boolean value) {
                this.milk = value;
                return this;
            }

            public Builder size(String value) {
                this.size = value;
                return this;
            }

            public Coffee build() {
                return new Coffee(this);
            }
        }

        @Override
        public String toString() {
            return String.format("Coffee [type=%s, sugar=%s, milk=%s, size=%s]", this.type, sugar, milk, size);
        }

    }

}


