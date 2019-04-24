// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.os.Bundle;

// Referenced classes of package android.support.v4.media:
//			MediaBrowserCompat

class MediaBrowserCompat$MediaBrowserImplBase$6
	implements Runnable
{

	public void run()
	{
		val$callback.onError(val$action, val$extras, ((Bundle) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field MediaBrowserCompat$CustomActionCallback val$callback>
	//    2    4:aload_0         
	//    3    5:getfield        #30  <Field String val$action>
	//    4    8:aload_0         
	//    5    9:getfield        #32  <Field Bundle val$extras>
	//    6   12:aconst_null     
	//    7   13:invokevirtual   #43  <Method void MediaBrowserCompat$CustomActionCallback.onError(String, Bundle, Bundle)>
	//    8   16:return          
	}

	final MediaBrowserCompat.MediaBrowserImplBase this$0;
	final String val$action;
	final MediaBrowserCompat.CustomActionCallback val$callback;
	final Bundle val$extras;

	MediaBrowserCompat$MediaBrowserImplBase$6()
	{
		this$0 = final_mediabrowserimplbase;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #26  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
		val$callback = customactioncallback;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #28  <Field MediaBrowserCompat$CustomActionCallback val$callback>
		val$action = s;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #30  <Field String val$action>
		val$extras = Bundle.this;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #32  <Field Bundle val$extras>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #35  <Method void Object()>
	//   14   25:return          
	}
}
