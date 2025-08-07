//static implementation of Linear Queue
#include<stdio.h>
#include<stdlib.h>
#define N 6

int queue[N];
int front= -1, rear= -1;

void enqueue()
{
    int item;
    printf("\n Enter data to be insert in queue: ");
    scanf("%d",&item);
    
    if(rear == N-1)
    {
        printf("\nQueue Overflow!");
    }
    else if(rear == -1)
    {
        front = 0;
        rear = 0;
        queue[rear] = item;
    }
    else
    {
        rear++;
        queue[rear] = item;
    }
}

void dequeue()
{
    int data;
    if(front == -1)
    {
        printf("\nQueue underflow");
    }
    else if(front == rear)
    {
        printf("\nDeleted item = %d",queue);
        front = rear -1;
    }
    else
    {
        data = queue[front];
        front = front+1;
        printf("\nDeleted item =%d",data);
    }
}

void display()
{
    int i;
    if(front == -1)
    {
        printf("\nQueue is empty, nothing to display");
    }
    else
    {
        for(i=front; i<=rear; i++)
        {
            printf("\nQueue[%d]=%d",i,queue[i]);
        }
    }
}

int main()
{
    int ch;
    do
    {
        printf("\n Enter choice: 1=Enqueue, 2=Dequeue, 3=Display, 4=Exit:");
        scanf("%d",&ch);
        
        switch(ch)
        {
            case 1:
                enqueue();
                break;
            case 2:
                dequeue();
                break;
            case 3:
                display();
                break;
            case 4:
                exit(0);
                break;
            default:
                printf("\nInvalid choice, choose 1-4");
        }
        
    }while(ch!=0);
    
}
