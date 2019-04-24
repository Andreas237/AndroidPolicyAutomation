// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.service.media.MediaBrowserService;
import android.util.Log;
import java.lang.reflect.Field;
import java.util.*;

class MediaBrowserServiceCompatApi24
{
	static class MediaBrowserServiceAdaptor extends MediaBrowserServiceCompatApi23.MediaBrowserServiceAdaptor
	{

		public void onLoadChildren(String s, android.service.media.MediaBrowserService.Result result, Bundle bundle)
		{
			((ServiceCompatProxy)mServiceProxy).onLoadChildren(s, new ResultWrapper(result), bundle);
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

		MediaBrowserServiceAdaptor(Context context, ServiceCompatProxy servicecompatproxy)
		{
			super(context, ((MediaBrowserServiceCompatApi23.ServiceCompatProxy) (servicecompatproxy)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #12  <Method void MediaBrowserServiceCompatApi23$MediaBrowserServiceAdaptor(Context, MediaBrowserServiceCompatApi23$ServiceCompatProxy)>
		//    4    6:return          
		}
	}

	static class ResultWrapper
	{

		public void detach()
		{
			mResultObj.detach();
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field android.service.media.MediaBrowserService$Result mResultObj>
		//    2    4:invokevirtual   #22  <Method void android.service.media.MediaBrowserService$Result.detach()>
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
		//    6    8:new             #26  <Class ArrayList>
		//    7   11:dup             
		//    8   12:invokespecial   #27  <Method void ArrayList()>
		//    9   15:astore_2        
			Iterator iterator = list.iterator();
		//   10   16:aload_1         
		//   11   17:invokeinterface #33  <Method Iterator List.iterator()>
		//   12   22:astore_3        
			do
			{
				list = ((List) (arraylist));
		//   13   23:aload_2         
		//   14   24:astore_1        
				if(!iterator.hasNext())
					continue;
		//   15   25:aload_3         
		//   16   26:invokeinterface #39  <Method boolean Iterator.hasNext()>
		//   17   31:ifeq            6
				list = ((List) ((Parcel)iterator.next()));
		//   18   34:aload_3         
		//   19   35:invokeinterface #43  <Method Object Iterator.next()>
		//   20   40:checkcast       #45  <Class Parcel>
		//   21   43:astore_1        
				((Parcel) (list)).setDataPosition(0);
		//   22   44:aload_1         
		//   23   45:iconst_0        
		//   24   46:invokevirtual   #49  <Method void Parcel.setDataPosition(int)>
				((List) (arraylist)).add(android.media.browse.MediaBrowser.MediaItem.CREATOR.createFromParcel(((Parcel) (list))));
		//   25   49:aload_2         
		//   26   50:getstatic       #55  <Field android.os.Parcelable$Creator android.media.browse.MediaBrowser$MediaItem.CREATOR>
		//   27   53:aload_1         
		//   28   54:invokeinterface #61  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//   29   59:invokeinterface #65  <Method boolean List.add(Object)>
		//   30   64:pop             
				((Parcel) (list)).recycle();
		//   31   65:aload_1         
		//   32   66:invokevirtual   #68  <Method void Parcel.recycle()>
			} while(true);
		//   33   69:goto            23
			if(true) goto _L4; else goto _L3
_L3:
		}

		public void sendResult(List list, int i)
		{
			try
			{
				MediaBrowserServiceCompatApi24.sResultFlags.setInt(((Object) (mResultObj)), i);
		//    0    0:invokestatic    #78  <Method Field MediaBrowserServiceCompatApi24.access$000()>
		//    1    3:aload_0         
		//    2    4:getfield        #16  <Field android.service.media.MediaBrowserService$Result mResultObj>
		//    3    7:iload_2         
		//    4    8:invokevirtual   #84  <Method void Field.setInt(Object, int)>
			}
		//*   5   11:aload_0         
		//*   6   12:getfield        #16  <Field android.service.media.MediaBrowserService$Result mResultObj>
		//*   7   15:aload_0         
		//*   8   16:aload_1         
		//*   9   17:invokevirtual   #86  <Method List parcelListToItemList(List)>
		//*  10   20:invokevirtual   #89  <Method void android.service.media.MediaBrowserService$Result.sendResult(Object)>
		//*  11   23:return          
			catch(IllegalAccessException illegalaccessexception)
		//*  12   24:astore_3        
			{
				Log.w("MBSCompatApi24", ((Throwable) (illegalaccessexception)));
		//   13   25:ldc1            #91  <String "MBSCompatApi24">
		//   14   27:aload_3         
		//   15   28:invokestatic    #97  <Method int Log.w(String, Throwable)>
		//   16   31:pop             
			}
			mResultObj.sendResult(((Object) (parcelListToItemList(list))));
		//*  17   32:goto            11
		}

		android.service.media.MediaBrowserService.Result mResultObj;

		ResultWrapper(android.service.media.MediaBrowserService.Result result)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void Object()>
			mResultObj = result;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #16  <Field android.service.media.MediaBrowserService$Result mResultObj>
		//    5    9:return          
		}
	}

	public static interface ServiceCompatProxy
		extends MediaBrowserServiceCompatApi23.ServiceCompatProxy
	{

		public abstract void onLoadChildren(String s, ResultWrapper resultwrapper, Bundle bundle);
	}


	MediaBrowserServiceCompatApi24()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #54  <Method void Object()>
	//    2    4:return          
	}

