final class Money(val value: Int, val currency: String) {
    override def toString: String = "%s %d".format(currency, value)

    override def equals(other: Any): Boolean = 
        if (other.isInstanceOf[Money]) {
            val that = other.asInstanceOf[Money]
            value == that.value && currency == that.currency
        } else false
}