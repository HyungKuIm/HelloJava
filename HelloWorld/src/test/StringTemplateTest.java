package test;

import java.text.MessageFormat;

public class StringTemplateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String title = "My Web Page";
		String text = "Hello, world";
		String webpage = MessageFormat.format("""
		    <html>
		      <head>
		        <title>{0}</title>
		      </head>
		      <body>
		        <p>{1}</p>
		      </body>
		    </html>
		    """, title, text);
		System.out.println(webpage);
	}

}
