// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import java.io.File;

// Referenced classes of package com.crashlytics.android.core:
//			CrashlyticsController

static final class CrashlyticsController$1 extends leNameContainsFilter
{

	public boolean accept(File file, String s)
	{
		return super.accept(file, s) && s.endsWith(".cls");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #15  <Method boolean CrashlyticsController$FileNameContainsFilter.accept(File, String)>
	//    4    6:ifeq            20
	//    5    9:aload_2         
	//    6   10:ldc1            #17  <String ".cls">
	//    7   12:invokevirtual   #23  <Method boolean String.endsWith(String)>
	//    8   15:ifeq            20
	//    9   18:iconst_1        
	//   10   19:ireturn         
	//   11   20:iconst_0        
	//   12   21:ireturn         
	}

	CrashlyticsController$1(String s)
	{
		super(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #10  <Method void CrashlyticsController$FileNameContainsFilter(String)>
	//    3    5:return          
	}
}
