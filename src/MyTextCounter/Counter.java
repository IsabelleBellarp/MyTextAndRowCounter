

package MyTextCounter;

public class Counter {

    private int countCharacters;
    private int rows;

    public Counter() {
        rows = 0;
        countCharacters = 0;
    }

    public void increaseCharacters(String text) {
        countCharacters = countCharacters + text.length();
    }

    public void addRow() {
        rows = rows + 1;

    }

    public int getRows() {
        return rows;
    }

    public int getCharacters() {
        return countCharacters;
    }


    public boolean containsStop(String characters) {
        if (!characters.contains("stop")) {
            return true;
        } else {
            return false;

        }
    }
}
