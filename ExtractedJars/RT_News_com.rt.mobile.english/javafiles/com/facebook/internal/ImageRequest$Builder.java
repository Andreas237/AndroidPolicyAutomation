// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.internal;

import android.content.Context;
import android.net.Uri;

// Referenced classes of package com.facebook.internal:
//			ImageRequest, Validate

public static class ImageRequest$Builder
{

	public ImageRequest build()
	{
		return new ImageRequest(this, ((ImageRequest._cls1) (null)));
	//    0    0:new             #6   <Class ImageRequest>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #56  <Method void ImageRequest(ImageRequest$Builder, ImageRequest$1)>
	//    5    9:areturn         
	}

	public ImageRequest$Builder setAllowCachedRedirects(boolean flag)
	{
		allowCachedRedirects = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #47  <Field boolean allowCachedRedirects>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public ImageRequest$Builder setCallback( )
	{
		callback = ;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #43  <Field ImageRequest$Callback callback>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public ImageRequest$Builder setCallerTag(Object obj)
	{
		callerTag = obj;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #51  <Field Object callerTag>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	private boolean allowCachedRedirects;
	private  callback;
	private Object callerTag;
	private Context context;
	private Uri imageUrl;


/*
	static Context access$000(ImageRequest$Builder imagerequest$builder)
	{
		return imagerequest$builder.context;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field Context context>
	//    2    4:areturn         
	}

*/


/*
	static Uri access$100(ImageRequest$Builder imagerequest$builder)
	{
		return imagerequest$builder.imageUrl;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field Uri imageUrl>
	//    2    4:areturn         
	}

*/


/*
	static  access$200(ImageRequest$Builder imagerequest$builder)
	{
		return imagerequest$builder.callback;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field ImageRequest$Callback callback>
	//    2    4:areturn         
	}

*/


/*
	static boolean access$300(ImageRequest$Builder imagerequest$builder)
	{
		return imagerequest$builder.allowCachedRedirects;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field boolean allowCachedRedirects>
	//    2    4:ireturn         
	}

*/


/*
	static Object access$400(ImageRequest$Builder imagerequest$builder)
	{
		return imagerequest$builder.callerTag;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field Object callerTag>
	//    2    4:areturn         
	}

*/

	public ImageRequest$Builder(Context context1, Uri uri)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		Validate.notNull(((Object) (uri)), "imageUri");
	//    2    4:aload_2         
	//    3    5:ldc1            #24  <String "imageUri">
	//    4    7:invokestatic    #30  <Method void Validate.notNull(Object, String)>
		context = context1;
	//    5   10:aload_0         
	//    6   11:aload_1         
	//    7   12:putfield        #32  <Field Context context>
		imageUrl = uri;
	//    8   15:aload_0         
	//    9   16:aload_2         
	//   10   17:putfield        #34  <Field Uri imageUrl>
	//   11   20:return          
	}
}
