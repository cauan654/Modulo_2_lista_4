public class Main {

    class Inimigo {
        private int ataque;
        private int defesa;
        private int pontos;

        void constructor() {
        }

        constructor(ataque, defesa, pontos) {
            this.ataque = ataque;
            this.defesa = defesa;
            this.pontos = pontos;
        }

        get ataque() {
            return this.ataque;
        }

        set ataque(ataque) {
            this.ataque = ataque;
        }

        get defesa() {
            return this.defesa;
        }

        set defesa(defesa) {
            this.defesa = defesa;
        }

        get pontos() {
            return this.pontos;
        }

        set pontos(pontos) {
            this.pontos = pontos;
        }
    }

    class Heroi {
        private int ataque;
        private int defesa;
        private int pontos;

        void constructor() {
        }

        constructor(ataque, defesa, pontos) {
            this.ataque = ataque;
            this.defesa = defesa;
            this.pontos = pontos;
        }

        get ataque() {
            return this.ataque;
        }

        set ataque(ataque) {
            this.ataque = ataque;
        }

        get defesa() {
            return this.defesa;
        }

        set defesa(defesa) {
            this.defesa = defesa;
        }

        get pontos() {
            return this.pontos;
        }

        set pontos(pontos) {
            this.pontos = pontos;
        }
    }

    class Mapa {
        private String nome;
        private int altura;
        private int largura;
        private ArrayList<Inimigo> inimigos;
        private ArrayList<Heroi> herois;

        public Mapa() {}

        public Mapa(String nome, int altura, int largura, ArrayList<Inimigo> inimigos, ArrayList<Heroi> herois) {
            this.nome = nome;
            this.altura = altura;
            this.largura = largura;
            this.inimigos = inimigos;
            this.herois = herois;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public int getAltura() {
            return altura;
        }

        public void setAltura(int altura) {
            this.altura = altura;
        }

        public int getLargura() {
            return largura;
        }

        public void setLargura(int largura) {
            this.largura = largura;
        }

        public ArrayList<Inimigo> getInimigos() {
            return inimigos;
        }

        public void setInimigos(ArrayList<Inimigo> inimigos) {
            this.inimigos = inimigos;
        }

        public ArrayList<Heroi> getHerois() {
            return herois;
        }

        public void setHerois(ArrayList<Heroi> herois) {
            this.herois = herois;
        }
    }

    class Musica {
        constructor(nome, duracaoEmSegundos, popularidade, genero) {
            this.nome = nome;
            this.duracaoEmSegundos = duracaoEmSegundos;
            this.popularidade = popularidade;
            this.genero = genero;
        }
    }

    class Album {
        constructor(nome, nomeArtista, musicas) {
            this.nome = nome;
            this.nomeArtista = nomeArtista;
            this.musicas = musicas;
        }

        getMusicaMaiorPopularidade() {
             maiorPopularidade = 1;
             musicaMaisPopular;

            for (i = 0; i < this.musicas; i++) {
                if (this.musicas[i].popularidade > maiorPopularidade) {
                    maiorPopularidade = this.musicas[i].popularidade;
                    musicaMaisPopular = this.musicas[i];
                }
            }

            return musicaMaisPopular;
        }

        getMusicaMenorDuracao() {
             menorDuracao = Infinity;
             musicaMenorDuracao;

            for (i = 0; i < this.musicas; i++) {
                if (this.musicas[i].duracaoEmSegundos < menorDuracao) {
                    menorDuracao = this.musicas[i].duracaoEmSegundos;
                    musicaMenorDuracao = this.musicas[i];
                }
            }

            return musicaMenorDuracao;
        }
    }
}