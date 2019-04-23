// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.util.Util;
import java.io.IOException;

public final class UnitBitmapDecoder
	implements ResourceDecoder
{
	private static final class NonOwnedBitmapResource
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

		NonOwnedBitmapResource(Bitmap bitmap1)
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


	public UnitBitmapDecoder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}

	public Resource decode(Bitmap bitmap, int i, int j, Options options)
	{
		return ((Resource) (new NonOwnedBitmapResource(bitmap)));
	//    0    0:new             #9   <Class UnitBitmapDecoder$NonOwnedBitmapResource>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #21  <Method void UnitBitmapDecoder$NonOwnedBitmapResource(Bitmap)>
	//    4    8:areturn         
	}

	public volatile Resource decode(Object obj, int i, int j, Options options)
		throws IOException
	{
		return decode((Bitmap)obj, i, j, options);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #29  <Class Bitmap>
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:aload           4
	//    6    9:invokevirtual   #31  <Method Resource decode(Bitmap, int, int, Options)>
	//    7   12:areturn         
	}

	public boolean handles(Bitmap bitmap, Options options)
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public volatile boolean handles(Object obj, Options options)
		throws IOException
	{
		return handles((Bitmap)obj, options);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #29  <Class Bitmap>
	//    3    5:aload_2         
	//    4    6:invokevirtual   #37  <Method boolean handles(Bitmap, Options)>
	//    5    9:ireturn         
	}
}
