// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.content.Context;
import android.os.Bundle;

// Referenced classes of package android.support.v4.media:
//			MediaBrowserServiceCompatApi24

static class MediaBrowserServiceCompatApi24$MediaBrowserServiceAdaptor extends MediaBrowserServiceCompatApi23$MediaBrowserServiceAdaptor
{

	public void onLoadChildren(String s, android.service.media.MediaBrowserService.Result result, Bundle bundle)
	{
		((MediaBrowserServiceCompatApi24.ServiceCompatProxy)mServiceProxy).onLoadChildren(s, new MediaBrowserServiceCompatApi24.ResultWrapper(result), bundle);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field MediaBrowserServiceCompatApi21$ServiceCompatProxy mServiceProxy>
	//    2    4:checkcast       #21  <Class MediaBrowserServiceCompatApi24$ServiceCompatProxy>
	//    3    7:aload_1         
	//    4    8:new             #23  <Class MediaBrowserServiceCompatApi24$ResultWrapper>
	//    5   11:dup             
	//    6   12:aload_2         
	//    7   13:invokespecial   #26  <Method void MediaBrowserServiceCompatApi24$ResultWrapper(android.service.media.MediaBrowserService$Result)>
	//    8   16:aload_3         
	//    9   17:invokeinterface #29  <Method void MediaBrowserServiceCompatApi24$ServiceCompatProxy.onLoadChildren(String, MediaBrowserServiceCompatApi24$ResultWrapper, Bundle)>
	//   10   22:return          
	}

	MediaBrowserServiceCompatApi24$MediaBrowserServiceAdaptor(Context context, MediaBrowserServiceCompatApi24.ServiceCompatProxy servicecompatproxy)
	{
		super(context, ((MediaBrowserServiceCompatApi23.ServiceCompatProxy) (servicecompatproxy)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #12  <Method void MediaBrowserServiceCompatApi23$MediaBrowserServiceAdaptor(Context, MediaBrowserServiceCompatApi23$ServiceCompatProxy)>
	//    4    6:return          
	}
}
