package BehaviorMementoPattern;

import java.util.Deque;
import java.util.LinkedList;

public class Editor {
    private Deque<TextArea.Memento> stateHistory;
    private TextArea textArea;

    public Editor() {
        stateHistory = new LinkedList<>();
        textArea = new TextArea();
    }

    public void write(String text){
        textArea.set(text);
        stateHistory.add(textArea.takeSnapshot());
    }

    public void undo(){
        if (stateHistory.isEmpty()){
            return;
        }
        stateHistory.pollLast();
        TextArea.Memento previousState = stateHistory.peekLast();
        if (previousState != null) {
            textArea.restore(previousState);
        } else {
            // If previousState is null, it means it's the initial state
            // Handle this case according to your requirements
            System.out.println("Already at the initial state.");
            textArea.set("");
        }





    }

    public void printText(){
        System.out.println(textArea.getText());
    }
}
