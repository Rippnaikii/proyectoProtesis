#include "Node.hpp"

Node::Node(int fuerza,int ejes){
    this-> fuerzaFSR = fuerza;
    this-> ejesMPU = ejes;
    this-> next = nullptr;
}

//luego tan los getters
int Node::getFuerza(){
    return this->fuerzaFSR;
}
int Node::getEjes(){
    return this->ejesMPU;
}
Node* Node:: getNext(){
    return this->next;
}
void Node::setFuerza(int fuerza){
    this-> fuerzaFSR = fuerza;
}
void Node::setEjes(int ejes){
    this->ejesMPU = ejes;
}
void Node::setNext(Node* next){
    this->next= next;
}

//Importante el destructor
Node::~Node(){}
