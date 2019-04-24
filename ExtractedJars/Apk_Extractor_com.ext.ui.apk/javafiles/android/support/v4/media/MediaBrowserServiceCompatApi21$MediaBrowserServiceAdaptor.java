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
	//*   4    7:ifnonnull       29
			bundle = null;
	//    5   10:aconst_null     
	//    6   11:astore_3        
		else
	//*   7   12:aload           4
	//*   8   14:aload_1         
	//*   9   15:iload_2         
	//*  10   16:aload_3         
	//*  11   17:invokeinterface #28  <Method MediaBrowserServiceCompatApi21$BrowserRoot MediaBrowserServiceCompatApi21$ServiceCompatProxy.onGetRoot(String, int, Bundle)>
	//*  12   22:astore_1        
	//*  13   23:aload_1         
	//*  14   24:ifnonnull       41
	//*  15   27:aconst_null     
	//*  16   28:areturn         
			bundle = new Bundle(bundle);
	//   17   29:new             #30  <Class Bundle>
	//   18   32:dup             
	//   19   33:aload_3         
	//   20   34:invokespecial   #33  <Method void Bundle(Bundle)>
	//   21   37:astore_3        
		s = ((String) (servicecompatproxy.onGetRoot(s, i, bundle)));
		if(s == null)
			return null;
		else
	//*  22   38:goto            12
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
