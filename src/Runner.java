public class Runner {
    public static void main(String[] args){
        String[][] face =new String[6][8];
        JackOLatern face1 = new JackOLatern(face);

        face1.fill(" ");
        face1.edit(" ",0, 0);
        face1.edit(" ",4, 7);
        face1.edit(" ",0, 7);
        face1.edit(" ",4, 0);

        face1.edit("O",1, 2);
        face1.edit("O",1, 4);
        face1.edit("-",2, 3);
        face1.edit("v",3, 1);
        face1.edit("v",4, 2);
        face1.edit("v",3, 3);
        face1.edit("v",4, 4);
        face1.edit("v",3, 5);
        System.out.println(face1);
    }
}
