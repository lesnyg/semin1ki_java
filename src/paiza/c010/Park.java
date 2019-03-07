package paiza.c010;

import java.util.ArrayList;
import java.util.List;

public class Park {
    private Gongsa gongsa;
    private List<Tree> trees;

    public Park(Gongsa gongsa, List<Tree> trees) {
        this.gongsa = gongsa;
        this.trees = trees;
    }

    public Gongsa getGongsa() {
        return gongsa;
    }

    public void setGongsa(Gongsa gongsa) {
        this.gongsa = gongsa;
    }

    public List<Tree> getTrees() {
        return trees;
    }

    public void setTrees(ArrayList<Tree> trees) {
        this.trees = trees;
    }

    public void printNoisy() {
        for (int i = 0; i < trees.size(); i++) {
            Tree tree = trees.get(i);
            if ((tree.getX() - gongsa.getX())
                    * (tree.getX() - gongsa.getX()) +
                    (tree.getY() - gongsa.getY())
                            * (tree.getY() - gongsa.getY()) >=
                    gongsa.getRadius() * gongsa.getRadius()) {
                System.out.println("silent");
            } else {
                System.out.println("noisy");
            }
        }


    }
}
