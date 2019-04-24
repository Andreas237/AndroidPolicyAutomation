// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.os.Bundle;
import java.util.HashMap;

// Referenced classes of package android.support.v4.media:
//			MediaBrowserServiceCompat

class MediaBrowserServiceCompat$ConnectionRecord
{

	MediaBrowserServiceCompat$ServiceCallbacks callbacks;
	String pkg;
	MediaBrowserServiceCompat.BrowserRoot root;
	Bundle rootHints;
	HashMap subscriptions;
	final MediaBrowserServiceCompat this$0;

	MediaBrowserServiceCompat$ConnectionRecord()
	{
		this$0 = MediaBrowserServiceCompat.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #24  <Field MediaBrowserServiceCompat this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #27  <Method void Object()>
		subscriptions = new HashMap();
	//    5    9:aload_0         
	//    6   10:new             #29  <Class HashMap>
	//    7   13:dup             
	//    8   14:invokespecial   #30  <Method void HashMap()>
	//    9   17:putfield        #32  <Field HashMap subscriptions>
	//   10   20:return          
	}
}
