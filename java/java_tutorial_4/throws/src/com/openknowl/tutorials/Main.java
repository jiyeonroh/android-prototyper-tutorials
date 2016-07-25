package com.openknowl.tutorials;

public class Main {

    public static void main(String[] args) {
        try {
            int a = 0;
            int b = 1;
//            int c = b / a;
            int[] arr = new int[10];
//            arr[100] = 10;
//            arr[100] = Integer.parseInt("200x");

            arr[9] = -100;
            if (arr[9] < 0) {
                throw new NotPermitNumberException();
            }
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("ArithmeticException block 에서 처리되었습니다.");
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("ArrayIndexOutOfBoundsException block 에서 처리되었습니다.");
        } catch (NotPermitNumberException e) {
            System.out.println("NotPermitNumberException block 에서 처리되었습니다.");
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException block 에서 처리되었습니다.");
        } catch (Exception e) {
            System.out.println("Exception block 에서 처리되었습니다.");
        }
    }
}
