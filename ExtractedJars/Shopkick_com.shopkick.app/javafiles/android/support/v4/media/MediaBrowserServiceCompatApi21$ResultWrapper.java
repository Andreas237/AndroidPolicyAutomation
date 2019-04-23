// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.os.Parcel;
import java.util.*;

// Referenced classes of package android.support.v4.media:
//			MediaBrowserServiceCompatApi21

static class MediaBrowserServiceCompatApi21$ResultWrapper
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
		if(list == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		ArrayList arraylist = new ArrayList();
	//    4    6:new             #27  <Class ArrayList>
	//    5    9:dup             
	//    6   10:invokespecial   #28  <Method void ArrayList()>
	//    7   13:astore_2        
		Parcel parcel;
		for(list = ((List) (list.iterator())); ((Iterator) (list)).hasNext(); parcel.recycle())
	//*   8   14:aload_1         
	//*   9   15:invokeinterface #34  <Method Iterator List.iterator()>
	//*  10   20:astore_1        
	//*  11   21:aload_1         
	//*  12   22:invokeinterface #40  <Method boolean Iterator.hasNext()>
	//*  13   27:ifeq            68
		{
			parcel = (Parcel)((Iterator) (list)).next();
	//   14   30:aload_1         
	//   15   31:invokeinterface #44  <Method Object Iterator.next()>
	//   16   36:checkcast       #46  <Class Parcel>
	//   17   39:astore_3        
			parcel.setDataPosition(0);
	//   18   40:aload_3         
	//   19   41:iconst_0        
	//   20   42:invokevirtual   #50  <Method void Parcel.setDataPosition(int)>
			((List) (arraylist)).add(android.media.browse.MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
	//   21   45:aload_2         
	//   22   46:getstatic       #56  <Field android.os.Parcelable$Creator android.media.browse.MediaBrowser$MediaItem.CREATOR>
	//   23   49:aload_3         
	//   24   50:invokeinterface #62  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//   25   55:invokeinterface #66  <Method boolean List.add(Object)>
	//   26   60:pop             
		}

	//   27   61:aload_3         
	//   28   62:invokevirtual   #69  <Method void Parcel.recycle()>
	//*  29   65:goto            21
		return ((List) (arraylist));
	//   30   68:aload_2         
	//   31   69:areturn         
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

	MediaBrowserServiceCompatApi21$ResultWrapper(android.service.media.MediaBrowserService.Result result)
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
