// ======================================================================================
// 4. Create a resource called message 
//     ○ Message will have text as the field and isEmpty as the condition○ns. 
//     ○ It has two synchronized functions read and write
// ● Create a writer thread that writes resource
// ● Create a reader thread that reads resource
// ======================================================================================


// Message resource
class Message{

    private String text;
    private boolean isEmpty = true;

    public synchronized String read(){
        while(this.isEmpty){
            try{
                // If text is empty wait
                wait();
            }
            catch (InterruptedException e){
                System.out.println(e);
            }
        }
        this.isEmpty = true;
        notifyAll();
        return this.text;
    }

    public synchronized void write(String res){
        while(!this.isEmpty){
            try{
                // If text is not empty wait for reader to read message till writing another message
                wait();
            }
            catch (InterruptedException e){
                System.out.println(e);
            }
        }
        this.isEmpty=false;
        this.text = res;
        notifyAll();
    }
    
}

// Writer thread
class Writer extends Thread{

    private Message msgObj;

    Writer(Message msg){
		this.msgObj = msg;
	}

    public void run(){
        try{
            // calling write method of message class
            msgObj.write("Hey!");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

}

// Reader thread
class Reader extends Thread{

    private Message msgObj;

    Reader(Message msg){
		this.msgObj = msg;
	}

    public void run(){
        try{
            // calling read method of message class
            String msg = msgObj.read();
            System.out.println(msg);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

}


class Question4{

    public static void main(String args[]){

        Message msgObj = new Message();
        new Thread(new Reader(msgObj)).start();
        new Thread(new Writer(msgObj)).start();

    }

}