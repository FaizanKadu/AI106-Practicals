public class ArrayMapper {
    static int sizeX = 5, sizeY = 5, sizeZ = 5;

    public static void set(int value, int x, int y, int z, int[] array1D) {
        int index = (x * sizeY * sizeZ) + (y * sizeZ) + z;
        array1D[index] = value;
    }

    public static void get(int x, int y, int z, int[] array1D) {
        int index = (x * sizeY * sizeZ) + (y * sizeZ) + z;
        int value = array1D[index];
        System.out.println(" value at that spot is" + value);
    }

    public static void main(String[] args) {
        int[] myArray = new int[sizeX * sizeY * sizeZ];
        set(99, 1, 2, 3, myArray);
        get(1, 2, 3, myArray);
    }
}
