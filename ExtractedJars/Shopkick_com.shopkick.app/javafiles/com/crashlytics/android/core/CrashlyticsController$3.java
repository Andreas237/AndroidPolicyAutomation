// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import java.io.File;
import java.io.FileFilter;

// Referenced classes of package com.crashlytics.android.core:
//			CrashlyticsController

static final class CrashlyticsController$3
	implements FileFilter
{

	public boolean accept(File file)
	{
		return file.isDirectory() && file.getName().length() == 35;
	//    0    0:aload_1         
	//    1    1:invokevirtual   #21  <Method boolean File.isDirectory()>
	//    2    4:ifeq            21
	//    3    7:aload_1         
	//    4    8:invokevirtual   #25  <Method String File.getName()>
	//    5   11:invokevirtual   #31  <Method int String.length()>
	//    6   14:bipush          35
	//    7   16:icmpne          21
	//    8   19:iconst_1        
	//    9   20:ireturn         
	//   10   21:iconst_0        
	//   11   22:ireturn         
	}

	CrashlyticsController$3()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}
}
