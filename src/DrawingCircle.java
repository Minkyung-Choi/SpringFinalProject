

public class DrawingCircle extends DrawingStar{ //requirement 1: multiple classes & requirement 3: Inheritance

    private int r;
    private int c;
    public DrawingCircle(int row, int column, int r, int c){
        super(row, column);
        this.r = r;
        this.c = c;
    }

    public void drawing(boolean line){
        super.drawing(line);
        String[][] circles = new String[r][c];
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                circles[i][j]="◯";
            }
        }
        for(String[] lines: circles){
            for(String values: lines){
                System.out.print(values+" ");
            }
            System.out.println();
        }
        String[] finishLine = new String[c];
        for(int f=0; f<c; f++){
            finishLine[f]="-----";
        }
        for(String dashes:finishLine){
            System.out.print(dashes);
        }
    }
}
