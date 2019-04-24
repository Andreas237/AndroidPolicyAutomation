// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.dynamite;

import dalvik.system.PathClassLoader;

// Referenced classes of package com.google.android.gms.dynamite:
//			DynamiteModule

final class DynamiteModule$9 extends PathClassLoader
{

	protected Class loadClass(String s, boolean flag)
		throws ClassNotFoundException
	{
		if(s.startsWith("java.") || s.startsWith("android."))
			break MISSING_BLOCK_LABEL_27;
	//    0    0:aload_1         
	//    1    1:ldc1            #20  <String "java.">
	//    2    3:invokevirtual   #26  <Method boolean String.startsWith(String)>
	//    3    6:ifne            27
	//    4    9:aload_1         
	//    5   10:ldc1            #28  <String "android.">
	//    6   12:invokevirtual   #26  <Method boolean String.startsWith(String)>
	//    7   15:ifne            27
		Class class1 = findClass(s);
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:invokevirtual   #32  <Method Class findClass(String)>
	//   11   23:astore_3        
		return class1;
	//   12   24:aload_3         
	//   13   25:areturn         
		ClassNotFoundException classnotfoundexception;
		classnotfoundexception;
	//   14   26:astore_3        
		return super.loadClass(s, flag);
	//   15   27:aload_0         
	//   16   28:aload_1         
	//   17   29:iload_2         
	//   18   30:invokespecial   #34  <Method Class PathClassLoader.loadClass(String, boolean)>
	//   19   33:areturn         
	}

	DynamiteModule$9(String s, ClassLoader classloader)
	{
		super(s, classloader);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #13  <Method void PathClassLoader(String, ClassLoader)>
	//    4    6:return          
	}
}
