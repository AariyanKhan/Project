import java.util.ArrayList;

public abstract class chatThread {

	protected String IP;
	protected int port;
	protected String username;
	protected Main mainReference;
	protected ArrayList privateChat;
	
	public abstract void sendMessage(String s);
	
	public String getUsername() {
		return username;
	}
	
	public abstract void executeCommand(String command);
	
	public abstract void sendPrivateRequest(String fromUser, String toUser);
	
}
