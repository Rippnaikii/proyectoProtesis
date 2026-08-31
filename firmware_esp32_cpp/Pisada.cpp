#include "Pisada.hpp"

Pisada::Pisada(){
    this->inicio = nullptr;
}

bool Pisada::isEmpty(){
    return this->inicio == nullptr;
}

void Pisada::insertarLectura(int fuerza,int ejes){
    Node* nuevoNodo = new Node(fuerza,ejes);

    if (this->isEmpty())
    {
        this->inicio = nuevoNodo;
    }else
    {
        Node* cursor = this-> inicio;
        while (cursor->getNext()!=nullptr)
        {
            cursor = cursor->getNext();
        }
        cursor->setNext(nuevoNodo);
        
    }   
}
int Pisada::getFuerzaMax(){
    if (this->isEmpty())
    {
        return 0;}
    
    int maxFuerza = 0;
    Node* cursor = this->inicio;

    while (cursor!=nullptr)
    {
        if (cursor->getFuerza()>maxFuerza)
        {
            maxFuerza = cursor->getFuerza();
        }
        cursor = cursor->getNext();
        
    }
    return maxFuerza;
}

void Pisada:: clear(){
    Node* cursor = this->inicio;

    while (cursor != nullptr)
    {
        Node* nodoBorrar = cursor;
        cursor = cursor->getNext();
        delete nodoBorrar;
    } 
}

Pisada::~Pisada() {
        this->clear();
    }  