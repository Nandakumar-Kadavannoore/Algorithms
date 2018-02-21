/* To implement radix sort */
#include<stdio.h>
#include<stdlib.h>

struct linked
{
	int data;
	struct linked *next;
};
typedef struct linked list;

list *h[10];

list* create(list *head,int data)
                     {
                     	list *temp=(list*)malloc(sizeof(list));
                     	temp->next=0;
                     	temp->data=data;
                     	
                     	if(head==0)
                     	  head=temp;
                     	else if(data<head->data)
						             {
						   	           temp->next=head;
						   	           head=temp;
						             }  
						          else
						             {
						    	         list *c=head;
						    	         while(c!=0||c->next->data<data)
						    	          c=c->next;
						    	 
						    	         c->next=temp;
								           temp->next=c->next; 
						             }   
						return head;    
                     }

void display()
                {
                   list *p;
	               for(int i=0 ; i<10 ; i++)
	                 {
		                  p=h[i];
		                while(p!=0)
		                 {
		  	                printf(" %d",p->data);
		  	                 p=p->next;
		                 }
	                 } 
                }

int main()
            {
            	int data,choice;
            	while(1)
            	{
            		printf("\nMain_Menu\n1.Insert\n2.Display\n3.Quit\nEnter ur choice::");
            		scanf("%d",&choice);
            		switch(choice)
            		{
            			case 1: printf("\nEnter data:: ");
            			        scanf("%d",&data);
            			        h[data/10]=create(h[data/10],data);
            			        break;
            			case 2: display();
						        break;
						case 3: exit(0);		        
            		}
            	}
              return 0;	
            }
