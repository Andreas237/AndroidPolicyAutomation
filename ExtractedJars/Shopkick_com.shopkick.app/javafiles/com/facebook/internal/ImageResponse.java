// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.internal;

import android.graphics.Bitmap;

// Referenced classes of package com.facebook.internal:
//			ImageRequest

public class ImageResponse
{

	ImageResponse(ImageRequest imagerequest, Exception exception, boolean flag, Bitmap bitmap1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		request = imagerequest;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field ImageRequest request>
		error = exception;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #21  <Field Exception error>
		bitmap = bitmap1;
	//    8   14:aload_0         
	//    9   15:aload           4
	//   10   17:putfield        #23  <Field Bitmap bitmap>
		isCachedRedirect = flag;
	//   11   20:aload_0         
	//   12   21:iload_3         
	//   13   22:putfield        #25  <Field boolean isCachedRedirect>
	//   14   25:return          
	}

	public Bitmap getBitmap()
	{
		return bitmap;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field Bitmap bitmap>
	//    2    4:areturn         
	}

	public Exception getError()
	{
		return error;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Exception error>
	//    2    4:areturn         
	}

	public ImageRequest getRequest()
	{
		return request;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field ImageRequest request>
	//    2    4:areturn         
	}

	public boolean isCachedRedirect()
	{
		return isCachedRedirect;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field boolean isCachedRedirect>
	//    2    4:ireturn         
	}

	private Bitmap bitmap;
	private Exception error;
	private boolean isCachedRedirect;
	private ImageRequest request;
}
