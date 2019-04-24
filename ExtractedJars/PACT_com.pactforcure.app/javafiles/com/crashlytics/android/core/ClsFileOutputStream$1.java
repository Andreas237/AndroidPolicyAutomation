// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import java.io.File;
import java.io.FilenameFilter;

// Referenced classes of package com.crashlytics.android.core:
//			ClsFileOutputStream

static final class ClsFileOutputStream$1
	implements FilenameFilter
{

	public boolean accept(File file, String s)
	{
		return s.endsWith(".cls_temp");
	//    0    0:aload_2         
	//    1    1:ldc1            #17  <String ".cls_temp">
	//    2    3:invokevirtual   #23  <Method boolean String.endsWith(String)>
	//    3    6:ireturn         
	}

	ClsFileOutputStream$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}
}
