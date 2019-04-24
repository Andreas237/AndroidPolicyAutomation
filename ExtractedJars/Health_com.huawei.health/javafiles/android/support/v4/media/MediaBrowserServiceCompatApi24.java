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
			if(list == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       6
				return null;
		//    2    4:aconst_null     
		//    3    5:areturn         
			ArrayList arraylist = new ArrayList();
		//    4    6:new             #26  <Class ArrayList>
		//    5    9:dup             
		//    6   10:invokespecial   #27  <Method void ArrayList()>
		//    7   13:astore_2        
			Parcel parcel;
			for(list = ((List) (list.iterator())); ((Iterator) (list)).hasNext(); parcel.recycle())
		//*   8   14:aload_1         
		//*   9   15:invokeinterface #33  <Method Iterator List.iterator()>
		//*  10   20:astore_1        
		//*  11   21:aload_1         
		//*  12   22:invokeinterface #39  <Method boolean Iterator.hasNext()>
		//*  13   27:ifeq            68
			{
				parcel = (Parcel)((Iterator) (list)).next();
		//   14   30:aload_1         
		//   15   31:invokeinterface #43  <Method Object Iterator.next()>
		//   16   36:checkcast       #45  <Class Parcel>
		//   17   39:astore_3        
				parcel.setDataPosition(0);
		//   18   40:aload_3         
		//   19   41:iconst_0        
		//   20   42:invokevirtual   #49  <Method void Parcel.setDataPosition(int)>
				((List) (arraylist)).add(android.media.browse.MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
		//   21   45:aload_2         
		//   22   46:getstatic       #55  <Field android.os.Parcelable$Creator android.media.browse.MediaBrowser$MediaItem.CREATOR>
		//   23   49:aload_3         
		//   24   50:invokeinterface #61  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//   25   55:invokeinterface #65  <Method boolean List.add(Object)>
		//   26   60:pop             
			}

		//   27   61:aload_3         
		//   28   62:invokevirtual   #68  <Method void Parcel.recycle()>
		//*  29   65:goto            21
			return ((List) (arraylist));
		//   30   68:aload_2         
		//   31   69:areturn         
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
		//*   5   11:goto            22
			catch(IllegalAccessException illegalaccessexception)
		//*   6   14:astore_3        
			{
				Log.w("MBSCompatApi24", ((Throwable) (illegalaccessexception)));
		//    7   15:ldc1            #86  <String "MBSCompatApi24">
		//    8   17:aload_3         
		//    9   18:invokestatic    #92  <Method int Log.w(String, Throwable)>
		//   10   21:pop             
			}
			mResultObj.sendResult(((Object) (parcelListToItemList(list))));
		//   11   22:aload_0         
		//   12   23:getfield        #16  <Field android.service.media.MediaBrowserService$Result mResultObj>
		//   13   26:aload_0         
		//   14   27:aload_1         
		//   15   28:invokevirtual   #94  <Method List parcelListToItemList(List)>
		//   16   31:invokevirtual   #97  <Method void android.service.media.MediaBrowserService$Result.sendResult(Object)>
		//   17   34:return          
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
