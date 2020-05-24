#include<iostream>
int main()
{
  int a,b,c,d,i;
  std::cin>>a>>b>>c;
  if((a<b&&a>c)||(a>b&&a<c))
   d=a;
  else if((b<a&&b>c)||(b>a&&b<c))
    d=b;
  else
    d=c;
  if(d<a)
    i=a;
  else if(d<b)
    i=b;
  else
    i=c;
while(i!=0)
{
if(a%i==0 && b%i==0 && c%i==0)
  break;
  i--;
}
std::cout<<"The treasure is in box which has number "<<d<<"\n";
std::cout<<"The code to open the box is "<<i;

}