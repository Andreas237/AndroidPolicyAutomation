// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.content.Context;
import android.os.Bundle;
import android.service.media.MediaBrowserService;

// Referenced classes of package android.support.v4.media:
//			MediaBrowserServiceCompatApi21

static class MediaBrowserServiceCompatApi21$MediaBrowserServiceAdaptor extends MediaBrowserService
{

	public android.service.media.MediaBrowserService.BrowserRoot onGetRoot(String s, int i, Bundle bundle)
	{
		s = ((String) (mServiceProxy.onGetRoot(s, i, bundle)));
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field MediaBrowserServiceCompatApi21$ServiceCompatProxy mServiceProxy>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:aload_3         
	//    5    7:invokeinterface #28  <Method MediaBrowserServiceCompatApi21$BrowserRoot MediaBrowserServiceCompatApi21$ServiceCompatProxy.onGetRoot(String, int, Bundle)>
	//    6   12:astore_1        
		if(s == null)
	//*   7   13:aload_1         
	//*   8   14:ifnonnull       19
			return null;
	//    9   17:aconst_null     
	//   10   18:areturn         
		else
			return new android.service.media.MediaBrowserService.BrowserRoot(((MediaBrowserServiceCompatApi21.BrowserRoot) (s)).mRootId, ((MediaBrowserServiceCompatApi21.BrowserRoot) (s)).mExtras);
	//   11   19:new             #30  <Class android.service.media.MediaBrowserService$BrowserRoot>
	//   12   22:dup             
	//   13   23:aload_1         
	//   14   24:getfield        #36  <Field String MediaBrowserServiceCompatApi21$BrowserRoot.mRootId>
	//   15   27:aload_1         
	//   16   28:getfield        #40  <Field Bundle MediaBrowserServiceCompatApi21$BrowserRoot.mExtras>
	//   17   31:invokespecial   #43  <Method void android.service.media.MediaBrowserService$BrowserRoot(String, Bundle)>
	//   18   34:areturn         
	}

	public void onLoadChildren(String s, android.service.media.MediaBrowserService.Result result)
	{
		mServiceProxy.onLoadChildren(s, new MediaBrowserServiceCompatApi21.ResultWrapper(result));
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field MediaBrowserServiceCompatApi21$ServiceCompatProxy mServiceProxy>
	//    2    4:aload_1         
	//    3    5:new             #47  <Class MediaBrowserServiceCompatApi21$ResultWrapper>
	//    4    8:dup             
	//    5    9:aload_2         
	//    6   10:invokespecial   #50  <Method void MediaBrowserServiceCompatApi21$ResultWrapper(android.service.media.MediaBrowserService$Result)>
	//    7   13:invokeinterface #53  <Method void MediaBrowserServiceCompatApi21$ServiceCompatProxy.onLoadChildren(String, MediaBrowserServiceCompatApi21$ResultWrapper)>
	//    8   18:return          
	}

	final MediaBrowserServiceCompatApi21.ServiceCompatProxy mServiceProxy;

	MediaBrowserServiceCompatApi21$MediaBrowserServiceAdaptor(Context context, MediaBrowserServiceCompatApi21.ServiceCompatProxy servicecompatproxy)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void MediaBrowserService()>
		attachBaseContext(context);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #18  <Method void attachBaseContext(Context)>
		mServiceProxy = servicecompatproxy;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #20  <Field MediaBrowserServiceCompatApi21$ServiceCompatProxy mServiceProxy>
	//    8   14:return          
	}
}
