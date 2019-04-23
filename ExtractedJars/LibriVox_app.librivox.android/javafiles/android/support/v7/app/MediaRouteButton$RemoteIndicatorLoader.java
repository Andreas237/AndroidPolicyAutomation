// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.util.SparseArray;

// Referenced classes of package android.support.v7.app:
//			MediaRouteButton

final class MediaRouteButton$RemoteIndicatorLoader extends AsyncTask
{

	private void cacheAndReset(Drawable drawable)
	{
		if(drawable != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          18
			MediaRouteButton.sRemoteIndicatorCache.put(mResId, ((Object) (drawable.getConstantState())));
	//    2    4:getstatic       #26  <Field SparseArray MediaRouteButton.sRemoteIndicatorCache>
	//    3    7:aload_0         
	//    4    8:getfield        #17  <Field int mResId>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #32  <Method android.graphics.drawable.Drawable$ConstantState Drawable.getConstantState()>
	//    7   15:invokevirtual   #38  <Method void SparseArray.put(int, Object)>
		mRemoteIndicatorLoader = null;
	//    8   18:aload_0         
	//    9   19:getfield        #12  <Field MediaRouteButton this$0>
	//   10   22:aconst_null     
	//   11   23:putfield        #42  <Field MediaRouteButton$RemoteIndicatorLoader MediaRouteButton.mRemoteIndicatorLoader>
	//   12   26:return          
	}

	protected transient Drawable doInBackground(Void avoid[])
	{
		return getContext().getResources().getDrawable(mResId);
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field MediaRouteButton this$0>
	//    2    4:invokevirtual   #48  <Method Context MediaRouteButton.getContext()>
	//    3    7:invokevirtual   #54  <Method Resources Context.getResources()>
	//    4   10:aload_0         
	//    5   11:getfield        #17  <Field int mResId>
	//    6   14:invokevirtual   #60  <Method Drawable Resources.getDrawable(int)>
	//    7   17:areturn         
	}

	protected volatile Object doInBackground(Object aobj[])
	{
		return ((Object) (doInBackground((Void[])aobj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #63  <Class Void[]>
	//    3    5:invokevirtual   #65  <Method Drawable doInBackground(Void[])>
	//    4    8:areturn         
	}

	protected void onCancelled(Drawable drawable)
	{
		cacheAndReset(drawable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #68  <Method void cacheAndReset(Drawable)>
	//    3    5:return          
	}

	protected volatile void onCancelled(Object obj)
	{
		onCancelled((Drawable)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #28  <Class Drawable>
	//    3    5:invokevirtual   #71  <Method void onCancelled(Drawable)>
	//    4    8:return          
	}

	protected void onPostExecute(Drawable drawable)
	{
		cacheAndReset(drawable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #68  <Method void cacheAndReset(Drawable)>
		setRemoteIndicatorDrawable(drawable);
	//    3    5:aload_0         
	//    4    6:getfield        #12  <Field MediaRouteButton this$0>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #75  <Method void MediaRouteButton.setRemoteIndicatorDrawable(Drawable)>
	//    7   13:return          
	}

	protected volatile void onPostExecute(Object obj)
	{
		onPostExecute((Drawable)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #28  <Class Drawable>
	//    3    5:invokevirtual   #77  <Method void onPostExecute(Drawable)>
	//    4    8:return          
	}

	private final int mResId;
	final MediaRouteButton this$0;

	MediaRouteButton$RemoteIndicatorLoader(int i)
	{
		this$0 = MediaRouteButton.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field MediaRouteButton this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void AsyncTask()>
		mResId = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #17  <Field int mResId>
	//    8   14:return          
	}
}
