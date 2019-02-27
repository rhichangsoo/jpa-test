package executor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UpperExecutor {
	protected static final String CONFIG_PACKAGES[] = {"config","domain/**"};
	protected static AnnotationConfigApplicationContext ctx = null;
	static {
		ctx = new AnnotationConfigApplicationContext();
		ctx.scan(CONFIG_PACKAGES);
		ctx.refresh();		
	}
}
