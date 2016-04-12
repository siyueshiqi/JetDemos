package jet.demo.task;

import java.util.List;

import jet.demo.model.Description;
import jet.demo.model.Message;
import jet.demo.model.MyTaskConfig;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Task;

public class MyTask  extends Task {

	private MyTaskConfig myTaskConfig;

	public void addMyTaskConfig(MyTaskConfig myTaskConfig) {
		this.myTaskConfig = myTaskConfig;
	}

	@Override
	public void execute() throws BuildException {
		// show Message List
		List<Message> messageList = myTaskConfig.getMessage();
		if (messageList != null) {
			for (Message message : messageList) {
				show("message", message.getId(), message.getContent());
			}
		}
		
		// show Description
		Description description = myTaskConfig.getDescription();
		if (description != null) {
			show("description", description.getId(), description.getContent());
		}
	}
	
	// show Information of Element
	private void show(String type, String id, String content) {
		System.out.println("type=" + type + ",id=" + id + ",content=" + content);
	}
	
}
