#include<iostream>
int main()
{
  // Type your code here
  int a;
  int count=0;
  std::cin>>a;
  
  do {
    a=a/10;
    
    count++;
  }while(a>0);
  std::cout<<count;
}