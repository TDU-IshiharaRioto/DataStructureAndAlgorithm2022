public class Note {
    private Paper[] papers = new Paper [10];
    public Note () {
        for (int i = 0; i < this.papers.length; i++) {
            this.papers[i] = new Paper();
        }
    }
    public Paper get (int index) {
        return this.papers[index];
    }
    public int size () {
        return this.papers.length;
    }
}
