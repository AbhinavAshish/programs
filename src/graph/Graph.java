package graph;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.*;
/**
 * Created by Abhinav on 1/6/2016.
 */
public class Graph {
    private int V;
    private LinkedList <Integer> adj[];

    public Graph(int V) {
        this.V= V;
        adj = new LinkedList[V];
        for (int i=0;i<V;i++){
            adj[i] = new LinkedList<Integer>();
        }
    }
    public void addEdge(int v, int w){
        adj[v].add(w);
    }

    void DFSUtil(int v,boolean visited[]){
        visited[v]= true;
        System.out.println(v + " ");
        Iterator<Integer> i = adj[v].listIterator();
         while (i.hasNext()){
             int n =i.next();
             if (!visited[n]){
                 DFSUtil(n,visited);
             }

         }
    }


    void DFS (){
        boolean visited[] = new boolean[V];
        for (int i=0;i<V;i++){
            if (visited[i]== false){
                DFSUtil(i,visited);
            }
        }
    }


    void BFSUtil(int v, boolean visited[] ){
        visited[v]= true;
        System.out.println(v +" ");

    }

    public static void main(String args[])
    {
        Graph g = new Graph(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("Following is Depth First Traversal");

        g.DFS();

    }
}


