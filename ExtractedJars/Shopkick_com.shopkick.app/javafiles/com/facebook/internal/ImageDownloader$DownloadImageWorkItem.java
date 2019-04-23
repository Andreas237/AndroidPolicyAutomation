// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.internal;

import android.content.Context;

// Referenced classes of package com.facebook.internal:
//			ImageDownloader

private static class ImageDownloader$DownloadImageWorkItem
	implements Runnable
{

	public void run()
	{
		ImageDownloader.access$200(key, context);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field ImageDownloader$RequestKey key>
	//    2    4:aload_0         
	//    3    5:getfield        #20  <Field Context context>
	//    4    8:invokestatic    #28  <Method void ImageDownloader.access$200(ImageDownloader$RequestKey, Context)>
	//    5   11:return          
	}

	private Context context;
	private ImageDownloader.RequestKey key;

	ImageDownloader$DownloadImageWorkItem(Context context1, ImageDownloader.RequestKey requestkey)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		context = context1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field Context context>
		key = requestkey;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #22  <Field ImageDownloader$RequestKey key>
	//    8   14:return          
	}
}
