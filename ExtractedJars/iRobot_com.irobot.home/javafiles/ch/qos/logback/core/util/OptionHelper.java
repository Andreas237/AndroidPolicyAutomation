// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.util;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.android.SystemPropertiesProxy;
import ch.qos.logback.core.spi.*;
import ch.qos.logback.core.subst.NodeToStringTransformer;
import java.lang.reflect.Constructor;
import java.util.*;

// Referenced classes of package ch.qos.logback.core.util:
//			Loader, IncompatibleClassException, DynamicClassLoadingException

public class OptionHelper
{

	public OptionHelper()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
	//    2    4:return          
	}

	public static String[] extractDefaultReplacement(String s)
	{
		String as[] = new String[2];
	//    0    0:iconst_2        
	//    1    1:anewarray       String[]
	//    2    4:astore_2        
		if(s == null)
	//*   3    5:aload_0         
	//*   4    6:ifnonnull       11
			return as;
	//    5    9:aload_2         
	//    6   10:areturn         
		as[0] = s;
	//    7   11:aload_2         
	//    8   12:iconst_0        
	//    9   13:aload_0         
	//   10   14:aastore         
		int i = s.indexOf(":-");
	//   11   15:aload_0         
	//   12   16:ldc1            #8   <String ":-">
	//   13   18:invokevirtual   #35  <Method int String.indexOf(String)>
	//   14   21:istore_1        
		if(i != -1)
	//*  15   22:iload_1         
	//*  16   23:iconst_m1       
	//*  17   24:icmpeq          46
		{
			as[0] = s.substring(0, i);
	//   18   27:aload_2         
	//   19   28:iconst_0        
	//   20   29:aload_0         
	//   21   30:iconst_0        
	//   22   31:iload_1         
	//   23   32:invokevirtual   #39  <Method String String.substring(int, int)>
	//   24   35:aastore         
			as[1] = s.substring(i + 2);
	//   25   36:aload_2         
	//   26   37:iconst_1        
	//   27   38:aload_0         
	//   28   39:iload_1         
	//   29   40:iconst_2        
	//   30   41:iadd            
	//   31   42:invokevirtual   #42  <Method String String.substring(int)>
	//   32   45:aastore         
		}
		return as;
	//   33   46:aload_2         
	//   34   47:areturn         
	}

	public static String getAndroidSystemProperty(String s)
	{
		try
		{
			s = SystemPropertiesProxy.getInstance().get(s, ((String) (null)));
	//    0    0:invokestatic    #52  <Method SystemPropertiesProxy SystemPropertiesProxy.getInstance()>
	//    1    3:aload_0         
	//    2    4:aconst_null     
	//    3    5:invokevirtual   #56  <Method String SystemPropertiesProxy.get(String, String)>
	//    4    8:astore_0        
		}
	//*   5    9:aload_0         
	//*   6   10:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*   7   11:astore_0        
		{
			return null;
	//    8   12:aconst_null     
	//    9   13:areturn         
		}
		return s;
	}

	public static String getEnv(String s)
	{
		try
		{
			s = System.getenv(s);
	//    0    0:aload_0         
	//    1    1:invokestatic    #64  <Method String System.getenv(String)>
	//    2    4:astore_0        
		}
	//*   3    5:aload_0         
	//*   4    6:areturn         
	//*   5    7:aconst_null     
	//*   6    8:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
		{
			return null;
		}
		return s;
	//*   7    9:astore_0        
	//*   8   10:goto            7
	}

	public static Properties getSystemProperties()
	{
		SecurityException securityexception;
		Properties properties;
		try
		{
			properties = System.getProperties();
	//    0    0:invokestatic    #69  <Method Properties System.getProperties()>
	//    1    3:astore_0        
		}
	//*   2    4:aload_0         
	//*   3    5:areturn         
	//*   4    6:new             #71  <Class Properties>
	//*   5    9:dup             
	//*   6   10:invokespecial   #72  <Method void Properties()>
	//*   7   13:areturn         
		// Misplaced declaration of an exception variable
		catch(SecurityException securityexception)
		{
			return new Properties();
		}
		return properties;
	//*   8   14:astore_0        
	//*   9   15:goto            6
	}

	public static String getSystemProperty(String s)
	{
		String s1;
		String s2;
		try
		{
			s2 = System.getProperty(s);
	//    0    0:aload_0         
	//    1    1:invokestatic    #76  <Method String System.getProperty(String)>
	//    2    4:astore_2        
		}
	//*   3    5:aload_2         
	//*   4    6:astore_1        
	//*   5    7:aload_2         
	//*   6    8:ifnonnull       16
	//*   7   11:aload_0         
	//*   8   12:invokestatic    #78  <Method String getAndroidSystemProperty(String)>
	//*   9   15:astore_1        
	//*  10   16:aload_1         
	//*  11   17:areturn         
	//*  12   18:aconst_null     
	//*  13   19:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
		{
			return null;
		}
		s1 = s2;
		if(s2 != null)
			break MISSING_BLOCK_LABEL_16;
		s1 = getAndroidSystemProperty(s);
		return s1;
	//*  14   20:astore_0        
	//*  15   21:goto            18
	}

	public static String getSystemProperty(String s, String s1)
	{
		try
		{
			s = System.getProperty(s, s1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #80  <Method String System.getProperty(String, String)>
	//    3    5:astore_0        
		}
	//*   4    6:aload_0         
	//*   5    7:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*   6    8:astore_0        
		{
			return s1;
	//    7    9:aload_1         
	//    8   10:areturn         
		}
		return s;
	}

	public static Object instantiateByClassName(String s, Class class1, Context context)
	{
		return instantiateByClassName(s, class1, Loader.getClassLoaderOfObject(((Object) (context))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #88  <Method ClassLoader Loader.getClassLoaderOfObject(Object)>
	//    4    6:invokestatic    #91  <Method Object instantiateByClassName(String, Class, ClassLoader)>
	//    5    9:areturn         
	}

	public static Object instantiateByClassName(String s, Class class1, ClassLoader classloader)
	{
		return instantiateByClassNameAndParameter(s, class1, classloader, ((Class) (null)), ((Object) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:aconst_null     
	//    5    5:invokestatic    #97  <Method Object instantiateByClassNameAndParameter(String, Class, ClassLoader, Class, Object)>
	//    6    8:areturn         
	}

	public static Object instantiateByClassNameAndParameter(String s, Class class1, Context context, Class class2, Object obj)
	{
		return instantiateByClassNameAndParameter(s, class1, Loader.getClassLoaderOfObject(((Object) (context))), class2, obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #88  <Method ClassLoader Loader.getClassLoaderOfObject(Object)>
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:invokestatic    #97  <Method Object instantiateByClassNameAndParameter(String, Class, ClassLoader, Class, Object)>
	//    7   12:areturn         
	}

	public static Object instantiateByClassNameAndParameter(String s, Class class1, ClassLoader classloader, Class class2, Object obj)
	{
		if(s == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       12
			throw new NullPointerException();
	//    2    4:new             #106 <Class NullPointerException>
	//    3    7:dup             
	//    4    8:invokespecial   #107 <Method void NullPointerException()>
	//    5   11:athrow          
		try
		{
			classloader = ((ClassLoader) (classloader.loadClass(s)));
	//    6   12:aload_2         
	//    7   13:aload_0         
	//    8   14:invokevirtual   #113 <Method Class ClassLoader.loadClass(String)>
	//    9   17:astore_2        
			if(!class1.isAssignableFrom(((Class) (classloader))))
	//*  10   18:aload_1         
	//*  11   19:aload_2         
	//*  12   20:invokevirtual   #119 <Method boolean Class.isAssignableFrom(Class)>
	//*  13   23:ifne            36
				throw new IncompatibleClassException(class1, ((Class) (classloader)));
	//   14   26:new             #102 <Class IncompatibleClassException>
	//   15   29:dup             
	//   16   30:aload_1         
	//   17   31:aload_2         
	//   18   32:invokespecial   #122 <Method void IncompatibleClassException(Class, Class)>
	//   19   35:athrow          
		}
	//*  20   36:aload_3         
	//*  21   37:ifnonnull       45
	//*  22   40:aload_2         
	//*  23   41:invokevirtual   #126 <Method Object Class.newInstance()>
	//*  24   44:areturn         
	//*  25   45:aload_2         
	//*  26   46:iconst_1        
	//*  27   47:anewarray       Class[]
	//*  28   50:dup             
	//*  29   51:iconst_0        
	//*  30   52:aload_3         
	//*  31   53:aastore         
	//*  32   54:invokevirtual   #130 <Method Constructor Class.getConstructor(Class[])>
	//*  33   57:iconst_1        
	//*  34   58:anewarray       Object[]
	//*  35   61:dup             
	//*  36   62:iconst_0        
	//*  37   63:aload           4
	//*  38   65:aastore         
	//*  39   66:invokevirtual   #135 <Method Object Constructor.newInstance(Object[])>
	//*  40   69:astore_1        
	//*  41   70:aload_1         
	//*  42   71:areturn         
	//*  43   72:astore_1        
	//*  44   73:new             #137 <Class StringBuilder>
	//*  45   76:dup             
	//*  46   77:invokespecial   #138 <Method void StringBuilder()>
	//*  47   80:astore_2        
	//*  48   81:aload_2         
	//*  49   82:ldc1            #140 <String "Failed to instantiate type ">
	//*  50   84:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//*  51   87:pop             
	//*  52   88:aload_2         
	//*  53   89:aload_0         
	//*  54   90:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//*  55   93:pop             
	//*  56   94:new             #146 <Class DynamicClassLoadingException>
	//*  57   97:dup             
	//*  58   98:aload_2         
	//*  59   99:invokevirtual   #150 <Method String StringBuilder.toString()>
	//*  60  102:aload_1         
	//*  61  103:invokespecial   #153 <Method void DynamicClassLoadingException(String, Throwable)>
	//*  62  106:athrow          
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  63  107:astore_0        
		{
			throw s;
	//   64  108:aload_0         
	//   65  109:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(Class class1)
		{
			classloader = ((ClassLoader) (new StringBuilder()));
			((StringBuilder) (classloader)).append("Failed to instantiate type ");
			((StringBuilder) (classloader)).append(s);
			throw new DynamicClassLoadingException(((StringBuilder) (classloader)).toString(), ((Throwable) (class1)));
		}
		if(class2 != null)
			break MISSING_BLOCK_LABEL_45;
		return ((Class) (classloader)).newInstance();
		class1 = ((Class) (((Class) (classloader)).getConstructor(new Class[] {
			class2
		}).newInstance(new Object[] {
			obj
		})));
		return ((Object) (class1));
	}

	public static boolean isEmpty(String s)
	{
		return s == null || "".equals(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:ifnull          18
	//    2    4:ldc1            #158 <String "">
	//    3    6:aload_0         
	//    4    7:invokevirtual   #162 <Method boolean String.equals(Object)>
	//    5   10:ifeq            16
	//    6   13:goto            18
	//    7   16:iconst_0        
	//    8   17:ireturn         
	//    9   18:iconst_1        
	//   10   19:ireturn         
	}

	public static String propertyLookup(String s, PropertyContainer propertycontainer, PropertyContainer propertycontainer1)
	{
		String s1 = propertycontainer.getProperty(s);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokeinterface #167 <Method String PropertyContainer.getProperty(String)>
	//    3    7:astore_3        
		propertycontainer = ((PropertyContainer) (s1));
	//    4    8:aload_3         
	//    5    9:astore_1        
		if(s1 == null)
	//*   6   10:aload_3         
	//*   7   11:ifnonnull       28
		{
			propertycontainer = ((PropertyContainer) (s1));
	//    8   14:aload_3         
	//    9   15:astore_1        
			if(propertycontainer1 != null)
	//*  10   16:aload_2         
	//*  11   17:ifnull          28
				propertycontainer = ((PropertyContainer) (propertycontainer1.getProperty(s)));
	//   12   20:aload_2         
	//   13   21:aload_0         
	//   14   22:invokeinterface #167 <Method String PropertyContainer.getProperty(String)>
	//   15   27:astore_1        
		}
		propertycontainer1 = propertycontainer;
	//   16   28:aload_1         
	//   17   29:astore_2        
		if(propertycontainer == null)
	//*  18   30:aload_1         
	//*  19   31:ifnonnull       40
			propertycontainer1 = ((PropertyContainer) (getSystemProperty(s, ((String) (null)))));
	//   20   34:aload_0         
	//   21   35:aconst_null     
	//   22   36:invokestatic    #169 <Method String getSystemProperty(String, String)>
	//   23   39:astore_2        
		propertycontainer = propertycontainer1;
	//   24   40:aload_2         
	//   25   41:astore_1        
		if(propertycontainer1 == null)
	//*  26   42:aload_2         
	//*  27   43:ifnonnull       51
			propertycontainer = ((PropertyContainer) (getEnv(s)));
	//   28   46:aload_0         
	//   29   47:invokestatic    #171 <Method String getEnv(String)>
	//   30   50:astore_1        
		return ((String) (propertycontainer));
	//   31   51:aload_1         
	//   32   52:areturn         
	}

	public static void setSystemProperties(ContextAware contextaware, Properties properties)
	{
		String s;
		for(Iterator iterator = properties.keySet().iterator(); iterator.hasNext(); setSystemProperty(contextaware, s, properties.getProperty(s)))
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #177 <Method Set Properties.keySet()>
	//*   2    4:invokeinterface #183 <Method Iterator Set.iterator()>
	//*   3    9:astore_2        
	//*   4   10:aload_2         
	//*   5   11:invokeinterface #189 <Method boolean Iterator.hasNext()>
	//*   6   16:ifeq            42
			s = (String)iterator.next();
	//    7   19:aload_2         
	//    8   20:invokeinterface #192 <Method Object Iterator.next()>
	//    9   25:checkcast       #31  <Class String>
	//   10   28:astore_3        

	//   11   29:aload_0         
	//   12   30:aload_3         
	//   13   31:aload_1         
	//   14   32:aload_3         
	//   15   33:invokevirtual   #193 <Method String Properties.getProperty(String)>
	//   16   36:invokestatic    #197 <Method void setSystemProperty(ContextAware, String, String)>
	//*  17   39:goto            10
	//   18   42:return          
	}

	public static void setSystemProperty(ContextAware contextaware, String s, String s1)
	{
		try
		{
			System.setProperty(s, s1);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokestatic    #200 <Method String System.setProperty(String, String)>
	//    3    5:pop             
			return;
	//    4    6:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s1)
	//*   5    7:astore_2        
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    6    8:new             #137 <Class StringBuilder>
	//    7   11:dup             
	//    8   12:invokespecial   #138 <Method void StringBuilder()>
	//    9   15:astore_3        
			stringbuilder.append("Failed to set system property [");
	//   10   16:aload_3         
	//   11   17:ldc1            #202 <String "Failed to set system property [">
	//   12   19:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//   13   22:pop             
			stringbuilder.append(s);
	//   14   23:aload_3         
	//   15   24:aload_1         
	//   16   25:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//   17   28:pop             
			stringbuilder.append("]");
	//   18   29:aload_3         
	//   19   30:ldc1            #204 <String "]">
	//   20   32:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//   21   35:pop             
			contextaware.addError(stringbuilder.toString(), ((Throwable) (s1)));
	//   22   36:aload_0         
	//   23   37:aload_3         
	//   24   38:invokevirtual   #150 <Method String StringBuilder.toString()>
	//   25   41:aload_2         
	//   26   42:invokeinterface #209 <Method void ContextAware.addError(String, Throwable)>
			return;
	//   27   47:return          
		}
	}

	public static String substVars(String s, PropertyContainer propertycontainer)
	{
		return substVars(s, propertycontainer, ((PropertyContainer) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokestatic    #213 <Method String substVars(String, PropertyContainer, PropertyContainer)>
	//    4    6:areturn         
	}

	public static String substVars(String s, PropertyContainer propertycontainer, PropertyContainer propertycontainer1)
	{
		try
		{
			propertycontainer = ((PropertyContainer) (NodeToStringTransformer.substituteVariable(s, propertycontainer, propertycontainer1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #220 <Method String NodeToStringTransformer.substituteVariable(String, PropertyContainer, PropertyContainer)>
	//    4    6:astore_1        
		}
	//*   5    7:aload_1         
	//*   6    8:areturn         
		// Misplaced declaration of an exception variable
		catch(PropertyContainer propertycontainer)
	//*   7    9:astore_1        
		{
			propertycontainer1 = ((PropertyContainer) (new StringBuilder()));
	//    8   10:new             #137 <Class StringBuilder>
	//    9   13:dup             
	//   10   14:invokespecial   #138 <Method void StringBuilder()>
	//   11   17:astore_2        
			((StringBuilder) (propertycontainer1)).append("Failed to parse input [");
	//   12   18:aload_2         
	//   13   19:ldc1            #222 <String "Failed to parse input [">
	//   14   21:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//   15   24:pop             
			((StringBuilder) (propertycontainer1)).append(s);
	//   16   25:aload_2         
	//   17   26:aload_0         
	//   18   27:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//   19   30:pop             
			((StringBuilder) (propertycontainer1)).append("]");
	//   20   31:aload_2         
	//   21   32:ldc1            #204 <String "]">
	//   22   34:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//   23   37:pop             
			throw new IllegalArgumentException(((StringBuilder) (propertycontainer1)).toString(), ((Throwable) (propertycontainer)));
	//   24   38:new             #46  <Class IllegalArgumentException>
	//   25   41:dup             
	//   26   42:aload_2         
	//   27   43:invokevirtual   #150 <Method String StringBuilder.toString()>
	//   28   46:aload_1         
	//   29   47:invokespecial   #223 <Method void IllegalArgumentException(String, Throwable)>
	//   30   50:athrow          
		}
		return ((String) (propertycontainer));
	}

	public static boolean toBoolean(String s, boolean flag)
	{
		if(s == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return flag;
	//    2    4:iload_1         
	//    3    5:ireturn         
		s = s.trim();
	//    4    6:aload_0         
	//    5    7:invokevirtual   #228 <Method String String.trim()>
	//    6   10:astore_0        
		if("true".equalsIgnoreCase(s))
	//*   7   11:ldc1            #230 <String "true">
	//*   8   13:aload_0         
	//*   9   14:invokevirtual   #233 <Method boolean String.equalsIgnoreCase(String)>
	//*  10   17:ifeq            22
			return true;
	//   11   20:iconst_1        
	//   12   21:ireturn         
		if("false".equalsIgnoreCase(s))
	//*  13   22:ldc1            #235 <String "false">
	//*  14   24:aload_0         
	//*  15   25:invokevirtual   #233 <Method boolean String.equalsIgnoreCase(String)>
	//*  16   28:ifeq            33
			return false;
	//   17   31:iconst_0        
	//   18   32:ireturn         
		else
			return flag;
	//   19   33:iload_1         
	//   20   34:ireturn         
	}

	static final String DELIM_DEFAULT = ":-";
	static final int DELIM_DEFAULT_LEN = 2;
	static final String DELIM_START = "${";
	static final int DELIM_START_LEN = 2;
	static final char DELIM_STOP = 125;
	static final int DELIM_STOP_LEN = 1;
	static final String _IS_UNDEFINED = "_IS_UNDEFINED";
}
