public class BitMaskingDemo {

    public static void main(String[] args) {
        /*
        byte b = Byte.MIN_VALUE; //  8bits

        // >>> shift right unsigned fills in with 0's
        //shift operation occurs in 32 bits --> b = 1111_1111_1111_1111_1111_1111_1000 0000
        b = (byte) (b >>> 1);  // after shift op b = 0111_1111_1111_1111_1111_1111_1100_0000
                               // cast makes b = 1100_0000

        short s = Short.MIN_VALUE;

        s = (short) (s << 1);

        int i = Integer.MIN_VALUE;

        i = i << 8;  // shift left fills in with 0

        i = i >> 4; // shift right signed fills in with MSB

        long l = 1L; // less error-prone to always use L when initializing a long

        l = l << 35;
*/
        BitShort obj = new BitShort((short)8); // 1000
        boolean answer = obj.get(3);
        System.out.println("Expect true: " + answer);

        for (int i = 4; i < 15; i++) {
            answer = obj.get(i);
          //  System.out.println("Expect false: " + answer);
        }

        // test out set(4,true) data = 8 0b1000 becomes 24 0b11000
        // 1 << 2      001  100
        obj.set(4, true); //1 1000
        System.out.println(obj.getData());

        obj.set(4, false); // data becomes 8 again
        System.out.println(obj.getData());

    }
}
