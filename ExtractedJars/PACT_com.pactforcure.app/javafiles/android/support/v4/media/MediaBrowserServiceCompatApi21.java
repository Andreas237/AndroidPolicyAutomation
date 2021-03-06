// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.content.Context;
import android.content.Intent;
import android.os.*;
import android.service.media.MediaBrowserService;
import java.util.*;

class MediaBrowserServiceCompatApi21
{
	static class BrowserRoot
	{

		final Bundle mExtras;
		final String mRootId;

		BrowserRoot(String s, Bundle bundle)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
			mRootId = s;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #18  <Field String mRootId>
			mExtras = bundle;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #20  <Field Bundle mExtras>
		//    8   14:return          
		}
	}

	static class MediaBrowserServiceAdaptor extends MediaBrowserService
	{

		public android.service.media.MediaBrowserService.BrowserRoot onGetRoot(String s, int i, Bundle bundle)
		{
			ServiceCompatProxy servicecompatproxy = mServiceProxy;
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
				return new android.service.media.MediaBrowserService.BrowserRoot(((BrowserRoot) (s)).mRootId, ((BrowserRoot) (s)).mExtras);
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
			mServiceProxy.onLoadChildren(s, new ResultWrapper(result));
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

		final ServiceCompatProxy mServiceProxy;

		MediaBrowserServiceAdaptor(Context context, ServiceCompatProxy servicecompatproxy)
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

	static class ResultWrapper
	{

		public void detach()
		{
			mResultObj.detach();
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field android.service.media.MediaBrowserService$Result mResultObj>
		//    2    4:invokevirtual   #23  <Method void android.service.media.MediaBrowserService$Result.detach()>
		//    3    7:return          
		}

		List parcelListToItemList(List list)
		{
			if(list != null) goto _L2; else goto _L1
		//    0    0:aload_1         
		//    1    1:ifnonnull       8
_L1:
			list = null;
		//    2    4:aconst_null     
		//    3    5:astore_1        
_L4:
			return list;
		//    4    6:aload_1         
		//    5    7:areturn         
_L2:
			ArrayList arraylist = new ArrayList();
		//    6    8:new             #27  <Class ArrayList>
		//    7   11:dup             
		//    8   12:invokespecial   #28  <Method void ArrayList()>
		//    9   15:astore_2        
			Iterator iterator = list.iterator();
		//   10   16:aload_1         
		//   11   17:invokeinterface #34  <Method Iterator List.iterator()>
		//   12   22:astore_3        
			do
			{
				list = ((List) (arraylist));
		//   13   23:aload_2         
		//   14   24:astore_1        
				if(!iterator.hasNext())
					continue;
		//   15   25:aload_3         
		//   16   26:invokeinterface #40  <Method boolean Iterator.hasNext()>
		//   17   31:ifeq            6
				list = ((List) ((Parcel)iterator.next()));
		//   18   34:aload_3         
		//   19   35:invokeinterface #44  <Method Object Iterator.next()>
		//   20   40:checkcast       #46  <Class Parcel>
		//   21   43:astore_1        
				((Parcel) (list)).setDataPosition(0);
		//   22   44:aload_1         
		//   23   45:iconst_0        
		//   24   46:invokevirtual   #50  <Method void Parcel.setDataPosition(int)>
				((List) (arraylist)).add(android.media.browse.MediaBrowser.MediaItem.CREATOR.createFromParcel(((Parcel) (list))));
		//   25   49:aload_2         
		//   26   50:getstatic       #56  <Field android.os.Parcelable$Creator android.media.browse.MediaBrowser$MediaItem.CREATOR>
		//   27   53:aload_1         
		//   28   54:invokeinterface #62  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//   29   59:invokeinterface #66  <Method boolean List.add(Object)>
		//   30   64:pop             
				((Parcel) (list)).recycle();
		//   31   65:aload_1         
		//   32   66:invokevirtual   #69  <Method void Parcel.recycle()>
			} while(true);
		//   33   69:goto            23
			if(true) goto _L4; else goto _L3
_L3:
		}

		public void sendResult(Object obj)
		{
			if(obj instanceof List)
		//*   0    0:aload_1         
		//*   1    1:instanceof      #30  <Class List>
		//*   2    4:ifeq            23
			{
				mResultObj.sendResult(((Object) (parcelListToItemList((List)obj))));
		//    3    7:aload_0         
		//    4    8:getfield        #17  <Field android.service.media.MediaBrowserService$Result mResultObj>
		//    5   11:aload_0         
		//    6   12:aload_1         
		//    7   13:checkcast       #30  <Class List>
		//    8   16:invokevirtual   #75  <Method List parcelListToItemList(List)>
		//    9   19:invokevirtual   #77  <Method void android.service.media.MediaBrowserService$Result.sendResult(Object)>
				return;
		//   10   22:return          
			}
			if(obj instanceof Parcel)
		//*  11   23:aload_1         
		//*  12   24:instanceof      #46  <Class Parcel>
		//*  13   27:ifeq            61
			{
				obj = ((Object) ((Parcel)obj));
		//   14   30:aload_1         
		//   15   31:checkcast       #46  <Class Parcel>
		//   16   34:astore_1        
				((Parcel) (obj)).setDataPosition(0);
		//   17   35:aload_1         
		//   18   36:iconst_0        
		//   19   37:invokevirtual   #50  <Method void Parcel.setDataPosition(int)>
				mResultObj.sendResult(android.media.browse.MediaBrowser.MediaItem.CREATOR.createFromParcel(((Parcel) (obj))));
		//   20   40:aload_0         
		//   21   41:getfield        #17  <Field android.service.media.MediaBrowserService$Result mResultObj>
		//   22   44:getstatic       #56  <Field android.os.Parcelable$Creator android.media.browse.MediaBrowser$MediaItem.CREATOR>
		//   23   47:aload_1         
		//   24   48:invokeinterface #62  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//   25   53:invokevirtual   #77  <Method void android.service.media.MediaBrowserService$Result.sendResult(Object)>
				((Parcel) (obj)).recycle();
		//   26   56:aload_1         
		//   27   57:invokevirtual   #69  <Method void Parcel.recycle()>
				return;
		//   28   60:return          
			} else
			{
				mResultObj.sendResult(((Object) (null)));
		//   29   61:aload_0         
		//   30   62:getfield        #17  <Field android.service.media.MediaBrowserService$Result mResultObj>
		//   31   65:aconst_null     
		//   32   66:invokevirtual   #77  <Method void android.service.media.MediaBrowserService$Result.sendResult(Object)>
				return;
		//   33   69:return          
			}
		}

		android.service.media.MediaBrowserService.Result mResultObj;

		ResultWrapper(android.service.media.MediaBrowserService.Result result)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #15  <Method void Object()>
			mResultObj = result;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #17  <Field android.service.media.MediaBrowserService$Result mResultObj>
		//    5    9:return          
		}
	}

	public static interface ServiceCompatProxy
	{

		public abstract BrowserRoot onGetRoot(String s, int i, Bundle bundle);

		public abstract void onLoadChildren(String s, ResultWrapper resultwrapper);
	}


	MediaBrowserServiceCompatApi21()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
	//    2    4:return          
	}

	public static Object createService(Context context, ServiceCompatProxy servicecompatproxy)
	{
		return ((Object) (new MediaBrowserServiceAdaptor(context, servicecompatproxy)));
	//    0    0:new             #9   <Class MediaBrowserServiceCompatApi21$MediaBrowserServiceAdaptor>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #29  <Method void MediaBrowserServiceCompatApi21$MediaBrowserServiceAdaptor(Context, MediaBrowserServiceCompatApi21$ServiceCompatProxy)>
	//    5    9:areturn         
	}

	public static void notifyChildrenChanged(Object obj, String s)
	{
		((MediaBrowserService)obj).notifyChildrenChanged(s);
	//    0    0:aload_0         
	//    1    1:checkcast       #33  <Class MediaBrowserService>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #36  <Method void MediaBrowserService.notifyChildrenChanged(String)>
	//    4    8:return          
	}

	public static IBinder onBind(Object obj, Intent intent)
	{
		return ((MediaBrowserService)obj).onBind(intent);
	//    0    0:aload_0         
	//    1    1:checkcast       #33  <Class MediaBrowserService>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #41  <Method IBinder MediaBrowserService.onBind(Intent)>
	//    4    8:areturn         
	}

	public static void onCreate(Object obj)
	{
		((MediaBrowserService)obj).onCreate();
	//    0    0:aload_0         
	//    1    1:checkcast       #33  <Class MediaBrowserService>
	//    2    4:invokevirtual   #45  <Method void MediaBrowserService.onCreate()>
	//    3    7:return          
	}

	public static void setSessionToken(Object obj, Object obj1)
	{
		((MediaBrowserService)obj).setSessionToken((android.media.session.MediaSession.Token)obj1);
	//    0    0:aload_0         
	//    1    1:checkcast       #33  <Class MediaBrowserService>
	//    2    4:aload_1         
	//    3    5:checkcast       #49  <Class android.media.session.MediaSession$Token>
	//    4    8:invokevirtual   #52  <Method void MediaBrowserService.setSessionToken(android.media.session.MediaSession$Token)>
	//    5   11:return          
	}
}
