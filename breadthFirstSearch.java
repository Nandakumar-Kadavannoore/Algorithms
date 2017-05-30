/* BFS in graph */
// Make usage of Queue Data Structure


#include<stdio.h>
#include<stdlib.h>
#include<conio.h>

int x[56][56],n,nodes,v[56];
int z[56],rear=0,front=0;

int deque()
 {
  int temp =z[front];
  front++;
  return(temp);
 }

void enque(int start)
 {
   z[rear]=start;
   rear++; 
 }

void bfs(int start)
 {
  int i,j;
  v[start]=1;
  enque(start);
  for(j=1;j<=nodes;j++)
  {
  for(i=1;i<=nodes;i++)
   { 
      if(x[start][i] != 0 && v[i] != 1)
	      { enque(i);
           v[i]=1; 
        }
   }
   start=deque();
   printf(" %d",start);
  }
}

void main()
  { int a,b,wt,start;
  
    printf("\nEnter number of nodes:: ");
    scanf("%d",&nodes);
    
    printf("\nEnter number of vertices:: ");
    scanf("%d",&n);
    
    for(j=1;j<=n;j++)
	   { 
         printf("\nEnter %d connections and its weight:: ",j);
	       scanf("%d%d%d",&a,&b,&wt); // Scanning for connection ( eg: 3 -> 2 )
	       x[a][b]=x[b][a]=wt; }
         
   printf("\nThe adjancence matrix:: ");
   
   for(int i=1;i<=n;i++)           // displaying connecting matrix
   { for(int j=1;j<=n;j++)
     { printf(" %d",x[i][j]); }
        printf("\n");
   }
   
   printf("\nEnter starting node:: ");
   scanf("%d",&start);
   
   bfs(start); // calling bfs function
   getch();
  }
