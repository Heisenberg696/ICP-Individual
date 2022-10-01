import java.io. * ;
import  java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;




public class PathFinding {

   // Declaring two variables of type Airports.
    private Airports startAirport;
    private Airports destinationAirport;

    /**
     * // Java
     * public Airports getStartAirport() {
     *         return startAirport;
     *     }
     * 
     * @return The startAirport object.
     */
    public Airports getStartAirport() {
        return startAirport;
    }


/**
 * This function sets the startAirport variable to the value of the startAirport parameter
 * 
 * @param startAirport The airport where the flight starts
 */
    public void setStartAirport(Airports startAirport) {
        this.startAirport = startAirport;
    }

    

/**
 * This function returns the destination airport of the flight
 * 
 * @return The destination airport.
 */
    public Airports getDestinationAirport() {
        return destinationAirport;
    }

  /**
   * This function sets the destination airport of the flight
   * 
   * @param destinationAirport Airports
   */
    public void setDestinationAirport(Airports destinationAirport) {
        this.destinationAirport = destinationAirport;
    }


    // Reading the input file and the airports.csv file and then it is splitting the data and storing
    // it in the variables.
    public PathFinding(String inputSrc, String outputSrc) throws IOException{
        FileReader inputReader = new FileReader(inputSrc);
        FileReader airportReader = new FileReader("airports.csv");
        FileWriter outputWriter = new FileWriter(outputSrc);
        BufferedReader inputData = new BufferedReader(inputReader);
        BufferedReader airportData = new BufferedReader(airportReader);
        String[] startData = inputData.readLine().split(",");
        String[] destData = inputData.readLine().split(",");
        String startCity = startData[0];
        String startCountry = startData[1];
        String destCity = destData[0];
        String destCountry = destData[1];
        String line;
        while((line = airportData.readLine()) != null){
            String[] lineList = line.split(",");
            Integer airportId = Integer.parseInt(lineList[0]);
            String airportName = lineList[1];
            String airportCity = lineList[2];
            String airportCountry = lineList[3];
            String iata = lineList[4];

            if(airportCity.equals(startCity)){
                startAirport = new Airports(airportId, airportName, airportCity, airportCountry, iata);
            }

            if(airportCity.equals(destCity)){
                destinationAirport = new Airports(airportId, airportName, airportCity, airportCountry, iata);
            }
        }
    }
    
/**
 * It reads the routes.csv file and returns a list of routes that start from the airport with the given
 * airportId
 * 
 * @param airportId The airport id of the airport you want to get the routes from.
 * @return A list of routes
 */
    public List<Routes> getActions(String airportId) throws IOException{
        FileReader routesReader = new FileReader("routes.csv");
        BufferedReader routesData = new BufferedReader(routesReader);
        String line;
        List<Routes> actions = new ArrayList();
        while((line = routesData.readLine()) != null){
            String[] lineList = line.split(",");
            String airlineCode = lineList[0];
            String airlineId = lineList[1];
            String startCode = lineList[2];
            String startId = lineList[3];
            String destinationCode = lineList[4];
            String destinationId = lineList[5];
            Integer stops = Integer.parseInt(lineList[7]);

            if(airportId.equals(startId) ){
    
                actions.add(new Routes(airlineCode, airlineId, startCode, startId, destinationCode, destinationId,stops));
            }
        }
        return actions;
    }


/**
 * It reads a csv file and returns an object of type Airports if the airportId or airportCode matches
 * the airportId or airportCode in the csv file
 * 
 * @param airportId The IATA code of the airport
 * @param airportCode "1"
 * @return The method is returning an object of type Airports.
 */
    public Airports getAirports(String airportId, String airportCode) throws IOException{
        System.out.println(airportId);
        FileReader airportReader = new FileReader("airports.csv");
        BufferedReader airportData = new BufferedReader(airportReader);
        String line;
        while((line = airportData.readLine()) != null){
            String[] lineList = line.split(",");
            Integer airportId2 = Integer.parseInt(lineList[0]);
            String airportName = lineList[1];
            String airportCity = lineList[2];
            String airportCountry = lineList[3];
            String iata = lineList[4];


            if(iata.equals(airportId)){
                 return new Airports(airportId2, airportName, airportCity, airportCountry, iata);
            }

            if(Integer.toString(airportId2).equals(airportCode)){
                return new Airports(airportId2, airportName, airportCity, airportCountry, iata);
            }
        }
        return null;

        
    }




    /**
     * It takes in a start and end airport, and returns a node that contains the path from the start to
     * the end airport
     * 
     * @param start The starting airport
     * @param end The destination airport
     * @return A node object
     */
    public Node generatePath(Airports start, Airports end) throws IOException{
        HashSet<String> explored = new HashSet<>();
        Queue<Node> frontier = new LinkedList<>();
        frontier.add(new Node(start));
        while(!frontier.isEmpty()){
            Node node = frontier.poll();
            explored.add(node.getState().getIata());
            for(Routes route: getActions(Integer.toString(node.getState().getAirportID()))){
                try{
                    System.out.println(route);
                    Node neighbour = new Node(node, route.getAirlineCode(), route.getStops(), getAirports(route.getDestinationAirportcode(), route.getDestinationAairportID()));
                    // System.out.println(route.getSourceairportCode());
                    if(neighbour.getState().getIata().equals(end.getIata())){
                        return neighbour;
                    }
                    if(!explored.contains(neighbour.getState().getIata()) && !frontier.contains(neighbour)){
                        frontier.add(neighbour);
                    }
                }catch(NullPointerException npe){
                    npe.printStackTrace();
                }
            
            }

        }
        return null;
    }

/**
 * This function takes a stack of nodes as a parameter and writes the flight information of each node
 * to a file called output.txt
 * 
 * @param solution Stack of nodes that represent the solution path
 */
    public void printToFile(Stack<Node> solution) throws IOException{
        FileWriter outpuWriter = new FileWriter("output.txt");
        BufferedWriter br = new BufferedWriter(outpuWriter);
        while(!solution.isEmpty()){
            Node node = solution.pop();
            if(node.getParent() != null){
                br.write(node.getFlight() + " from " + node.getParent().getState().getIata() + " to " + node.getState().getIata() + "\n");
            }
        }
        br.close();
    }


    public static void main(String[] args) throws Exception {
        try{
        
        PathFinding pf = new PathFinding("input.txt", "output.txt");

        Stack<Node> solutionStack = pf.generatePath(pf.getStartAirport(), pf.getDestinationAirport()).solutionPath();
        pf.printToFile(solutionStack);
        }
        catch( NullPointerException npe){
            npe.getStackTrace();
        }

        catch(NumberFormatException nfe){
            nfe.getStackTrace();
            
        }

       
    }
        
    
}
