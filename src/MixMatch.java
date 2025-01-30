public class MixMatch {

    public static void main(String[] args){
        int typeInt = 7;
        char typeChar = 'a';
        short typeShort = 700;
        String typeString = "Hello";
        long typeLong = 120000;
        float typeFloat = 3.99f;
        double typeDouble = 3.14;
        boolean typeBool = true;
        System.out.print(typeInt + " <- Integer, stores whole numbers from -2,147,483,648 to 2,147,483,647\n");
        System.out.print(typeChar + " <- Char, stores a single character/letter or ASCII values\n");
        System.out.print(typeShort + " <- Short, stores whole numbers from -32,768 to 32,767\n");
        System.out.print(typeString + " <- String, stores text, such as Hello. Uses double quotation marks.\n");
        System.out.print(typeLong + " <- Long, stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807\n");
        System.out.print(typeFloat + " <- Float, stores fractional numbers. Sufficient for storing 6 to 7 decimal digits\n");
        System.out.print(typeDouble + " <- Double, stores fractional numbers. Sufficient for storing 15 to 16 decimal digits\n");
        System.out.print(typeBool + " <- Bool, Stores true or false values\n");

    }
}