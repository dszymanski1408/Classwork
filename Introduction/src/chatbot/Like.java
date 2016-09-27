package chatbot;

public class Like implements Topic {
	
	private boolean inLikeLoop;
	private String likeResponse;
	
	public void talk() {
		inLikeLoop = true; 
		while(inLikeLoop){
			DavidSzymanskiMain.print("Tell me about what you like.");
			likeResponse = DavidSzymanskiMain.getInput();
			if((DavidSzymanskiMain.findKeyword(likeResponse, "school", 0)) >= 0){
				DavidSzymanskiMain.school.talk();
			}
			else if((DavidSzymanskiMain.findKeyword(likeResponse, "stop", 0)) >= 0){
				inLikeLoop = false;
				DavidSzymanskiMain.talkForever(); 
			}
			else DavidSzymanskiMain.print("Hey! I like that too!");
		}
	}
}

