package com.ziolkowd.thing;

class MainerTainer {
    public static void main(String[] args) {
        MyMegaBytesConvertor mc = new MyMegaBytesConvertor();
        mc.printMegaBytesAndKiloBytes(2500);
    }
}

public class MyMegaBytesConvertor {
    public void printMegaBytesAndKiloBytes(int kiloBytes) {

        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        }
        int leftOverKiloBytes;
        long calculatedMegaBytes = Math.round(kiloBytes / 1024);
        long kiloBytesLeftOver = (kiloBytes - (calculatedMegaBytes * 1024));
        System.out.println(kiloBytes + "KB = " + calculatedMegaBytes + "MB " + kiloBytesLeftOver + "KB");
    }
}
