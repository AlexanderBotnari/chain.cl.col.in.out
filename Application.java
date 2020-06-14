package chain.cl.col.in.out;

public class Application {

	public static void main(String[] args) {
		
		Pizza simplePizza = new Pizza("thick","halit","olive")
                .with("cheese")
                .with("tomato")
                .with("mushrooms")
                .with("meat")
                .without("olive")
                .without("meat")
                .without("pepper");
		

       System.out.println( "IS pizza complete? " + simplePizza.isComplete() );
       System.out.println( simplePizza );

	}

}
