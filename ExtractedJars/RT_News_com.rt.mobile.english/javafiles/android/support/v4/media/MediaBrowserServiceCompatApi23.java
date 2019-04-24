// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.content.Context;

class MediaBrowserServiceCompatApi23
{
	static class MediaBrowserServiceAdaptor extends MediaBrowserServiceCompatApi21.MediaBrowserServiceAdaptor
	{

		public void onLoadItem(String s, android.service.media.MediaBrowserService.Result result)
		{
			((ServiceCompatProxy)mServiceProxy).onLoadItem(s, new MediaBrowserServiceCompatApi21.ResultWrapper(result));
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

		MediaBrowserServiceAdaptor(Context context, ServiceCompatProxy servicecompatproxy)
		{
			super(context, ((MediaBrowserServiceCompatApi21.ServiceCompatProxy) (servicecompatproxy)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #12  <Method void MediaBrowserServiceCompatApi21$MediaBrowserServiceAdaptor(Context, MediaBrowserServiceCompatApi21$ServiceCompatProxy)>
		//    4    6:return          
		}
	}

	public static interface ServiceCompatProxy
		extends MediaBrowserServiceCompatApi21.ServiceCompatProxy
	{

		public abstract void onLoadItem(String s, MediaBrowserServiceCompatApi21.ResultWrapper resultwrapper);
	}


	MediaBrowserServiceCompatApi23()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
	//    2    4:return          
	}

	public static Object createService(Context context, ServiceCompatProxy servicecompatproxy)
	{
		return ((Object) (new MediaBrowserServiceAdaptor(context, servicecompatproxy)));
	//    0    0:new             #6   <Class MediaBrowserServiceCompatApi23$MediaBrowserServiceAdaptor>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #23  <Method void MediaBrowserServiceCompatApi23$MediaBrowserServiceAdaptor(Context, MediaBrowserServiceCompatApi23$ServiceCompatProxy)>
	//    5    9:areturn         
	}
}
