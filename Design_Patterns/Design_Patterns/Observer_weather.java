import java.util.ArrayList;
import java.util.List;


interface Observer {

    void update(
        float temperature
    );

}



class Display implements Observer {


    private String name;


    public Display(String name){

        this.name = name;

    }



    public void update(float temperature){


        System.out.println(
            name +
            " temperature: "
            + temperature
        );

    }

}



class WeatherStation {


    private List<Observer> observers =
        new ArrayList<>();



    public void addObserver(
        Observer observer
    ){

        observers.add(observer);

    }



    public void setTemperature(
        float temperature
    ){


        for(
            Observer observer:
            observers
        ){

            observer.update(
                temperature
            );

        }

    }

}
