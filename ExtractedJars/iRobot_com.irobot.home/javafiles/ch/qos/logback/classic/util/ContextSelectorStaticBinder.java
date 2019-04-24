// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.classic.util;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.selector.ContextSelector;
import ch.qos.logback.classic.selector.DefaultContextSelector;
import ch.qos.logback.core.util.Loader;
import ch.qos.logback.core.util.OptionHelper;
import java.lang.reflect.Constructor;

public class ContextSelectorStaticBinder
{

	public ContextSelectorStaticBinder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
	//    2    4:return          
	}

	static ContextSelector dynamicalContextSelector(LoggerContext loggercontext, String s)
	{
		return (ContextSelector)Loader.loadClass(s).getConstructor(new Class[] {
			ch/qos/logback/classic/LoggerContext
		}).newInstance(new Object[] {
			loggercontext
		});
	//    0    0:aload_1         
	//    1    1:invokestatic    #27  <Method Class Loader.loadClass(String)>
	//    2    4:iconst_1        
	//    3    5:anewarray       Class[]
	//    4    8:dup             
	//    5    9:iconst_0        
	//    6   10:ldc1            #31  <Class LoggerContext>
	//    7   12:aastore         
	//    8   13:invokevirtual   #35  <Method Constructor Class.getConstructor(Class[])>
	//    9   16:iconst_1        
	//   10   17:anewarray       Object[]
	//   11   20:dup             
	//   12   21:iconst_0        
	//   13   22:aload_0         
	//   14   23:aastore         
	//   15   24:invokevirtual   #41  <Method Object Constructor.newInstance(Object[])>
	//   16   27:checkcast       #43  <Class ContextSelector>
	//   17   30:areturn         
	}

	public static ContextSelectorStaticBinder getSingleton()
	{
		return singleton;
	//    0    0:getstatic       #17  <Field ContextSelectorStaticBinder singleton>
	//    1    3:areturn         
	}

	public ContextSelector getContextSelector()
	{
		return contextSelector;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field ContextSelector contextSelector>
	//    2    4:areturn         
	}

	public void init(LoggerContext loggercontext, Object obj)
	{
		if(key == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #53  <Field Object key>
	//*   2    4:ifnonnull       15
			key = obj;
	//    3    7:aload_0         
	//    4    8:aload_2         
	//    5    9:putfield        #53  <Field Object key>
		else
	//*   6   12:goto            33
		if(key != obj)
	//*   7   15:aload_0         
	//*   8   16:getfield        #53  <Field Object key>
	//*   9   19:aload_2         
	//*  10   20:if_acmpeq       33
			throw new IllegalAccessException("Only certain classes can access this method.");
	//   11   23:new             #55  <Class IllegalAccessException>
	//   12   26:dup             
	//   13   27:ldc1            #57  <String "Only certain classes can access this method.">
	//   14   29:invokespecial   #60  <Method void IllegalAccessException(String)>
	//   15   32:athrow          
		obj = ((Object) (OptionHelper.getSystemProperty("logback.ContextSelector")));
	//   16   33:ldc1            #62  <String "logback.ContextSelector">
	//   17   35:invokestatic    #68  <Method String OptionHelper.getSystemProperty(String)>
	//   18   38:astore_2        
		if(obj == null)
	//*  19   39:aload_2         
	//*  20   40:ifnonnull       56
		{
			contextSelector = ((ContextSelector) (new DefaultContextSelector(loggercontext)));
	//   21   43:aload_0         
	//   22   44:new             #70  <Class DefaultContextSelector>
	//   23   47:dup             
	//   24   48:aload_1         
	//   25   49:invokespecial   #73  <Method void DefaultContextSelector(LoggerContext)>
	//   26   52:putfield        #49  <Field ContextSelector contextSelector>
			return;
	//   27   55:return          
		}
		if(((String) (obj)).equals("JNDI"))
	//*  28   56:aload_2         
	//*  29   57:ldc1            #75  <String "JNDI">
	//*  30   59:invokevirtual   #81  <Method boolean String.equals(Object)>
	//*  31   62:ifeq            75
		{
			throw new RuntimeException("JNDI not supported");
	//   32   65:new             #83  <Class RuntimeException>
	//   33   68:dup             
	//   34   69:ldc1            #85  <String "JNDI not supported">
	//   35   71:invokespecial   #86  <Method void RuntimeException(String)>
	//   36   74:athrow          
		} else
		{
			contextSelector = dynamicalContextSelector(loggercontext, ((String) (obj)));
	//   37   75:aload_0         
	//   38   76:aload_1         
	//   39   77:aload_2         
	//   40   78:invokestatic    #88  <Method ContextSelector dynamicalContextSelector(LoggerContext, String)>
	//   41   81:putfield        #49  <Field ContextSelector contextSelector>
			return;
	//   42   84:return          
		}
	}

	static ContextSelectorStaticBinder singleton = new ContextSelectorStaticBinder();
	ContextSelector contextSelector;
	Object key;

	static 
	{
	//    0    0:new             #2   <Class ContextSelectorStaticBinder>
	//    1    3:dup             
	//    2    4:invokespecial   #15  <Method void ContextSelectorStaticBinder()>
	//    3    7:putstatic       #17  <Field ContextSelectorStaticBinder singleton>
	//*   4   10:return          
	}
}
