package executor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UpperExecutor {
	protected static final String CONFIG_PACKAGES[] = {"config","domain/**"};
	protected static AnnotationConfigApplicationContext acac = null;
	static {
		acac = new AnnotationConfigApplicationContext();
		acac.scan(CONFIG_PACKAGES);
		acac.refresh();		
	}
}
