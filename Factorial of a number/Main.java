#include<iostream>
int main(){
  // Type your code here
  int n,i,f;
  std::cin>>n;
  
  f=1;
  for(i=1;i<=n;i++)
  {
    f=f*i;
  }
  
  std::cout<<f;
 
}