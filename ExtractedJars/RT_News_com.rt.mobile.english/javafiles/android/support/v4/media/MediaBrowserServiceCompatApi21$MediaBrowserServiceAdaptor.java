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
		MediaBrowserServiceCompatApi21.ServiceCompatProxy servicecompatproxy = mServiceProxy;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field MediaBrowserServiceCompatApi21$ServiceCompatProxy mServiceProxy>
	//    2    4:astore          4
		if(bundle == null)
	//*   3    6:aload_3         
	//*   4    7:ifnonnull       15
			bundle = null;
	//    5   10:aconst_null     
	//    6   11:astore_3        
		else
	//*   7   12:goto            24
			bundle = new Bundle(bundle);
	//    8   15:new             #25  <Class Bundle>
	//    9   18:dup             
	//   10   19:aload_3         
	//   11   20:invokespecial   #28  <Method void Bundle(Bundle)>
	//   12   23:astore_3        
		s = ((String) (servicecompatproxy.onGetRoot(s, i, bundle)));
	//   13   24:aload           4
	//   14   26:aload_1         
	//   15   27:iload_2         
	//   16   28:aload_3         
	//   17   29:invokeinterface #33  <Method MediaBrowserServiceCompatApi21$BrowserRoot MediaBrowserServiceCompatApi21$ServiceCompatProxy.onGetRoot(String, int, Bundle)>
	//   18   34:astore_1        
		if(s == null)
	//*  19   35:aload_1         
	//*  20   36:ifnonnull       41
			return null;
	//   21   39:aconst_null     
	//   22   40:areturn         
		else
			return new android.service.media.MediaBrowserService.BrowserRoot(((MediaBrowserServiceCompatApi21.BrowserRoot) (s)).mRootId, ((MediaBrowserServiceCompatApi21.BrowserRoot) (s)).mExtras);
	//   23   41:new             #35  <Class android.service.media.MediaBrowserService$BrowserRoot>
	//   24   44:dup             
	//   25   45:aload_1         
	//   26   46:getfield        #41  <Field String MediaBrowserServiceCompatApi21$BrowserRoot.mRootId>
	//   27   49:aload_1         
	//   28   50:getfield        #45  <Field Bundle MediaBrowserServiceCompatApi21$BrowserRoot.mExtras>
	//   29   53:invokespecial   #48  <Method void android.service.media.MediaBrowserService$BrowserRoot(String, Bundle)>
	//   30   56:areturn         
	}

	public void onLoadChildren(String s, android.service.media.MediaBrowserService.Result result)
	{
		mServiceProxy.onLoadChildren(s, new MediaBrowserServiceCompatApi21.ResultWrapper(result));
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field MediaBrowserServiceCompatApi21$ServiceCompatProxy mServiceProxy>
	//    2    4:aload_1         
	//    3    5:new             #52  <Class MediaBrowserServiceCompatApi21$ResultWrapper>
	//    4    8:dup             
	//    5    9:aload_2         
	//    6   10:invokespecial   #55  <Method void MediaBrowserServiceCompatApi21$ResultWrapper(android.service.media.MediaBrowserService$Result)>
	//    7   13:invokeinterface #58  <Method void MediaBrowserServiceCompatApi21$ServiceCompatProxy.onLoadChildren(String, MediaBrowserServiceCompatApi21$ResultWrapper)>
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
