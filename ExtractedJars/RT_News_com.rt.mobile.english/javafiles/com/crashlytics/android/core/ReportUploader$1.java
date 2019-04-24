// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import java.io.File;
import java.io.FilenameFilter;

// Referenced classes of package com.crashlytics.android.core:
//			ReportUploader

static final class ReportUploader$1
	implements FilenameFilter
{

	public boolean accept(File file, String s)
	{
		return s.endsWith(".cls") && !s.contains("Session");
	//    0    0:aload_2         
	//    1    1:ldc1            #17  <String ".cls">
	//    2    3:invokevirtual   #23  <Method boolean String.endsWith(String)>
	//    3    6:ifeq            20
	//    4    9:aload_2         
	//    5   10:ldc1            #25  <String "Session">
	//    6   12:invokevirtual   #29  <Method boolean String.contains(CharSequence)>
	//    7   15:ifne            20
	//    8   18:iconst_1        
	//    9   19:ireturn         
	//   10   20:iconst_0        
	//   11   21:ireturn         
	}

	ReportUploader$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}
}
