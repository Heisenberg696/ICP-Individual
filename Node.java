import java.util.Stack;

public class Node {
    private Node parent;
    private String flight;
    private Integer stops;
    private Airports state;
    
    
    public Node(Airports state) {
        this.state = state;
    }
    public Node(Node parent, String flight, Integer stops, Airports state) {
        this.parent = parent;
        this.flight = flight;
        this.stops = stops;
        this.state = state;
    }
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
    public String toString() {
        return "Node [flight=" + flight + ", parent=" + parent + ", state=" + state + ", stops=" + stops + "]";
    }
    @// Overriding the hashCode method.
    Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((state == null) ? 0 : state.hashCode());
        return result;
    }
    @Override
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
