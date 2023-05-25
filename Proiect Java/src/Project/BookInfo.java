package Project;

import java.util.List;

abstract public class BookInfo {

    protected String bookName;
    protected int pageNumber;
    protected String coverType;
    protected String language;
    protected String authorName;
    protected List<String> characters; // Personajul principal este pe pozitia 0.

    public BookInfo(String bookName, int pageNumber, String coverType, String language, String authorName, List<String> characters) {
        this.bookName = bookName;
        this.pageNumber = pageNumber;
        this.coverType = coverType;
        this.language = language;
        this.authorName = authorName;
        this.characters = characters;
    }

    public abstract void bookCoverPassage();

    public void changePrimaryCharacter(int i) {
        String aux;
        aux = characters.get(0);
        characters.set(0, characters.get(i));
        characters.set(i, aux);
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String getCoverType() {
        return coverType;
    }

    public void setCoverType(String coverType) {
        this.coverType = coverType;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public List<String> getCharacters() {
        return characters;
    }

    public void setCharacters(List<String> characters) {
        this.characters = characters;
    }
}
