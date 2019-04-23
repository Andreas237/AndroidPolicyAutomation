// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;


// Referenced classes of package com.crashlytics.android.core:
//			ReportUploader

static final class ReportUploader$AlwaysSendCheck
	implements ReportUploader.SendCheck
{

	public boolean canSendReports()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	ReportUploader$AlwaysSendCheck()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
