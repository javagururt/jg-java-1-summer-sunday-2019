package com.javaguru.lessons.lesson10.generic;

class Pair<L, R> {

    L left;
    R right;

    public L getLeft() {
        return left;
    }

    public R getRight() {
        return right;
    }

    public void setLeft(L left) {
        this.left = left;
    }

    public void setRight(R right) {
        this.right = right;
    }
}
