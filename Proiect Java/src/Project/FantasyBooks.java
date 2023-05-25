package Project;

import java.util.Collections;
import java.util.List;


public class FantasyBooks extends BookInfo {

    private List<String> regions;
    private List<String> creatures;

    public FantasyBooks(String bookName, int pageNumber, String coverType, String language, String authorName, List<String> characters,
                        List<String> regions, List<String> creatures) {
        super(bookName, pageNumber, coverType, language, authorName, characters);
        this.regions = regions;
        this.creatures = creatures;
    }

    public void bookCoverPassage() {
        System.out.println("Welcome to an experience out of this world! Together with " +
                characters.get(0) + "you will embark on a magical journey in some astonishing regions like " +
                regions.get(0) + " and " + regions.get(1) +
                ". But beware! There are multiple creatures like " + creatures.get(0) + " and " + creatures.get(1) +
                " that were never seen before. Will you befriend them or eradicate them?");
    }

    public void alphabeticalOrderRegions() {
        Collections.sort(regions);
    }

    public List<String> getRegions() {
        return regions;
    }

    public void setRegions(List<String> regions) {
        this.regions = regions;
    }

    public List<String> getCreatures() {
        return creatures;
    }

    public void setCreatures(List<String> creatures) {
        this.creatures = creatures;
    }

    @Override
    public String toString() {
        return "FantasyBooks{" +
                "bookName='" + bookName + '\'' +
                ", pageNumber=" + pageNumber +
                ", coverType='" + coverType + '\'' +
                ", language='" + language + '\'' +
                ", authorName='" + authorName + '\'' +
                ", characters=" + characters +
                ", regions=" + regions +
                ", creatures=" + creatures +
                '}';
    }
}
