// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import java.io.File;
import java.io.FilenameFilter;

// Referenced classes of package com.crashlytics.android.core:
//			CrashlyticsController

static final class CrashlyticsController$2
	implements FilenameFilter
{

	public boolean accept(File file, String s)
	{
		return s.length() == ".cls".length() + 35 && s.endsWith(".cls");
	//    0    0:aload_2         
	//    1    1:invokevirtual   #21  <Method int String.length()>
	//    2    4:ldc1            #23  <String ".cls">
	//    3    6:invokevirtual   #21  <Method int String.length()>
	//    4    9:bipush          35
	//    5   11:iadd            
	//    6   12:icmpne          26
	//    7   15:aload_2         
	//    8   16:ldc1            #23  <String ".cls">
	//    9   18:invokevirtual   #27  <Method boolean String.endsWith(String)>
	//   10   21:ifeq            26
	//   11   24:iconst_1        
	//   12   25:ireturn         
	//   13   26:iconst_0        
	//   14   27:ireturn         
	}

	CrashlyticsController$2()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}
}
