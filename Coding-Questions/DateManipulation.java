

/*
 
Date Manipulation (Add Days to Date)
Given a date in DD-MM-YYYY format and an integer N, write a program to add N days to the given date and print the new date in the same format. The solution must account for leap years and varying month lengths.

Example Input: 31-12-2025, N = 3000
Example Output: 26-11-2034 
 
 */

public class DateManipulation {

    // Check if a year is a leap year
    static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Get days in a given month of a year
    static int getDaysInMonth(int month, int year) {
        switch (month) {
            case 1: return 31;
            case 2: return isLeapYear(year) ? 29 : 28;
            case 3: return 31;
            case 4: return 30;
            case 5: return 31;
            case 6: return 30;
            case 7: return 31;
            case 8: return 31;
            case 9: return 30;
            case 10: return 31;
            case 11: return 30;
            case 12: return 31;
            default: return 0;
        }
    }

    public static void main(String[] args) {
        String inputDate = "31-12-2024";
        int N = 3000;

        // Parse the date
        String[] parts = inputDate.split("-");
        int day = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int year = Integer.parseInt(parts[2]);

        // Add days manually
        while (N > 0) {
            int daysInCurrentMonth = getDaysInMonth(month, year);
            int remainingDaysInMonth = daysInCurrentMonth - day;

            if (N <= remainingDaysInMonth) {
                day += N;
                N = 0;
            } else {
                N -= (remainingDaysInMonth + 1);
                day = 1;
                month++;

                if (month > 12) {
                    month = 1;
                    year++;
                }
            }
        }

        // Format result
        System.out.printf("%02d-%02d-%04d\n", day, month, year);
    }
}

