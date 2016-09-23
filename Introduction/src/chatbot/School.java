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
			if(schoolsResponse.indexOf("stop") >= 0){
				inSchoolLoop = false;
				DavidSzymanskiMain.talkForever(); 
			}
			DavidSzymanskiMain.print("Thats my favorite part about school too!");
		}
	}

}