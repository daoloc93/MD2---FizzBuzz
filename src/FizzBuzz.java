public class FizzBuzz {
    public String fizzBuzz(int number) {
           int hangChuc = number/10;
           int hangDonVi = number%10;
           String fizzBuzz = "";

        System.out.println("Số bằng chữ: " + docSo(number));

           if (hangChuc == 3 || hangDonVi ==3) {
               fizzBuzz += "Fizz ";
           }
           if (hangChuc == 5 || hangDonVi == 5) {
               fizzBuzz += "Buzz ";
           }
           else fizzBuzz = "";

           return fizzBuzz;
    }

    public String docSo (int number) {
        String doc = "";
        int hangChuc = number/10;
        int hangDonVi = number%10;

        switch(number) {
            case 1:
                doc = "Một";
                break;
            case 14:
                doc = "Mười Bốn";
            default:
                doc = docHangChuc(hangChuc) + docHangDonVi(hangDonVi);
        }
        return doc;
    }

    public String docHangChuc(int hangChuc) {
        String doc = "";
        switch (hangChuc) {
            case 0:
                doc = "";
                break;
            case 1:
                doc = "Mười ";
                break;
            case 2:
                doc = "Hai ";
                break;
            case 3:
                doc = "Ba ";
                break;
            case 4:
                doc = "Bốn ";
                break;
            case 5:
                doc = "Năm ";
                break;
            case 6:
                doc = "Sáu ";
                break;
            case 8:
                doc = "Tám ";
                break;
            case 9:
                doc = "Chín ";
                break;
        }
        return doc;
    }

    public String docHangDonVi(int hangDonVi) {
        String doc = "";
        switch (hangDonVi) {
            case 0:
                doc = "Mươi";
                break;
            case 1:
                doc = "Mốt";
                break;
            case 2:
                doc = "Hai";
                break;
            case 3:
                doc = "Ba";
                break;
            case 4:
                doc = "Tư";
                break;
            case 5:
                doc = "Lăm";
                break;
            case 6:
                doc = "Sáu";
                break;
            case 8:
                doc = "Tám";
                break;
            case 9:
                doc = "Chín";
                break;
        }
        return doc;
    }
}
