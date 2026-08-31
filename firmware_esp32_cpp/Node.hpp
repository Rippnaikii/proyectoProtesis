#pragma once

class Node
{
private:
    int fuerzaFSR;
    int ejesMPU;
    Node* next; // puntero sgte nodo en la memoria 
public:
    Node(int fuerza,int ejes);
    int getFuerza();
    int getEjes();
    Node* getNext();
    void setFuerza(int fuerza);
    void setEjes(int ejes);
    void setNext(Node* next);
    ~Node(); //eliminar el nodo (destructor)
};

