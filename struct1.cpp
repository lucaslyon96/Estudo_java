#include<iostream>
#include<cmath>
using namespace std;
struct Complexo{
 float real,imag;

};
Complexo soma(Complexo a, Complexo b);
Complexo modulo(Complexo i);
void imprima (Complexo i);
int main(){
	Complexo a,b,c;
	cin>>a.real>>a.imag;
	imprima(a);
	cin>>b.real>>b.imag;
	c=soma(a,b);
	imprima(c);
	c=modulo(a);
    imprima(c);
}
void imprima (Complexo i){
	cout<<i.real<<" + "<<i.imag<<"i"<<endl;
}
Complexo soma(Complexo a, Complexo b){
	Complexo c;
	c.real=a.real+b.real;
	c.imag=a.imag+b.imag;
	return c;
}
Complexo modulo(Complexo i){
	Complexo c;
	c.real=pow(i.real,2);
	c.imag=pow(i.imag,2);
	return c;
}

