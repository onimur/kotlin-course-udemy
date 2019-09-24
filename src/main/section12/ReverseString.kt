package section12

fun reverseUsingSB (str:String): String {
     return StringBuilder(str).reverse().toString()
}

fun reverseUsingLoop (str:String): String {
val sbStr = StringBuilder()
    var i = str.length - 1

    while (i >= 0){
        sbStr.append(str[i])
        i--
    }
    return sbStr.toString()
}
