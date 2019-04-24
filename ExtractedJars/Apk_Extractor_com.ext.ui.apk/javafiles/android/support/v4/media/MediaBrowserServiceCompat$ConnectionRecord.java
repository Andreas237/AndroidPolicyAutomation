// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.os.Bundle;
import java.util.HashMap;

// Referenced classes of package android.support.v4.media:
//			MediaBrowserServiceCompat

private static class MediaBrowserServiceCompat$ConnectionRecord
{

	MediaBrowserServiceCompat$ServiceCallbacks callbacks;
	String pkg;
	MediaBrowserServiceCompat.BrowserRoot root;
	Bundle rootHints;
	HashMap subscriptions;

	MediaBrowserServiceCompat$ConnectionRecord()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		subscriptions = new HashMap();
	//    2    4:aload_0         
	//    3    5:new             #24  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #25  <Method void HashMap()>
	//    6   12:putfield        #27  <Field HashMap subscriptions>
	//    7   15:return          
	}
}
