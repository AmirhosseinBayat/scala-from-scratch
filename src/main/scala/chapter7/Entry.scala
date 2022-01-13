final case class Entry[A, B](key: A, value: B){
    def swap(k: A, v: B): Entry[A, B] = {
        Entry(k, v)
    }
}