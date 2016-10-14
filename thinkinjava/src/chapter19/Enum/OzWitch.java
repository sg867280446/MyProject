package chapter19.Enum;

public enum OzWitch {
	FIRST("һ"),
	SECOND("��"),
	THIRD("��"),
	FOURTH("��");
	
	
    private String description;
		
    OzWitch(String description){
    	this.description = description;
    }


	public String getDescription() {
		return description;
	}   
	
	
	public static void main(String args[]){
		for(OzWitch witch : OzWitch.values()){
			System.out.println(witch + ": "+witch.getDescription());
		}
	}
    
}
