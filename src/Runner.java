public class Runner {
    public static void main(String[] args){
        String[][] face =new String[5][8];
        JackOLatern face1 = new JackOLatern(face);

        face1.fill("X");
        face1.edit(" ",0, 0);
        face1.edit(" ",4, 7);
        face1.edit(" ",0, 7);
        face1.edit(" ",4, 0);

        face1.edit(" ",0, 0);
        face1.edit(" ",4, 7);
        face1.edit(" ",0, 7);
        face1.edit(" ",4, 0);
        face1.edit(" ",0, 0);
        face1.edit(" ",4, 7);
        face1.edit(" ",0, 7);
        face1.edit(" ",4, 0);
        face1.edit(" ",0, 0);
        face1.edit(" ",4, 7);
        System.out.println(face1);
    }
}
