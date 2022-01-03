package NIX;

public class StringTask {
    public void stroka (String stroka, String oldSt, String newSt){
        System.out.println(stroka.replace(oldSt, newSt));
    }
    public static void main(String[] args) {
        //Task 1
        String s = "Hello. My name is Alina";
        String s1 = s.toUpperCase();
        String last = s.substring(s.length()-1);
        System.out.println(last);
        String first = s.substring(0,1);
        System.out.println(first);
        String middle = s.substring((s.length()+1)/2, (s.length()+1)/2+1);
        System.out.println(middle);
        char a1;
        char a2;
        for (int i=0; i<s.length(); i++){
            a1=s.charAt(i);
            a2=s1.charAt(i);
            if (a1 != '.' && a1 != ' ' && a1==a2){
                System.out.println();
                System.out.print(a1);
                continue;
            }
            System.out.print(a1);
        }
        System.out.println();
        System.out.println("------->>>>>>");
        //Task 2
        StringTask task2 = new StringTask();
        task2.stroka("My name is Alina","Alina","Jora");
        //Task 3
        String s3 = "I am 28 years old";
        char b1;
        char b2;
        for (int i=0; i<s3.length(); i++){
            b1=s3.charAt(i);
            b2=s3.charAt(i);
            if (b1==' ' && b1==b2){
                System.out.println();
                System.out.print(b1);
                continue;
            }
            System.out.print(b1);
        }
        System.out.println();
    }
}
