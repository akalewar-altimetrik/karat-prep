public class StringCompression {

    public static String stringCompression(String str) {
        if (str == null || str.isEmpty()){
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        int count = 1;
        for(int i = 0 ; i < str.length()-1; i++){
            if (str.charAt(i) != str.charAt(i+1)){
                stringBuilder.append(str.charAt(i)).append(count);
                count = 1;
            } else {
                count++;
            }
        }
        stringBuilder.append(str.charAt(str.length()-1)).append(count);
        return !stringBuilder.isEmpty() ? stringBuilder.toString() : str;
    }
}
