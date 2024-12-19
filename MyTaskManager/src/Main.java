import java.util.Scanner;

public class Main {

    static char pedeChar(Scanner teclado){
        System.out.println("Escolha a opção:");
        return teclado.next().charAt(0);
    }

    //menu principal
    static void menu(String[] tarefa, boolean[] temPrazo, boolean[] foiFeita, int[][] data, int nTarefas, Scanner teclado){
       
        char opcao;
        do{
            System.out.println("Bem vindo(a) ao TaskManager");
            System.out.println("(V)isualizar");
            System.out.println("(M)arcar");
            System.out.println("(E)ditar");
            System.out.println("(S)air");

            opcao=pedeChar(teclado);

            switch(opcao){
                case 'V': 
                case 'v':    
                    visualizar(tarefa, temPrazo, foiFeita, data, nTarefas, teclado);
                    break;
                case 'M': 
                case 'm':
                    marcar(teclado);
                    break;
                case 'E': 
                case 'e':
                    editar(teclado);
                    break;
                case 'S':
                case 's':
                    System.out.println("A sair da aplicação...");
                    break;
                default:
                    System.out.println("Carater invalido, insira novamente");
            }
            System.out.println("\n");
        }while(opcao != 'S'&& opcao != 's');
    }
    
    //submenu visualizar tarefas (a ser feito por Juliana)
   static void visualizar(String[] tarefa, boolean[] temPrazo, boolean[] foiFeita, int[][] data, int nTarefas, Scanner teclado){
        char opcao;
        do{
            System.out.println("\n");
            System.out.println("Visualizar (t)odas");
            System.out.println("Visualizar (d)ia d");
            System.out.println("Visualizar (a)té dia d");
            System.out.println("Visualizar (p)or fazer");
            System.out.println("Visualizar (f)eitas");
            System.out.println("Visualizar por pa(l)avra p");
            System.out.println("(V)oltar");

            opcao=pedeChar(teclado);

            switch(opcao){
                case 't': 
                case 'T':
                    visualizarTodas(tarefa, temPrazo, foiFeita, data, nTarefas, teclado);
                    break;
                case 'd': 
                case 'D':
                    visualizarDia();
                    break;
                case 'a': 
                case 'A':
                    visualizarAteDia();
                    break;
                case 'p': 
                case 'P':
                    visualizarPorFazer();
                    break;
                case 'f': 
                case 'F':
                    visualizarFeitas();
                    break;
                case 'l': 
                case 'L':
                visualizarPorPalavra();
                    break;
                case 'V':
                case 'v': 
                    break;                                
                default:
                    System.out.println("Carater invalido, insira novamente");
            }
        }while(opcao != 'V' && opcao != 'v');
    }

    //apresenta uma lista de todas as tarefas em memória
    static void visualizarTodas(String[] tarefa, boolean[] temPrazo, boolean[] foiFeita, int[][] data, int nTarefas, Scanner teclado){
        System.out.println("Tarefa\t\tData\t\tFeita");
        for(int i=0;i<nTarefas;i++){
            System.out.print((i+1) + ": " + "\t" + tarefa[i] + "\t");
            if(temPrazo[i]==true){
                System.out.print(data[i][0] + "/" + data[i][1] + "/" + data[i][2] + "\t");
            }else{
                System.out.print("Sem prazo\t");
            }System.out.println(foiFeita[i] ? "X" : " ");
        }
    }

    //lista as tarefas a realizar numa data d (dia, mês, ano) fornecida pelo utilizador
    static void visualizarDia(){
    
    }

    //lista todas as tarefas a realizar até ao dia d e não só as realizadas nesse dia
    static void visualizarAteDia(){
    // a opção Voltar deve sempre permitir regressar ao menu anterior
    }

    //lista todas as tarefas que ainda não foram cumpridas
    static void visualizarPorFazer(){
    // a opção Voltar deve sempre permitir regressar ao menu anterior
    }

    //lista todas as tarefas já realizadas
    static void visualizarFeitas(){
    // a opção Voltar deve sempre permitir regressar ao menu anterior
    }

    //solicita uma palavra p ao utilizador e lista todas as tarefas onde essa palavra surge na descrição
    static void visualizarPorPalavra(){
    //a opção Voltar deve sempre permitir regressar ao menu anterior
    }

    //submenu marcação de tarefas ** (fazer por mim) **
    static void marcar(Scanner teclado){
        char opcao;
        do{
            System.out.println("\n");
            System.out.println("Marcar como (f)eita por número");
            System.out.println("Marcar como feita por (t)exto");
            System.out.println("(D)esmarcar última feita");
            System.out.println("Marcar todas (n)o dia d");
            System.out.println("(V)oltar");

            opcao=pedeChar(teclado);

            switch(opcao){
                case 'f': 
                case 'F':
                    marcarFeitaNumero();
                    break;
                case 'd': 
                case 'D':
                    marcarFeitaTexto();
                    break;
                case 'a': 
                case 'A':
                    desmarcarUltima();
                    break;
                case 'p': 
                case 'P':
                    marcarTodas();
                    break;
                case 'V':
                case 'v': 
                    break;                                
                default:
                    System.out.println("Carater invalido, insira novamente");
            }
            System.out.println("\n");
        }while(opcao != 'V' && opcao != 'v');
    }

