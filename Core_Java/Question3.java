// ===========================================================================================================================
// 3.Create a thread named  fetch Data using thread  extend methodFetch data should  implement sleep method  with 5000ms 
// timeCreate a thread named  processData  using  runnable  interface Make sure processData  starts its execution only after
// fetchData thread has  completed its execution with the timeout of 10000ms
// ===========================================================================================================================

//Fetchdata thread
class FetchData extends Thread{

    @Override
    public void run(){
        try{
            //sleeping for 5 seconds
            Thread.sleep(5000);
            System.out.println("Thread 1");
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

}


//Processdata thread
class ProcessData implements Runnable{

    @Override
    public void run(){
        try{
            // sleeping for 10 secs
            Thread.sleep(10000);
            System.out.println("Thread 2");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

}

class Question3 {
    public static void main(String args[]) throws InterruptedException{
        FetchData f = new FetchData();
        ProcessData p = new ProcessData();
        Thread thread = new Thread(p);  
        f.start();
        f.join();
        thread.start();     
    }
}