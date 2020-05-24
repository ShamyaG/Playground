#include<iostream>
#include<bits/stdc++.h>
using namespace std;
int main()
{
  //Type your code here.
  int age;
  float st,price;
  std::cin>>age>>st;
  if(st>=13.30)
   { if(age>=13)
    price=5.00;
   else
     price=2.00;
   std::cout<<"$"<<fixed<<setprecision(2)<<price;
  }
  else
    { if(age>=13)
    price=8.00;
   else
    price=4.00;
   std::cout<<"$"<<fixed<<setprecision(2)<<price;
    }
    
}