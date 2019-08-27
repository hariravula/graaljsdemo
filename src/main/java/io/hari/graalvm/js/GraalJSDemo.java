package io.hari.graalvm.js;

import java.io.File;
import java.io.IOException;

import org.graalvm.polyglot.Context;
import org.graalvm.polyglot.Source;

/** 
 * A simple demo to integrate JS applications in Java using GraalVM. 
 */
public class GraalJSDemo {
	public static void main(String[] args) throws IOException {
		Context context = Context.newBuilder("js").build();
		File helloJs = new File("res/js/app/helloworld.js");
		File hiJs = new File("res/js/app/hi.js");
		Source source = Source.newBuilder("js", hiJs).build();
		context.eval(source);
		source = Source.newBuilder("js", helloJs).build();
		context.eval(source);
		
		context.eval("js", "printHello()");
	}
}
