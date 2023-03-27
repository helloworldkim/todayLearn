package test.coding.test;

public class 최소직사각형 {

    public static void main(String[] args) {
        int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};

        // 모든케이스를 다 허용하는 최소값을 찾아야한다.(가로 * 세로)
        int maxWidth = 0;
        int maxHeight = 0;

        for (int[] size : sizes) {
            int width = size[0];
            int height = size[1];

            //일단 길이가 차이나면 한번 바꿔본다.
            if (width < height) {
                int temp = width;
                width = height;
                height = temp;
            }
            maxWidth = Math.max(maxWidth, width);
            maxHeight = Math.max(maxHeight, height);
        }

        int answer = maxWidth * maxHeight;
    }


}
