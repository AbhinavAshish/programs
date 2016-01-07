package graphs.directed;

/**
 * Created by Abhinav on 1/6/2016.
 */
public class GraphClient {
    public static void main(String[] args){

        Graph graph1= new Graph(3);
        graph1.addEdge(1,2);
        graph1.addEdge(0,1);
        graph1.addEdge(0,3);
        System.out.println(graph1.isEdge(2,1));
    }

}
