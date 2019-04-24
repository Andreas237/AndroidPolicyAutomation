// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.classic.spi;

import java.net.URL;
import java.security.CodeSource;
import java.security.ProtectionDomain;
import java.util.HashMap;

// Referenced classes of package ch.qos.logback.classic.spi:
//			StackTraceElementProxy, ClassPackagingData, IThrowableProxy, STEUtil

public class PackagingDataCalculator
{

	public PackagingDataCalculator()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		cache = new HashMap();
	//    2    4:aload_0         
	//    3    5:new             #21  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #22  <Method void HashMap()>
	//    6   12:putfield        #24  <Field HashMap cache>
	//    7   15:return          
	}

	private Class bestEffortLoadClass(ClassLoader classloader, String s)
	{
		Class class1 = loadClass(classloader, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #35  <Method Class loadClass(ClassLoader, String)>
	//    4    6:astore_3        
		if(class1 != null)
	//*   5    7:aload_3         
	//*   6    8:ifnull          13
			return class1;
	//    7   11:aload_3         
	//    8   12:areturn         
		ClassLoader classloader1 = Thread.currentThread().getContextClassLoader();
	//    9   13:invokestatic    #41  <Method Thread Thread.currentThread()>
	//   10   16:invokevirtual   #45  <Method ClassLoader Thread.getContextClassLoader()>
	//   11   19:astore          4
		if(classloader1 != classloader)
	//*  12   21:aload           4
	//*  13   23:aload_1         
	//*  14   24:if_acmpeq       35
			class1 = loadClass(classloader1, s);
	//   15   27:aload_0         
	//   16   28:aload           4
	//   17   30:aload_2         
	//   18   31:invokespecial   #35  <Method Class loadClass(ClassLoader, String)>
	//   19   34:astore_3        
		if(class1 != null)
	//*  20   35:aload_3         
	//*  21   36:ifnull          41
			return class1;
	//   22   39:aload_3         
	//   23   40:areturn         
		try
		{
			classloader = ((ClassLoader) (Class.forName(s)));
	//   24   41:aload_2         
	//   25   42:invokestatic    #51  <Method Class Class.forName(String)>
	//   26   45:astore_1        
		}
	//*  27   46:aload_1         
	//*  28   47:areturn         
	//*  29   48:astore_1        
	//*  30   49:aload_1         
	//*  31   50:invokevirtual   #54  <Method void Exception.printStackTrace()>
	//*  32   53:aconst_null     
	//*  33   54:areturn         
		// Misplaced declaration of an exception variable
		catch(ClassLoader classloader)
	//*  34   55:astore_1        
		{
			return null;
	//   35   56:aconst_null     
	//   36   57:areturn         
		}
		// Misplaced declaration of an exception variable
		catch(ClassLoader classloader)
		{
			((Exception) (classloader)).printStackTrace();
			return null;
		}
		return ((Class) (classloader));
	}

	private ClassPackagingData computeBySTEP(StackTraceElementProxy stacktraceelementproxy, ClassLoader classloader)
	{
		stacktraceelementproxy = ((StackTraceElementProxy) (stacktraceelementproxy.ste.getClassName()));
	//    0    0:aload_1         
	//    1    1:getfield        #60  <Field StackTraceElement StackTraceElementProxy.ste>
	//    2    4:invokevirtual   #66  <Method String StackTraceElement.getClassName()>
	//    3    7:astore_1        
		ClassPackagingData classpackagingdata = (ClassPackagingData)cache.get(((Object) (stacktraceelementproxy)));
	//    4    8:aload_0         
	//    5    9:getfield        #24  <Field HashMap cache>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #70  <Method Object HashMap.get(Object)>
	//    8   16:checkcast       #72  <Class ClassPackagingData>
	//    9   19:astore_3        
		if(classpackagingdata != null)
	//*  10   20:aload_3         
	//*  11   21:ifnull          26
		{
			return classpackagingdata;
	//   12   24:aload_3         
	//   13   25:areturn         
		} else
		{
			classloader = ((ClassLoader) (bestEffortLoadClass(classloader, ((String) (stacktraceelementproxy)))));
	//   14   26:aload_0         
	//   15   27:aload_2         
	//   16   28:aload_1         
	//   17   29:invokespecial   #74  <Method Class bestEffortLoadClass(ClassLoader, String)>
	//   18   32:astore_2        
			String s = getImplementationVersion(((Class) (classloader)));
	//   19   33:aload_0         
	//   20   34:aload_2         
	//   21   35:invokevirtual   #78  <Method String getImplementationVersion(Class)>
	//   22   38:astore_3        
			classloader = ((ClassLoader) (new ClassPackagingData(getCodeLocation(((Class) (classloader))), s, false)));
	//   23   39:new             #72  <Class ClassPackagingData>
	//   24   42:dup             
	//   25   43:aload_0         
	//   26   44:aload_2         
	//   27   45:invokevirtual   #81  <Method String getCodeLocation(Class)>
	//   28   48:aload_3         
	//   29   49:iconst_0        
	//   30   50:invokespecial   #84  <Method void ClassPackagingData(String, String, boolean)>
	//   31   53:astore_2        
			cache.put(((Object) (stacktraceelementproxy)), ((Object) (classloader)));
	//   32   54:aload_0         
	//   33   55:getfield        #24  <Field HashMap cache>
	//   34   58:aload_1         
	//   35   59:aload_2         
	//   36   60:invokevirtual   #88  <Method Object HashMap.put(Object, Object)>
	//   37   63:pop             
			return ((ClassPackagingData) (classloader));
	//   38   64:aload_2         
	//   39   65:areturn         
		}
	}

	private String getCodeLocation(String s, char c)
	{
		int i = s.lastIndexOf(((int) (c)));
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #95  <Method int String.lastIndexOf(int)>
	//    3    5:istore_3        
		if(isFolder(i, s))
	//*   4    6:aload_0         
	//*   5    7:iload_3         
	//*   6    8:aload_1         
	//*   7    9:invokespecial   #99  <Method boolean isFolder(int, String)>
	//*   8   12:ifeq            30
			return s.substring(s.lastIndexOf(((int) (c)), i - 1) + 1);
	//    9   15:aload_1         
	//   10   16:aload_1         
	//   11   17:iload_2         
	//   12   18:iload_3         
	//   13   19:iconst_1        
	//   14   20:isub            
	//   15   21:invokevirtual   #102 <Method int String.lastIndexOf(int, int)>
	//   16   24:iconst_1        
	//   17   25:iadd            
	//   18   26:invokevirtual   #106 <Method String String.substring(int)>
	//   19   29:areturn         
		if(i > 0)
	//*  20   30:iload_3         
	//*  21   31:ifle            42
			return s.substring(i + 1);
	//   22   34:aload_1         
	//   23   35:iload_3         
	//   24   36:iconst_1        
	//   25   37:iadd            
	//   26   38:invokevirtual   #106 <Method String String.substring(int)>
	//   27   41:areturn         
		else
			return null;
	//   28   42:aconst_null     
	//   29   43:areturn         
	}

	private boolean isFolder(int i, String s)
	{
		return i != -1 && i + 1 == s.length();
	//    0    0:iload_1         
	//    1    1:iconst_m1       
	//    2    2:icmpeq          17
	//    3    5:iload_1         
	//    4    6:iconst_1        
	//    5    7:iadd            
	//    6    8:aload_2         
	//    7    9:invokevirtual   #110 <Method int String.length()>
	//    8   12:icmpne          17
	//    9   15:iconst_1        
	//   10   16:ireturn         
	//   11   17:iconst_0        
	//   12   18:ireturn         
	}

	private Class loadClass(ClassLoader classloader, String s)
	{
		if(classloader == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		try
		{
			classloader = ((ClassLoader) (classloader.loadClass(s)));
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:invokevirtual   #114 <Method Class ClassLoader.loadClass(String)>
	//    7   11:astore_1        
		}
	//*   8   12:aload_1         
	//*   9   13:areturn         
	//*  10   14:astore_1        
	//*  11   15:aload_1         
	//*  12   16:invokevirtual   #54  <Method void Exception.printStackTrace()>
	//*  13   19:aconst_null     
	//*  14   20:areturn         
		// Misplaced declaration of an exception variable
		catch(ClassLoader classloader)
	//*  15   21:astore_1        
		{
			return null;
	//   16   22:aconst_null     
	//   17   23:areturn         
		}
		// Misplaced declaration of an exception variable
		catch(ClassLoader classloader)
		{
			((Exception) (classloader)).printStackTrace();
			return null;
		}
		return ((Class) (classloader));
	}

	public void calculate(IThrowableProxy ithrowableproxy)
	{
		for(; ithrowableproxy != null; ithrowableproxy = ithrowableproxy.getCause())
	//*   0    0:aload_1         
	//*   1    1:ifnull          68
		{
			populateFrames(ithrowableproxy.getStackTraceElementProxyArray());
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokeinterface #122 <Method StackTraceElementProxy[] IThrowableProxy.getStackTraceElementProxyArray()>
	//    5   11:invokevirtual   #126 <Method void populateFrames(StackTraceElementProxy[])>
			IThrowableProxy aithrowableproxy[] = ithrowableproxy.getSuppressed();
	//    6   14:aload_1         
	//    7   15:invokeinterface #130 <Method IThrowableProxy[] IThrowableProxy.getSuppressed()>
	//    8   20:astore          4
			if(aithrowableproxy == null)
				continue;
	//    9   22:aload           4
	//   10   24:ifnull          58
			int j = aithrowableproxy.length;
	//   11   27:aload           4
	//   12   29:arraylength     
	//   13   30:istore_3        
			for(int i = 0; i < j; i++)
	//*  14   31:iconst_0        
	//*  15   32:istore_2        
	//*  16   33:iload_2         
	//*  17   34:iload_3         
	//*  18   35:icmpge          58
				populateFrames(aithrowableproxy[i].getStackTraceElementProxyArray());
	//   19   38:aload_0         
	//   20   39:aload           4
	//   21   41:iload_2         
	//   22   42:aaload          
	//   23   43:invokeinterface #122 <Method StackTraceElementProxy[] IThrowableProxy.getStackTraceElementProxyArray()>
	//   24   48:invokevirtual   #126 <Method void populateFrames(StackTraceElementProxy[])>

	//   25   51:iload_2         
	//   26   52:iconst_1        
	//   27   53:iadd            
	//   28   54:istore_2        
		}

	//   29   55:goto            33
	//   30   58:aload_1         
	//   31   59:invokeinterface #134 <Method IThrowableProxy IThrowableProxy.getCause()>
	//   32   64:astore_1        
	//*  33   65:goto            0
	//   34   68:return          
	}

	String getCodeLocation(Class class1)
	{
		if(class1 == null)
			break MISSING_BLOCK_LABEL_54;
	//    0    0:aload_1         
	//    1    1:ifnull          54
		class1 = ((Class) (class1.getProtectionDomain().getCodeSource()));
	//    2    4:aload_1         
	//    3    5:invokevirtual   #138 <Method ProtectionDomain Class.getProtectionDomain()>
	//    4    8:invokevirtual   #144 <Method CodeSource ProtectionDomain.getCodeSource()>
	//    5   11:astore_1        
		if(class1 == null)
			break MISSING_BLOCK_LABEL_54;
	//    6   12:aload_1         
	//    7   13:ifnull          54
		class1 = ((Class) (((CodeSource) (class1)).getLocation()));
	//    8   16:aload_1         
	//    9   17:invokevirtual   #150 <Method URL CodeSource.getLocation()>
	//   10   20:astore_1        
		if(class1 == null)
			break MISSING_BLOCK_LABEL_54;
	//   11   21:aload_1         
	//   12   22:ifnull          54
		String s;
		class1 = ((Class) (((URL) (class1)).toString()));
	//   13   25:aload_1         
	//   14   26:invokevirtual   #155 <Method String URL.toString()>
	//   15   29:astore_1        
		s = getCodeLocation(((String) (class1)), '/');
	//   16   30:aload_0         
	//   17   31:aload_1         
	//   18   32:bipush          47
	//   19   34:invokespecial   #157 <Method String getCodeLocation(String, char)>
	//   20   37:astore_2        
		if(s != null)
	//*  21   38:aload_2         
	//*  22   39:ifnull          44
			return s;
	//   23   42:aload_2         
	//   24   43:areturn         
		class1 = ((Class) (getCodeLocation(((String) (class1)), '\\')));
	//   25   44:aload_0         
	//   26   45:aload_1         
	//   27   46:bipush          92
	//   28   48:invokespecial   #157 <Method String getCodeLocation(String, char)>
	//   29   51:astore_1        
		return ((String) (class1));
	//   30   52:aload_1         
	//   31   53:areturn         
_L2:
		return "na";
	//   32   54:ldc1            #159 <String "na">
	//   33   56:areturn         
		class1;
	//   34   57:astore_1        
		if(true) goto _L2; else goto _L1
_L1:
	//*  35   58:goto            54
	}

	String getImplementationVersion(Class class1)
	{
		if(class1 == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       7
			return "na";
	//    2    4:ldc1            #159 <String "na">
	//    3    6:areturn         
		class1 = ((Class) (class1.getPackage()));
	//    4    7:aload_1         
	//    5    8:invokevirtual   #163 <Method Package Class.getPackage()>
	//    6   11:astore_1        
		if(class1 != null)
	//*   7   12:aload_1         
	//*   8   13:ifnull          32
		{
			String s = ((Package) (class1)).getImplementationVersion();
	//    9   16:aload_1         
	//   10   17:invokevirtual   #167 <Method String Package.getImplementationVersion()>
	//   11   20:astore_2        
			class1 = ((Class) (s));
	//   12   21:aload_2         
	//   13   22:astore_1        
			if(s == null)
	//*  14   23:aload_2         
	//*  15   24:ifnonnull       30
				class1 = "na";
	//   16   27:ldc1            #159 <String "na">
	//   17   29:astore_1        
			return ((String) (class1));
	//   18   30:aload_1         
	//   19   31:areturn         
		} else
		{
			return "na";
	//   20   32:ldc1            #159 <String "na">
	//   21   34:areturn         
		}
	}

	void populateFrames(StackTraceElementProxy astacktraceelementproxy[])
	{
		int j = STEUtil.findNumberOfCommonFrames((new Throwable("local stack reference")).getStackTrace(), astacktraceelementproxy);
	//    0    0:new             #169 <Class Throwable>
	//    1    3:dup             
	//    2    4:ldc1            #171 <String "local stack reference">
	//    3    6:invokespecial   #174 <Method void Throwable(String)>
	//    4    9:invokevirtual   #178 <Method StackTraceElement[] Throwable.getStackTrace()>
	//    5   12:aload_1         
	//    6   13:invokestatic    #184 <Method int STEUtil.findNumberOfCommonFrames(StackTraceElement[], StackTraceElementProxy[])>
	//    7   16:istore_3        
		int k = astacktraceelementproxy.length;
	//    8   17:aload_1         
	//    9   18:arraylength     
	//   10   19:istore          4
		for(int i = 0; i < j; i++)
	//*  11   21:iconst_0        
	//*  12   22:istore_2        
	//*  13   23:iload_2         
	//*  14   24:iload_3         
	//*  15   25:icmpge          57
		{
			StackTraceElementProxy stacktraceelementproxy = astacktraceelementproxy[(k - j) + i];
	//   16   28:aload_1         
	//   17   29:iload           4
	//   18   31:iload_3         
	//   19   32:isub            
	//   20   33:iload_2         
	//   21   34:iadd            
	//   22   35:aaload          
	//   23   36:astore          5
			stacktraceelementproxy.setClassPackagingData(computeBySTEP(stacktraceelementproxy, ((ClassLoader) (null))));
	//   24   38:aload           5
	//   25   40:aload_0         
	//   26   41:aload           5
	//   27   43:aconst_null     
	//   28   44:invokespecial   #186 <Method ClassPackagingData computeBySTEP(StackTraceElementProxy, ClassLoader)>
	//   29   47:invokevirtual   #190 <Method void StackTraceElementProxy.setClassPackagingData(ClassPackagingData)>
		}

	//   30   50:iload_2         
	//   31   51:iconst_1        
	//   32   52:iadd            
	//   33   53:istore_2        
	//*  34   54:goto            23
		populateUncommonFrames(j, astacktraceelementproxy, ((ClassLoader) (null)));
	//   35   57:aload_0         
	//   36   58:iload_3         
	//   37   59:aload_1         
	//   38   60:aconst_null     
	//   39   61:invokevirtual   #194 <Method void populateUncommonFrames(int, StackTraceElementProxy[], ClassLoader)>
	//   40   64:return          
	}

	void populateUncommonFrames(int i, StackTraceElementProxy astacktraceelementproxy[], ClassLoader classloader)
	{
		int k = astacktraceelementproxy.length;
	//    0    0:aload_2         
	//    1    1:arraylength     
	//    2    2:istore          5
		for(int j = 0; j < k - i; j++)
	//*   3    4:iconst_0        
	//*   4    5:istore          4
	//*   5    7:iload           4
	//*   6    9:iload           5
	//*   7   11:iload_1         
	//*   8   12:isub            
	//*   9   13:icmpge          43
		{
			StackTraceElementProxy stacktraceelementproxy = astacktraceelementproxy[j];
	//   10   16:aload_2         
	//   11   17:iload           4
	//   12   19:aaload          
	//   13   20:astore          6
			stacktraceelementproxy.setClassPackagingData(computeBySTEP(stacktraceelementproxy, classloader));
	//   14   22:aload           6
	//   15   24:aload_0         
	//   16   25:aload           6
	//   17   27:aload_3         
	//   18   28:invokespecial   #186 <Method ClassPackagingData computeBySTEP(StackTraceElementProxy, ClassLoader)>
	//   19   31:invokevirtual   #190 <Method void StackTraceElementProxy.setClassPackagingData(ClassPackagingData)>
		}

	//   20   34:iload           4
	//   21   36:iconst_1        
	//   22   37:iadd            
	//   23   38:istore          4
	//*  24   40:goto            7
	//   25   43:return          
	}

	static final StackTraceElementProxy STEP_ARRAY_TEMPLATE[] = new StackTraceElementProxy[0];
	HashMap cache;

	static 
	{
	//    0    0:iconst_0        
	//    1    1:anewarray       StackTraceElementProxy[]
	//    2    4:putstatic       #15  <Field StackTraceElementProxy[] STEP_ARRAY_TEMPLATE>
	//*   3    7:return          
	}
}
