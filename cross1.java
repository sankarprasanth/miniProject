class cross1
{ 
void crossover1()
    {
        String cs1="",cs2="";;
       min m=new min();
       BToD o=new BToD();
        int y=20,y1=15,y2=5,i;
        for(i=0;i<y;i++)
        {
            m.c1[i]=m.s1[i];
        }
        for(i=y;i<32;i++)
        {
            m.c1[i]=m.s2[i];
        }
        for(i=0;i<y;i++)
        {
            m.c2[i]=m.s2[i];
        }
         for(i=y;i<32;i++)
        {
            m.c2[i]=m.s1[i];
        }
        System.out.print("one bit crossover at position 20:");
        for(i=0;i<32;i++)
        {
        System.out.print(m.c1[i]);
        cs1=cs1+m.c1[i];
       }
       o.decimal(cs1);
        for(i=0;i<32;i++)
        {
        System.out.print(m.c2[i]);
        cs2=cs2+m.c2[i];
       }
         o.decimal(cs2);
         for(i=0;i<y1;i++)
        {
            m.c3[i]=m.s1[i];
        }
        for(i=y1;i<32;i++)
        {
            m.c3[i]=m.s2[i];
        }
        for(i=0;i<y1;i++)
        {
            m.c4[i]=m.s2[i];
        }
         for(i=y1;i<32;i++)
        {
            m.c4[i]=m.s1[i];
        }
        System.out.println("");
        System.out.print("one bit crossover at position 15:");
        for(i=0;i<32;i++)
        System.out.print(m.c3[i]);
        System.out.println("");
        for(i=0;i<32;i++)
        System.out.print(m.c4[i]);
         for(i=0;i<y2;i++)
        {
            m.c5[i]=m.s1[i];
        }
        for(i=y2;i<32;i++)
        {
            m.c5[i]=m.s2[i];
        }
        for(i=0;i<y2;i++)
        {
            m.c6[i]=m.s2[i];
        }
         for(i=y2;i<32;i++)
        {
            m.c6[i]=m.s1[i];
        }
        System.out.println("");
        System.out.print("one bit crossover at position 5:");
        for(i=0;i<32;i++)
        System.out.print(m.c5[i]);
        System.out.println("");
        for(i=0;i<32;i++)
        System.out.print(m.c6[i]);
    }
}