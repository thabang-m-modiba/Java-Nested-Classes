# Java-Nested-Classes
## Mini project on Java Nested Classes and Enums
## Smart Gearbox and drive modes
You are building a program for a high-perfomance <b>Car</b>. To make it work, you need to track the "driving state" and handle the internal mechanical adjustments of the "engine" based on that state.

### Your Tasks:
1. The <code>Enum DriveMode</code>:
  * Create an enum called <code>DriveMode</code> with three constants: <code>ECO</code>, <code>Sport</code>, and <code>OFFROAD</code>.
  * Bonus: Give each enum constants a <code>maxSpeed</code> variable (e.g., ECO = 100, SPORT = 250).

2. The outer class (<code>Car</code>):
   * It should have a <code>modelName</code> and a variable to store the current <code>DriveMode</code>.
   * It shoul have a method called <code>changeMode(DriveMode newMode)</code> that prints the change and triggers the "Engine" to adjust.
3. The nested class (<code>Engine</code>):
   * Make a private inner class (Since the engine belongs strictly to the car).
   * It should have a method like <code>reTune(DriveMode mode)</code> that prints different messages based on the mode (e.g., "Engine: Increasing fuel injection for SPORT mode.").
4. The main method:
   * Create a <code>Car</code> Object(e.g., VW or BMW).
   * Call <code>changeMode</code> using your <code>DriveMode</code> enum values and wach the internal <code>Engine</code> respond.
  
### Why this Structure?
* The Enum keeps the driving modes strictly defined so nobody can set the car to "Flight Mode."
* The Nested Class keeps the messy "engine tuning" logic hidden inside the <code>Car</code> where it belongs.
