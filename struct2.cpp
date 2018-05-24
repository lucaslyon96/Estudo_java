#include<iostream>
#include<cmath>
#include<stdio.h>
#define MAX 100
using namespace std;
struct Quadrado{
float lado;
};
struct Circulo{
float raio;
};
float area_quadrado(Quadrado);
float area_circulo(Circulo);
float somatorio_quadrado(Quadrado[],int);
float somatorio_circulo(Circulo[],int);
float somatorio_geral(Quadrado[],Circulo[],int,int);
int main(){
    Quadrado a,vetor[MAX];
    Circulo b,vetorb[MAX];
    int n,n1;
    cin>>a.lado;
    cout<< "area ="<<area_quadrado(a)<<endl;
    cin>>b.raio;
	cout<< "area ="<<area_circulo(b)<<endl;
	cin>>n;
	for(int i=0;i<n;i++){
		cin>>vetor[i].lado;
	}
	cout<< "somatorio quadrado ="<<somatorio_quadrado(vetor,n)<<endl;
	cin>>n1;
	for(int i=0;i<n1;i++){
		cin>>vetorb[i].raio;
	}
    cout<< "somatorio circulo ="<<somatorio_circulo(vetorb,n1)<<endl;
	cout<< "somatorio geral ="<<somatorio_geral(vetor,vetorb,n,n1)<<endl;
}
float area_quadrado(Quadrado a){
    return pow(a.lado,2);
}
float area_circulo(Circulo a){
    return 3.1415*pow(a.raio,2);
}
float somatorio_quadrado(Quadrado a[],int n){
    float soma=0;
    for(int i=0;i<n;i++){
        soma+=area_quadrado(a[i]);
    }
    return soma;
}
float somatorio_circulo(Circulo a[],int n){
    float soma=0;
    for(int i=0;i<n;i++){
        soma+=area_circulo(a[i]);
    }
    return soma;
}
float somatorio_geral(Quadrado a[],Circulo b[],int n,int n1){
    float soma=0;
    for(int i=0;i<n;i++){
        soma+=area_quadrado(a[i]);
    }
    for(int i=0;i<n1;i++){
		soma+=area_circulo(b[i]);
    }
    return soma;
}
