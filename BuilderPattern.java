//builder pattern encapsulates or hides the process of building a complex object and seperates the representation of the object and its construction. The separation allows us to construct different representations using the same construction process.

//Class Diagram
//Builder
//concrete Builder
//Director
//Product

public abstract class AircraftBuilder {
      public void buildEngine() {
        
      }

      public void buildWings() {
        //get F-16 wings
        //f16.wings = new F16Wings();
      }

      public void buildCockpit() {

      }

      public void buildBathrooms() {

      }

      abstract public IAircraft getResult();

    }


}

public class Boeing747Builder extends AircraftBuilder{
     Boeing747 boeing747;

     @Override
     public void buildCockpit() {

     }
     @Override
     public void buildEngine() {

     }

     @Override
     public void buildBathrooms() {

     }

     @Override
     public void buildWings() {

     }

     public IAircraft getResult() {

        return boeing747;
     }
}

public class F16Builder extends AircraftBuilder {
     
    F16 f16;

    @Override
    public void buildEngine(){
     //get F-16 an engine
        // f16.engine =new F16Engine();
    }

    @Override
    public void buildWings(){

    }
    
    @Override
    public void buildWIngs(){

    }

    @Override
    public void buildCockpit(){
        f16 = new F16();
    }

    public IAircraft getResult() {
        return f16;
    }
}

public class Director {
    AircraftBuilder aircraftBuilder;

    public Director(AircraftBuilder aircraftBuilder) {
        this.aircraftBuilder = aircraftBuilder;

    }

    public void construct(boolean isPassenger){
        aircraftBuilder.buildCockpit();;
        aircraftBuilder.buildEngine();;
        aircraftBuilder.buildWings();

        if(isPassenger){
            aircraftBuilder.buildBathrooms();
        }
    }
}

public class Client {
    public void main() {
        F16Builder f16builder =new F16Builder();
        Director director = new Director(f16Builder);
        director.constructor(false);

        IAircraft f16 = f16Builder.getResult();
    }
}

