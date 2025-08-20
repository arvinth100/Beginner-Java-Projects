Public class Queue
{
int size=5;
int items[]=Newint(size);
int front,rear;
Queue()
{
front=-1;
rear=-1;
}
Boolean is full()
{
if(front==0&&rear==size-1)
{
return true;
}
return false;
}
Boolean is empty()
{
if(front==-1)
{
return true;
}
else
{
return false;
}
void enQueue(int element)
{
if(isfull())
{
System.out.println("Queue is full");
}
else
{
if(front==-1)
{
front=0;
}
rear++;
items[rear]=element;
System.out.println("insert"+element);
}
}
int deQueue
{
int element;
}
if(isempty())
{
System.out.println("Queue is empty");
return(-1);
}
else
{
element=items[front];
if(front>=rear)
{
front=-1;
rear=-1;
}
else
{
front++;
}
System.out.println(element+"deleted");
return(element);
}
}
void display()
{
int i;
if(isempty())
{
System.out.println("Empty Queue");
}
else
{
System.out.print("\nFront index->"+front);
System.out.println("items->1);
for(i=front;i<=rear;i++)
System.out.print(items[i]+"");
System.out.println("\n rear index->"+rear);
}
}
public static void main(string[]args)
{
Queue q=New Queue();
q.deQueue();
for(int i=1;i<6;i++)
{
q.enQueue(1);
}
q.enQueue(6);
q.display();
q.deQueue();
q.display();
}
}