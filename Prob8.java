public class Prob8 {

    public static void main(String[] args) {
        int totalPopulation = 80000;
        
        
        double percentageMen = 52;
        double percentageTotalLiteracy = 48;
        double percentageLiterateMen = 35;

        
        int numberOfMen = (int) ((percentageMen / 100) * totalPopulation);
        int numberOfWomen = totalPopulation - numberOfMen;

        
        int numberOfLiterateMen = (int) ((percentageLiterateMen / 100) * totalPopulation);
        int numberOfLiteratePeople = (int) ((percentageTotalLiteracy / 100) * totalPopulation);

        
        int numberOfLiterateWomen = numberOfLiteratePeople - numberOfLiterateMen;

        
        int numberOfIlliterateMen = numberOfMen - numberOfLiterateMen;
        int numberOfIlliterateWomen = numberOfWomen - numberOfLiterateWomen;

        
        System.out.println("Total population: " + totalPopulation);
        System.out.println("Number of men: " + numberOfMen);
        System.out.println("Number of women: " + numberOfWomen);
        System.out.println("Number of literate men: " + numberOfLiterateMen);
        System.out.println("Number of literate women: " + numberOfLiterateWomen);
        System.out.println("Number of illiterate men: " + numberOfIlliterateMen);
        System.out.println("Number of illiterate women: " + numberOfIlliterateWomen);
    }
}
