# TeachMeSkills_C27_Lesson_20_HW
Homework for lesson #20

1. **Task #1_1 (using "Thread")**

A program has been created using **"Thread"** that simulates morning: reading news, breakfast and coffee.
Program contains:
- Class **"MorningActivity"** with constructor setting the activity name and thread priority and **"run"** method for performing actions within a thread;
- Service classes:
- Class **"LoadingProperties"** with **"loadProperties"** for loading configuration parameters from a **"config.properties"** file;
- Class **"MorningSimulation"** with **"startMorningSimulation"** for running morning simulation (load configuration parameters from file and create and launch threads based on configuration).
- Class **"Runner"** with method **"main"** to run the program (create an object of the **"MorningSimulation"** class and call the **"startMorningSimulation"** method).

File for storing configuration parameters: **"config.properties"**.

2. **Task #1_2 (using "Runnable")**

A program has been created using "Runnable" that simulates morning: reading news, breakfast and coffee.
Program contains:
- Class **"MorningActivity"** - a thread representing morning activity. Contains constructor morning activity and method **"run"** performing morning activities;
- Class **"Runner"** - Morning simulation class. Contains method **"main"** to run the program and create and launch threads based on the loaded configuration.

File for storing configuration parameters: **"config.properties"**.

3. **Task #2**

A program has been written to simulate the work of a car service center.
Program contains:
- Interface **"IConstants"** for storing constants (**"MAX_CARS_FOR_SERVICE"**);
- Class **"Car"** - representing a car. Contains constructor, getter and **"toString"** method;
- Class **"CarStation"** - representing car station. Contains constructor, **"addCar"** method - method for adding a car to the service queue and **"removeCar"** method - method for picking up a car from a service station after service;
- Service classes:
- Class **"CarProducer"** - thread for adding cars to the car station. Contains constructor, getter and setter and **"run"** method - generating and adding cars to the car station;
- Class **"CarConsumer"** - thread for picking up cars from car stations after servicing. Contains constructor, getter and setter and **"run"** method - picking up repaired cars from the car station.
- Class **"Runner"** - main program class. Creation of a service car object. Creating and launching threads for adding and removing away cars. 
