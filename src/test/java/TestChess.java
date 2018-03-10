import org.junit.Before;
import chess.ChessGame;
import static org.junit.Assert.*;
import org.junit.Test;  
  
public class TestChess { 
  
    @Before  
    public void before(){  
      //ChessGame cli = new ChessGame(System.in, System.out);  
    }  
  
    @Test  
    public void testFindMax(){  
        assertEquals(4, 4);    
    }  
}  