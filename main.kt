object Math {
    fun abs(value: Int): Int{
        var tempValue = 0
        if (value < 0) {
            tempValue = -value
        } else if (value >= 0) {
            tempValue = value
        }
        return tempValue
    }
    fun abs(value2: Double): Double{
        var tempValue = 0.0
        if (value2 < 0.0) {
            tempValue = -value2
        } else if (value2 >= 0.0) {
            tempValue = value2
        }
        return tempValue
    }
}
