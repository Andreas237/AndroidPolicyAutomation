// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.content.Context;

// Referenced classes of package android.support.v4.media:
//			MediaBrowserServiceCompatApi23

static class MediaBrowserServiceCompatApi23$MediaBrowserServiceAdaptor extends MediaBrowserServiceCompatApi21$MediaBrowserServiceAdaptor
{

	public void onLoadItem(String s, android.service.media.MediaBrowserService.Result result)
	{
		((MediaBrowserServiceCompatApi23.ServiceCompatProxy)mServiceProxy).onLoadItem(s, new MediaBrowserServiceCompatApi21.ResultWrapper(result));
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field MediaBrowserServiceCompatApi21$ServiceCompatProxy mServiceProxy>
	//    2    4:checkcast       #21  <Class MediaBrowserServiceCompatApi23$ServiceCompatProxy>
	//    3    7:aload_1         
	//    4    8:new             #23  <Class MediaBrowserServiceCompatApi21$ResultWrapper>
	//    5   11:dup             
	//    6   12:aload_2         
	//    7   13:invokespecial   #26  <Method void MediaBrowserServiceCompatApi21$ResultWrapper(android.service.media.MediaBrowserService$Result)>
	//    8   16:invokeinterface #29  <Method void MediaBrowserServiceCompatApi23$ServiceCompatProxy.onLoadItem(String, MediaBrowserServiceCompatApi21$ResultWrapper)>
	//    9   21:return          
	}

	MediaBrowserServiceCompatApi23$MediaBrowserServiceAdaptor(Context context, MediaBrowserServiceCompatApi23.ServiceCompatProxy servicecompatproxy)
	{
		super(context, ((MediaBrowserServiceCompatApi21.ServiceCompatProxy) (servicecompatproxy)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #12  <Method void MediaBrowserServiceCompatApi21$MediaBrowserServiceAdaptor(Context, MediaBrowserServiceCompatApi21$ServiceCompatProxy)>
	//    4    6:return          
	}
}
