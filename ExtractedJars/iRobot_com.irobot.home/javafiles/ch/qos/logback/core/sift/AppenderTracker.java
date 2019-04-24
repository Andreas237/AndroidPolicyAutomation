// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.sift;

import ch.qos.logback.core.Appender;
import ch.qos.logback.core.Context;
import ch.qos.logback.core.helpers.NOPAppender;
import ch.qos.logback.core.joran.spi.JoranException;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import ch.qos.logback.core.spi.ContextAwareImpl;

// Referenced classes of package ch.qos.logback.core.sift:
//			AppenderFactory

public class AppenderTracker extends AbstractComponentTracker
{

	public AppenderTracker(Context context1, AppenderFactory appenderfactory)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void AbstractComponentTracker()>
		nopaWarningCount = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #21  <Field int nopaWarningCount>
		context = context1;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #23  <Field Context context>
		appenderFactory = appenderfactory;
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:putfield        #25  <Field AppenderFactory appenderFactory>
		contextAware = new ContextAwareImpl(context1, ((Object) (this)));
	//   11   19:aload_0         
	//   12   20:new             #27  <Class ContextAwareImpl>
	//   13   23:dup             
	//   14   24:aload_1         
	//   15   25:aload_0         
	//   16   26:invokespecial   #30  <Method void ContextAwareImpl(Context, Object)>
	//   17   29:putfield        #32  <Field ContextAwareImpl contextAware>
	//   18   32:return          
	}

	private NOPAppender buildNOPAppender(String s)
	{
		if(nopaWarningCount < 4)
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field int nopaWarningCount>
	//*   2    4:iconst_4        
	//*   3    5:icmpge          59
		{
			nopaWarningCount = nopaWarningCount + 1;
	//    4    8:aload_0         
	//    5    9:aload_0         
	//    6   10:getfield        #21  <Field int nopaWarningCount>
	//    7   13:iconst_1        
	//    8   14:iadd            
	//    9   15:putfield        #21  <Field int nopaWarningCount>
			ContextAwareImpl contextawareimpl = contextAware;
	//   10   18:aload_0         
	//   11   19:getfield        #32  <Field ContextAwareImpl contextAware>
	//   12   22:astore_2        
			StringBuilder stringbuilder = new StringBuilder();
	//   13   23:new             #39  <Class StringBuilder>
	//   14   26:dup             
	//   15   27:invokespecial   #40  <Method void StringBuilder()>
	//   16   30:astore_3        
			stringbuilder.append("Building NOPAppender for discriminating value [");
	//   17   31:aload_3         
	//   18   32:ldc1            #42  <String "Building NOPAppender for discriminating value [">
	//   19   34:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//   20   37:pop             
			stringbuilder.append(s);
	//   21   38:aload_3         
	//   22   39:aload_1         
	//   23   40:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//   24   43:pop             
			stringbuilder.append("]");
	//   25   44:aload_3         
	//   26   45:ldc1            #48  <String "]">
	//   27   47:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//   28   50:pop             
			contextawareimpl.addError(stringbuilder.toString());
	//   29   51:aload_2         
	//   30   52:aload_3         
	//   31   53:invokevirtual   #52  <Method String StringBuilder.toString()>
	//   32   56:invokevirtual   #56  <Method void ContextAwareImpl.addError(String)>
		}
		s = ((String) (new NOPAppender()));
	//   33   59:new             #58  <Class NOPAppender>
	//   34   62:dup             
	//   35   63:invokespecial   #59  <Method void NOPAppender()>
	//   36   66:astore_1        
		((NOPAppender) (s)).setContext(context);
	//   37   67:aload_1         
	//   38   68:aload_0         
	//   39   69:getfield        #23  <Field Context context>
	//   40   72:invokevirtual   #63  <Method void NOPAppender.setContext(Context)>
		((NOPAppender) (s)).start();
	//   41   75:aload_1         
	//   42   76:invokevirtual   #66  <Method void NOPAppender.start()>
		return ((NOPAppender) (s));
	//   43   79:aload_1         
	//   44   80:areturn         
	}

	protected Appender buildComponent(String s)
	{
		JoranException joranexception;
		Object obj;
		Object obj1;
		try
		{
			obj = ((Object) (appenderFactory.buildAppender(context, s)));
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field AppenderFactory appenderFactory>
	//    2    4:aload_0         
	//    3    5:getfield        #23  <Field Context context>
	//    4    8:aload_1         
	//    5    9:invokeinterface #77  <Method Appender AppenderFactory.buildAppender(Context, String)>
	//    6   14:astore_2        
		}
	//*   7   15:goto            61
	//*   8   18:aload_0         
	//*   9   19:getfield        #32  <Field ContextAwareImpl contextAware>
	//*  10   22:astore_2        
	//*  11   23:new             #39  <Class StringBuilder>
	//*  12   26:dup             
	//*  13   27:invokespecial   #40  <Method void StringBuilder()>
	//*  14   30:astore_3        
	//*  15   31:aload_3         
	//*  16   32:ldc1            #79  <String "Error while building appender with discriminating value [">
	//*  17   34:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//*  18   37:pop             
	//*  19   38:aload_3         
	//*  20   39:aload_1         
	//*  21   40:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//*  22   43:pop             
	//*  23   44:aload_3         
	//*  24   45:ldc1            #48  <String "]">
	//*  25   47:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//*  26   50:pop             
	//*  27   51:aload_2         
	//*  28   52:aload_3         
	//*  29   53:invokevirtual   #52  <Method String StringBuilder.toString()>
	//*  30   56:invokevirtual   #56  <Method void ContextAwareImpl.addError(String)>
	//*  31   59:aconst_null     
	//*  32   60:astore_2        
	//*  33   61:aload_2         
	//*  34   62:astore_3        
	//*  35   63:aload_2         
	//*  36   64:ifnonnull       73
	//*  37   67:aload_0         
	//*  38   68:aload_1         
	//*  39   69:invokespecial   #81  <Method NOPAppender buildNOPAppender(String)>
	//*  40   72:astore_3        
	//*  41   73:aload_3         
	//*  42   74:areturn         
		// Misplaced declaration of an exception variable
		catch(JoranException joranexception)
		{
			obj = ((Object) (contextAware));
			obj1 = ((Object) (new StringBuilder()));
			((StringBuilder) (obj1)).append("Error while building appender with discriminating value [");
			((StringBuilder) (obj1)).append(s);
			((StringBuilder) (obj1)).append("]");
			((ContextAwareImpl) (obj)).addError(((StringBuilder) (obj1)).toString());
			obj = null;
		}
		obj1 = obj;
		if(obj == null)
			obj1 = ((Object) (buildNOPAppender(s)));
		return ((Appender) (obj1));
	//*  43   75:astore_2        
	//*  44   76:goto            18
	}

	protected volatile Object buildComponent(String s)
	{
		return ((Object) (buildComponent(s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #85  <Method Appender buildComponent(String)>
	//    3    5:areturn         
	}

	protected boolean isComponentStale(Appender appender)
	{
		return appender.isStarted() ^ true;
	//    0    0:aload_1         
	//    1    1:invokeinterface #93  <Method boolean Appender.isStarted()>
	//    2    6:iconst_1        
	//    3    7:ixor            
	//    4    8:ireturn         
	}

	protected volatile boolean isComponentStale(Object obj)
	{
		return isComponentStale((Appender)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #89  <Class Appender>
	//    3    5:invokevirtual   #97  <Method boolean isComponentStale(Appender)>
	//    4    8:ireturn         
	}

	protected void processPriorToRemoval(Appender appender)
	{
		appender.stop();
	//    0    0:aload_1         
	//    1    1:invokeinterface #102 <Method void Appender.stop()>
	//    2    6:return          
	}

	protected volatile void processPriorToRemoval(Object obj)
	{
		processPriorToRemoval((Appender)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #89  <Class Appender>
	//    3    5:invokevirtual   #106 <Method void processPriorToRemoval(Appender)>
	//    4    8:return          
	}

	final AppenderFactory appenderFactory;
	final Context context;
	final ContextAwareImpl contextAware;
	int nopaWarningCount;
}
