package Lessons.Lesson5;


public class BiNariseArchiNgesing {
//    public static int searchPhilosoph(String[] nwPhill,int searchPhil){
//        int start = 0;
//        int end = nwPhill.length -1;
//        int mid = nwPhill.length/2;
//
////        while(start <= end){
////            if (!(nwPhill[mid] != searchPhil)) {
////                return mid;
////            } else {
////                if (nwPhill[mid] > searchPhil) {
////                    end = mid -1;
////                }else {
////                    start = mid +1;
////
////                }
////            }
////        }
////        return "bar";
//    }
    public static String simpleSearchingesing(String[] blackBoy,String bigBlackBoy){
        for (int i = 0; i < blackBoy.length; i++) {
            if (bigBlackBoy == blackBoy[i]){
                return blackBoy[i];
            }

        }
        return "Adolf_Gitler";


    }

}
