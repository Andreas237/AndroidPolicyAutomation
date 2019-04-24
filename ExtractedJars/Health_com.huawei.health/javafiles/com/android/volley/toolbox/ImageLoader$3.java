// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.android.volley.toolbox;

import com.android.volley.VolleyError;

// Referenced classes of package com.android.volley.toolbox:
//			ImageLoader

class ImageLoader$3
	implements com.android.volley.Listener
{

	public void onErrorResponse(VolleyError volleyerror)
	{
		onGetImageError(val$cacheKey, volleyerror);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field ImageLoader this$0>
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field String val$cacheKey>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #31  <Method void ImageLoader.onGetImageError(String, VolleyError)>
	//    6   12:return          
	}

	final ImageLoader this$0;
	final String val$cacheKey;

	ImageLoader$3()
	{
		this$0 = final_imageloader;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field ImageLoader this$0>
		val$cacheKey = String.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field String val$cacheKey>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
