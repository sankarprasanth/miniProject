
class min
  {
    static int seed1,seed2;
    BToD o=new BToD();
    String cs1="",cs2,cs3,cs4,cs5,cs6,cs7,cs8,cs9,cs10;
    static int a[]={1,2,3,4,5,6,7,8,9,10};
   static int f1[]=new int[10];
   static int s1[]=new int[32];
   static int s2[]=new int[32];
   static int c1[]=new int[32];
   static int c2[]=new int[32];
   static int c3[]=new int[32];
   static int c4[]=new int[32];
   static int c5[]=new int[32];
   static int c6[]=new int[32];
    static int c7[]=new int[32];
   static int c8[]=new int[32];
   static int c9[]=new int[32];
   static int c10[]=new int[32];
   static int c11[]=new int[32];
   static int c12[]=new int[32];
    void generation(int a)
   {
       int i,m=31;
       int h=32;
       while(a>0&&h>=0)
       {  
           int j=a%2;
           a=a/2;
           s1[m]=j;
           m--;  
       }
       for(i=0;i<32;i++)
       System.out.print(s1[i]);
       System.out.println("");
    }
    void generation2(int a)
   {
       int i,m=31;
       int h=32;
       while(a>0&&h>=0)
       {  
           int j=a%2;
           a=a/2;
           s2[m]=j;
           m--;  
       }
       for(i=0;i<32;i++)
       System.out.print(s2[i]);
       System.out.println("");
    }
    static void sort(int f[],int n)
    {
        int i,j,t,l;
        for(i=0;i<n-1;i++)
        {
            for(j=0;j<(n-1-i);j++)
            {
                if(f[j]<f[j+1])
                {
                    t=f[j];
                    l=a[j];
                    f[j]=f[j+1];
                    a[j]=a[j+1];
                    f[j+1]=t;
                    a[j+1]=l;
                }
            }
        }
    }
   
    void crossover2()
    {
        int y=10,y1=15,y3=5,y4=10,i;
        for(i=0;i<y;i++)
        {
            c7[i]=s1[i];
        }
        for(i=y;i<y1;i++)
        {
            c7[i]=s2[i];
        }
        for(i=y1;i<32;i++)
        {
             c7[i]=s1[i];
        }
        for(i=0;i<y;i++)
        {
            c8[i]=s2[i];
        }
         for(i=y;i<y1;i++)
        {
            c8[i]=s1[i];
        }
         for(i=y1;i<32;i++)
        {
             c8[i]=s2[i];
        }
        System.out.println("");
        System.out.print("two bit crossover at position 20 and 15:");
        for(i=0;i<32;i++)
        System.out.print(c7[i]);
        System.out.println("");
        for(i=0;i<32;i++)
        System.out.print(c8[i]);
        for(i=0;i<y3;i++)
        {
            c9[i]=s1[i];
        }
        for(i=y3;i<y4;i++)
        {
            c9[i]=s2[i];
        }
        for(i=y4;i<32;i++)
        {
             c9[i]=s1[i];
        }
        for(i=0;i<y3;i++)
        {
            c10[i]=s2[i];
        }
         for(i=y3;i<y4;i++)
        {
            c10[i]=s1[i];
        }
         for(i=y4;i<32;i++)
        {
             c10[i]=s2[i];
        }
        System.out.println("");
        System.out.print("two bit crossover at position 5 and 10:");
        for(i=0;i<32;i++)
        System.out.print(c9[i]);
        System.out.println("");
        for(i=0;i<32;i++)
        System.out.print(c10[i]);
    }
    void crossover3()
    {
        int y=05,y1=10,y2=15,y3=10,i;
        for(i=0;i<y;i++)
        {
            c11[i]=s1[i];
        }
        for(i=y;i<y1;i++)
        {
            c11[i]=s2[i];
        }
        for(i=y1;i<y2;i++)
        {
             c11[i]=s1[i];
        }
        for(i=y2;i<32;i++)
        {
            c11[i]=s2[i];
        }
        for(i=0;i<y;i++)
        {
            c12[i]=s2[i];
        }
        for(i=y;i<y1;i++)
        {
            c12[i]=s1[i];
        }
        for(i=y1;i<y2;i++)
        {
             c12[i]=s2[i];
        }
        for(i=y2;i<32;i++)
        {
            c12[i]=s1[i];
        }
        
        System.out.println("");
        System.out.print("multi bit cross over");
        for(i=0;i<32;i++)
        System.out.print(c11[i]);
        System.out.println("");
        for(i=0;i<32;i++)
        System.out.print(c12[i]);
    }
     public static void main(String args[])
    {
        int i;
        double answer=Math.random();
        answer=answer*10000000;
        seed1=(int)answer;
        System.out.println(answer);
        System.out.println(seed1);
        //binary p=new binary();
        min p1=new min();
        cross1 p=new cross1();
        System.out.print("The binary form of seed1:");
        //p.generation(seed1);
        p1.generation(seed1);
        double answer2=Math.random();
        answer2=answer2*1000000000;
        seed2=(int)answer2;
        System.out.println(seed2);
        System.out.print("The binary form of seed2:");
        p1.generation2(seed2);
        p.crossover1();
        p1.crossover2();
        p1.crossover3();
        mutation m=new mutation();
        m.mut();
        ftest f=new ftest();
        f.frequency(c1,0);
        f.frequency(c2,1);
        f.frequency(c3,2);
        f.frequency(c4,3);
        f.frequency(c5,4);
        f.frequency(c6,5);
        f.frequency(c7,6);
        f.frequency(c8,7);
        f.frequency(c9,8);
        f.frequency(c10,9);
        sort(f1,10);
        encrypt e=new encrypt();
         for(i=0;i<10;i++)
        System.out.print(f1[i]);
        System.out.println("");
        for(i=0;i<10;i++)
        System.out.print(a[i]);
        if(a[0]==0)
        {
            System.out.println("Best fit key is c0");
        }
        else if(a[0]==1)
        {
            
            System.out.println("Best fit key is c1");
            e.encry(c1);
        }
        else if(a[0]==2)
        {
            System.out.println("Best fit key is c2");
            e.encry(c2);
        }
        else if(a[0]==3)
        {
            System.out.println("Best fit key is c3");
            e.encry(c3);
        }
        else if(a[0]==4)
        {
            System.out.println("Best fit key is c4");
            e.encry(c4);
        }
        else if(a[0]==5)
        {
            System.out.println("Best fit key is c5");
            e.encry(c5);
        }
        else if(a[0]==6)
        {
            System.out.println("Best fit key is c6");
            e.encry(c6);
        }
        else if(a[0]==7)
        {
            System.out.println("Best fit key is c7");
            e.encry(c7);
        }
        else if(a[0]==8)
        {
            System.out.println("Best fit key is c8");
            e.encry(c8);
        }
            else if(a[0]==9)
            {
            System.out.println("Best fit key is c9");
            e.encry(c9);
        }
            else
            System.out.println("");
    }
   
   
 }