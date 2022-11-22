
//StringBuffer或StringBuilder自带reverse方法
private static String reverse(String str) {
    if (str == null) {
        return null;
    }
    return new StringBuffer(str).reverse().toString();
}

// String的charAt方法
private static String reverse1(String str) {
    if (str == null) {
        return null;
    }
    String result = "";
    for (int i = str.length() - 1; i >= 0; i--) {
        result = result + str.charAt(i);
    }
    return result;
}

// String的toCharArray方法
private static String reverse2(String str) {
    if (str == null) {
        return null;
    }
    String result = "";
    char[] chars = str.toCharArray();
    for (int i = chars.length - 1; i >= 0; i--) {
        result = result + chars[i];
    }
    return result;
}

// 二分法逆序字符串数组
private static String reverse4(String str) {
    if (str == null) {
        return null;
    }
    char[] chars = str.toCharArray();
    int n = chars.length - 1;
    for (int i = 0; i < chars.length / 2; i++) {
        char temp = chars[i];
        chars[i] = chars[n - i];
        chars[n - i] = temp;
    }
    return new String(chars);
}