#include<iostream>
#include<cstring>
using namespace std;
int main()
{
  //Type your code here.
  int rail;
  char door[20];
  std::cin>>door>>rail;
  if((strcmp(door,"rear")==0))
 {
   if(rail==1)
   {
     std::cout<<"Right Handed";
   }
   else
   {
     std::cout<<"Left Handed";
   }
 }
  else if((strcmp(door,"front")==0) )
 {
   if(rail==1)
   {
     std::cout<<"Left Handed";
   }
   else
   {
     std::cout<<"Right Handed";
   }
  }
}