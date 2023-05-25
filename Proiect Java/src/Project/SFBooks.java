package Project;

import java.util.Collections;
import java.util.List;


public class SFBooks extends BookInfo {

    private List<String> alienSpecies;
    private List<String> planetNames;

    public SFBooks(String bookName, int pageNumber, String coverType, String language, String authorName, List<String> characters, List<String> alienSpecies, List<String> planetNames) {
        super(bookName, pageNumber, coverType, language, authorName, characters);
        this.alienSpecies = alienSpecies;
        this.planetNames = planetNames;
    }

    public void bookCoverPassage() {
        System.out.println("Your mind will be blown while you embark on this adventure with " +
                characters.get(0) + " on multiple planets like " + planetNames.get(0) + " and " + planetNames.get(1) +
                ". But beware! There are multiple alien species like " + alienSpecies.get(0) + " and " + alienSpecies.get(1) +
                " that will finally be discovered by humanity. Will you befriend them or eradicate them?");
    }

    public void alphabeticalOrderPlanets() {
        Collections.sort(planetNames);
    }

    public List<String> getAlienSpecies() {
        return alienSpecies;
    }

    public void setAlienSpecies(List<String> alienSpecies) {
        this.alienSpecies = alienSpecies;
    }

    public List<String> getPlanetNames() {
        return planetNames;
    }

    public void setPlanetNames(List<String> planetNames) {
        this.planetNames = planetNames;
    }

    @Override
    public String toString() {
        return "SFBooks{" +
                "bookName='" + bookName + '\'' +
                ", pageNumber=" + pageNumber +
                ", coverType='" + coverType + '\'' +
                ", language='" + language + '\'' +
                ", authorName='" + authorName + '\'' +
                ", characters=" + characters +
                ", alienSpecies=" + alienSpecies +
                ", planetNames=" + planetNames +
                    '}';
    }
}
