import java.util.*;
class encrypt
{
    String s1;
    void encry(int a[])
    {
        System.out.println("enter the text to be encrypted");
        Scanner in=new Scanner(System.in);
        s1=in.nextLine();
        StringBuilder s2=new StringBuilder(s1);
        for(int i=0;i<s1.length();i++)
        {
           if(a[i%32]==0)
           {
               if(s1.charAt(i)=='a')
               s2.setCharAt(i,'m');
               if(s1.charAt(i)=='b')
               s2.setCharAt(i,'z');
               if(s1.charAt(i)=='c')
               s2.setCharAt(i,'n');
               if(s1.charAt(i)=='d')
               s2.setCharAt(i,'y');
               if(s1.charAt(i)=='e')
               s2.setCharAt(i,'o');
               if(s1.charAt(i)=='f')
               s2.setCharAt(i,'x');
               if(s1.charAt(i)=='g')
               s2.setCharAt(i,'p');
               if(s1.charAt(i)=='h')
               s2.setCharAt(i,'w');
               if(s1.charAt(i)=='i')
               s2.setCharAt(i,'q');
               if(s1.charAt(i)=='j')
               s2.setCharAt(i,'v');
               if(s1.charAt(i)=='k')
               s2.setCharAt(i,'r');
               if(s1.charAt(i)=='l')
               s2.setCharAt(i,'u');
               if(s1.charAt(i)=='s')
               s2.setCharAt(i,'t');
           }
        }
        s2.toString();
        System.out.println("encrypted message is"+s2);
         for(int i=0;i<s2.length();i++)
        {
           if(a[i%32]==0)
           {
               if(s2.charAt(i)=='m')
               s2.setCharAt(i,'a');
               if(s2.charAt(i)=='z')
               s2.setCharAt(i,'b');
               if(s2.charAt(i)=='n')
               s2.setCharAt(i,'c');
               if(s2.charAt(i)=='y')
               s2.setCharAt(i,'d');
               if(s2.charAt(i)=='o')
               s2.setCharAt(i,'e');
               if(s2.charAt(i)=='x')
               s2.setCharAt(i,'f');
               if(s2.charAt(i)=='p')
               s2.setCharAt(i,'g');
               if(s2.charAt(i)=='w')
               s2.setCharAt(i,'h');
               if(s2.charAt(i)=='q')
               s2.setCharAt(i,'i');
               if(s2.charAt(i)=='v')
               s2.setCharAt(i,'j');
               if(s2.charAt(i)=='r')
               s2.setCharAt(i,'k');
               if(s2.charAt(i)=='u')
               s2.setCharAt(i,'l');
               if(s2.charAt(i)=='t')
               s2.setCharAt(i,'s');
           }
        }
        System.out.println("decrypted message is"+s1);
    }
}