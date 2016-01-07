package graphs.directed;

/**
 * Created by Abhinav on 1/6/2016.
 */
public class Graph {

    private int V;
    private boolean adj[][];

    public Graph(int V) {
        this.V= V;
        adj = new boolean[V][V];
    }

    public void addEdge(int node1 , int  node2 ){
        if (checkVertex(node1)&& checkVertex(node2)){
            //System.out.println("edge between " +node1 +"  " +node2);
         adj[node1][node2]= true;
            adj[node2][node1]= true;
        }
        else{
            System.out.println("Incorrect value");
        }
    }

    public boolean checkVertex(int node){

        if (node <0 || node >=V){return false;}
        else {return true;}

    }

    public boolean isEdge(int node1 , int  node2){

        if( adj[node1][node2]=true){return true;}
        return false;
    }

    public void removeEdge(int node1 , int  node2){
        if (checkVertex(node1)&& checkVertex(node2)){
            adj[node1][node2]= false;
            adj[node2][node1]= false;
        }
    }


}

