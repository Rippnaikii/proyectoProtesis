#pragma once 
#include "Node.hpp"
class Pisada
{
private:
    Node* inicio;
public:
    Pisada();

    bool isEmpty();
    void insertarLectura(int fuerza,int ejes);
    void clear();
    int getFuerzaMax();

    ~Pisada();
};
