public class Main {

    /**
     * @param begin - beginning of the interval
     * @param end - end of the interval
     * @param target - verification value
     * @return 1 - in the range, 0 - beyond the range
     */
    static int test(int begin, int end, int target){
        return target>=begin&&target<=end?1:0;
    }

    public static void main(String[] args) {
        System.out.println(test(2,6,3));
        System.out.println(test(2,3,2));
        System.out.println(test(2,8,10));
    }
}