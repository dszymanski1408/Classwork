package chatbot;

public class School implements Topic {
	
	private boolean inSchoolLoop;
	private String schoolsResponse;
	
	public void talk() {
		// TODO Auto-generated method stub
		inSchoolLoop = true;
		while(inSchoolLoop){
			DavidSzymanskiMain.print("Tell me about school.");
			schoolsResponse = DavidSzymanskiMain.getInput();
			if((DavidSzymanskiMain.findKeyword(schoolsResponse, "like", 0)) >= 0){
				DavidSzymanskiMain.like.talk(); 
			}
			else if((DavidSzymanskiMain.findKeyword(schoolsResponse, "stop", 0)) >= 0){
				inSchoolLoop = false;
				DavidSzymanskiMain.talkForever(); 
			}
			else DavidSzymanskiMain.print("Thats my favorite part about school too!");
		}
	}
	
	public boolean isTriggered(String userInput) {
		//String[] triggers = {"school", "class", "teacher"};
		if(DavidSzymanskiMain.findKeyword(userInput, "school", 0) >= 0){
			return true;
		}
		if(DavidSzymanskiMain.findKeyword(userInput, "class", 0) >= 0){
			return true;
		}
		return false;
	}

}