// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.util;

import ch.qos.logback.core.Context;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.*;

// Referenced classes of package ch.qos.logback.core.util:
//			OptionHelper

public class Loader
{

	public Loader()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #52  <Method void Object()>
	//    2    4:return          
	}

	public static ClassLoader getClassLoaderAsPrivileged(Class class1)
	{
		if(!HAS_GET_CLASS_LOADER_PERMISSION)
	//*   0    0:getstatic       #50  <Field boolean HAS_GET_CLASS_LOADER_PERMISSION>
	//*   1    3:ifne            8
			return null;
	//    2    6:aconst_null     
	//    3    7:areturn         
		else
			return (ClassLoader)AccessController.doPrivileged(new PrivilegedAction(class1) {

				public ClassLoader run()
				{
					return clazz.getClassLoader();
				//    0    0:aload_0         
				//    1    1:getfield        #18  <Field Class val$clazz>
				//    2    4:invokevirtual   #29  <Method ClassLoader Class.getClassLoader()>
				//    3    7:areturn         
				}

				public volatile Object run()
				{
					return ((Object) (run()));
				//    0    0:aload_0         
				//    1    1:invokevirtual   #32  <Method ClassLoader run()>
				//    2    4:areturn         
				}

				final Class val$clazz;

			
			{
				clazz = class1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field Class val$clazz>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//    4    8:new             #8   <Class Loader$2>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:invokespecial   #57  <Method void Loader$2(Class)>
	//    8   16:invokestatic    #48  <Method Object AccessController.doPrivileged(PrivilegedAction)>
	//    9   19:checkcast       #59  <Class ClassLoader>
	//   10   22:areturn         
	}

	public static ClassLoader getClassLoaderOfClass(Class class1)
	{
		ClassLoader classloader = class1.getClassLoader();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #68  <Method ClassLoader Class.getClassLoader()>
	//    2    4:astore_1        
		class1 = ((Class) (classloader));
	//    3    5:aload_1         
	//    4    6:astore_0        
		if(classloader == null)
	//*   5    7:aload_1         
	//*   6    8:ifnonnull       15
			class1 = ((Class) (ClassLoader.getSystemClassLoader()));
	//    7   11:invokestatic    #71  <Method ClassLoader ClassLoader.getSystemClassLoader()>
	//    8   14:astore_0        
		return ((ClassLoader) (class1));
	//    9   15:aload_0         
	//   10   16:areturn         
	}

	public static ClassLoader getClassLoaderOfObject(Object obj)
	{
		if(obj == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       14
			throw new NullPointerException("Argument cannot be null");
	//    2    4:new             #75  <Class NullPointerException>
	//    3    7:dup             
	//    4    8:ldc1            #77  <String "Argument cannot be null">
	//    5   10:invokespecial   #80  <Method void NullPointerException(String)>
	//    6   13:athrow          
		else
			return getClassLoaderOfClass(obj.getClass());
	//    7   14:aload_0         
	//    8   15:invokevirtual   #84  <Method Class Object.getClass()>
	//    9   18:invokestatic    #86  <Method ClassLoader getClassLoaderOfClass(Class)>
	//   10   21:areturn         
	}

	public static URL getResource(String s, ClassLoader classloader)
	{
		try
		{
			s = ((String) (classloader.getResource(s)));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #93  <Method URL ClassLoader.getResource(String)>
	//    3    5:astore_0        
		}
	//*   4    6:aload_0         
	//*   5    7:areturn         
	//*   6    8:aconst_null     
	//*   7    9:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
		{
			return null;
		}
		return ((URL) (s));
	//*   8   10:astore_0        
	//*   9   11:goto            8
	}

	public static URL getResourceBySelfClassLoader(String s)
	{
		return getResource(s, getClassLoaderOfClass(ch/qos/logback/core/util/Loader));
	//    0    0:aload_0         
	//    1    1:ldc1            #2   <Class Loader>
	//    2    3:invokestatic    #86  <Method ClassLoader getClassLoaderOfClass(Class)>
	//    3    6:invokestatic    #96  <Method URL getResource(String, ClassLoader)>
	//    4    9:areturn         
	}

	public static Set getResourceOccurrenceCount(String s, ClassLoader classloader)
	{
		HashSet hashset = new HashSet();
	//    0    0:new             #100 <Class HashSet>
	//    1    3:dup             
	//    2    4:invokespecial   #101 <Method void HashSet()>
	//    3    7:astore_2        
		for(s = ((String) (classloader.getResources(s))); ((Enumeration) (s)).hasMoreElements(); ((Set) (hashset)).add(((Object) ((URL)((Enumeration) (s)).nextElement()))));
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:invokevirtual   #105 <Method Enumeration ClassLoader.getResources(String)>
	//    7   13:astore_0        
	//    8   14:aload_0         
	//    9   15:invokeinterface #110 <Method boolean Enumeration.hasMoreElements()>
	//   10   20:ifeq            42
	//   11   23:aload_2         
	//   12   24:aload_0         
	//   13   25:invokeinterface #114 <Method Object Enumeration.nextElement()>
	//   14   30:checkcast       #116 <Class URL>
	//   15   33:invokeinterface #122 <Method boolean Set.add(Object)>
	//   16   38:pop             
	//*  17   39:goto            14
		return ((Set) (hashset));
	//   18   42:aload_2         
	//   19   43:areturn         
	}

	public static ClassLoader getTCL()
	{
		return Thread.currentThread().getContextClassLoader();
	//    0    0:invokestatic    #130 <Method Thread Thread.currentThread()>
	//    1    3:invokevirtual   #133 <Method ClassLoader Thread.getContextClassLoader()>
	//    2    6:areturn         
	}

	public static Class loadClass(String s)
	{
		Throwable throwable;
		if(ignoreTCL)
	//*   0    0:getstatic       #39  <Field boolean ignoreTCL>
	//*   1    3:ifeq            11
			return Class.forName(s);
	//    2    6:aload_0         
	//    3    7:invokestatic    #138 <Method Class Class.forName(String)>
	//    4   10:areturn         
		Class class1;
		try
		{
			class1 = getTCL().loadClass(s);
	//    5   11:invokestatic    #140 <Method ClassLoader getTCL()>
	//    6   14:aload_0         
	//    7   15:invokevirtual   #142 <Method Class ClassLoader.loadClass(String)>
	//    8   18:astore_1        
		}
	//*   9   19:aload_1         
	//*  10   20:areturn         
	//*  11   21:aload_0         
	//*  12   22:invokestatic    #138 <Method Class Class.forName(String)>
	//*  13   25:areturn         
		// Misplaced declaration of an exception variable
		catch(Throwable throwable)
		{
			return Class.forName(s);
		}
		return class1;
	//*  14   26:astore_1        
	//*  15   27:goto            21
	}

	public static Class loadClass(String s, Context context)
	{
		return getClassLoaderOfObject(((Object) (context))).loadClass(s);
	//    0    0:aload_1         
	//    1    1:invokestatic    #146 <Method ClassLoader getClassLoaderOfObject(Object)>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #142 <Method Class ClassLoader.loadClass(String)>
	//    4    8:areturn         
	}

	private static boolean HAS_GET_CLASS_LOADER_PERMISSION = false;
	public static final String IGNORE_TCL_PROPERTY_NAME = "logback.ignoreTCL";
	static final String TSTR = "Caught Exception while in Loader.getResource. This may be innocuous.";
	private static boolean ignoreTCL = false;

	static 
	{
		String s = OptionHelper.getSystemProperty("logback.ignoreTCL", ((String) (null)));
	//    0    0:ldc1            #15  <String "logback.ignoreTCL">
	//    1    2:aconst_null     
	//    2    3:invokestatic    #27  <Method String OptionHelper.getSystemProperty(String, String)>
	//    3    6:astore_0        
		if(s != null)
	//*   4    7:aload_0         
	//*   5    8:ifnull          21
			ignoreTCL = Boolean.valueOf(s).booleanValue();
	//    6   11:aload_0         
	//    7   12:invokestatic    #33  <Method Boolean Boolean.valueOf(String)>
	//    8   15:invokevirtual   #37  <Method boolean Boolean.booleanValue()>
	//    9   18:putstatic       #39  <Field boolean ignoreTCL>
		HAS_GET_CLASS_LOADER_PERMISSION = ((Boolean)AccessController.doPrivileged(new PrivilegedAction() {

			public Boolean run()
			{
				SecurityException securityexception;
				try
				{
					AccessController.checkPermission(((java.security.Permission) (new RuntimePermission("getClassLoader"))));
			//    0    0:new             #20  <Class RuntimePermission>
			//    1    3:dup             
			//    2    4:ldc1            #22  <String "getClassLoader">
			//    3    6:invokespecial   #25  <Method void RuntimePermission(String)>
			//    4    9:invokestatic    #31  <Method void AccessController.checkPermission(java.security.Permission)>
				}
			//*   5   12:iconst_1        
			//*   6   13:invokestatic    #37  <Method Boolean Boolean.valueOf(boolean)>
			//*   7   16:areturn         
			//*   8   17:iconst_0        
			//*   9   18:invokestatic    #37  <Method Boolean Boolean.valueOf(boolean)>
			//*  10   21:areturn         
				// Misplaced declaration of an exception variable
				catch(SecurityException securityexception)
				{
					return Boolean.valueOf(false);
				}
				return Boolean.valueOf(true);
			//*  11   22:astore_1        
			//*  12   23:goto            17
			}

			public volatile Object run()
			{
				return ((Object) (run()));
			//    0    0:aload_0         
			//    1    1:invokevirtual   #40  <Method Boolean run()>
			//    2    4:areturn         
			}

		}
)).booleanValue();
	//   10   21:new             #6   <Class Loader$1>
	//   11   24:dup             
	//   12   25:invokespecial   #42  <Method void Loader$1()>
	//   13   28:invokestatic    #48  <Method Object AccessController.doPrivileged(PrivilegedAction)>
	//   14   31:checkcast       #29  <Class Boolean>
	//   15   34:invokevirtual   #37  <Method boolean Boolean.booleanValue()>
	//   16   37:putstatic       #50  <Field boolean HAS_GET_CLASS_LOADER_PERMISSION>
	//*  17   40:return          
	}
}
