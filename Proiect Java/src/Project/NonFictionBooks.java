package Project;

import java.util.List;

public class NonFictionBooks extends BookInfo {

    private List<String> includedThemes;
    private List<String> personalities;

    public NonFictionBooks(String bookName, int pageNumber, String coverType, String language, String authorName, List<String> characters,
                           List<String> includedThemes, List<String> personalities) {
        super(bookName, pageNumber, coverType, language, authorName, characters);
        this.includedThemes = includedThemes;
        this.personalities = personalities;
    }

    public void bookCoverPassage() {
        System.out.println("By reading this book you will expand your knowledge about multiple themes like " +
                includedThemes.get(0) + ". To educate ourselves we must know our past and its most prestigious personalities like " +
                personalities.get(0) + " and " + personalities.get(1) + ". ");
    }

    public List<String> getIncludedThemes() {
        return includedThemes;
    }

    public void setIncludedThemes(List<String> includedThemes) {
        this.includedThemes = includedThemes;
    }

    public List<String> getPersonalities() {
        return personalities;
    }

    public void setPersonalities(List<String> personalities) {
        this.personalities = personalities;
    }

    @Override
    public String toString() {
        return "NonFictionBooks{" +
                "bookName='" + bookName + '\'' +
                ", pageNumber=" + pageNumber +
                ", coverType='" + coverType + '\'' +
                ", language='" + language + '\'' +
                ", authorName='" + authorName + '\'' +
                ", characters=" + characters +
                ", includedThemes=" + includedThemes +
                ", personalities=" + personalities +
                '}';
    }
}
