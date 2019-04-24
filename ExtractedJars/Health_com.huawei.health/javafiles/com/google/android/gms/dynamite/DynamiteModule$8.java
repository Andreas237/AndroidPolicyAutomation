// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.dynamite;

import dalvik.system.PathClassLoader;

// Referenced classes of package com.google.android.gms.dynamite:
//			DynamiteModule

final class DynamiteModule$8 extends PathClassLoader
{

	protected Class loadClass(String s, boolean flag)
		throws ClassNotFoundException
	{
		if(s.startsWith("java.") || s.startsWith("android."))
			break MISSING_BLOCK_LABEL_26;
	//    0    0:aload_1         
	//    1    1:ldc1            #20  <String "java.">
	//    2    3:invokevirtual   #26  <Method boolean String.startsWith(String)>
	//    3    6:ifne            26
	//    4    9:aload_1         
	//    5   10:ldc1            #28  <String "android.">
	//    6   12:invokevirtual   #26  <Method boolean String.startsWith(String)>
	//    7   15:ifne            26
		Class class1 = findClass(s);
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:invokevirtual   #32  <Method Class findClass(String)>
	//   11   23:astore_3        
		return class1;
	//   12   24:aload_3         
	//   13   25:areturn         
_L2:
		return super.loadClass(s, flag);
	//   14   26:aload_0         
	//   15   27:aload_1         
	//   16   28:iload_2         
	//   17   29:invokespecial   #34  <Method Class PathClassLoader.loadClass(String, boolean)>
	//   18   32:areturn         
		ClassNotFoundException classnotfoundexception;
		classnotfoundexception;
	//   19   33:astore_3        
		if(true) goto _L2; else goto _L1
_L1:
	//*  20   34:goto            26
	}

	DynamiteModule$8(String s, ClassLoader classloader)
	{
		super(s, classloader);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #13  <Method void PathClassLoader(String, ClassLoader)>
	//    4    6:return          
	}
}
