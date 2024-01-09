package tic_toc_tie.player;

import tic_toc_tie.enumeration.SymbolType;

public class Player {
	String name;
	SymbolType symbolType;
	
	public Player(String name, SymbolType symbolType){
		this.name = name;
		this.symbolType = symbolType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public SymbolType getSymbolType() {
		return symbolType;
	}

	public void setSymbolType(SymbolType symbolType) {
		this.symbolType = symbolType;
	}
	
	
}
