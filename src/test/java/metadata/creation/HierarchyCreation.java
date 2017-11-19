package metadata.creation;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by phanindra on 14/11/17.
 */
public class HierarchyCreation {

    @Test
    public void test_creation_of_graph_starting_from_zero_index() {
        String record = "https://website/0/1/2/3/4/5.html";
        List<String> circles = getCircles(record, 0, "document");
        List<String> arrows = getArrows(record, 0, "document");

        //set expectations

        assertTrue(6==circles.size());
        String [] allCircles = {"document", "0", "1", "2", "3", "4"};
        assertArrayEquals(allCircles, circles.toArray());

        assertTrue(5==arrows.size());
        String [] allArrows = {"0->document", "1->0", "2->1", "3->2", "4->3"};
        assertArrayEquals(allArrows, arrows.toArray());

    }

    @Test
    public void test_creation_of_graph_starting_from_non_zero_index() {
        String record = "https://website/0/1/2/3/4/5.html";
        List<String> circles = getCircles(record, 2, "training");
        List<String> arrows = getArrows(record, 2, "training");

        //set expectations

        assertTrue(4==circles.size());
        String [] allCircles = {"training", "2", "3", "4"};
        assertArrayEquals(allCircles, circles.toArray());

        assertTrue(3==arrows.size());
        String [] allArrows = {"2->training", "3->2", "4->3"};
        assertArrayEquals(allArrows, arrows.toArray());

    }

    private List<String> getArrows(String record, int startIndex, String topLevelLabel) {
        String[] split = record.replace("https://website/", "").split("/");
        String[] exceptLast = Arrays.copyOfRange(split, startIndex, split.length - 1);
        List<String> fullCircles = new ArrayList<>();
        fullCircles.add(topLevelLabel);
        List<String> excpetLastList = Arrays.asList(exceptLast);
        fullCircles.addAll(excpetLastList);

        List<String> fullArrows = new ArrayList<>();
        //create arrows
        for(int i=0; i<fullCircles.size()-1; i++) {
            fullArrows.add(fullCircles.get(i+1) + "->" + fullCircles.get(i));
        }
        return fullArrows;

    }

    private List<String> getCircles(String record, int startIndex, String topLevelLabel) {
        String[] split = record.replace("https://website/", "").split("/");
        String[] exceptLast = Arrays.copyOfRange(split, startIndex, split.length - 1);
        List<String> fullCircles = new ArrayList<>();
        fullCircles.add(topLevelLabel);
        List<String> excpetLastList = Arrays.asList(exceptLast);
        fullCircles.addAll(excpetLastList);
        return fullCircles;
    }
}
