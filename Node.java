import java.util.Stack;

public class Node {

// Creating a node class that will be used to create a tree.
    private Node parent;
    private String flight;
    private Integer stops;
    private Airports state;
    
    
// This is a constructor that takes in a state and sets it to the state of the node.
    public Node(Airports state) {
        this.state = state;
    }


// This is a constructor that takes in a parent, flight, stops, and state and sets them to the parent,
// flight, stops, and state of the node.
    public Node(Node parent, String flight, Integer stops, Airports state) {
        this.parent = parent;
        this.flight = flight;
        this.stops = stops;
        this.state = state;
    }

// These   are  getter methods that returns the parent, flight, stops, and state of the node.
    public Node getParent() {
        return parent;
    }
    public String getFlight() {
        return flight;
    }
    public Integer getStops() {
        return stops;
    }
   
    public Airports getState() {
        return state;
    }


/**
 * It returns a stack of nodes that represents the path from the current node to the root node
 * 
 * @return The solution path is being returned.
 */
    public Stack<Node> solutionPath(){
        Node node = this;
        Stack<Node> solution = new Stack<>();
        while(node != null){
            solution.push(node);
            node = node.parent;
        }
        return solution;
    }


    @Override
// Returning a string that represents the node.
    public String toString() {
        return "Node [flight=" + flight + ", parent=" + parent + ", state=" + state + ", stops=" + stops + "]";
    }


    @Override
// A hash code method that returns a hash code value for the object.
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((state == null) ? 0 : state.hashCode());
        return result;
    }
    @Override
// Checking if the object is equal to the node.
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Node other = (Node) obj;
        if (state == null) {
            if (other.state != null)
                return false;
        } else if (!state.equals(other.state))
            return false;
        return true;
    }
}
