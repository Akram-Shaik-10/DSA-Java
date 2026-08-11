class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int r = image.length;

        for (int i = 0; i < r; i++) {
            for (int j = 0, k = r - 1; j <= k; j++, k--) {
                if (j == k) {
                    image[i][j] ^= 1;
                    break;
                }
                swap(image, i, j, k);
                flip(image, i, j, k);
            }
        }
        return image;
    }

    private void flip(int[][] image, int i, int j, int k) {
        image[i][j] ^= 1;
        image[i][k] ^= 1;
    }

    public static void swap(int[][] image, int i, int j, int k) {
        int temp = image[i][j];
        image[i][j] = image[i][k];
        image[i][k] = temp;
    }
}

public class FlippingImage {
    public static void main(String[] args) {

    }
}
