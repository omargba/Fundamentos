/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nodoarbolbinario;

/**
 *
 * @author OMAR
 */
public class NodoArbolBinario<T extends Comparable<T>> {
    
    private T element;
    private NodoArbolBinario<T> parent;
    private NodoArbolBinario<T> left;
    private NodoArbolBinario<T> right;

    public NodoArbolBinario(T element) {
        this.element = element;
    }

    public NodoArbolBinario(T element, NodoArbolBinario<T> parent, NodoArbolBinario<T> left, NodoArbolBinario<T> right) {
        this.element = element;
        this.parent = parent;
        this.left = left;
        this.right = right;
    }

    public NodoArbolBinario(T element, NodoArbolBinario<T> parent) {
        this.element = element;
        this.parent = parent;
    }

    public NodoArbolBinario(T element, NodoArbolBinario<T> left, NodoArbolBinario<T> right) {
        this.element = element;
        this.left = left;
        this.right = right;
    }
    
    
    
    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public NodoArbolBinario<T> getParent() {
        return parent;
    }

    public void setParent(NodoArbolBinario<T> parent) {
        this.parent = parent;
    }

    public NodoArbolBinario<T> getLeft() {
        return left;
    }

    public void setLeft(NodoArbolBinario<T> left) {
        this.left = left;
    }

    public NodoArbolBinario<T> getRight() {
        return right;
    }

    public void setRight(NodoArbolBinario<T> right) {
        this.right = right;
    }

}