	public static Object createService(Context context, ServiceCompatProxy servicecompatproxy)
	{
		return ((Object) (new MediaBrowserServiceAdaptor(context, servicecompatproxy)));
	//    0    0:new             #6   <Class MediaBrowserServiceCompatApi24$MediaBrowserServiceAdaptor>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #61  <Method void MediaBrowserServiceCompatApi24$MediaBrowserServiceAdaptor(Context, MediaBrowserServiceCompatApi24$ServiceCompatProxy)>
	//    5    9:areturn         
	}

	public static Bundle getBrowserRootHints(Object obj)
	{
		return ((MediaBrowserService)obj).getBrowserRootHints();
	//    0    0:aload_0         
	//    1    1:checkcast       #65  <Class MediaBrowserService>
	//    2    4:invokevirtual   #68  <Method Bundle MediaBrowserService.getBrowserRootHints()>
	//    3    7:areturn         
	}

	public static void notifyChildrenChanged(Object obj, String s, Bundle bundle)
	{
		((MediaBrowserService)obj).notifyChildrenChanged(s, bundle);
	//    0    0:aload_0         
	//    1    1:checkcast       #65  <Class MediaBrowserService>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #73  <Method void MediaBrowserService.notifyChildrenChanged(String, Bundle)>
	//    5    9:return          
	}

	private static final String TAG = "MBSCompatApi24";
	private static Field sResultFlags;

	static 
	{
		try
		{
			sResultFlags = ((Class) (android/service/media/MediaBrowserService$Result)).getDeclaredField("mFlags");
	//    0    0:ldc1            #28  <Class android.service.media.MediaBrowserService$Result>
	//    1    2:ldc1            #30  <String "mFlags">
	//    2    4:invokevirtual   #36  <Method Field Class.getDeclaredField(String)>
	//    3    7:putstatic       #38  <Field Field sResultFlags>
			sResultFlags.setAccessible(true);
	//    4   10:getstatic       #38  <Field Field sResultFlags>
	//    5   13:iconst_1        
	//    6   14:invokevirtual   #44  <Method void Field.setAccessible(boolean)>
	//    7   17:return          
		}
		catch(NoSuchFieldException nosuchfieldexception)
	//*   8   18:astore_0        
		{
			Log.w("MBSCompatApi24", ((Throwable) (nosuchfieldexception)));
	//    9   19:ldc1            #20  <String "MBSCompatApi24">
	//   10   21:aload_0         
	//   11   22:invokestatic    #50  <Method int Log.w(String, Throwable)>
	//   12   25:pop             
		}
	//*  13   26:return          
	}


/*
	static Field access$000()
	{
		return sResultFlags;
	//    0    0:getstatic       #38  <Field Field sResultFlags>
	//    1    3:areturn         
	}

*/
}
