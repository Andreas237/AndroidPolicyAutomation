// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.util.Log;

class MediaRouteDevicePickerDialog$RecyclerAdapter$Item
{

	public Object getData()
	{
		return mData;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Object mData>
	//    2    4:areturn         
	}

	public int getType()
	{
		return mType;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field int mType>
	//    2    4:ireturn         
	}

	private final Object mData;
	private final int mType;
	final MediaRouteDevicePickerDialog.RecyclerAdapter this$1;

	MediaRouteDevicePickerDialog$RecyclerAdapter$Item(Object obj)
	{
		this$1 = MediaRouteDevicePickerDialog.RecyclerAdapter.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field MediaRouteDevicePickerDialog$RecyclerAdapter this$1>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
		mData = obj;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #19  <Field Object mData>
		if(obj instanceof String)
	//*   8   14:aload_2         
	//*   9   15:instanceof      #21  <Class String>
	//*  10   18:ifeq            27
		{
			mType = 1;
	//   11   21:aload_0         
	//   12   22:iconst_1        
	//   13   23:putfield        #23  <Field int mType>
			return;
	//   14   26:return          
		}
		if(obj instanceof android.support.v7.media.MediaRouter.RouteInfo)
	//*  15   27:aload_2         
	//*  16   28:instanceof      #25  <Class android.support.v7.media.MediaRouter$RouteInfo>
	//*  17   31:ifeq            40
		{
			mType = 2;
	//   18   34:aload_0         
	//   19   35:iconst_2        
	//   20   36:putfield        #23  <Field int mType>
			return;
	//   21   39:return          
		} else
		{
			mType = 0;
	//   22   40:aload_0         
	//   23   41:iconst_0        
	//   24   42:putfield        #23  <Field int mType>
			Log.w("RecyclerAdapter", "Wrong type of data passed to Item constructor");
	//   25   45:ldc1            #27  <String "RecyclerAdapter">
	//   26   47:ldc1            #29  <String "Wrong type of data passed to Item constructor">
	//   27   49:invokestatic    #35  <Method int Log.w(String, String)>
	//   28   52:pop             
			return;
	//   29   53:return          
		}
	}
}
