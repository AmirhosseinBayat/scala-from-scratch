object Generics {
    def forBoth[A](x: A, y: A, cond: A => Boolean): Boolean = 
        cond(x) && cond(y)

    // polymorphic version
    def forBoth2[A]: (A, A, A => Boolean) => Boolean =
        (x, y, cond) => cond(x) && cond(y)
}