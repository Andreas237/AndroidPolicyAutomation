// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import java.io.File;
import java.io.FilenameFilter;

// Referenced classes of package com.crashlytics.android.core:
//			CrashlyticsUncaughtExceptionHandler

static class CrashlyticsUncaughtExceptionHandler$SessionPartFileFilter
	implements FilenameFilter
{

	public boolean accept(File file, String s)
	{
		while(s.equals(((Object) ((new StringBuilder()).append(sessionId).append(".cls").toString()))) || !s.contains(((CharSequence) (sessionId))) || s.endsWith(".cls_temp")) 
	//*   0    0:aload_2         
	//*   1    1:new             #23  <Class StringBuilder>
	//*   2    4:dup             
	//*   3    5:invokespecial   #24  <Method void StringBuilder()>
	//*   4    8:aload_0         
	//*   5    9:getfield        #18  <Field String sessionId>
	//*   6   12:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//*   7   15:ldc1            #30  <String ".cls">
	//*   8   17:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//*   9   20:invokevirtual   #34  <Method String StringBuilder.toString()>
	//*  10   23:invokevirtual   #40  <Method boolean String.equals(Object)>
	//*  11   26:ifeq            31
			return false;
	//   12   29:iconst_0        
	//   13   30:ireturn         
	//   14   31:aload_2         
	//   15   32:aload_0         
	//   16   33:getfield        #18  <Field String sessionId>
	//   17   36:invokevirtual   #44  <Method boolean String.contains(CharSequence)>
	//   18   39:ifeq            29
	//   19   42:aload_2         
	//   20   43:ldc1            #46  <String ".cls_temp">
	//   21   45:invokevirtual   #50  <Method boolean String.endsWith(String)>
	//   22   48:ifne            29
		return true;
	//   23   51:iconst_1        
	//   24   52:ireturn         
	}

	private final String sessionId;

	public CrashlyticsUncaughtExceptionHandler$SessionPartFileFilter(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		sessionId = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field String sessionId>
	//    5    9:return          
	}
}
