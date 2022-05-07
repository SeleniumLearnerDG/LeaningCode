import java.util.Date;
import java.util.Scanner;

public class GetDay {


    public static void main(String[] args) {
        System.out.println(" Please enter the OTP\n");

        Scanner sc= new Scanner(System.in);
        Integer otp= sc.nextInt();

          String val=  getOtp(reverse(otp));


        System.out.println(" Your otp is "+ val);

    }

    private static Integer reverse(Integer otp)
    {
        Integer val=0;
        while(otp>0)
        {
           int num  = otp%10;
           val=val*10+num;
            otp=otp/10;
        }
        return val;
    }


    private static String getOtp(Integer otp) {
        String val="";
        while(otp>0)
        {
            int num= otp%10;
            switch (num)
            {
                case 1: {
                    val+="ONE";
                    break;
                }
                case 2: {
                    val+="TWO";
                    break;
                }
                case 3: {
                    val+="THREE";
                    break;
                }
                case 4: {
                    val+="FOUR";
                    break;
                }
                case 5: {
                    val+="FIVE";
                    break;
                }
                case 6: {
                    val+="SIX";
                    break;
                }
                case 7: {
                    val+="SEVEN";
                    break;
                }
                case 8: {
                    val+="EIGHT";
                    break;
                }
                case 9: {
                    val+="NINE";
                    break;
                }
                case 0: {
                    val+="ZERO";
                    break;
                }
            }

            otp=otp/10;
        }

        return val;

    }


    public void getDay(Date date)
    {

        int  year= date.getYear();
        int month= date.getMonth();
        int day= date.getDay();

        int sum=0 ;

        switch (month) {

            case 1:
                sum += 3;
            case 3:
                sum += 3;
            case 5:
                sum += 3;
            case 7:
                sum += 3;
            case 8:
            case 10:
            case 12: {
                sum += 3;
                break;

            }

            case 4:
            case 6:
            case 9:
            case 11: {
                sum += 2;
                break;
            }
            case 2: {
                if(year %4==0)
                sum+=1;
                else {
                    sum+=0;
                }
            }
        }

        sum+= day %7;

        switch (sum) {
            case 0: {
                System.out.println(" Sunday");
                break;
            }
            case 1: {
                System.out.println(" Monday");
                break;
            }
            case 2: {
                System.out.println(" Tuesday");
                break;
            }
            case 3: {
                System.out.println("Wen");
                break;
            }
            case 4: {
                System.out.println("Thus");
                break;
            }
            case 5: {
                System.out.println("Friday");
                break;
            }
            case 6: {
                System.out.println("Saturday");
                break;
            }

        }


    }

}
