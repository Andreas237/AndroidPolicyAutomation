// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.appevents;


// Referenced classes of package com.facebook.appevents:
//			FlushResult

class FlushStatistics
{

	FlushStatistics()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
		numEvents = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #14  <Field int numEvents>
		result = FlushResult.SUCCESS;
	//    5    9:aload_0         
	//    6   10:getstatic       #19  <Field FlushResult FlushResult.SUCCESS>
	//    7   13:putfield        #21  <Field FlushResult result>
	//    8   16:return          
	}

	public int numEvents;
	public FlushResult result;
}
