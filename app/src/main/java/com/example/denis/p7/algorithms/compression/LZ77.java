package com.example.denis.p7.algorithms.compression;

import com.example.denis.p7.algorithms.exceptions.DecompressionException;
import com.example.denis.p7.algorithms.helpers.BitStream;
import com.example.denis.p7.algorithms.interfaces.ICompressor;

/**
 * LZ77 compression algorithm
 * <p>
 * Created by Sergey on 2017-11-07
 */
public class LZ77 implements ICompressor {

    @Override
    public byte[] compressByteString(byte[] message) {
        BitStream input = new BitStream(message);
        BitStream output = new BitStream();

        while(input.hasBits()) {
            input.readBit();
        }

        // TODO: implement algorithm
        return message.clone();
    }

    @Override
    public byte[] decompressByteString(byte[] sequence) throws DecompressionException {
        // TODO: implement algorithm
        return sequence.clone();
    }

}
