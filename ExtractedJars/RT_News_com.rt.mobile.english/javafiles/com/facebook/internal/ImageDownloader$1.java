// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.internal;

import android.graphics.Bitmap;

// Referenced classes of package com.facebook.internal:
//			ImageDownloader, ImageResponse, ImageRequest

static final class ImageDownloader$1
	implements Runnable
{

	public void run()
	{
		ImageResponse imageresponse = new ImageResponse(val$request, val$error, val$isCachedRedirect, val$bitmap);
	//    0    0:new             #40  <Class ImageResponse>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #25  <Field ImageRequest val$request>
	//    4    8:aload_0         
	//    5    9:getfield        #27  <Field Exception val$error>
	//    6   12:aload_0         
	//    7   13:getfield        #29  <Field boolean val$isCachedRedirect>
	//    8   16:aload_0         
	//    9   17:getfield        #31  <Field Bitmap val$bitmap>
	//   10   20:invokespecial   #43  <Method void ImageResponse(ImageRequest, Exception, boolean, Bitmap)>
	//   11   23:astore_1        
		val$callback.onCompleted(imageresponse);
	//   12   24:aload_0         
	//   13   25:getfield        #33  <Field ImageRequest$Callback val$callback>
	//   14   28:aload_1         
	//   15   29:invokeinterface #49  <Method void ImageRequest$Callback.onCompleted(ImageResponse)>
	//   16   34:return          
	}

	final Bitmap val$bitmap;
	final ack val$callback;
	final Exception val$error;
	final boolean val$isCachedRedirect;
	final ImageRequest val$request;

	ImageDownloader$1(ImageRequest imagerequest, Exception exception, boolean flag, Bitmap bitmap1, ack ack)
	{
		val$request = imagerequest;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #25  <Field ImageRequest val$request>
		val$error = exception;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #27  <Field Exception val$error>
		val$isCachedRedirect = flag;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #29  <Field boolean val$isCachedRedirect>
		val$bitmap = bitmap1;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #31  <Field Bitmap val$bitmap>
		val$callback = ack;
	//   12   21:aload_0         
	//   13   22:aload           5
	//   14   24:putfield        #33  <Field ImageRequest$Callback val$callback>
		super();
	//   15   27:aload_0         
	//   16   28:invokespecial   #36  <Method void Object()>
	//   17   31:return          
	}
}
