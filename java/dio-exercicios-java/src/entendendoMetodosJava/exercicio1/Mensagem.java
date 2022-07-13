package entendendoMetodosJava.exercicio1;

public class Mensagem {

    private static void getMensagemBomDia() {
        System.out.println("Bom dia!!");
    }

    private static void getMensagemBoaTarde() {
        System.out.println("Boa tarde!!");
    }

    private static void getMensagemBoaNoite() {
        System.out.println("Boa noite!!");
    }

    public static void obterMensagem(int hora) {
        switch (hora) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                getMensagemBomDia();
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                getMensagemBoaTarde();
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 0:
                getMensagemBoaNoite();
                break;
            default:
                System.out.println("Hora inválida!");
                break;
        }
    }
}
