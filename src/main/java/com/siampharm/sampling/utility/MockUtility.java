package com.siampharm.sampling.utility;

public class MockUtility {
    private static String[] inspectionStatus = {"1", "2", "3", "4"};
    private static String[] inspectionLot = {"10", "90"};
    private static String[] inspectionLotOrigin = {"09", "01"};
    private static String[] materialsName = {"Hydroxine Di Hydrochloride", "Hydroxyzine Hydrochloride"};
    private static String[] materialsStatus = {"CRTD", "REL"};
    private static Integer[] fstDigit = {1,9};

    public static boolean randomBoolean(){
        return Math.random()>0.5?true:false;
    }

    public static String randomNumberString(boolean isFst , int digit){
        String resp = (isFst ? String.valueOf(MockUtility.fstDigit[(int) (Math.random() * 2)]) : "")
                + String.valueOf((long) (Math.random() * 1.0e18)).substring(0, digit > 18 ? 18 : digit);
        return resp;
    }

    public static String randomFormatNumberString( int integer, String del, int fraction){
        int front = (int) (Math.random()*integer+1);
        int back = (int) (Math.random()*fraction+1);
        return new StringBuilder().append(front).append(del).append(back).toString();
    }

    public static String randomInspectionStatus() {
        return MockUtility.inspectionStatus[(int)(Math.random()*4)];
    }

    public static String randomInspectionLot() {
        return MockUtility.inspectionLot[(int)(Math.random()*2)];
    }

    public static String randomInspectionLotOrigin() {
        return MockUtility.inspectionLotOrigin[(int)(Math.random()*2)];
    }

    public static String randomMaterial(){
        return MockUtility.materialsName[(int)(Math.random()*2)];
    }

    public static String randomMaterialStatus(){
        return MockUtility.materialsStatus[(int)(Math.random()*2)];
    }

    public static void main(String[] args){

        System.out.println(MockUtility.randomNumberString(true,16));
//        System.out.println((long)(Math.random()*1.0e18));
    }
}
