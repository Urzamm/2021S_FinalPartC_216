package finalpartc;

/**
 * This class is for the final exam part C.
 *
 * @author Paul Bonenfant, April 2021
 * @Muhammad Urzam, August 2021
 */
public class FinalPartC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    }

    /**
     * A method that returns whether or not an applicant gets a loan
     * according to the following rules. Applicant must be 18 years or older with a minimum salary of $30,000.
     * @param age the age of the applicant
     * @param salary the applicant's salary
     * @return true if the conditions are met, false otherwise
     */
    public boolean getsLoan(int age, double salary) {
    
        return (age >= 18 && salary >= 30000.0);
        
    }
    
}
