/**
 * This class allows you to construct a "16 bit array" where you can get and set the value
 * of a bit at a given index
 */
public class BitShort {
   // instance field acting like a bit array
    private short data;

    /**
     * Initializes the "16-bit array" with zero
     */
    public BitShort(){
        this.data = 0;
    }

    /**
     * Initializes the "16-bit array" with a sequence of 1's and 0's
     * @param data
     */
    public BitShort(short data){
        this.data = data;
    }

    /**
     * returns the sequences "16-bit array" as a decimal number
     * @return
     */
    public short getData() {
        return data;
    }

    /**
     * Example: data = 0000 0001 0000 0000
     * get(8) returns true everything else returns false
     *
     * @param index a position in the "16 bit array"
     * @return true if the bit is set to 1, false otherwise
     */
    public boolean get(int index){
        // create a mask with the 1 in the index position
        short mask = (short) (1 << index); // 1000
                                           // 3210
        //System.out.println(mask);
        // Bitwise AND & the mask with the data field
        short result = (short) (mask & this.data);
        // if the result is not zero (or result == mask) then we return
        // true, the bit at the given index is set to 1
        // return result == mask
        return result != 0;
    }

    /**
     * Sets a bit value in the "16 bit array"
     * @param index a position in the "16 bit array"
     * @param value true, if the bit at the given index will be set to one
     *              false, if the bit at the given index will be set to zero
     */
    public void set(int index, boolean value){
        short mask = (short) (1 << index);

        if(value){
            // set bit to one
            data |= mask;
        } else{
            // set bit to zero
            mask = (short) ~mask;
            data &= mask;
        }
    }
}
