
public class Board {
	public int allPieces[][];
	
	public final int BLACK_TURN=-1;
	public final int WHITE_TURN=1;
	
	
	public void initialize(){
		for(int i=0;i<15;i++)
			for(int j=0;j<15;j++)
				allPieces[i][j]=0;
	}
	
	public void update(int row, int line){
		
	}
	
	public void checkWinner(int row, int line){
		
	}
}
