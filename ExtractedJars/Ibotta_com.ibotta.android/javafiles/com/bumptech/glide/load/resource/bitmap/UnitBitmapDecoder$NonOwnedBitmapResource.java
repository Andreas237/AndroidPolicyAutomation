// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.util.Util;

// Referenced classes of package com.bumptech.glide.load.resource.bitmap:
//			UnitBitmapDecoder

private static final class UnitBitmapDecoder$NonOwnedBitmapResource
	implements Resource
{

	public Bitmap get()
	{
		return bitmap;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field Bitmap bitmap>
	//    2    4:areturn         
	}

	public volatile Object get()
	{
		return ((Object) (get()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #28  <Method Bitmap get()>
	//    2    4:areturn         
	}

	public Class getResourceClass()
	{
		return android/graphics/Bitmap;
	//    0    0:ldc1            #32  <Class Bitmap>
	//    1    2:areturn         
	}

	public int getSize()
	{
		return Util.getBitmapByteSize(bitmap);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field Bitmap bitmap>
	//    2    4:invokestatic    #42  <Method int Util.getBitmapByteSize(Bitmap)>
	//    3    7:ireturn         
	}

	public void recycle()
	{
	//    0    0:return          
	}

	private final Bitmap bitmap;

	UnitBitmapDecoder$NonOwnedBitmapResource(Bitmap bitmap1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		bitmap = bitmap1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field Bitmap bitmap>
	//    5    9:return          
	}
}
