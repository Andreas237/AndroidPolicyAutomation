// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.graphics.drawable;

import android.graphics.drawable.Drawable;

// Referenced classes of package android.support.v7.graphics.drawable:
//			DrawableContainer

static class DrawableContainer$BlockInvalidateCallback
	implements android.graphics.drawable.Drawable.Callback
{

	public void invalidateDrawable(Drawable drawable)
	{
	//    0    0:return          
	}

	public void scheduleDrawable(Drawable drawable, Runnable runnable, long l)
	{
		android.graphics.drawable.Drawable.Callback callback = mCallback;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field android.graphics.drawable.Drawable$Callback mCallback>
	//    2    4:astore          5
		if(callback != null)
	//*   3    6:aload           5
	//*   4    8:ifnull          21
			callback.scheduleDrawable(drawable, runnable, l);
	//    5   11:aload           5
	//    6   13:aload_1         
	//    7   14:aload_2         
	//    8   15:lload_3         
	//    9   16:invokeinterface #26  <Method void android.graphics.drawable.Drawable$Callback.scheduleDrawable(Drawable, Runnable, long)>
	//   10   21:return          
	}

	public void unscheduleDrawable(Drawable drawable, Runnable runnable)
	{
		android.graphics.drawable.Drawable.Callback callback = mCallback;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field android.graphics.drawable.Drawable$Callback mCallback>
	//    2    4:astore_3        
		if(callback != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          17
			callback.unscheduleDrawable(drawable, runnable);
	//    5    9:aload_3         
	//    6   10:aload_1         
	//    7   11:aload_2         
	//    8   12:invokeinterface #30  <Method void android.graphics.drawable.Drawable$Callback.unscheduleDrawable(Drawable, Runnable)>
	//    9   17:return          
	}

	public android.graphics.drawable.Drawable.Callback unwrap()
	{
		android.graphics.drawable.Drawable.Callback callback = mCallback;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field android.graphics.drawable.Drawable$Callback mCallback>
	//    2    4:astore_1        
		mCallback = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #24  <Field android.graphics.drawable.Drawable$Callback mCallback>
		return callback;
	//    6   10:aload_1         
	//    7   11:areturn         
	}

	public DrawableContainer$BlockInvalidateCallback wrap(android.graphics.drawable.Drawable.Callback callback)
	{
		mCallback = callback;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #24  <Field android.graphics.drawable.Drawable$Callback mCallback>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	private android.graphics.drawable.Drawable.Callback mCallback;

	DrawableContainer$BlockInvalidateCallback()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:return          
	}
}
