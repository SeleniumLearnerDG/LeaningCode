class Solution_a {
    public static void main(String[] args) {
        String str = "aam";
        int step = 0;
        if (str != null && !str.equals(""))
            if (isPailndrom(str))
                step = 0;
            else if (str.length() > 1) {
                int i = str.length() - 1;
                int max = 0;
                for (; i >= 0; i--) {
                    if (isPailndrom(str.substring(0, i))) {
                        max = str.substring(0, i).length();
                        break;
                    }
                    System.out.println(max);
                }
                step = str.length() - max;

            }
        System.out.println("Total no of  minimum Step: " + step);
    }


    public static boolean isPailndrom(String s) {
        boolean flag = true;
        int length = s.length();
        for (int i = 0; i < length / 2; i++) {
            if (s.charAt(i) != s.charAt(length - i - 1)) {
                flag = false;
            }

        }

        return flag;
    }


}
