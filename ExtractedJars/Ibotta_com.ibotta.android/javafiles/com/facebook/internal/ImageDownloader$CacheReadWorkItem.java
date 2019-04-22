// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.internal;

import android.content.Context;

// Referenced classes of package com.facebook.internal:
//			ImageDownloader

private static class ImageDownloader$CacheReadWorkItem
	implements Runnable
{

	public void run()
	{
		ImageDownloader.access$100(key, context, allowCachedRedirects);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field ImageDownloader$RequestKey key>
	//    2    4:aload_0         
	//    3    5:getfield        #22  <Field Context context>
	//    4    8:aload_0         
	//    5    9:getfield        #26  <Field boolean allowCachedRedirects>
	//    6   12:invokestatic    #32  <Method void ImageDownloader.access$100(ImageDownloader$RequestKey, Context, boolean)>
	//    7   15:return          
	}

	private boolean allowCachedRedirects;
	private Context context;
	private ImageDownloader.RequestKey key;

	ImageDownloader$CacheReadWorkItem(Context context1, ImageDownloader.RequestKey requestkey, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		context = context1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #22  <Field Context context>
		key = requestkey;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #24  <Field ImageDownloader$RequestKey key>
		allowCachedRedirects = flag;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #26  <Field boolean allowCachedRedirects>
	//   11   19:return          
	}
}
