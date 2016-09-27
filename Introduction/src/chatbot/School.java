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

}