    //O utilizador deve escolher uma tarefa por número, a qual será marcada como feita.
    static void marcarFeitaNumero(){

    }

    //O utilizador deve introduzir um String de texto e a primeira tarefa que o conter na descrição será marcada como feita.
    static void marcarFeitaTexto(){

    }

    //O utilizador deve marcar como por fazer a última tarefa que tiver sido marcada como feita.
    static  void desmarcarUltima(){

    }

    //Todas as tarefas a realizar no dia d são marcadas como realizadas.
    static void marcarTodas(){

    }

    //submenu Editar //a defenir
    static void editar(Scanner teclado){
        char opcao;
        do{
            System.out.println("\n");
            System.out.println("(A)dicionar tarefa");
            System.out.println("Adicionar (t)arefa na posição n");
            System.out.println("Apagar tarefa na (p)osição n");
            System.out.println("Apagar (f)eitas");
            System.out.println("(J)untar tarefas");
            System.out.println("(E)ditar tarefa");
            System.out.println("(V)oltar");

            opcao=pedeChar(teclado);

            switch(opcao){
                case 'A': 
                case 'a':
                    adicionarTarefa();
                    break;
                case 't': 
                case 'T':
                    addTarPosicao();
                    break;
                case 'p': 
                case 'P':
                    apagarTarPosicao();
                    break;
                case 'f': 
                case 'F':
                    apagarFeitas();
                    break;
                case 'J': 
                case 'j':
                    juntarTarefas();
                    break;
                case 'E': 
                case 'e':
                    editarTarefa(teclado);
                    break;
                case 'V':
                case 'v': 
                    break;                                
                default:
                    System.out.println("Carater invalido, insira novamente");
            }
            System.out.println("\n");
        }while(opcao != 'V' && opcao != 'v');
    }

    //Permite adicionar uma nova tarefa no fim da lista de tarefas, recebendo para tal os dados do utilizador.
    static void adicionarTarefa(){

    }

    //Semelhante à anterior mas adicionalmente solicita ao utilizador uma posição da lista, já ocupada, devendo mover as tarefas já existentes de forma a inserir a nova tarefa na posição escolhida.
    static void addTarPosicao(){

    }

    //Apaga uma tarefa em posição escolhida pelo utilizador. Deve reorganizar a lista de forma a não deixar uma posição em branco
    static void apagarTarPosicao(){

    }

    //Apaga todas as tarefas marcadas como realizadas. Não devem, de novo, ser deixadas posições na lista por ocupar.
    static void apagarFeitas(){

    }

    //Junta duas tarefas escolhidas por número. A nova descrição é construída pela concatenação das descrições das duas tarefas, separadas por ‘,’ e a data será a mais próxima entre aquelas presentes nas tarefas.
    static void juntarTarefas(){

    }

    //submenu de edição de tarefa
    static void editarTarefa(Scanner teclado){
        char opcao;
        do{
            System.out.println("\n");
            System.out.println("(E)ditar texto");
            System.out.println("(R)emover/adicionar data");
            System.out.println("(V)oltar");

            opcao=pedeChar(teclado);

            switch(opcao){
                case 'E': 
                case 'e':
                    editarTexto();
                    break;
                case 'R': 
                case 'r':
                    removeAddData();
                    break;
                case 'V':
                case 'v': 
                    break;                                
                default:
                    System.out.println("Carater invalido, insira novamente");
            }
            System.out.println("\n");
        }while(opcao != 'V' && opcao != 'v');
    }

    //Solicita a posição de uma tarefa e solicita um novo texto para substituir o atual
    static void editarTexto(){

    }

    //Permite remover a data limite de uma tarefa ou adicionar uma data, caso ela não exista
    static void removeAddData(){

    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //arrays
        int tamMax=100;
        //tarefa armazena o nome das tarefas
        String [] tarefa = new String[tamMax];
        //temPrazo guarda se as tarefas têm ou não data limite
        boolean [] temPrazo = new boolean[tamMax];
        //foiFeita, se a tarefa já foi concluída ou não
        boolean [] foiFeita = new boolean[tamMax];
        //data armazena arrays com as datas para realização das tarefas
        int [][] data = new int[tamMax][3];
        //a tarefa i está armazenada nas posições i de todos os arrays
        int nTarefas=0;

        menu(tarefa, temPrazo, foiFeita, data, nTarefas, teclado);
        teclado.close();
    }
}