// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import java.io.File;
import java.io.FilenameFilter;

// Referenced classes of package com.crashlytics.android.core:
//			CrashlyticsController

static final class CrashlyticsController$1
	implements FilenameFilter
{

	public boolean accept(File file, String s)
	{
		return s.length() == 39 && s.endsWith(".cls");
	//    0    0:aload_2         
	//    1    1:invokevirtual   #21  <Method int String.length()>
	//    2    4:bipush          39
	//    3    6:icmpne          20
	//    4    9:aload_2         
	//    5   10:ldc1            #23  <String ".cls">
	//    6   12:invokevirtual   #27  <Method boolean String.endsWith(String)>
	//    7   15:ifeq            20
	//    8   18:iconst_1        
	//    9   19:ireturn         
	//   10   20:iconst_0        
	//   11   21:ireturn         
	}

	CrashlyticsController$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}
}
