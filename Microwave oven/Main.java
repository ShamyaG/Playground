#include<iostream>
#include<bits/stdc++.h>
using namespace std;
int main()
{
  //Type your code here.
  int item_no;
  float heat;
  std::cin>>item_no>>heat;
  if(item_no==2)
  {   heat=heat+(heat*50/100);
    std::cout<<fixed<<setprecision(2)<<heat;
}
  else if(item_no==3)
  {  heat=2*heat;
  std::cout<<fixed<<setprecision(2)<<heat;
  }
  else
    std::cout<<"Number of items is more";
  }