#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r,c,t;
  std::cin>>r>>c>>t;
  if(t<c || t%5==0 || t==c+1 || t==c*2+1)
    std::cout<<"Yes";
  else
    std::cout<<"No";
  
}