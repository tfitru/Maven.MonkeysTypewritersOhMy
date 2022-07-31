package io.zipcoder;

public class MonkeyTypewriter {
    public static void main(String[] args) {
        String introduction = "It was the best of times,\n" +
                "it was the blurst of times,\n" +
                "it was the age of wisdom,\n" +
                "it was the age of foolishness,\n" +
                "it was the epoch of belief,\n" +
                "it was the epoch of incredulity,\n" +
                "it was the season of Light,\n" +
                "it was the season of Darkness,\n" +
                "it was the spring of hope,\n" +
                "it was the winter of despair,\n" +
                "we had everything before us,\n" +
                "we had nothing before us,\n" +
                "we were all going direct to Heaven,\n" +
                "we were all going direct the other way--\n" +
                "in short, the period was so far like the present period, that some of\n" +
                "its noisiest authorities insisted on its being received, for good or for\n" +
                "evil, in the superlative degree of comparison only.";

        // Do all of the Monkey / Thread building here
        // For each Copier(one safe and one unsafe), create and start 5 monkeys copying the introduction to
        // A Tale Of Two Cities.
        UnsafeCopier copier = new UnsafeCopier(introduction);
        SafeCopier copier1 = new SafeCopier(introduction);

        Thread monke = new Thread(copier);
        Thread monke1 = new Thread(copier);
        Thread monke2 = new Thread(copier);
        Thread monke3 = new Thread(copier);
        Thread monke4 = new Thread(copier);
        monke.start();
        monke1.start();
        monke2.start();
        monke3.start();
        monke4.start();



        Thread monkey = new Thread(copier1);
        Thread monkey1 = new Thread(copier1);
        Thread monkey2 = new Thread(copier1);
        Thread monkey3 = new Thread(copier1);
        Thread monkey4 = new Thread(copier1);
        monkey.start();
        monkey1.start();
        monkey2.start();
        monkey3.start();
        monkey4.start();






        // This wait is here because main is still a thread and we want the main method to print the finished copies
        // after enough time has passed.
        try {
            Thread.sleep(10000);
        } catch(InterruptedException e) {
            System.out.println("MAIN INTERRUPTED");
        }


        // Print out the copied versions here.
        monke.run();
        monke1.run();
        monke3.run();
        monke2.run();
        monke4.run();


        monkey.run();
        monkey1.run();
        monkey2.run();
        monkey3.run();
        monkey4.run();


    }
}