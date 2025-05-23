public class Main {

    public static void main(String[] args) {
        ArvoreGenerica<String> arvore = new ArvoreGenerica<>();

        Posicao<String> a = arvore.adicionarRaiz("A");
        Posicao<String> b = arvore.adicionarFilho(a, "B");
        Posicao<String> c = arvore.adicionarFilho(a, "C");
        Posicao<String> d = arvore.adicionarFilho(a, "D");
        Posicao<String> e = arvore.adicionarFilho(b, "E");
        Posicao<String> f = arvore.adicionarFilho(b, "F");
        Posicao<String> g = arvore.adicionarFilho(d, "G");

        System.out.print("Pré-ordem: ");
        arvore.percursoPreOrdem(a);
        System.out.println();

        System.out.print("Pós-ordem: ");
        arvore.percursoPosOrdem(a);
        System.out.println();

        System.out.print("Nós folha: ");
        arvore.imprimirFolhas(a);
        System.out.println();

        System.out.println("Profundidade de G: " + arvore.profundidade(g));
        System.out.println("Profundidade de B: " + arvore.profundidade(b));
        System.out.println("Profundidade de A: " + arvore.profundidade(a));
    }
}
