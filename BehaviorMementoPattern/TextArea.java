package BehaviorMementoPattern;

public class TextArea {
    private String text;

    public void set(String text) {
        this.text = text;
    }

    public String getText(){
        return text;
    }

    public Memento takeSnapshot(){
        return new Memento(this.text);
    }

    public void restore(Memento memento){
        this.text = memento.getSavedText();
    }

    public static class Memento{
        private String text;

        private Memento(String textToSave) {
            text = textToSave;
        }

        private String getSavedText(){
            return text;
        }
    }
}
