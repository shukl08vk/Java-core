//Multiple thread trying to operate on java object simu. then it raise problem of data incunsistency.
//synchronised block or synchronized metthod
//deadlock condition can be raise when synchronize block is used.
//class class lock;
//How to implement when common block
//synchronized block is more preferable++++++++++++++++++++++++premitive value cannot be passed with synchronized.
// lock in sync block is perform under jvm.
// ,ock is implemented in class or block..hold until the whole block is executed .
//demon thread ------garbage collector thread is daemon thread.
// low proirity thread is daemon thread
//set daemon()-- we ca make normal thread to daemon thread.
// ueser defined thread are daemon thread.
// Evweery object in java contains a lock.



class Display{

    // use "sychronized" here for object
    // use "static Synchronized" here for class
     static synchronized
    public void show(String slave)
    {
            // to use "Synchronized" efficiently
            //Synchronized(this){

        for(int i=0;i<10;i++)
        {
            System.out.println("Hello\n");
            try{
                Thread.sleep(200);

            }
            catch(InterruptedException E)
            {

            }
            System.out.println(slave);
        }
        //}
    }
}

class Mythread extends Thread{
    Display d;
    String name;
    public Mythread(Display d,String name)
    {this.d=d;
        this.name=name;

    }
    public void run()
    {
        d.show(name);
    }
}

class Threadtest{
    public static void main(String arg[])                      
    {   Display d2=new Display();
        Display d1=new Display();
        Mythread t1=new Mythread(d1,"Abc");
        Mythread t2=new Mythread(d2,"XYZ");
        t1.start();
        t2.start();                      // 3 THREAD ARE AVAILABLE IN THIS PROGRAM 2 FROM THE OBJECTS AND 1 FROM THE MAIN;
    }
}

// WHEN MORE THAN 2 THREAD ARE TRY TO USE SAME OBJECT THEN WE HAVE TO USE SYNCHRONIZED .. BUT WHNE DIFFERENT OBJECT IS USED THEN NO NEED OF SYNC* BLOCK
// bydefault every class contain a lock.
// to represent class synchronized we have to use ----- static Synchronized
// block increase the efficiency of 
// method decrease the efficiency

// Anoher way to implement static block++++++++++++++++
/*Synchronized(this)
{

}

or 

Synchronized(classname.class)
{

}*/
