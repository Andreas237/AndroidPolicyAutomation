// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import java.io.File;
import java.io.FilenameFilter;

// Referenced classes of package com.crashlytics.android.core:
//			CrashlyticsController, ClsFileOutputStream

static class CrashlyticsController$InvalidPartFileFilter
	implements FilenameFilter
{

	public boolean accept(File file, String s)
	{
		return ClsFileOutputStream.TEMP_FILENAME_FILTER.accept(file, s) || s.contains("SessionMissingBinaryImages");
	//    0    0:getstatic       #22  <Field FilenameFilter ClsFileOutputStream.TEMP_FILENAME_FILTER>
	//    1    3:aload_1         
	//    2    4:aload_2         
	//    3    5:invokeinterface #24  <Method boolean FilenameFilter.accept(File, String)>
	//    4   10:ifne            27
	//    5   13:aload_2         
	//    6   14:ldc1            #26  <String "SessionMissingBinaryImages">
	//    7   16:invokevirtual   #32  <Method boolean String.contains(CharSequence)>
	//    8   19:ifeq            25
	//    9   22:goto            27
	//   10   25:iconst_0        
	//   11   26:ireturn         
	//   12   27:iconst_1        
	//   13   28:ireturn         
	}

	CrashlyticsController$InvalidPartFileFilter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
