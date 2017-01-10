package chatbot;

public class DavidHello implements Topic {

	private boolean inHelloLoop;
	private String helloResponse;
	
	private int helloCount;
	
	//responses are constants (never change, always exist)
	private static String[] calmResponses = {"We've already said our hellos. Remember?",
			"Yes hello to you too. Let's actually talk."};
	private static String[] angryResponses = {"Okay, seriously. This has to stop.",
			"You are beginning to annoy me.", 
			"We've SAID HELLO!!!"};

			
	
	
	public DavidHello(){
		helloCount = 0;
	}
	@Override
	public void talk() {
		// TODO Auto-generated method stub
		inHelloLoop = true;
		while(inHelloLoop){
			helloCount++;
			printResponse();
			//calm response
			//angry response
			helloResponse = DavidSzymanskiMain.getInput();
			if(isTriggered(helloResponse) == false){
				inHelloLoop = false;
				DavidSzymanskiMain.talkForever();
			}
		}
	}

	private void printResponse() {
		int responseIndex = 0;
		// TODO Auto-generated method stub
		//calm response
		if(helloCount < 5){
			responseIndex  = (int)(Math.random() * calmResponses.length);
			DavidSzymanskiMain.print(calmResponses[responseIndex]);
		}
		//angry response
		else{
			responseIndex = (int)(Math.random() * angryResponses.length);
			DavidSzymanskiMain.print(angryResponses[responseIndex]);
		}
	}
	@Override
	public boolean isTriggered(String userInput) {
		// TODO Auto-generated method stub
		if(DavidSzymanskiMain.findKeyword(userInput, "hi", 0) >= 0){
			return true;
		}
		if(DavidSzymanskiMain.findKeyword(userInput, "hello", 0) >= 0){
			return true;
		}
		return false;
	}
}
