// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.answers;


// Referenced classes of package com.crashlytics.android.answers:
//			EventFilter, SessionEvent

class KeepAllEventFilter
	implements EventFilter
{

	KeepAllEventFilter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public boolean skipEvent(SessionEvent sessionevent)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}
}
