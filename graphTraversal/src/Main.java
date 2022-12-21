import java.util.*;

public class Main {
    private List<Node> nodes;
    private Node Starter;
    String startName;
    private ArrayList<Node> DepthF = new ArrayList<>();
    private Queue<Node> Q = new LinkedList<>();


    public Main(){
        nodes = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        String nodeNames = s.nextLine();
        String[] names = nodeNames.split(" ");
        for(var name: names){
            Node n = new Node(name);
            nodes.add(n);
        }
        startName = s.nextLine();
        Starter = findNodeByName(startName);


        while (true){
            String a = s.next();
            //finish the code when *** comeout
            if(a.equals("***")){
                break;
            }
            //Saving neighbors in each n
            Node n1 =findNodeByName(a);
            String b = s.next();
            Node n2 = findNodeByName(b);
            n1.addneighbor(n2);
            n2.addneighbor(n1);
        }

        System.out.println("Node Neighbors: ");
        for (Node n:nodes){
            System.out.print(n+" :");
            n.printNeighbors();

        }
        //DepthFirst
        DepthFirst(Starter);
        System.out.println("Depth-First Search: ");
        for(var dep: DepthF) {
            System.out.print(dep+" ");
        }
        System.out.println(" ");

        //BreadthFirst
        System.out.println("Breadth-First Search: ");
        BreadthFirst(Starter);
    }


    private Node findNodeByName(String name){
        for(Node n : nodes){
            if(name.equals(n.name)){
                return n;
            }
        }
        return null;
    }

    public void DepthFirst(Node n){
        n.visited = true;
        DepthF.add(n);
        for(var nei :n.neighbors){
            if(nei.visited == false){
                DepthFirst(nei);
            }
        }
    }

    public void BreadthFirst(Node n){
        n.visited2 =true;
        System.out.print(n);
        Q.add(n);
        while(!Q.isEmpty()){
            for(var a: Q.peek().neighbors) {
                if(a.visited2 ==false){
                    a.visited2 = true;
                    System.out.print(" "+ a);
                    Q.add(a);
                }
            }
            Q.remove();
        }

    }


    public static void main(String[] args){
        new Main();
    }
}
