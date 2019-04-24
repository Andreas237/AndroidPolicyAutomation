// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.android.volley.toolbox;

import android.graphics.Bitmap;

// Referenced classes of package com.android.volley.toolbox:
//			ImageLoader

class ImageLoader$2
	implements com.android.volley.ner
{

	public void onResponse(Bitmap bitmap)
	{
		onGetImageSuccess(val$cacheKey, bitmap);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field ImageLoader this$0>
	//    2    4:aload_0         
	//    3    5:getfield        #22  <Field String val$cacheKey>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #32  <Method void ImageLoader.onGetImageSuccess(String, Bitmap)>
	//    6   12:return          
	}

	public volatile void onResponse(Object obj)
	{
		onResponse((Bitmap)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #35  <Class Bitmap>
	//    3    5:invokevirtual   #37  <Method void onResponse(Bitmap)>
	//    4    8:return          
	}

	final ImageLoader this$0;
	final String val$cacheKey;

	ImageLoader$2()
	{
		this$0 = final_imageloader;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field ImageLoader this$0>
		val$cacheKey = String.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #22  <Field String val$cacheKey>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #25  <Method void Object()>
	//    8   14:return          
	}
}
