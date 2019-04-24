// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.adjust.sdk;


// Referenced classes of package com.adjust.sdk:
//			ActivityHandler

private class ActivityHandler$ReferrerClickTime
{

	long clickTime;
	String referrer;
	final ActivityHandler this$0;

	ActivityHandler$ReferrerClickTime(String s, long l)
	{
		this$0 = ActivityHandler.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field ActivityHandler this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
		referrer = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #22  <Field String referrer>
		clickTime = l;
	//    8   14:aload_0         
	//    9   15:lload_3         
	//   10   16:putfield        #24  <Field long clickTime>
	//   11   19:return          
	}
}
