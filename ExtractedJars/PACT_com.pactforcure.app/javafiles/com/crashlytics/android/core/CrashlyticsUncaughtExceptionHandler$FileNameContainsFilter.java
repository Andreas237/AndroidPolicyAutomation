// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import java.io.File;
import java.io.FilenameFilter;

// Referenced classes of package com.crashlytics.android.core:
//			CrashlyticsUncaughtExceptionHandler

static class CrashlyticsUncaughtExceptionHandler$FileNameContainsFilter
	implements FilenameFilter
{

	public boolean accept(File file, String s)
	{
		return s.contains(((CharSequence) (string))) && !s.endsWith(".cls_temp");
	//    0    0:aload_2         
	//    1    1:aload_0         
	//    2    2:getfield        #18  <Field String string>
	//    3    5:invokevirtual   #27  <Method boolean String.contains(CharSequence)>
	//    4    8:ifeq            22
	//    5   11:aload_2         
	//    6   12:ldc1            #29  <String ".cls_temp">
	//    7   14:invokevirtual   #33  <Method boolean String.endsWith(String)>
	//    8   17:ifne            22
	//    9   20:iconst_1        
	//   10   21:ireturn         
	//   11   22:iconst_0        
	//   12   23:ireturn         
	}

	private final String string;

	public CrashlyticsUncaughtExceptionHandler$FileNameContainsFilter(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		string = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field String string>
	//    5    9:return          
	}
}
