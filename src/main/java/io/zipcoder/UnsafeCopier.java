package io.zipcoder;

import java.util.Arrays;

/**
 * Modify the run function so that the monkeys each grab the next word and write it to the copy.
 */
public class UnsafeCopier extends Copier {

    public UnsafeCopier(String toCopy) {

        super(toCopy);
    }

    public void run() {

        while(stringIterator.hasNext()) {
            copied += stringIterator.next() + " " ;
        }
        System.out.println(copied);


    }
}
