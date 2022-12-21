import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Node implements Comparable <Node> {
    public String name;
    public List<Node> neighbors;
    public boolean visited= false;
    public boolean visited2 = false;



    public Node(String n){
        name = n;
        neighbors = new ArrayList<>();
    }

    public void addneighbor(Node other){
        neighbors.add(other);
        Collections.sort(neighbors);
    }


    @Override
    public int compareTo(Node other){
        return name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return name;
    }

    public void printNeighbors(){
        System.out.println(neighbors.toString().replace(",","").replace("[","").replace("]",""));
    }

}
