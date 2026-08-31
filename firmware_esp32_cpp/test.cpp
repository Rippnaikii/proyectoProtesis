#include <iostream>
#include "Node.hpp"
using namespace std;

int main() {
    Node* capt1 = new Node(150,42);
    Node* capt2 = new Node(420,12);
    Node* capt3 = new Node(60,8);

    //Enlazamos los nodos, manualmente
    capt1->setNext(capt2);
    capt2->setNext(capt3);

    Node* cursor = capt1;
    int miliSeg = 1;

    cout<<"Seguimiento de marcha.."<<endl;

    while (cursor!= nullptr)
    {
        cout<< "Lectura: "<< miliSeg << "  Fuerza: "<< cursor->getFuerza() << " mpu: "<< cursor->getEjes()<< endl;

        cursor = cursor->getNext(); // Avanzamos al siguiente nodo
        miliSeg++;
    }

    delete capt1;
    delete capt2;
    delete capt3;

    return 0;
    
}