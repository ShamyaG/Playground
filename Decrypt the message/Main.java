#include<iostream>
int main()
{
  int a,b;
  std::cin>>a>>b;
  int c= a+b;
  int num =c;
  int i,sum,div;
  for(i=1;i<num;i++)
  {
    div=num%i;
   if(div==0)
     sum=sum+i;
  }
  if(sum==num)
    std::cout<<"They can read the message";
  else
    std::cout<<"They can't read the message";
  return 0;
}