/* This program calculates medication dosage per kilogram of body weight for three patient.
 * Procedure for this program:
 Step 1. Assign patient weights in lbs
 Step 2. Convert weight from lbs to kg
 Step 3. Use patient weight in kg to find dosage of medication in mg
 Step 4. Repeat with different weights for 2 additional patients  
*/



public class DosageCalculator {
  public static void main (String [] args) {

 System.out.println ("This program helps health care providers determine dosage of medication based on patient's weight.");

 // Declaring and initializing variables

  double weightInLb = 115; // Patient 1 weight in pounds
  double weightInKg = (weightInLb * 0.454); // Conversion of weight to kilograms
  double dosage = (weightInKg * 30); // Calculate dosage per kg
   
// Print statement for first patient

    System.out.print ("Patient came in not feeling well, based on her weight of " + weightInLb +  " lbs (" + weightInKg + " kg), ") ;
    System.out.println ("the patient was prescribed " + dosage + " mg of medication."); 
    

    // Assigning new values to variables

   weightInLb = 134; //  Patient 2 weight in pounds
   weightInKg = (weightInLb * 0.454); // Conversion of weight to kilograms
   dosage = (weightInKg * 30); // Calculate dosage per kg
   
// Print statement for second patient

    System.out.print ("Patient number two was also not feeling well, based on her weight of " + weightInLb + " lbs (" + weightInKg + " kg), ") ;
    System.out.println ("the patient was prescribed " + dosage + " mg of medication.");
    

    // Assigning new values to variables

   weightInLb = 152; // Patient 3 weight in pounds
   weightInKg = (weightInLb * 0.454); // Conversion of weight to kilograms
   dosage = (weightInKg * 30); // Calculate dosage per kg
    
// Print statement for third patient

    System.out.print ("Patient number three came in with symptoms similar to that of patient two. Based on her weight of " + weightInLb + " lbs (" + weightInKg + " kg), ") ;
    System.out.println ("the patient was prescribed " + dosage + " mg of medication.");
    
   

 }
}