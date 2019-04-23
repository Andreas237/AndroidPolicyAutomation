// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.support;

import android.content.Context;

// Referenced classes of package com.appboy.support:
//			AppboyLogger

public class PermissionUtils
{

	public PermissionUtils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
	//    2    4:return          
	}

	public static boolean hasPermission(Context context, String s)
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		int i;
		try
		{
			i = context.checkCallingOrSelfPermission(s);
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:invokevirtual   #30  <Method int Context.checkCallingOrSelfPermission(String)>
	//    5    7:istore_2        
		}
	//*   6    8:iload_2         
	//*   7    9:ifne            14
	//*   8   12:iconst_1        
	//*   9   13:istore_3        
	//*  10   14:iload_3         
	//*  11   15:ireturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  12   16:astore_0        
		{
			String s1 = a;
	//   13   17:getstatic       #16  <Field String a>
	//   14   20:astore          4
			StringBuilder stringbuilder = new StringBuilder();
	//   15   22:new             #32  <Class StringBuilder>
	//   16   25:dup             
	//   17   26:invokespecial   #33  <Method void StringBuilder()>
	//   18   29:astore          5
			stringbuilder.append("Failure checking permission ");
	//   19   31:aload           5
	//   20   33:ldc1            #35  <String "Failure checking permission ">
	//   21   35:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
	//   22   38:pop             
			stringbuilder.append(s);
	//   23   39:aload           5
	//   24   41:aload_1         
	//   25   42:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
	//   26   45:pop             
			AppboyLogger.e(s1, stringbuilder.toString(), ((Throwable) (context)));
	//   27   46:aload           4
	//   28   48:aload           5
	//   29   50:invokevirtual   #43  <Method String StringBuilder.toString()>
	//   30   53:aload_0         
	//   31   54:invokestatic    #47  <Method int AppboyLogger.e(String, String, Throwable)>
	//   32   57:pop             
			return false;
	//   33   58:iconst_0        
	//   34   59:ireturn         
		}
		if(i == 0)
			flag = true;
		return flag;
	}

	private static final String a = AppboyLogger.getAppboyLogTag(com/appboy/support/PermissionUtils);

	static 
	{
	//    0    0:ldc1            #2   <Class PermissionUtils>
	//    1    2:invokestatic    #14  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #16  <Field String a>
	//*   3    8:return          
	}
}
