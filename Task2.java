import java.io.IOException;
import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) throws IOException {
		Scanner ip = new Scanner(System.in);
		String input = "";
		while(!input.equals("q")) {
		    System.out.println("Please input time to convert: ");
		    input = ip.next();

		    if (!input.equals("q")) {
				/**
				 * 1st black box - start (get_last_two_characters)
				 */
				String last_character = "";
				for (int i = input.length()-2; i < input.length(); i++) {
					last_character = last_character + input.charAt(i);
				}
				/**
				 * 1st black box - end (get_last_two_characters)
				 */


				/**
				 * 2nd black box - start (get_before_colon)
				 */
				String after_colon = "";
				for (int i = input.length()-4; i < input.length()-2; i++) {
					after_colon = after_colon + input.charAt(i);
				}
				/**
				 * 2nd black box - end (get_before_colon)
				 */

				/**
				 * 3rd black box - start (get_after_colon)
				 */
				String before_colon = "";
				for (int i = 0; i < 2; i++) {
					before_colon = before_colon + input.charAt(i);
				}
				/**
				 * 3rd black box - end (get_after_colon)
				 */

				/**
				 * 4th black box - start (get_24_hour_time)
				 */
				String output = "";
				int intValue = Integer.parseInt(before_colon);
				if (last_character.equals("am") && intValue < 12) {
					output = before_colon + ":" + after_colon;
				} else if (last_character.equals("am") && intValue == 12) {
					output = "00" + ":" + after_colon;
				} else {
					int a = intValue + 12;
					output = a + ":" + after_colon;
				}
				System.out.println("Output: " + output);
				/**
				 * 4th black box - end (get_24_hour_time)
				 */
		    }
		}

		System.out.println("Program Exited");
	}

    


}
