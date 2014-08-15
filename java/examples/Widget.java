/**
 * @author      Firstname Lastname <address @ example.com>
 * @version     1.6
 * @since       2010-03-31
 */

// package com.domain.demo;

public class Widget {

	// private static Widget(){}
	
	public static void main(String[] args){
	
		int firstArg;
		if (args.length > 0) {
			try {
				firstArg = Integer.parseInt(args[0]);
			} catch (NumberFormatException e) {
				System.err.println("Argument" + args[0] + " must be an integer.");
				System.exit(1);
			}
		}
		String secondArg = args[1];
		String[] widgets = first_arg.split("(?!^)");
		System.out.println(Widget.getWidget(widgets, second_arg));
	
	}
	
	/**
   * Short one line description.                           (1)
   * <p>
   * Longer description. If there were any, it would be    [2]
   * here.
   * <p>
   * And even more explanations to follow in consecutive
   * paragraphs separated by HTML paragraph breaks.
   *
   * @param  variable Description text.
   * @return Description text.
   */
	public static Boolean getWidget(String[] widgets, String comparison){
		
		Boolean is_widget = false;
		
		for(int i = 0; i < widgets.length; i++){
		
			if (widgets[i].equals(comparison)){
			
				is_widget = true;
				
				break;
			}
			
		}
		
		return is_widget;
		
	}
	

}
