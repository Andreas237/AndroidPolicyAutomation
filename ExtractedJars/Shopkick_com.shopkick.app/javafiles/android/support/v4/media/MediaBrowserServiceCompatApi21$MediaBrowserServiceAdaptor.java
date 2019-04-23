// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.content.Context;
import android.os.Bundle;
import android.service.media.MediaBrowserService;
import android.support.v4.media.session.MediaSessionCompat;

// Referenced classes of package android.support.v4.media:
//			MediaBrowserServiceCompatApi21

static class MediaBrowserServiceCompatApi21$MediaBrowserServiceAdaptor extends MediaBrowserService
{

	public android.service.media.MediaBrowserService.BrowserRoot onGetRoot(String s, int i, Bundle bundle)
	{
		MediaSessionCompat.ensureClassLoader(bundle);
	//    0    0:aload_3         
	//    1    1:invokestatic    #29  <Method void MediaSessionCompat.ensureClassLoader(Bundle)>
		MediaBrowserServiceCompatApi21.ServiceCompatProxy servicecompatproxy = mServiceProxy;
	//    2    4:aload_0         
	//    3    5:getfield        #20  <Field MediaBrowserServiceCompatApi21$ServiceCompatProxy mServiceProxy>
	//    4    8:astore          4
		if(bundle == null)
	//*   5   10:aload_3         
	//*   6   11:ifnonnull       19
			bundle = null;
	//    7   14:aconst_null     
	//    8   15:astore_3        
		else
	//*   9   16:goto            28
			bundle = new Bundle(bundle);
	//   10   19:new             #31  <Class Bundle>
	//   11   22:dup             
	//   12   23:aload_3         
	//   13   24:invokespecial   #33  <Method void Bundle(Bundle)>
	//   14   27:astore_3        
		s = ((String) (servicecompatproxy.onGetRoot(s, i, bundle)));
	//   15   28:aload           4
	//   16   30:aload_1         
	//   17   31:iload_2         
	//   18   32:aload_3         
	//   19   33:invokeinterface #38  <Method MediaBrowserServiceCompatApi21$BrowserRoot MediaBrowserServiceCompatApi21$ServiceCompatProxy.onGetRoot(String, int, Bundle)>
	//   20   38:astore_1        
		if(s == null)
	//*  21   39:aload_1         
	//*  22   40:ifnonnull       45
			return null;
	//   23   43:aconst_null     
	//   24   44:areturn         
		else
			return new android.service.media.MediaBrowserService.BrowserRoot(((MediaBrowserServiceCompatApi21.BrowserRoot) (s)).mRootId, ((MediaBrowserServiceCompatApi21.BrowserRoot) (s)).mExtras);
	//   25   45:new             #40  <Class android.service.media.MediaBrowserService$BrowserRoot>
	//   26   48:dup             
	//   27   49:aload_1         
	//   28   50:getfield        #46  <Field String MediaBrowserServiceCompatApi21$BrowserRoot.mRootId>
	//   29   53:aload_1         
	//   30   54:getfield        #50  <Field Bundle MediaBrowserServiceCompatApi21$BrowserRoot.mExtras>
	//   31   57:invokespecial   #53  <Method void android.service.media.MediaBrowserService$BrowserRoot(String, Bundle)>
	//   32   60:areturn         
	}

	public void onLoadChildren(String s, android.service.media.MediaBrowserService.Result result)
	{
		mServiceProxy.onLoadChildren(s, new MediaBrowserServiceCompatApi21.ResultWrapper(result));
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field MediaBrowserServiceCompatApi21$ServiceCompatProxy mServiceProxy>
	//    2    4:aload_1         
	//    3    5:new             #57  <Class MediaBrowserServiceCompatApi21$ResultWrapper>
	//    4    8:dup             
	//    5    9:aload_2         
	//    6   10:invokespecial   #60  <Method void MediaBrowserServiceCompatApi21$ResultWrapper(android.service.media.MediaBrowserService$Result)>
	//    7   13:invokeinterface #63  <Method void MediaBrowserServiceCompatApi21$ServiceCompatProxy.onLoadChildren(String, MediaBrowserServiceCompatApi21$ResultWrapper)>
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
