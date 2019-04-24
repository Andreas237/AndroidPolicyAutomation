// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.appevents;

import java.io.Serializable;

// Referenced classes of package com.facebook.appevents:
//			FacebookTimeSpentData

private static class FacebookTimeSpentData$SerializationProxyV2
	implements Serializable
{

	private Object readResolve()
	{
		return ((Object) (new FacebookTimeSpentData(lastResumeTime, lastSuspendTime, millisecondsSpentInSession, interruptionCount, firstOpenSourceApplication, ((FacebookTimeSpentData._cls1) (null)))));
	//    0    0:new             #8   <Class FacebookTimeSpentData>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #27  <Field long lastResumeTime>
	//    4    8:aload_0         
	//    5    9:getfield        #29  <Field long lastSuspendTime>
	//    6   12:aload_0         
	//    7   13:getfield        #31  <Field long millisecondsSpentInSession>
	//    8   16:aload_0         
	//    9   17:getfield        #33  <Field int interruptionCount>
	//   10   20:aload_0         
	//   11   21:getfield        #35  <Field String firstOpenSourceApplication>
	//   12   24:aconst_null     
	//   13   25:invokespecial   #41  <Method void FacebookTimeSpentData(long, long, long, int, String, FacebookTimeSpentData$1)>
	//   14   28:areturn         
	}

	private static final long serialVersionUID = 6L;
	private final String firstOpenSourceApplication;
	private final int interruptionCount;
	private final long lastResumeTime;
	private final long lastSuspendTime;
	private final long millisecondsSpentInSession;

	FacebookTimeSpentData$SerializationProxyV2(long l, long l1, long l2, int i, 
			String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		lastResumeTime = l;
	//    2    4:aload_0         
	//    3    5:lload_1         
	//    4    6:putfield        #27  <Field long lastResumeTime>
		lastSuspendTime = l1;
	//    5    9:aload_0         
	//    6   10:lload_3         
	//    7   11:putfield        #29  <Field long lastSuspendTime>
		millisecondsSpentInSession = l2;
	//    8   14:aload_0         
	//    9   15:lload           5
	//   10   17:putfield        #31  <Field long millisecondsSpentInSession>
		interruptionCount = i;
	//   11   20:aload_0         
	//   12   21:iload           7
	//   13   23:putfield        #33  <Field int interruptionCount>
		firstOpenSourceApplication = s;
	//   14   26:aload_0         
	//   15   27:aload           8
	//   16   29:putfield        #35  <Field String firstOpenSourceApplication>
	//   17   32:return          
	}
}
