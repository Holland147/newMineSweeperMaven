public class Main {

    public static void main(String[] args) {
        board newBoard = new board(9);
        if(newBoard.getWin()){
            System.out.print("well done on");

        } else{
            System.out.println("Hit Bomb you're out");
        }
    }
}