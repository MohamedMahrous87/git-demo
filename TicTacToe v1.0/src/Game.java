
import java.util.*;
public class Game {

	
	
	public Game() {
		// TODO Auto-generated constructor stub
		System.out.println("===================================================================================");
		System.out.println("=============================  Wellcom to TIC TAC TOU =============================");
		System.out.println("===================================================================================");
		System.out.println("=====================Enter Players Names And Symbols( X  or O )====================");
	}

public String checkName(Player ob){

	if((ob.getName().equals(null)) || !ob.getName().matches("^[a-zA-Z]*$")){
		
		ob.readName(ob);
	}
	return pname;
	}
	
	


public char checkSymbol(char psymbol) {
	
	if(psymbol == 'X' || psymbol == 'x' || psymbol == 'O' || psymbol == 'o' ){
		
		if(psymbol == pp.getSymbol()) {
			pp.readSymbol();
		}
	}
	return psymbol;
}
	

	
}
