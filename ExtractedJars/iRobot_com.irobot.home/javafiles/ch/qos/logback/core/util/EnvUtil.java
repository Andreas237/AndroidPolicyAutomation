// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.util;

import java.util.*;

// Referenced classes of package ch.qos.logback.core.util:
//			OptionHelper

public class EnvUtil
{

	public EnvUtil()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static boolean isAndroidOS()
	{
		String s = OptionHelper.getSystemProperty("os.name");
	//    0    0:ldc1            #13  <String "os.name">
	//    1    2:invokestatic    #19  <Method String OptionHelper.getSystemProperty(String)>
	//    2    5:astore_0        
		String s1 = OptionHelper.getEnv("ANDROID_ROOT");
	//    3    6:ldc1            #21  <String "ANDROID_ROOT">
	//    4    8:invokestatic    #24  <Method String OptionHelper.getEnv(String)>
	//    5   11:astore_1        
		String s2 = OptionHelper.getEnv("ANDROID_DATA");
	//    6   12:ldc1            #26  <String "ANDROID_DATA">
	//    7   14:invokestatic    #24  <Method String OptionHelper.getEnv(String)>
	//    8   17:astore_2        
		return s != null && s.contains("Linux") && s1 != null && s1.contains("/system") && s2 != null && s2.contains("/data");
	//    9   18:aload_0         
	//   10   19:ifnull          59
	//   11   22:aload_0         
	//   12   23:ldc1            #28  <String "Linux">
	//   13   25:invokevirtual   #34  <Method boolean String.contains(CharSequence)>
	//   14   28:ifeq            59
	//   15   31:aload_1         
	//   16   32:ifnull          59
	//   17   35:aload_1         
	//   18   36:ldc1            #36  <String "/system">
	//   19   38:invokevirtual   #34  <Method boolean String.contains(CharSequence)>
	//   20   41:ifeq            59
	//   21   44:aload_2         
	//   22   45:ifnull          59
	//   23   48:aload_2         
	//   24   49:ldc1            #38  <String "/data">
	//   25   51:invokevirtual   #34  <Method boolean String.contains(CharSequence)>
	//   26   54:ifeq            59
	//   27   57:iconst_1        
	//   28   58:ireturn         
	//   29   59:iconst_0        
	//   30   60:ireturn         
	}

	public static boolean isJDK5()
	{
		return isJDK_N_OrHigher(5);
	//    0    0:iconst_5        
	//    1    1:invokestatic    #43  <Method boolean isJDK_N_OrHigher(int)>
	//    2    4:ireturn         
	}

	public static boolean isJDK6OrHigher()
	{
		return isJDK_N_OrHigher(6);
	//    0    0:bipush          6
	//    1    2:invokestatic    #43  <Method boolean isJDK_N_OrHigher(int)>
	//    2    5:ireturn         
	}

	public static boolean isJDK7OrHigher()
	{
		return isJDK_N_OrHigher(7);
	//    0    0:bipush          7
	//    1    2:invokestatic    #43  <Method boolean isJDK_N_OrHigher(int)>
	//    2    5:ireturn         
	}

	private static boolean isJDK_N_OrHigher(int i)
	{
		Object obj = ((Object) (new ArrayList()));
	//    0    0:new             #47  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #48  <Method void ArrayList()>
	//    3    7:astore_2        
		for(int j = 0; j < 5; j++)
	//*   4    8:iconst_0        
	//*   5    9:istore_1        
	//*   6   10:iload_1         
	//*   7   11:iconst_5        
	//*   8   12:icmpge          56
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    9   15:new             #50  <Class StringBuilder>
	//   10   18:dup             
	//   11   19:invokespecial   #51  <Method void StringBuilder()>
	//   12   22:astore_3        
			stringbuilder.append("1.");
	//   13   23:aload_3         
	//   14   24:ldc1            #53  <String "1.">
	//   15   26:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   16   29:pop             
			stringbuilder.append(i + j);
	//   17   30:aload_3         
	//   18   31:iload_0         
	//   19   32:iload_1         
	//   20   33:iadd            
	//   21   34:invokevirtual   #60  <Method StringBuilder StringBuilder.append(int)>
	//   22   37:pop             
			((List) (obj)).add(((Object) (stringbuilder.toString())));
	//   23   38:aload_2         
	//   24   39:aload_3         
	//   25   40:invokevirtual   #64  <Method String StringBuilder.toString()>
	//   26   43:invokeinterface #70  <Method boolean List.add(Object)>
	//   27   48:pop             
		}

	//   28   49:iload_1         
	//   29   50:iconst_1        
	//   30   51:iadd            
	//   31   52:istore_1        
	//*  32   53:goto            10
		String s = System.getProperty("java.version");
	//   33   56:ldc1            #72  <String "java.version">
	//   34   58:invokestatic    #77  <Method String System.getProperty(String)>
	//   35   61:astore_3        
		if(s == null)
	//*  36   62:aload_3         
	//*  37   63:ifnonnull       68
			return false;
	//   38   66:iconst_0        
	//   39   67:ireturn         
		for(obj = ((Object) (((List) (obj)).iterator())); ((Iterator) (obj)).hasNext();)
	//*  40   68:aload_2         
	//*  41   69:invokeinterface #81  <Method Iterator List.iterator()>
	//*  42   74:astore_2        
	//*  43   75:aload_2         
	//*  44   76:invokeinterface #86  <Method boolean Iterator.hasNext()>
	//*  45   81:ifeq            102
			if(s.startsWith((String)((Iterator) (obj)).next()))
	//*  46   84:aload_3         
	//*  47   85:aload_2         
	//*  48   86:invokeinterface #90  <Method Object Iterator.next()>
	//*  49   91:checkcast       #30  <Class String>
	//*  50   94:invokevirtual   #94  <Method boolean String.startsWith(String)>
	//*  51   97:ifeq            75
				return true;
	//   52  100:iconst_1        
	//   53  101:ireturn         

		return false;
	//   54  102:iconst_0        
	//   55  103:ireturn         
	}

	public static boolean isWindows()
	{
		return System.getProperty("os.name").startsWith("Windows");
	//    0    0:ldc1            #13  <String "os.name">
	//    1    2:invokestatic    #77  <Method String System.getProperty(String)>
	//    2    5:ldc1            #97  <String "Windows">
	//    3    7:invokevirtual   #94  <Method boolean String.startsWith(String)>
	//    4   10:ireturn         
	}
}
