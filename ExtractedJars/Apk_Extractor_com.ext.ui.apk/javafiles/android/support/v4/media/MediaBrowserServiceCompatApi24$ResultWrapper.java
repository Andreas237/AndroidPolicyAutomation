// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.os.Parcel;
import android.util.Log;
import java.lang.reflect.Field;
import java.util.*;

// Referenced classes of package android.support.v4.media:
//			MediaBrowserServiceCompatApi24

static class MediaBrowserServiceCompatApi24$ResultWrapper
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
			MediaBrowserServiceCompatApi24.access$000().setInt(((Object) (mResultObj)), i);
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

	MediaBrowserServiceCompatApi24$ResultWrapper(android.service.media.MediaBrowserService.Result result)
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
