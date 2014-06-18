package lib.InputNumbers;
import java.util.*;

public class Input{

    // �����,�������� ��������� ����� �� 0 ,�� max
    public static int random( int max) {
        if (max<0) {return 0;}
        else {return  (int) (Math.random()*(max+1)); }
    }

    // �����, �������� ��������� ����� �� min �� max
    public static int random( int min, int max) {
        int z=max-min;
        return  (int) (min+ Math.random()*(z+1));
    }

    // �����,�������� ��������� ����� �� 0 ,�� max
    public static double random( double max) {
        if (max<0) {return 0;}
        else {return (Math.random()*(max)); }
    }

    // �����, �������� ��������� ����� �� min �� max
    public static double random( double min, double max) {
        double z=max-min;
        return  (min+ Math.random()*(z));
    }

    public static double random(double min, double max, int count) {
        double z = max - min;
        return Numbers.round(min+Math.random() * z, count);
    }

    /********************************************************************readInt*********************************************************************/
    /********************************************************************readInt*********************************************************************/
    /********************************************************************readInt*********************************************************************/

// ������ � ������� int
// public static int  readInt () {
//	do { Scanner consol = new Scanner (System. in);
//			System.out.print (" : ");
//			if (consol.hasNextInt()) {
//						int number = consol.nextInt();
//						return number;
//			}else {
//						System. out. println("������ �����!");
//
//			}
//	}while (true);
//}

    public static int readInt() {
        return Input.readInt("");
    }

    public static int  readInt (String s) {
        do { Scanner consol = new Scanner (System. in);
            System.out.print (s+" : ");
            if (consol.hasNextInt()) {
                int number = consol.nextInt();
                return number;
            }else {
                System. out. println("������ �����!");

            }
        }while (true);
    }

// ������ � ������� int �������������
// public static int  readInt (int min,int max) {
//	do { Scanner consol = new Scanner (System. in);
//			System.out.print (" : ");
//			if (consol.hasNextInt()) {
//						int number = consol.nextInt();
//						if (min<=number && number<=max) return number;
//						else System. out. println("����� �� ����������� ["+min+":"+max+"]");
//			}else {
//						System. out. println("������ �����!");
//
//			}
//	}while (true);
//}

    public static int  readInt (int min,int max){
        System.out.println (" [ " + min + " : " + max + " ] ");
        int number = readInt();
        if (min <= number && number<=max) return number;
        else {
            System.out.println ("The number does not belong [" + min + " : " + max + "]");
            return readInt(min, max);
        }
    }

    public static int readInt (String s, int min, int max) {
        System.out.println (s);
        return readInt(min, max);
    }

    /********************************************************************readDouble*********************************************************************/
    /********************************************************************readDouble*********************************************************************/
    /********************************************************************readDouble*********************************************************************/

// ������ � ������� double
    public static double  readDouble () {
        do { Scanner consol = new Scanner (System. in);
            System.out.print (" : ");
            if (consol.hasNextDouble()) {
                double number = consol.nextDouble();
                return number;
            }else {
                System. out. println("������ �����!");

            }
        }while (true);
    }

    // ������ � ������� double �������������
    public static double  readDouble (double min, double max) {
        do { Scanner consol = new Scanner (System. in);
            System.out.print (" : ");
            if (consol.hasNextDouble()) {
                double number = consol.nextDouble();
                if (min<number && number>max) return number;
                else System. out. println("����� �� ����������� ["+min+":"+max+"]");
            }else {
                System. out. println("������ �����!");

            }
        }while (true);
    }

    public static double readDouble (String s, double min, double max) {
        System.out.println (s);
        return readDouble(min, max);
    }

    public static String readLine () {
        Scanner console = new Scanner (System. in);
        do{
            System.out.print (" : ");
            if (console.hasNextLine()) {
                String line = console.nextLine();
                if (! line.equals("")) return line;
                else System.out.println ("empty string!");
            }else {
                System.out.println ("Input error");
            }
        }while(true);
    }
}




/*git bash (git pro book)���������� double , docx 3 , sredneje arif , jelka , kreps*/



