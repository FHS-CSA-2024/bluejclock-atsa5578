package src.main.java;


public class ClockDriver
{
    public static void main(String[] args){
        //Implement tests for your ClockDisplay
        //  * Test that you can do the basics
        //      * Empty constructor & read time
        //      * Constructor w/ time given & read time
        //      * Set time
        //      * Read time
        //      * Tick time
        //  * Tick test for 03:32 to 03:33
        //  * Tick test for 03:09 to 03:10
        //  * Tick test for 01:59 to 02:00
        //  * Tick test for 09:59 to 10:00
        //  * Tick test for 23:59 to 00:00
        ClockDisplay test1 = new ClockDisplay();
        String test1Output = test1.getTime();
        System.out.println("Empty constructor test - " + test1Output);
        ClockDisplay test2 = new ClockDisplay(3,45);
        String test2Output = test2.getTime();
        System.out.println("2 Arg. Con. Test - " + test2Output);
        
        ClockDisplay tickTest1 = new ClockDisplay(3,32);
        System.out.println("Tick Test 1 Pretick - " + tickTest1.getTime());
        tickTest1.timeTick();
        System.out.println("Tick Test 1 PostTick - " + tickTest1.getTime());
        ClockDisplay tickTest2 = new ClockDisplay(3,9);
        System.out.println("Tick Test 2 Pretick - " + tickTest2.getTime());
        tickTest2.timeTick();
        System.out.println("Tick Test 2 Posttick - " + tickTest2.getTime());
        ClockDisplay tickTest3 = new ClockDisplay(1,59);
        System.out.println("Tick Test 3 Pretick - " + tickTest3.getTime());
        tickTest3.timeTick();
        System.out.println("Tick Test 3 Posttick - " + tickTest3.getTime());
        ClockDisplay tickTest4 = new ClockDisplay(9,59);
        System.out.println("Tick Test 4 Pretick - " + tickTest4.getTime());
        tickTest4.timeTick();
        System.out.println("Tick Test 4 Posttick - " + tickTest4.getTime());
        ClockDisplay tickTest5 = new ClockDisplay(23,59);
        System.out.println("Tick Test 5 Pretick - " + tickTest5.getTime());
        tickTest5.timeTick();
        System.out.println("Tick Test 5 Posttick - " + tickTest5.getTime());
        
        
        //Implement tests for your ClockDisplaySeconds
        //  * Test that you can do the basics
        //      * Empty constructor & read time
        //      * Constructor w/ time given & read time
        //      * Set time
        //      * Read time
        //      * Tick time
        //  * Tick test for 03:32:59 to 03:33:00
        //  * Tick test for 01:00:59 to 01:01:00
        //  * Tick test for 01:59:59 to 02:00:00
        //  * Tick test for 23:59:59 to 00:00:00
        
        ClockDisplaySeconds tickTestA = new ClockDisplaySeconds(3,32,59);
        System.out.println("Tick Test 1 (seconds) Pretick - " + tickTestA.getTime1());
        tickTestA.timeTick1();
        System.out.println("Tick Test 1 (seconds) Posttick - " + tickTestA.getTime1());
        ClockDisplaySeconds tickTestB = new ClockDisplaySeconds(1,0,59);
        System.out.println("Tick Test 2 (seconds) Pretick - " + tickTestB.getTime1());
        tickTestB.timeTick1();
        System.out.println("Tick Test 2 (seconds) Posttick - " + tickTestB.getTime1());
        ClockDisplaySeconds tickTestC = new ClockDisplaySeconds (1,59,59);
        System.out.println("Tick Test 3 (seconds) Pretick - " + tickTestC.getTime1());
        tickTestC.timeTick1();
        System.out.println("Tick Test 3 (seconds) Posttick - " + tickTestC.getTime1());
        ClockDisplaySeconds tickTestD = new ClockDisplaySeconds (23,59,59);
        System.out.println("Tick Test 4 (seconds) Pretick - " + tickTestD.getTime1());
        tickTestD.timeTick1();
        System.out.println("Tick Test 4 (seconds) Posttick - " + tickTestD.getTime1());
        
        /*CHALLENGE*/
        //Implement tests for your ClockDisplay12Hour
        //  * Test that you can do the basics
        //      * Empty constructor & read time
        //      * Constructor w/ time given & read time
        //      * Set time
        //      * Read time
        //      * Tick time
        //  * Tick test for 03:32PM to 03:33PM
        //  * Tick test for 11:59PM to 12:00AM
        //  * Tick test for 11:59AM to 12:00PM
        //  * Tick test for 12:59PM to 01:00PM
    }
}

//output

Empty constructor test - 00:00
2 Arg. Con. Test - 03:45
Tick Test 1 Pretick - 03:32
Tick Test 1 PostTick - 03:33
Tick Test 2 Pretick - 03:09
Tick Test 2 Posttick - 03:10
Tick Test 3 Pretick - 01:59
Tick Test 3 Posttick - 02:00
Tick Test 4 Pretick - 09:59
Tick Test 4 Posttick - 10:00
Tick Test 5 Pretick - 23:59
Tick Test 5 Posttick - 00:00
Tick Test 1 (seconds) Pretick - 03:32:59
Tick Test 1 (seconds) Posttick - 03:33:00
Tick Test 2 (seconds) Pretick - 01:00:59
Tick Test 2 (seconds) Posttick - 01:01:00
Tick Test 3 (seconds) Pretick - 01:59:59
Tick Test 3 (seconds) Posttick - 02:00:00
Tick Test 4 (seconds) Pretick - 23:59:59
Tick Test 4 (seconds) Posttick - 00:00:00
