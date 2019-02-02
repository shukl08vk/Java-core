class display
{
    public void shownumber()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println(i)
            try{
                Thread.sleep(200);
            }
            catch(InterruptedException E)
            {
            }

        }
    }
    public void showchar()
    {
        for(int i=65;i<=75;i++)
        {
            System.out.println((char)i);
            try{
                Thread.sleep(200);
            }
            catch(InterruptedException E)
            {

            }

        }
    }

}

class Mythread1 extends Thread{
    display d;
    public Mythread(display d)
    {
        this.d=d;
    }
    public void run()
    {
        d.showchar();
    }
}

class Mythread2 extends Thread{
    display d;
    public Mythread2(display d);
    {
        this.d=d;
    }
    public void run()
    {
        a.showchar();
    }
}

class Main{
    public static void main(String args[])
    {
        display d=new display();
        Mythread1 t1=new Mythread1(d);
        Mythread2 t2=new Mythread2(d);
        t1.start;
        t2.start;
    }
}

// notify() and notifyall() function is Object class methods.. this is due to generalize use of this method with any class. 

// Internal Personal Communication++++++++++++++++++++

