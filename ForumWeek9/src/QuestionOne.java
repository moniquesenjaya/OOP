import java.util.LinkedList;

public class QuestionOne {
    public LinkedList makeSpeciesList( LinkedList animals ){
        LinkedList<Species> ll = new LinkedList<Species>();
        for (Specimen animal: animals){
            ll.add(animal.getTOA());
        }
    }
    public LinkedList makeSpeciesListUnique( LinkedList allSpecies ){
        LinkedList<Species> ll = new LinkedList<Species>();
        for (Species species: allSpecies){
            boolean found = false;
            for (Species sp: ll){
                if (sp.getSpeciesName().equals(species.getSpeciesName())){
                    found = true;
                    break;
                }
            }
            if (!found){
                ll.add(species);
            }
        }
        return ll;
    }
}
