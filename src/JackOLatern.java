public class JackOLatern {

    private String[][] faceFeatures;

    public JackOLatern(String[][] faceFeatures){
        this.faceFeatures=faceFeatures;
    }

    public void edit(String replace, int row, int column){
        faceFeatures[row][column]=replace;
    }

    public void fill(String str){
        for(int i=0; i<faceFeatures.length; i++){
            for(int j=0; j<faceFeatures[j].length; i++){
                faceFeatures[i][j]=str;
            }
        }
    }

    String[][] newface=new String[][];
    public String[][] toString() {
        for(int i=0; i<faceFeatures.length; i++){
            for(int j=0; j<faceFeatures[j].length; i++){
                System.out.println(faceFeatures[i][j]);
            }
            System.out.println("\n");
        }
        return newface;
    }
}