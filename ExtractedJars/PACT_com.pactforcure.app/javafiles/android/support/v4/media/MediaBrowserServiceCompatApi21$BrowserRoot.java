// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.os.Bundle;

// Referenced classes of package android.support.v4.media:
//			MediaBrowserServiceCompatApi21

static class MediaBrowserServiceCompatApi21$BrowserRoot
{

	final Bundle mExtras;
	final String mRootId;

	MediaBrowserServiceCompatApi21$BrowserRoot(String s, Bundle bundle)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		mRootId = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field String mRootId>
		mExtras = bundle;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #20  <Field Bundle mExtras>
	//    8   14:return          
	}
}
