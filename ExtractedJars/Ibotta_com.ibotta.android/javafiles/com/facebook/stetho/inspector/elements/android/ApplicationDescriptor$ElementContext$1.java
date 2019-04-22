// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.elements.android;

import android.app.Activity;

// Referenced classes of package com.facebook.stetho.inspector.elements.android:
//			ApplicationDescriptor

class ApplicationDescriptor$ElementContext$1
	implements ActivityTracker.Listener
{

	public void onActivityAdded(Activity activity)
	{
	//    0    0:return          
	}

	public void onActivityRemoved(Activity activity)
	{
	//    0    0:return          
	}

	final ApplicationDescriptor.ElementContext this$1;

	ApplicationDescriptor$ElementContext$1()
	{
		this$1 = ApplicationDescriptor.ElementContext.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field ApplicationDescriptor$ElementContext this$1>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
