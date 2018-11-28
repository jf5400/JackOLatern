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
            for(int j=0; j<faceFeatures[i].length; j++){
                faceFeatures[i][j]=str;
            }
        }
    }

    public String toString() {
        String newface="";
        for(int i=0; i<faceFeatures.length; i++){
            for(int j=0; j<faceFeatures[i].length; j++){
                newface+=(faceFeatures[i][j]);
            }
            newface+=("\n");
        }
        return newface;
    }
}