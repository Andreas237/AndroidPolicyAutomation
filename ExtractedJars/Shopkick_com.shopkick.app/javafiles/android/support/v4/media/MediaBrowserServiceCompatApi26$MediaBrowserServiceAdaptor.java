// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.media.session.MediaSessionCompat;

// Referenced classes of package android.support.v4.media:
//			MediaBrowserServiceCompatApi26

static class MediaBrowserServiceCompatApi26$MediaBrowserServiceAdaptor extends MediaBrowserServiceCompatApi23$MediaBrowserServiceAdaptor
{

	public void onLoadChildren(String s, android.service.media.MediaBrowserService.Result result, Bundle bundle)
	{
		MediaSessionCompat.ensureClassLoader(bundle);
	//    0    0:aload_3         
	//    1    1:invokestatic    #21  <Method void MediaSessionCompat.ensureClassLoader(Bundle)>
		((MediaBrowserServiceCompatApi26.ServiceCompatProxy)mServiceProxy).onLoadChildren(s, new MediaBrowserServiceCompatApi26.ResultWrapper(result), bundle);
	//    2    4:aload_0         
	//    3    5:getfield        #25  <Field MediaBrowserServiceCompatApi21$ServiceCompatProxy mServiceProxy>
	//    4    8:checkcast       #27  <Class MediaBrowserServiceCompatApi26$ServiceCompatProxy>
	//    5   11:aload_1         
	//    6   12:new             #29  <Class MediaBrowserServiceCompatApi26$ResultWrapper>
	//    7   15:dup             
	//    8   16:aload_2         
	//    9   17:invokespecial   #32  <Method void MediaBrowserServiceCompatApi26$ResultWrapper(android.service.media.MediaBrowserService$Result)>
	//   10   20:aload_3         
	//   11   21:invokeinterface #35  <Method void MediaBrowserServiceCompatApi26$ServiceCompatProxy.onLoadChildren(String, MediaBrowserServiceCompatApi26$ResultWrapper, Bundle)>
	//   12   26:return          
	}

	MediaBrowserServiceCompatApi26$MediaBrowserServiceAdaptor(Context context, MediaBrowserServiceCompatApi26.ServiceCompatProxy servicecompatproxy)
	{
		super(context, ((MediaBrowserServiceCompatApi23.ServiceCompatProxy) (servicecompatproxy)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #12  <Method void MediaBrowserServiceCompatApi23$MediaBrowserServiceAdaptor(Context, MediaBrowserServiceCompatApi23$ServiceCompatProxy)>
	//    4    6:return          
	}
}
