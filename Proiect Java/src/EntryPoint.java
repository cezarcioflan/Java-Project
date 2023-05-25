import Project.*;
import Service.LibraryService;


import java.io.IOException;
import java.util.*;

public class EntryPoint {

    public static void main(String[] args) {

        LibraryService LS = new LibraryService();

        SFBooks SF1 = new SFBooks("Space adventure", 250, "Hard cover", "English", "Cioflan Cezar",
                Arrays.asList("Rebecca", "Vlad", "Anca"), Arrays.asList("Predator", "Xenomorph"), Arrays.asList("Mars", "Pluto"));
        SFBooks SF2 = new SFBooks("The three body problem", 350, "Paperback", "English", "Rares Atat",
                Arrays.asList("Andrei", "Vlad", "Ciprian"), Arrays.asList("Predator", "Alien2"), Arrays.asList("Venus", "Jupiter"));

        NonFictionBooks NF1 = new NonFictionBooks("The history of time", 450, "Paperback", "English", "Mihai Eminescu",
                Arrays.asList("Andrei", "Anca", "Alex"), Arrays.asList("History", "Art"), Arrays.asList("DaVinci", "Elon Musk"));
        NonFictionBooks NF2 = new NonFictionBooks("Artistic coding", 460, "Hard cover", "English", "Stoian Anca",
                Arrays.asList("Cezar", "Stefan", "Alex"), Arrays.asList("Computer Science", "Art"), Arrays.asList("Bill Gates", "Steve Jobs"));

        FantasyBooks FB1 = new FantasyBooks("Circe", 200, "Hard cover", "English", "George",
                Arrays.asList("Circe", "Poseidon", "Hermes"), Arrays.asList("Greek Mythology", "Antic Heroes"), Arrays.asList("Hydra", "Pigs"));
        FantasyBooks FB2 = new FantasyBooks("Night Circus", 500, "Paper back", "English", "Stoian Anca",
                Arrays.asList("Celia", "Marco", "Alexander"), Arrays.asList("Magic", "Circus"), Arrays.asList("Ephemeral Birds", "Ephemeral Dogs"));

        Customers C1 = new Customers("Ion", "Gigi", new ArrayList<BookInfo>(Arrays.asList(SF1, NF1)));
        Customers C2 = new Customers("Ana", "Maria", new ArrayList<BookInfo>(Arrays.asList(NF2, FB2)));

        Employees E1 = new Employees("Ionel", "Marian", "ionelmarian@gmail.com", "14.01.1999", "Librarian", 3500, 3);
        Employees E2 = new Employees("Cornel", "Gigel", "cornelgigel@gmail.com", "12.05.1997", "Manager", 4500, 2);
        E1.interrogate();
        Map<BookInfo, Integer> map1 = new HashMap<>(); map1.put(SF1, 20); map1.put(NF1, 20); map1.put(FB1, 20);
        Set<Customers> set1 = new HashSet<>(); set1.add(C1);
        Libraries L1 = new Libraries(new ArrayList<Employees>(Arrays.asList(E1)), map1, set1, "Strada Mierii 41", "Completion");
        Map<BookInfo, Integer> map2 = new HashMap<>(); map2.put(SF2, 20); map2.put(NF2, 20); map2.put(FB2, 20);
        Set<Customers> set2 = new HashSet<>(); set1.add(C2);
        Libraries L2 = new Libraries(new ArrayList<Employees>(Arrays.asList(E2)), map2, set2, "Strada Caragiale 45", "Perfection");
        System.out.println(C1);

        Authors A1 = new Authors("Cezar", "Cioflan", "czcioflan@gmail.com", "14.11.1999", new ArrayList<>(Arrays.asList(SF1, NF1, FB1)));
        Authors A2 = new Authors("Mihai", "Eminescu", "mihaieminescu@gmail.com", "11.06.1859", new ArrayList<>(Arrays.asList(SF2, NF2, FB2)));

        PublishingHouses P1 = new PublishingHouses("Corint", "0700000001", "corint@gmail.com", new ArrayList<BookInfo>(Arrays.asList(SF1, NF1, FB1)), 1000000);
        PublishingHouses P2 = new PublishingHouses("Alexandria", "0700000002", "alexandria@gmail.com", new ArrayList<BookInfo>(Arrays.asList(SF2, NF2, FB2)), 1500000);

        LS.changePrimaryCharacterFunction(2, SF1);

        System.out.println(SF1);
        System.out.println();

        LS.bookCoverPassageFunction(SF1);
        System.out.println();

        LS.bookCoverPassageFunction(NF1);
        System.out.println();

        LS.bookCoverPassageFunction(FB1);
        System.out.println();

        System.out.println(C1);
        System.out.println(L1);
        System.out.println();

        LS.borrowNewBookFunction(C1, FB1, L1);

        System.out.println(C1);
        System.out.println(L1);
        System.out.println();

        LS.returnBookFunction(C1, SF1, L1);

        System.out.println(C1);
        System.out.println(L1);
        System.out.println();

        LS.fireEmployeeFunction(E1, L1);

        LS.employFunction(E1, L1);

        System.out.println(E2);

        LS.changeRankFunction(false, 500, E2);

        System.out.println(E2);

        LS.changeRankFunction(true, 250, E2);

        System.out.println(E2);
        System.out.println();

        LS.interrogateFunction(E2);
        System.out.println();


        System.out.println(LS.publishingHouseTemporaryMerger(P1, P2, "Meta",
                "0700000003", "meta@gmail.com"));

        List<String> inputList = new ArrayList<>();
        inputList = LS.input();

        SFBooks SF4 = new SFBooks(inputList.get(0), Integer.parseInt(inputList.get(1)), inputList.get(2), inputList.get(3), inputList.get(4),
                Arrays.asList(inputList.get(5), inputList.get(6), inputList.get(7)), Arrays.asList(inputList.get(8), inputList.get(9)),
                Arrays.asList(inputList.get(10), inputList.get(11)));

        System.out.println(SF4);

        LS.output(SF1);
        LS.output(SF2);
        LS.output(NF1);
        LS.output(NF2);
        LS.output(FB1);
        LS.output(FB2);
        LS.output(C1);
        LS.output(C2);
        LS.output(E1);
        LS.output(E2);
        LS.output(A1);
        LS.output(A2);
        LS.output(L1);
        LS.output(L2);
        LS.output(P1);
        LS.output(P2);


        try {
            LS.closeOutput();
        } catch(IOException e) {
            e.printStackTrace();
        }

    }
}
